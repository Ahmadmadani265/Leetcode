class Solution {
public:
    bool isPalindrome(int x) {
         long long y=x,n=x,c=0;
         long long sum=0;
    while(y!=0){
       y=y/10;
       c++;
   }
     for(int i=0;i<c;i++){
       int d=x%10;
       sum=(sum*10)+d;
       x=x/10;
   }
   if(sum!=n||sum<0){
       return false;
   }
   else{
       return true;
   }
    }
};
