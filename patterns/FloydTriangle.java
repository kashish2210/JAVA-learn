import java.util.*;

public class FloydTriangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int n =1;
		for(int line=1;line<=size;line++){
			for(int chars =1 ; chars <= line; chars++){
				System.out.print(" "+n);
				n++;
			}
			System.out.println();
		}
	}
}