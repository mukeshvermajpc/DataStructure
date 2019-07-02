package com.tree.bfs;
import java.util.Stack;
public class BinaryStack {
   Node root;
   BinaryStack()
   {
	   root=null;
   }
   void inorder()
   {
	   if(root==null)
		   return;
	   Stack<Node>stack=new Stack<Node>();
	   Node curr=root;
	   while(curr!=null || stack.size()>0)
	   {
		   while(curr!=null)
		   {
			   stack.push(curr);
			   curr=curr.left;
		   }
		   curr=stack.pop();
		   System.out.print(curr.data+" ");
		   curr=curr.right;
	   }
   }
   public static void main(String args[])
   {
	   BinaryStack tree=new BinaryStack();
       tree.root=new Node(10);
       tree.root.left=new Node(11);
       tree.root.right=new Node(12);
/*       tree.root.left.left=new Node(13);
       tree.root.left.right=new Node(14);*/
       tree.inorder();
   }
}
