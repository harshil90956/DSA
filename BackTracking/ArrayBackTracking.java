package BackTracking;

public class ArrayBackTracking {
   public static void printBoard(int arr[]){
      for(int i =0; i < arr.length;i++){
         
         System.out.print(arr[i]+" ");
     }
     System.out.println();
   }

   public static void backInArr(int arr[],int i){
    
      if (i==arr.length) {
         printBoard(arr);
         return;
      }

      arr[i] = i+1;
      //kaam
      backInArr(arr, i+1);
      arr[i] = arr[i] - 2;
   }

      
  public static void main(String[] args) {
    int arr[] = new int[5];
    backInArr(arr, 0);
    printBoard(arr);
  }
      
}
