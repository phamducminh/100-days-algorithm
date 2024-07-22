// https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/879/
class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int i = 0, j = n - 1;
        while (i != j && i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}