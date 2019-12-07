package testes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Teste {

	private Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
	private JFrame frame;
	private JButton continuar;
	private JLabel txt;
	private JLabel fundo;
	private ImageIcon fund = new ImageIcon("src/imagens/fundo_dialogo.png");
	private JLabel backGround;
	private ImageIcon back;

	/**
	 * Launch the application.
	 */
//		public static void main(String[] args) {
//			EventQueue.invokeLater(new Runnable() {
//				public void run() {
//					try {
//						Yo window = new Yo();
//						window.frame.setVisible(true);
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
//				}
//			});
//		}

	/**
	 * Create the application.
	 */
	public Teste() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(size);
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
		ImageIcon icone = new ImageIcon("src/imagens/Icone.png");
		frame.setIconImage(icone.getImage());

		// botão continuar
		continuar = new JButton();
		continuar.setIcon(new ImageIcon("src/imagens/continuar.png"));
		this.frame.getContentPane().add(continuar);
		this.continuar.setLayout(null);
		this.continuar.setVisible(true);
		this.continuar.setBounds(430, 338, 150, 50);
		this.continuar.setContentAreaFilled(false);

		// definição do texto da janela
		txt = new JLabel();
		this.txt.setText("Carapaça");
		this.txt.setSize(50, 52);
		this.txt.setLocation((size.width / 2) - (txt.getBounds().width / 2),
				(size.height / 2) - (txt.getBounds().height / 2));
		this.txt.setFont(new Font("Georgia", Font.BOLD, 25));
		this.txt.setForeground(Color.black);
		frame.getContentPane().add(txt);

		// fundo
		fund.setImage(fund.getImage().getScaledInstance(this.frame.getSize().width, this.frame.getSize().height, 100));
		fundo = new JLabel(fund);
		this.frame.getContentPane().add(fundo);
		this.fundo.setBounds(new Rectangle(96, 0, 498, 399));

		backGround = new JLabel();
		this.frame.getContentPane().add(backGround);
		this.backGround.setBounds(0, 0, size.width, size.height);
		this.frame.setVisible(true);

	}

	public JFrame getTexto() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JButton getContinuar() {
		return continuar;
	}

	public void setContinuar(JButton continuar) {
		this.continuar = continuar;
	}

	public JLabel getTxt() {
		return txt;
	}

	public void setTxt(JLabel txt) {
		this.txt = txt;
	}

	public JLabel getFundo() {
		return fundo;
	}

	public void setFundo(JLabel fundo) {
		this.fundo = fundo;
	}

	public void atualizaTexto(String tex, int pulalinha) {

		// botão continuar
		this.frame.add(continuar);
		this.continuar.setLayout(null);
		this.continuar.setVisible(true);
		this.continuar.setSize(150, 50);
		this.continuar.setLocation((size.width / 2) + 200, (size.height / 2) + 200);
		this.continuar.setContentAreaFilled(false);

		// definição do texto da janela
		this.txt.setText(tex);
		this.txt.setSize(500, 30 * (1 + pulalinha));
		this.txt.setLocation((size.width / 2) - (txt.getBounds().width / 2), 150);
		this.txt.setFont(new Font("Georgia", Font.BOLD, 25));
		this.txt.setForeground(Color.black);
		this.txt.setVisible(true);
		frame.getContentPane().add(txt);

		// fundo

		fund.setImage(fund.getImage().getScaledInstance(txt.getBounds().width + 64, txt.getBounds().height + 40, 100));
		fundo.setIcon(fund);
		this.fundo.setVisible(true);
		this.fundo.setBounds(txt.getBounds().x - 20, txt.getBounds().y - 20, txt.getBounds().width + 40,
				txt.getBounds().height + 40);
		this.frame.add(fundo);

		back = new ImageIcon("src/imagens/quarto.png");
		back.setImage(back.getImage().getScaledInstance(size.width, size.height, 100));
		backGround.setIcon(back);
		this.backGround.setVisible(true);
		this.frame.getContentPane().add(backGround);
		this.backGround.setBounds(0, 0, size.width, size.height);

		this.frame.setVisible(true);
	}

	public void zerar() {
		this.continuar.setVisible(false);
		this.txt.setVisible(false);
		this.fundo.setVisible(false);
	}

}
