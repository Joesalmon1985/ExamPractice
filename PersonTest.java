// import java.io.*; I can't make this work. Could it be I'm using bluej?
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PersonTest.
 *
 * @author  Joe Salmon
 * @version 1.1
 */
public class PersonTest
{
    /**
     * Default constructor for test class PersonTest
     */
    public PersonTest()
    {
        Person fred_smith, mary_jones;
        fred_smith = new Person ("Fred", "Smith");
        mary_jones = new Person ("Jones");
    }


    @Test
    public void Person()
    {
    }

    @Test
    public void getInitials()
    {
        String testInitialsSS;
	String testInitialsJ;
	String testemptyPerson;
	String testvoidPerson;
        Person sarah_smith;
	Person susan_jones;
	Person emptyPerson;
	Person nullPerson;
        sarah_smith = new Person ("Sarah", "Smith");
        susan_jones = new Person ("Jones");
	emptyPerson = new Person ("");
	nullPerson = new Person (null);
        testInitialsSS = sarah_smith.getInitials();
        testInitialsJ = susan_jones.getInitials();
	testInitialsEmpty = emptyPerson.getInitals();
	testInitialsNull = nullPerson.getInitals();
        assertEquals("SS", testInitialsSS);
        assertEquals("J", testInitialsJ);
	assertEquals("",testInitialsEmpty);
	assertEquals("",testInitialsNull);
       
    }
    
    @Test
    public void getName()
    {
        String testNameFS;
	String testNameMJ;
        String testemptyPerson;
	String testvoidPerson;
        Person fred_smith;
	Person emptyPerson;
	Person nullPerson;
	Person mary_jones;
        fred_smith = new Person ("Fred", "Smith");
        mary_jones = new Person ("Jones");
	emptyPerson = new Person ("");
	nullPerson = new Person (null); 
        testNameFS = fred_smith.getName();
        testNameMJ = mary_jones.getName();
	testNameNull = nullPerson.getName();
	testNameEmpty = emptyPerson.getName();
        assertEquals("Fred Smith", testNameFS);
        assertEquals("Jones", testNameMJ);
	assertEquals("", testNameEmpty);
	assertEquals("", testNameNull);
    }
        
    // testing printReverse seems very tricky, I'm not sure how to capture console output into a String.
    @Test
    public void printReverse()
    {
        String testReverseSS;
	String testReverseJ;
	String testprint;
        
	Person sarah_smith, susan_jones;
        sarah_smith = new Person ("Sarah", "Smith");
        susan_jones = new Person ("Jones");
//	testprint = new OutputStream(sarah_smith.printReverse());
    }
        
}


