class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int right=0;
        int max=0;
        for(int i=0;i<weights.length;i++) {
            right+=weights[i];
            if(max<weights[i]) max=weights[i];
        }
        int left=max;
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;

            if(cantake(weights,days,mid)){
                ans=Math.max(max,mid);
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
    public boolean cantake(int[] weights,int days,int mid){
        int indx=0;
        for(int i=0;i<days && indx<weights.length;i++ ){
            int currload=0;
            while(indx<weights.length && currload+weights[indx]<=mid){
                currload+=weights[indx++];
            }
        }
        return indx==weights.length;
    }

}