

class A {
	
	public void show() 
	{
		System.out.println("in A");
	}
}

class B  extends A {
	
	public void show()
	{
		//super.show();
		System.out.println("In B");
	}
}
class C extends A 
{
	public void show()
	{
		System.out.println("In C");
	}	
}
//Child class method will override the parent class method is known as method overriding
public class OverridingDemo {

	public static void main(String[] args) {
		//B obj = new B();
		A obj1=new B();   //dynamic methods     runtime polymorphism
		obj1.show();

		obj1=new C();
		obj1.show();  //Dynamic method Dispatch
	}

}
