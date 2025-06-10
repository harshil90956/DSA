package OOPSPracticeQuestions;

public class RecurionBasics {

    public static boolean SortedArr(int arr[],int i){

        if (i == arr.length) {
            return true;
        }
        if (arr[i] > arr[i+1]) {
            return false;
        }
         
          return SortedArr(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,6,};
        SortedArr(arr, 0);

    }
}
