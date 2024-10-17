class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
        for(int i=0;i<n;i++){
            int right=matrix[i].length-1;
			for(int j=0;j<n/2;j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][right];
				matrix[i][right] = temp;
                right--;
			}
		}

    }
}
