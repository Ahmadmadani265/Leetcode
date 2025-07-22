class Solution {
    public long maximumTripletValue(int[] nums) {
        long max= 0; 
        long max1= 0;
        long c= 0;
        for (int num : nums) {
            max= Math.max(max, c * num);
            c = Math.max(c, max1 - num);
            max1 = Math.max(max1, num);
        }
        return max;
    }
}
