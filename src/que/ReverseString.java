// Reverse a string without using built-in reverse()

package que;

//public class ReverseString {
//	
//	String reverseString(String str) {
//		
//		String word = "";
//		
//		for(int i = str.length()-1 ; i >=0  ; i--) {
//			
//			word = word + str.charAt(i);
//			
//		}
//		return word;
//	}
	
	

	public class ReverseString {       // this is the best way

	    String reverseString(String str) {
	       
	        char[] arr = str.toCharArray();
	        int left = 0;
	        int right = arr.length - 1;

	        while (left < right) {
	            char temp = arr[left];
	            arr[left] = arr[right];
	            arr[right] = temp;

	            left++;
	            right--;
	        }

	        return new String(arr);
	    }

	 

	
	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		
		System.out.println(rs.reverseString("Hello"));
				
	}

}
