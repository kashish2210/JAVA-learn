import java.util.*;

public class area_of_circle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        double pi = 3.14;
        System.out.println("area of circle:" + (pi*r*r));
        sc.close();
    }
}