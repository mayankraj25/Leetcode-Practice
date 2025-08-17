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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return isSymmetric(root.left,root.right);
    }

    private boolean isSymmetric(TreeNode rootLeft,TreeNode rootRight){
        if(rootLeft==null && rootRight==null) return true;
        else if(rootLeft==null || rootRight==null) return false;
        if(rootLeft.val!=rootRight.val) return false;
        if(!isSymmetric(rootLeft.left,rootRight.right)) return false;
        if(!isSymmetric(rootRight.left,rootLeft.right)) return false;

        return true;
    }
}
