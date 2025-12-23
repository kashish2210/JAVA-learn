import java.util.*;

public class reverse{
    public static void reverse(int numbers[]){
        int first = 0 , last = numbers.length - 1;
        while( first < last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int arr[] = {4,47,35,65,2,82,4,51,1,10};
        Arrays.sort(arr);
        reverse(arr);
        for(int i = 0 ; i < arr.length;i++){
            System.out.print(arr[i]  +" ");
        }

    }
}