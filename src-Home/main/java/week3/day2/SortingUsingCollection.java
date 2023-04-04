package week3.day2;

import java.util.Arrays;

public class SortingUsingCollection {
	public static void main(String[] args) {
		// Declare a String array and add the Strings values as (HCL, Wipro, Aspire
		// Systems, CTS)
		String[] arr = { "HCL", "Wipro", "Aspire Systems", "CTS" };

		// get the length of the array
		int len = arr.length;

		// sort the array
		Arrays.sort(arr);

		// Iterate it in the reverse order
		System.out.print("String array in reverse order:");
		for (int i = len - 1; i >= 0; i--) {
			System.out.print(arr[i]);
			if (i > 0)
				System.out.print(",");
		}

		// print the array

		// Required Output: Wipro, HCL , CTS, Aspire Systems

	}

}
