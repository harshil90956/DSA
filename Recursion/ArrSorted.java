
 public class ArrSorted {
  public static boolean SortedArr(int arr[],int i){
        if (i == arr.length-1) {
            return true;
        }
        if (arr[i] > arr[i+1]) {
            return false;
        }
         
          return SortedArr(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,4,3,6,};
        System.out.println(SortedArr(arr, 0));

    }
    
 }