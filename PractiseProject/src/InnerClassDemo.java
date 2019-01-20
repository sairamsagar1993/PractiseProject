/*
 * 
 * member class - normal class without static keyword
 * static class
 * Anonymous class
 */

class Outer
{
	static class inner  //Outer$inner.class
	{
	 public void Demo() 
		{
			System.out.println("In display");
		}
		
	}
}
public class InnerClassDemo 
{
	//create variables,methods
	
	public static void main(String[] args) 
	{
	Outer obj = new Outer();
	Outer.inner obj1= new Outer.inner();
	
	obj1.Demo();

	}

}
