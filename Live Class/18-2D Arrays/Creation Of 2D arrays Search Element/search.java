import java.util.*;
public class search {

    public static boolean searchMatrix(int[][] matrix, int key) {
        for(int i =0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("found at index: (" + i + " " + j + ")");
                    return true;
                }
            }
        }

        System.out.println(" key not found");;
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = new int [3][3];
        int n = matrix.length , m = matrix[0].length;

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the elements of the matrix:");
        for(int i =0; i<3; i++){
            for(int j=0; j<3; j++){
                matrix[i][j] =sc.nextInt();
            }

        }

        //output the matrix

        for(int i =0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
        searchMatrix(matrix, 5);
    }
}