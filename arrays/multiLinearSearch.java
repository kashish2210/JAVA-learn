import java.util.*;

public class multiLinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        int[] marks = {12, 34, 56, 23, 98, 78, 87, 98};

        boolean found = false;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == key) {
                System.out.println("Found at index " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Not found");
        }
    }
}
