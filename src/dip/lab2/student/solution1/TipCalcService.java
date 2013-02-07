/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

public class TipCalcService {
    private TipCalculator tipCalculator;
    
    public TipCalcService(){
        
    }
    
    public TipCalcService(TipCalculator t){
        tipCalculator = t;
    }
    
    public void setTipCalculator(TipCalculator t){
        if(t == null){
            throw new NullPointerException();
        }
        
        tipCalculator = t;
    }
    
    public double getTip(){
        return tipCalculator.getTip();
    }
    
    public static double getTipFromCalculator(TipCalculator t){
        return t.getTip();
    }
}
