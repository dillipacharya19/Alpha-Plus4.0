public class palindromic{
    public static void main(String[] args) {
        int N =5;
        for(int i=1; i<=N; i++){
            //Step 1 print empty spaces
            for(int j=0; j<(N-i); j++){
                System.out.print(" ");
            }
            //Step 2 start printing the number 
            int number=1; 
            boolean increasing =true;
            while (number >0) {
                System.out.print(number);
                if(number ==i){
                    increasing =false;
                }
                if(increasing == true){
                    number++;
                }else{
                    number--;
                }
            }
            System.out.println();
        }
    }
}