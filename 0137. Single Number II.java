class Solution {
    public int singleNumber(int[] nums) {
        int x=nums.length;
        int c=0;
        for (int i = 0; i <x; i++) {
            c=0;
            for (int j = 0; j <x; j++) {
                if(nums[i]==nums[j]){
                    c++;
                }
            }
            if(c==1){
               return nums[i];
            }
        }
        return 0 ;
    }
}
