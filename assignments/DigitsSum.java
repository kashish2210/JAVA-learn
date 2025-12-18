import java.util.*;

public class DigitsSum{
    public static void sumdigit(int n){
        int sum = 0 ;
        n = Math.abs(n);
        while(n > 0){
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum of the digits");
        sumdigit(n);
    }

}