
package javaapplication1;

import javax.swing.JOptionPane;

/**
 *
 * @author Dst_g
 */
public class General {
    public static void main(String[] args) {
        Opciones conversion = new Opciones();
        Divisa conversionDos = new Divisa();
        
        
        while(true){
        
            String caja;
                caja = JOptionPane.showInputDialog(null, "Selecciona", "Convertidores", 
                    JOptionPane.PLAIN_MESSAGE,null, new Object[]
                    {"Divisas", "Temperaturas"}, "Escoja su Opcion").toString();
            switch (caja){
                case "Divisas" -> {
                    System.out.println("Ingreso a Divisas");
                    String opcion;
                    opcion = JOptionPane.showInputDialog(null, "Selecciona", "Divisas", 
                            JOptionPane.PLAIN_MESSAGE,null, new Object[]
                            {"Conversor de Peso a Divisa", "Conversor de Divisa a Peso"}, "Escoja su Opcion").toString();
                    
                    if ("Conversor de Peso a Divisa".equals(opcion)){
                        System.out.println("Resultado peso a Divisa ");
                        String input;
                        try{
                            input = JOptionPane.showInputDialog(null, "Ingrese el Valor en Pesos"); 
                            double valorInput = Double.parseDouble(input);
                            conversion.conversion(valorInput); 
                        }catch(NumberFormatException ex){
                            JOptionPane.showMessageDialog(null,"No es un dato Valido Salir...");
                            
                        }
                            
                    }
                    else if ("Conversor de Divisa a Peso".equals(opcion)) {
                        System.out.println("Resultado Divisa a Peso");
                        String input;
                        try{
                        input = JOptionPane.showInputDialog(null, "Ingrese el Valor en Divisa"); 
                        double valorInput = Double.parseDouble(input);
                        conversionDos.pesosColombianos(valorInput);
                         }catch(NumberFormatException ex){
                            JOptionPane.showMessageDialog(null,"No es un dato Valido");
                    }
                    
                    int seleccion = JOptionPane.showConfirmDialog(null, "Desea Continuar");  
			if (seleccion == JOptionPane.YES_OPTION) {
                            System.out.println("");				
                            }
			else if (seleccion == JOptionPane.NO_OPTION) {
                            System.exit(0);	
			}
                    }
		}
                
                case "Temperaturas" -> {
                    System.out.println("Ingreso a Temperatura");
                
                }
            }
        }
    }
}
    

