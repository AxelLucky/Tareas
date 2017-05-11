
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propietario
 */
public class Calculoldo extends JFrame{
    public JLabel titulo=new JLabel("Escoje lo que deseas calcular");
    public JButton botoni=new JButton("Intensidad");
    public JButton botonr=new JButton("Resistencia");
    public JButton botonv=new JButton("Voltaje");
    public JTextField texti=new JTextField(" ");
    public JTextField textr=new JTextField(" ");
    public JTextField textv=new JTextField(" ");
    public JButton resultadoi=new JButton("Resultado");
    public JButton resultador=new JButton("Resultado");
    public JButton resultadov=new JButton("Resultado");
    public JButton limpiar=new JButton("Limpiar");
    String i,v,r;

    public Calculoldo() {
    init();
    }
    private void init(){
        setLayout(new GridLayout(3,1));
        setTitle("Mi ventana");
        setSize(200,800);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        botoni.addActionListener(new disenoi());
        botonr.addActionListener(new disenor());
        botonv.addActionListener(new disenov());
        resultadoi.addActionListener(new calculoi());
        resultador.addActionListener(new calculor());
        resultadov.addActionListener(new calculov());
        limpiar.addActionListener(new reinicio());
        add(titulo);
        add(botoni);
        add(botonr);
        add(botonv);
        add(texti);
        add(textr);
        add(textv);
        add(resultadoi);
        add(resultador);
        add(resultadov);
        add(limpiar);
        texti.setVisible(false);
        textr.setVisible(false);
        textv.setVisible(false);
        resultadoi.setVisible(false);
        resultador.setVisible(false);
        resultadov.setVisible(false);
        limpiar.setVisible(false);
    }
    private class disenoi implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            texti.enable(false);
            texti.setVisible(true);
            textr.enable(true);
            textr.setVisible(true);
            textv.enable(true);
            textv.setVisible(true);
            resultadoi.setVisible(true);
            resultador.setVisible(false);
            resultadov.setVisible(false);
            limpiar.setVisible(false);
        }
    }
    private class disenor implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            texti.enable(true);
            texti.setVisible(true);
            textr.enable(false);
            textr.setVisible(true);
            textv.enable(true);
            textv.setVisible(true);
            resultadoi.setVisible(false);
            resultador.setVisible(true);
            resultadov.setVisible(false);
            limpiar.setVisible(false);
        }
    }
    private class disenov implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            texti.enable(true);
            texti.setVisible(true);
            textr.enable(true);
            textr.setVisible(true);
            textv.enable(false);
            textv.setVisible(true);
            resultadoi.setVisible(false);
            resultador.setVisible(false);
            resultadov.setVisible(true);
            limpiar.setVisible(false);
        }
    }
    private class calculoi implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                r=textr.getText();
                v=textv.getText();
                Intensidad x=new Intensidad();
                x.CalculoIntensidad(v, r);
                texti.setText(x.getI());
                limpiar.setVisible(true);
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(rootPane,"Solo numeros");
            }
        }
    }
    private class calculor implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                i=texti.getText();
                v=textv.getText();
                Resistencia x=new Resistencia();
                x.CalculoResistencia(i, v);
                textr.setText(x.getR());
                limpiar.setVisible(true);
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(rootPane,"Solo numeros");
            }
        }
    }
    private class calculov implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                r=textr.getText();
                i=texti.getText();
                Voltaje x=new Voltaje();
                x.CalculoVoltaje(r, i);
                textv.setText(x.getV());
                limpiar.setVisible(true);
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(rootPane,"Solo numeros");
            }
        }
    }
    private class reinicio implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            texti.setText(" ");
            textr.setText(" ");
            textv.setText(" ");
        }
    }
}