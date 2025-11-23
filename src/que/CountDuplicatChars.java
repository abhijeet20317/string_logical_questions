//	Count duplicate characters in a string
//this is map question
package que;

import java.util.HashMap;

public class CountDuplicatChars {

	public void countDuplicateCharacters(String str) {

		str = str.toLowerCase().replace(" ", "");

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ('a' <= ch && 'z' >= ch) { // to avoid other than characters
				if (!map.containsKey(ch)) {
					map.put(ch, 1);
				} else {
					map.put(ch, map.get(ch) + 1);
				}
			}

		}

		for (char kye : map.keySet()) { // to print duplicates
			if (map.get(kye) > 1) {
				System.out.println(kye + " = " + map.get(kye));

			}
		}

		// ******************without using map****************

//	    str = str.toLowerCase().replace(" ", "");
//
//	    boolean[] visited = new boolean[str.length()];
//
//	    for (int i = 0; i < str.length(); i++) {
//
//	        if (visited[i]) continue;  // already counted => skip
//
//	        int count = 1;
//
//	        for (int j = i + 1; j < str.length(); j++) {
//
//	            if (str.charAt(i) == str.charAt(j)) {
//	                count++;
//	                visited[j] = true;  // mark as counted
//	            }
//	        }
//
//	        if (count > 1) {
//	            System.out.println(str.charAt(i) + " = " + count);
//	        }
//	    }

	}

	public static void main(String[] args) {
		CountDuplicatChars cd = new CountDuplicatChars();
		//cd.countDuplicateCharacters("Hello World");
		cd.countDuplicateCharacters("progrmming");
	}

}

//	✅ STRING QUESTION 4
//	Count duplicate characters in a string
//
//	Write a method:
//
//	public void countDuplicateCharacters(String str)
//
//	Requirements
//
//	Ignore spaces
//
//	Ignore uppercase/lowercase
//
//	Print only characters that appear more than once
//
//	Show each duplicate with its frequency
//
//	📌 Example
//
//	Input:
//
//	"programming"
//
//
//	Output:
//
//	g = 2
//	m = 2
//	r = 2
//
//	📌 Another Example
//
//	Input:
//
//	"Hello World"
//
//
//	Output:
//	l = 3
//	o = 2
