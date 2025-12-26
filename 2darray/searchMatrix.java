import java.util.*;
public class searchMatrix{
    public static boolean search(int matrix[][], int n){
        for(int i = 0; i < matrix.length ; i++){
            for(int j = 0 ;  j < matrix[0].length ; j++){
                if(matrix[i][j] == n){
                    System.out.println("element found at " + i + "," +j );
                    return true;
                }
            }
        }
        System.out.print("not found");
        return false;
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
        System.out.print("Enter the element to search?");
        int k = sc.nextInt();
        search(matrix,k);
    }
}