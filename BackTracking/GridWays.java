 
  package BackTracking;
 
public class GridWays {

   public static int gridWays(int i,int j,int n,int m){
      if (i == n-1 && j ==m-1) {
         return 1;
      }else if(n == i || m == j){
         return 0;
      }
      int w1 = gridWays(i, j+1, n, m);
      int w2 = gridWays(i+1, j, n, m);
      return w1+w2;
   }
 
   public static void main(String[] args) {
      int n = 8,m=8;
       System.out.println(gridWays(0,0,n,m));
   }
   
 }



// package BackTracking;

// public class GridWays {

//     public static int factorial(int num) {
//         int fact = 1;
//         for (int i = 2; i <= num; i++) {
//             fact *= i;
//         }
//         return fact;
//     }

//     public static int gridWays(int n, int m) {
//         int num = n + m - 2;
//         int r = n - 1;
//         return factorial(num) / (factorial(r) * factorial(num - r));
//     }

//     public static void main(String[] args) {
//         int n = 10, m = 10;
//         System.out.println("Total paths using formula: " + gridWays(n, m));
//     }
// }
