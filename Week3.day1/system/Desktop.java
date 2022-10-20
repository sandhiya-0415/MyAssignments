package org.system;

public class Desktop extends Computer{
	public void DesktopSize() {
		System.out.println("Desktop size is 15 inches" );
	}
	
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.ComputerModel();
		d.DesktopSize();
	}

}
