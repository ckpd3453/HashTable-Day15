package hashTable;

public class HashMapTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * Procedure :- ============ 1. Inserting the sentence as string and spliting itm into words in string array 
		 * 2. creating a hash table 
		 * 3. fetching the elements by key and their values and adding them into the hashmap 
		 * 4. Printing the table
		 */

		/*
		 * 1. Inserting the sentence as string and spliting it into words in string array
		 */
		String string = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		String[] words = string.toLowerCase().split(" ");

		/*
		 * 2. creating a hash table
		 */
		HashMap2<String, Integer> hashMap = new HashMap2<>();

		/*
		 * 3. fetching the elements by key and their values and adding them into the hashmap
		 */
		for (int i = 0; i < words.length; i++) {

			String word = words[i];
			Integer value = hashMap.get(word);
			if (value == null) {
				value = 1;
			} else {
				value += 1;
			}
			hashMap.add(word, value);
		}

		/*
		 * 4. Printing the table
		 */
		System.out.println(hashMap);

	}

}
