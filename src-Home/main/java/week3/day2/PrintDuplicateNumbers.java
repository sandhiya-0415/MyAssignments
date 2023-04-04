package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicateNumbers {
	public static void main(String[] args) {
		int[] data = { 4, 3, 6, 8, 29, 1, 2, 4, 7, 8 };

		/*
		 * Problem Statement : Print only duplicate values Expected output: 4 and 8
		 *
		 * How to solve? 1) Regular for loop 2) Using Set
		 *
		 * Using Set
		 *
		 * a) Add every element into Set b) If it is already there in the Set -> Print
		 * duplicate
		 *
		 */

		int len = data.length;
		Set<Integer> set = new TreeSet<Integer>();
		System.out.print("Duplicate values:");
		for (int i = 0; i < len; i++) {
			if (!set.contains(data[i]))
				set.add(data[i]);
			else
				System.out.print(data[i] + " ");

		}

	}

}
