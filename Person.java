
/**
 * This class is an attempt to answer a mock exam question. 
 * It has been updated with feedback from reddit/r/javahelp.
 * @author Joe Salmon 
 * @version 1.1
 */
import java.lang.*;
public class Person
{
    // instance variables for a persons first and second name
    private String firstName;
    private String secondName;

    /**
     * Constructor for objects of class Person
     */
    public Person(String firstName, String secondName)
    {
        // Sets first and second name to the given arguments.
        this.firstName = firstName;
        this.secondName = secondName;
    }

        public Person(String secondName)
    {
        // Sets the second name to the given argument while leaving first name 
        // blank.
        this("", secondName);
        if (secondName == null)
        {
            this.secondName = "";
        }    
    }
    
    /**
     * Setter and getter methods for obects of class Person.
     */
    
    // gets the first and second initial.
    public String getInitials()
    {
        String firstInitial = ""; 
        String secondInitial = "";
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
        StringBuilder str = new StringBuilder(this.getName());
        System.out.println(str);
    }
}
