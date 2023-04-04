package week3.day2;

public class Hdfc implements Rbi{

	public void minimumBalance(int bal) {
		// TODO Auto-generated method stub
		System.out.println("minimum balance should be" +bal);
	}

	public void provideDebitCard(String card) {
		// TODO Auto-generated method stub
		System.out.println("Provide debit card details to complete KYC for"+card);
	}
public void provideCreditCard() {
	System.out.println("Provide valid proof for credit card processing");
}
public static void main(String[] args) {
	Hdfc H =new Hdfc();
	Rbi R=new Hdfc();
	H.minimumBalance(1000);
	H.provideCreditCard();
	H.provideDebitCard("master card:HDFC object");
	R.minimumBalance(2000);
	R.provideDebitCard("Master card:RBI object");
}
}

