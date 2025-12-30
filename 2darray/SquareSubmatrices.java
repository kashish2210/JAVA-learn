import java.util.*;

public class SquareSubmatrices {
    
    public static List<int[][]> findAllSquareSubmatrices(int[][] matrix) {
        List<int[][]> result = new ArrayList<>();
        
        if (matrix == null || matrix.length == 0) {
            return result;
        }
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // Iterate through all possible square sizes
        int maxSize = Math.min(rows, cols);
        
        for (int size = 1; size <= maxSize; size++) {
            // Iterate through all possible starting positions
            for (int i = 0; i <= rows - size; i++) {
                for (int j = 0; j <= cols - size; j++) {
                    // Extract the square submatrix
                    int[][] submatrix = new int[size][size];
                    for (int r = 0; r < size; r++) {
                        for (int c = 0; c < size; c++) {
                            submatrix[r][c] = matrix[i + r][j + c];
                        }
                    }
                    result.add(submatrix);
                }
            }
        }
        
        return result;
    }
    
    // Helper method to print a matrix
    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
    public static boolean isAllOne(int[][] mat){
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[0].length;j++){
                if(mat[i][j] != 1 ){
                    return false;
                }
            }
        }
        return true;
    }
    public static int countAllOneMatrices(List<int[][]> matrices) {
        int count = 0;
        for(int[][] mat : matrices) {
            if(isAllOne(mat)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 1},
            {1, 1, 1},
            {0, 1, 1}
        };
        
        List<int[][]> allSquares = findAllSquareSubmatrices(matrix);
        
        System.out.println("Total square submatrices: " + allSquares.size());
        System.out.println("\nAll square submatrices:");
        
        for (int i = 0; i < allSquares.size(); i++) {
            System.out.println("Submatrix " + (i + 1) + ":");
            printMatrix(allSquares.get(i));
        }
        System.out.println("matrix that are all one: "+countAllOneMatrices(allSquares));
    }
}