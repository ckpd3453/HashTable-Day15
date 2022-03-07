package hashTable;

import java.util.ArrayList;

public class HashMap3<K, V> {

	/*
	 * 1. Creating an ArrayList as bucket in Hash Table
	 */
	private final int numberOfBucket;
	ArrayList<LinkedList3<K>> arrayList;

	/*
	 * 2. Constructor of self class and giving the size of bucket and initializing them by NULL
	 */
	public HashMap3() {

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
		LinkedList3<K> linkedList = arrayList.get(indexNumber);

		if (linkedList == null) {
			return null;
		}

		MyMapNode3<K, V> mapNode = (MyMapNode3<K, V>) linkedList.search(key);
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
		LinkedList3<K> linkedList = this.arrayList.get(index);
		if (linkedList == null) {
			linkedList = new LinkedList3<>();
			this.arrayList.set(index, linkedList);
		}

		MyMapNode3<K, V> myMapNode = (MyMapNode3<K, V>) linkedList.search(key);
		if (myMapNode == null) {
			myMapNode = new MyMapNode3<>(key, value);
			linkedList.append(myMapNode);
		} else {
			myMapNode.setValue(value);
		}
	}
	public boolean remove(K key) {
    	/**
    	 * [4] Method remove to delete the LinkList from array
    	 * 1. First we pass the key and find the index of the LinkedList
    	 * 2. Then we check the arrayList and use the search to check the Node in the LinkedList
    	 * 3. Then we remove the Node and arrayList
    	 * @param key - we pass the key to remove the Mapnode
    	 * @return - We return true once it is deleted
    	 */
		
		int index = this.getBucketNumber(key);
		LinkedList3<K> linkedList = this.arrayList.get(index);

		MyMapNode3<K, V> myMapNode = (MyMapNode3<K, V>) linkedList.search(key);

		linkedList.remove(key);
		arrayList.remove(index);
		return true;	
	}

	@Override
	public String toString() {
		return "HashMap{" + arrayList + '}';
	}
}
