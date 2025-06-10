
public class SearchInSotedMatrix {

    public static boolean searchInSotedMatrix(int matrix[][],int key){
        int row = matrix.length-1;
        int col=0;

        System.out.println(matrix[row][col]);

        while (col >=0 && row < matrix.length) {
            if (matrix[row][col] == key) {
                System.out.println("you key at index: "+ "("+row+","+col+")");
                return true;
            }
            else if (matrix[row][col] > key) {
                row--;
            }else{
                col++;
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        int key = 12;
        searchInSotedMatrix(matrix, key);
    }
}
