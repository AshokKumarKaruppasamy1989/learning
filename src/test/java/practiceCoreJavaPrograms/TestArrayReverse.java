package practiceCoreJavaPrograms;

import java.util.Arrays;

public class TestArrayReverse {

	public static void main(String[] args) {
		String[] input = {"aaa", "bbb", "ccc", "zzz"};
		Integer[] input1 = {123, 456, 789};
		System.out.println(reverseArray(input));

	}

	static String reverseArray(String[] arr) {
		
		String[] rev = new String[arr.length];
//		String rev1 = "";
		
		for(int i = arr.length - 1; i >= 0; i--) {
			rev[i] = arr[arr.length -i -1];
//			rev1 = rev1 + arr[i] + " ";
		}
		
		return Arrays.toString(rev);
//		return rev1;
	}
	
	static String reverseArray(Integer[] arr) {
		Integer[] rev = new Integer[arr.length];
		
		for (int i = arr.length - 1; i >= 0; i--) {
			rev[i] = arr[arr.length -i -1];
		}
		return Arrays.toString(rev);
	}
}
