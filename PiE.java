import java.math.RoundingMode; 
import java.math.BigDecimal;


public class Main{
	public static void main(String[] args) {
		BigDecimal x = new BigDecimal("1.0");
		BigDecimal n = new BigDecimal("0.0");
		int number = 1;
		long choice = 10000L;  // this is the degree of accuracy
		
		for(int b = 1; b < choice; b = b + 1)
		 {

			BigDecimal p = new BigDecimal("0");
			BigDecimal a = new BigDecimal("-1.0");
			BigDecimal c = new BigDecimal("2.0");
			BigDecimal d = new BigDecimal("1.0");
			//(1.0d/x) + (-1.0d/(x+2.0))
			
			d = d.divide(x, 1000, RoundingMode.HALF_UP); // change the 1000 to specify the number of decimals
			
			x = x.add(c);
			
			a = a.divide(x, 1000, RoundingMode.HALF_UP); // change the 1000 to specify the number of decimals
			
			p = a.add(d);
			
	    n = n.add(p);
			x = x.add(c);
				

		 }
			
		n = n.multiply(new BigDecimal("4"));
		System.out.print(n); 
		
	}
}
