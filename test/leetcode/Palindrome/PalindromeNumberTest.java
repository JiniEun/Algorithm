package leetcode.Palindrome;


import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PalindromeNumberTest {

    @Test
    void testAll() {
        assertAll(
            () -> test(121, true),
            () -> test(-121, false)
        );
    }

    private void test(int num, boolean expected) {

        PalindromeNumber solution = new PalindromeNumber();
        boolean actual = solution.isPalindrome(num);

        // then
        assertEquals(expected, actual);
    }
}