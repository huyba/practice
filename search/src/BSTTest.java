
public class BSTTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BST bst = new BST();
		bst.add(100);
		bst.add(80);
		bst.add(7);
		bst.add(90);
		bst.add(150);
		bst.add(130);
		bst.add(160);
		
		bst.printPreOrder();
		bst.printInOrder();
		bst.printPostOrder();
		bst.printLevelOrder();
		
		Node node = bst.search(160);
		if (node != null) {
			System.out.print("found");

		} else {
			System.out.print("not found");
		}
	}

}
