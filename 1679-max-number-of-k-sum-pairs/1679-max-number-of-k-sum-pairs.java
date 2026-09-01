class Solution {
    public int maxOperations(int[] nums, int k) {
        int res = 0;
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        while(i < j){
            int s = nums[i] + nums[j];
            if(s == k){
                res++;
                i++;
                j--;
            } else if(s > k){
                j--;
            } else {
                i++;
            }
        }
        return res;
    }
}