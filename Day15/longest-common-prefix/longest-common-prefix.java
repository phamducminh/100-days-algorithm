// https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/887/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        for (int i = 0; i < strs[0].length(); i++){
            for (String s : strs) {
                if (i == s.length() || s.charAt(i) != strs[0].charAt(i)) {
                    return result;
                }
            }
            result += strs[0].charAt(i);
        }
        
        return result;
    }
}