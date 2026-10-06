class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        while(row<matrix.length){
            int left=0;
            int right=matrix[row].length-1;
            while(left<=right){
                int mid=left+(right-left)/2;
                if(matrix[row][mid]==target) return true;
                else if(matrix[row][mid]<target) left = mid + 1;
                else right = mid - 1;
            }
            row++;
        }
        return false;
    }
}