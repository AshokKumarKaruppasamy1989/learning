package practiceCoreJavaPrograms;

public class TestFindMaxNumInArray {

	public static void main(String[] args) {
		// Find a maximum number in an array
		
		int[] input = {1, 6, 35, -3, 0, 0, 0};
		System.out.println("Maximum Number is : " + findMaxNum(input));

	}
	
	static int findMaxNum(int[] num) {
		
		int maximum = num[0];
		
		for (int i = 0; i <= num.length - 1; i++) {
			if (num[i] > maximum) {
				maximum = num[i];
			}
		}
		
		return maximum;
	}

}
