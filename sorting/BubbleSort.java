package sorting;

public class BubbleSort {

    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            int swap = 0; // Reset for each outer loop turn
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++; // Increment only on actual swaps
                }
            }
            if (swap == 0) {
                System.out.println("Array is already sorted.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 4}; // Already sorted array

        // Call the sorting function
        bubbleSort(arr);

        // Print the sorted array
        System.out.println("Final array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
