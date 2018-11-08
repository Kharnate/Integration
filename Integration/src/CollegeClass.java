
public class CollegeClass {
 
  //fields
  private String name; 
  private int credits;
  private String[ ] roster;
  
  //accessors
  public String getName() {
    return name;
  }
  
  //mutator
  public void setName (String name) {
    this.name = name;
  }
  
  //constructor without parameter
  public CollegeClass () {
    name = "Not Set";
    credits = 0;
    roster = new String [60] ;
  }
  
  //overloaded
  public CollegeClass (String name, int credits, String [ ] roster) {
    this.name = name;
    this.credits = credits;
    this.roster = roster;
  }
  
}
