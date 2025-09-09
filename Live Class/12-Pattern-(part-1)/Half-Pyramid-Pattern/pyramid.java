public class pyramid {
    public static void main(String[] args) {
        for(int line =1; line <=4; line++){
            // numbers print
            for(int number = 1; number<=line; number++){
                // we want to print number in each line not a star * so we will use number variable here
                System.out.print(number+ " ");
            }
            System.out.println();
        }
    }
}