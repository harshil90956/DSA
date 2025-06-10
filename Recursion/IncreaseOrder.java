public class IncreaseOrder {

   public static void Inc(int n){
      if (n == 1) {
        System.out.println(1);
        return;
      }
      Inc(n-1);
      System.out.println(n + " ");
   }
 public static void main(String[] args) {
   Inc(5);
 }  
}
