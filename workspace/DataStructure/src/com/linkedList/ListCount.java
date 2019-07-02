package com.linkedList;
public class ListCount {
   Node head;
   int countList()
   {
	   Node node=head;
	   int count=0;
	   while(node!=null)
	   {
		   count++;
		   node=node.next;
	   }
	   return count;
   }
   int countRec(Node node1)
   {
	   Node node=node1;
	   if(node==null)
	      return 0;
	   return (1+countRec(node.next));
   }
   public int getCount()
   {
	   return countRec(head);
   }
   public static void main(String args[])
   {
	   ListCount lst=new ListCount();
	   lst.head=new Node(1);
	   Node first=new Node(2);
	   Node second=new Node(3);
	   Node third=new Node(4);
	   Node four=new Node(5);
	   lst.head.next=first;
	   first.next=second;
	   second.next=third;
	   third.next=four;
	   System.out.println("List of node in list is:"+lst.countList());
	   System.out.println("Number of node in list using recursion: "+lst.getCount());
   }
}
