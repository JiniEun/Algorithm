package leetcode.Palindrome;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        if (x <= 9) {
            return true;
        }

        int revertedHalf = 0;

        while (x > revertedHalf) {
            revertedHalf = revertedHalf * 10 + x % 10;
            x /= 10;
        }
        return x == revertedHalf || x == revertedHalf / 10;
    }

}
