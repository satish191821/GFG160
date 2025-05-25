import java.util.*;

class Solution {
    int longestSubstrDistinctChars(String S) {
        int n = S.length();
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < n; end++) {
            char currentChar = S.charAt(end);
            
            while (set.contains(currentChar)) {
                set.remove(S.charAt(start));
                start++;
            }

            set.add(currentChar);
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
