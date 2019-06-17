package data;
import java.*;
import java.text.DecimalFormat;
import java.util.Scanner;
public class FixedPoint {
	  /* rearrange your function into the form x = g(x) */
	   
	   static double doFunction(double x) { 
               
	      return (600*Math.pow(x,4)-5*Math.pow(x, 3)+200*Math.pow(x, 2)-1)/20;
            //  return Math.pow(x,3)+(4*Math.pow(x, 2))-10;
	   }

     
	   static void doFixedPoint() {
    
               
               float a;
		   double x0, x;
			x0 = 0.1;
			int i, flag = 0, maxiter = 200;
			double  TOL = 0.00001;
			System.out.println("  inz  "+x0);
			for (i = 0; i <=maxiter; i++){
				x = doFunction(x0);
				//System.out.println(i+"  "+x);
                                System.out.printf("%d) %f \n",i, x);

				if (Math.abs(x-x0)<	TOL){
					System.out.println(" " +x +"      "+i);
					flag = 1;
					break;
				}
                                
				x0 = x;
			}
			
	   }         

	   public static void main(String[] args) {
	      doFixedPoint();
	   }
}
