class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> list=new  ArrayList<>();
        for (int i = 0; i <numRows; i++) {
            List<Integer>a=new ArrayList<>();
            for (int j = 0; j <=i; j++) {
                if(j==0||j==i){
                    a.add(1);
                }
                else{
                    a.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
                }
            }
            list.add(a);
        }
         return list;
    }
}
