import java.util.*;

public class Largest_Smallest_num {
    public static void main(String args[]) {

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        int[] numbers = {12, 34, 56, 23, 98, 78, 87, 98};

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                largest = numbers[i];
            }

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("Largest value is : " + largest);
        System.out.println("Smallest value is : " + smallest);
    }
}
