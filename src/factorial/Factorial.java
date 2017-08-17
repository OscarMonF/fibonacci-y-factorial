/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author Alumno
 */
public class Factorial implements ActionListener{
private JFrame ventana;
    private JTextField N1, resultado;
    private JButton fact, fib;
    private Container cont;
    private String regresoCalc;
    /**
     * @param args the command line arguments
     */
    public Factorial(){
        //se crea la ventana
        ventana = new JFrame("Factorial y Serie Fibonacci");//establecer titulo
        ventana.setBounds(200, 200, 500, 500);//tamaño de la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);
        cont= ventana.getContentPane();
    }
    public void prendeApaga(boolean prendeApaga){
        muestraElementos();
        ventana.setVisible(true);
    }
    private void muestraElementos(){
        //cuadros de texto
        N1= new JTextField();
        N1.setBounds(10, 10, 120, 40);
        cont.add(N1); 
        
        resultado= new JTextField();
        resultado.setBounds(10, 110, 120, 40);
        cont.add(resultado);
        
         fact= new JButton();
        fact.setBounds(10, 160, 60, 40);
        fact.setText("Factorial");
        fact.addActionListener (this);
        cont.add(fact);
        
        fib= new JButton();
        fib.setBounds(80, 160, 60, 40);
        fib.setText("Fibonacci");
        fib.addActionListener(this);
        cont.add(fib);
    }
    
    public String calc(){
        return regresoCalc;
    }
    
@Override
    public void actionPerformed(ActionEvent e) {
        int Total=1;
        String tot;
        int n1,n2,result;
        
        
        if(e.getSource()== fact){
            int numero=1;
            String resu=N1.getText();
            int num = Integer.parseInt((N1.getText().toString()));
            while(numero<=num){
                Total=Total*numero;
                numero++;
            }
            
            tot=String.valueOf(Total);
            resultado.setText(tot);
        }
        else{
            if(e.getSource()== fib){
                
                int numero = 1;
                int num = Integer.parseInt((N1.getText().toString()));
                int fi[] = new int[num];
                fi[0] = 0;
     fi[1] = 1;
    for (int i = 2; i < num; i++) {
      fi[i] = fi[i - 1] + fi[i - 2];
            }
             
    tot=Arrays.toString(fi);
    resultado.setText(tot);
        
            }
        }
    }
}
