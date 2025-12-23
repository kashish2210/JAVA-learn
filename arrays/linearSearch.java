import java.util.*;

public class linearSearch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int marks[] = {12,34,56,23,98,78,87,98};
        for(int i =0 ; i < marks.length ; i++){
            if(marks[i]==key){
                System.out.println("your key is a the index"+i);
                return;
            }
        }
        System.out.println("not found");
    }
}