package net.vidageek.regex;

import java.util.List;

import junit.framework.Assert;
import net.vidageek.regex.token.CharGroupToken;
import net.vidageek.regex.token.SimpleCharToken;

import org.junit.Before;
import org.junit.Test;

final public class RegexTokenizerTest {

    private RegexTokenizer tokenizer;

    @Before
    public void setup() {
        tokenizer = new RegexTokenizer();
    }

    @Test
    public void testThatTokenizesSimpleChar() {
        List<RegexToken> list = tokenizer.tokenize("a");
        Assert.assertEquals(1, list.size());
        Assert.assertEquals(SimpleCharToken.class, list.get(0).getClass());
    }

    @Test
    public void testThatTokenizesTwoChar() {
        List<RegexToken> list = tokenizer.tokenize("ab");
        Assert.assertEquals(2, list.size());
        Assert.assertEquals(SimpleCharToken.class, list.get(0).getClass());
        Assert.assertEquals(SimpleCharToken.class, list.get(1).getClass());
    }

    @Test
    public void testThatTokenizesCharGroup() {
        List<RegexToken> list = tokenizer.tokenize("[ab]");
        Assert.assertEquals(1, list.size());
        Assert.assertEquals(CharGroupToken.class, list.get(0).getClass());
    }
}
