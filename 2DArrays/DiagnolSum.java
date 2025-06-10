
public class DiagnolSum {

    public static int diagnolSum(int matrix[][]){

    //    int sum1=0;
    //     for(int i = 0;i<=matrix.length-1;i++){
    //         for(int j = 0; j <= matrix[0].length-1;j++){
              
    //             if (i==j) {
    //                 sum1+= matrix[i][j];
    //             }
    //             if (i+j==matrix.length-1) {
    //                 sum1+=matrix[i][j];
    //             }

    //         }
    //     }
    //     System.out.println(sum1);

        int sum = 0;
        for(int i = 0; i <= matrix.length-1;i++){
           
            //primary diagnol
            sum += matrix[i][i];

            //secondary diagnol
            if (i != matrix.length-1-i) {
                sum += matrix[i][matrix.length-1-i];
            }
           
        }
        return sum;

    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};

       
        System.out.println( diagnolSum(matrix));
    }
}
