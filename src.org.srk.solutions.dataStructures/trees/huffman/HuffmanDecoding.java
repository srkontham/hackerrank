package org.srk.solutions.dataStructures.trees.huffman;

class Node {
	public int frequency; // the frequency of this tree
	public char data;
	public Node left, right;
}

public class HuffmanDecoding {

	public static void main(String args[]) {

	}

	void decode(String S, Node root) {
		Node cur = root;
		for (int i = 0; i < S.length(); i++) {
			cur = S.charAt(i) == '1' ? cur.right : cur.left;
			if (cur.data != '\0') {
				System.out.print(cur.data);
				cur = root;
			}
		}

	}

}
