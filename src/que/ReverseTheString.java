package que;

public class ReverseTheString {

	public String reverseString(String str) {

		StringBuffer sb = new StringBuffer(str);
		String reve = sb.reverse().toString();

		return reve;
	}

	public static void main(String[] args) {

		ReverseTheString re = new ReverseTheString();

		System.out.println(re.reverseString("hello"));

	}

}
