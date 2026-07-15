class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=0;
        int sumEven=0;
        for(int i=0;i<=2*n;i++){
            if(i%2==0){
                sumEven+=i;
            }
            else{
                sumOdd+=i;
            }
        }
        while(sumOdd!=0){
            int temp =sumOdd;
            sumOdd=sumEven%sumOdd;
            sumEven=temp;
        }
        return sumEven;

    }
}