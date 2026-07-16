class Solution {
    public int minMoves(int[] nums) {
      Arrays.sort(nums);
      int largest=nums[nums.length-1];
      int ans=0;
      for(int ele:nums){
        ans+=largest-ele;
      }  
      return ans;
    }
}