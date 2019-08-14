/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author Dayse Maroto
 */
public class Main {
    
    
    public static void main(String[] args) {
                Employee instance = new Employee((float)450.00,"USD",(float)12.00,EmployeeType.Worker);

                System.out.println(instance.cs());
    }
}
