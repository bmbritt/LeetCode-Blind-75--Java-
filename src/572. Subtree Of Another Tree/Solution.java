//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public boolean isLeaf() {
        return this.left == null && this.right == null;
    }


}
 
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
       return false;
    }

    private boolean treesEqual(TreeNode root1, TreeNode root2) {
        return false;
    }

   


}