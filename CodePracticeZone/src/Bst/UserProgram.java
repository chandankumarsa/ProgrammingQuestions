package Bst;

public class UserProgram {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();

		// Insertion
		bst.add(50);
		bst.add(30);
		bst.add(70);
		bst.add(20);
		bst.add(40);
		bst.add(60);
		bst.add(80);

		// Traversals
		System.out.print("Inorder: ");
		bst.inorder();

		System.out.print("Preorder: ");
		bst.preorder();

		System.out.print("Postorder: ");
		bst.postorder();

		System.out.print("Level Order: ");
		bst.levelorder();

		// Contains
		System.out.println("Contains 40? " + bst.contains(40)); // true
		System.out.println("Contains 90? " + bst.contains(90)); // false

		// Remove a node
		System.out.println("Removing 70...");
		bst.remove(70);

		System.out.print("Inorder after removal: ");
		bst.inorder();
	}
}
