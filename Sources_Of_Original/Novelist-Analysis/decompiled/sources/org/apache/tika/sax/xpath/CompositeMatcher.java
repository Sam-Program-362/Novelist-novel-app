package org.apache.tika.sax.xpath;

/* JADX INFO: loaded from: classes.dex */
public class CompositeMatcher extends Matcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Matcher f4231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matcher f4232b;

    public CompositeMatcher(Matcher matcher, Matcher matcher2) {
        this.f4231a = matcher;
        this.f4232b = matcher2;
    }

    @Override // org.apache.tika.sax.xpath.Matcher
    public Matcher descend(String str, String str2) {
        Matcher matcherDescend = this.f4231a.descend(str, str2);
        Matcher matcherDescend2 = this.f4232b.descend(str, str2);
        Matcher matcher = Matcher.FAIL;
        if (matcherDescend == matcher) {
            return matcherDescend2;
        }
        if (matcherDescend2 == matcher) {
            return matcherDescend;
        }
        return (this.f4231a == matcherDescend && this.f4232b == matcherDescend2) ? this : new CompositeMatcher(matcherDescend, matcherDescend2);
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
