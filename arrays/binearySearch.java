import java.util.*;

public class binearySearch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int marks[] = {12,34,56,23,98,78,87,98};
        Arrays.sort(marks);
        int low = 0;
        int high = marks.length -1;
        boolean found = false;
        while(low <= high){
            int mid = (low + high) / 2;
            if(marks[mid]==key){
                System.out.println("found at : "+mid);
                found = true;
            }
            if(marks[mid] < key){
                low = mid + 1;
                found = true;
            }else{
                high = mid -1;
                found = true;
            }

        }
        if (!found) {
            System.out.println("Not found");
        }
    }
}