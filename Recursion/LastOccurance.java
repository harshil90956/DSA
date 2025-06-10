public class LastOccurance {

   public static int LOccu(int arr[],int key,int i){

      // back ward
      // if (i < 0) {
      //       return -1; // Key not found
      //   }

      //   if (arr[i] == key) {
      //       return i;  // Found the last occurrence, return index
      //   }

      //   return LOccu(arr, key, i - 1); // Keep looking backward
      //      }

      // forward 
      if (i == arr.length) {
         return -1;
      }
      int isFound = LOccu(arr, key, i+1);
      if (isFound == -1 && arr[i] == key) {
         return i;
      }
      
        return isFound;
   }

   public static void main(String[] args) {
       int arr[] = {1,5,3,9,6,5,7,3};
      //  int i = arr.length;
      // System.out.println(LOccu(arr, 3, i));
      System.out.println(LOccu(arr,7, 0));
   }  
}
