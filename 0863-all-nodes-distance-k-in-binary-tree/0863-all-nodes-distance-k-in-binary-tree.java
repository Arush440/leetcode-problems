/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        Map<TreeNode, TreeNode> parent = new HashMap<>();

        // Store parent of every node
        makeParent(root, null, parent);

        Queue<TreeNode> q = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();

        q.offer(target);
        visited.add(target);

        int distance = 0;

        while (!q.isEmpty()) {

            if (distance == k) {
                List<Integer> ans = new ArrayList<>();

                while (!q.isEmpty()) {
                    ans.add(q.poll().val);
                }

                return ans;
            }

            int size = q.size();

            for (int i = 0; i < size; i++) {

                TreeNode curr = q.poll();

                // left
                if (curr.left != null && !visited.contains(curr.left)) {
                    q.offer(curr.left);
                    visited.add(curr.left);
                }

                // right
                if (curr.right != null && !visited.contains(curr.right)) {
                    q.offer(curr.right);
                    visited.add(curr.right);
                }

                // parent
                if (parent.containsKey(curr)) {
                    TreeNode p = parent.get(curr);

                    if (p != null && !visited.contains(p)) {
                        q.offer(p);
                        visited.add(p);
                    }
                }
            }

            distance++;
        }

        return new ArrayList<>();
    }

    void makeParent(TreeNode node, TreeNode p,
                    Map<TreeNode, TreeNode> parent) {

        if (node == null)
            return;

        parent.put(node, p);

        makeParent(node.left, node, parent);
        makeParent(node.right, node, parent);
    }
}