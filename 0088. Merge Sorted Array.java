class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x=nums2.length;
            for(int j=0;j<x;j++){
                nums1[m]=nums2[j];
                m++;
            }
            Arrays.sort(nums1);
   return ;
    }
}
