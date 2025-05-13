/********************************************
*	AUTHORS:	Catherine Walker
*   COLLABORATORS: None
*	LAST MODIFIED:	04/19/2025
********************************************/

/********************************************
*	TESTER of Student
*   This program tests all methods of the Student class to verify they are working properly before Student is used in other programs (like UD 4).
********************************************/

public class Main 
{

  public static void main(String[] args)
  {
    /***** DECLARATION SECTION *****/
    Student[] students = new Student[10];

    /***** TEST CONSTRUCTORS *****/
    System.out.println("TESTING CONSTRUCTORS & toString");

    students[0] = new Student(); //test no-argument constructor
    students[1] = new Student();
    students[2] = new Student("John Doe", "plsgq@example.com", 3, true, 10, 45); //test full constructor
    //students[3] = new Student(students[9]); //test copy constructor. Should get controlled error. Comment out to test rest of code.
    students[3] = new Student(students[2]); //test copy constructor
    students[4] = new Student(students[2]);
    students[5] = new Student(students[2]);
    students[6] = new Student(students[2]);
    students[7] = new Student(students[2]);
    students[8] = new Student(students[2]);

    Student.displayStudents(students); //test toString() method and dislayStudents() method

    /***** TEST SETTERS & GETTERS *****/
    System.out.println("\nTESTING SETTERS & GETTERS");

    students[3].setName("Jane Doe");
    System.out.println("Name: " + students[3].getName());

    students[4].setEmail("tzirw@example.com");
    System.out.println("Email: " + students[4].getEmail());

    students[5].setUnitDeliverables(4);
    System.out.println("Unit Deliverables: " + students[5].getUnitDeliverables());

    students[6].setHasE(false);
    System.out.println("Has Extra Credit: " + students[6].getHasE());

    students[7].setLabs(12);
    System.out.println("Labs: " + students[7].getLabs());

    students[8].setEngagementPoints(75);
    System.out.println("Engagement Points: " + students[8].getEngagementPoints());

    students[0].setAll("John Doe", "plsgq@example.com", 3, true, 10, 45);
    System.out.println("All data: " + students[0].toString());

    /***** TESTING DEEP COPY *****/
    System.out.println("\nTESTING DEEP COPY");
    System.out.println("Note: students[2] should not have changed. students[3] through students[8] should have one variable changed.");
    Student.displayStudents(students);

    /***** TESTING EQUALS *****/
    System.out.println("\nTESTING EQUALS");
    System.out.println("Note: students[0] should equal itself and students[2]. All others are unequal.");
    for(int i = 0; i < students.length; i++)
    {
      System.out.printf("students[%d] == students[%d] is %b%n",0,i,students[0].equals(students[i]));
    }

  }

}