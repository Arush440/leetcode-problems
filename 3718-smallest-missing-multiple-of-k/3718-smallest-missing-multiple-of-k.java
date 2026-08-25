class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> hash = new HashSet<>();
        for(int num : nums) {
            hash.add(num);
        }
        int multiple = k;
        while(hash.contains(multiple)) {
            multiple = multiple + k;
        }
        return multiple;
    }
}