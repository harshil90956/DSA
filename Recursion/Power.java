public class Power {

   public static int Pow(int n,int x){
      if (x == 0) {
         return 1;
      }
      //  int p = ;
       return n * Pow(n,x-1);
   }
   public static void main(String[] args) {
     System.out.println(Pow(50, 5));
   }
}
