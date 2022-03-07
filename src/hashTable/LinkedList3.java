package hashTable;

public class LinkedList3<K> {
	
	/*
	 * 1. Creating a node
	 */
	private Node3<K> head;
	private Node3<K> tail;

	/*
	 * 2. Created a method to find the bucket index
	 */
	public Node3<K> search(K key) {
		Node3<K> temp = head;
		while (temp != null) {
			if (temp.getKey().equals(key)) {
				return temp;
			}
			temp = temp.getNext();
		}
		return null;
	}
	
	/*
	 * public Node3<K> remove(K key) { Node3<K> ptr = head; String avd =
	 * "avoidable"; while (ptr != null) { if(ptr.getKey().equals(avd)) {
	 * 
	 * remove(key); } else return ptr; } return ptr; }
	 */
	/*
	 * 3. Created a method to append the node at calculated index
	 */
	public void append(Node3<K> myNode) {

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
