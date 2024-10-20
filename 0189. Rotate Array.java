class Solution {
    static void rev(int arr[],int i,int k){
        int n=arr.length;
       while (i<k) {
            int temp = arr[k];
            arr[k] = arr[i];
            arr[i] = temp;
            i++;
            k--;
        } 
    }
   public void rotate(int[] nums, int k)  {
        int n = nums.length;
         k = k % n;
        int right = n - 1;
        int c = 0;
        rev(nums,0,n-1);
        rev(nums,0,k-1);
        rev(nums,k,n-1);

        return ;
    }
}
