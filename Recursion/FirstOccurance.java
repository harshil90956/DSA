
public class FirstOccurance {

   public static int Foccu(int arr[],int key,int i){
      if (i == arr.length-1) {
         return -1;
      }
      if (arr[i] == key) {
         return i;
      }
       return Foccu(arr, key, i+1);
   }
   public static void main(String[] args) {
      int arr[] = {1,5,3,9,6,5,7,3};
      System.out.println(Foccu(arr, 60, 0));
   }
}