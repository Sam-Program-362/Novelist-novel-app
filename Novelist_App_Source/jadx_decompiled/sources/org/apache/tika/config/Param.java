package org.apache.tika.config;

import B1.e;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.parser.multiple.AbstractMultipleParser;
import org.apache.tika.utils.StringUtils;
import org.apache.tika.utils.XMLReaderUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import t.AbstractC0468a;

/* loaded from: classes.dex */
public class Param<T> implements Serializable {
    private static final String CLASS = "class";
    private static final String LIST = "list";
    private static final String MAP = "map";
    private static final Map<Class<?>, String> map;
    private static final Map<String, Class<?>> reverseMap;
    private static final Map<String, Class<?>> wellKnownMap;
    private T actualValue;
    private String name;
    private Class<T> type;
    private final List<String> valueStrings;

    static {
        HashMap hashMap = new HashMap();
        map = hashMap;
        reverseMap = new HashMap();
        wellKnownMap = new HashMap();
        hashMap.put(Boolean.class, "bool");
        hashMap.put(String.class, "string");
        hashMap.put(Byte.class, "byte");
        hashMap.put(Short.class, "short");
        hashMap.put(Integer.class, "int");
        hashMap.put(Long.class, "long");
        hashMap.put(BigInteger.class, "bigint");
        hashMap.put(Float.class, "float");
        hashMap.put(Double.class, "double");
        hashMap.put(File.class, "file");
        hashMap.put(URI.class, "uri");
        hashMap.put(URL.class, "url");
        hashMap.put(ArrayList.class, LIST);
        hashMap.put(Map.class, MAP);
        for (Map.Entry entry : hashMap.entrySet()) {
            reverseMap.put((String) entry.getValue(), (Class) entry.getKey());
        }
        wellKnownMap.put("metadataPolicy", AbstractMultipleParser.MetadataPolicy.class);
    }

    public Param() {
        this.valueStrings = new ArrayList();
    }

    private static <T> Class<T> classFromType(String str) {
        Map<String, Class<?>> map2 = reverseMap;
        if (map2.containsKey(str)) {
            return (Class) map2.get(str);
        }
        try {
            return (Class<T>) Class.forName(str);
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException(e3);
        }
    }

    private static <T> T getTypedValue(Class<T> cls, String str) {
        try {
            if (cls.isEnum()) {
                return (T) Enum.valueOf(cls, str);
            }
            Constructor<T> constructor = cls.getConstructor(String.class);
            constructor.setAccessible(true);
            return constructor.newInstance(str);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException(String.valueOf(cls).concat(" doesnt have a constructor that takes String arg"), e4);
        }
    }

    public static <T> Param<T> load(InputStream inputStream) {
        return load(XMLReaderUtils.getDocumentBuilder().parse(inputStream).getFirstChild());
    }

    private static <T> void loadList(Param<T> param, Node node) {
        ((Param) param).actualValue = (T) new ArrayList();
        for (Node firstChild = node.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (firstChild.getNodeType() == 1) {
                ((List) ((Param) param).actualValue).add(getTypedValue(classFromType(firstChild.getLocalName()), firstChild.getTextContent()));
                ((Param) param).valueStrings.add(firstChild.getTextContent());
            }
        }
    }

    private static <T> void loadMap(Param<T> param, Node node) {
        String localName;
        String textContent;
        ((Param) param).actualValue = (T) new HashMap();
        for (Node firstChild = node.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (firstChild.getNodeType() == 1) {
                if (firstChild.getAttributes().getNamedItem(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR) != null) {
                    localName = firstChild.getAttributes().getNamedItem(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR).getNodeValue();
                    textContent = firstChild.getAttributes().getNamedItem(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR) != null ? firstChild.getAttributes().getNamedItem(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR).getNodeValue() : firstChild.getTextContent();
                } else {
                    localName = firstChild.getLocalName();
                    textContent = firstChild.getTextContent();
                }
                if (((Map) ((Param) param).actualValue).containsKey(localName)) {
                    throw new TikaConfigException(AbstractC0468a.a("Duplicate keys are not allowed: ", localName));
                }
                ((Map) ((Param) param).actualValue).put(localName, textContent);
            }
        }
    }

    private static <T> void loadObject(Param<T> param, Node node, Class cls) {
        try {
            ((Param) param).actualValue = cls.getDeclaredConstructor(null).newInstance(null);
            NodeList childNodes = node.getChildNodes();
            for (int i3 = 0; i3 < childNodes.getLength(); i3++) {
                Node item = childNodes.item(i3);
                if ("params".equals(item.getLocalName())) {
                    NodeList childNodes2 = item.getChildNodes();
                    for (int i4 = 0; i4 < childNodes2.getLength(); i4++) {
                        if ("param".equals(childNodes2.item(i4).getLocalName())) {
                            Param load = load(childNodes2.item(i4));
                            String b3 = AbstractC0468a.b("set", load.getName().substring(0, 1).toUpperCase(Locale.US), load.getName().substring(1));
                            try {
                                try {
                                    ((Param) param).actualValue.getClass().getMethod(b3, load.getType()).invoke(((Param) param).actualValue, load.getValue());
                                } catch (IllegalAccessException | InvocationTargetException e3) {
                                    throw new TikaConfigException(AbstractC0468a.a("can't set param value: ", load.getName()), e3);
                                }
                            } catch (NoSuchMethodException e4) {
                                throw new TikaConfigException(AbstractC0468a.a("can't find method: ", b3), e4);
                            }
                        }
                    }
                }
            }
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e5) {
            throw new TikaConfigException("can't build class: ".concat(String.valueOf(cls)), e5);
        }
    }

