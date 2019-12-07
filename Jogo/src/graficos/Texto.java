package graficos;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;

public class Texto {

	private JFrame frame;
	private JButton continuar;
	private JTextPane txt;
	private JLabel fundo;

	public JFrame getTexto() {
		return frame;
	}

	public JButton getContinuar() {
		return continuar;
	}

	public Texto() {
		initialize();
	}

	private void initialize() {

		frame = new JFrame();
		frame.setIconImage(new ImageIcon("src/imagens/Icone.png").getImage());
		frame.setSize(610, 438);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(0);
		frame.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent windowEvent) {
				if (JOptionPane.showConfirmDialog(null,
						"Tem certeza que deseja sair do jogo (todo seu progresso será perdido)?", "Sair",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});

		// botão continuar
		continuar = new JButton();
		continuar.setIcon(new ImageIcon("src/imagens/continuar1.png"));
		this.frame.getContentPane().add(continuar);

		// definição do texto da janela
		txt = new JTextPane();
		txt.setOpaque(false);
		txt.setEditable(false);
		this.frame.getContentPane().add(txt);

		// fundo
		ImageIcon fund = new ImageIcon("src/imagens/fundo_dialogo1.png");
		fund.setImage(fund.getImage().getScaledInstance(this.frame.getSize().width, this.frame.getSize().height, 100));
		fundo = new JLabel(fund);
		this.frame.getContentPane().add(fundo);
	}

	public void atualizaTexto(String tex) {

		// botão continuar
		this.frame.add(continuar);
		this.continuar.setLayout(null);
		this.continuar.setVisible(true);
		this.continuar.setBounds(430, 338, 150, 50);
		this.continuar.setContentAreaFilled(false);

		// definição do texto da janela
		this.txt.setText(tex);
		this.txt.setBounds(50, 50, 500, 400);
		this.txt.setFont(new Font("Georgia", Font.BOLD, 25));
		this.txt.setForeground(Color.black);
		this.txt.setVisible(true);
		this.frame.add(txt);

		// fundo
		this.frame.add(fundo);
		this.fundo.setVisible(true);
		this.fundo.setBounds(0, 0, 600, 400);
		this.frame.setVisible(true);
	}

	public void zerar() {
		this.continuar.setVisible(false);
		this.txt.setVisible(false);
		this.fundo.setVisible(false);
	}

}
