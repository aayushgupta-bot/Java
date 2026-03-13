import java.util.*;
public class Practice {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // VARIABLE & DATA TYPES
        // QUESTION 1
        
        // System.out.println("Enter Num 1 : ");
        // int num1 = sc.nextInt();
        // System.out.println("Enter Num 2 : ");
        // int num2 = sc.nextInt();
        // System.out.println("Enter Num 3 : ");
        // int num3 = sc.nextInt();
        // int avg = (num1 + num2 + num3) / 3;
        // System.out.println("Average : " + avg); 

        // QUESTION 2

        // System.out.println("Enter the side of square : ");
        // int side = sc.nextInt();
        // int area = (side * side);
        // System.out.println("Area : " + area);

        // QUESTION 3

        // System.out.println("Enter the cost of a pencil : ");
        // float pencil = sc.nextFloat();
        // System.out.println("Enter the cost of a pen : ");
        // float pen = sc.nextFloat();
        // System.out.println("Enter the cost of a eraser : ");
        // float eraser = sc.nextFloat();
        // float total = (pencil + pen + eraser);
        // System.out.println("Total : " + total);
        
        // QUESTION 4

        // byte  b = 4;
        // char c = 'a';
        // short s = 512;
        // int i = 1000;
        // float f = 3.14;
        // double d = 99.9954;
        // result = (f * b) + (i % c) - (d * s);

        // QUESTION 5

        // int $ = 24;

        // CONDITIONAL STATEMENTS
        // QUESTION 1

        // System.out.println("Enter a number : ");
        // int num = sc.nextInt();
        // if (num > 0) {
        //     System.out.println("Positive");
        // }
        // else if (num == 0) {
        //     System.out.println("Zero");
        // }
        // else {
        //     System.out.println("Negative");
        // }

        // QUESTION 2

        // double temp = 103.5;
        // if (temp > 100) {
        //     System.out.println("Fever");
        // }
        // else {System.out.println("No Fever");}

        // QUESTION 3

        // System.out.println("Enter a week number (1-7) : ");
        // int week = sc.nextInt();
        // switch (week) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default: System.out.println("Enter number between 1-7 ");
        //         break;
        // }

        // QUESTION 5

        // System.out.println("Enter a year to check whether it is leap or not : ");
        // int year = sc.nextInt();
        // if (year % 4 == 0) {
        //     if (year % 100 == 0) {
        //         if (year % 400 == 0) {System.out.println("Leap Year");}
        //         else {System.out.println("Not a Lear Year");}
        //     }
        //     else {System.out.println("Lear Year");}
        // }
        // else {System.out.println("Not a Lear Year");}

        // LOOPS
        // QUESTION 1
    
        // for (int i = 0; i < 5; i++) {
        //     System.out.println("Hello");
        //     i+=2;
        // }

        // QUESTION 2

        // int number;
        // int choice;
        // int evenSum=0;
        // int oddSum=0;
        // do { System.out.print("Enter the number ");
        // number=sc.nextInt();
        // if(number%2==0) {evenSum+=number;}
        // else{oddSum+=number;}
        // System.out.print("Do you want to continue? Press 1 for yes or 0 for no");
        // choice=sc.nextInt();}
        // while(choice==1);
        // System.out.println("Sum of even numbers: "+evenSum);
        // System.out.println("Sum of odd numbers: "+oddSum);

        // QUESTION 3

        // int fact = 1;
        // int num = sc.nextInt();
        // for (int i = 1; i <= num; i++) {
        //     fact *= i;
        // }
        // System.out.println(fact);

        // QUESTION 4

        // int num = sc.nextInt();
        // for (int i = 1; i < 11; i++) {
        //     System.out.println(i * num);
        // }

        // FUNCTION AND METHODS
        // QUESTION 1

        // int a = 2;
        // int b = 4;
        // int c = 6;
        // System.out.println(Average(a, b, c));
    // }
    // public static int Average(int a, int b, int c) {
    //     return (a + b + c) / 3;
    // }
        
        // QUESTION 2

//         int num;
//         System.out.print("Enter a integer : ");
//         num = sc.nextInt();
//         if (isEven(num)) {
//             System.out.println("Number is even");
//         }
//         else{
//             System.out.println("Number is odd");
//         }
//     }
//     public static boolean isEven(int number) {
//         if (number % 2 == 0) {
//             return true;
//         }
//         else return false;
//     }
// }

        System.out.println("Enter a number : ");
        int palindrome = sc.nextInt();
        if (isPalindrome(palindrome)) {
            System.out.println("Number : " + palindrome + " is a palindrome");
        }
        else {
            System.out.println("Number : " + palindrome + " is not a palindrome");
        }
    }
    public static boolean isPalindrome(int number){
        int palindrome = number;
        int reverse = 0;
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        return number == reverse;
    }
}