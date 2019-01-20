
abstract class Human {
	public abstract void eat(); // we can define abstract class

	public void sleep() {

	}
}

class men extends Human {  //men is called concrete class
	public void eat() // for sure we need to use this method as we extended
						// abstract class
	{

	}
}

public class AbstractDemo {

	public static void main(String[] args) {

		// Human obj=new Human() //we cant define like this because its abstratc
		// class

		Human obj = new men();
	}

}
