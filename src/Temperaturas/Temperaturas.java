package Temperaturas;
import Menus.Menu_Principal;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Temperaturas extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Temperaturas frame = new Temperaturas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Temperaturas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 390);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(107, 165, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Conversor de ");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblNewLabel.setBounds(22, 11, 161, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Temperaturas");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(32, 32, 130, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Grados");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(273, 14, 104, 30);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		textField.setBounds(371, 11, 86, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		JRadioButton CaF = new JRadioButton("Celsius a Fahrenheit");
		CaF.setBackground(new Color(107, 165, 180));
		CaF.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		CaF.setBounds(63, 127, 245, 36);
		contentPane.add(CaF);
		
		JRadioButton CaK = new JRadioButton("Celsius a kelvin");
		CaK.setBackground(new Color(107, 165, 180));
		CaK.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		CaK.setBounds(63, 155, 245, 35);
		contentPane.add(CaK);
		
		JRadioButton FaC = new JRadioButton("Fahrenheit a Celsius");
		FaC.setBackground(new Color(107, 165, 180));
		FaC.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		FaC.setBounds(63, 180, 245, 35);
		contentPane.add(FaC);
		
		JRadioButton KaC = new JRadioButton("Kelvin a Celsius");
		KaC.setBackground(new Color(107, 165, 180));
		KaC.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		KaC.setBounds(63, 209, 245, 35);
		contentPane.add(KaC);
		
		JRadioButton KaF = new JRadioButton("Kelvin a Fahrenheit");
		KaF.setBackground(new Color(107, 165, 180));
		KaF.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		KaF.setBounds(63, 236, 245, 36);
		contentPane.add(KaF);
		
		JButton btnNewButton_1 = new JButton("Volver");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu_Principal.main(null);
				
			}
		});
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		btnNewButton_1.setBounds(10, 305, 130, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Terminar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(WIDTH);
			}
		});
		btnNewButton_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		btnNewButton_2.setBounds(494, 305, 130, 35);
		contentPane.add(btnNewButton_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		textField_1.setBounds(248, 60, 376, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		ButtonGroup OP = new ButtonGroup();
		OP.add(CaF);
		OP.add(CaK);
		OP.add(FaC);
		OP.add(KaC);
		OP.add(KaF);
		
		JButton btnNewButton = new JButton("Convertir");
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Grados = Double.parseDouble(textField.getText());
				double GCaF = Grados * 1.8 + 32;
				double GCaK = Grados + 273.15;
				double GFaC = (Grados - 32)/1.8;
				double GKaC = Grados - 273.15;
				double GKaF = 1.8 * GKaC + 32; 
				
				
				if(CaF.isSelected() == true) {
					double resultado = GCaF;
					textField_1.setText(String.valueOf(Grados + " Celsius son " + resultado + " Fahrenheit"));
					OP.clearSelection();
					
				}else if(CaK.isSelected() == true) {
					double resultado = GCaK;
					textField_1.setText(String.valueOf(Grados + " Celsius son " + resultado + " Kelvin"));
					OP.clearSelection();
					
				}else if(FaC.isSelected() == true) {
					double resultado = GFaC;
					textField_1.setText(String.valueOf(Grados + " Fahrenheit son " + resultado + " Celsius"));
					OP.clearSelection();
					
				}else if(KaC.isSelected() == true) {
					double resultado = GKaC;
					textField_1.setText(String.valueOf(Grados + " Kelvin son " + resultado + " Celsius"));
					OP.clearSelection();
					
				}else if(KaF.isSelected() == true) {
					double resultado = GKaF;
					textField_1.setText(String.valueOf(Grados + " Kelvin son " + resultado + " Fahrenheit"));
					OP.clearSelection();
				}
			}
		});
		btnNewButton.setBounds(472, 12, 152, 35);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("Opciones: ");
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(32, 92, 130, 40);
		contentPane.add(lblNewLabel_4);
		
		JLabel GifTemperatura = new JLabel("s");
		GifTemperatura.setIcon(new ImageIcon("C:\\Users\\jesie\\OneDrive\\Documentos\\HTML5 y CSS3\\imagenes\\Imagenes del reto\\200.gif"));
		GifTemperatura.setBounds(362, 73, 201, 255);
		contentPane.add(GifTemperatura);
		
	}
}
