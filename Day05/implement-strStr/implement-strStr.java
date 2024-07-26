// https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/885/
class Solution {
    public int strStr(String haystack, String needle) {
        int idx = -1, i = 0, j = 0;
        
        if (haystack.length() < needle.length()) {
            return idx;
        }
        
        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                idx = i;
                while (j < needle.length() && i < haystack.length()) {
                   if (haystack.charAt(i) == needle.charAt(j)) {
                       i++;
                       j++;
                   } else {
                       break;
                   }
                }
                
                if (j == needle.length()) {
                    break;
                } else {
                    j = 0;
                    i = idx + 1;
                    idx = -1;
                }
            } else {
                idx = -1;
                j = 0;
                i++;
            }
        }
        
        return idx;
    }
}