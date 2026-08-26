/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int [][] ans=new int[m][n];
        int top=0;
        int left=0;
        int right=n-1;
        int bottom=m-1;
        for(int[] row:ans){
            Arrays.fill(row,-1);
        }
        while(top <= bottom && left <= right && head != null){
            for(int i=left;i<=right && head != null;i++){
                    ans[top][i]=head.val;
                    head=head.next;
            }
            top++;
            if (top > bottom) break;
            for(int i=top;i<=bottom && head != null;i++){
                    ans[i][right]=head.val;
                    head=head.next;
            }
            right--;
            if(right<left) break;
            for(int i=right;i>=left && head != null;i--){
                    ans[bottom][i]=head.val;
                    head=head.next;
            }
            bottom--;
            if(bottom<top) break;
            for(int i=bottom;i>=top && head != null;i--){
                    ans[i][left]=head.val;
                    head=head.next;
            }
            left++;
        }
        return ans;
    }
}