// https://leetcode.com/problems/length-of-last-word/description/
class Solution {
    public int lengthOfLastWord(String s) {
        String s1 = s.trim();
        int count = 0;
        int r = s1.length() - 1;
        while(r >= 0 && s1.charAt(r) != ' ') {
            count++;
            r--;
        }

        return count;
    }
}