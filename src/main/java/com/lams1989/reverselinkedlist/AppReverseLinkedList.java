package com.lams1989.reverselinkedlist;

public class AppReverseLinkedList {
	static class SinglyLinkedListNode {
		public int data;
		public SinglyLinkedListNode next;

		public SinglyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
		}
	}

	static class SinglyLinkedList {
		public SinglyLinkedListNode head;
		public SinglyLinkedListNode tail;

		public SinglyLinkedList() {
			this.head = null;
			this.tail = null;
		}

	}

	public static void main(String args[]) {

		SinglyLinkedList llist = new SinglyLinkedList();
		int[] llistItem = { 141, 302, 164, 530, 474 };

		for (int i = 0; i < llistItem.length; i++) {
			SinglyLinkedListNode llist_head = insertNodeAtHead(llist.head, llistItem[i]);
			llist.head = llist_head;
		}

		printLinkedList(reverseLinkedList(llist.head));
	}

	static SinglyLinkedListNode reverseLinkedList(SinglyLinkedListNode head) {
		SinglyLinkedListNode actualNode = head;
		SinglyLinkedListNode preNode = null;
		SinglyLinkedListNode nextNode = null;

		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return head;
		} else {
			while (actualNode != null) {
				nextNode = actualNode.next;
				actualNode.next = preNode;
				preNode = actualNode;
				actualNode = nextNode;
			}
			head = preNode;
		}
		return head;

	}

	static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int data) {
		SinglyLinkedListNode nodeInsert = new SinglyLinkedListNode(data);
		if (head == null) {
			return nodeInsert;
		}
		nodeInsert.next = head;
		return nodeInsert;
	}

	static void printLinkedList(SinglyLinkedListNode head) {

		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}

	}
}
