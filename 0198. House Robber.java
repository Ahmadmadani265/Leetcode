class Solution {
    public int rob(int[] nums) {
 int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);
        int[] arr= new int[n];
        arr[0] = nums[0];
        arr[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
           arr[i] = Math.max(arr[i - 1], arr[i - 2] + nums[i]);
        }
        return arr[n - 1];
    }
}
