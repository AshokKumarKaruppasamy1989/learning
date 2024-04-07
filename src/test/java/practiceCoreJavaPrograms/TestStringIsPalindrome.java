package practiceCoreJavaPrograms;

public class TestStringIsPalindrome {

	public static void main(String[] args) {
		String inp = "ace";
		isPalindrome(inp);

	}
	
	static void isPalindrome(String str) {
		
		String temp = str;
		String rev = "";
		
		// 1. using string builder
//		StringBuilder rev = new StringBuilder(str);
//		rev.reverse().toString();
		
		// 2. using loop		
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		
		if (temp.toLowerCase().equals(rev.toString().toLowerCase())) {
			System.out.println(temp + " : is a Palindrome");
		} else {
			System.out.println(temp + " : is not a palindrome");
		}		
	}
}
