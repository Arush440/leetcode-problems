class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count=0;
        for(int ele: nums){
            while(ele>0){
                if(digit==ele%10) count++;
                ele=ele/10;
            }
        }
        return count;
    }
}