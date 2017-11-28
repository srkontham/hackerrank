package linkedLists.sll;

import java.util.Scanner;

public class TestSLL {
	public static void main(String args[]) {
		int size = 0;
		Scanner scan = new Scanner(System.in);
		/*--------- Insert at Tail/Head Operations with Print ---------*/
		/*System.out.print("Enter no. of Lists to Process: ");
		size = scan.nextInt();
		for(int i=0; i<size; i++) {
			System.out.print("Enter no. of elements in list"+ (i+1) +": ");
			int n = scan.nextInt();
			SLLOperations sll = new SLLOperations();
			Node head = null;
			for(int j=0; j<n; j++) {
				System.out.print("Enter list element "+ (j+1) +": ");
				int ele = scan.nextInt();
				// Insert at Tail
				head = sll.InsertAtTail(head, ele);
				
				// Insert at Head
				// head = sll.InsertAtHead(head, ele);
			}
			System.out.print("List elements are: ");
			// Print List Elements
			sll.Print(head);
		}*/
		
		
		/*--------- Insert Element at Nth position of Linked List & Print ---------*/
		/*System.out.print("Enter no. of elements to Process: ");
		size = scan.nextInt();
		SLLOperations sll = new SLLOperations();
		Node head = null;
		for(int i=0; i<size; i++) {
			System.out.print("Enter element to Insert: ");
			int ele = scan.nextInt();
			System.out.print("Enter element position to insert: ");
			int pos = scan.nextInt();
			head = sll.InsertNth(head, ele, pos);
		}
		System.out.print("List elements are: ");
		// Print List Elements
		sll.Print(head);*/

		
		/*--------- Delete Node at Position of Linked List, Print ---------*/
		System.out.print("Enter no. of elements to Process: ");
		size = scan.nextInt();
		SLLOperations sll = new SLLOperations();
		Node head = null;
		for(int i=0; i<size; i++) {
			System.out.print("Enter element to Insert: ");
			int ele = scan.nextInt();
			head = sll.InsertAtTail(head, ele);
		}
		System.out.print("List elements are: ");
		sll.Print(head);
		
		System.out.print("\nEnter element position to Delete: ");
		int pos = scan.nextInt();
		head = sll.Delete(head, pos);
		
		System.out.print("List elements after delete are: ");
		sll.Print(head);
		
		
		
		scan.close();
	}
}
