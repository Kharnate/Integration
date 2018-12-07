
/**Find the area of the circle with given radius and using Math.PI. 
 * The value of area and radius is in double. 
 * Parameter is rad, double is the return type the statement "double rad" is parameter data type. 
 * @author kharn
 * @parm rad
 */

public class Area {
    
        public void main(String[] args) {
      	  double radius = 5.0;
          double area;
          area = calculateArea(radius);
          System.out.println("The area is " + area); // whole line is Call and argument is inside ().
        }

        public double calculateArea(double rad) { 
          return Math.PI * rad * rad;
        }
      }
      /*Here the whole line is called Header. 
       * rad is parameter, double is return type,
       * double inside () is parameter data type.
       */

