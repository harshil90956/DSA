// import java.util.Scanner;

// public class ODDEVEN {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int number;
//         int choice;
//         int evenSum = 0;
//         int oddSum = 0;

//         // do{
//         // System.out.println("Enter the number: ");
//         // number = sc.nextInt();

//         // if (number % 2 == 0) {
//         // evenSum += number;
//         // }else {
//         // oddSum += number;
//         // }
//         // System.out.println("Do you want to continue then select 1 other select 0");
//         // choice = sc.nextInt();

//         // }while(choice ==1);

//         choice = sc.nextInt();

//         for (int i = 1; i <= choice; i++) {
//             number = sc.nextInt();
//             if (number % 2 == 0) {
//                 evenSum += number;
//             } else {
//                 oddSum += number;
//             }

//         }

//         System.out.println("Sum of even number is " + evenSum);
//         System.out.println("Sum of odd number is " + oddSum);
//     }
// }