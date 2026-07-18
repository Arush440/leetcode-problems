class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxcount = 0;

        for (String s : sentences) {
            maxcount = Math.max(maxcount, s.split(" ").length);
        }

        return maxcount;
    }
}