public class Suduko_Solver {
    public static boolean isValid(char[][] board, int row, int col, char target) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == target) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == target) {
                return false;
            }
        }
        for (int i = (row / 3) * 3; i < ((row / 3) * 3) + 3; i++) {
            for (int j = (col / 3) * 3; j < ((col / 3) * 3) + 3; j++) {
                if (board[i][j] == target) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void print(char[][] b) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean solution(char[][] board, int col, int row) {
        if (col >= 9) {
            col = 0;
            row++;
        }
        if (row >= 9) {
            // print(board);
            return true;
        }
        if (board[row][col] == '.') {
            for (char i = '1'; i <= '9'; i++) {
                if (isValid(board, row, col, i)) {
                    board[row][col] = i;
                    if(solution(board, col + 1, row)){
                        return true;
                    }
                    board[row][col] = '.';
                }
            }
            return false;
        } else {
            return solution(board, col + 1, row);
        }
    }

    public static void main(String args[]) {
        char board[][]={{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
        solution(board,0,0);
        print(board);
    }
}
