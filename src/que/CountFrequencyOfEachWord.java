//Question 8: Count Frequency of Each Word in a Sentence
//LinkedHashMap

package que;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountFrequencyOfEachWord {

	void countFrequency(String str) {

		str = str.toLowerCase().trim().replaceAll("\\s+", " ");
		String[] words = str.split(" ");

		Map<String, Integer> map = new LinkedHashMap<String, Integer>();

		for (String word : words) {
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}

		}
		for (String w : map.keySet()) {

			System.out.println(w + " : " + map.get(w));

		}

	}

	public static void main(String[] args) {
		
		CountFrequencyOfEachWord cfew = new CountFrequencyOfEachWord();
		cfew.countFrequency("Hello world hello java world");
	}
}


//Question 8: Count Frequency of Each Word in a Sentence

//Input:
//
//Hello world hello java world
//
//
//Output:
//
//hello = 2
//world = 2
//java  = 1
