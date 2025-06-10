public class QuickSort {

   public static void quickSort(int arr[],int si,int ei){
      if (si >= ei) {
         return;
      }

     int pIdx = partion(arr,si,ei);

      quickSort(arr, si, pIdx-1);//left
      quickSort(arr, pIdx+1, ei);// right

   }

   public static int partion(int arr[],int si,int ei){
      int pivot = arr[ei];
      int i = si-1;
      // int j = 0;

      for(int j = si;j < ei;j++){
         if (arr[j] <= pivot) {
            i++;
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
         }

      }
       i++;
         int temp = pivot;
          arr[ei] = arr[i];
          arr[i] = temp;
         
          return i;
   }
    public static void printArr(int[] arr) {
    System.out.print("[");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]);
        if (i < arr.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println("]");
}

public static int binarySearch(int num[],int key){
        int start = 0;
        int end = num.length-1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (num[mid] == key) {
                return mid;
            }
            if (num[mid] < key) {
                start = mid + 1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static int linearSearches(int arr[],int key){
        for(int i =0;i<arr.length;i++){
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
  public static void main(String[] args) {
   int arr[] = {1, 2, 3, 4, 5,6,7,8,9,10,10,12,13,14,15,16,17,18,19,20};  // ascending → worst if pivot is last element
// int arr[] = {14,13,12,11,10,9,8,7,6,5, 4, 3, 2, 1};  // descending → also worst

   quickSort(arr, 0, arr.length-1);
   printArr(arr);
   System.out.println(binarySearch(arr, 10));
   System.out.println(linearSearches(arr, 12));
  }  
}
