
//Binding data with methods. We need to access variables only with methods but not directly.

class Student {
	private int rollno;
	private String name;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class EncapsulationDemo {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setRollno(2);
		System.out.println(s1.getRollno());

		s1.setName("Sai Ram");
		System.out.println(s1.getName());

	}
}
