/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propietario
 */
public class Intensidad{
    double ohms,intensidad,voltaje;
    String i,v,r;

    public Intensidad() {}
    
    public String CalculoIntensidad(String volt,String res){
                ohms=Double.parseDouble(res);
                voltaje=Double.parseDouble(volt);
                intensidad=voltaje/ohms;
                i=String.valueOf(intensidad);
                return i;
    }

    public String getI() {
        return i;
    }
}
