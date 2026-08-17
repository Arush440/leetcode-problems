class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;  
        int right = Arrays.stream(piles).max().getAsInt();
        if(h==piles.length) return right;
        int ans = right;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(finish(piles,h,mid)){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
    public boolean finish(int[] piles,int h,int mid){
        long hours=0;
        for(int pile:piles){
            hours+=pile/mid;
            if(pile%mid!=0) hours++;
        }
        return hours<=h;
    }
}