class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int n = A.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = A[i][n - 1 - j] == 0 ? 1 : 0;
            }
        }
        
        return result;
    }
}