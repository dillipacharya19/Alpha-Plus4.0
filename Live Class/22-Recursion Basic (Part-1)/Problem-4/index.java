public class index {
    public static int calculateSum(int n) {
        if (n == 1) {
            return 1;

        }
        int snm1 = calculateSum(n - 1);
        int sn = snm1 + n;
        return sn;
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println(calculateSum(n));
    }
}