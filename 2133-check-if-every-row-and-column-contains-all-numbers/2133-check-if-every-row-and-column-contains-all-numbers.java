class Solution {
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            int [] row=new int[n+1] ;
            int k=1;
            for(int j=0;j<n;j++){
                row[matrix[i][j]]+=1;
            }
            while(k<=n){
                if(row[k]!=1){
                    return false;
                }
                else{
                    k++;
                }
            }
        }
        for(int i=0;i<n;i++){
            int[] col=new int[n+1];
            int k=1;
            for(int j=0;j<n;j++){
                col[matrix[j][i]]+=1;
            }
            while(k<=n){
                if(col[k]!=1){
                    return false;
                }
                else{
                    k++;
                }
            }
        }
        return true;

    }
}