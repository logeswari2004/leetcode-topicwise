class Solution {

    private int maxLength = 0;

    public int longestZigZag(TreeNode root) {

        if (root == null) {
            return 0;
        }

        dfs(root.left, true, 1);
        dfs(root.right, false, 1);

        return maxLength;
    }

    private void dfs(TreeNode node,
                     boolean cameFromLeft,
                     int length) {

        if (node == null) {
            return;
        }

        maxLength = Math.max(maxLength, length);

        if (cameFromLeft) {

            // continue zigzag
            dfs(node.right, false, length + 1);

            // restart
            dfs(node.left, true, 1);

        } else {

            // continue zigzag
            dfs(node.left, true, length + 1);

            // restart
            dfs(node.right, false, 1);
        }
    }
}