package week1.WeeklyAssignments;

import java.util.Arrays;

public class SecondLargest {
	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		int size=data.length;
		System.out.println("array size:"+size);
		Arrays.sort(data);
System.out.println("Second Largest number of an array:"+data[size-2]);
	}
	
	

}
