// 1- if else 
// 2- else if 
// 3- Ternary Operator
// 4- Switch Statement


// Q-1 Write a java program to get a number from the user and print whether it is positive or negative

import java.util.*;
public class Conditional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num >= 0) {
            System.out.println(num+ " Positive Number");
        }
        else{
            System.out.println(num+ " Negative Number");
        }
    }
}