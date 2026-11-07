package org.apache.tika.sax;

import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
class LinkBuilder {
    private final String type;
    private final StringBuilder text = new StringBuilder();
    private String uri = StringUtils.EMPTY;
    private String title = StringUtils.EMPTY;
    private String rel = StringUtils.EMPTY;

    public LinkBuilder(String str) {
        this.type = str;
    }

    public void characters(char[] cArr, int i3, int i4) {
        this.text.append(cArr, i3, i4);
    }

    public Link getLink() {
        return getLink(false);
    }

    public String getType() {
        return this.type;
    }

    public void setRel(String str) {
        if (str != null) {
            this.rel = str;
        } else {
            this.rel = StringUtils.EMPTY;
        }
    }

    public void setTitle(String str) {
        if (str != null) {
            this.title = str;
        } else {
            this.title = StringUtils.EMPTY;
        }
    }

    public void setURI(String str) {
        if (str != null) {
            this.uri = str;
        } else {
            this.uri = StringUtils.EMPTY;
        }
    }

    public Link getLink(boolean z3) {
        String string = this.text.toString();
        if (z3) {
            string = string.replaceAll("\\s+", StringUtils.SPACE).trim();
        }
        return new Link(this.type, this.uri, this.title, string, this.rel);
    }
}
