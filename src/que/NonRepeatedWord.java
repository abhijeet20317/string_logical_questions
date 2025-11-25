//Find the first non-repeated word in a sentence.
//*******LinkedHashMap*******
package que;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatedWord {

	public String nonRepeatedWord(String str) {

		str = str.trim().replaceAll("\\s+", " ").toLowerCase();

		String[] words = str.split(" ");

		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		//LinkedHashMap keep order as it inserted.

		 // Count frequency
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {

				map.put(word, 1);
			}
		}

		// Find first non-repeated word

		for (String w : words) {
			if (map.get(w) == 1) {
				return w;
			}
		}

		return null;
	}

	public static void main(String[] args) {
		NonRepeatedWord nrw = new NonRepeatedWord();

		System.out.println(nrw.nonRepeatedWord("Java is great and Java is powerful"));
	}

}


//Find the first non-repeated word in a sentence
//
//
//
//Example:
//Input: "Java is great and Java is powerful"
//Output: great
