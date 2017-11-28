package linkedLists.sll;

public class SLLOperations {

	// This is a "method-only" submission.
	// You only need to complete this method.
	Node InsertAtTail(Node head, int data) {
		Node tail = new Node();
		tail.data = data;
		tail.next = null;

		Node root = head;
		if (root != null) {
			while (root.next != null)
				root = root.next;
			root.next = tail;
		} else
			head = tail;
		return head;
	}

	// This is a "method-only" submission.
	// You only need to complete this method.
	Node InsertAtHead(Node head, int x) {
		Node root = new Node();
		root.data = x;
		root.next = null;

		if (head != null)
			root.next = head;

		return root;
	}

	// This is a "method-only" submission.
	// You only need to complete this method.
	Node InsertNth(Node head, int data, int position) {
		Node pos = new Node();
		pos.data = data;
		pos.next = null;

		Node ptr = head;

		if (head == null)
			return pos;
		else if (position == 0) {
			pos.next = head;
			return pos;
		} else {
			for (int i = 1; i <= position; i++) {
				if (i == position) {
					Node temp = ptr.next;
					ptr.next = pos;
					pos.next = temp;
					break;
				}
				ptr = ptr.next;
			}
		}
		return head;
	}

	// This is a "method-only" submission.
	// You only need to complete this method.
	Node Delete(Node head, int position) {
		// Complete this method
		Node ptr = head;

		if (position == 0 && ptr.next == null)
			head = null;
		if (position == 0 && ptr.next != null)
			head = ptr.next;
		else {
			for (int i = 1; ptr.next != null && i <= position; i++) {
				if (i == position)
					ptr.next = ptr.next.next;
				else
					ptr = ptr.next;
			}
		}
		return head;
	}

	// This is a "method-only" submission.
	// You only need to complete this method.
	void ReversePrint(Node head) {
		// This is a "method-only" submission.
		// You only need to complete this method.
		if (head != null) {
			if (head.next != null)
				ReversePrint(head.next);
			System.out.println(head.data);
		}
	}

	// This is a "method-only" submission.
	// You only need to complete this method.
	Node Reverse(Node head) {
		// Recursive Implementation of Reverse Linked List
		if (head == null || head.next == null) {
			return head;
		}

		Node newHead = Reverse(head.next);
		head.next.next = head;
		head.next = null;

		return newHead;

		// Iterative Implementation of Reverse Linked List
		/*Node reverse = null;
		Node current = head;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = reverse;
			reverse = current;
			current = next;
		}
		head = reverse;
		return head;*/

	}

    // This is a "method-only" submission. 
    // You only need to complete this method 
	int CompareLists(Node headA, Node headB) {
	    while(headA != null && headB != null){
	        if(headA.data == headB.data){
	            if( (headA.next != null && headB.next == null) || ((headA.next == null && headB.next != null)) ){
	                return 0;
	            }
	            headA = headA.next;
	            headB = headB.next;
	        }else
	            return 0;

	    }
	    return 1;
	}
	
	
    // This is a "method-only" submission. 
    // You only need to complete this method 
	Node mergeLists(Node headA, Node headB) {
	    // Recursive method of merging 2 sorted linked lists.
/*	    if (headA == null) return headB;
	    if (headB == null) return headA;

	    if (headA.data < headB.data) {
	        headA.next = mergeLists(headA.next, headB);
	        return headA;
	    } else {
	        headB.next = mergeLists(headB.next, headA);
	        return headB;
	    }
*/	    
	    // Iterative method of merging 2 sorted linked lists.
		if (headA == null) return headB;
		if (headB == null) return headA;

		Node head;
		if (headA.data < headB.data){
			head = headA;
		}else{
			head = headB;
			headB = headA;
			headA = head;
		}
		
		while(headA.next != null){
			if (headA.next.data > headB.data){
				Node tmp = headA.next;
				headA.next = headB;
				headB = tmp;
			}
			headA = headA.next;
		} 
		headA.next = headB;
		return head;
	}

	
    // This is a "method-only" submission. 
    // You only need to complete this method. 
	int GetNode(Node head, int n) {
	    Node temp = head;
	    int len = 0;
	    while(temp!=null){  // length of the linked list
	        len++;
	        temp = temp.next;
	    }
	    
	    if(len < n)
	        return -1;
	    
	    temp = head;
	    // The Nth element from tail can be find using (length - n -1)
	    for(int i=0; i<len-n-1; i++)
	        temp = temp.next;
	    
	    return temp.data;
	}
	
	
	// This is a "method-only" submission. 
	// You only need to complete this method. 
	Node RemoveDuplicates(Node head) {
	    Node temp = head;
	    if(head != null){
	        while(temp.next != null){
	            if(temp.next.data == temp.data){
	                //System.out.println(temp.next.data + " " + temp.data);
	                Node tempNext = temp.next.next;
	                temp.next = tempNext;
	            }else
	                temp = temp.next;
	        }
	    }
	    return head;
	}
	

	/*
	Detect a cycle in a linked list. 
	Note that the head pointer may be 'null' if the list is empty.
	*/
	boolean hasCycle(Node head) {
	    Node slowTemp = head, fastTemp = head;
	    while (slowTemp != null && fastTemp != null && fastTemp.next != null) {
	        slowTemp = slowTemp.next;
	        fastTemp = fastTemp.next.next;
	        if (slowTemp == fastTemp) {
	            //System.out.println("Found loop");
	            return true;
	        }
	    }
	    return false;
	}
	
	
	/*
	  Find merge point of two linked lists
	  head pointer input could be NULL as well for empty list
	  Node is defined as 
	*/
	int FindMergeNode(Node headA, Node headB) {
	    // Complete this function
	    // Do not write the main method. 
	    Node currentA = headA;
	    Node currentB = headB;
	    
	    while(currentA != currentB){
	        if(currentA.next == null)
	            currentA = headB;
	        else
	            currentA = currentA.next;
	        
	        if(currentB.next == null)
	            currentB = headA;
	        else
	            currentB = currentB.next;
	    }
	    return currentA.data;
	}

	
	// This is a "method-only" submission.
	// You only need to complete this method.
	void Print(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
}

/*
 * Print elements of a linked list on console head pointer input could be NULL
 * as well for empty list Node is defined as
 */

class Node {
	int data;
	Node next;
}
