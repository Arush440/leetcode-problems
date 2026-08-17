class Solution {
    public int trap(int[] height) {
        int p1=0;
        int p2=height.length-1;
        int ans=0;
        int leftmax=0;
        int rightmax=0;
        while(p1<p2){
            if(height[p1]<height[p2]){
                leftmax=Math.max(leftmax,height[p1]);
                ans+=leftmax-height[p1];
                p1++;
            }
            else{
                rightmax=Math.max(rightmax,height[p2]);
                ans+=rightmax-height[p2];
                p2--;
            }
        }
        return ans;
    }
}