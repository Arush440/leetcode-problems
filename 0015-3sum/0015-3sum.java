class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;int right=n-1;
            int total=0;
            while (left<right){
                total=nums[left]+nums[i]+nums[right];
                if(total>0){
                    right--;
                }
                else if(total<0){
                    left++;
                }
                else{
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left<right && nums[left]==nums[left-1]){
                        left++;
                    }
                    while (left<right && nums[right]==nums[right+1]){
                        right--;
                    }
                }
            }
        }
        return res;
    }
}