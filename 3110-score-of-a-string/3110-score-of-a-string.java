class Solution {
    public int scoreOfString(String s) {
        int score=0;
        for(int i=0;i<s.length()-1;i++){
            char first=s.charAt(i);
            char second=s.charAt(i+1);
            score+=Math.abs(first-second);
        }
        return score;
    }
}