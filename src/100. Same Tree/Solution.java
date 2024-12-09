// Class definition of a tree node
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
 public class Solution {
    public boolean isSameTree(TreeNode root1, TreeNode root2) {
            // trees differ in structure
            if (root1 == null ^ root2 == null) {
                return false;
            } else {
                // both are null or a single node is a member of both trees   
                return (root1 == root2) || 
                // recursive call
                (root1.val == root2.val && isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right));
            }
    }
}

