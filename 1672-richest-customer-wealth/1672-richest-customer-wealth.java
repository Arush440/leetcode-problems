class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int[] wealth:accounts){
            int curr=0;
            for(int i=0;i<wealth.length;i++){
                curr+=wealth[i];
            }
            max=Math.max(max,curr);
        }
        return max;
    }
}