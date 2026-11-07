package org.apache.tika.sax;

import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public class StandardReference {
    private String identifier;
    private String mainOrganization;
    private double score;
    private String secondOrganization;
    private String separator;

    public static class StandardReferenceBuilder {
        private final String identifier;
        private final String mainOrganization;
        private String separator = null;
        private String secondOrganization = null;
        private double score = 0.0d;

        public StandardReferenceBuilder(String str, String str2) {
            this.mainOrganization = str;
            this.identifier = str2;
        }

        public StandardReference build() {
            return new StandardReference(this.mainOrganization, this.separator, this.secondOrganization, this.identifier, this.score, 0);
        }

        public StandardReferenceBuilder setScore(double d3) {
            this.score = d3;
            return this;
        }

        public StandardReferenceBuilder setSecondOrganization(String str, String str2) {
            this.separator = str;
            this.secondOrganization = str2;
            return this;
        }
    }

    public /* synthetic */ StandardReference(String str, String str2, String str3, String str4, double d3, int i3) {
        this(str, str2, str3, str4, d3);
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public String getMainOrganizationAcronym() {
        return this.mainOrganization;
    }

    public double getScore() {
        return this.score;
    }

    public String getSecondOrganizationAcronym() {
        return this.secondOrganization;
    }

    public String getSeparator() {
        return this.separator;
    }

    public void setIdentifier(String str) {
        this.identifier = str;
    }

    public void setMainOrganizationAcronym(String str) {
        this.mainOrganization = str;
    }

    public void setScore(double d3) {
        this.score = d3;
    }

    public void setSecondOrganizationAcronym(String str) {
        this.secondOrganization = str;
    }

    public void setSeparator(String str) {
        this.separator = str;
    }

    public String toString() {
        String str = this.mainOrganization;
        String str2 = this.separator;
        if (str2 != null && !str2.isEmpty()) {
            str = str + this.separator + this.secondOrganization;
        }
        return str + StringUtils.SPACE + this.identifier;
    }

    private StandardReference(String str, String str2, String str3, String str4, double d3) {
        this.mainOrganization = str;
        this.separator = str2;
        this.secondOrganization = str3;
        this.identifier = str4;
        this.score = d3;
    }
}
