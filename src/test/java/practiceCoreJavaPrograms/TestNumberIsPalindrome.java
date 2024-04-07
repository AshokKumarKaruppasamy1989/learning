package practiceCoreJavaPrograms;

public class TestNumberIsPalindrome {
	
	public static void main(String[] args) {
		int inp = 129;
		isPalindrome(inp);
		
	}
	
	static void isPalindrome(int num) {
		int temp = num;
		int rev = 0;
		
		while (num > 0) {
			int digit = num % 10;
//			System.out.println("digit : " + digit);
			rev = (rev * 10) + digit;
//			System.out.println("rev : " + rev);
			num = num/10;
//			System.out.println("num : " + num);
		}
		if (temp == rev) {
			System.out.println(temp + " : number is Palindrome");
		} else {
			System.out.println(temp + " : number is not Palindrome");
		}
	}

}
