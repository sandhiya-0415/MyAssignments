package week1.day2;

public class TwoWheeler {
	int noOfwheels=10;
	short noOfMirrors=2; 
	long chassisNumber=34589012l;
	boolean ispunctured=false;
	String bikename="Activa";
	double runningkm=289012.12;

	
	public static void main(String[] args) {
		
	TwoWheeler obj=new TwoWheeler();
	System.out.println("noOfwheels:" +obj.noOfwheels);
	System.out.println("noOfMirrors:" +obj.noOfMirrors);
	System.out.println("chassisNumber:" +obj.chassisNumber);
	System.out.println("ispunctured:" +obj.ispunctured);
	System.out.println("bikename:" +obj.bikename);
	System.out.println("runningkm:" +obj.runningkm);
	
		
	}

}
