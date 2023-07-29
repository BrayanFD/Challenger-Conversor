package Divisas;

import java.awt.EventQueue;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

import Menus.Menu_Principal;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Divisas extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private double Euro =  4349.00;
	private double Dolar = 3940.56;
	private double Libra = 5062.04;
	private double Yen = 27.92;
	private double Won = 3.09;
	private double EuroAPeso =  0.00023;
	private double DolarAPeso = 0.00025;
	private double LibraAPeso = 0.00020;
	private double YenAPeso = 0.036;
	private double WonAPeso = 0.32;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Divisas frame = new Divisas();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Divisas() {
		setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 440);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cantidad");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(270, 11, 86, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(462, 14, 106, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("Opciones:");
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(45, 169, 109, 23);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("Finalizar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(WIDTH);
			}
		});
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		btnNewButton_1.setBounds(693, 367, 121, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Volver");
		btnNewButton_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu_Principal.main(null);
			}
		});
		btnNewButton_2.setBounds(20, 367, 121, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("Conversor de");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 30));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(20, 11, 212, 45);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Divisas");
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(74, 45, 121, 30);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		textField.setBounds(366, 12, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		textField_1.setBounds(578, 11, 105, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JRadioButton PaD = new JRadioButton("De Peso Colombiano a Dolar");
		PaD.setBackground(Color.WHITE);
		PaD.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		PaD.setBounds(22, 213, 388, 23);
		contentPane.add(PaD);
		
		JRadioButton PaE = new JRadioButton("De Peso Colombiano a Euros");
		PaE.setBackground(Color.WHITE);
		PaE.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		PaE.setBounds(22, 239, 388, 23);
		contentPane.add(PaE);
		
		JRadioButton PaL = new JRadioButton("De Peso Colombiano a Libras Esterlinas");
		PaL.setBackground(Color.WHITE);
		PaL.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		PaL.setBounds(22, 265, 388, 23);
		contentPane.add(PaL);
		
		JRadioButton PaY = new JRadioButton("De Peso Colombiano a Yen Japonés");
		PaY.setBackground(Color.WHITE);
		PaY.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		PaY.setBounds(22, 291, 388, 23);
		contentPane.add(PaY);
		
		JRadioButton PaW = new JRadioButton("De Peso Colombiano a Won sul-coreano");
		PaW.setBackground(Color.WHITE);
		PaW.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		PaW.setBounds(22, 317, 388, 23);
		contentPane.add(PaW);
		
		JRadioButton DaP = new JRadioButton("De Dólar a Peso Colombiano ");
		DaP.setBackground(Color.WHITE);
		DaP.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		DaP.setBounds(429, 213, 385, 23);
		contentPane.add(DaP);
		
		JRadioButton EaP = new JRadioButton("De Euros a Peso Colombiano ");
		EaP.setBackground(Color.WHITE);
		EaP.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		EaP.setBounds(429, 239, 385, 23);
		contentPane.add(EaP);
		
		JRadioButton LaP = new JRadioButton("De Libras Esterlinas a Peso Colombiano ");
		LaP.setBackground(Color.WHITE);
		LaP.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		LaP.setBounds(429, 265, 385, 23);
		contentPane.add(LaP);
		
		JRadioButton YaP = new JRadioButton("De Yen Japonésa Peso Colombiano ");
		YaP.setBackground(Color.WHITE);
		YaP.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		YaP.setBounds(429, 291, 385, 23);
		contentPane.add(YaP);
		
		JRadioButton WaP = new JRadioButton("De Won sul-coreano a Peso Colombiano");
		WaP.setBackground(Color.WHITE);
		WaP.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		WaP.setBounds(429, 317, 385, 23);
		contentPane.add(WaP);
		
		ButtonGroup Opciones = new ButtonGroup();
		Opciones.add(PaD);
		Opciones.add(PaE);
		Opciones.add(PaL);
		Opciones.add(PaY);
		Opciones.add(PaW);
		Opciones.add(DaP);
		Opciones.add(EaP);
		Opciones.add(LaP);
		Opciones.add(YaP);
		Opciones.add(WaP);
		
		JButton btnNewButton = new JButton("Convertir");
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cantidad = Double.parseDouble(textField.getText());
					
				if(PaD.isSelected() == true) {
					double resultado = cantidad * DolarAPeso;
					textField_1.setText(String.valueOf(resultado));
					Opciones.clearSelection();
					
				}else if(PaE.isSelected() == true) {
					double resultado = cantidad * EuroAPeso;
					textField_1.setText(String.valueOf(resultado));
					Opciones.clearSelection();
					
				}else if(PaL.isSelected() == true) {
					double resultado = cantidad * LibraAPeso;
					textField_1.setText(String.valueOf(resultado));
					Opciones.clearSelection();
	
				}else if(PaY.isSelected() == true) {
					double resultado = cantidad * YenAPeso;
					textField_1.setText(String.valueOf(resultado));
					Opciones.clearSelection();
					
				}else if(PaW.isSelected() == true) {
					double resultado = cantidad * WonAPeso;
					textField_1.setText(String.valueOf(resultado));
					Opciones.clearSelection();
					
				}else if(DaP.isSelected() == true) {
					double resultado = cantidad * Dolar;
					textField_1.setText(String.valueOf(resultado));
					Opciones.clearSelection();
					
				}else if(EaP.isSelected() == true) {
					double resultado = cantidad * Euro;
					textField_1.setText(String.valueOf(resultado));
					Opciones.clearSelection();
					
				}else if(LaP.isSelected() == true) {
					double resultado = cantidad * Libra;
					textField_1.setText(String.valueOf(resultado));
					Opciones.clearSelection();
					
				}else if(YaP.isSelected() == true) {
					double resultado = cantidad * Yen;
					textField_1.setText(String.valueOf(resultado));
					Opciones.clearSelection();
					
				}else if(WaP.isSelected() == true) {
					double resultado = cantidad * Won;
					textField_1.setText(String.valueOf(resultado));
					Opciones.clearSelection();
					
				}
			}
		});

		btnNewButton.setBounds(693, 11, 121, 23);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\jesie\\OneDrive\\Documentos\\HTML5 y CSS3\\imagenes\\Imagenes del reto\\coin-flip-57.gif"));
		label.setBounds(353, 45, 400, 177);
		contentPane.add(label);
	}
}
