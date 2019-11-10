package testes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class Escolha {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Escolha window = new Escolha("<html>O dia amanheceu. Voce acorda e se"
							+ "<br/>levanta de sua cama e sai de seu"
							+ "<br/> quarto.</html>","<html>opção 1<html>","<html>opção 2<html>","<html>opção 3<html>");
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
	public Escolha(String tex, String op1, String op2, String op3) {
		initialize(tex,op1,op2,op3);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String tex, String op1, String op2, String op3) {
		frame = new JFrame();
		frame.setSize(610,438);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent windowEvent) {
				if (JOptionPane.showConfirmDialog(null,
						"Tem certeza que deseja sair do jogo (todo seu progresso será perdido)?", "Sair",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		ImageIcon icone = new ImageIcon("src/imagens/Icone.png");
		frame.setIconImage(icone.getImage());
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(1, 1, 610,438);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel txt = new JLabel(tex);
		txt.setForeground(Color.BLACK);
		txt.setFont(new Font("Georgia", Font.BOLD, 25));
		txt.setBounds(33, 11, 532, 179);
		panel_1.add(txt);
		
		JButton opcao1 = new JButton(op1);
		opcao1.setBackground(new Color(139, 69, 19));
		opcao1.setForeground(Color.BLACK);
		opcao1.setFont(new Font("Georgia", Font.BOLD, 25));
		opcao1.setContentAreaFilled(true);
		opcao1.setBorderPainted(false);
		opcao1.setBorder(null);
		opcao1.setFocusPainted(false);
		opcao1.setBounds(33, 201, 532, 43);
		panel_1.add(opcao1);
		
		JButton opcao2 = new JButton(op2);
		opcao2.setBackground(new Color(139, 69, 19));
		opcao2.setForeground(Color.BLACK);
		opcao2.setFont(new Font("Georgia", Font.BOLD, 25));
		opcao2.setContentAreaFilled(true);
		opcao2.setBorderPainted(false);
		opcao2.setBorder(null);
		opcao2.setFocusPainted(false);
		opcao2.setBounds(33, 255, 532, 43);
		panel_1.add(opcao2);
		
		JButton opcao3 = new JButton(op3);
		opcao3.setBackground(new Color(139, 69, 19));
		opcao3.setFont(new Font("Georgia", Font.BOLD, 25));
		opcao3.setForeground(Color.BLACK);
		opcao3.setBorderPainted(false);
		opcao3.setBorder(null);
		opcao3.setContentAreaFilled(true);
		opcao3.setFocusPainted(false);
		opcao3.setBounds(33, 309, 532, 43);
		panel_1.add(opcao3);
		
		JLabel fundo = new JLabel(new ImageIcon("src/imagens/fundo_dialogo.png"));
		fundo.setBounds(0,0,600,400);
		panel_1.add(fundo);
	}
}
