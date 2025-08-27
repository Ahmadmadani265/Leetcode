class Solution {
    public List<List<Integer>> fourSum(int[] v, int t) {
        List<List<Integer>> s = new ArrayList();
        Arrays.sort(v);
        for (int i = 0; i < v.length - 3; i++) {
            if (i > 0 && v[i] == v[i - 1]) continue; 
            for (int j = i + 1; j < v.length - 2; j++) {
                if (j > i + 1 && v[j] == v[j - 1]) continue; 
                int l = j + 1, r = v.length - 1;
                while (l < r) {
                    long sum = (long) v[i] + v[j] + v[l] + v[r];
                    if (sum == t) {
                        List<Integer> s1 = new ArrayList();
                        s1.add(v[i]);
                        s1.add(v[j]);
                        s1.add(v[l]);
                        s1.add(v[r]);
                        s.add(s1);
                        l++;
                        r--;
                        while (l < r && v[l] == v[l - 1]) l++;
                        while (l < r && v[r] == v[r + 1]) r--;
                    } else if (sum < t) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }
        }
        return s;
    }
}
