package week3.Assignment3;

public class AxisBank extends BankInfo {
	public void Deposit() {
		System.out.println("AxisBank Deposit amount:50K");

	}

	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		a.Deposit();
		BankInfo B = new BankInfo();
		B.deposit();

	}

}
