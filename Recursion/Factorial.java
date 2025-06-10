public class Factorial {

   public static int fact(int n){
      if (n==0) {
         return 1;
      }
      int fnm1 = fact(n-1);
      int fc = n * fnm1;
      return fc;
   }
   public static void main(String[] args) {
      System.out.println(fact(5));
   }
}
