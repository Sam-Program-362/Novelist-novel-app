package org.apache.tika.metadata;

import B1.e;
import org.apache.tika.metadata.Property;

/* loaded from: classes.dex */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PropertyTypeException(org.apache.tika.metadata.Property.PropertyType r2) {
        /*
            r1 = this;
            org.apache.tika.metadata.Property$PropertyType r0 = org.apache.tika.metadata.Property.PropertyType.COMPOSITE
            if (r2 == r0) goto Lf
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = " is not supported"
            java.lang.String r2 = r2.concat(r0)
            goto L11
        Lf:
            java.lang.String r2 = "Composite Properties must not include other Composite Properties as either Primary or Secondary"
        L11:
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.metadata.PropertyTypeException.<init>(org.apache.tika.metadata.Property$PropertyType):void");
    }
}
