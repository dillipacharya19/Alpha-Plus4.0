// 1- if else
// 2- else if
// 3- Ternary Operator
// 4- Switch Statement

// Q-1 Write a java program to get a number from the user and print whether it
// is positive or negative

// import java.util.*;
// public class Conditional {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();

// if (num >= 0) {
// System.out.println(num+ " Positive Number");
// }
// else{
// System.out.println(num+ " Negative Number");
// }
// }
// }





// Q-2 Finish the following code so that it prints you have a fever if your
// tempreture is above 100 and otherwise prints you don't have fever.

// import java.util.*;

// public class Conditional {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int temp = sc.nextInt();

// if (temp >= 100) {
// System.out.println("You have Fever");
// } else {
// System.out.println("You don't have Fever");
// }
// }
// }







// Q-3 Write a java program to input week number (1-7) and print day of week
// name using switch case.

// import java.util.*;
// public class Conditional {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int day = sc.nextInt();
//         switch (day) {
//             case 1
//                 System.out.println("sunday");
//                 break;
//             case 2:
//                 System.out.println("monday");
//             break;
//             case 3:
//                 System.out.println("tuesday");
//             break;
//             case 4:
//                 System.out.println("wednesday");
//             break;
//             case 5:
//                 System.out.println("thursday");
//             break;
//             case 6:
//                 System.out.println("friday");
//             break;
//             case 7:
//             System.out.println("saturday");
//             break;
//             default:
//                 System.out.println("Invaild input");
//         }
//     }
// }







// Q-4 What will be the value of x&y in the following program.

// public class Conditional {
//     public static void main(String[] args) {
//         int a = 63 , int b = 36;
//         boolean x = (a<b) ? true : false;
//         int y = (a>b) ? a : b;
//     }
// }






// Q-5 Write a java program that takes a year from the user and print whether that year is a leap or not.


import java.util.Scanner;
public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a input");

        int year = sc.nextInt();
        if(year % 4!=0){
            System.out.println("Not a leap year");
        }else if (year % 4 == 0 && year % 100 !=0) {
            System.out.println("leap year");
        }else if (year % 4==0 && year % 100==0 && year % 400 !=0){
            System.out.println("Not a leap year");
        }else{
            System.out.println("leap year");
        }
    }
}