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

import java.util.*;

public class Conditional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int temp = sc.nextInt();

        if (temp >= 100) {
            System.out.println("You have Fever");
        } else {
            System.out.println("You don't have Fever");
        }
    }
}