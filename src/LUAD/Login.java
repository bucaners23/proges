package LUAD;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JPasswordField txtCon;
	private JTextField txtNom;
	private JButton btnAgr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 642, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(21, 65, 65, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña");
		lblNewLabel_1.setBounds(21, 101, 85, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtCon = new JPasswordField();
		txtCon.setBounds(133, 98, 160, 20);
		frame.getContentPane().add(txtCon);
		
		txtNom = new JTextField();
		txtNom.setBounds(133, 62, 162, 20);
		frame.getContentPane().add(txtNom);
		txtNom.setColumns(10);
		
		btnAgr = new JButton("Agregar");
		btnAgr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					DataUsu c = new DataUsu();
					c.setNombre(txtNom.getText());
					c.setContraseña(txtCon.getText());
					if (c.insertar()) {
						JOptionPane.showMessageDialog(null, "Ok");
					} else {
						JOptionPane.showMessageDialog(null, "ERROR");
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ERROR");
				}
			}
		});
		btnAgr.setBounds(17, 155, 89, 23);
		frame.getContentPane().add(btnAgr);
	}
}
