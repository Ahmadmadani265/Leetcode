class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size=nums1.length;
        int size1=nums2.length;
        int size2=size+size1;
        int index=0;
        double sum=0.0;
        double x=0.0;
        int res[]=new int[size2];
        for(int i=0;i<size;i++){
            res[index]=nums1[i];
            index++;
        }
        for(int j=0;j<size1;j++){
            res[index]=nums2[j];
            index++;
        }
        Arrays.sort(res);
        System.out.println(Arrays.toString(res));
        if(size2%2==0){
            for (int i = 0; i <size2; i++) {
                if(i==size2/2){
                sum=res[i]+res[i-1];
                return sum/2;}}}
        if(size2%2!=0){
            for (int j = 0; j <size2; j++) {
               if(j==size2/2){
            sum=res[j];
            x=sum;
                
        }}}
      return x;  
    }
}
