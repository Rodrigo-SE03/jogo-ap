package enigmas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class Texto_enigma {

	private JFrame frame;
	private JTextPane txt1;
	private JLabel fundo;
	private ImageIcon icon;

	public JTextPane getTxt1() {
		return txt1;
	}

	public void setTxt1(JTextPane txt1) {
		this.txt1 = txt1;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public Texto_enigma() {
		initialize();
	}

	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 607, 417);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setIconImage(new ImageIcon("src/imagens/Icone.png").getImage());
		frame.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent windowEvent) {
				if (JOptionPane.showConfirmDialog(null,
						"Tem certeza que deseja sair do jogo (todo seu progresso ser� perdido)?", "Sair",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		frame.setUndecorated(true);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		txt1 = new JTextPane();
		txt1.setForeground(Color.BLACK);
		txt1.setCaretColor(Color.BLACK);
		txt1.setEditable(false);
		txt1.setFont(new Font("Georgia", Font.BOLD, 18));
		txt1.setOpaque(false);
		txt1.setBounds(49, 57, 499, 268);
		panel.add(txt1);

		icon = new ImageIcon("src/imagens/caixa_de_texto_enigma.png");
		fundo = new JLabel();
		fundo.setIcon(icon);
		fundo.setBounds(0, 0, 591, 380);
		panel.add(fundo);

		frame.setVisible(true);
	}

	public void resize(int x, int y) {
		frame.setSize(frame.getSize().width + x, frame.getSize().height + y);
		txt1.setSize(txt1.getSize().width + x, txt1.getSize().height + y);
		fundo.setSize(fundo.getWidth() + x, fundo.getHeight() + y);
		icon.setImage(icon.getImage().getScaledInstance(icon.getIconWidth() + x, icon.getIconHeight() + y, 100));
		fundo.setIcon(icon);
	}
}
