package net.vidageek.regex;

final public class Parser {

    private final Regex regex;

    public Parser(final Regex regex) {
        if (regex == null) {
            throw new IllegalArgumentException("regex cannot be null");
        }
        this.regex = regex;
    }

    public String parse() {
        return regex.asString();
    }
}
