package dip.lab1.student.solution1;

import dip.lab1.*;
import javax.swing.JOptionPane;

/**
 * A high-level class that delegates to employee objects to do the work. Does
 * this class design follow the DIP? If not, fix it.
 *
 * @author your name goes here
 */
public class HRService {
    private Employee employee;
    
    public HRService(){
        
    }
    
    public HRService(Employee e){
        employee = e;
    }
    
    public void setEmployee(Employee e){
        employee = e;
    }
    
    public double getAnnualCompensationForEmployee(){
            return employee.getAnnualWages();
    }
    
    public static double getAnnualCompensationForEmployee(Employee e) {
        return e.getAnnualWages();
    }
}
