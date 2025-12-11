import java.util.*;
public class SquarePattern {
    public static void main(String[] args) {
        // int size = 5; // The number of rows and columns
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.close();
        // Outer loop for rows
        for (int i = 0; i < size; i++) {
            // Inner loop for columns
            for (int j = 0; j < size; j++) {
                System.out.print("* "); // Print a star and a space
            }
            System.out.println(); // Move to the next line after a row is complete
        }
    }
}