package week3.day1;

public class LearnOverloading {
	
	public void add(int a,int b){
		System.out.println("Adding 2 nos:"+(a+b));
	}
	
	public void add(int a,int b,int c){
		System.out.println("Adding 3 nos:" +(a+b+c));
	}
public void add(float a,float b) {
	System.out.println("Adding 2 float nos:" +(a+b));
}

public void add(float a) {
	System.out.println("displaying one float:"+a);
}

public void add(int a) {
	System.out.println("displaying one int:"+a);
}

	public static void main(String[] args) {
		LearnOverloading a1=new LearnOverloading();
		a1.add(5, 6);
		a1.add(7, 8,9);
		
		a1.add(5.2f,8.9f);
		a1.add(4.5f, 0);;
		a1.add(4);
	}

}
