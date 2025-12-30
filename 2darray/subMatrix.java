import java.util.*;

public class subMatrix {
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

        // Print all submatrices
        printAllSubMatrices(matrix, n, m);
    }

    public static void printAllSubMatrices(int[][] matrix, int n, int m) {

        // top-left corner
        for (int r1 = 0; r1 < n; r1++) {
            for (int c1 = 0; c1 < m; c1++) {

                // bottom-right corner
                for (int r2 = r1; r2 < n; r2++) {
                    for (int c2 = c1; c2 < m; c2++) {

                        // print current submatrix
                        for (int i = r1; i <= r2; i++) {
                            for (int j = c1; j <= c2; j++) {
                                System.out.print(matrix[i][j] + " ");
                            }
                            System.out.println();
                        }
                        System.out.println("----");
                    }
                }
            }
        }
    }
}
