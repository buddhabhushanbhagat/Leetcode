package com.java.linkedlist;

public class REverseLinkedListLeetcode206 {

	static Node head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node node1 = new Node(2);

		Node node2 = new Node(3);
		Node node3 = new Node(6);
		Node node4 = new Node(8);
		Node node5 = new Node(9);

		head = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = null;

		reverseLL();

		printLL();
	}

	private static void reverseLL() {
		// TODO Auto-generated method stub
		// head -> 2 ->3-> 6-> 8-> 9-> null
		// null<- 2 3-> 6-> 8-> 9-> null

		// null <-2<-3<-6<-8<-9<-head
		Node pre = null;
		Node current = head;
		Node next = null;

		while (current.next != null) {
			next = current.next;
			current.next = pre;
			pre = current;
			current = next;

		}
		current.next = pre;
		head = current;
	}

	private static void printLL() {
		// TODO Auto-generated method stub
		Node temp = head;

		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}

}
