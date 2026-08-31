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
class Solution {
    int count=0;
    public int goodNodes(TreeNode root) {
        int max = root.val;
        countgoodnodes(root,max);
        return count;
    }
    public void countgoodnodes(TreeNode root, int max){
        //int count=0;
        if(root!=null){
            if(max<=root.val){
                max=root.val;
                count++;
            }
            countgoodnodes(root.left,max);
            countgoodnodes(root.right,max);
        }
    }
}