package Tree;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class BinaryTree {
    private class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    Scanner s= new Scanner(System.in);
    public BinaryTree(){
        root=createTree();
    }

    private Node createTree()
    {
        int item=s.nextInt();
        Node n = new Node();
        n.val=item;
        boolean hlc=s.nextBoolean();
        if(hlc)
            n.left=createTree();
        boolean hrc=s.nextBoolean();
        if(hrc)
            n.right=createTree();
        return n;
    }
    public void display(){
        display(root);
    }
    private void display(Node n)
    {
        if(n==null)
            return;
        String s="";
        s="<--"+s+n.val+"-->";
        if(n.left!=null)
            s=n.left.val+s;
        else
            s="."+s;
        if(n.right!=null)
            s=s+n.right.val;
        else
            s=s+".";
        System.out.println(s);
        display(n.left);
        display(n.right);
    }
    public void preorder()
    {
        preorder(root);
    }
    private void preorder(Node root)
    {
        if(root==null)
            return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public void postorder()
    {
        postorder(root);
    }
    private void postorder(Node root)
    {
        if(root==null)
            return;
            postorder(root.left);
            postorder(root.right);
        System.out.print(root.val+" ");
    }
    public void inorder()
    {
        inorder(root);
    }
    private void inorder(Node root)
    {
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);

    }
    public boolean search(int item)
    {
        return search(root,item);
    }
    private boolean search(Node root,int item)
    {
        if(root==null) // == is use to check the address
            return false;
        if(root.val==item)
            return true;
        boolean l=search(root.left,item);
        boolean r=search(root.right,item);
        return l||r;
    }

    public int Max()
    {
        return Max(root);
    }
    private int Max(Node root)
    {
        if(root==null)
            return Integer.MIN_VALUE;
        int left=Max(root.left);
        int right=Max(root.right);

        return Math.max(left,Math.max(right,root.val));
    }

    public int height(){
        return  height(root);
    }
    private int height(Node root)
    {
        if(root==null)
            return -1;   //Assuming node as a 0
        int left = height(root.left)+1;
        int right=height(root.right)+1;

        return Math.max(left,right);
    }
    public void right(){
        rightView(root);
    }
    public void rightView(Node root)
    {
        if(root==null)
            return;
        if(root.right!=null)
        {
            System.out.println(root.right);
            rightView(root.right);
        }
    }
}

//top view bottom view vertical view lazer light view