// https://leetcode.com/problems/pascals-triangle-ii/description/
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        
        for (int i = 0; i <= rowIndex; i++) {
            if (i == 0) {
                List<Integer> row1 = new ArrayList<>();
                row1.add(1);
                result.add(row1);
            } else if (i == 1) {
                List<Integer> row2 = new ArrayList<>();
                row2.add(1);
                row2.add(1);
                result.add(row2);
            } else {
                List<Integer> curRow = new ArrayList<>();
                List<Integer> prevRow = result.get(i - 1);
                
                curRow.add(1);
                for (int j = 1; j < i; j++) {
                    curRow.add(prevRow.get(j-1) + prevRow.get(j));
                }
                curRow.add(1);
                result.add(curRow);
            }
        }
        
        return result.get(rowIndex);
    }
}