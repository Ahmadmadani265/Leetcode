class Solution {
    public int removeElement(int[] nums, int val) {
        //Arrays.sort(nums);
        if (nums.length ==0) return 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
