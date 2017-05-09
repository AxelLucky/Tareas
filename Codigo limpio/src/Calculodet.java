/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author Propietario
 */
public class Calculodet extends JFrame {
    public JLabel titulo=new JLabel ("Determinante de una matriz 3x3");
    public JLabel n1=new JLabel("1");
    public JLabel n2=new JLabel("2");
    public JLabel n3=new JLabel("3");
    public JLabel a=new JLabel("a");
    public JTextField a1=new JTextField (" ");
    public JTextField a2=new JTextField (" ");
    public JTextField a3=new JTextField (" ");
    public JLabel b=new JLabel("b");
    public JTextField b1=new JTextField (" ");
    public JTextField b2=new JTextField (" ");
    public JTextField b3=new JTextField (" ");
    public JLabel c=new JLabel("c");
    public JTextField c1=new JTextField (" ");
    public JTextField c2=new JTextField (" ");
    public JTextField c3=new JTextField (" ");
    public JButton resultado=new JButton("Resultado");
    public JTextField resultadotext=new JTextField(" ");
    public JButton limpiar=new JButton("Limpiar");
    public double pa1,pa2,pa3,pb1,pb2,pb3,pc1,pc2,pc3,det;
    /* Aqui colocaremos las variables numericas de las posiciones*/ 
    public String ca1,ca2,ca3,cb1,cb2,cb3,cc1,cc2,cc3,d;
    /*Aqui almacenaremos las cadenas de estas posiciones */

    public Calculodet() {
    init();
    }
    private void init(){
        setLayout(new GridLayout(3,1));
        setTitle("Mi ventana");
        setSize(600,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        resultado.addActionListener(new calculo());
        limpiar.addActionListener(new reinicio());
        add(titulo);
        add(n1);
        add(n2);
        add(n3);
        add(a);
        add(a1);
        add(a2);
        add(a3);
        add(b);
        add(b1);
        add(b2);
        add(b3);
        add(c);
        add(c1);
        add(c2);
        add(c3);
        add(resultado);
        add(resultadotext);
        add(limpiar);
        resultadotext.enable(false);
    }
    private class calculo implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                ca1=a1.getText();
                ca2=a2.getText();
                ca3=a3.getText();
                cb1=b1.getText();
                cb2=b2.getText();
                cb3=b3.getText();
                cc1=c1.getText();
                cc2=c2.getText();
                cc3=c3.getText();  
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
                resultadotext.setText(d);
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(rootPane,"Introduce bien los datos");
            }
        }
    }
    private class reinicio implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            a1.setText(" ");
            a2.setText(" ");
            a3.setText(" ");
            b1.setText(" ");
            b2.setText(" ");
            b3.setText(" ");
            c1.setText(" ");
            c2.setText(" ");
            c3.setText(" ");
            resultadotext.setText(" ");
        //To change body of generated methods, choose Tools | Templates.
        }
    
    }
}
