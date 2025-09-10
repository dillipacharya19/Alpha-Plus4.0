import java.util.*;
public class paramater {
    public static int calulateSum(int num1, int num2) {
        int sum = num1 +num2;
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int sum = calulateSum(a, b);
        System.out.println("The sum is: " + sum);
    }
    static int add(int x, int y) {
        return x + y;
    }
}