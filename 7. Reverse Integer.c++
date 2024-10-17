class Solution {
public:
    int reverse(int x) {
       long long c=0,y=x;
       long long sum1=0;
       
   while(y!=0){
       y=y/10;
       c++;
   }
     for(int i=0;i<c;i++){
       long long d=x%10;
       sum1=(sum1*10)+d;
       x=x/10;
   }
   if(sum1>INT_MAX||sum1<INT_MIN)return 0;
     return sum1;  
    }
};
