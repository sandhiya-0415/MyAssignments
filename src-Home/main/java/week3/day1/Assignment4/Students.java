package week3.day1.Assignment4;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("id:" + id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("id:" + id + "Name:" + name);
	}

	public void getStudentInfo(String email, long Phno) {
		System.out.println("email:" + email + "Phonenumber:" + Phno);
	}

	public static void main(String[] args) {

		Students s = new Students();
		s.getStudentInfo(20031395);
		s.getStudentInfo(20031395, "Sandhiya");
		s.getStudentInfo("sandhiya.e@alight.com", 3399009921L);
	}
}
