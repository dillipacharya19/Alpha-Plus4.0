import java.util.*;

public class index {
    // if i want to print all the letters of a string in a single line with space
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String firstName = "Dillip";
        String lastName = "Acharya";
        String fullName = firstName + " " + lastName;
        printLetters(fullName);
    }
}
