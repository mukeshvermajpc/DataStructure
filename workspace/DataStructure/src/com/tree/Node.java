package com.tree;
public class Node 
{ 
    public int data; 
    public Node left;
	public Node right; 
    public Node(int item) 
    { 
        data = item; 
        left = right = null; 
    } 
    boolean isLeaf()
    {
    	return left==null?right==null:false;
    }
}