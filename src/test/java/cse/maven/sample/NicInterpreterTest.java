/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.maven.sample;

import junit.framework.TestCase;

/**
 *
 * @author Gayan
 */
public class NicInterpreterTest extends TestCase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test -- getYear method, of class NicInterpreter.
     */
    public void testGetYear() throws Exception {
        System.out.println("getYear");
        NicInterpreter instance = new NicInterpreter("920021166V");
        int expResult = 1992;
        int result = instance.getYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test -- getMonth method, of class NicInterpreter.
     */
    public void testGetMonth() throws Exception {
        System.out.println("getMonth");
        NicInterpreter instance = new NicInterpreter("920021166V");
        int expResult = 1;
        int result = instance.getMonth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test -- getDate method, of class NicInterpreter.
     */
    public void testGetDate() throws Exception {
        System.out.println("getDate");
        NicInterpreter instance = new NicInterpreter("920021166V");
        int expResult = 2;
        int result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test -- getGender method, of class NicInterpreter.
     */
    public void testGetGender() throws Exception {
        System.out.println("getGender");
        NicInterpreter instance = new NicInterpreter("920021166V");
        String expResult = "Male";
        String result = instance.getGender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test -- isVoter method, of class NicInterpreter.
     */
    public void testIsVoter() throws Exception {
        System.out.println("Voter");
        NicInterpreter instance = new NicInterpreter("920021166V");
        String expResult = "True";
        String result = instance.isVoter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
