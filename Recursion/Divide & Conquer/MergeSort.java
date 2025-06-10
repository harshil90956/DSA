
public class MergeSort {

   public static void mergeSort(int si,int ei,int arr[]){

      if (si >= ei) {
         return;
      }

      int mid = si + (ei - si)/2;
      mergeSort(si, mid, arr);
      mergeSort(mid+1, ei, arr);
      merge(arr,si,mid,ei);

      

   }


   public static void merge(int arr[],int si , int mid , int ei){
      int temp[] = new int[ei-si+1];

      int i = si;
      int j = mid+1;
      int k = 0;

      while (i <= mid && j <= ei) {
         if (arr[i] < arr[j]) {
            temp[k] = arr[i];
            i++;
         }
         else{
            temp[k] = arr[j];
            j++;
         }
         k++;
      }

      //left
      while (i<=mid) {
         temp[k++] = arr[i++];
      }

      //right
      while (j<=ei) {
          temp[k++] = arr[j++];
      }

      for(k=0,i=si;k<temp.length;k++,i++){
         arr[i] = temp[k];
      }
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


   public static void main(String[] args) {
     int arr[] = {2,8,6,7,0,3,9,-12};
     mergeSort(0, arr.length-1, arr);
     printArr(arr);
     System.out.println(arr.length);
   }
}
