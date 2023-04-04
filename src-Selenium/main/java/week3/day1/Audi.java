package week3.day1;

public class Audi extends Car{
	public void HybridFuel() {
		System.out.println("Audi:HybridFuel");
		
	}
	public void applybrake() {
		System.out.println("Car:ABSBrake");
				super.applybrake();;
		
	}
	public static void main(String[] args) {
		Audi c=new Audi();
		c.applybrake();
	}

}