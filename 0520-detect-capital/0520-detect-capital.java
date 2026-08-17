class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length() <= 1) return true;
        boolean capital = true;
        boolean small = true;
        boolean good = true;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)<97) small=false;
            if (word.charAt(i) >= 97) capital = false;
            if (i != 0 && word.charAt(i) < 97) good = false;
        }
        return capital||small||good;
    }
}