class Solution {
    public int titleToNumber(String columnTitle) {
        int sum= 0;
        int n=columnTitle.length();
        for (int i = 0; i <n; i++) {
            char c = columnTitle.charAt(i);
            int a= c -'A'+ 1; 
            sum= sum* 26 +a; 
        }
        
        return sum;
    }
}
