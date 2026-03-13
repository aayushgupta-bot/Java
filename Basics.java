import java.util.*;
public class Basics {
    public static void printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return;
    }
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b); 
    }
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }
    public static int factorial(int n){
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
    public static int binCoeff(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);
        int binCoeff = n_fact / (r_fact * nmr_fact);
        return binCoeff;
    }
    public static int sum(int a, int b){
        return a + b;
     }
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
    // public static int sum(int a, int b) {
    //     return a + b;
    // }
    public static float sum(float a, float b) {
        return a + b;
    }
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
               return false;
            }
        }
        return true;
    }
    public static void PrimesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("Decimal of " + myNum + " = " + decNum);
     }
    public static void DecToBin(int n) {
        int myNum = n;
        int pow = 0;
        int binNum = 0;
        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("Binary from of " + myNum + " = " + binNum);
    }
    public static void PrintPattern(int n) {
        int total_number_of_lines = n;
        int spaces = n-1;
        int stars = 1;
        int current_number_of_lines = 1;

        while (current_number_of_lines <= total_number_of_lines) {
            for (int i = 1; i <= spaces; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= stars; i++) {
                System.out.print("* ");
            }
            System.out.println();
            current_number_of_lines++;
            spaces--;
            stars++;
        }
    }
    public static void halfButterflyPattern(int n) {
        int totalLines = n;
        int stars = 1;
        int spaces = 2 * n - 2;
        int currentLine = 1;
        while (currentLine <= totalLines) {
            for (int i = 1; i <= stars; i++) {
                System.out.print("* ");
            }
            for (int i = 1; i <= spaces; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= stars; i++) {
                System.out.print("* ");
            }
            System.out.println();
            stars++;
            spaces -= 2;
            currentLine++;
        }
    }
    public static void hollow_rectangle(int totRows, int totCols) {
        for (int i = 1; i <= totRows; i++) {
            for (int j = 1; j <= totCols; j++) {
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String agrs[]) {

        // System.out.print("Hello World!");
        // System.out.println("Hello World!");
        // System.out.print("Hello World!\n");
        
        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");

        // int a = 10;
        // int b = 5;
        // System.out.println((a));
        // System.out.println((b));
        // String name = "Tony Stark";
        // System.out.println((name));
        // a = 50;
        // System.out.println((a));
        // a = b;
        // System.out.println((a));

        // byte b = 8;
        // System.out.println(b);
        // char ch = 'h';
        // System.out.println(ch);
        // boolean var = true;
        // System.out.println(var);
        // float price = 10.5f;
        // System.out.println(price);
        // int num = 22;
        // System.out.println(num);
        // short n = 240;
        // System.out.println(n);

        // int a = 10;
        // int b = 5;
        // int sum = a + b;
        // System.out.println(sum);

        Scanner sc = new Scanner(System.in);
        // String input = sc.next(); // single word
        // System.out.println(input); 
        
        // String name = sc.nextLine(); // Multi word input
        // System.out.println(name);

        // int number = sc.nextInt();
        // System.out.println(number);

        // float price = sc.nextFloat();
        // System.out.println(price);
        
        // byte bt = sc.nextByte(); // can store -128 to 128
        // System.out.println(bt);

        // double db = sc.nextDouble();
        // System.out.println(db);

        // boolean bln = sc.nextBoolean();
        // System.out.println(bln);

        // short shwt = sc.nextShort();
        // System.out.println(shwt);

        // long lng = sc.nextLong();
        // System.out.println(lng);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a + b;
        // System.out.println(sum);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int product = a * b;
        // System.out.println(product);

        // float rad = sc.nextFloat();
        // float area = 3.14f * rad * rad;
        // System.out.println(area);

        // Type Casting
        // float a = 12.12f;
        // int b = (int) a;
        // System.out.println(b);

        // OPERATOR
        // int A = 10;
        // int B = 5;
        // System.out.println(A+B);
        // System.out.println(A-B);
        // System.out.println(A*B);
        // System.out.println(A/B);
        // System.out.println(A%B);

        // int a = 10;
        // int b = ++a;
        // System.out.println(a);
        // System.out.println(b);

        // int A = 10;
        // int B = 5;
        // System.out.println(A == B);
        // System.out.println(A != B);
        // System.out.println(A > B);
        // System.out.println(A < B);
        // System.out.println(A >= B);
        // System.out.println(A <= B);

        // System.out.println( (3>2) && (5>0) );
        // System.out.println( (3<2) && (5>0) );
        // System.out.println( (3>2) && (5<0) );
        // System.out.println( (3<2) && (5<0) );

        // System.out.println( (3>2) || (5>0) );
        // System.out.println( (3<2) || (5>0) );
        // System.out.println( (3>2) || (5<0) );
        // System.out.println( (3<2) || (5<0) );

        // System.out.println( !(3>2) );

        // int A = 10;
        // A = A + 10;
        // A += 10;
        // System.out.println(A);
        // int B = 5;
        // B = B - 5;
        // B -= 5;
        // System.out.println(B);
        
        // int age = 22;
        // if (age > 18) {
        //     System.out.println("Adult : Drive, Vote");
        // }
        // else {
        //     System.out.println("Not Adult");
        // }

        // int a = 10;
        // int b = 3;
        // if (a >= b) {
        //     System.out.println("a is greater than b");
        // }
        // else {
        //     System.out.println("b is greater than a");
        // }

        // int n = sc.nextInt();
        // if (n % 2 == 0) {
        //     System.out.println("Even");
        // }
        // else {
        //     System.out.println("ODD");
        // }

        // int age = 22;
        // if (age >= 18) {
        //     System.out.println("Adult");
        // }
        // else if (age >= 13 && age < 18) {
        //     System.out.println("Teenager");
        // }
        // else {
        //     System.out.println("Child");
        // }

        // INCOME TAX CALCULATOR

        // int income = sc.nextInt();
        // int tax;
        // if (income < 500000) {
        //     tax = 0;
        // }
        // else if (income >= 500000 && income < 1000000) {
        //     tax = (int) (income * 0.2);
        // }
        // else {
        //     tax = (int) (income * 0.3);
        // }
        // System.out.println("Your tax is : " + tax);

        // LARGEST OF 3 

        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // int num3 = sc.nextInt();
        // if (num1 > num2 && num1 > num3) {
        //     System.out.println("Num 1 is largest of 3");
        // }
        // else if (num2 > num1 && num2 > num3){
        //     System.out.println("Num 2 is largest of 3");
        // }
        // else {System.out.println("Num 3 is largest of 3");}

        // int number = 4;
        // String type = ((number % 2) == 0) ? "even" : "odd";
        // System.out.println(type);

        // int marks = 32;
        // String reportCard = marks >= 33 ? "PASS" : "FAIL";
        // System.out.println(reportCard);
        
        // int number = 2;
        // switch (number) {
        //     case 1 : System.out.println("Samosa"); 
        //         break;
        //     case 2 : System.out.println("Burger");
        //         break;
        //     case 3 : System.out.println("Samosa"); 
        //         break;
        //     default: System.out.println("We wake up");
        //         break;
        // }

        // CALCULATOR
        // System.out.println("Enter Number 1 : ");
        // int a = sc.nextInt();
        // System.out.println("Enter Number 2 : ");
        // int b = sc.nextInt();
        // System.out.println("Enter Operator : ");
        // char operator = sc.next().charAt(0);
        // switch (operator) {
        //     case '+':
        //         System.out.println(a+b);
        //         break;
        //     case '-':
        //         System.out.println(a-b);
        //         break;
        //     case '*':
        //         System.out.println(a*b);
        //         break;
        //     case '%':
        //         System.out.println(a%b);
        //         break;
        //     case '/':
        //         System.out.println(a/b);
        //         break;        
        //     default: System.out.println("Wrong operator entered!");
        //         break;
        // }

        // int counter = 0;
        // while (counter < 10) {
        //     System.out.println("Hello World");
        //     counter++;
        // }
        // System.out.println("Printed Hello World 10x");

        // int num = 1;
        // while (num < 11) {
        //     System.out.println(num);
        //     num++;
        // }

        // int num = sc.nextInt();
        // int counter = 1;
        // while (counter <= num) {
        //     System.out.println(counter);
        //     counter++;
        // }

        // int n = sc.nextInt();
        // int sum = 0;
        // int i = 1;
        // while (i <= n) {
        //     sum = sum + i;
        //     i++;
        // }
        // System.out.println("Sum is : " + sum);

        // for(int i = 1; i <= 10; i++) {
        //     System.out.println("Hello World");
        // }

        // for(int line = 1; line <= 4; line ++) {
        //     System.out.println("****");
        // }

        // int n = 10899;
        // while (n > 0) {
        //     int lastDigit = n % 10;
        //     System.out.print(lastDigit);
        //     n = n / 10;
        // }

        // int n = 10899;
        // int rev = 0;
        // while (n > 0) {
        //     int lastDigit = n % 10;
        //     rev = (rev * 10) + lastDigit;
        //     n = n / 10;
        // }
        // System.out.println(rev);

        // int counter = 1;
        // do {
        //     System.out.println("Hello World");
        //     counter++;
        // } while (counter <= 10);

        // for (int i = 1; i <= 5; i++) {
        //     if (i == 3) {
        //         break;
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("I am out of the loop");

        // do {
        //     int n = sc.nextInt();
        //     if (n % 10 == 0) {
        //         break;
        //     }
        //     System.out.println(n);
        // } while (true);

        // for (int i = 1; i <= 5; i++){
        //     if (i == 3) {
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        // do {
        //     int n = sc.nextInt();
        //     if (n % 10 == 0) {
        //         continue;
        //     }
        //     System.out.println(n);
        // } while (true);

        //  int n = sc.nextInt();
        //  boolean isPrime = true;
        //  for (int i = 2; i < Math.sqrt(n); i++) {
        //     if (n%i==0) {
        //         isPrime=false;
        //     }
        //  }
        //  if (isPrime == true) {
        //     System.out.println("n is prime");
        //  }
        //  else {System.out.println("n is not prime");}

        // FIZZ BUZZ

        // int n = sc.nextInt();
        // if (n % 15 == 0) {
        //     System.out.println("FIZZBUZZ");
        // }
        // else if (n % 3 == 0) {
        //     System.out.println("FIZZ");
        // }
        // else if (n % 5 == 0) {
        //     System.out.println("BUZZ");
        // }
        // else {
        //     System.out.println(n);
        // }

        // Weekday Weekend
        // int dayNumber = sc.nextInt();
        // switch (dayNumber) {
        //     // case 1:
        //     // case 2:
        //     // case 3:
        //     // case 4:
        //     case 1, 2, 3, 4, 5:
        //         System.out.println("Weekday");
        //         break;
        //     // case 6:
        //     case 6, 7:
        //         System.out.println("Weekend");
        //         break;
        //     default:
        //         System.out.println("Error");
        //         break;
        // }

        // TIME ZONE CONVERTER

        // int day = sc.nextInt();
        // int hour = sc.nextInt();
        // int minute = sc.nextInt();
        // hour += 5;
        // minute += 30;
        // if (minute >= 60) {
        //     hour++;
        //     minute -= 60;
        // }
        // if (hour >= 24) {
        //     day ++;
        //     hour -= 24; 
        // }
        // if (hour < 24 && minute < 60) {
        //     System.out.println("Day : " + day + ", Hour : " + hour + ", Minute : " + minute);
        // }

        // PATTERNS
        // STAR

        // for (int line = 1; line <= 10; line++) {
        //     for (int star = 1; star <= line; star++) {
        //         System.out.print('*');
        //     }
        //     System.out.println();
        // }

        // INVERTED STAR

        // int n = 4;
        // for (int line = 1; line <= n; line++) {
        //     for (int star = 1; star <= n-line+1; star++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // HALF PYRAMID 

        // int n = 4;
        // for (int line = 1; line <= n; line++) {
        //     for (int numbers = 1; numbers <= line; numbers++) {
        //         System.out.print(numbers);
        //     }
        //     System.out.println();
        // }

        // CHARACTER PATTERN

        // char ch = 'A';
        // int n = 10;
        // for (int line = 1; line <= n; line++) {
        //     for (int chars = 1; chars <= line; chars++) {
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }

        // SQUARE

        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // BOTTOM LEFT TRIANGLE

        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (i >= j) {
        //             System.out.print("* ");
        //         }
        //     }
        //     System.out.println();
        // }

        // TOP LEFT TRIANGLE

        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (i + j <= n + 1) {
        //             System.out.print("* ");
        //         }
        //     }
        //     System.out.println();
        // }

        // BOTTOM RIGHT TRIANGLE

        // int n = 5;
        // for (int row = 1; row <= n; row++) {
        //     for (int col = 1; col <= n; col++) {
        //         if (col + col > n + 1) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // TOP RIGHT TRIANGLE

        // int n = 5;
        // for (int row = 1; row <= n; row++) {
        //     for (int col = 1; col <= n; col++) {
        //         if (col - col >= 0) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // int n = 5;
        // for (int row = 1; row <= n; row++) {
        //     for (int col = 1; col <= n; col++) {
        //         if (row - col == 0 || col + row == 6) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
    
        // COUNT TRIANGLE

        // int n = 5;
        // for (int row = 1; row <= n; row++) {
        //     for (int col = 1; col <= n; col++) {
        //         if (row >= col) {
        //             System.out.print(col );
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // int n = 5;
        // for (int row = 1; row <= n; row++) {
        //     for (int col = 1; col <= n; col++) {
        //         if (row >= col) {
        //             System.out.print(row);
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // FLOYD'S TRIANGLE

        // int n = 5;
        // int count = 1;
        // for (int row = 1; row <= n; row++) {
        //     for (int col = 1; col <= n; col++) {
        //         if (row >= col) {
        //             System.out.print(count);
        //             count++;
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // FUNCTIONS

        // printHelloWorld();

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculateSum(a, b);
        // System.out.println("Sum is : " + sum);

        // int a = 5;
        // int b = 10;
        // swap(a, b);

        // int a = 3;
        // int b = 5;
        // int prod = multiply (3, 4);
        // System.out.println("a * b = " + prod);

        // System.out.println(binCoeff(5, 2));

        // System.out.println(sum(3, 5));
        // System.out.println(sum(5, 2, 1));

        // System.out.println(sum(3, 5));
        // System.out.println(sum(3.2f, 4.8f));

        // System.out.println(isPrime(15));

        // PrimesInRange(20);

        // binToDec(101);

        // DecToBin(7);

        // ADVANCED PATTERNS

        // int n = 6;
        // PrintPattern(n);

        // int n = 4;
        // halfButterflyPattern(n);

        hollow_rectangle(4, 5);
    }
}
