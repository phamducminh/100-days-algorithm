// https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        if (digits[n - 1] != 9) {
            digits[n - 1] += 1;
            return digits;
        }

        List<Integer> arrayInt = new ArrayList<>();
        int i = n - 1;
        while (i >= 0 && digits[i] == 9) {
            arrayInt.add(0, 0);
            i--;
        }

        if (i < 0) {
            arrayInt.add(0, 1);
        } else {
            arrayInt.add(0, digits[i] + 1);
            i--;
            while (i >= 0) {
                arrayInt.add(0, digits[i]);
                i--;
            }
        }

        return arrayInt.stream().mapToInt(Integer::intValue).toArray();
    }
}