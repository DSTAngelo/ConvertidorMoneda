/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import javax.swing.JOptionPane;

/**
 * @author Dst_g
 * Convertidor de Divisa  a Pesos
 */
public class Divisa {
    public void pesosColombianos (double valor) {
        Conversor pesoColombia = new Conversor();
        String opcColombia = JOptionPane.showInputDialog(null, "Seleccion Divisa", "Conversor", 
			JOptionPane.PLAIN_MESSAGE,null, new Object[]
			{"Dolar a COP","Euro a COP","Libras Esterlinas a COP", "Yen Japonés a COP",
                        "Won sul-coreano a COP"},
        "Seleccione").toString();
			switch (opcColombia) {
                            case "Dolar a COP" -> {
                                pesoColombia.ConversorDolarPeso(valor);
                                System.out.println("Moneda Pesos");
                            }	
                            case "Euro a COP" -> {
				pesoColombia.ConversorEuroPeso(valor);
                                System.out.println("Moneda Pesos");
                            }
                            case "Libras Esterlinas a COP" -> {
				pesoColombia.ConversorLibraPeso(valor);
                                System.out.println("Moneda Pesos");
                            }
                            case "Yen Japonés a COP" -> {
				pesoColombia.ConversorYenPeso(valor);
                                System.out.println("Moneda Pesos");
                            }
                            case "Won sul-coreano a COP" -> {
				pesoColombia.ConversorWonPeso(valor);
                                System.out.println("Moneda Pesos");
                            }
		}
	}
    
}
