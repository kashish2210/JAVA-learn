import java.util.*;
public class spiral{
    public static void printSpiral(int matrix[][]){
        int startRow = 0 ;
        int startCol = 0 ;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;
        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int i = startCol ; i <=endCol ; i++){
                System.out.print(matrix[startRow][i]+" ");
            }
            //bottom
            for(int i = startRow + 1; i<=endRow ; i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //right
            if(startRow < endRow){
                for(int j = endCol - 1; j >= startCol; j--){
                    System.out.print(matrix[endRow][j] + " ");
                }
            }

            // LEFT
            if(startCol < endCol){
                for(int i = endRow - 1; i > startRow; i--){
                    System.out.print(matrix[i][startCol] + " ");
                }
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
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
        printSpiral(matrix);
    }
}