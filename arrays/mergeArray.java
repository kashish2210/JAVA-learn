class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int index = 0;
       int[] merged = new int[nums1.length + nums2.length];
       for(int i =0 ; i < nums1.length;i++ ){
        merged[index++] = nums1[i];
       } 
       for(int j =0 ; j < nums2.length;j++ ){
        merged[index++] = nums2[j];
       } 
       for(int = 0 ; i < merged.length; i++){
       System.out.print(merged[i]);
       }
    }
}