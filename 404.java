class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        int s = 0;
        if (root.left != null) {
            if (root.left.left == null && root.left.right == null)
                s += root.left.val;
            else s += sumOfLeftLeaves(root.left);
        }
        return s + sumOfLeftLeaves(root.right);
    }
}
