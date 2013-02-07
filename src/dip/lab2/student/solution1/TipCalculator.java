/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

public interface TipCalculator {
    public static final double GOOD_RATE = 0.20;
    public static final double FAIR_RATE = 0.15;
    public static final double POOR_RATE = 0.10;
    
    public abstract double getTip();
    
}
