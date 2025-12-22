import java.util.*;

public class hollowRohmbus{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        for(int i =1; i <= length ; i++){
            for(int j = 1 ; j <=(length-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= breadth; j++) {
                // Print star at borders
                if (i == 1 || i == length || j == 1 || j == breadth) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}