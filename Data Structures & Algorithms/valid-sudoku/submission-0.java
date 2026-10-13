
class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<Character>[] rowset = new HashSet[9];
        Set<Character>[] colset = new HashSet[9];
        Set<Character>[] gridset = new HashSet[9];

        // Initialize all HashSets
        for (int i = 0; i < 9; i++) {
            rowset[i] = new HashSet<>();
            colset[i] = new HashSet<>();
            gridset[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                int gridNo = (i / 3) * 3 + (j / 3);

                if (board[i][j] != '.') {

                    boolean isPresentInRow =
                        rowset[i].contains(board[i][j]);

                    boolean isPresentInCol =
                        colset[j].contains(board[i][j]);

                    boolean isPresentInGrid =
                        gridset[gridNo].contains(board[i][j]);

                    if (isPresentInRow ||
                        isPresentInCol ||
                        isPresentInGrid) {
                        return false;
                    }

                    rowset[i].add(board[i][j]);
                    colset[j].add(board[i][j]);
                    gridset[gridNo].add(board[i][j]);
                }
            }
        }

        return true;
    }
}
