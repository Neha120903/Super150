package Tree;

public class isBalanced {
    public class TreeNode {
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

    public boolean isBalanced(TreeNode root)
    {
        boolean l = isBalanced(root.left);
        boolean r= isBalanced(root.right);
        boolean isbal=Math.abs(height(root.left) - height(root.right)) <=1;
        return l&&r&&isbal;
    }

    public int height(TreeNode node)
   {
       if(node == null)
           return -1;
       int lh = height(node.left);
       int rh= height(node.right);
       return Math.max(lh,rh)+1;

   }
}
