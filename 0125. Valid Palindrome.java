class Solution {
    public boolean isPalindrome(String s) {
         int x=s.length();
      s=s.toLowerCase();
      String ss="";
        for (int i = 0; i <x; i++) {
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='0'&&s.charAt(i)<='9'){
                ss+=s.charAt(i);
            }
        }
        int index=ss.length()-1;
        for (int i = 0; i <ss.length()/2; i++) {
            if(ss.charAt(index)!=ss.charAt(i)){
                return false;
            
            }
            index--;
        }
        
        return true;
    }
}
