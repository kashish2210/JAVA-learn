import java.util.*;
public class decimalToBinary{

    public static void decimalToBinary(int n){
        int pow =0;
        int binary =0;
        while(n > 0){
            int rem = n % 2;
            binary += rem * Math.pow(10, pow);
            pow++;
            n = n / 2;
        }
        System.out.println(binary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decimalToBinary(n);
    }
}