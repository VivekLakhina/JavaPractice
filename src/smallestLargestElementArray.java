import java.util.Arrays;

public class smallestLargestElementArray {

	public static void main(String[] args) {
		int[] intArr = { -10, 12, 123, 13, -100, 23, 34, 446, 65, 34, 435, 75, 344, 65, 465, 767, 232 };
		Arrays.sort(intArr);
		/*
		 * for(int i : intArr) { System.out.printf("%d ",i); }
		 */

		System.out.println("Smallest Number: " + intArr[0] + " Largest Number: " + intArr[intArr.length - 1]);

		int largest = intArr[0];
		int smallest = intArr[0];
		for (int i : intArr) {
			if (i > largest) {
				largest = i;
			} else if (i < smallest)
				smallest = i;
		}
		System.out.println("Smallest Number: " + smallest + " Largest Number: " + largest);
	}

}
