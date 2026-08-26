class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        // int left=0;
        // int ones=0;
        // String ans="";
        // for(int right=0;right<s.length();right++){
        //     if(s.charAt(right)=='1') ones++;
        //     if(ones>k){
        //         if(s.charAt(right)=='1') ones--;
        //         left++;
        //     }
        //     if(ones==k){
        //         while(left<right && s.charAt(left)=='0'){
        //             left++;
        //         }
        //         String sub=s.substring(left,right+1);
        //         if(ans.isEmpty() || sub.length()<ans.length()){
        //             ans=sub;
        //         }
        //     }
        // }
        // return ans;
         List<Integer> pos = new ArrayList<>();
         String ans="";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                pos.add(i);
            }
        }
        if (pos.size() < k)
            return ans;
        for (int i = 0; i + k - 1 < pos.size(); i++) {
            int start = pos.get(i);
            int end = pos.get(i + k - 1);
            String cur = s.substring(start, end + 1);
            if (ans.isEmpty() ||
                cur.length() < ans.length() ||
                (cur.length() == ans.length() && cur.compareTo(ans) < 0)) {
                ans = cur;
            }
        }
        return ans;
    }
}