/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author salma
 */
public class TriangleTest {
    
    public TriangleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getA method, of class Triangle.
     */
    //@Test
    public void testGetA() {
        //System.out.println("getA");
        Triangle instance = new Triangle(3,4,5);
        int expResult =3 ;
        int result = instance.getA();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        //fail forces original function to fail
    }

    /**
     * Test of getB method, of class Triangle.
     */
    //@Test
    public void testGetB() {
        //System.out.println("getB");
        Triangle instance = new Triangle(3,4,5);
        int expResult = 4;
        int result = instance.getB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getC method, of class Triangle.
     */
    //@Test
    public void testGetC() {
        //System.out.println("getC");
        Triangle instance = new Triangle(3,4,5);
        int expResult = 5;
        int result = instance.getC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of allPositive method, of class Triangle.
     */
    @Test
    public void testAllPositive() {
        System.out.println("allPositive");
        Triangle instance = new Triangle(3,-4,5);
        boolean expResult = true;
        boolean result = instance.allPositive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isValid method, of class Triangle.
     */
    //@Test
    public void testIsValid() {
        System.out.println("isValid");
        Triangle instance = new Triangle(0,4,5);
        boolean expResult = true;
        boolean result = instance.isValid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Triangle.
     */
    //@Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Triangle.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
