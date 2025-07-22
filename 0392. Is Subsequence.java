class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        int j = 0; 
        for (int i = 0; i < n; i++) {
            while (j < m && s.charAt(i)!= t.charAt(j)) {
                j++;
            }
            if (j == m) {
                return false;
            }
            j++; 
        }
        return true;
    }
}
