package net.vidageek.regex.reader;

import java.util.List;

import net.vidageek.regex.RegexTokenizer;
import net.vidageek.regex.TokenReader;
import net.vidageek.regex.token.CharGroupToken;

final public class CharGroupTokenReader implements TokenReader {

    private final RegexTokenizer tokenizer;

    public CharGroupTokenReader(final List<TokenReader> readers) {
        tokenizer = new RegexTokenizer(readers);
    }

    public boolean accept(final String regex) {
        return regex.charAt(0) == '[';
    }

    public ReadData read(final String regex) {
        String subRegex = regex.substring(1, regex.indexOf(']'));
        CharGroupToken token = new CharGroupToken(tokenizer.tokenize(subRegex));

        return new ReadData(token, subRegex.length() + 2);
    }

}
