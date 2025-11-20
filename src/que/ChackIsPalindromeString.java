package que;

public class ChackIsPalindromeString {

	public boolean isPalindrome(String str) {

		
		//  this solution is also correct but it is slower than other
		
//		str = str.replace(" ", "");
//
//		StringBuffer sb = new StringBuffer(str);   //stringBuffer is slower and synchronize
//		String reve = sb.reverse().toString();
//		return reve.equalsIgnoreCase(str);     
		
		
		
		// this is highly Optimized Version
		    str = str.replaceAll("\\s+", "").toLowerCase();
		    return new StringBuilder(str).reverse().toString().equals(str);
		    
		    //StringBuilder is recommended unless thread safety is needed.
		}


	

	public static void main(String[] args) {

		ChackIsPalindromeString cps = new ChackIsPalindromeString();
		System.out.println(cps.isPalindrome("A man a plan a canal Panama"));

	}

}
