import java.util.HashMap;
import java.util.Map;

class Solution {

    private int count = 0;
    private Map<Long, Integer> prefixMap = new HashMap<>();

    public int pathSum(TreeNode root, int targetSum) {

        prefixMap.put(0L, 1);

        dfs(root, 0L, targetSum);

        return count;
    }

    private void dfs(TreeNode node,
                     long currentSum,
                     int targetSum) {

        if (node == null) {
            return;
        }

        currentSum += node.val;

        count += prefixMap.getOrDefault(
                    currentSum - targetSum,
                    0);

        prefixMap.put(
            currentSum,
            prefixMap.getOrDefault(currentSum, 0) + 1
        );

        dfs(node.left, currentSum, targetSum);
        dfs(node.right, currentSum, targetSum);

        prefixMap.put(
            currentSum,
            prefixMap.get(currentSum) - 1
        );
    }
}