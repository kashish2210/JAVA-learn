import java.util.*;

public class searchSortedMatrix{
    public static boolean search(int matrix[][] ,int key){
        int n = matrix.length;
        int m = matrix[0].length;
        //bruteforce o[n^2] worst case{not sorted array}
        // for(int i = 0 ; i < n ; i++){
        //     for(int j =  0; j < m ; j++){
        //         if(key == matrix[i][j]){
        //             return true ;
        //         }
        //     }
        // }
        //row wise(binary search) o[nlogn]{rows sorted or column}
        // for (int i = 0; i < matrix.length; i++) {
        //     int low = 0;
        //     int high = matrix[i].length - 1;

        //     while (low <= high) {
        //         int mid = (low + high) / 2;

        //         if (matrix[i][mid] == key) {
        //             System.out.println("Found at row " + i + ", col " + mid);
        //             return true;
        //         } else if (matrix[i][mid] < key) {
        //             low = mid + 1;
        //         } else {
        //             high = mid - 1;
        //         }
        //     }
        // }
        //StairCase search O[] {for column && rows sorted}
        int row = 0, col = matrix[0].length - 1 ;
        while(row<matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("found key at (" + row + ","+col +")");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else if(key > matrix[row][col]){
                row++;
            }
        }
        System.out.println("not found!");
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