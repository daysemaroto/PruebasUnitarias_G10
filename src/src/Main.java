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
                
                
                Employee instance3 = new Employee(450.00F,"USD",12.00F,EmployeeType.Manager);
                System.out.println(instance3.cs());


                System.out.println(instance.cs());
                
                System.out.println(instance.CalculateYearBonus());
                
                Employee instance2 = new Employee(1000.00F,"USD",150.0F,EmployeeType.Supervisor);

                System.out.println(instance2.cs());
                System.out.println(instance2.CalculateYearBonus());

    }
}
