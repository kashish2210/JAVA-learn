import java.util.*;

public class CharPattern{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		char ch = 'A';
		for(int line=1;line<=size;line++){
			for(int chars =1 ; chars <= line; chars++){
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}