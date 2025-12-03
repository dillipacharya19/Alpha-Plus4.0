//Method over loading in Java
public class OOPS {
    public static void main(String[] args) {
        Calculator Calc = new Calculator();
        System.out.println(Calc.sum(1, 2)); // Calls the first sum method
        System.out.println(Calc.sum((float) 1.5, (float) 2.5)); // Calls the second sum method
        System.out.println(Calc.sum(1, 2, 3)); // Calls the third sum method
    }
}

class Calculator {
    // Method to sum two integers
    int sum(int a, int b) {
        return a + b;
    }

    // Method to sum two floats
    float sum(float a, float b) {
        return a + b;
    }

    // Method to sum three integers
    int sum(int a, int b, int c) {
        return a + b + c;
    }
}