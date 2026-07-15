class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        int[] row = new int[n+1];
        int[] col = new int[n+1];
        for(int i = 0;i < n;i++){
            for(int j = 0;j< n;j++){
                row[matrix[i][j]]++;
                if(row[matrix[i][j]] > i+1){
                    return false;
                }
                col[matrix[j][i]]++;
                if(col[matrix[j][i]] > i+1){
                    return false;
                }
            }
        } 
        return true;
    }
}