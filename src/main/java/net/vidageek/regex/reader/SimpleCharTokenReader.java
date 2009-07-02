package net.vidageek.regex.reader;

import net.vidageek.regex.TokenReader;
import net.vidageek.regex.token.SimpleCharToken;

final public class SimpleCharTokenReader implements TokenReader {

    public boolean accept(final String regex) {
        if (Character.isLetter(regex.charAt(0))) {
            return true;
        }
        return false;
    }

    public ReadData read(final String regex) {
        return new ReadData(new SimpleCharToken(regex.charAt(0)), 1);
    }

}
