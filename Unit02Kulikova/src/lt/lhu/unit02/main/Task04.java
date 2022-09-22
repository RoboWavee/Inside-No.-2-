package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		
		
		System.out.println("Enter three integers");
		
		Scanner num = new Scanner(System.in);
		
		if (num.hasNextInt()) {
			
			int a = num.nextInt();
			int b = num.nextInt();
			int c = num.nextInt();
			
			int summa;
			
			summa = a + b + c;
			
			System.out.println(summa);
		
		}
		
		else {
			System.out.println("These are not integers. Restart the program and enter integers");
		}
		
		num.close();
		
	
	}

}
