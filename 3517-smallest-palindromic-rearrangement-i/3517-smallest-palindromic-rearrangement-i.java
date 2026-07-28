class Solution {
    public String smallestPalindrome(String s) {
       int []count =new int[26];
       char middle = 0;
       for(int i=0;i<s.length();i++){
        count[s.charAt(i)-'a']+=1;
       }
       StringBuilder ans = new StringBuilder();
       for(int i=0;i<26;i++){
        for(int j=0;j<count[i]/2;j++){
                ans.append((char)(i+97));
            }
        if(count[i]%2!=0) middle=(char)(i+97);
       }
       if(middle==0) return ans.toString()+ans.reverse().toString();
       else return ans.toString()+middle+ans.reverse().toString();
    }
}