class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3) return false;
        int left=0;
        int right=arr.length -1;
        while(left<arr.length-1){
            if(arr[left]<arr[left+1]) left++;
            else break;
        }
        if(left==arr.length-1 ||left==0) return false; 
        while(right>left){
            if(arr[right]<arr[right-1]) right--;
            else return false;
        }
        return true;
    }
}