package hashTable;

import java.util.ArrayList;

public class HashMap2<K, V> {

	/*
	 * 1. Creating an ArrayList as bucket in Hash Table
	 */
	private final int numberOfBucket;
	ArrayList<LinkedList2<K>> arrayList;

	/*
	 * 2. Constructor of self class and giving the size of bucket and initializing them by NULL
	 */
	public HashMap2() {

		numberOfBucket = 10;
		arrayList = new ArrayList<>();
		for (int i = 0; i < numberOfBucket; i++) {
			arrayList.add(null);
		}
	}

	/*
	 * 3. Created a get method to get the value in hash table
	 */
	public V get(K key) {

		int indexNumber = this.getBucketNumber(key);
		LinkedList2<K> linkedList = arrayList.get(indexNumber);

		if (linkedList == null) {
			return null;
		}

		MyMapNode2<K, V> mapNode = (MyMapNode2<K, V>) linkedList.search(key);
		return mapNode == null ? null : mapNode.getValue();
	}

	/*
	 * 4. Created a method to calculate the index no. by its value
	 */
	private int getBucketNumber(K key) {

		int hashCode = Math.abs(key.hashCode());
		return hashCode % this.numberOfBucket;
	}

	/*
	 * 5. To add key and value in the hash table to its index block
	 */
	public void add(K key, V value) {

		int index = this.getBucketNumber(key);
		LinkedList2<K> linkedList = this.arrayList.get(index);
		if (linkedList == null) {
			linkedList = new LinkedList2<>();
			this.arrayList.set(index, linkedList);
		}

		MyMapNode2<K, V> myMapNode = (MyMapNode2<K, V>) linkedList.search(key);
		if (myMapNode == null) {
			myMapNode = new MyMapNode2<>(key, value);
			linkedList.append(myMapNode);
		} else {
			myMapNode.setValue(value);
		}
	}

	@Override
	public String toString() {
		return "HashMap{" + arrayList + '}';
	}
}
