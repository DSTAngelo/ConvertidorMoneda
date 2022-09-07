/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import javax.swing.JOptionPane;

/**
 * @author Dst_g
 * Formulacion de Conversor
 */
public class Conversor {
    
    double monedaDolar = 4463;
    double monedaEuro = 4438;
    double monedaLibras = 5326.96;
    double monedaYen = 32.33;
    double monedaWon = 3.23;
    
    
    public void ConvertirMonedasDolar(double cantidad) {
			
	double dolar = cantidad / monedaDolar;
	dolar = (double) Math.round(dolar * 100d) / 100;
	JOptionPane.showMessageDialog(null,"Tienes $ "+ dolar + " Dolares");
        System.out.println(dolar + "Dolares");
    }
    
    public void ConvertirMonedasEuro(double cantidad) {
			
	double euro = cantidad / monedaEuro;
	euro = (double) Math.round(euro * 100d) / 100;
	JOptionPane.showMessageDialog(null,"Tienes $ "+ euro + " Euros");
        System.out.println(euro + "Euros ");
    }
    
    public void ConvertirMonedasLibras(double cantidad) {
			
	double libra = cantidad / monedaLibras;
	libra = (double) Math.round(libra * 100d) / 100;
	JOptionPane.showMessageDialog(null,"Tienes $ "+ libra + " Libras");
        System.out.println(libra + "Libras ");
    }
    
    public void ConvertirMonedasYen(double cantidad) {
			
	double yen = cantidad / monedaYen;
	yen = (double) Math.round(yen * 100d) / 100;
	JOptionPane.showMessageDialog(null,"Tienes $ "+ yen + " Yen");
        System.out.println(yen + " Yen ");
    }
    
    public void ConvertirMonedasWon(double cantidad) {
			
	double won = cantidad / monedaYen;
	won = (double) Math.round(won * 100d) / 100;
	JOptionPane.showMessageDialog(null,"Tienes $ "+ won + " Won");
        System.out.println(" Won " + won);
    }
    
    /*----------------------------------------------------------------------*/
    
    public void ConversorDolarPeso(double cantidad) {
			
	double peso  = (cantidad * monedaDolar);
	peso = (double) Math.round(peso * 100d) / 100;
	JOptionPane.showMessageDialog(null,"Tienes $ "+ peso + " Pesos");
        System.out.println(peso + "Pesos");
    }
    
    public void ConversorEuroPeso(double cantidad) {
			
	double peso  = (cantidad * monedaEuro);
	peso = (double) Math.round(peso * 100d) / 100;
	JOptionPane.showMessageDialog(null,"Tienes $ "+ peso + " Pesos");
        System.out.println(peso + "Pesos");
    }
    
    public void ConversorLibraPeso(double cantidad) {
			
	double peso  = (cantidad * monedaLibras);
	peso = (double) Math.round(peso * 100d) / 100;
	JOptionPane.showMessageDialog(null,"Tienes $ "+ peso + " Pesos");
        System.out.println(peso + "Pesos");
    }
    
    public void ConversorYenPeso(double cantidad) {
			
	double peso  = (cantidad * monedaYen);
	peso = (double) Math.round(peso * 100d) / 100;
	JOptionPane.showMessageDialog(null,"Tienes $ "+ peso + " Pesos");
        System.out.println(peso + "Pesos");
    }
    
    public void ConversorWonPeso(double cantidad) {
			
	double peso  = (cantidad * monedaWon);
	peso = (double) Math.round(peso * 100d) / 100;
	JOptionPane.showMessageDialog(null,"Tienes $ "+ peso + " Pesos");
        System.out.println(peso + "Pesos");
    }
}
