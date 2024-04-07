package practiceCoreJavaPrograms;

public class TestFindMinNumInMultiDimArray {

	public static void main(String[] args) {
		// Find Minimum number in multi dimensional array
		
		int[][] input = {{4,0,9}, {44,-3,16}, {23,8,14}};
		System.out.println("Minimum number in multi dimensional array is : " + findMinNumMultiArray(input));

	}
	
	static int findMinNumMultiArray(int[][] num) {
		int Minimum = num[0][0];
		
		for (int j = 0; j < num.length; j++) {
			for (int i = 0; i < num[j].length; i++) {
				if (num[j][i] < Minimum) {
					Minimum = num[j][i];
				}
			}
		}
		return Minimum;
	}

}
