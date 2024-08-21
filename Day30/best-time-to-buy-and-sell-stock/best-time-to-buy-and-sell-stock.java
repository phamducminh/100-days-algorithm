// https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/572/
class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 1;
        int max = 0;
        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                int profit = prices[r] - prices[l];
                max = Math.max(max, profit);
            } else {
                l = r;
            }
            r++;
        }
        return max;
    }
}