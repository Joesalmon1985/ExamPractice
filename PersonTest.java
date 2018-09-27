// import java.io.*; I can't make this work. Could it be I'm using bluej?
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PersonTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
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
    public void getInitals()
    {
        String testInitalsSS, testInitalsJ;
        Person sarah_smith, susan_jones;
        sarah_smith = new Person ("Sarah", "Smith");
        susan_jones = new Person ("Jones");
        testInitalsSS = sarah_smith.getInitals();
        testInitalsJ = susan_jones.getInitals();
        assertEquals("SS", testInitalsSS);
        assertEquals("J", testInitalsJ);
       
    }
    
    @Test
    public void getName()
    {
        String testNameFS, testNameMJ;
        Person fred_smith, mary_jones;
        fred_smith = new Person ("Fred", "Smith");
        mary_jones = new Person ("Jones");
        testNameFS = fred_smith.getName();
        testNameMJ = mary_jones.getName();
        assertEquals("Fred Smith", testNameFS);
        assertEquals("Jones", testNameMJ);
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


