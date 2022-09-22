package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		
		System.out.println("Enter number");
		
		Scanner num = new Scanner(System.in);
		
		if (num.hasNextDouble()) {
			
			int x = num.nextInt();
			
			double fx;
			
			if (x > -3 & x <= 3) {
				System.out.println("Restart the program and enter a number less than - 3 or greater than 3");
			} else if (x <= -3) {
				fx = 9;
				System.out.println("F(x)=" + fx);
			} else if (x > 3) {
				fx = 1 / (Math.pow(x, 2) + 1);
				System.out.println("F(x)=" + fx);				
			}
			
		} else {
			System.out.println("You didn't enter a number. Restart the program and enter number");
		}
		
		num.close();
	}

}
