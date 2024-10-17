class Solution {
    public String reverseWords(String s) {
       String[] arr = s.trim().split(" "); 
        StringBuilder ss = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            if(!arr[i].isEmpty()){
            ss.append(arr[i]);
            if (i > 0) {
                ss.append(" ");
            }}
        }
        return ss.toString();
    }
}
