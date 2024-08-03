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
    private TreeNode first = null;
    private TreeNode second = null;
    private TreeNode prev = null;
    
    public void recoverTree(TreeNode root) {
       inorder(root);
        
        int tmp = first.val;
        first.val = second.val;
        second.val = tmp;
        
    }
    
    private void inorder(TreeNode root) {
        if(root == null) return;
        
        inorder(root.left);
        
        if(prev != null && root.val < prev.val) {
            if(first == null) {
                first = prev;
            }
            second = root;
        }
        
        prev = root;
        
        inorder(root.right);
    }
    
    
}