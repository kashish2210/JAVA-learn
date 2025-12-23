import java.util.*;

public class numberPyramid{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int num = 1;
		for(int i=1;i<=size;i++){
            for (int space = 1; space <= size - i; space++) {
                System.out.print(" ");
            }
			for(int j = 1; j <=i;j++){
                System.out.print(i+" ");
            }
			System.out.println();
		}
	}
}