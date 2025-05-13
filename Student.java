/**
 * Represents a student's scores in CS 111
 * 
 * @author Catherine Walker
 *
 **/

/* UML CLASS DIAGRAM:
-----------------------------------------
Student
-----------------------------------------
- name : String
- email : String
- unitDeliverables : int
- hasE : boolean
- labs : int
- engagementPoints : int
-----------------------------------------
+ Student()
+ Student(name : String, email : String, unitDeliverables : int, hasE : boolean, labs : int, ePs : int)
+ Student(original : Student)
+ Student(all : String)  
+ setName(name : String) : void
+ setEmail(email : String) : void
+ setUnitDeliverables(uDs : int) : void
+ setHasE(hasE : boolean) : void
+ setLabs(labs : int) : void
+ setEngagementPoints(ePs : int) : void
+ setAll(name : String, email : String, unitDeliverables : int, hasE : boolean, labs : int, ePs : int)
+ geName() : String
+ getEmail() : String
+ getUnitDeliverables() : int
+ getHasE() : boolean
+ getLabs() : int
+ getEngagementPoints() : int
+ toString() : String
+ equals(other : Student) : boolean
-----------------------------------------
*/

public class Student
{
  /***** INSTANCE VARIABLES *****/
  private String name;
  private String email;
  private int unitDeliverables;
  private boolean hasE;
  private int labs;
  private int engagementPoints;

  /***** CONSTRUCTORS *****/
  /**DESCRIPTION: No-argument constructor. Sets all instance variables to default values.*/
  public Student()
  {
    this.setAll("unknown","unknown",0,false,0,0);
  }
  
  /**DESCRIPTION: Full constructor. Sets all instance variables to corresponding parameters.*/
  public Student(String name, String email, int uDs, boolean hasE, int labs, int ePs)
  {
    this.setAll(name, email, uDs, hasE, labs, ePs);
  }

  /**DESCRIPTION: Copy constructor. Creates a deep copy of the parameter Student by setting instance variables to same values as original.*/
  public Student(Student original)
  {
    if(original != null)
    {
      this.setAll(original.name, original.email, original.unitDeliverables, original.hasE, original.labs, original.engagementPoints);
    }
    else
    {
      System.out.println("ERROR: attempt to copy null Student. Exiting.");
      System.exit(0);
    }
    
  }

  /***** MUTATORS *****/
  /**DESCRIPTION: Sets the name instance variable to parameter.*/
  public void setName(String name)
  {
    this.name = name;
  }

  /**DESCRIPTION: Sets the email instance variable to parameter.*/
  public void setEmail(String email)
  {
    this.email = email;
  }

  /**DESCRIPTION: Sets the unitDeliverables instance variable to parameter.*/
  public void setUnitDeliverables(int unitDeliverables)
  {
    this.unitDeliverables = unitDeliverables;
  }

  /**DESCRIPTION: Sets the hasE instance variable to parameter.*/
  public void setHasE(boolean hasE)
  {
    this.hasE = hasE;
  }

  /**DESCRIPTION: Sets the labs instance variable to parameter.*/
  public void setLabs(int labs)
  {
    this.labs = labs;
  }

  /**DESCRIPTION: Sets the engagementPoints instance variable to parameter.*/
  public void setEngagementPoints(int engagementPoints)
  {
    this.engagementPoints = engagementPoints;
  }

  /**DESCRIPTION: Sets all instance variables to the corresponding parameters.*/
  public void setAll(String name, String email, int uDs, boolean hasE, int labs, int ePs)
  {
    this.name = name;
    this.email = email;
    this.unitDeliverables = uDs;
    this.hasE = hasE;
    this.labs = labs;
    this.engagementPoints = ePs;
  }

  /***** ACCESSORS *****/
  /**DESCRIPTION: Returns the name instance variable.*/
  public String getName()
  {
    return name;
  }

  /**DESCRIPTION: Returns the email instance variable.*/
  public String getEmail()
  {
    return email;
  }

  /**DESCRIPTION: Returns the unitDeliverables instance variable.*/
  public int getUnitDeliverables()
  {
    return unitDeliverables;
  }

  /**DESCRIPTION: Returns the hasE instance variable.*/
  public boolean getHasE()
  {
    return hasE;
  }

  /**DESCRIPTION: Returns the labs instance variable.*/
  public int getLabs()
  {
    return labs;
  }

  /**DESCRIPTION: Returns the engagementPoints instance variable.*/
  public int getEngagementPoints()
  {
    return engagementPoints;
  }

  /***** OTHER REQUIRED METHODS *****/
  /**DESCRIPTION: Returns a String representation of the calling Student object as comma separated values.*/
  public String toString()
  {
    return String.format("%s,%s,%d,%b,%d,%d",name, email, unitDeliverables, hasE, labs, engagementPoints);
  }

  /**DESCRIPTION: Returns true if all instance variables of the calling Student object are equal to all instance variables of the parameter Student.*/
  public boolean equals(Student other)
  {
    if(other == null)
    {
      return false;
    }
    else
    {
      return this.name.equals(other.name)
        && this.email.equals(other.email)
        && this.unitDeliverables == other.unitDeliverables
        && this.hasE == other.hasE
        && this.labs == other.labs
        && this.engagementPoints == other.engagementPoints;
    }
  }

  /***** HELPER METHODS *****/ //These are not required, but can be helpful for this project
  /**DESCRIPTION: Prints array of Student type to console.*/
  public static void displayStudents(Student... students)
  {
    for(int i = 0; i < students.length; i++)
    {
      if(students[i] == null)
      {
        System.out.printf("students[%d] is %s%n",i,"null");
      }
      else
      {
        System.out.printf("students[%d] is %s%n",i,students[i].toString());
      }  
    }
  }
  
}