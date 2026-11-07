package org.apache.tika.metadata;

import B1.e;

/* JADX INFO: loaded from: classes.dex */
public final class PropertyTypeException extends IllegalArgumentException {
    public PropertyTypeException(String str) {
        super(str);
    }

    public PropertyTypeException(Property.PropertyType propertyType, Property.PropertyType propertyType2) {
        super(e.k("Expected a property of type ", String.valueOf(propertyType), ", but received ", String.valueOf(propertyType2)));
    }

    public PropertyTypeException(Property.ValueType valueType, Property.ValueType valueType2) {
        super(e.k("Expected a property with a ", String.valueOf(valueType), " value, but received a ", String.valueOf(valueType2)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PropertyTypeException(Property.PropertyType propertyType) {
        String strConcat;
        if (propertyType != Property.PropertyType.COMPOSITE) {
            strConcat = String.valueOf(propertyType).concat(" is not supported");
        } else {
            strConcat = "Composite Properties must not include other Composite Properties as either Primary or Secondary";
        }
        super(strConcat);
    }
}
