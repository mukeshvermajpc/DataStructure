package com.tree;
public class DiameterTreeTwo {
Node root;
class Height{
	int h;
}
int diameterOpt(Node node ,Height height)
{
	Height lh=new Height(),rh=new Height();
	if(node==null)
	{
		height.h=0;
		return 0;
	}
	int ldiameter=diameterOpt(node.left,lh);
	int rdiameter=diameterOpt(node.right,rh);
	height.h=Math.max(lh.h, rh.h)+1;
	return Math.max(lh.h+ rh.h + 1,Math.max(ldiameter, rdiameter));
}
int diameter()
{
	Height height=new Height();
	return diameterOpt(root, height);
}
/*static int height(Node node)
{
	if(node==null)
		return 0;
	return (1+Math.max(height(node.left), height(node.right)));
}*/
public static void main(String args[])
{
	DiameterTreeTwo tree=new DiameterTreeTwo();
	tree.root=new Node(1);
	tree.root.left=new Node(2);
	tree.root.right=new Node(3);
	tree.root.left.left=new Node(4);
	tree.root.left.right=new Node(5);
	System.out.println("Height of the tree");
	//System.out.println(tree.height(tree.root));
	System.out.println("Diameter of tree");
	int dia=tree.diameter();
	System.out.println(dia);
}
}
