package leetcode.Palindrome;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberTest extends TestCase {
    @Test
    public void test() {
        PalindromeNumber solution = new PalindromeNumber();
        int num1 = 121;
        Assert.assertTrue(solution.isPalindrome(num1));

        int num2 = -121;
        Assert.assertFalse(solution.isPalindrome(num2));
    }
}