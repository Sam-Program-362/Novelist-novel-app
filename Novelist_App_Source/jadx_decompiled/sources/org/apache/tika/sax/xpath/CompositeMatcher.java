package org.apache.tika.sax.xpath;

/* loaded from: classes.dex */
public class CompositeMatcher extends Matcher {

    /* renamed from: a, reason: collision with root package name */
    private final Matcher f4231a;

    /* renamed from: b, reason: collision with root package name */
    private final Matcher f4232b;

    public CompositeMatcher(Matcher matcher, Matcher matcher2) {
        this.f4231a = matcher;
        this.f4232b = matcher2;
    }

    @Override // org.apache.tika.sax.xpath.Matcher
    public Matcher descend(String str, String str2) {
        Matcher descend = this.f4231a.descend(str, str2);
        Matcher descend2 = this.f4232b.descend(str, str2);
        Matcher matcher = Matcher.FAIL;
        return descend == matcher ? descend2 : descend2 == matcher ? descend : (this.f4231a == descend && this.f4232b == descend2) ? this : new CompositeMatcher(descend, descend2);
    }

    @Override // org.apache.tika.sax.xpath.Matcher
    public boolean matchesAttribute(String str, String str2) {
        return this.f4231a.matchesAttribute(str, str2) || this.f4232b.matchesAttribute(str, str2);
    }

    @Override // org.apache.tika.sax.xpath.Matcher
    public boolean matchesElement() {
        return this.f4231a.matchesElement() || this.f4232b.matchesElement();
    }

    @Override // org.apache.tika.sax.xpath.Matcher
    public boolean matchesText() {
        return this.f4231a.matchesText() || this.f4232b.matchesText();
    }
}
