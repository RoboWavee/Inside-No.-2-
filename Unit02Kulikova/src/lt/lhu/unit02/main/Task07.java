package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		
		System.out.println("Enter three numbers");
		
		Scanner num = new Scanner(System.in);
		
		if (num.hasNextDouble()) {
			
			double a = num.nextDouble();
			double b = num.nextDouble();
			double c = num.nextDouble();
			
			double ax;
			double bx;
			double cx;
					
			
			if (a >= 0) {				
				ax = Math.pow(a, 2);
				System.out.println(ax);
			} else {
				ax = Math.pow(a, 4);
				System.out.println(ax);
			}
			
			if (b >= 0) {				
				bx = Math.pow(b, 2);
				System.out.println(bx);
			} else {
				bx = Math.pow(b, 4);
				System.out.println(bx);
			}
			if (c >= 0) {				
				cx = Math.pow(c, 2);
				System.out.println(cx);
			} else {
				cx = Math.pow(c, 4);
				System.out.println(cx);
			}
			
					
		} else {
			System.out.println("These are not numbers. Restart the program and enter numbers");		
		}
		
		num.close();
	}

}
