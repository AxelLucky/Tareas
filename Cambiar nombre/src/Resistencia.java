/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propietario
 */
public class Resistencia {
    double ohms,intensidad,voltaje;
    String v,r,i;

    public Resistencia() {}
    
    public String CalculoResistencia(String i,String v){
        intensidad=Double.parseDouble(i);
        voltaje=Double.parseDouble(v);
        ohms=voltaje/intensidad;
        r=String.valueOf(ohms);
        return r;
    }

    public String getR() {
        return r;
    }
    
}
