package com.linkedList;
public class DeleteNodeExample {
  Node head;
  void printList()
  {
	  Node node=head;
	  while(node!=null)
	  {
		  System.out.print(node.data+" ");
		  node=node.next;
	  }
  }
  void deleteFirst()
  {
	  Node temp=head;
	  head=head.next;
	  temp=null;
  }
  void deleteLast()
  {
	  Node temp=head;
	  Node temp2=head.next;
	  while(temp2.next!=null)
	  {
		  temp=temp2;
		  temp2=temp2.next;
	  }
	  temp.next=null;
  }
  void deleteNode(int key)
  {
	  Node temp=head;
	  Node temp2=head.next;
	  if(temp.data==key && temp!=null)
	  {
		  head=temp.next;
		  return;
	  }
	  while(temp2.data!=key)
	  {
		  temp=temp2;
		  temp2=temp2.next;
	  }
      if(temp2!=null)
      {
    	  temp.next=temp2.next;
      }
  }
  public static void main(String args[])
  {
      DeleteNodeExample obj=new DeleteNodeExample();
      obj.head=new Node(1);
      Node two=new Node(2);
      Node three=new Node(3);
      Node four=new Node(4);
      Node five=new Node(5);
      obj.head.next=two;
      two.next=three;
      three.next=four;
      four.next=five;
      obj.printList();
      obj.deleteFirst();
      System.out.println("\nAfter deleting first node");
      obj.printList();
      obj.deleteLast();
      System.out.println("\nAfter deleting last node");
      obj.printList();
      System.out.println("\nAfter deleting specific node from list");
      obj.deleteNode(2);
      obj.printList();
  }
}
