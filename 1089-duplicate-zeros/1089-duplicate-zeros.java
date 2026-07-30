class Solution {
    public void duplicateZeros(int[] arr) {
        int [] ans=new int[arr.length];
        int k=0;
        int i=0;
        while(k<arr.length){
            if(arr[i]==0){
                ans[k++]=0;
                if (k < arr.length) {
                    ans[k++] = 0;
                }
                i++;
            }
            else ans[k++]=arr[i++];
        }
        for(i=0;i<arr.length;i++){
            arr[i]=ans[i];
        }
    }
}