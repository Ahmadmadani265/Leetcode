class Solution {
    public int singleNumber(int[] nums) {
     int size=nums.length;
       int c=0,x=0;
        for (int i = 0; i <size; i++) {
            c=0;
            for (int j = 0; j <size; j++) {
               if(nums[i]==nums[j]){
                   c++;}}
               if(c==1){
                    x=nums[i];
               }
            
            
        }
    return x ;
}}
