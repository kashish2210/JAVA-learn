import java.util.*;

public class advanceDecimalToBinary {

    public static void decimalToBinary(int n) {
        if (n == 0) {
            System.out.println("0");
            return;
        }

        StringBuilder binary = new StringBuilder();

        while (n > 0) {
            int rem = n % 2;
            binary.append(rem);
            n = n / 2;
        }

        System.out.println(binary.reverse().toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decimalToBinary(n);
    }
}
