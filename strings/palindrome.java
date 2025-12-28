import java.util.*;

public class palindrome{
    public static void main(String args[]){
        System.out.print("enter the word i will check wheter it is palindrime or not: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean isPalindrome = true;
        for(int i = 0 ; i < str.length(); i++){
            if (str.charAt(i) != str.charAt(str.length()-1-i) ){
                isPalindrome = false;
            }
        }
        if(isPalindrome){
            System.out.println("enterd string is a Palindrome");
        }else{
            System.out.println("enterd string is not a Palindrome");
        }

    }
}