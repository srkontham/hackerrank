package linkedLists.dll;

import linkedLists.dll.Node;

public class DLLOperations {

	Node SortedInsert(Node head, int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		newNode.prev = null;

		Node current = null;
		// When head is null or head node data is >= new node
		if (head == null || head.data >= data) {
			newNode.next = head;
			head = newNode;
		} else { // New node data is greater than head node
			current = head;
			while (current.next != null && current.next.data < data) {
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
		}
		return head;
	}

	Node Reverse(Node head) {
		if (head == null || head.next == null)
			return head;

		Node previousNode = head.prev;
		Node currentNode = head;
		Node nextNode;

		while (currentNode != null) {
			nextNode = currentNode.next;

			currentNode.next = previousNode;
			currentNode.prev = nextNode;

			previousNode = currentNode;
			currentNode = nextNode;
		}

		head = previousNode;
		return head;
	}

	void Print(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
}

/*
 * Insert Node at the end of a linked list head pointer input could be NULL as
 * well for empty list Node is defined as
 */

class Node {
	int data;
	Node next;
	Node prev;
}
