
/**
 * This class is an attempt to answer a mock exam question. 
 * It has been updated with feedback from reddit/r/javahelp.
 * @author Joe Salmon 
 * @version 1.1
 */

public class Person
{
    // instance variables for a persons first and second name
    private String firstName;
    private String secondName;

    /**
     * Constructor for objects of class Person
     */
    public Person(String newFirstName, String newSecondName)
    {
        // Sets first and second name to the given arguments.
        this.firstName = newFirstName;
        this.secondName = newSecondName;
    }

        public Person(String newSecondName)
    {
        // Sets the second name to the given argument while leaving first name 
        // blank.
        this("", newSecondName);
    }
    
    /**
     * Setter and getter methods for obects of class Person.
     */
    
    // gets the first and second initial.
    public String getInitials()
    {
        String firstInitial = "", secondInitial = "";
        if (!firstName.equals(""))
        {
            firstInitial = this.firstName.substring(0,1);
        }
                if (!secondName.equals(""))
        {
            secondInitial = this.secondName.substring(0,1);
        }
    return firstInitial + secondInitial;
    }

    // gets the first name and second name, with a space between them.
    public String getName ()
    {
        String firstName = this.firstName;
	String secondName = this.secondName;
        return (firstName + " " + secondName).trim();
    }
    public void printReverse()
    {
	System.out.println(new this.StringBuilder(getName().reverse());
    }
}
