/*Private fields, public getters and setters.
 * A constructor with and without parameters.
 * Overload a method.
 * Describe inheritance and its benefits.
 * Use super and to access objects and constructors.
 */

public class CollegeClass {

  // fields
  private String name;
  private int credits;
  private String[] roster;

  // accessors
  public String getName() {
    return name;
  }

  // mutator
  public void setName(String name) {
    this.name = name;
  }

  // constructor without parameter
  public CollegeClass() {
    name = "Not Set";
    credits = 0;
    roster = new String[60];
  }

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
