package que;

public class CountVowelsInString { // vowels in string aeiou

	public void countVowelsConsonants(String str) {
		str = str.replace(" ", "").toLowerCase();
		int vowelCount = 0;
		int consonantCount = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
						|| ch == 'u') {

					vowelCount++;

				}

				else {
					consonantCount++;
				}
			}
		}

		System.out.println("count of ovwels in string is " + vowelCount);
		System.out.println("count of consonants in string is " + consonantCount);

	}

	public static void main(String[] args) {
		CountVowelsInString vc = new CountVowelsInString();
		vc.countVowelsConsonants("Hello world");
	}

}
