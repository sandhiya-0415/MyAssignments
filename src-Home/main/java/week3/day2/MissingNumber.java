package week3.day2;

import java.util.Set;
import java.util.TreeSet;

//Assignment2
public class MissingNumber {
	public static void main(String[] args) {
		/*
		 * Problem
		 *
		 * There will be running number between 1 to 10 One of the unique number will be
		 * missing Find the missing number
		 *
		 */

		/*
		 * Psuedocode
		 *
		 * a) Remove the duplicates using Set b) Make sure the set is in the ascending
		 * order c) Iterate from the starting number and verify the next number is + 1
		 * d) If did not match, that is the number
		 *
		 */
		int[] nos = { 1, 2, 2, 3, 5, 4, 8, 6, 10, 9 };// missing number is 7

		Set<Integer> no = new TreeSet<Integer>();
		for (int i : nos) {
			no.add(i);
		}
		System.out.println("Given nos without duplicates:" + no);
		for (int i = 1; i <= 10; i++) {
			if (!no.contains(i))
				System.out.println("Missing Number:" + i);

		}

	}

}
