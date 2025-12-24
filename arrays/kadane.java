public class kadane{
    public static void main(String ards[]){
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        int[] arr1 = {-1, -2,-12,-3,-4};
        int maxSum = Integer.MIN_VALUE;
        int cs =0;
        boolean allNegative = true;

        for (int i = 0; i < arr1.length ; i++) {
            if (arr1[i] >= 0) {
                allNegative = false;
                break;
            }
        }

        for(int i = 0; i < arr1.length ; i++){
            if(allNegative == false){
                cs = cs + arr1[i];
                if(cs < 0 ){
                    cs = 0;
                }
                maxSum = Math.max(cs,maxSum);
            } else {
                maxSum = arr1[0];
                if (arr1[i] > maxSum) {
                    maxSum = arr1[i];
                }
            }
        }
        System.out.println("max subarray sum : "+ maxSum);
    }
}