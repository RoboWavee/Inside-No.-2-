package lt.lhu.unit02.main;

public class Task02 {

	public static void main(String[] args) {
		
		double c1; //катет 
		double c2; //катет
		
		c1 = 4.0;
		c2 = 7.0;
		
		double h; //гипотенуза
		double S; //площадь
		
		h =  Math.sqrt((Math.pow(c1, 2) + Math.pow(c2, 2)));
	    S = (c1 * c2) / 2.0;
	    
	    System.out.println(h + " " + S);
		
			
	}

}
