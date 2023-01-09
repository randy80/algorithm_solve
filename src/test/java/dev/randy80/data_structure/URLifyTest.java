package dev.randy80.data_structure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class URLifyTest {
    @Test
    @DisplayName("공백이 2개")
    public void testTwoSpaces() {
        URLify urlify = new URLify();
        assertThat(urlify.convert(("Mr John Smith").toCharArray(), 13), is(("Mr%20John%20Smith").toCharArray()));
    }
}
