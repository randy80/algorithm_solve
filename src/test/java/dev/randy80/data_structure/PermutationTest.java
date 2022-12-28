package dev.randy80.data_structure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PermutationTest {
    @Test
    @DisplayName("순열임")
    public void testIsPermutation() {
        Permutation permutation = new Permutation();
        assertThat(permutation.check("dog", "god"), is(true));
    }

    @Test
    @DisplayName("순열이 아님")
    public void testIsNotPermutation() {
        Permutation permutation = new Permutation();
        assertThat(permutation.check("dog", "dop"), is(false));
    }

    @Test
    @DisplayName("문자열 길이가 다르면 순열이 아님")
    public void testStringLengthDifference() {
        Permutation permutation = new Permutation();
        assertThat(permutation.check("abc", "abcd"), is(false));
    }

    @Test
    @DisplayName("대소문자를 구분")
    public void testCaseSensitive() {
        Permutation permutation = new Permutation();
        assertThat(permutation.check("abc", "abC"), is(false));
    }
}
