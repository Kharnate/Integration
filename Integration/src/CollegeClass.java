
public class CollegeClass {
 
  private String name; 
  private int credits;
  private String[ ] roster;
  
  public String getName() {
    return name;
  }
  
  public void setName (String name) {
    this.name = name;
  }
  
  public CollegeClass () {
    name = "Not Set";
    credits = 0;
    roster = new String [60] ;
  }
  
  public CollegeClass (String name, int credits, String [ ] roster) {
    this.name = name;
    this.credits = credits;
    this.roster = roster;
  }
}
