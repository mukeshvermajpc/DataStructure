package com.tree.bst;
public class BinaryInsert {
 Node root;
 BinaryInsert()
 {
	 root=null;
 }
 void insert(int key)
 {
	root=insertRec(root,key); 
 }
 Node insertRec(Node root,int key)
 {
	 if(root==null)
	 {
		 root=new Node(key);
		 return root;
	 }
	 if(key<root.key)
	 {
		root.left=insertRec(root.left,key);
	 }
	 else if(key>root.key)
	 {
		root.right=insertRec(root.right,key);
	 }
   return root;
 }
 void inorder()
 {
	 inorderRec(root);
 }
 void inorderRec(Node root)
 {
	  if(root!=null)
	 {
	    inorderRec(root.left);
	    System.out.print(root.key+" ");
	    inorderRec(root.right);
	 }
 }
 public static void main(String args[])
 {
	 BinaryInsert bst=new BinaryInsert();
	 bst.insert(50);
	 bst.insert(30);
	 bst.insert(20);
	 bst.insert(40);
	 bst.insert(70);
	 bst.insert(60);
	 bst.insert(80);
	 bst.inorder();
 }
}
