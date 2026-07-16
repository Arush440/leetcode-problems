class Solution {
    public int minMoves(int[] nums) {
      int largest=0;
      for(int curr:nums){
        largest=Math.max(largest,curr);
      }
      int ans=0;
      for(int ele:nums){
        ans+=largest-ele;
      }  
      return ans;
    }
}