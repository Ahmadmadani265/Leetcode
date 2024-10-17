class Solution {
    public int removeDuplicates(int[] nums) {
          Arrays.sort(nums);
        int sum = 0;
        int c = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                c++;
                if (c< 2) {
                    arr.add(nums[i]);
                    sum++;
                }
            } else {
                arr.add(nums[i]);
                sum++;
                c = 0;
            }
        }
        for (int i = 0; i < sum; i++) {
            nums[i] = arr.get(i);
        }
        
        return sum;
    }
}
