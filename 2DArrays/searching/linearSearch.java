package searching;
public class linearSearch {

    public static int linearSearches(int marks[],int key){
        for(int i =0;i<marks.length;i++){
            if (marks[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int marks[] = {42,20,52,63,85};
        int key = 85;

        int index = linearSearches(marks, key);
        if (index == -1) {
            System.out.println("marks not found");
        }
        else{
        System.out.println("marks index is " + index);
        }
    }
}
