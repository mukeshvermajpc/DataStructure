package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderByQueue {
	Node root;

	void printLevelOrder(Node root) {
          Queue<Node>queue=new LinkedList<>();
          queue.add(root);
          while(!queue.isEmpty())
          {
        	  Node node=queue.poll();
        	  System.out.print(node.data+" ");
        	  if(node.left!=null)
        		  queue.add(node.left);
        	  if(node.right!=null)
        		  queue.add(node.right);
          }
	}
	public static void main(String args[]) {
		LevelOrderByQueue tree = new LevelOrderByQueue();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
        tree.printLevelOrder(tree.root);
	}
}
