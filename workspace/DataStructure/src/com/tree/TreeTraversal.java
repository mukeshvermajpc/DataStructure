package com.tree;
import java.util.Stack;
public class TreeTraversal {
   Node root,left,right;
   void inorder()
   {
	   if(root==null)
		   return;
	   Stack<Node>s=new Stack<>();
	   Node curr=root;
	   while(curr!=null || s.size()>0)
	   {
		   while(curr!=null)
		   {
			   s.push(curr);
			   curr=curr.left;
		   }
		   curr=s.pop();
		   System.out.print(curr.data+" ");
		   curr=curr.right;
	   }
   }
   void preOrder()
   {
	   Stack<Node>st=new Stack<>();
	   st.push(root);
	   while(!st.isEmpty())
	   {
		 Node current=st.pop();
		if(current.left!=null)
		{
			st.push(current.right);
		}
		if(current.right!=null)
		{
			st.push(current.left);
		}
		
		System.out.print(current.data+" ");
		
	   }
   }
   void postOrder()
   {
	   Stack<Node>st=new Stack<>();
	   st.push(root);
	   while(!st.isEmpty())
	   {
		 Node current=st.peek();
		 if(current.isLeaf())
		 {
			 Node node=st.pop();
			 System.out.print(node.data+" ");
		 }
		 else
		 {
			 if(current.right!=null)
			 {
				 st.push(current.right);
				 current.right=null;
			 }
			 if(current.left!=null)
			 {
				 st.push(current.left);
				 current.left=null;
			 }
		 }
	   } 
   }
   
   public static void main(String args[])
   {
	   TreeTraversal tree=new TreeTraversal();
	   tree.root=new Node(1);
	   tree.root.left=new Node(2);
	   tree.root.right=new Node(3);
	   tree.root.left.left=new Node(4);
	   tree.root.left.right=new Node(5);
	   System.out.println("Inorder traversal");
	   tree.inorder();
	   System.out.println("\nPreorder traversal");
	   tree.preOrder();  
	   System.out.print("\nPost order traversal\n");
	   tree.postOrder();
	   
   }
}
