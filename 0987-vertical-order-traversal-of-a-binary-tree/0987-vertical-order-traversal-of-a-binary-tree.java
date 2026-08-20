/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 class Tuple {
    TreeNode node;
    int row;
    int col;

    Tuple(TreeNode node, int row, int col) {
        this.node = node;
        this.row = row;
        this.col = col;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<Tuple>();
        if (root != null) {
            q.offer(new Tuple(root, 0, 0)); 
            }
        while (!q.isEmpty()) {
            Tuple tuple = q.poll();
            TreeNode node = tuple.node;
            int r = tuple.row;
            int c = tuple.col;
            if (!map.containsKey(c)) {
                map.put(c, new TreeMap<>());
            }
            if (!map.get(c).containsKey(r)) {
                map.get(c).put(r, new PriorityQueue<>());
            }
            map.get(c).get(r).offer(node.val);
            if (node.left != null) {
                q.offer(new Tuple(node.left, r + 1, c - 1));
            }
            if (node.right != null) {
                q.offer(new Tuple(node.right, r + 1, c + 1));
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>> colMap : map.values()) {
            List<Integer> currentColumn = new ArrayList<>();
            for (PriorityQueue<Integer> pq : colMap.values()) {
                while (!pq.isEmpty()) {
                    currentColumn.add(pq.poll());
                }
            }
            result.add(currentColumn);
        }
        
        return result;
    }
}
