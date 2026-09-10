class Solution {
    public String largestGoodInteger(String s) {
     char good=0;
     for(int i=0;i<s.length();i++){
        if(i>1 && s.charAt(i)==s.charAt(i-1) &&s.charAt(i)==s.charAt(i-2)&& good<s.charAt(i)){
            good=s.charAt(i);
        }
     }
     if(good==0) return "";
     else return ""+good+good+good;
    }
}