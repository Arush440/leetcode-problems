class Solution {
    public int largestInteger(int n, int s) {
        int digit=0;
        int ans=0;
        if(s>9*n) return -1;
        for(int i=0;i<n;i++){
            digit=Math.min(s,9);
            ans=ans*10+digit;
            s-=digit;
        }
        return ans;
    }
}