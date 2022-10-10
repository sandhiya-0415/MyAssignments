package week2.day2;

public class Armstrong {
	
		public static void main(String[] args) {
			
			int number=153;int total=0,temp=0,num=number;
			while (num != 0)
			{
			temp = num % 10;
			total = total + temp*temp*temp;
			num /= 10;
			} if(total == number)
			System.out.println(number + " is an Armstrong number");
			else
			System.out.println(number + " is not an Armstrong number");
			}
			
		}




