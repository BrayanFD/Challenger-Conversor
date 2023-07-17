package Menus;

import javax.swing.JOptionPane;

public class MenuDeContinuar {
	
public static void Continuar() {
		
		int Con = JOptionPane.showConfirmDialog(null, "¿Desa continuar?");
		
		if(Con == 0) {
			
			MenuPrincipal.PrincipalMenu();
				
		}else if(Con == 1) {
			JOptionPane.showMessageDialog(null, "Programa Terminado");
		}else {
			JOptionPane.showMessageDialog(null, "Programa Terminado");
		}
	}
}
