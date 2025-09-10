public class hello{
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args){
        int a = 5;
        int b = 10;

        swap(a, b); // This will not swap a and b in main
        System.out.println("After swap: a = " + a );    

        System.out.println("After swap: b = " + b);
    }
}