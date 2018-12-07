/*Private fields, public getters and setters.
 * A constructor with and without parameters.
 * Overload a method.
 * Describe inheritance and its benefits.
 * Use super and to access objects and constructors.
 */

/**Represents a students enrolled in the school.
 * A student can be enrolled in many courses. 
 * @author kharn
 */
public class CollegeClass {

/**
 * The first and last name of this student with credits. 
 */
  // fields
  private String name;
  private int credits;
  private String[] roster;

  /**
   * Gets the first and last name of this student.
   * @return name
   */
  // accessors
  public String getName() {
    return name;
  }
/**
 * Changes the name of this student.
 * This may involve a lengthy legal process.
 * @param name 
 * This studen't new name. Should include both first and last name.
 */
  // mutator
  public void setName(String name) {
    this.name = name;
  }
/**
 * Default value for this student.
 */
  // constructor without parameter
  public CollegeClass() {
    name = "Not Set";
    credits = 0;
    roster = new String[60];
  }
/**
 * Storing Student's details. 
 * @param name
 * @param credits
 * @param roster
 */
  // overloaded
  public CollegeClass(String name, int credits, String[] roster) {
    this.name = name;
    this.credits = credits;
    this.roster = roster;

    /*
     * Inheritance: To create a new class and there is already a class that includes some of the
     * code that you want, you can derive your new class from the existing class. In doing this, you
     * can reuse the fields and methods of the existing class without having to write them.
     */
  
  }

}
