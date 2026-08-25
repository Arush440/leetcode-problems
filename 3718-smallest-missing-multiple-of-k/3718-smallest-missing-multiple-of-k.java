class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int ans=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==(ans*k)){
                ans++;
            }
        }
        return ans*k;
    }
}