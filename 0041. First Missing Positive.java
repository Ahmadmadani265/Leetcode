class Solution {
    public int firstMissingPositive(int[] nums) {
          int x=nums.length;
        Arrays.sort(nums);
        int c=1;
        for (int i = 0; i <x; i++) {
            if(nums[i]<=0|| (i!=0&&nums[i]==nums[i-1])){
                  continue;
            }
           if(nums[i]!=c){
                break;
            }
            c++;
        }
        if(nums[x-1]==c)return(nums[x-1]+1);
        else{ return(c);}

    }
}
