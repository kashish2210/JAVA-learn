import java.util.*;
public class sumOfSecondRow{
    public static int sumOfSecondRow(int matrix[][]){
        int sum = 0 ;
        int m= matrix[0].length;
        for(int i = 0; i < m ; i++){
            sum += matrix[1][i];
        }
        return sum;
    }
    public static void main(String args[]){
        int[][] matrix = new int[3][3];
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
        System.out.println("sum 2 nd row is : "+sumOfSecondRow(matrix));
    }
}