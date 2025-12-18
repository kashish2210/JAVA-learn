
import java.util.Scanner;


public class palindrome{
    public static boolean isPalindrome (String str){
        StringBuilder reverse1 = new StringBuilder(str);
        reverse1.reverse();
        if (reverse1.toString().equals(str)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));
    }

}