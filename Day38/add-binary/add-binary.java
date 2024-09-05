// https://leetcode.com/problems/add-binary/description/
class Solution {
    public String addBinary(String a, String b) {
        String result = "";
        int carry = 0;
        int aLength = a.length();
        int bLength = b.length();

        for (int i = aLength - 1, j = bLength - 1; i >= 0 || j >= 0; i--, j--) {
            int digitA = i >= 0 ? (a.charAt(i) - '0') : 0;
            int digitB = j >= 0 ? (b.charAt(j) - '0') : 0;

            int total = digitA + digitB + carry;
            String character = (total % 2) + "";

            result = character + result;
            carry = total / 2;
        }

        if (carry == 1) {
            result = "1" + result;
        }

        return result;
    }
}