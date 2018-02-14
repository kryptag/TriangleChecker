/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author florenthaxha
 */
public class TriangleCheckerTest {
    
    public TriangleCheckerTest() {
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
    
    @Test
    public void testTriangleRunner(){
        System.out.println("Triangle Runner");
        int a = 0;
        int b = 4;
        int c = 7;
        TriangleChecker instance = new TriangleChecker();
        String expResult = "Thats no Triangle";
        String result = instance.triangleRunner(a, b, c);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isEquilateral method, of class TriangleChecker.
     */
    @Test
    public void testIsEquilateral() {
        System.out.println("isEquilateral");
        int a = 4;
        int b = 4;
        int c = 4;
        TriangleChecker instance = new TriangleChecker();
        boolean expResult = true;
        boolean result = instance.isEquilateral(a, b, c);
        assertEquals(expResult, result);
    }

    /**
     * Test of isIsoscele method, of class TriangleChecker.
     */
    @Test
    public void testIsIsoscele() {
        System.out.println("isIsoscele");
        int a = 8;
        int b = 8;
        int c = 4;
        TriangleChecker instance = new TriangleChecker();
        boolean expResult = true;
        boolean result = instance.isIsoscele(a, b, c);
        assertEquals(expResult, result);
    }

    /**
     * Test of isScalene method, of class TriangleChecker.
     */
    @Test
    public void testIsScalene() {
        System.out.println("isScalene");
        int a = 5;
        int b = 7;
        int c = 11;
        TriangleChecker instance = new TriangleChecker();
        boolean expResult = true;
        boolean result = instance.isScalene(a, b, c);
        assertEquals(expResult, result);  
    }
    
}
