package BackTracking;

public class SudokuSolver {


   public static boolean isSafe(int sudoku[][],int row,int col,int digit){
      // col
      for(int i = 0; i < 9;i++){
         if (sudoku[i][col] == digit) {
            return false;
         }
      }

      // row
      for(int i = 0; i < 9;i++){
         if (sudoku[row][i] == digit) {
            return false;
         }
      }

      int sr = (row/3) * 3;
      int sc = (col/3) * 3;

      for(int i = sr;i<sr+3;i++){
         for(int j = sc;j<sc+3;j++){
            if (sudoku[i][j] == digit) {
               return false;
            }
         }
      }

      return true;

   }


   public static boolean sudokuSolver(int sudoku[][],int row,int col){

      //base case
      if (row == 9) {
         return true;
      }

      // kaam

      int nextRow = row,nextCol = col+1;
      if (col+1 == 9) {
         nextRow = row+1;
         nextCol = 0;
      }

      if (sudoku[row][col] != 0) {
         return sudokuSolver(sudoku, nextRow, nextCol);
      }

     for(int digit=1;digit < 10;digit++){
        if(isSafe(sudoku,row,col,digit)) {
          sudoku[row][col] = digit;
          if(sudokuSolver(sudoku, nextRow, nextCol)){
          return true;
          }
          sudoku[row][col] = 0;

        }
       
     }
      return false;
   }

    public static void printSudoku(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            // Horizontal box separator every 3 rows
            if (i % 3 == 0 && i != 0) {
                System.out.println("------+-------+------");
            }

            for (int j = 0; j < board[0].length; j++) {
                // Vertical box separator every 3 columns
                if (j % 3 == 0 && j != 0) {
                    System.out.print("| ");
                }

                // Print number or dot for empty cells
                if (board[i][j] == 0) {
                    System.out.print(". ");
                } else {
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println(); // Move to next row
        }
    }

   public static void main(String[] args) {
      int[][] sudoku = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},

            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},

            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

    if (sudokuSolver(sudoku, 0, 0)) {
      System.out.println("solution exist");
      printSudoku(sudoku);
    }
    else{
      System.out.println("Solution does not exist");
    }
   }
}
