import java.util.*;
public class numberOfSubmatrix{
    public static int countSubMatrices(int n, int m) {
        return (n * (n + 1) / 2) * (m * (m + 1) / 2);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter rows u wanted: ");
        int n = sc.nextInt();
        System.out.println("enter colums u wanted: ");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        // Input
        System.out.println("enter " +n*m +" numbers: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n ; i++){
            for(int j = 0 ;  j < m ; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("number of possiblr submatrix: "+ countSubMatrices(n,  m));
    }
}