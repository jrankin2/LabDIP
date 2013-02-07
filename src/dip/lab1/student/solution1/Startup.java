package dip.lab1.student.solution1;

import dip.lab1.*;
import java.text.NumberFormat;

/**
 * Just a start and test class for this program. You may modify this class
 * in any way you see fit.
 *
 * @author jlombardo
 */
public class Startup {

    public static void main(String[] args) {
        /*
         * We'll just use this class for testing our ccde.
         * We'll provide input and get some output...
         */

        //Low-level modules
        HourlyEmployee emp1 = new HourlyEmployee(10.50, 2020);
        SalariedEmployee emp2 = new SalariedEmployee(45000, 1250);
        SalariedEmployee emp3 = new SalariedEmployee(90000,0);
        
        Employee[] employees = {emp1, emp2, emp3};
        
        
        // High-level module
        HRService hr = new HRService();
        
        for(Employee e : employees){
            //this
            hr.setEmployee(e);
            System.out.println(hr.getAnnualCompensationForEmployee());
            
            
            //or this...
            System.out.println(HRService.getAnnualCompensationForEmployee(e));
        }
        
    }

}
