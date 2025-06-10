package searching;

public class BinarySearch {

    public static int binarySearch(int num[],int key){
        int start = 0;
        int end = num.length-1;
        while (start<=end) {
            int mid = (start + end)/2;
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
  public static void main(String[] args) {
    int num[] = {3, 5, 6, 8, 9, 20, 43, 52, 59, 85};

    int key = 85;

    int index = binarySearch(num, key);
    System.out.println("your key at index :"+ index);

  }   
}
