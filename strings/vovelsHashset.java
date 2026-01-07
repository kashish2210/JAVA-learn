import java.util.*;

public class lvovelsHashset {
    public static int lowercaseVovel(String str){
        int count = 0;
        Set<Character> vowels = Set.of('a','e','i','o','u','A','E','I','O','U');
        for(int i = 0 ; i < str.length(); i++){
            if(vowels.contains(str.charAt(i))){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Lowercase vovels occured " + lowercaseVovel(str) + " number of times");
    }
}
