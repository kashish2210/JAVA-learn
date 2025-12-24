import java.util.*;

public class max_subarray_sum{
    public static void main(String args[]){
        int[] arr = {12,5,2,5,1,3};
        int ts =0;
        int n = arr.length;
        int totalSubarrays = n * (n + 1) / 2;
        int[] su = new int[totalSubarrays];
        int idx =0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int start= i;
            for(int j=i; j < arr.length;j++){
                int sum = 0;
                int end = j;
                for (int k = start ; k <= end; k++){
                    System.out.print(arr[k]+" ");
                    sum += arr[k];
                }
                ts++;
                System.out.print("sum is: "+sum);
                su[idx++]=sum;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total Subarray = "+ ts);
        System.out.println("length "+su.length);
        System.out.println(Arrays.toString(su));
        for (int i = 0; i < su.length; i++) {

            if (su[i] > largest) {
                largest = su[i];
            }

            if (su[i] < smallest) {
                smallest = su[i];
            }
        }

        System.out.println("Largest value is : " + largest);
        System.out.println("Smallest value is : " + smallest);

    }
}