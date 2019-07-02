package com.tree;
public class LevelOrderExample {
    Node root;
    void levelOrder()
    {
      int h=height(root);
      for(int i=1;i<=h;i++)
      {
    	  printLevel(root,i);
      }
    }
    void printLevel(Node root,int level)
    {
    	if(root==null)
    		return;
    	if(level==1)
           System.out.print(root.data+" ");
    	else
    	{
    		printLevel(root.left, level-1);
    		printLevel(root.right, level-1);
    	}
    }
    int height(Node root)
    {
    	if(root==null)
           return 0;
    	else
    	{
    		int lheight=height(root.left);
    		int rheight=height(root.right);
    		if(lheight>rheight)
    			return lheight+1;
    		else
    			return (rheight+1);	
    	}
    }
 public static void main(String args[])
 {
  LevelOrderExample tree=new LevelOrderExample();
  tree.root=new Node(1);
  tree.root.left=new Node(2);
  tree.root.right=new Node(3);
  System.out.println(tree.height(tree.root));
  System.out.println("Level order traversal");
  tree.levelOrder();
 }
}
