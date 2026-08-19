class Solution {
    public String longestPalindrome(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub=s.substring(i,j+1);
                if(isPalindrome(sub)&&sub.length()>ans.length()) ans=sub;
            }
        }
        return ans;
    }
    public boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        boolean pal=true;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                pal=false;
                break;
            }
            else{
                i++;
                j--;
            }
        }
        return pal;
    }
}