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
                Employee instance = new Employee(450.00F,"USD",12.00F,EmployeeType.Worker);
                System.out.println(instance.cs());
                
                
                Employee instance2 = new Employee(450.00F,"USD",12.00F,EmployeeType.Manager);
                System.out.println(instance2.cs());
    }
}
