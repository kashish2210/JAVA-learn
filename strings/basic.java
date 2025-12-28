import java.util.*;
public class basic {
    public static void printletters(String str){
        for(int i = 0 ; i < str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        char arr[] = {'a','b','c','d','e'};
        String str = "abcd";
        String str2 = new String("xyz");
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);
        System.out.println(name.length());
        //concatination
        String firstname = "kashish";
        String lastname = "shrivastav";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname + "is this");
        System.out.println(fullname.charAt(3));

        printletters(fullname);


    }

}