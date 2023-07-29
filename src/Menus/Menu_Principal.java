package Menus;
import Temperaturas.Temperaturas;
import Divisas.Divisas;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Menu_Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_Principal frame = new Menu_Principal();
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
	public Menu_Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(37, 46, 65));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ELIJA EL TIPO DE");
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(50, 11, 176, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CONVERSION ");
		lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(60, 49, 166, 14);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton Divisa = new JRadioButton("Divisa");
		Divisa.setForeground(Color.LIGHT_GRAY);
		Divisa.setBackground(new Color(37, 46, 65));
		Divisa.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		Divisa.setBounds(82, 121, 109, 23);
		contentPane.add(Divisa);
		
		JRadioButton Temperatura = new JRadioButton("Temperatura");
		Temperatura.setForeground(Color.LIGHT_GRAY);
		Temperatura.setBackground(new Color(37, 46, 65));
		Temperatura.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		Temperatura.setBounds(82, 159, 159, 23);
		contentPane.add(Temperatura);
		
		JButton btnNewButton = new JButton("Continuar");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setForeground(new Color(37, 46, 65));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Divisa.isSelected() == true) {
					Divisas.main(null);
						
			
				}else {
					Temperaturas.main(null);
					
				}
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		btnNewButton.setBounds(137, 327, 137, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setForeground(new Color(37, 46, 65));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(WIDTH);
			}
		});
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		btnNewButton_1.setBounds(10, 327, 89, 23);
		contentPane.add(btnNewButton_1);
		
		ButtonGroup radiobutons = new ButtonGroup();
		radiobutons.add(Divisa);
		radiobutons.add(Temperatura);
	}
}
