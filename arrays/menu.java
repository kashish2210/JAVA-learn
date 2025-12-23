import java.util.*;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();

        String[] menu = {"Dosa", "Samosa","roti","panner","potato","pizza", "burger","Dosa"};

        boolean found = false;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(key)) {
                System.out.println("Found at index " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Not found");
        }
    }
}
