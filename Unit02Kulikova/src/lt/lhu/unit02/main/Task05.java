package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		System.out.println("Enter three numbers");
		
		Scanner num = new Scanner(System.in);
		
		if (num.hasNextDouble()) {
			
			double a = num.nextDouble();
			double b = num.nextDouble();
			double c = num.nextDouble();
			
			double result;
			
			double temp;
			temp = 2 * a;
			
			double temp2;
			temp2 = Math.pow(b, 2) + 4 * (a + c);
			
			if(temp != 0) {
				
				result = (b +  Math.sqrt(temp2)) / temp - ((Math.pow(a, 3)) * c + b);
				
			} else {
				System.out.println("The denominator is zero. Restart the program and enter numbers");
				result = Double.NaN;
				}
			
			System.out.println(result);
			
		} else {
			System.out.println("These are not numbers. Restart the program and enter numbers");
		}
		
		num.close();		
	
	}

}
