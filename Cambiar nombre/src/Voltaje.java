/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propietario
 */
public class Voltaje{
    double ohms,intensidad,voltaje;
    String v,r,i;

    public Voltaje() {}
    
    /**
     *
     * @param r
     * @param i
     * @return
     */
    public String CalculoVoltaje(String r,String i){
                ohms=Double.parseDouble(r);
                intensidad=Double.parseDouble(i);
                voltaje=intensidad*ohms;
                v=String.valueOf(voltaje);
                return v;
    }   

    public String getV() {
        return v;
    }
    
}
