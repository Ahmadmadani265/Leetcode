class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int sum = 0;
        int[] arr = {-1, -1};
        int n = numbers.length;
        int right = n - 1;
        for (int i = 0; i < n; i++) {
            sum = numbers[i] + numbers[right];
            if (sum > target) {
                right--;
                i--;
            }
            if (sum == target) {
                arr[0] = i + 1; 
                arr[1] = right + 1; 
                break;
            }
        }
        return arr;
    }
}
