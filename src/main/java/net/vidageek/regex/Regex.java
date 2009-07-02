package net.vidageek.regex;

import java.util.List;

final public class Regex {

    private final String originalRegex;
    private final List<RegexToken> tokens;

    public Regex(final String regex) {
        if (regex == null) {
            throw new IllegalArgumentException("regex cannot be null");
        }
        originalRegex = regex;
        tokens = new RegexTokenizer().tokenize(regex);
    }

    public String asString() {
        return originalRegex;
    }

}
