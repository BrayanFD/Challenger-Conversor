package Temperaturas;

import javax.swing.JOptionPane;
import Menus.MenuDeContinuar;
public class TemperaturasConversor {
	public static void Temperaturas() {

		double grados = Double.parseDouble(JOptionPane.showInputDialog("Ingresa los grados que deseas convertir: "));
		String[] Conversion = { "Celsius a Farenheit", "Celsius a kelvin", "Farenheit a Celsius", "Kelvin a Celsius",
				"Kelvin a Farenheit" };
		String opcion = (JOptionPane.showInputDialog(null, "Ingreseel valor de la temperatura que desas convertir",
				"Temperaturas", JOptionPane.PLAIN_MESSAGE, null, Conversion, "Celsius a Farenheit")).toString();

		double CaF = grados * 1.8 + 32;
		double CaK = grados + 273.15;
		double FaC = (grados - 32)/1.8;
		double KaC = grados - 273.15;
		double KaF = 1.8 * KaC + 32; 
		
		do {
			switch (opcion) {
			case "Celsius a Farenheit": 
				JOptionPane.showMessageDialog(null, grados + " Celsius son " + CaF + " Farenheit");
				MenuDeContinuar.Continuar();
				break;
				
			case "Celsius a kelvin":
				JOptionPane.showMessageDialog(null, grados + " Celsius son " + CaK + " Kelvin");
				MenuDeContinuar.Continuar();
				break;
				
			case "Farenheit a Celsius":
				JOptionPane.showMessageDialog(null, grados + " Farenheit son " + FaC + " Celsius");
				MenuDeContinuar.Continuar();
				break;
				
			case "Kelvin a Celsius":
				JOptionPane.showMessageDialog(null, grados + " Kelvin son " + KaC + " Celsius");
				MenuDeContinuar.Continuar();
				break;
				
			case "Kelvin a Farenheit":
				JOptionPane.showMessageDialog(null, grados + " Kelvin son " + KaF + " Farenheit");
				MenuDeContinuar.Continuar();
				break;
			}

		} while (opcion == "");

	}

}
