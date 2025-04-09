package BinarySearchTree_Implementations;

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
}
