class Solution {
public:
    vector<int> getRow(int rowIndex) {
        vector<int> a(rowIndex+1, 1);
        for(int i=1;i<=rowIndex/2; i++){
            a[i]=a[rowIndex-i]=(long long)a[i-1]*(rowIndex-i+1)/i;
        }
        return a;
    }
};
