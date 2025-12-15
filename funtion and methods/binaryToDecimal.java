import java.util.*;

public class binaryToDecimal {

    public static boolean isBinaryNumber(String num) {
        for (char c : num.toCharArray()) {
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }

    public static void binaryToDecimal(String n) {
        if (!isBinaryNumber(n)) {
            System.out.println("Enter a valid binary number");
            return;
        }

        int decNum = 0;
        int pow = 0;

        for (int i = n.length() - 1; i >= 0; i--) {
            int bit = n.charAt(i) - '0';
            decNum += bit * (int) Math.pow(2, pow);
            pow++;
        }

        System.out.println("Decimal of " + n + " = " + decNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();   // read as String
        binaryToDecimal(n);
    }
}
