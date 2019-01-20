
public class WrapperClassDemo {

	public static void main(String[] args) {

		int i = 5; // primitive datatype
		Integer i1 = new Integer(i); // Boxing or wrapping - sending value into
										// the object

		int j = i1.intValue(); // Unboxing - unwrapping

		Integer value = i1; // Autoboxing

		int k = value; // Autounboxing

		String str = "1234";
		int l = Integer.parseInt(str);

		System.out.println(l);

	}
}
