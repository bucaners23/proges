package LUAD;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login_2 {

	private JFrame frame;
	private JTextField txtNom;
	private JPasswordField txtCon;
	private JButton btnIng;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_2 window = new Login_2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login_2() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NOMBRE");
		lblNewLabel.setBounds(10, 50, 104, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setBounds(10, 90, 104, 14);
		frame.getContentPane().add(lblContrasea);
		
		txtNom = new JTextField();
		txtNom.setBounds(145, 47, 171, 20);
		frame.getContentPane().add(txtNom);
		txtNom.setColumns(10);
		
		txtCon = new JPasswordField();
		txtCon.setBounds(145, 87, 171, 20);
		frame.getContentPane().add(txtCon);
		
		btnIng = new JButton("INGRESAR");
		btnIng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					DataUsu x=new DataUsu();
					x.setNombre(txtNom.getText());
					x.setContraseña(txtCon.getText());
					if(x.login()) {
						JOptionPane.showMessageDialog(null, "Bienvenido");
						//Barrita b=new Barrita();
						//frame.setVisible(false);
					}else {
						JOptionPane.showMessageDialog(null, "Incorrecot");
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Correo o contra incorrecta");

				}
			}
		});
		btnIng.setBounds(102, 140, 89, 23);
		frame.getContentPane().add(btnIng);
	}

}
