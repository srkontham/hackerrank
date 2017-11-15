package org.srk.solutions.dataStructures.linkedLists.dll;

import java.util.Scanner;

import org.srk.solutions.dataStructures.linkedLists.dll.Node;

public class TestDLL {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no. of elements to Process: ");
		int size = scan.nextInt();
		DLLOperations dll = new DLLOperations();
		Node head = null;
		for(int i=0; i<size; i++) {
			System.out.print("Enter element to Insert: ");
			int ele = scan.nextInt();
			head = dll.SortedInsert(head, ele);
		}
		System.out.print("List elements are : ");
		dll.Print(head);
		
		System.out.print("\nReversed List elements are: ");
		head = dll.Reverse(head);
		dll.Print(head);
		
		scan.close();
	}
}
