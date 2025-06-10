package String;

public class IsPalindromOrNot{

    public static boolean isPalindrome(String str){

        for(int i = 0; i <= str.length()/2;i++){
           if (str.charAt(i) != str.charAt(str.length()-1-i)) {
             return false;
           }
        }
        return true;

    }

    public static void main(String[] args) {
        String str = "MADAM";
        if (isPalindrome(str)) {
            System.out.println("str is palindrome");
        }else{
            System.out.println("str is not palindrome");
        }
    }
}