class Solution {
    public String convertToTitle(int columnNumber) {
    String s="";
        while(columnNumber>0){
            columnNumber--;
            s=(char)((columnNumber)%26+'A')+s;
            columnNumber/=26;
        }
        return s;
    } 
}
