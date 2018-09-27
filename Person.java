
/**
 * This class is an attempt to answer a mock exam question. 
 * It has been updated with feedback from reddit/r/javahelp.
 * @author Joe Salmon 
 * @version 1.1
 */

public class Person
{
    // instance variables - replace the example below with your own
    private String firstName, secondName;

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
    
    // gets the first and second inital.
    public String getInitals()
    {
        String firstInital = "", secondInital = "";
        if (!firstName.equals(""))
        {
            firstInital = this.firstName.substring(0,1);
        }
                if (!secondName.equals(""))
        {
            secondInital = this.secondName.substring(0,1);
        }
    return firstInital + secondInital;
    }

    // gets the first name and second name, with a space between them.
    public String getName ()
    {
        String firstName = "", secondName = ""; 
        // this gap will become a space if there is a first name.
        String gap = "";
        if (!this.firstName.equals(""))
        {
            firstName = this.firstName;
            gap = " ";
        }
                if (!this.secondName.equals(""))
        {
            secondName = this.secondName;
        }        
        return firstName + gap + secondName;
    }
    public void printReverse()
    {
        int lengthWord = 0;
        String toReturn = "";
        char[] reversed = new char[0];
        
        // this creats a char array the length of the second name, and populates
        // it in reverse order.
        lengthWord = this.secondName.length();
        reversed = new char[lengthWord];
        for (int i =0; i < lengthWord; i++)
        {
            reversed[i] = this.secondName.charAt(lengthWord-i-1);
        }
        // this takes the array and converts it into a string.
        toReturn = new String(reversed);
        
        // this takes the array and resets it to the length of the first name, and
        // populates it in reverse order.
        lengthWord = this.firstName.length();
        reversed = new char[lengthWord];
        for (int i =0; i < lengthWord; i++)
        {
            reversed[i] = this.firstName.charAt(lengthWord-i-1);
        }
        
        // this takes the array and converts it to a string sticking it onto to
        // the second name already reversed.
        toReturn = toReturn + " " + new String(reversed) ;
        System.out.println (toReturn);
    }
}
