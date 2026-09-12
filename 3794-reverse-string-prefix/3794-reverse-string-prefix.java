class Solution {
    public String reversePrefix(String s, int k) {
      String reverse=s.substring(0,k);
      String reversed="";
      for(int i=k-1;i>=0;i--){
        reversed=reversed+reverse.charAt(i);
      }
      String secondpart=s.substring(k);
      String ans=reversed+secondpart;
      return ans;
    }
}