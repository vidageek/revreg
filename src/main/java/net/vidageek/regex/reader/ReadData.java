package net.vidageek.regex.reader;

import java.util.ArrayList;
import java.util.List;

import net.vidageek.regex.RegexToken;

final public class ReadData {

    private final ArrayList<RegexToken> tokens;
    private final int offset;

    public ReadData(final RegexToken token, final int offset) {
        this.offset = offset;
        tokens = new ArrayList<RegexToken>();
        tokens.add(token);

    }

    public List<RegexToken> tokens() {
        return tokens;
    }

    public int offset() {
        return offset;
    }

}
