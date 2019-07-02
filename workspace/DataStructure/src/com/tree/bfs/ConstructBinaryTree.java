package com.tree.bfs;
import com.tree.Node;
public class ConstructBinaryTree {
     Node root;
     static int  preIndex=0;
     Node buildTree(int in[],int pre[],int inStrt,int inEnd)
     {
    	 if(inStrt>inEnd)
    		 return null;
    	 Node tNode=new Node(pre[preIndex++]);
    	 if(inStrt==inEnd)
    		return tNode;
    	 int inIndex = search(in, inStrt, inEnd, tNode.data); 
    	 tNode.left=buildTree(in,pre,inStrt,inIndex-1);
    	 tNode.right=buildTree(in,pre,inIndex+1,inEnd);
    	 return tNode;
         
     }
     int search(int arr[],int strt,int end,int value)
     {
    	 int i;
    	 for(i=strt;i<=end;i++)
    	 {
    		 if(arr[i]==value)
    			 return i;			 
    	 }
    	 return i;
     }
     void printInOrder(Node node)
     {
    	 if(node==null)
    	      return;
    	 printInOrder(node.left);
         System.out.print(node.data+" "); 
         printInOrder(node.right);
     }
     void printPreOrder(Node node)
     {
    	 if(node==null)
    		 return;
    	 System.out.print(node.data+" ");
    	 printPreOrder(node.left);
    	 printPreOrder(node.right);
     }
     void printPostOrder(Node node)
     {
    	 if(node ==null)
    		 return;
    	  printPostOrder(node.left);
    	  printPostOrder(node.right);
    	  System.out.print(node.data+" ");
     }
     public static void main(String[] args) {
    	 ConstructBinaryTree tree=new ConstructBinaryTree();
    	 int [] inOrder = {2,1,3};
 		int [] preOrder = {1,2,3};
 		int len=inOrder.length;
 		Node root=tree.buildTree(inOrder, preOrder, 0, len-1);
 		System.out.println("InOrder");
 		tree.printInOrder(root);
 		System.out.println("\nPost Order");
 		tree.printPostOrder(root);
 		System.out.println("\nPre Order");
 		tree.printPreOrder(root);
	}
}
