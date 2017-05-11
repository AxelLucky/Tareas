/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propietario
 */
public class Determinante{
    public double pa1,pa2,pa3,pb1,pb2,pb3,pc1,pc2,pc3,det;
    /* Aqui colocaremos las variables numericas de las posiciones*/ 
    public String ca1,ca2,ca3,cb1,cb2,cb3,cc1,cc2,cc3,d;



    /*Aqui almacenaremos las cadenas de estas posiciones */

    /**
     *
     * @param ca1
     * @param ca2
     * @param ca3
     * @param cb1
     * @param cb2
     * @param cb3
     * @param cc1
     * @param cc2
     * @param cc3
     * @return
     */

    public String determinantes(String ca1,String ca2,String ca3,String cb1,String cb2,String cb3, String cc1,String cc2,String cc3){
                pa1=Double.parseDouble(ca1);
                pa2=Double.parseDouble(ca2);
                pa3=Double.parseDouble(ca3);
                pb1=Double.parseDouble(cb1);
                pb2=Double.parseDouble(cb2);
                pb3=Double.parseDouble(cb3);
                pc1=Double.parseDouble(cc1);
                pc2=Double.parseDouble(cc2);
                pc3=Double.parseDouble(cc3);
                det=(pa1*pb2*pc3)+(pa2*pb3*pc1)+(pa3*pb1*pc2);
                det=det-(pa3*pb2*pc1)-(pa2*pb1*pc2)-(pa1*pb3*pc3);        
                d=String.valueOf(det); 
                return d;
    }

    public String getD() {
        return d;
    }
    
}
