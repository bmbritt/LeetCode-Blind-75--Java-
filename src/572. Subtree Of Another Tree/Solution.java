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


        if (root1 == null ^ root2 == null) {
            return false;
        }


        if (root1.isLeaf() ^ root2.isLeaf()) {
            return false;
        }
        
         if (root1.isLeaf() && root2.isLeaf()) {
            return root1.val == root2.val;
        } else {
            return root1.val == root2.val && treesEqual(root1.left, root2.left) && treesEqual(root1.right, root2.right);
        }
    }

   


}