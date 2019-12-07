package modelo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import personagens.Jogador;

public class Teste extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Fase fase;

	// construtor
	public Teste(Jogador player) {
		ImageIcon icone = new ImageIcon("src/imagens/Icone.png");

		JLabel txtdica = new JLabel();
		txtdica.setFont(new Font("Georgia", Font.BOLD, 25));
		txtdica.setForeground(Color.black);
		txtdica.setText(
				"<html>Nesse desafio use as setas do teclado para mover - se e aperte \"A\" para atirar.<br/><br/>"
						+ "Seu objetivo é matar pelo menos 50 inimigos.<br/><br/>"
						+ "Se você for atingido, ou 50 inimigos passarem suas defesas, você perde<html>");
		txtdica.setBounds(50, 10, 500, 380);

		JDialog dica = new JDialog(this);
		dica.setIconImage(icone.getImage());
		dica.setModal(true);
		dica.setSize(610, 500);
		dica.setLocationRelativeTo(null);
		dica.add(txtdica);

		JButton continuar = new JButton();
		continuar.setIcon(new ImageIcon("src/imagens/continuar.png"));
		continuar.setLayout(null);
		continuar.setBounds(430, 400, 150, 50);
		continuar.setContentAreaFilled(false);
		continuar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dica.setVisible(false);

			}
		});
		dica.add(continuar);

		ImageIcon background = new ImageIcon("src/imagens/fundo_dialogo.png");
		background.setImage(background.getImage().getScaledInstance(610, 500, 100));

		JLabel back = new JLabel(background);
		back.setBounds(0, 0, 610, 500);
		dica.add(back);

		fase = new Fase(this, player);
		// tamanho
		setSize(1280, 1280);
		// localização no meio
		setLocationRelativeTo(null);
		// chamar fase
		add(fase);
		this.setIconImage(icone.getImage());
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent windowEvent) {
				if (JOptionPane.showConfirmDialog(null,
						"Tem certeza que deseja sair do jogo (todo seu progresso será perdido)?", "Sair",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});

		Contador cont = new Contador(this);
		cont.teste = this;
		cont.setLocation(this.getLocation());

		// titulo
		setTitle("Defesa de Helaria");

		// sair
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// não mexer na resolução
		this.setResizable(false);
		setVisible(true);
		dica.setVisible(true);

	}

	public static void main(String[] args) {
		new Teste(new Jogador());
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			// java.util.logging.Logger.getLogger(Contador.class.getName()).log(java.util.logging.Level.SEVERE,
			// null, ex);
		} catch (InstantiationException ex) {
			// java.util.logging.Logger.getLogger(Contador.class.getName()).log(java.util.logging.Level.SEVERE,
			// null, ex);
		} catch (IllegalAccessException ex) {
			// java.util.logging.Logger.getLogger(Contador.class.getName()).log(java.util.logging.Level.SEVERE,
			// null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			// java.util.logging.Logger.getLogger(Contador.class.getName()).log(java.util.logging.Level.SEVERE,
			// null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				// new Contador().setVisible(true);
			}
		});
	}
}
