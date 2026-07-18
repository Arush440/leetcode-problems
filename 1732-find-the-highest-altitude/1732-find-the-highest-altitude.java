class Solution {
    public int largestAltitude(int[] gain) {
      int highest=0;
      int curr=0;
      for (int altitude : gain) {
        curr += altitude;
        highest=Math.max(highest,curr);
      }  
      return highest;
    }
}