public class Node {
	public int key;
	public Node left, right, parent;
	public boolean color;
	
	public Node(int newKey) {
		key = newKey;
		color = true;
	}	
}
