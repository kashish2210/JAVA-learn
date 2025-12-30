import java.util.*;

public class SubStringbasic {
    // public static String substring(String str, int si, int ei) {
    //     String substr = "";
    //     for(int i = si; i < ei; i++) {
    //         substr += str.charAt(i);
    //     }
    //     return substr;
    // }
    //we have inbuilt function substring(i,j)
    public static void main(String args[]) {
        String str = "kashish";
        List<String> substrings = new ArrayList<String>();
        for(int i = 0; i < str.length(); i++) {
            for(int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j);
                substrings.add(sub);
                System.out.println(sub);
            }
        }
        System.out.println("\nTotal substrings: " + substrings.size());
    }
}