class Solution {
    public int countCharacters(String[] words, String chars) {
        int n = words.length;
        int m = chars.length();
        int ans = 0;
        for(int i = 0; i < n; i++){
            HashMap<Character, Integer> map = new HashMap<>(); 
            for(int k = 0; k < m; k++){
                char ch = chars.charAt(k);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            int len = words[i].length();
            int count = 0;
            for(int j = 0; j < len; j++){
                if(map.containsKey(words[i].charAt(j)) && map.get(words[i].charAt(j)) > 0){
                    map.put(words[i].charAt(j),map.get(words[i].charAt(j)) - 1);
                    count++;
                }
            }
            if(count == len){
                ans += len;
            }
        }
        return ans;
    }
}