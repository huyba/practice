import java.util.AbstractQueue;
import java.util.LinkedList;

public class BST {
	public void add(int key) {
		if (m_root == null){
			m_root = new Node(key);
			
			return;
		}
		
		Node currentNode = m_root;
		
		while (true) {
			if (key < currentNode.key) {
				if (currentNode.left == null) {
					currentNode.left = new Node(key);
					
					return;
				}
				else {
					currentNode = currentNode.left;
				}
			}
			else {
				if (currentNode.right == null) {
					currentNode.right = new Node(key);
				
					return;
				}
				else {
					currentNode = currentNode.right;
				}
			}
		}
	}
	
	public Node search(int key) {
		Node currentNode = m_root;
		
		while(true) {
			if (currentNode.key == key) {
				return currentNode;
			}
			
			if (key < currentNode.key) {
				if (currentNode.left == null) {
					return null;
				}
				else {
					currentNode = currentNode.left;
				}
			}
			else {
				if (currentNode.right == null) {
					return null;
				}
				else {
					currentNode = currentNode.right;
				}
			}
		}
	}
	
	public void printInOrder() {
		printInOrder(m_root);
		System.out.print("\n");
	}
	
	public void printPreOrder() {
		printPreOrder(m_root);
		System.out.print("\n");
	}
	
	public void printPostOrder() {
		printPostOrder(m_root);
		System.out.print("\n");
	}
	
	public void printLevelOrder() {
		LinkedList<Node> queue = new LinkedList<Node>();
		
		queue.addLast(m_root);
		
		while(!queue.isEmpty()) {
			Node node = queue.removeFirst();
			if (node.left != null) {
				queue.addLast(node.left);
			}
			if (node.right != null) {
				queue.addLast(node.right);
			}
			System.out.print(node.key);
			System.out.print("\n");
		}
	}
	
	private void printInOrder(Node node) {
		if (node == null) {
			return;
		}
		
		System.out.print(node.key + "\n");
		printInOrder(node.left);
		printInOrder(node.right);
	}
	
	private void printPreOrder(Node node) {
		if (node == null) {
			return;
		}

		printPreOrder(node.left);
		System.out.print(node.key + "\n");
		printPreOrder(node.right);
	}
	
	private void printPostOrder(Node node) {
		if (node == null) {
			return;
		}
		
		printPostOrder(node.right);
		System.out.print(node.key + "\n");
		printPostOrder(node.left);
	}

	private Node m_root;
}