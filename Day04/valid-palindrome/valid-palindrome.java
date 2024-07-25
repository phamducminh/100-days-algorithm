// https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/883/
class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();
        s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
        int i = 0, j = s1.length() - 1;
        while (i < j) {
            if (s1.charAt(i) != s1.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}