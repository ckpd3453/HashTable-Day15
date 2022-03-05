package hashTable;

public class LinkedList2<K> {
	
	/*
	 * 1. Creating a node
	 */
	private Node2<K> head;
	private Node2<K> tail;

	/*
	 * 2. Created a method to find the bucket index
	 */
	public Node2<K> search(K key) {
		Node2<K> temp = head;
		while (temp != null) {
			if (temp.getKey().equals(key)) {
				return temp;
			}
			temp = temp.getNext();
		}
		return null;
	}

	/*
	 * 3. Created a method to append the node at calculated index
	 */
	public void append(Node2<K> myNode) {

		if (this.head == null) {
			this.head = myNode;
		}
		if (this.tail == null) {
			this.tail = myNode;
		} else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}

	@Override
	public String toString() {
		return "\n MyLinkedListNodes{" + head + "}";
	}

	public void printMyNodes() {
		System.out.println(" My Nodes :" + head);
	}
}
