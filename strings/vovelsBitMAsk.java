import java.util.*;

public class vovelsBitMAsk {

    public static int lowercaseVovel(String str) {
        int count = 0;
        int mask = 0;

        // build vowel mask
        for (char c : "aeiouAEIOU".toCharArray()) {
            mask |= 1 << (c % 32);
        }

        // check characters of input string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((mask & (1 << (ch % 32))) != 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Vowels occurred " + lowercaseVovel(str) + " number of times");
    }
}
