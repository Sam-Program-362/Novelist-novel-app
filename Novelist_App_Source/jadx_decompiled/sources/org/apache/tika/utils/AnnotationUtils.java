package org.apache.tika.utils;

import F2.d;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.tika.config.Field;
import org.apache.tika.config.Param;
import org.apache.tika.config.ParamField;
import org.apache.tika.config.TikaConfig;
import org.apache.tika.exception.TikaConfigException;

/* loaded from: classes.dex */
public class AnnotationUtils {
    private static final F2.b LOG = d.b(AnnotationUtils.class);
    private static final Map<Class<?>, List<ParamField>> PARAM_INFO = new HashMap();

    public static void assignFieldParams(Object obj, Map<String, Param> map) {
        Class<?> cls = obj.getClass();
        Map<Class<?>, List<ParamField>> map2 = PARAM_INFO;
        if (!map2.containsKey(cls)) {
            synchronized (TikaConfig.class) {
                try {
                    if (!map2.containsKey(cls)) {
                        List<AccessibleObject> collectInfo = collectInfo(cls, Field.class);
                        ArrayList arrayList = new ArrayList(collectInfo.size());
                        Iterator<AccessibleObject> it2 = collectInfo.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(new ParamField(it2.next()));
                        }
                        PARAM_INFO.put(cls, arrayList);
                    }
                } finally {
                }
            }
        }
        for (ParamField paramField : PARAM_INFO.get(cls)) {
            Param param = map.get(paramField.getName());
            if (param != null) {
                if (!paramField.getType().isAssignableFrom(param.getType())) {
                    throw new TikaConfigException(String.format(Locale.ROOT, "Value '%s' of type '%s' can't be assigned to field '%s' of defined type '%s'", param.getValue(), param.getValue().getClass(), paramField.getName(), paramField.getType()));
                }
                try {
                    paramField.assignValue(obj, param.getValue());
                } catch (IllegalAccessException e3) {
                    LOG.g(param.getValue(), param.getName());
                    throw new TikaConfigException(e3.getMessage(), e3);
                } catch (InvocationTargetException e4) {
                    LOG.g(param.getValue(), param.getName());
                    Throwable cause = e4.getCause();
                    Throwable th = e4;
                    if (cause != null) {
                        th = e4.getCause();
                    }
                    throw new TikaConfigException(th.getMessage(), th);
                }
            } else {
                if (paramField.isRequired()) {
                    Locale locale = Locale.ROOT;
                    throw new TikaConfigException("Param " + paramField.getName() + " is required for " + obj.getClass().getName() + ", but it is not given in config.");
                }
                LOG.u("Param not supplied, field is not mandatory");
            }
        }
    }

    private static List<AccessibleObject> collectInfo(Class<?> cls, Class<? extends Annotation> cls2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (cls != null && cls != Object.class) {
            arrayList.addAll(Arrays.asList(cls.getDeclaredFields()));
            arrayList.addAll(Arrays.asList(cls.getDeclaredMethods()));
            cls = cls.getSuperclass();
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            AccessibleObject accessibleObject = (AccessibleObject) obj;
            if (accessibleObject.isAnnotationPresent(cls2)) {
                accessibleObject.setAccessible(true);
                arrayList2.add(accessibleObject);
            }
        }
        return arrayList2;
    }
}
