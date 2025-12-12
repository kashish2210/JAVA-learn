import java.util.*;
public class invertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.close();
        for (int line = size; line >=1; line--){
            for (int numbers = 1; numbers <= line; numbers++){
                System.out.print(numbers);
            }
            System.out.println();
        }
    }
}