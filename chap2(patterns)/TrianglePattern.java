import java.util.*;
public class TrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.close();
        for (int line = 1; line <=size; line++){
            for (int star = 1; star <= line; star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}