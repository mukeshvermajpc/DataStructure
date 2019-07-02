package com.tree.bfs;
public class BinaryTreeMin {
   Node root;
 /*  BinaryTreeMin()
   {
	   root=null;
   }*/
   int findMin(Node root)
   {
	   if(root==null)
		   return Integer.MAX_VALUE;
	   int res=root.data;
	   //System.out.println(root.data);
	   int lres=findMin(root.left);
	   int rres=findMin(root.right);
	   if(lres<res)
		   res=lres;
	   if(rres<res)
		   res=rres;
	   return res;
   }
   public static void main(String args[])
   {
	   BinaryTreeMin tree=new BinaryTreeMin();
	   tree.root=new Node(12);
	   tree.root.left=new Node(10);
	   tree.root.right=new Node(19);
	   System.out.println("Minimum element of the tree ");
	   System.out.println(tree.findMin(tree.root));
   }
}
