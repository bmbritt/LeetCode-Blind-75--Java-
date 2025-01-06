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
}
 
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {     
        return (root == null) ? false : 
        (subRoot == null || isSameTree(root, subRoot) || 
        isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot));
    }

    // helper 
    public boolean isSameTree(TreeNode root1, TreeNode root2) {
        if (root1 == null ^ root2 == null) {
            return false;
        } else {
            return (root1 == root2) || 
            (root1.val == root2.val && isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right));
        }
    }
}