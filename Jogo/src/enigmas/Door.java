package enigmas;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Door {

	private JFrame frame;
	private JPanel[] panel = new JPanel[10];
	private JPanel cards;
	private JButton[][] portas = new JButton[10][4];
	private ActionListener passar, perder;
	private int cont = 0;

	public Door() {
		initialize();
	}

	private void initialize() {

		frame = new JFrame();
		frame.setSize(528, 423);
		frame.setResizable(false);
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
		ImageIcon icone = new ImageIcon("src/imagens/Icone.png");
		frame.setIconImage(icone.getImage());

		passar = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (cont == 10) {
					JOptionPane.showMessageDialog(null, "nice");
				} else {
					CardLayout cl = (CardLayout) (cards.getLayout());
					cl.show(cards, "" + cont);
				}
				cont++;

			}
		};

		perder = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "errrrrrrrrou");
			}

		};

		JButton continuar = new JButton();
		continuar.setIcon(new ImageIcon("src/imagens/continuar.png"));
		continuar.setLayout(null);
		continuar.setVisible(true);
		continuar.setBounds(350, 315, 150, 50);
		continuar.setContentAreaFilled(false);
		continuar.addActionListener(passar);

		// definição do texto da janela
		JLabel txt = new JLabel();
		txt.setText("<html>Enquanto voc\u00EA anda voc\u00EA v\u00E1rias " + "<br/>marca\u00E7\u00F5es:"
				+ "<br/><br/>1, 4, 3, 1, 4, 2, 3, 1, 3, 4<br/>" + "<br/>Ap\u00F3s mais algum tempo você "
				+ "<br/>encontra 4 diferentes portas." + "<html>");
		txt.setBounds(50, 52, 500, 200);
		txt.setFont(new Font("Georgia", Font.BOLD, 25));
		txt.setForeground(Color.black);

		// fundo
		ImageIcon fund = new ImageIcon("src/imagens/fundo_dialogo.png");
		fund.setImage(fund.getImage().getScaledInstance(frame.getSize().width, frame.getSize().height, 100));
		JLabel fundo = new JLabel(fund);
		fundo.setBounds(new Rectangle(0, 0, 515, 399));

		JPanel pan = new JPanel();
		pan.setLayout(null);
		pan.add(continuar);
		pan.add(txt);
		pan.add(fundo);

		criarPortas();

		cards = new JPanel(new CardLayout());
		cards.add(pan);
		for (int i = 0; i < 10; i++) {
			cards.add(panel[i], "" + i);
		}
		frame.getContentPane().add(cards, BorderLayout.CENTER);
		frame.setVisible(true);
	}

	public void criarPortas() {

		ImageIcon[] portaImg = new ImageIcon[4];
		ImageIcon[] portaAbtImg = new ImageIcon[4];
		for (int i = 0; i < 4; i++) {
			portaImg[i] = new ImageIcon("src/imagens/Port" + (i + 1) + ".png");
			portaImg[i].setImage(portaImg[i].getImage().getScaledInstance(120, 375, 100));

			portaAbtImg[i] = new ImageIcon("src/imagens/PortAbt" + (i + 1) + ".png");
			portaAbtImg[i].setImage(portaAbtImg[i].getImage().getScaledInstance(120, 375, 100));
		}
		boolean[] rand = new boolean[4];
		for (int i = 0; i < 4; i++) {
			rand[i] = false;
		}
		int x;
		for (int i = 0; i < panel.length; i++) {
			panel[i] = new JPanel();
			panel[i].setLayout(new GridLayout(1, 0, 0, 0));
			for (int j = 0; j < 4; j++) {
				do {
					x = new Random().nextInt(4);
				} while (rand[x]);
				rand[x] = true;
				portas[i][x] = new JButton();
				portas[i][x].addActionListener(perder);
				portas[i][x].setIcon(portaImg[x]);
				portas[i][x].setPressedIcon(portaAbtImg[x]);
				panel[i].add(portas[i][x]);
			}
			for (int j = 0; j < 4; j++) {
				rand[j] = false;
			}
		}

		portas[0][0].removeActionListener(perder);
		portas[1][3].removeActionListener(perder);
		portas[2][2].removeActionListener(perder);
		portas[3][0].removeActionListener(perder);
		portas[4][3].removeActionListener(perder);
		portas[5][1].removeActionListener(perder);
		portas[6][2].removeActionListener(perder);
		portas[7][0].removeActionListener(perder);
		portas[8][2].removeActionListener(perder);
		portas[9][3].removeActionListener(perder);

		portas[0][0].addActionListener(passar);
		portas[1][3].addActionListener(passar);
		portas[2][2].addActionListener(passar);
		portas[3][0].addActionListener(passar);
		portas[4][3].addActionListener(passar);
		portas[5][1].addActionListener(passar);
		portas[6][2].addActionListener(passar);
		portas[7][0].addActionListener(passar);
		portas[8][2].addActionListener(passar);
		portas[9][3].addActionListener(passar);

	}

}