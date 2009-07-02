package net.vidageek.regex;

import java.util.regex.Pattern;

import junit.framework.Assert;
import net.vidageek.regex.datapoints.CharacterDatapoints;

import org.junit.Test;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
final public class ParserTest implements CharacterDatapoints {

    @Test(expected = IllegalArgumentException.class)
    public void testThatNullStringIsNotAccepted() {
        new Parser(null);
    }

    @Theory
    public void testThatRegexMatches(final Regex regex) {
        String word = new Parser(regex).parse();

        Assert.assertTrue("Regex " + regex.asString() + " didn't match word " + word + ".", Pattern.compile(
                regex.asString()).matcher(word).matches());
    }
}
