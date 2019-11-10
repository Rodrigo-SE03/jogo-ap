package graficos;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Escolhas {

	private JButton opcao1 = new JButton("op1");
	private JButton opcao2 = new JButton("op2");
	private JButton opcao3 = new JButton("op3");
	
	public JButton getOpcao1() {
		return opcao1;
	}

	public JButton getOpcao2() {
		return opcao2;
	}

	public JButton getOpcao3() {
		return opcao3;
	}
	
	public void doEscolhas_2(JFrame frame, String tex, String op1, String op2) {
		
		frame.setSize(610,438);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 610,438);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel txt = new JLabel(tex);
		txt.setForeground(Color.BLACK);
		txt.setFont(new Font("Georgia", Font.BOLD, 25));
		txt.setBounds(50, 11, 532, 179);
		panel_1.add(txt);
		
		opcao1.setText(op1);
		opcao1.setBackground(new Color(139, 69, 19));
		opcao1.setForeground(Color.BLACK);
		opcao1.setFont(new Font("Georgia", Font.BOLD, 20));
		opcao1.setContentAreaFilled(true);
		opcao1.setBorderPainted(false);
		opcao1.setBorder(null);
		opcao1.setFocusPainted(false);
		opcao1.setBounds(33, 201, 532, 43);
		panel_1.add(opcao1);
		
		opcao2.setText(op2);
		opcao2.setBackground(new Color(139, 69, 19));
		opcao2.setForeground(Color.BLACK);
		opcao2.setFont(new Font("Georgia", Font.BOLD, 20));
		opcao2.setContentAreaFilled(true);
		opcao2.setBorderPainted(false);
		opcao2.setBorder(null);
		opcao2.setFocusPainted(false);
		opcao2.setBounds(33, 255, 532, 43);
		panel_1.add(opcao2);

		JLabel fundo = new JLabel(new ImageIcon("src/imagens/fundo_dialogo.png"));
		fundo.setBounds(0,0,600,400);
		panel_1.add(fundo);
		panel_1.setVisible(true);
			
	}

	public void doEscolhas_3(JFrame frame, String tex, String op1, String op2, String op3) {
		
		frame.setSize(610,438);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 610,438);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel txt = new JLabel(tex);
		txt.setForeground(Color.BLACK);
		txt.setFont(new Font("Georgia", Font.BOLD, 25));
		txt.setBounds(50, 11, 532, 179);
		panel_1.add(txt);
		
		opcao1.setText(op1);
		opcao1.setBackground(new Color(139, 69, 19));
		opcao1.setForeground(Color.BLACK);
		opcao1.setFont(new Font("Georgia", Font.BOLD, 20));
		opcao1.setContentAreaFilled(true);
		opcao1.setBorderPainted(false);
		opcao1.setBorder(null);
		opcao1.setFocusPainted(false);
		opcao1.setBounds(33, 201, 532, 43);
		panel_1.add(opcao1);
		
		opcao2.setText(op2);
		opcao2.setBackground(new Color(139, 69, 19));
		opcao2.setForeground(Color.BLACK);
		opcao2.setFont(new Font("Georgia", Font.BOLD, 20));
		opcao2.setContentAreaFilled(true);
		opcao2.setBorderPainted(false);
		opcao2.setBorder(null);
		opcao2.setFocusPainted(false);
		opcao2.setBounds(33, 255, 532, 43);
		panel_1.add(opcao2);
		
		opcao3.setText(op3);
		opcao3.setBackground(new Color(139, 69, 19));
		opcao3.setFont(new Font("Georgia", Font.BOLD, 20));
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
		panel_1.setVisible(true);
			
	}
	
}
