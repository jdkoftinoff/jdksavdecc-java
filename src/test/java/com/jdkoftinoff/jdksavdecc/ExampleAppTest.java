package com.jdkoftinoff.jdksavdecc;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ExampleAppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ExampleAppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ExampleAppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testExampleApp()
    {
        assertTrue( true );
    }
}
