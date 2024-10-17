class Solution {
    public int findMin(int[] nums) {
       int n=nums.length;
        int left=0;
        int right=n-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]<nums[right]){
                right=mid;
            }
            else if(nums[mid]>nums[right]){
                left=mid+1;
            }
            else{
                left--;
            }
        }
        return nums[left];  
    }
}
