package com.syed.corejava.SinglyLinkedList;

public class LinkedList {
	ListNode head;
	int length = 0;

	public void insertNodeAtBegin(int data) {
		ListNode node = new ListNode(data);
		node.setNext(head);
		head = node;
		length++;
	}

	public ListNode reverse(ListNode head) {
		ListNode prev = null;
		ListNode current = head;
		ListNode next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}

	public static ListNode findMiddle(ListNode head) {
		ListNode a_ptr = head;
		ListNode b_ptr = head;

		while (b_ptr != null && b_ptr.next != null) {
			a_ptr = a_ptr.next;
			b_ptr = b_ptr.next.next;
		}
		return a_ptr;
	}

	@Override
	public String toString() {
		String data = "[";
		data = data + head.getData();
		ListNode temp = head.getNext();
		while (temp != null) {
			data = data + "->" + temp.getData();
			temp = temp.getNext();
		}
		return data + "]";

	}

	public static void main(String[] args) {
		LinkedList obj = new LinkedList();
		obj.insertNodeAtBegin(1);
		obj.insertNodeAtBegin(2);
		obj.insertNodeAtBegin(3);
		obj.insertNodeAtBegin(4);
		obj.insertNodeAtBegin(5);
		System.out.println(obj);
		obj.head = obj.reverse(obj.head);
		System.out.println(obj);
		
		ListNode middleNode=findMiddle(obj.head);
		System.out.println("the middle node is "+middleNode.getData() );
	}

}
