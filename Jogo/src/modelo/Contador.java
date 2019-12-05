package modelo;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Contador extends JDialog {

	private JPanel contentPanel = new JPanel();
	public Teste teste;
	private JLabel mortos;
	private JLabel passaram;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		try {
			Contador dialog = new Contador(new JFrame());
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */

	public Contador(JFrame frame) {
		super(frame);
		setAlwaysOnTop(true);
		setUndecorated(true);
		setEnabled(false);
		setSize(429, 117);
		setLocation(frame.getLocation());
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		mortos = new JLabel();
		mortos.setFont(new Font("Georgia", Font.BOLD, 25));
		mortos.setBounds(10, 11, 396, 44);
		contentPanel.add(mortos);

		passaram = new JLabel();
		passaram.setFont(new Font("Georgia", Font.BOLD, 25));
		passaram.setBounds(10, 66, 396, 44);
		contentPanel.add(passaram);

		setVisible(true);
		contar();
	}

	public void contar() {
		new Thread() {
			public void run() {
				while (teste.fase.isEmJogo()) {
					// System.out.println(teste.fase.getCont());
					mortos.setText("Inimigos mortos: " + teste.fase.getCont());
					passaram.setText("Inimigos que entraram: " + teste.fase.getContP());
				}
			}
		}.start();
	}

	public void passou() {
		new Thread() {
			public void run() {
				while (teste.fase.isEmJogo()) {

				}
			}
		}.start();
	}
}
