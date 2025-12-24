import java.util.*;

public class prefixSum{
    public static void main(String args[]){
        int[] arr = {1,-2,6,-1,3};
        int maxSum = Integer.MIN_VALUE;
        int[] prefix = new int[arr.length];
        prefix[0]= arr[0];
        for(int i = 1 ; i <prefix.length ; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int start= i;
            int currentSum =0;
            for(int j=i; j < arr.length;j++){
                int end = j;
                currentSum = start ==0 ? prefix[end] : prefix[end] - prefix[start];
                if(maxSum < currentSum){
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("maximum sum of sub array = "+ maxSum);
    }
}