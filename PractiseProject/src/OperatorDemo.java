
public class OperatorDemo {

	
	/*
	 * Arithmetic -,+,/,%-(Covered in last class)
	 * Bitwise  & and or operator
	 * relational ==,!=,<,>,<=,>=  --it returns only boolean values
	 * logical  ||  &&
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		int m=4,n=5;
		//double r1=(double)m/n; //to get the value with decimal points in quotient
		
		//n+=m;  //n=n+m
		//n++; //n=n+1 --increment operator or short hand operators
		//n--; //n=n-1  --decrement operator
		
		//++n;  //pre increment operator
		//n++;  //post increment operator
		
		//m=++n;  //first increment and then assign so it will be 6;
		m=n++;  //assign and increment so m=5 and n=6
		
		boolean b=m>n;
		
		if(m!=n || m>8)
		{
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		//System.out.println(b);
		//System.out.println(n);

	}

}
