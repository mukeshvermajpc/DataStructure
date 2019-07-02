package com.tree.bfs;
public class BinaryTreeMax {
   Node root;
   int findMax(Node node)
   {
	   if(node==null)
		   return Integer.MIN_VALUE;
	   int res=node.data;
	   int lres=findMax(node.left);
	   int rres=findMax(node.right);
	   if(lres>res)
		   res=lres;
	   if(rres>res)
		   res=rres;
	   return res;
   }
   public static void main(String[] args) {
	BinaryTreeMax tree=new BinaryTreeMax();
	tree.root=new Node(121);
	tree.root.left=new Node(120);
	tree.root.right=new Node(23);
	tree.root.left.left=new Node(12);
	tree.root.left.right=new Node(240);
	System.out.println("Maximum element of tree is");
	System.out.println(tree.findMax(tree.root));
}
}
