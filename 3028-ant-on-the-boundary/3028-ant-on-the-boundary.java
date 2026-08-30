class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int count=0;
        int pos=0;
        for(int ele:nums){
            pos+=ele;
            if(pos==0) count++;
        }
        return count;
    }
}