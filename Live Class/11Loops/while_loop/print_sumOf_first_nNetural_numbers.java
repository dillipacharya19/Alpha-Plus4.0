import java.util.Scanner;

public class print_sumOf_first_nNetural_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        int i = 1; 
        while (i <= n ) {
            sum += i;
            i++;
        }
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        sc.close();
    }
}
