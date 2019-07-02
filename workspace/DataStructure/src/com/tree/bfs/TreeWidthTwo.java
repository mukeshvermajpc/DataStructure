package com.tree.bfs;
import java.util.LinkedList;
import java.util.Queue;
import com.tree.Node;

public class TreeWidthTwo {
 static class node  
 { 
     int data; 
     node left, right; 

     public node(int data)  
     { 
         this.data = data; 
     } 
 }  
 static int maxwidth(node root)  
 { 
     if (root == null) 
         return 0; 
       
     int maxwidth = 0; 
       
     Queue<node> q = new LinkedList<>(); 
     q.add(root); 
     while (!q.isEmpty())  
     { 
         int count = q.size(); 
         maxwidth = Math.max(maxwidth, count); 
           System.out.println(maxwidth);
         while (count-- > 0)  
         { 
             node temp = q.remove(); 
             if (temp.left != null)  
             { 
                 q.add(temp.left); 
             } 
             if (temp.right != null)  
             { 
                 q.add(temp.right); 
             } 
         } 
     } 
     return maxwidth; 
 } 

 public static void main(String[] args)  
 { 
     node root = new node(1); 
     root.left = new node(2); 
     root.right = new node(3); 
     root.left.left = new node(4); 
     root.left.right = new node(5); 
     root.right.right = new node(6); 
     root.right.right.left = new node(7); 
     root.right.right.right = new node(8);                
     System.out.println("Maximum width = " + maxwidth(root)); 
 } 
} 