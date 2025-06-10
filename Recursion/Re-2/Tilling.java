public class Tilling {

   public static int tilling (int n){
      if (n == 1 || n == 0) {
         return 1;
      }

      // ver
      int ver = tilling(n-1);
      int hr = tilling(n-2);

      int tot = ver + hr;
      return tot;

   }

   public static void main(String[] args) {
      System.out.println(tilling(5));
   }
   
}