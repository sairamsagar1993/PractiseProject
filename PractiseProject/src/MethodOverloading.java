class method
{
	int num1;
	int num2;
	int result;
	
	/*
	 * concept of polymorphism
	 */
	void add(int i, int j) {
		num1 = i;
		num2 = j;
		result = i+j;
		}
	public void add(int k, float l, int a) {
		result = k+(int)l-a;
	}
}
public class MethodOverloading {

	public static void main(String args[]) {
		method obj;
		obj=new method();
		obj.add(5, 6);
		System.out.println(obj.result);
		obj.add(5, 6.5f, 2);
		System.out.println(obj.result);
		
	}
}
