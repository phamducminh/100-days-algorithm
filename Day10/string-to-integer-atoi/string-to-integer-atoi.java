// https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/884/
class Solution {
    public int myAtoi(String s) {
        if (s.isEmpty()) return 0;
        if (Character.isAlphabetic(s.charAt(0))) return 0;
        
        int result = 0;
        boolean isNegative = false;
        boolean isStart = false;

        s = s.trim();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '-') {
                if (!isStart) {
                    isNegative = true;
                    isStart = true;
                } else {
                    break;
                }
            } else if (c == '+') {
                if (!isStart) {
                    isStart = true;
                } else {
                    break;
                }
            } else if (Character.isDigit(c)) {
                int curDigit = c - '0';
                curDigit = isNegative ? -curDigit : curDigit;
                if (result > Integer.MAX_VALUE / 10 || result == Integer.MAX_VALUE / 10 && curDigit > 7) {
                    return Integer.MAX_VALUE;
                }

                if (result < Integer.MIN_VALUE / 10 || result == Integer.MIN_VALUE / 10 && curDigit < -8) {
                    return Integer.MIN_VALUE;
                }

                if (!isStart) {
                    isStart = true;
                }

                result = result * 10 + curDigit;
            } else {
                break;
            }
        }

        return result;
    }
}