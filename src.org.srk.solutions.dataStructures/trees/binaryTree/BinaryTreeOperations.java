package trees.binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/* you only have to complete the function given below.  
Node is defined as  
*/

class Node {
	Node left;
	Node right;
	int data;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

public class BinaryTreeOperations {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no. of elements to insert into tree: ");
		int size = scan.nextInt();
		Node root = null;
		while (size-- > 0) {
			int data = scan.nextInt();
			root = insert(root, data);
		}
		scan.close();
		int height = height(root);
		System.out.println(height);
	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data); // Node(int data) constructor is available

			/* Constructor Node(int data) is not available, use the following logic */
			// Node node = new Node();
			// node.data = data; node.left = null; node.right = null;
			// return node;
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	static int height(Node root) {
		// Write your code here.
		if (root == null)
			return -1;
		else {
			// height of sub-tree
			int leftHeight = height(root.left);
			int rightHeight = height(root.right);

			if (leftHeight > rightHeight)
				return leftHeight + 1;
			else
				return rightHeight + 1;
		}
	}

	void preOrder(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	void postOrder(Node root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");
		}
	}

	void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			inOrder(root.right);
			System.out.print(root.data + " ");
		}
	}

	void topView(Node root) {
		Stack<Node> leftStack = new Stack<Node>();
		Node current = root;
		while (current != null) {
			leftStack.push(current);
			current = current.left;
		}

		while (leftStack.peek() != root) {
			System.out.print(leftStack.pop().data + " ");
		}

		current = root;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.right;
		}
	}

	void levelOrder(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {

			// poll() removes the present head.
			Node current = queue.poll();
			System.out.print(current.data + " ");

			// Enqueue left child
			if (current.left != null)
				queue.add(current.left);

			// Enqueue right child
			if (current.right != null)
				queue.add(current.right);
		}
	}

	// Iterative solution for Lowest Common Ancestor
	static Node lca(Node root, int v1, int v2) {
		if (root != null) {
			if (v1 > v2) {
				int temp = v2;
				v2 = v1;
				v1 = temp;
			}
			while (root.data < v1 || root.data > v2) {
				if (root.data < v1)
					root = root.right;
				else if (root.data > v2)
					root = root.left;
			}
		}
		return root;
	}
	
	// Recursive solution for Lowest Common Ancestor
	static Node lcaRecursive(Node root,int v1,int v2)
	{
	    //Decide if you have to call recursively
	    //Samller than both
	    if(root.data < v1 && root.data < v2){
	        return lca(root.right,v1,v2);
	    }
	    //Bigger than both
	    if(root.data > v1 && root.data > v2){
	        return lca(root.left,v1,v2);
	    }

	    //Else solution already found
	    return root;
	}
	
}
