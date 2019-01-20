class Demo {
	int num1;
	int num2;
	int result;

	void perform() {
		result = num1 - num2;
	}
}

public class FirstProgramWithClasses {

	public static void main(String[] args) {

		Demo obj = new Demo();  //constructor
		
		obj.num1 = 10;
		obj.num2 = 5;
		
		obj.perform();
		
		System.out.print(obj.result);
	}
}
