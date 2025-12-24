import java.util.*;

public class subarraySum{
    public static void main(String args[]){
        int[] arr = {12,5,2,5,1,3};
        int ts =0;
        for(int i=0;i<arr.length;i++){
            int start= i;
            for(int j=i; j < arr.length;j++){
                int sum = 0;
                int end = j;
                for (int k = start ; k <= end; k++){
                    System.out.print(arr[k]+" ");
                    sum += arr[k];
                    // return sum;
                }
                ts++;
                System.out.print("sum is: "+sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total Subarray = "+ ts);
    }
}