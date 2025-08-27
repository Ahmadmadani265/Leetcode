class Solution {
    public List<List<Integer>> threeSum(int[] v) {
        List<List<Integer>> s = new ArrayList();
        Arrays.sort(v);
        for (int i = 0; i < v.length - 2; i++) {
            int l = i + 1, r = v.length - 1;
            int num = v[i];
            while (l < r) {
                if (v[l] + v[r] + num == 0) {
                    List<Integer> s1 = new ArrayList();
                    s1.add(num);
                    s1.add(v[l]);
                    s1.add(v[r]);
                    s.add(s1);
                    l++;
                    r--;
                    while (l < r && v[l] == v[l - 1]) l++;
                    while (l < r && v[r] == v[r + 1]) r--;
                } else if (v[l] + v[r] + num > 0) {
                    r--;
                } else {
                    l++;
                }
            }

            while (i < v.length - 2 && v[i] == v[i + 1]) i++;
        }
        return s;
    }
}
