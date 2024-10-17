class Solution {
    public int searchInsert(int[] nums, int target) {
        int x=nums.length;
         for (int i = 0; i <x; i++) {
            if(nums[i]==target){
                return i;
            }
            
        }
        for (int i =0; i <x; i++) {
             if(nums[x-1]<target){
                return x;
            }
             else if(nums[i]<target&&nums[i+1]>target){
                return i+1;
            }
            else if(nums[0]>target){
                return 0;
            }
           
        }
        return 0;
    }
}
