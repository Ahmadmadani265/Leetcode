class Solution {
   public  int lengthOfLastWord(String s) {
        int x=s.length();
         int c=0;
        for (int i =x-1; i >=0; i--) {
            if(s.charAt(i)!=' '){
                c++;}
                if(s.charAt(i)!=' '&&(i!=0&&s.charAt(i-1)==' ')){
                    break;
                }
        }
      return c;
 }
}
