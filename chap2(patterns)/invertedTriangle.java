import java.util.*;
public class invertedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.close();
        for (int line = size; line >=1; line--){
            for (int star = 1; star <= line; star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}