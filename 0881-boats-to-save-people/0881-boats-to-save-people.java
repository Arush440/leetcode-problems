class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int p1 = 0;
        int p2 = people.length-1,ans=0;
        while(p1<=p2){
            int t = people[p1]+people[p2];
            if(t<=limit){
                p1++;
                p2--;
            }
            else{
                p2--;
            }
            ans++;
        }
        return ans;
    }
}