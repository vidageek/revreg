package net.vidageek.regex;

import net.vidageek.regex.reader.ReadData;

public interface TokenReader {

    boolean accept(String regex);

    ReadData read(String regex);

}
