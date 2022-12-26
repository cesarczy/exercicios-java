package testeLogico;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) throws Exception {
		BinaryTree bt = BinaryTree.create();
		bt.inOrder();
		Scanner e = new Scanner(System.in);

		System.out.print("|-----------------------|\n");
		System.out.print("| 	Maça     	|\n");
		System.out.print("| 	Morango  	|\n");
		System.out.print("| 	Goiaba  	|\n");
		System.out.print("| 	Limão    	|\n");
		System.out.print("| 	Pera    	|\n");
		System.out.print("| 	Abacaxi  	|\n");
		System.out.print("| 	Laranja 	|\n");
		System.out.print("| 	Banana   	|\n");
		System.out.print("| 	Cebola    	|\n");
		System.out.print("|-----------------------|\n");
		System.out.print("##--Write one of the options:--##\n\n");

		String word = e.next();
		String path = bt.search(word);
		if (path != null) {
			System.out.println(path);
		} else {
			System.out.println("Invalid option");
		}
	}
}

class BinaryTree {
	static class TreeNode {
		String data;
		TreeNode left, right;

		TreeNode(String value) {
			this.data = value;
			left = right = null;
		}
	}

	TreeNode root;

	public String search(String value) {
		return search(root, value, "");
	}

	private String search(TreeNode node, String value, String path) {
		if (node == null) {
			return null;
		}

		if (node.data.equals(value)) {
			return path + " -> " + node.data;
		}

		String leftResult = search(node.left, value, path + " -> " + node.data);
		if (leftResult != null) {
			return leftResult;
		}

		String rightResult = search(node.right, value, path + " -> " + node.data);
		if (rightResult != null) {
			return rightResult;
		}

		return null;
	}

	// traverse the binary tree in in-order traversal algorithm

	public void inOrder() {
		inOrder(root);
	}

	private void inOrder(TreeNode node) {
		if (node == null) {
			return;
		}

		inOrder(node.left);
		inOrder(node.right);
	}

	/*
	 * Java method to create binary tree with test data
	 * 
	 * @return a sample binary tree for testing
	 */
	public static BinaryTree create() {
		BinaryTree tree = new BinaryTree();
		TreeNode root = new TreeNode("Maça");
		tree.root = root;
		tree.root.left = new TreeNode("Morango");
		tree.root.left.left = new TreeNode("Goiaba");
		tree.root.left.right = new TreeNode("Limão");
		tree.root.right = new TreeNode("Pera");
		tree.root.right.right = new TreeNode("Abacaxi");
		tree.root.right.right.right = new TreeNode("Laranja");
		tree.root.right.right.right.left = new TreeNode("Banana");
		tree.root.right.right.right.right = new TreeNode("Cebola");
		return tree;

	}
}