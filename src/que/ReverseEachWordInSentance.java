//Question 7: Reverse Each Word in a Sentence (But Keep Word Order Same)
//StringBuilder
package que;

public class ReverseEachWordInSentance {

	public String reverseWords(String str) {

		str = str.toLowerCase().replaceAll("\\s+", " ").trim();
		String[] words = str.split(" ");
		StringBuilder result = new StringBuilder();

		for (String word : words) {
			StringBuilder w = new StringBuilder(word);
			result.append(w.reverse().append(" "));
		}

		return result.toString().trim();

//		for(String word : words) {
//			StringBuilder w = new StringBuilder(word);
//			str =str + w.reverse().toString() + " ";   //avoid the string concatenation in loops
//		}
//		System.out.println(str); // Returning  make code reusable 

	}

	public static void main(String[] args) {
		ReverseEachWordInSentance rews = new ReverseEachWordInSentance();

		System.out.println(rews.reverseWords("Hello World"));
	}

}
