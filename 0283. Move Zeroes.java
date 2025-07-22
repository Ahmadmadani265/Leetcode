class Solution {
    public void moveZeroes(int[] nums) {
        int size=nums.length;
        int index=0;
        int res[]=new int[size];
        for(int i=0;i<size;i++){
            if(nums[i]>0||nums[i]<0){
                res[index]=nums[i];
                index++;
            }
        }
        for(int j=0;j<size;j++){
            nums[j]=res[j];
        }

        return ;
    }
}
