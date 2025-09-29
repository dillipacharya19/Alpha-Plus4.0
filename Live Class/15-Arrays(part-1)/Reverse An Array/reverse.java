import java.util.*;
public class reverse {
   public static void reverseArray (int numbers[]){
    int first=0,last=numbers.length-1;

    while(first<last){
        //swapping
        int temp=numbers[last];
        numbers[last]=numbers[first];
        numbers[first]=temp;
        first++;
        last--;
    }

   }

   public static void main(String args[]){
    int numbers[]={2,4,6,8,10};
    reverseArray(numbers);
    System.out.println(Arrays.toString(numbers));
   }
}