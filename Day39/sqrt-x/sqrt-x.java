// https://leetcode.com/problems/sqrtx/description/
class Solution {
    public int mySqrt(int x) {
        if (x == 1) return 1;
        int res = 1;

        while (res < x) {
            int powX = res * res;
            if (powX <= x && powX > 0) {
                ++res;
            } else {
                break;
            }
        }

        return --res;
    }
}