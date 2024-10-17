class Solution {
public:
    int mySqrt(int x) {
       long long  a=1;
while (true){
    if(x<(a*a)){
        return a-1;
        //break;
    }
    else if(x==(a*a)){
        return a;
       // break;
    }
    else{
        a++;
    }
    
} 
    }
};
