package hashTable;

public interface Node3<K> {

	K getKey();

	void setKey(K key);

	void setNext(Node3<K> next);

	Node3<K> getNext();

}
