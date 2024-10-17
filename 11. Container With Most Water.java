class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maximam = 0; 
        while(left<right){
            int width=right-left;
            int height1=Math.min(height[left],height[right]);
            maximam=Math.max((width*height1),maximam);
             if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maximam;
    }
}
