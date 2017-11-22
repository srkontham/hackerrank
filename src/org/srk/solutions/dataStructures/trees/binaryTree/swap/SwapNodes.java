package org.srk.solutions.dataStructures.trees.binaryTree.swap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

public class SwapNodes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		Node root = new Node(1);

		Queue<Node> que = new LinkedList<Node>();
		que.add(root);
		while (!que.isEmpty() && N-- != 0) {
			Node cur = que.remove();

			int leftIndex = in.nextInt();
			int rightIndex = in.nextInt();
			if (leftIndex != -1)
				cur.left = new Node(leftIndex);
			if (rightIndex != -1)
				cur.right = new Node(rightIndex);

			if (cur.left != null)
				que.add(cur.left);
			if (cur.right != null)
				que.add(cur.right);
		}

		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			swapNodes(root, in.nextInt(), 1);
			inOrder(root);
			System.out.println();
		}
		in.close();
	}

	private static void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}

	private static void swapNodes(Node root, int k, int cd) {
		if (root == null)
			return;

		if (cd % k == 0) {
			swap(root);
		}
		swapNodes(root.left, k, cd + 1);
		swapNodes(root.right, k, cd + 1);
	}

	private static void swap(Node root) {
		Node tmp = root.left;
		root.left = root.right;
		root.right = tmp;
	}

}