import java.io.*;
import java.math.BigInteger;
import java.math.BigDecimal; 
import java.math.RoundingMode;

public class Phi{

    public static void main(String args[]){

     BigDecimal n = new BigDecimal("1.0");
		 
     BigDecimal m = new BigDecimal("1.0");
		 
		 for (int i = 1; i < 1000000; i ++){
		 	
			 n = n.add(m);
			 m = m.add(n);
			 
			 //System.out.println(n);
			 //System.out.printlm(m);
			 
		 }
		 
		 

	    System.out.println(m);
		  System.out.println(n);
	  	//m = m.divide(n , 100000, RoundingMode.HALF_UP);
	  	//System.out.println(m);
		 
    }
}



