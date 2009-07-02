package net.vidageek.regex.token;

import java.util.List;
import java.util.Random;

import net.vidageek.regex.RegexToken;

final public class CharGroupToken implements RegexToken {

    private final List<RegexToken> tokens;

    public CharGroupToken(final List<RegexToken> tokens) {
        this.tokens = tokens;
    }

    public String getWord() {
        return tokens.get(new Random().nextInt(tokens.size())).getWord();
    }

}
