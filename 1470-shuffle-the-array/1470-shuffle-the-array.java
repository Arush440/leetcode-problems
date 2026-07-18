class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int left = 0;
        int right = n;
        int index = 0;
        while (left < n) {
            ans[index++] = nums[left++];
            ans[index++] = nums[right++];
        }
        return ans;
    }
}