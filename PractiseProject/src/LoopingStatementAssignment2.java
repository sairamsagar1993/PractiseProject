import java.util.Scanner;

public class LoopingStatementAssignment2 {
	
	/*
	 * $ $ $ $
	 * $     $
	 * $     $
	 * $ $ $ $
	 */

	public static void main(String[] args) {
		
		Scanner sc;
		int i,j,rows,columns;
		
		sc = new Scanner(System.in);
       
		System.out.print("Enter rows:");
		rows = sc.nextInt();
		System.out.print("Enter Columns:");
		columns = sc.nextInt();
		for(i=1;i<=rows;i++) {
		
		for(j=1;j<=columns;j++) {
			if(i==1 || i==rows || j==1 || j==columns) {
				System.out.println("$");
				
			}
			
			else {
				System.out.println(" ");
			}
				
		}
		//System.out.print(" ");
		 System.out.println();
		}
	}

}
