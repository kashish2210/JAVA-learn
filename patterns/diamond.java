import java.util.*;

public class diamond{
	public static void main(String arg[]){
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
		for(int i = 1 ; i <= size ; i++){
            //spaces
			for(int j = 1 ; j <= (size-i) ; j++){
				System.out.print(" ");
			}
            //stars
			for(int j = 1 ; j <= (2*i) -1 ; j++){
				System.out.print("*");
			} 
		System.out.println();
		}
        // System.out.print(" ");
        for(int i = size ; i >= 1 ; i--){
            //spaces
			for(int j = 1 ; j <= (size-i) ; j++){
				System.out.print(" ");
			}
            //stars
			for(int j = 1 ; j <= (2*i) -1 ; j++){
				System.out.print("*");
			}
		System.out.println();
		}
    }

}