package com.tree.bfs;

public class HeightBinaryTree {
	Node root;

	public HeightBinaryTree() {
		root = null;
	}
    int maxDepth(Node root)
    {
    	if(root==null)
    		return 0;
    	else 
    	{
    		int iDepth=maxDepth(root.left);
    		int rDepth=maxDepth(root.left);
    		if(iDepth>rDepth)
    		  return(iDepth+1);
    		else
    			return(rDepth+1);		
    	}
    }
    public static void main(String[] args) {
		HeightBinaryTree tree=new HeightBinaryTree();
		tree.root=new Node(1);
    	tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		System.out.println("Height of the tree is "+tree.maxDepth(tree.root));
		
	}

}
