
/**Overload a method: first occurrence and repeated.
 * Similar code getting repeated in these method. 
 * @author kharn
 *@param x,y,m and b. where y, m and x are repeated.
 */
public class Calculator {
	  
	      public double calcY (double m, double x) {
	        double y = 0;
	        y =m*x ; 
	        return y;
	      }
	  /**
	   * Overload method, repeating its type. 
	   * @param m
	   * @param x
	   * @param b
	   * @return y
	   */
	      public double calcY (double m, double x, double b) {
	        double y = 0;
	        y = (m*x) + b;
	        return y;
	      }
	    }

