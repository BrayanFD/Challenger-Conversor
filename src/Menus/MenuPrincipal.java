package Menus;

import javax.swing.JOptionPane;
import Divisas.DivisasConversor;
import Temperaturas.TemperaturasConversor;

public class MenuPrincipal {
	
	public static void PrincipalMenu() {
		
		String[] Conversor = {"Conversor de Moneda","Conversor de Temperatura"};
		String MP = (JOptionPane.showInputDialog(null,"Selecione una opción de conversion","Menu",JOptionPane.PLAIN_MESSAGE,null, Conversor,"Conversor de Monedas")).toString();
		String opcion;
		
		do {
			opcion = MP;
			
		switch(opcion) {
		
			case "Conversor de Moneda" : DivisasConversor.Monedas(); break;
			
			case "Conversor de Temperatura":  TemperaturasConversor.Temperaturas(); break;
			
			}
			
		}while(MP == "Selecion");
		
	}
	
	public static void main(String[] args) {
		
		PrincipalMenu();
	}

}
