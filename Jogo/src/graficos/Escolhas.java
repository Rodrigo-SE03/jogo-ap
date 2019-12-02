package graficos;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Escolhas {

	private JPanel panel_1 = new JPanel();
	private JButton opcao1 = new JButton();
	private JButton opcao2 = new JButton();
	private JButton opcao3 = new JButton();
	private JLabel txt = new JLabel();

	public JPanel getPanel_1() {
		return panel_1;
	}

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

		panel_1.setBounds(0, 0, 610, 438);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		txt.setText(tex);
		txt.setForeground(Color.BLACK);
		txt.setFont(new Font("Georgia", Font.BOLD, 25));
		txt.setBounds(50, 11, 532, 179);
		panel_1.add(txt);

		opcao1.setText(op1);
		opcao1.setBackground(new Color(246, 221, 59));
		opcao1.setForeground(Color.BLACK);
		opcao1.setFont(new Font("Georgia", Font.BOLD, 20));
		opcao1.setContentAreaFilled(true);
		opcao1.setBorderPainted(false);
		opcao1.setBorder(null);
		opcao1.setFocusPainted(false);
		opcao1.setBounds(33, 201, 532, 43);
		panel_1.add(opcao1);

		opcao2.setText(op2);
		opcao2.setBackground(new Color(246, 221, 59));
		opcao2.setForeground(Color.BLACK);
		opcao2.setFont(new Font("Georgia", Font.BOLD, 20));
		opcao2.setContentAreaFilled(true);
		opcao2.setBorderPainted(false);
		opcao2.setBorder(null);
		opcao2.setFocusPainted(false);
		opcao2.setBounds(33, 255, 532, 43);
		panel_1.add(opcao2);

		ImageIcon fund = new ImageIcon("src/imagens/fundo_dialogo1.png");
		fund.setImage(fund.getImage().getScaledInstance(panel_1.getSize().width, panel_1.getSize().height, 100));
		JLabel fundo = new JLabel(fund);
		fundo.setBounds(-5, -20, 610, 438);
		fundo.setVisible(true);
		panel_1.add(fundo);
		panel_1.setVisible(true);

	}

	public void doEscolhas_3(JFrame frame, String tex, String op1, String op2, String op3) {

		panel_1.setBounds(0, 0, 610, 438);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel txt = new JLabel(tex);
		txt.setForeground(Color.BLACK);
		txt.setFont(new Font("Georgia", Font.BOLD, 25));
		txt.setBounds(50, 11, 532, 179);
		panel_1.add(txt);

		opcao1.setText(op1);
		opcao1.setBackground(new Color(246, 221, 59));
		opcao1.setForeground(Color.BLACK);
		opcao1.setFont(new Font("Georgia", Font.BOLD, 20));
		opcao1.setContentAreaFilled(true);
		opcao1.setBorderPainted(false);
		opcao1.setBorder(null);
		opcao1.setFocusPainted(false);
		opcao1.setBounds(33, 201, 532, 43);
		panel_1.add(opcao1);

		opcao2.setText(op2);
		opcao2.setBackground(new Color(246, 221, 59));
		opcao2.setForeground(Color.BLACK);
		opcao2.setFont(new Font("Georgia", Font.BOLD, 20));
		opcao2.setContentAreaFilled(true);
		opcao2.setBorderPainted(false);
		opcao2.setBorder(null);
		opcao2.setFocusPainted(false);
		opcao2.setBounds(33, 255, 532, 43);
		panel_1.add(opcao2);

		opcao3.setText(op3);
		opcao3.setBackground(new Color(246, 221, 59));
		opcao3.setFont(new Font("Georgia", Font.BOLD, 20));
		opcao3.setForeground(Color.BLACK);
		opcao3.setBorderPainted(false);
		opcao3.setBorder(null);
		opcao3.setContentAreaFilled(true);
		opcao3.setFocusPainted(false);
		opcao3.setBounds(33, 309, 532, 43);
		panel_1.add(opcao3);

		ImageIcon fund = new ImageIcon("src/imagens/fundo_dialogo1.png");
		fund.setImage(fund.getImage().getScaledInstance(panel_1.getSize().width, panel_1.getSize().height, 100));
		JLabel fundo = new JLabel(fund);
		fundo.setBounds(-5, -20, 610, 438);
		fundo.setVisible(true);
		panel_1.add(fundo);
		panel_1.setVisible(true);

	}

}
