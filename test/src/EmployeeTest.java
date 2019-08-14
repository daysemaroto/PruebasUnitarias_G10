/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import org.junit.Test;
import static org.junit.Assert.*;
import static src.EmployeeType.Worker;

/**
 *
 * @author Dayse Maroto
 */
public class EmployeeTest {
    
    public EmployeeTest() {
    }

    /**
     * Test of cs method, of class Employee, para el tipo de Worker
     */
    @Test
    public void testCsWorker() {
        System.out.println("cs");
        Employee instance = new Employee((float)450.00,"USD",(float)12.00,EmployeeType.Worker);
        float expResult = 450.0F;
        float result = instance.cs();
        assertEquals(expResult, result,0.0);
    }

    /**
     * Test of cs method, of class Employee, para el tipo de Manager
     */
    @Test
    public void testCsManager() {
        Employee instance = new Employee(450.00F,"USD",12.00F,EmployeeType.Manager);
        float expResult = 458.4F;
        float result = instance.cs();
        assertEquals(expResult, result,0.0);
    }
//    /**
//     * Test of CalculateYearBonus method, of class Employee.
//     */
//    @Test
//    public void testCalculateYearBonus() {
//        System.out.println("CalculateYearBonus");
//        Employee instance = null;
//        float expResult = 0.0F;
//        float result = instance.CalculateYearBonus();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
