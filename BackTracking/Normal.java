package BackTracking;

public class Normal {

    public static void printBoard(char board[][]){
     System.out.println("--------chess-------");
      for(int i =0; i < board.length;i++){
          for(int j = 0; j<board.length;j++){
            System.out.print(board[i][j]+ " ");
         }
         System.out.println();
     }
   }

   public static void placeQueen(char arr[][],int i){
      if (i == arr.length) {
         printBoard(arr);
         return;
      }
      
      for(int j = 0;j<arr.length;j++){
      arr[i][j] = 'Q';
      placeQueen(arr,i+1);
      arr[i][j] = 'x';
      }
   }


   public static void main(String[] args) {
      int n =4 ;
      char arr[][] = new char[n][n];
       for(int i =0; i < arr.length;i++){
          for(int j = 0; j<arr.length;j++){
            arr[i][j]='x';
         }
         System.out.println();
     }
      placeQueen(arr,0);
      
   }
}
