import java.util.Scanner;

public class print_number_from_0_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();

        int counter = 1;

        while (counter <= range) {
            System.out.println(counter + "");
            counter++;
        }
        System.out.println("Some spaces");
    }
}
