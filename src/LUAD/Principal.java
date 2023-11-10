package LUAD;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Principal {

	private JFrame frmPaginaPrincipal;

	public static void main(String[] args) {
		Principal x=new Principal();
		x.frmPaginaPrincipal.setVisible(true);
	}

	public Principal() {
		initialize();
	}

	private void initialize() {
		frmPaginaPrincipal = new JFrame();
		frmPaginaPrincipal.setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/LUAD/logo.png")));
		frmPaginaPrincipal.setTitle("Pagina Principal");
		frmPaginaPrincipal.setBounds(100, 100, 1001, 577);
		frmPaginaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
