package Bst;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	Node root;
	int count = 0;
	boolean flag = true;

	public boolean add(int key) {
		root = add(key, root);
		return flag;
	}

	public Node add(int key, Node n) {
		if (n == null) {
			n = new Node(key);
			count++;
			return n;
		}
		if (key < n.key)
			n.left = add(key, n.left);
		else if (key > n.key)
			n.right = add(key, n.right);
		else
			flag = false;
		return n;
	}

	// Contains method
	public boolean contains(int key) {
		return contains(root, key);
	}

	private boolean contains(Node n, int key) {
		if (n == null)
			return false;
		if (key == n.key)
			return true;
		else if (key < n.key)
			return contains(n.left, key);
		else
			return contains(n.right, key);
	}

	// Inorder
	public void inorder() {
		inorder(root);
		System.out.println();
	}

	public void inorder(Node n) {
		if (n == null)
			return;
		inorder(n.left);
		System.out.print(n.key + " ");
		inorder(n.right);
	}

	// Preorder
	public void preorder() {
		preorder(root);
		System.out.println();
	}

	public void preorder(Node n) {
		if (n == null)
			return;
		System.out.print(n.key + " ");
		preorder(n.left);
		preorder(n.right);
	}

	// Postorder
	public void postorder() {
		postorder(root);
		System.out.println();
	}

	public void postorder(Node n) {
		if (n == null)
			return;
		postorder(n.left);
		postorder(n.right);
		System.out.print(n.key + " ");
	}

	// Level order
	public void levelorder() {
		Queue<Node> q = new LinkedList<>();
		if (root != null) {
			q.add(root);
			while (!q.isEmpty()) {
				Node n = q.poll();
				System.out.print(n.key + " ");
				if (n.left != null)
					q.add(n.left);
				if (n.right != null)
					q.add(n.right);
			}
			System.out.println();
		}
	}

	// Remove method
	public void remove(int key) {
		root = remove(key, root);
	}

	public Node remove(int key, Node n) {
		if (n == null)
			return null;

		if (key < n.key) {
			n.left = remove(key, n.left);
		} else if (key > n.key) {
			n.right = remove(key, n.right);
		} else {
			if (n.left == null)
				return n.right;
			else if (n.right == null)
				return n.left;
			else {
				n.key = getMin(n.right);
				n.right = remove(n.key, n.right);
			}
		}
		return n;
	}

	public int getMin(Node n) {
		int min = n.key;
		while (n.left != null) {
			min = n.left.key;
			n = n.left;
		}
		return min;
	}
}
