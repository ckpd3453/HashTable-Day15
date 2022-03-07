package hashTable;

public class MyMapNode3<K,V> implements Node3<K> {
	K key;
	V value;
    Node3<K> next;
   
    //constructor of self class
	public MyMapNode3(K key, V value) {
		super();
		this.key = key;
		this.value = value;
		this.next = null;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
    
	@Override
	public Node3<K> getNext() {
		return next;
	}

	@Override
	public void setNext(Node3<K> next) {
		
		this.next = next;
    
	}

	@Override
	public String toString() {
		StringBuilder myMapNodeString = new StringBuilder();
		myMapNodeString.append("MyMapNode{" + "K=").append(key).append(" V=").append(value).append('}');
		if (next != null)
			myMapNodeString.append("->").append(next);
		return myMapNodeString.toString();
	}
}
