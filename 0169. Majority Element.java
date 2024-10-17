class Solution {
    public int majorityElement(int[] nums) {
    Arrays.sort(nums);
   int size=nums.length;
   int a=nums[size/2];
   return a;
    }
}
