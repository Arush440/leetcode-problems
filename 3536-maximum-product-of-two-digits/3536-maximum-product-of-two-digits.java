class Solution {
    public int maxProduct(int n) {
        int max=0;
        int smax=0;
        while(n>0){
            int x=n%10;
            if(x>=max){
                smax=max;
                max=x;
            }
            else if(x>smax) smax=x;
            n/=10;
        }
        return max*smax;

    }
}