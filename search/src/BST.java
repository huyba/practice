import java.util.AbstractQueue;
import java.util.LinkedList;

public class BST {
	public void Add(int key) {
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
	
	public Node Search(int key) {
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
	
	public void PrintInOrder() {
		PrintInOrder(m_root);
		System.out.print("\n");
	}
	
	public void PrintPreOrder() {
		PrintPreOrder(m_root);
		System.out.print("\n");
	}
	
	public void PrintPostOrder() {
		PrintPostOrder(m_root);
		System.out.print("\n");
	}
	
	public void PrintLevelOrder() {
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
	
	private void PrintInOrder(Node node) {
		if (node == null) {
			return;
		}
		
		System.out.print(node.key + "\n");
		PrintInOrder(node.left);
		PrintInOrder(node.right);
	}
	
	private void PrintPreOrder(Node node) {
		if (node == null) {
			return;
		}

		PrintPreOrder(node.left);
		System.out.print(node.key + "\n");
		PrintPreOrder(node.right);
	}
	
	private void PrintPostOrder(Node node) {
		if (node == null) {
			return;
		}
		
		PrintPostOrder(node.right);
		System.out.print(node.key + "\n");
		PrintPostOrder(node.left);
	}

	private Node m_root;
}