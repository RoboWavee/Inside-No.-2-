package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		
		System.out.println("Enter three numbers");
		
		Scanner num = new Scanner(System.in);
		
		if (num.hasNextDouble()) {
			
			double a = num.nextDouble();
			double b = num.nextDouble();
			double c = num.nextDouble();
			
			double result;
			
			result = Math.pow(a, 2) - ((b - c) * (b - c)) + Math.log((Math.pow(b, 2)) + 1);
			
			System.out.println(result);
		}
		
		else {
			
			System.out.println("These are not numbers. Restart the program and enter numbers");
		}
		
		num.close();
	

	}

}
