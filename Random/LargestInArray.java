public class LargestInArray {

    public static int largestInArray(int num[]){
      int largest = Integer.MIN_VALUE;
      int smallest = Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
          if (largest < num[i]) {
            largest = num[i];
          }
          if (smallest > num[i]) {
            smallest = num[i];
          }
        }
        System.out.println("smallest number is "+ smallest);
        return largest;
    }

 public static void main(String[] args) {
    int num[] = {1,5,9,3,7,10,-1};
    System.out.println("largest number of array is " + largestInArray(num));
 }   
}
