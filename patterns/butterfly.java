import java.util.*;
public class butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for(int i = 1 ; i <= size ; i++){
            for(int j = 1; j <= i ; j++){
                System.out.print("* ");
            }
            for(int j = size; j >= i ; j--){
                System.out.print("  ");
            }
            for(int j = size; j >= i ; j--){
                System.out.print("  ");
            }
            for(int j = 1; j <= i ; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int i = 1 ; i <= size ; i++){
            for(int j = size; j >= i ; j--){
                System.out.print("* ");
            }
            for(int j = 1; j <= i ; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i ; j++){
                System.out.print("  ");
            }
            for(int j = size; j >= i ; j--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}