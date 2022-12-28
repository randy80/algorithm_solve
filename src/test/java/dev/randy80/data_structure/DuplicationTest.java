package dev.randy80.data_structure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class DuplicationTest {
    @Test
    @DisplayName("중복이 없음")
    public void testNoDuplication() {
        Duplication duplication = new Duplication();
        assertThat(duplication.check("abcdefg"), is(false));
    }

    @Test
    @DisplayName("중복이 있음")
    public void testIsDuplication() {
        Duplication duplication = new Duplication();
        assertThat(duplication.check("abcdeabfg"), is(true));
    }
}
