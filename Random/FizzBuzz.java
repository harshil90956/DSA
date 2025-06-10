import java.util.Scanner;

public class FizzBuzz {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();

    //  if(num % 5 ==0 && num % 3 == 0){
    //     System.out.println("FizzBuzz");
    //  }else if(num % 3 == 0){
    //     System.out.println("Fizz");
    //  }else{
    //     System.out.println("Buzz");
    //  }

   //  int fizz = 0;
   //  int buzz = 0;

    for(int i =1;i<=num;i++){
        if(i % 5 ==0 && i % 3 == 0){
                System.out.println( i + " is FizzBuzz");
             }else if(i % 3 == 0){
                System.out.println(i + " Fizz");
             }else if (i % 5 == 0){
                System.out.println(i + " Buzz");
             }else{
                System.out.println(i);
             }
    }
     sc.close();
  }   
}
