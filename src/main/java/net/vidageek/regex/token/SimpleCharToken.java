package net.vidageek.regex.token;

import net.vidageek.regex.RegexToken;

final public class SimpleCharToken implements RegexToken {

    private final char c;

    public SimpleCharToken(final char c) {
        this.c = c;
    }

    public String getWord() {
        return "" + c;
    }

}