    public String getName() {
        return this.name;
    }

    public Class<T> getType() {
        return this.type;
    }

    public String getTypeString() {
        Class<T> cls = this.type;
        if (cls == null) {
            return null;
        }
        if (List.class.isAssignableFrom(cls)) {
            return LIST;
        }
        Map<Class<?>, String> map2 = map;
        return map2.containsKey(this.type) ? map2.get(this.type) : this.type.getName();
    }

    public T getValue() {
        return this.actualValue;
    }

    public void save(OutputStream outputStream) {
        Document newDocument = XMLReaderUtils.getDocumentBuilder().newDocument();
        Element createElement = newDocument.createElement("param");
        newDocument.appendChild(createElement);
        save(newDocument, createElement);
        XMLReaderUtils.getTransformer().transform(new DOMSource(createElement), new StreamResult(outputStream));
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setType(Class<T> cls) {
        this.type = cls;
    }

    public void setTypeString(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        this.type = classFromType(str);
        this.actualValue = null;
    }

    public String toString() {
        String str = this.name;
        String valueOf = String.valueOf(this.valueStrings);
        String valueOf2 = String.valueOf(this.actualValue);
        StringBuilder sb = new StringBuilder("Param{name='");
        sb.append(str);
        sb.append("', valueStrings='");
        sb.append(valueOf);
        sb.append("', actualValue=");
        return e.m(sb, valueOf2, "}");
    }

    public Param(String str, Class<T> cls, T t3) {
        ArrayList arrayList = new ArrayList();
        this.valueStrings = arrayList;
        this.name = str;
        this.type = cls;
        this.actualValue = t3;
        if (List.class.isAssignableFrom(t3.getClass())) {
            arrayList.addAll((List) t3);
        } else if (!Map.class.isAssignableFrom(t3.getClass())) {
            arrayList.add(t3.toString());
        }
        if (this.type == null) {
            this.type = (Class) wellKnownMap.get(str);
        }
    }

    public static <T> Param<T> load(Node node) {
        Class<T> cls;
        String str;
        Node namedItem = node.getAttributes().getNamedItem("name");
        Node namedItem2 = node.getAttributes().getNamedItem("type");
        Node namedItem3 = node.getAttributes().getNamedItem(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
        Node namedItem4 = node.getAttributes().getNamedItem(CLASS);
        if (namedItem4 != null) {
            try {
                cls = (Class<T>) Class.forName(namedItem4.getTextContent());
            } catch (ClassNotFoundException e3) {
                throw new TikaConfigException(AbstractC0468a.a("can't find class: ", namedItem4.getTextContent()), e3);
            }
        } else {
            cls = null;
        }
        Node firstChild = node.getFirstChild();
        if ((firstChild instanceof NodeList) && namedItem3 != null) {
            throw new TikaConfigException("can't specify a value attr _and_ a node list");
        }
        if (namedItem3 == null || (firstChild != null && firstChild.getTextContent() != null)) {
            namedItem3 = firstChild;
        }
        Param<T> param = new Param<>();
        String textContent = namedItem.getTextContent();
        ((Param) param).name = textContent;
        if (namedItem2 != null) {
            if (!CLASS.equals(namedItem2.getTextContent())) {
                param.setTypeString(namedItem2.getTextContent());
            } else if (namedItem4 != null) {
                param.setType(cls);
            } else {
                throw new TikaConfigException("must specify a class attribute if type=\"class\"");
            }
        } else {
            Class<T> cls2 = (Class) wellKnownMap.get(textContent);
            ((Param) param).type = cls2;
            if (cls2 == null) {
                ((Param) param).type = cls;
            }
            if (((Param) param).type == null) {
                throw new TikaConfigException(AbstractC0468a.a("Must specify a \"type\" in: ", node.getLocalName()));
            }
        }
        if (cls != null) {
            loadObject(param, node, cls);
            return param;
        }
        if (List.class.isAssignableFrom(((Param) param).type)) {
            loadList(param, node);
            return param;
        }
        if (Map.class.isAssignableFrom(((Param) param).type)) {
            loadMap(param, node);
            return param;
        }
        if (namedItem3 != null) {
            str = namedItem3.getTextContent();
        } else {
            str = StringUtils.EMPTY;
        }
        ((Param) param).actualValue = (T) getTypedValue(((Param) param).type, str);
        ((Param) param).valueStrings.add(str);
        return param;
    }

    public void save(Document document, Node node) {
        if (node instanceof Element) {
            Element element = (Element) node;
            element.setAttribute("name", getName());
            element.setAttribute("type", getTypeString());
            if (List.class.isAssignableFrom(this.actualValue.getClass())) {
                for (int i3 = 0; i3 < this.valueStrings.size(); i3++) {
                    String str = this.valueStrings.get(i3);
                    Element createElement = document.createElement(map.get(((List) this.actualValue).get(i3).getClass()));
                    createElement.setTextContent(str);
                    element.appendChild(createElement);
                }
                return;
            }
            if (Map.class.isAssignableFrom(this.actualValue.getClass())) {
                for (String str2 : ((Map) this.actualValue).keySet()) {
                    String str3 = (String) ((Map) this.actualValue).get(str2);
                    Element createElement2 = document.createElement(str2);
                    createElement2.setTextContent(str3);
                    element.appendChild(createElement2);
                }
                return;
            }
            element.setTextContent(this.valueStrings.get(0));
            return;
        }
        throw new IllegalArgumentException("Not an Element : ".concat(String.valueOf(node)));
    }

    public Param(String str, T t3) {
        this(str, t3.getClass(), t3);
    }
}
