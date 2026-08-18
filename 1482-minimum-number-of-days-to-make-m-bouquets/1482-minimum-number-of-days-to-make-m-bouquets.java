class Solution {
    public int minDays(int[] bloomday, int m, int k) {
        if((long)m*k>(long)bloomday.length) return -1;
        long left = 1;  
        long right = Arrays.stream(bloomday).max().getAsInt()+1;
        long ans=0;
        while(left<=right){
            long mid=left+(right-left)/2;
            if(istrue(bloomday,mid,m,k)){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return (int)ans;
    }
    public boolean istrue(int[] bloomday,long mid,int m,int k){
        int b=0;
        int max=0;
        for(int i=0;i<bloomday.length;i++){
            if(bloomday[i]<=mid){
                b++;
                continue;
            } 
            else{
                max+=b/k;
            }
            b=0;
        }
        max+=b/k;
        return max>=m;
    }
}