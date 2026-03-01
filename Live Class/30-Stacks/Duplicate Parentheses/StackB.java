import java.util.*;

public class StackB {

    public static boolean isDuplicate(String str) { //0(n)
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // closing bracket
            if (ch == ')') {
                int count = 0;
                while (stack.pop() != '(') {
                    count++;

                }

                if (count < 1) {
                    return true; // duplicate
                }
            } else {
                // opening bracket
                stack.push(ch);

            }

        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b))"; // true
        String str2 = "(a-b)"; // false
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));

    }
}
