package linkedListConcepts;

public class MyLinkedList {

	Node head;
	class Node{
		int data;
		Node next;
		public Node(int data) {
		     this.data=data;
		     next=null;
		}
	}
	public static void main(String[] args) {
		
		MyLinkedList ml = new MyLinkedList();
		Node first = ml.new Node(10);
		
		ml.head=first;
		
		
	}
}
