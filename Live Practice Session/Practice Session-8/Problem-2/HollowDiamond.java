public class HollowDiamond {
    public static void main(String[] args) {
        int N = 5, spaces = 1;
        for (int row = 1; row <= (2 * N) - 1; row++) {
            // Print empty spaces
            if (row <= N) {
                // Print (N-row) spaces
                for (int j = 0; j < N - row; j++) {
                    System.out.print(" ");
                }
            } else {
                // Print (row-N) spaces
                for (int j = 0; j < row - N; j++) {
                    System.out.print(" ");
                }
            }

            // print the stars
            if (row == 1 || row == (2 * N - 1)) {
                System.out.print("*");
            } else {
                // print the stars along with spaces
                System.out.print("*");
                for (int j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                if (row < N) {
                    spaces += 2;
                } else {

                    spaces -= 2;
                }
            }
            System.out.println();
        }
    }
}