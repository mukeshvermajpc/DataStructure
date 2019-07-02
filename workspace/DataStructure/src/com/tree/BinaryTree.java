package com.tree;
public class BinaryTree {
     Node root;
     public BinaryTree() {
	   root=null;
	}
    void printPostOrder(Node node)
    {
    	if(node==null)
    		return;
    	printPostOrder(node.left);
    	printPostOrder(node.right);
    	System.out.print(node.data+" ");
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
    void printPostOrder()
    {
    	printPostOrder(root);
    }
    void printPreOrder()
    {
    	printPreOrder(root);
    	
    }
    void printInOrder()
    {
    	printInOrder(root);
    }
    //main method
    public static void main(String[] args) {
		BinaryTree tree=new BinaryTree();
		/*tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        */
		tree.root=new Node(25);
		tree.root.left=new Node(15);
		tree.root.right=new Node(50);
		tree.root.left.left=new Node(10);
		tree.root.left.left.left=new Node(4);
		tree.root.left.left.right=new Node(12);
		tree.root.left.right=new Node(22);
		tree.root.left.right.left=new Node(18);
		tree.root.left.right.right=new Node(24);
		tree.root.right.left=new Node(35);
		tree.root.right.left.left=new Node(31);
		tree.root.right.left.right=new Node(44);
		tree.root.right.right=new Node(70);
		tree.root.right.right.left=new Node(66);
		tree.root.right.right.right=new Node(90);
        System.out.println("Print inorder");
        tree.printInOrder();
        System.out.println("\nPrint postorder");
        tree.printPostOrder();
        System.out.println("\nPrint preorder");
        tree.printPreOrder();
    }   
}
