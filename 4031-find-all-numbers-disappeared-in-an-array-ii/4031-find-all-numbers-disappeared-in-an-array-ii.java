class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int count = lower;
        int start = lower;
        int i = 0;
        while (i < nums.length && count <= upper) {
            if(nums[i]<lower){
                i++;
                continue;
            }
            if(nums[i] == count){
                count++;
                i++;
            }
            else if(nums[i]>count) {
                start = count;
                while(count<nums[i] && count<=upper) {
                    count++;
                }
                ans.add(Arrays.asList(start,count - 1));
            }
            else{
                i++;
            }
        }
        if (count <= upper){
            ans.add(Arrays.asList(count, upper));
        }
        return ans;
    }
}