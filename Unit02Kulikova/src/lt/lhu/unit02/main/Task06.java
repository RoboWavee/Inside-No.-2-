package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task06 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter four numbers");
	
		Scanner num = new Scanner(System.in);
		
		if (num.hasNextDouble()) {
			
			double a = num.nextDouble();
			double b = num.nextDouble();
			double c = num.nextDouble();
			double d = num.nextDouble();
			
			double result;
			
			if (c != 0 & d != 0) {
				
				result = ((a / c) * (b / d)) - ((a * b - c) / c * d);
				
				System.out.println(result);
				
			} else {
				System.out.println("The denominator is zero. Restart the program and enter numbers");
				result = Double.NaN;
			}
		} else {
			System.out.println("These are not numbers. Restart the program and enter numbers");
		}
		
		num.close();
	}

}
