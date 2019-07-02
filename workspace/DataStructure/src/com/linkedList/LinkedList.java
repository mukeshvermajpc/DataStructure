package com.linkedList;

public class LinkedList {
	Node head;

	void printList() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	void insertAtBegining(int key) {
		Node newNode = new Node(key);
		newNode.next = head;
		head = newNode;
	}

	void insertAtLast(int key) {
		Node newNode = new Node(key);
		Node last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = newNode;
	}

	void insertBeforeNode(int key, int newValue) {
		Node newNode = new Node(newValue);
		Node temp = head;
		Node previous = null;
		while (temp.data != key) {
			previous = temp;
			temp = temp.next;
		}
		newNode.next = previous.next;
		previous.next = newNode;
	}
	void insertedAfterNode(int key,int newValue)
	{
      Node newNode=new Node(newValue);
      Node temp=head;
      Node nextNode=null;
      while((temp.data!=key)&&(temp.next!=null))
      {
    	 temp=temp.next;
      }
      if(temp.data==key)
      {
       newNode.next=temp.next;
       temp.next=newNode;
      }
		
	}
	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		list.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		list.head.next = second;
		second.next = third;
		System.out.println("Linked list node");
		list.printList();
		list.insertAtBegining(10);
		System.out.println("\nList after inserting node in beginning:");
		list.printList();
		System.out.println("\nList after inserting node at the end");
		list.insertAtLast(14);
		list.printList();
		list.insertBeforeNode(14, 40);
		System.out.println("\nPrinting node after inserting node before a node ");
		list.printList();
		list.insertedAfterNode(2, 19);
		System.out.println("\n Printing node after inserting node after a node");
		list.printList();
	}
}
