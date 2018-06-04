
public class BSTTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BST bst = new BST();
		bst.Add(100);
		bst.Add(80);
		bst.Add(7);
		bst.Add(90);
		bst.Add(150);
		bst.Add(130);
		bst.Add(160);
		
		bst.PrintPreOrder();
		bst.PrintInOrder();
		bst.PrintPostOrder();
		
		Node node = bst.Search(160);
		if (node != null) {
			System.out.print("found");

		} else {
			System.out.print("not found");
		}
	}

}
