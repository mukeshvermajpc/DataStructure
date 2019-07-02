package com.linkedList;

public class ReverseList {
    Node head;
	Node reverseList(Node head)
    {
    	Node prev=null;
    	Node current=head;
    	Node next=null;
    	while(current!=null)
    	{
    		next=current.next;
    		current.next=prev;
    		prev=current;
    		current=next;
    	}
    	head=prev;
    	return head;
    }
	void printList(Node node) {
		Node temp = node;
		while (temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	Node reverseUtil(Node curr,Node prev)
	{
		if(curr.next == null)
		{
			head= curr;
			curr.next=prev;
			return head;
		}
		Node next1=curr.next;
		curr.next=prev;
		reverseUtil(next1, curr);
		return head;
	}
	public static void main(String args[]) {
		ReverseList lst = new ReverseList();
		lst.head = new Node(1);
		Node first = new Node(2);
		Node second = new Node(3);
		lst.head.next = first;
		first.next = second;
		lst.printList(lst.head);
	 /*   Node revLst=lst.reverseList(lst.head);
		System.out.println();
		lst.printList(revLst);
	*/	System.out.println("\nPriting reverse list using recursion");
		Node reverse=lst.reverseUtil(lst.head, null);
		lst.printList(reverse);
	}
}
