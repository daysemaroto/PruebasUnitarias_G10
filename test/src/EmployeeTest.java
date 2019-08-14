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
    
    @Test
    public void testCalculateYearBonusWorker() {
        System.out.println("CalculateYearBonus");
        Employee instance = new Employee((float)450.00,"USD",(float)12.00,EmployeeType.Worker);
        float expResult = 386.0F;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.0);       
    }
    
    @Test
    public void testCsSupervisor() {
        System.out.println("cs");
        Employee instance = new Employee(1000.00F,"USD",150.0F,EmployeeType.Supervisor);
        float expResult = 1052.5F;
        float result = instance.cs();
        assertEquals(expResult, result,0.0);
    }

    
}
