package week1.WeeklyAssignments;

public class PrintsduplicatesinArray {
	public static void main(String[] args) {
		
 	int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
 	
 	int l=arr.length;
 	for(int i=0;i<l;i++)
 	{
 		for(int j=i+1;j<l;j++) {
 			if(arr[i]==arr[j])
 			
 System.out.println("Duplicates:"+arr[i]);
 
 		
 	}
 	}
}}
