package Divisas;

import javax.swing.JOptionPane;
import Menus.MenuDeContinuar;

public class DivisasConversor {
	
	public static void Monedas() {
		
		double euro =  4565.82 ;
		double dolar = 4159.25 ;
		double libra = 5340.89 ;
		double Yen = 29.27 ;
		double Won = 3.20;
		double Peuro =  0.00022 ;
		double Pdolar = 0.00024;
		double Plibra = 0.00019;
		double PYen = 0.034;
		double PWon = 0.31;
		
		double r = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: "));
		String[] Conversion = {"Peso COL a Dólar","Peso COL a Euro","Peso COL a Libra Esterlinas","Peso COL a Yen Japonés","Peso COL a Won sul-coreano","Dólar a Peso COL", 
				"Euro a Peso COL","Libra Esterlinas a Peso COL","Yen Japonés a Peso COL","Won sul-coreano a Peso COL"};
		String lo = (JOptionPane.showInputDialog(null,"Elije la monea que deseas convertir tu dinero","Monedas",JOptionPane.PLAIN_MESSAGE,null, Conversion,"Peso COL a Euro")).toString();
		String opcion;
		
		do {
			opcion = lo;
			switch(opcion) {
			case "Peso COL a Dólar": JOptionPane.showMessageDialog(null, "Tienes $"+r*dolar+" Dolares");
			MenuDeContinuar.Continuar();
			break;
			
			case "Peso COL a Euro": JOptionPane.showMessageDialog(null, "Tienes $"+r*euro+" Euros");
			MenuDeContinuar.Continuar();
			break;
			
			case "Peso COL a Libra Esterlinas": JOptionPane.showMessageDialog(null, "Tienes $"+r*libra+" Libra Esterlinas");
			MenuDeContinuar.Continuar();
			break;
			
			case "Peso COL a ": JOptionPane.showMessageDialog(null, "Tienes $"+r*Yen+" Yen Japonés");
			MenuDeContinuar.Continuar();
			break;
			
			case "Peso COL a Won sul-coreano": JOptionPane.showMessageDialog(null, "Tienes $"+r*Won+" Won sul-coreano");
			MenuDeContinuar.Continuar();
			break;
			
			case "Dólar a Peso COL" : JOptionPane.showMessageDialog(null, "Tienes $"+r*Pdolar+" Pesos Colombianos");
			MenuDeContinuar.Continuar();
			break;
			
			case  "Euro a Peso COL": JOptionPane.showMessageDialog(null, "Tienes $"+r*Peuro+" Pesos Colombianos");
			MenuDeContinuar.Continuar();
			break;
			
			case  "Libra Esterlinas a Peso COL" : JOptionPane.showMessageDialog(null, "Tienes $"+r*Plibra+" Pesos Colombianos");
			MenuDeContinuar.Continuar();
			break;
			
			case "Yen Japonés a Peso COL" : JOptionPane.showMessageDialog(null, "Tienes $"+r*PYen+" Pesos Colombianos");
			MenuDeContinuar.Continuar();
			break;
			
			case "Won sul-coreano a Peso COL" : JOptionPane.showMessageDialog(null, "Tines $"+r*PWon+" Pesos Colombianos");
			MenuDeContinuar.Continuar();
			break;

			}
		}while(lo == "");
	}
}
