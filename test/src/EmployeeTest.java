/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dayse Maroto
 */
public class EmployeeTest {
    
    public EmployeeTest() {
    }

    /**
     * Test of cs method, of class Employee.
     */
    @Test
    public void testCs() {
        System.out.println("cs");
        Employee instance = null;
        float expResult = 0.0F;
        float result = instance.cs();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CalculateYearBonus method, of class Employee.
     */
    @Test
    public void testCalculateYearBonus() {
        System.out.println("CalculateYearBonus");
        Employee instance = null;
        float expResult = 0.0F;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}