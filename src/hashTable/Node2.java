package hashTable;

public interface Node2<K> {

	K getKey();

	void setKey(K key);

	void setNext(Node2<K> next);

	Node2<K> getNext();

}
