package org.apache.tika.config;

import B1.e;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.utils.StringUtils;
import org.apache.tika.utils.XMLReaderUtils;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import p055t.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class ConfigBase {
    private static Class[] SUPPORTED_PRIMITIVES = {String.class, Boolean.TYPE, Long.TYPE, Integer.TYPE, Double.TYPE, Float.TYPE};

    public static class SetterClassPair {
        private final Class itemClass;
        private final Method setterMethod;

        public SetterClassPair(Method method, Class cls) {
            this.setterMethod = method;
            this.itemClass = cls;
        }

        public String toString() {
            return "SetterClassPair{setterMethod=" + String.valueOf(this.setterMethod) + ", itemClass=" + String.valueOf(this.itemClass) + "}";
        }
    }

    private static <T> T buildClass(Node node, String str, Class cls) throws TikaConfigException {
        String name = cls.getName();
        Node namedItem = node.getAttributes().getNamedItem("class");
        if (namedItem != null) {
            name = namedItem.getTextContent();
        }
        try {
            Class<?> cls2 = Class.forName(name);
            if (cls.isAssignableFrom(cls2)) {
                return (T) cls2.getDeclaredConstructor(null).newInstance(null);
            }
            throw new TikaConfigException(str + " with class name " + name + " must be of type '" + cls.getName() + "'");
        } catch (ClassNotFoundException e3) {
            e = e3;
            throw new TikaConfigException(e.k("problem loading ", str, " with class ", cls.getName()), e);
        } catch (IllegalAccessException e4) {
            e = e4;
            throw new TikaConfigException(e.k("problem loading ", str, " with class ", cls.getName()), e);
        } catch (InstantiationException e5) {
            e = e5;
            throw new TikaConfigException(e.k("problem loading ", str, " with class ", cls.getName()), e);
        } catch (NoSuchMethodException e6) {
            e = e6;
            throw new TikaConfigException(e.k("problem loading ", str, " with class ", cls.getName()), e);
        } catch (InvocationTargetException e7) {
            e = e7;
            throw new TikaConfigException(e.k("problem loading ", str, " with class ", cls.getName()), e);
        }
    }

    public static <P, T> P buildComposite(String str, Class<P> cls, String str2, Class<T> cls2, InputStream inputStream) throws IOException, TikaConfigException {
        try {
            return (P) buildComposite(str, cls, str2, cls2, XMLReaderUtils.buildDOM(inputStream).getDocumentElement());
        } catch (TikaException e3) {
            throw new TikaConfigException("problem loading xml to dom", e3);
        } catch (SAXException e4) {
            throw new IOException(e4);
        }
    }

    public static <T> T buildSingle(String str, Class<T> cls, InputStream inputStream) throws IOException, TikaConfigException {
        try {
            Element documentElement = XMLReaderUtils.buildDOM(inputStream).getDocumentElement();
            if (documentElement.getLocalName().equals("properties")) {
                return (T) buildSingle(str, cls, documentElement, null);
            }
            throw new TikaConfigException("expect properties as root node");
        } catch (TikaException e3) {
            throw new TikaConfigException("problem loading xml to dom", e3);
        } catch (SAXException e4) {
            throw new IOException(e4);
        }
    }

    private static SetterClassPair findSetterClassPair(Object obj, String str) throws TikaConfigException {
        String strB = a.b("set", str.substring(0, 1).toUpperCase(Locale.US), str.substring(1));
        Method method = null;
        Class<?> cls = null;
        for (Method method2 : obj.getClass().getMethods()) {
            if (strB.equals(method2.getName())) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                if (parameterTypes.length == 1 && (cls == null || parameterTypes[0].equals(String.class))) {
                    cls = parameterTypes[0];
                    method = method2;
                }
            }
        }
        if (method != null && cls != null) {
            return new SetterClassPair(method, cls);
        }
        String strB2 = a.b("add", str.substring(0, 1).toUpperCase(Locale.US), str.substring(1));
        for (Method method3 : obj.getClass().getMethods()) {
            if (strB2.equals(method3.getName())) {
                Class<?>[] parameterTypes2 = method3.getParameterTypes();
                if (parameterTypes2.length == 1 && (cls == null || parameterTypes2[0].equals(String.class))) {
                    cls = parameterTypes2[0];
                    method = method3;
                }
            }
        }
        if (method != null || cls != null) {
            return new SetterClassPair(method, cls);
        }
        throw new TikaConfigException("Couldn't find setter '" + strB + "' or adder '" + strB2 + "' for " + str + " of class: " + String.valueOf(obj.getClass()));
    }

    private static boolean hasChildNodes(Node node) {
        if (!node.hasChildNodes()) {
            return false;
        }
        NodeList childNodes = node.getChildNodes();
        for (int i3 = 0; i3 < childNodes.getLength(); i3++) {
            if (childNodes.item(i3).getNodeType() == 1) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasClass(Node node) {
        return node.hasAttributes() && node.getAttributes().getNamedItem("class") != null;
    }

    private static boolean isMap(Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int i3 = 0; i3 < childNodes.getLength(); i3++) {
            Node nodeItem = childNodes.item(i3);
            if (nodeItem.getNodeType() == 1 && nodeItem.hasAttributes()) {
                if (nodeItem.getAttributes().getNamedItem("from") != null && nodeItem.getAttributes().getNamedItem("to") != null) {
                    return true;
                }
                if (nodeItem.getAttributes().getNamedItem("k") != null && nodeItem.getAttributes().getNamedItem("v") != null) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isPrimitive(Class cls) {
        int i3 = 0;
        while (true) {
            Class[] clsArr = SUPPORTED_PRIMITIVES;
            if (i3 >= clsArr.length) {
                return false;
            }
            if (clsArr[i3].equals(cls)) {
                return true;
            }
            i3++;
        }
    }

    private static <T> List<T> loadComposite(Node node, String str, Class<? extends T> cls) throws TikaConfigException {
        NodeList childNodes = node.getChildNodes();
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < childNodes.getLength(); i3++) {
            Node nodeItem = childNodes.item(i3);
            if (nodeItem.getNodeType() == 1 && str.equals(nodeItem.getLocalName())) {
                Object objBuildClass = buildClass(nodeItem, str, cls);
                setParams(objBuildClass, nodeItem, new HashSet());
                arrayList.add(objBuildClass);
            }
        }
        return arrayList;
    }

    private static void setParams(Object obj, Node node, Set<String> set) throws TikaConfigException {
        setParams(obj, node, set, null);
    }

    private static void tryToSetClassList(Object obj, Node node) throws TikaConfigException {
        String localName = node.getLocalName();
        try {
            Class<?> cls = Class.forName(node.getAttributes().getNamedItem("class").getTextContent());
            ArrayList arrayList = new ArrayList();
            NodeList childNodes = node.getChildNodes();
            for (int i3 = 0; i3 < childNodes.getLength(); i3++) {
                Node nodeItem = childNodes.item(i3);
                if (nodeItem.getNodeType() == 1) {
                    Object objBuildClass = buildClass(nodeItem, nodeItem.getLocalName(), cls);
                    setParams(objBuildClass, nodeItem, new HashSet());
                    arrayList.add(objBuildClass);
                }
            }
            obj.getClass().getMethod("set" + localName.substring(0, 1).toUpperCase(Locale.US) + localName.substring(1), List.class).invoke(obj, arrayList);
        } catch (ClassNotFoundException e3) {
            e = e3;
            throw new TikaConfigException(a.a("couldn't build class for ", localName), e);
        } catch (IllegalAccessException e4) {
            e = e4;
            throw new TikaConfigException(a.a("couldn't build class for ", localName), e);
        } catch (NoSuchMethodException e5) {
            e = e5;
            throw new TikaConfigException(a.a("couldn't build class for ", localName), e);
        } catch (InvocationTargetException e6) {
            e = e6;
            throw new TikaConfigException(a.a("couldn't build class for ", localName), e);
        }
    }

    private static void tryToSetList(Object obj, Node node) throws TikaConfigException {
        if (hasClass(node)) {
            tryToSetClassList(obj, node);
        } else {
            tryToSetStringList(obj, node);
        }
    }

    private static void tryToSetMap(Object obj, Node node) throws TikaConfigException {
        String textContent;
        String localName = node.getLocalName();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        NodeList childNodes = node.getChildNodes();
        for (int i3 = 0; i3 < childNodes.getLength(); i3++) {
            Node nodeItem = childNodes.item(i3);
            if (nodeItem.getNodeType() == 1) {
                NamedNodeMap attributes = nodeItem.getAttributes();
                String textContent2 = null;
                if (attributes.getNamedItem("from") != null) {
                    textContent = attributes.getNamedItem("from").getTextContent();
                } else if (attributes.getNamedItem(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR) != null) {
                    textContent = attributes.getNamedItem(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR).getTextContent();
                } else {
                    textContent = attributes.getNamedItem("k") != null ? attributes.getNamedItem("k").getTextContent() : null;
                }
                if (attributes.getNamedItem("to") != null) {
                    textContent2 = attributes.getNamedItem("to").getTextContent();
                } else if (attributes.getNamedItem(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR) != null) {
                    textContent2 = attributes.getNamedItem(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR).getTextContent();
                } else if (attributes.getNamedItem("v") != null) {
                    textContent2 = attributes.getNamedItem("v").getTextContent();
                }
                if (textContent == null) {
                    throw new TikaConfigException("must specify a 'key' or 'from' value in a map object : ".concat(String.valueOf(node)));
                }
                if (textContent2 == null) {
                    throw new TikaConfigException("must specify a 'value' or 'to' value in a map object : ".concat(String.valueOf(node)));
                }
                linkedHashMap.put(textContent, textContent2);
            }
        }
        try {
            obj.getClass().getMethod(a.b("set", localName.substring(0, 1).toUpperCase(Locale.US), localName.substring(1)), Map.class).invoke(obj, linkedHashMap);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
            throw new TikaConfigException("can't set ".concat(localName), e3);
        }
    }

    private static void tryToSetPrimitive(Object obj, SetterClassPair setterClassPair, String str) throws TikaConfigException {
        try {
            if (setterClassPair.itemClass == Integer.TYPE) {
                setterClassPair.setterMethod.invoke(obj, Integer.valueOf(Integer.parseInt(str)));
                return;
            }
            if (setterClassPair.itemClass == Long.TYPE) {
                setterClassPair.setterMethod.invoke(obj, Long.valueOf(Long.parseLong(str)));
                return;
            }
            if (setterClassPair.itemClass == Float.TYPE) {
                setterClassPair.setterMethod.invoke(obj, Float.valueOf(Float.parseFloat(str)));
                return;
            }
            if (setterClassPair.itemClass == Double.TYPE) {
                setterClassPair.setterMethod.invoke(obj, Double.valueOf(Double.parseDouble(str)));
            } else if (setterClassPair.itemClass == Boolean.TYPE) {
                setterClassPair.setterMethod.invoke(obj, Boolean.valueOf(Boolean.parseBoolean(str)));
            } else {
                setterClassPair.setterMethod.invoke(obj, str);
            }
        } catch (IllegalAccessException e3) {
            e = e3;
            throw new TikaConfigException(e.k("bad parameter ", String.valueOf(setterClassPair), StringUtils.SPACE, str), e);
        } catch (InvocationTargetException e4) {
            e = e4;
            throw new TikaConfigException(e.k("bad parameter ", String.valueOf(setterClassPair), StringUtils.SPACE, str), e);
        }
    }

    private static void tryToSetStringList(Object obj, Node node) throws TikaConfigException {
        String textContent;
        String localName = node.getLocalName();
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = node.getChildNodes();
        for (int i3 = 0; i3 < childNodes.getLength(); i3++) {
            Node nodeItem = childNodes.item(i3);
            if (nodeItem.getNodeType() == 1 && (textContent = nodeItem.getTextContent()) != null) {
                arrayList.add(textContent);
            }
        }
        try {
            obj.getClass().getMethod(a.b("set", localName.substring(0, 1).toUpperCase(Locale.US), localName.substring(1)), List.class).invoke(obj, arrayList);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
            throw new TikaConfigException("can't set ".concat(localName), e3);
        }
    }

    public Set<String> configure(String str, InputStream inputStream) throws IOException, TikaConfigException {
        HashSet hashSet = new HashSet();
        try {
            Element documentElement = XMLReaderUtils.buildDOM(inputStream).getDocumentElement();
            if (!documentElement.getLocalName().equals("properties")) {
                throw new TikaConfigException("expect properties as root node");
            }
            NodeList childNodes = documentElement.getChildNodes();
            for (int i3 = 0; i3 < childNodes.getLength(); i3++) {
                Node nodeItem = childNodes.item(i3);
                if (str.equals(nodeItem.getLocalName())) {
                    setParams(this, nodeItem, hashSet);
                }
            }
            return hashSet;
        } catch (TikaException e3) {
            throw new TikaConfigException("problem loading xml to dom", e3);
        } catch (SAXException e4) {
            throw new IOException(e4);
        }
    }

    public void handleSettings(Set<String> set) {
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0097  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    private static void setParams(Object obj, Node node, Set<String> set, String str) throws TikaConfigException {
        String localName;
        NodeList childNodes = node.getChildNodes();
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < childNodes.getLength(); i3++) {
            Node nodeItem = childNodes.item(i3);
            if ("params".equals(nodeItem.getLocalName())) {
                NodeList childNodes2 = nodeItem.getChildNodes();
                for (int i4 = 0; i4 < childNodes2.getLength(); i4++) {
                    arrayList.add(childNodes2.item(i4));
                }
            } else {
                arrayList.add(nodeItem);
            }
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            Node node2 = (Node) arrayList.get(i5);
            if (node2.getNodeType() == 1 && (localName = node2.getLocalName()) != null && !localName.equals(str)) {
                String textContent = node2.getTextContent();
                String localName2 = node2.getLocalName();
                SetterClassPair setterClassPairFindSetterClassPair = findSetterClassPair(obj, localName2);
                if (hasClass(node2)) {
                    if (isPrimitive(setterClassPairFindSetterClassPair.itemClass)) {
                        tryToSetPrimitive(obj, setterClassPairFindSetterClassPair, node2.getTextContent());
                    } else {
                        Object objBuildClass = buildClass(node2, localName2, setterClassPairFindSetterClassPair.itemClass);
                        setParams(setterClassPairFindSetterClassPair.itemClass.cast(objBuildClass), node2, new HashSet());
                        try {
                            setterClassPairFindSetterClassPair.setterMethod.invoke(obj, objBuildClass);
                        } catch (IllegalAccessException | InvocationTargetException e3) {
                            throw new TikaConfigException(a.a("problem creating ", localName2), e3);
                        }
                    }
                } else if (setterClassPairFindSetterClassPair.itemClass.isAssignableFrom(Map.class) && isMap(node2)) {
                    tryToSetMap(obj, node2);
                } else if (setterClassPairFindSetterClassPair.itemClass.isAssignableFrom(List.class)) {
                    tryToSetList(obj, node2);
                } else if (isPrimitive(setterClassPairFindSetterClassPair.itemClass)) {
                    tryToSetPrimitive(obj, setterClassPairFindSetterClassPair, node2.getTextContent());
                } else {
                    Object objBuildClass2 = buildClass(node2, localName2, setterClassPairFindSetterClassPair.itemClass);
                    setParams(setterClassPairFindSetterClassPair.itemClass.cast(objBuildClass2), node2, new HashSet());
                    setterClassPairFindSetterClassPair.setterMethod.invoke(obj, objBuildClass2);
                }
                if (textContent != null) {
                    set.add(localName);
                }
            }
        }
        if (obj instanceof Initializable) {
            Initializable initializable = (Initializable) obj;
            initializable.initialize(Collections.EMPTY_MAP);
            initializable.checkInitialization(InitializableProblemHandler.THROW);
        }
    }

    public static <P, T> P buildComposite(String str, Class<P> cls, String str2, Class<T> cls2, Element element) throws TikaConfigException {
        if (element.getLocalName().equals("properties")) {
            NodeList childNodes = element.getChildNodes();
            for (int i3 = 0; i3 < childNodes.getLength(); i3++) {
                Node nodeItem = childNodes.item(i3);
                if (nodeItem.getNodeType() == 1 && str.equals(nodeItem.getLocalName())) {
                    try {
                        P pNewInstance = cls.getConstructor(List.class).newInstance(loadComposite(nodeItem, str2, cls2));
                        setParams(pNewInstance, nodeItem, new HashSet(), str2);
                        return pNewInstance;
                    } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e3) {
                        throw new TikaConfigException("can't build composite class", e3);
                    }
                }
            }
            throw new TikaConfigException(a.a("could not find ", str));
        }
        throw new TikaConfigException("expect properties as root node");
    }

    public static <T> T buildSingle(String str, Class<T> cls, Element element, T t3) throws TikaConfigException {
        NodeList childNodes = element.getChildNodes();
        T t4 = null;
        for (int i3 = 0; i3 < childNodes.getLength(); i3++) {
            Node nodeItem = childNodes.item(i3);
            if (nodeItem.getNodeType() == 1 && str.equals(nodeItem.getLocalName())) {
                if (t4 == null) {
                    t4 = (T) buildClass(nodeItem, str, cls);
                    setParams(t4, nodeItem, new HashSet());
                } else {
                    throw new TikaConfigException(a.b("There can only be one ", str, " in a config"));
                }
            }
        }
        if (t4 != null) {
            return t4;
        }
        if (t3 != null) {
            return t3;
        }
        throw new TikaConfigException(a.a("could not find ", str));
    }
}
