class Solution {
public:
    int climbStairs(int n) {
          int a=1,b=1,temp;
       if(n==1){
           return n;}
       else{
           for(int i=2;i<=n;i++){
               temp=a+b;
               b=a;
               a=temp;}
           return temp;} 
    }
};
