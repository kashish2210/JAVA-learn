import java.util.*;
public class diagonalSum{
    public static int diagonalSum(int matrix[][]){
        //strictly m = n;
        int m = matrix.length;
        int n = matrix[0].length;
        int sum =0;
        // for(int i = 0 ; i<m ; i++){
        //     for(int j = 0 ; j < n ; j++){
        //         if(i==j){
        //             sum += matrix[i][j];
        //         }
        //         else if(i+j == m -1){
        //             sum +=matrix[i][j];
        //         }
        //     }
        // }
        for(int i = 0 ; i<m ; i++){
            sum += matrix[i][i];
            if(i != m-1-i){
                sum += matrix[i][m-1-i];
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int[][] matrix = new int[4][4];
        int n = matrix.length ,m= matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n ; i++){
            for(int j = 0 ;  j < m ; j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        for(int i = 0; i < n ; i++){
            for(int j = 0 ;  j < m ; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("all diagonal(2) sum of the matrix is : "+ diagonalSum(matrix));
    }
}