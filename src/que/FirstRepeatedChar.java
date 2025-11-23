//Q. Write a program to find the first repeated character from a string.
// using HashSet
package que;

import java.util.HashSet;

public class FirstRepeatedChar {

	public char firstRepeatedChar(String str) {
		
		str = str.toLowerCase().replace(" ", "");
		
		HashSet<Character> set = new HashSet<>();
		
		for(int i = 0 ; i < str.length() ; i++) {
			
			char ch = str.charAt(i);
			if(set.contains(ch)) {
				return ch;
			}else {
				set.add(ch);
			}
			
		}
		return 0;

	}

	public static void main(String[] args) {
		
		FirstRepeatedChar frc = new FirstRepeatedChar();
		
		System.out.println(frc.firstRepeatedChar("Swiss"));
		

	}

}
