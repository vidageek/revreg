package net.vidageek.regex.datapoints;

import net.vidageek.regex.Regex;

import org.junit.experimental.theories.DataPoint;

public interface CharacterDatapoints {

    @DataPoint
    Regex a = new Regex("a");

    @DataPoint
    Regex b = new Regex("b");

    @DataPoint
    Regex ab = new Regex("[ab]");

}
