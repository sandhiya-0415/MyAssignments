package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {

//	Declare a String as PayPal India
		String test = "PayPal India";

//	Convert it into a character array
		char[] arr = test.toCharArray();

//	Declare a Set as charSet for Character
		Set<Character> charSet = new LinkedHashSet<Character>();

//	Declare a Set as dupCharSet for duplicate Character
		Set<Character> dupCharSet = new LinkedHashSet<Character>();

//	Iterate character array and add it into charSet
		for (char i : arr) {
			if (!charSet.contains(i))
				charSet.add(i);

			else
				dupCharSet.add(i);
		}

//	if the character is already in the charSet then, add it to the dupCharSet

//	Check the dupCharSet elements and remove those in the charSet

		System.out.println("CharSet:" + charSet);
		System.out.println("Duplicate Character Set:" + dupCharSet);
		System.out.print("Word without Duplicates:");

//	Iterate using charSet
		for (char a : charSet) {
			if (a != ' ')
				System.out.print(a);

		}

//	Check the iterator variable isn't equals to an empty space

//	print it

	}
}
