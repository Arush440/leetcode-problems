class Solution {
    public int[] closestPrimes(int left, int right) {
        int[] ans = {-1, -1};
        int prev = -1;
        int min = Integer.MAX_VALUE;

        for (int i = left; i <= right; i++) {
            if (prime(i)) {
                if (prev != -1 && i - prev < min) {
                    ans[0] = prev;
                    ans[1] = i;
                    min = i - prev;

                    if (min == 2) {
                        return ans;
                    }
                }
                prev = i;
            }
        }
        return ans;
    }
    private boolean prime(int num) {
        if (num < 2) return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}