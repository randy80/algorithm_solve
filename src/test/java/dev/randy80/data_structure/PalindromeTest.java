package dev.randy80.data_structure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/*
 * 공백은 무시
 */
public class PalindromeTest {
    @Test
    @DisplayName("짝수개 회문 순열인 경우")
    public void testEven() {
        Palindrome palindrome = new Palindrome();
        assertThat(palindrome.check("tact coao"), is(true));
    }

    @Test
    @DisplayName("홀수개 회문 순열인 경우")
    public void testOdd() {
        Palindrome palindrome = new Palindrome();
        assertThat(palindrome.check("tact coa"), is(true));
    }

    @Test
    @DisplayName("회문 순열아 아닌 경우")
    public void testFalse() {
        Palindrome palindrome = new Palindrome();
        assertThat(palindrome.check("tac coa"), is(false));
    }
}
