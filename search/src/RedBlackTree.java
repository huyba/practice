
public class RedBlackTree {

	public RedBlackTree() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean add(int key) {
		Node node = new Node(key);
		
		if (m_root == null) {
			m_root = node;
			
			return true;
		}
	
		Node currentNode = m_root;
		while (true) {
			if (node.key > currentNode.key) {
				if (currentNode.right == null) {
					currentNode.right = node;
					break;
				} else {
					currentNode = currentNode.right;
				}
			} else {
				if (currentNode.left == null) {
					currentNode.left = node;
					break;
				} else {
					currentNode = currentNode.left;
				}
			}
		}
		
		
		
		return true;
	}
	
	private void rotateLeft(Node node) {
		
	}
	
	private void rotateRight(Node node) {
		
	}

	private Node m_root;
}