package net.vidageek.regex;

import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

final public class Regex {

    private final String originalRegex;
    private final List<RegexToken> tokens;

    public Regex(final String regex) {
        if (regex == null) {
            throw new IllegalArgumentException("regex cannot be null");
        }
        try {
            Pattern.compile(regex);
        } catch (PatternSyntaxException e) {
            throw new IllegalArgumentException("regex " + regex + " is not a valid java regex.");
        }
        originalRegex = regex;
        tokens = new RegexTokenizer().tokenize(regex);
    }

    public String asString() {
        return originalRegex;
    }

    public String generateMatchingWord() {
        String word = "";
        for (RegexToken token : tokens) {
            word += token.getWord();
        }
        return word;
    }

}
