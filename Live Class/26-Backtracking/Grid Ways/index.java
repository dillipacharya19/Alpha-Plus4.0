public class index {
    public static int gridWays(int i, int j, int m, int n) {
        // Base case
        if (i == m - 1 && j == n - 1) {
            return 1;
        } else if (i == m || j == n) { // boundary cross condition
            return 0;
        }

        int w1 = gridWays(i + 1, j, m, n); // down
        int w2 = gridWays(i, j + 1, m, n); // right
        return w1 + w2;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println("The total ways of " + gridWays(0, 0, n, m));
    }
}