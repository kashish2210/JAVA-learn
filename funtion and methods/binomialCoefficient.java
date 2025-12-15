
import java.util.*;

public class binomialCoefficient{
    public static int factorial(int n){
    int f=1 ;
        for (int i =1; i <=n ; i++){
        f = f*i;
        }
    return f;
    }
    public static int binomailCoeff(int n , int r){
        int num = factorial (n);
        int den = factorial (r) * factorial (n - r);
        int binomailCoeff = num / den;
        return binomailCoeff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("Binomial Coefficient of " + n + " and " + r + " is: " + binomailCoeff(n , r));
        sc.close();

    }
}