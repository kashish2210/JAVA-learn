import java.util.*;
public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before swap: a=" + a + " b=" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a=" + a + " b=" + b);
        sc.close();
    }
}