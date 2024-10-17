class Solution {
    public int maxSubArray(int[] nums) {
       int sum = nums[0];
        int x = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i], sum+ nums[i]);
            if (sum >x) {
                x = sum;
            }
        }

        return x;
    }
}
