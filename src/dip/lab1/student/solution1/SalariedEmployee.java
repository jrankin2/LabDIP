package dip.lab1.student.solution1;

import dip.lab1.*;

/**
 * A simple implementation sub-class of Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class SalariedEmployee implements Employee {

    /** default constructor. Is this the best way to go? */
    public SalariedEmployee() {}
    private double annualSalary;
    private double annualBonus;
    
    public SalariedEmployee(double annualSalary, double annualBonus) {
        this.annualSalary = annualSalary;
        this.annualBonus = annualBonus;
    }
    
    public double getAnnualWages(){
        return annualSalary + annualBonus;
        
    }
    
    public double getAnnualSalary() {
        return annualSalary;
    }
    
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    
    public double getAnnualBonus() {
        return annualBonus;
    }
    
    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }
    
}
