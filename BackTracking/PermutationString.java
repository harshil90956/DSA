package BackTracking;

public class PermutationString {

   public static void findPerm(String str,String ans){
      if (str.length() == 0) {
         System.out.println(ans);
         return;
      }

      // kaam 
      for(int i = 0; i< str.length();i++){
         char curr = str.charAt(i);
         String NewStr = str.substring(0, i) + str.substring(i+1);
         findPerm(NewStr, ans+curr);
      }

   }
    public static void main(String[] args) {
       findPerm("abc", "");
      
    }
}
