package leetcode.LongestCharacters;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LongestCharactersTest {

    @Test
    void testAll() {
        assertAll(
            () -> test("abcabcbb", 3),
            () -> test("bbbbb", 1),
            () -> test("pwwkew", 3),
            () -> test("aab", 2)
        );
    }

    private void test(String s, int expected) {

        LongestCharacters solution = new LongestCharacters();
        int actual = solution.lengthOfLongestSubstring(s);

        assertEquals(expected, actual);
    }

}