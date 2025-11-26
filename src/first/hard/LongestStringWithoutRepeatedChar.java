//Q1: Longest Substring Without Repeating Characters
package first.hard;

import java.util.HashSet;
import java.util.Set;

public class LongestStringWithoutRepeatedChar {

    int longestSubstring(String str) {

        str = str.toLowerCase();
        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < str.length(); right++) {

            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        LongestStringWithoutRepeatedChar obj = new LongestStringWithoutRepeatedChar();
        System.out.println(obj.longestSubstring("abcabcbb")); // Output: 3
    }
}


//	
//	Q1: Longest Substring Without Repeating Characters
//
//	Input: "abcabcbb"
//	Output: 3 (substring = "abc")
