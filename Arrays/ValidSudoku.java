import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> col = new HashSet<>();
        Set<Character> row = new HashSet<>();
        Map<Pair<Integer, Integer>, Set<Character>> box = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    //check rows
                    if (row.contains(board[i][j])) {
                        return false;
                    }
                    row.add(board[i][j]);

                    //check 3x3 boxes
                    Pair<Integer, Integer> x = new Pair<>(i / 3, j / 3);
                    if (!box.containsKey(x)) {
                        Set<Character> y = new HashSet<>();
                        y.add(board[i][j]);
                        box.put(x, y);
                    }
                    else {
                        if (box.get(x).contains(board[i][j])) {
                            return false;
                        }
                        box.get(x).add(board[i][j]);
                    }
                }
                if (board[j][i] != '.') {
                    //check columns
                    if (col.contains(board[j][i])) {
                        return false;
                    }
                    col.add(board[j][i]);
                }

            }
            row = new HashSet<>();
            col = new HashSet<>();
        }
        return true;
    }
}
