import java.util.*;
public class invertedRotatedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        sc.close();

        // Outer loop for the rows
        for (int i = 1; i <= rows; i++) {
            
            // Inner loop 1: Print leading spaces
            // The number of spaces decreases as the row number increases
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

            // Inner loop 2: Print stars
            // The number of stars increases (2*i - 1 stars total per row)
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            
            // Move to the next line after the row is printed
            System.out.println();
        }
    }
}
