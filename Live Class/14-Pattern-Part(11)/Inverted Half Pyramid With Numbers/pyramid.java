public class pyramid{
    public static void inverted_half_pyramid_withNumbers(int n){
        //Outer loop
        for(int i=1; i<=n; i++){
            //Inner loop
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n=5;
        inverted_half_pyramid_withNumbers(n);
    }
}