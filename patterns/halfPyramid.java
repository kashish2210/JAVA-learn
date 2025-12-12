import java.util.*;

public class halfPyramid{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for(int line=1;line<=size;line++){
			for(int numbers =1 ; numbers <= line; numbers++){
				System.out.print(numbers);
			}
			System.out.println();
		}
	}
}