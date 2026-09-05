class Solution {
    public List<Integer> findValidElements(int[] nums) {
        boolean[] check=new boolean[nums.length];
        int left=Integer.MIN_VALUE;
        int right=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>left){
                left=nums[i];
                check[i]=true;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>right){
                right=nums[i];
                check[i]=true;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(check[i]){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}