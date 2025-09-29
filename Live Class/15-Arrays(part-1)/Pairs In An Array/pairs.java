import java.util.*;
public class pairs{
    public static void printPairs(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i]; //1,2,3,4,5
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("("+curr+","+numbers[j]+") ");
            }
            System.out.println();
        }
    }


public static void main (String args[]){
    int numbers[] = {2,4,6,8,10};
    printPairs(numbers);    
}
}
//Time Complexity: O(n^2)
//Space Complexity: O(1)