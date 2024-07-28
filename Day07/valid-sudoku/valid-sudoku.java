// https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/769/
class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> hashSetRow = new HashSet<>();
        Set<Character> hashSetCol = new HashSet<>();
        Set<Character> hashSetSubBoxes = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            hashSetRow.clear();
            hashSetCol.clear();
            for (int j = 0; j < 9; j++) {
                if (isDuplicate(hashSetRow, board[i][j]))
                    return false;
                if (isDuplicate(hashSetCol, board[j][i]))
                    return false;
            }
        }

        int x = 0, y = 0;
        while (x < 3) {
            while (y < 3) {
                hashSetSubBoxes.clear();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (isDuplicate(hashSetSubBoxes, board[i + 3 * x][j + 3 * y]))
                            return false;
                    }
                }
                y++;
            }
            x++;
            y = 0;
        }

        return true;
    }
    
    public boolean isDuplicate(Set<Character> hashSet, char c) {
        if (hashSet.contains(c)) {
            return true;
        } else if (c != '.') {
            hashSet.add(c);
        }
        return false;
    }
}