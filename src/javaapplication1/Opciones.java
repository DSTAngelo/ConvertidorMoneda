/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import javax.swing.JOptionPane;

/**
 *@author Dst_g
 *Conversor de Opciones de Peso a Divisa
 */
public class Opciones {
    Conversor moneda = new Conversor();
    public void conversion(double valor) {
        String opciones = JOptionPane.showInputDialog(null, "Seleccion Divisa", "Conversor", 
			JOptionPane.PLAIN_MESSAGE,null, new Object[]
			{"COP a Dolar","COP a Euro","COP a  Libras Esterlinas", "COP a Yen Japonés",
                        "COP a Won sul-coreano"},
        "Seleccione").toString();
			switch (opciones) {
			case "COP a Dolar" -> {
				moneda.ConvertirMonedasDolar(valor);
                                System.out.println("moneda Dolar");
			}
                        case "COP a Euro" -> {
                                moneda.ConvertirMonedasEuro(valor);
                                System.out.println("moneda Euro");
                        }
                        case "COP a  Libras Esterlinas" -> {
                                moneda.ConvertirMonedasLibras(valor);
                                System.out.println("moneda Libra");
                        }
                        case "COP a Yen Japonés" -> {
                                moneda.ConvertirMonedasYen(valor);
                                System.out.println("moneda Yen");
                        }
                        case "COP a Won sul-coreano" -> {
                                moneda.ConvertirMonedasWon(valor);
                                System.out.println("moneda Won");
                        }
		}
	}
    
    
    
    
    
}
