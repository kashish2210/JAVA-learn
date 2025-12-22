import java.util.*;

public class advanceButterfly{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for(int i = 1 ; i <= size ; i++){
            //stars i
            for(int l =1 ; l <= i; l++){
                System.out.print("*");
            }
            // spaces 2*(n-1)i
            for(int k = 1 ; k <= 2*(size -i); k++){
                System.out.print(" ");
            }
            //stars i
            for(int j =1;j <= i; j++){
                System.out.print("*");
            }
         System.out.println();
        }
        for(int i = size ; i >= 1 ; i--){
            //stars i
            for(int l =1 ; l <= i; l++){
                System.out.print("*");
            }
            // spaces 2*(n-1)i
            for(int k = 1 ; k <= 2*(size -i); k++){
                System.out.print(" ");
            }
            //stars i
            for(int j =1;j <= i; j++){
                System.out.print("*");
            }
         System.out.println();
        }
    }
}