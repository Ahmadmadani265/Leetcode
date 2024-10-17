class Solution {
    public int jump(int[] nums) {
        int size = nums.length;
        if (size <= 1) return 0;
        int j= 0; 
        int c = 0; 
        int a= 0; 
        for (int i = 0; i < size - 1; i++) {
            a= Math.max(a, i + nums[i]);
            if (i == c) {
                j++; 
                c= a; 
                if (c>= size - 1) break;
            }
        }
        return j;
    }
}
