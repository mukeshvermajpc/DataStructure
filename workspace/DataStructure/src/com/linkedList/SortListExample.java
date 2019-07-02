package com.linkedList;
public class SortListExample {
	Node head;
	void printList(Node head)
	{
		Node node=head;
		while(node!=null)
		{
			System.out.print(node.data+" ");
			node=node.next;
		}
	}
     public static void main(String args[])
     {
        SortListExample listOne=new SortListExample();
        listOne.head=new Node(1);
        Node first=new Node(3);
        Node second=new Node(5);
        listOne.head.next=first;
        first.next=second;
        listOne.printList(listOne.head);
        SortListExample listtwo=new SortListExample();
        listtwo.head=new Node(2);
        Node lone=new Node(3);
        Node ltwo=new Node(6);
        listtwo.head.next=lone;
        lone.next=ltwo;
        System.out.println("\nSecond list of element");
        listtwo.printList(listtwo.head);
        listOne.head=new MergeList().sortedMerge(listOne.head, listtwo.head);
        System.out.println("\nMerge list");
        listOne.printList(listOne.head);
     }
}
