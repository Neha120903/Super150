package Tree;

public class DiameterOfBinaryTree {
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
//   public int height(TreeNode node)
//   {
//       if(node == null)
//           return -1;
//       int lh = height(node.left);
//       int rh= height(node.right);
//       return Math.max(lh,rh)+1;
//
//   }
//                                                                        O(n^2)
//
//   public int diameter(TreeNode root)
//   {
//       if(root==null)
//           return 0;
//       int ld= diameter(root.left);
//       int rd= diameter(root.right);
//       int sd= height(root.left) +height(root.right)+2;
//
//       return Math.max(ld,Math.max(rd,sd));
//   }

    class Pair{
        int ht=-1;
        int d=0;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).d;
    }
    public Pair diameter(TreeNode root)
    {
        if(root == null)
            return new Pair();
        Pair lp = diameter(root.left);          //this approach is of O(N) time complexity
        Pair rp= diameter(root.right);
        Pair sp = new Pair();

        int sd= lp.ht+rp.ht+2;
        sp.d= Math.max(lp.d,Math.max(rp.d, sd));
        sp.ht=Math.max(lp.ht,rp.ht)+1;
        return sp;
    }
}
