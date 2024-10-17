class Solution {
    public int maximumGap(int[] nums) {
        int x = nums.length;
        if (x < 2) return 0; 
        Arrays.sort(nums); 
        int max = 0;
        for (int i = 0; i < x - 1; i++) {
            int c = nums[i + 1] - nums[i];
            if (c > max) {
                max = c;
            }
        }
        return max;
    }
}
