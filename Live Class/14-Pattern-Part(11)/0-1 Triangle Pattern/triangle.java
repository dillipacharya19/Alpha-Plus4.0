public class triangle{
    public static void zero_one_triangle(int n){
        //Outer loop
        for(int i=0; i<=n; i++){
            //Inner loop
            for(int j=1; j<=i; j++){
                if((i+j) %2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n =5;
        zero_one_triangle(n);
    }
}