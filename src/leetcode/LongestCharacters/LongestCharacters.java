package leetcode.LongestCharacters;

import java.util.HashSet;
import java.util.Set;

public class LongestCharacters {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        if (s.length() == 1) {
            return 1;
        }

        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int prevIndex = 0;
        int index = 0;

        while (index < s.length()) {
            char c = s.charAt(index);
            if (!set.contains(c)) {
                set.add(c);
                index++;
                maxLength = Math.max(maxLength, set.size());
            } else {
                set.remove(s.charAt(prevIndex));
                prevIndex++;
            }
        }

        return maxLength;
    }

}
