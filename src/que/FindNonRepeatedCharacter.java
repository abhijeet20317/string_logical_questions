//Question 5: Find the first non-repeated character in a string

package que;

import java.util.HashMap;

public class FindNonRepeatedCharacter {

	public char nonRepeatedChar(String str) {

		str = str.toLowerCase().replace(" ", "");

		HashMap<Character, Integer> map = new HashMap<>();
		
		// Count characters
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (map.containsKey(ch)) {

				map.put(ch, map.get(ch) + 1);

			} else {
				map.put(ch, 1);
			}

		}

//		for(char kye : map.keySet()) {  // =>=>=>=> map keySet  give random order 
//										// =>=>=>=> 
//			if(map.get(kye) == 1){
//				return kye;
//			}
//		}

		// Find first non-repeated by STRING order
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (map.get(ch) == 1) {
				return ch;
			}
		}

		return 0;

	}

	public static void main(String[] args) {

		FindNonRepeatedCharacter fnr = new FindNonRepeatedCharacter();

		System.out.println(fnr.nonRepeatedChar("Swiss"));

	}
}

//Question 5: Find the first non-repeated character in a string
//
//Example:
//
//Input: "swiss"
//Output: w
//कारण:
//
//s → repeated
//
//w → not repeated
//
//i → repeated
//
//s → repeated
