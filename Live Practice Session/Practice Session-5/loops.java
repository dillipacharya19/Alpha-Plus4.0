// Q-1 How many times Hello is printed ? 

// public class loops {

//     public static void main(String[] args) {
//         for(int i =0; i<5; i++){
//             System.out.println("hello");
//             i+=2;
//         }
//     }
// }





// Q-3 Write a program to find the factorial of any number entered by the user.
// Hint- factorial of a number n=n*(n-1) * (n-2) * (n-3) ...*
// i and exists for positive numbers only we write factorial as n 
// so factorial of 0!=1, 1!=1, 2!=2, 3!=6, 4!=24 and so on. 
// Note- please don't confuse factorial with not equal to operator, the have not the same )

import java.util.*;
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        int ans = 1;

        for(int i = n; i>=1; i++){
            ans = ans * i ;
        }
        System.out.println(ans);
    }
    
}