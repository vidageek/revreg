package net.vidageek.regex;

import java.util.ArrayList;
import java.util.List;

import net.vidageek.regex.reader.CharGroupTokenReader;
import net.vidageek.regex.reader.ReadData;
import net.vidageek.regex.reader.SimpleCharTokenReader;

final public class RegexTokenizer {

    private final List<TokenReader> readers;

    public RegexTokenizer() {
        readers = new ArrayList<TokenReader>();
        readers.add(new SimpleCharTokenReader());
        readers.add(new CharGroupTokenReader(readers));
    }

    public RegexTokenizer(final List<TokenReader> readers) {
        this.readers = readers;
    }

    public List<RegexToken> tokenize(String regex) {
        List<RegexToken> list = new ArrayList<RegexToken>();
        while (regex.length() != 0) {
            for (TokenReader reader : readers) {
                if (reader.accept(regex)) {
                    ReadData data = reader.read(regex);
                    list.addAll(data.tokens());
                    regex = regex.substring(data.offset());
                    break;
                }
            }
        }
        return list;
    }
}
