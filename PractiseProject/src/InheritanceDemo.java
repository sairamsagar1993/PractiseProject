

class Calc {               //super class
	public int add(int i,int j) 
	{
		return i+j;
	}
}

class CalcAdv extends Calc {  //sub class
	public int sub(int i,int j) {
		return i-j;
	}
}
 class CalcVeryAdv extends CalcAdv {   //multi inheritance
	 public int multi(int i,int j) {
		 return i*j;
	 }
 }
public class InheritanceDemo {

	public static void main(String args[]) {
		
		CalcVeryAdv c1=new CalcVeryAdv();
		int result1 = c1.add(5, 4);
		int result2 = c1.sub(5, 3);
		int result3 = c1.multi(5, 2);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
	}
}
