import java.util.*;

public class CharPyramid{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		char ch = 'A';
		for(int i=1;i<=size;i++){
            for (int space = 1; space <= size - i; space++) {
                System.out.print(" ");
            }
			for(int chars =1 ; chars <= (2 * i - 1); chars++){
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}