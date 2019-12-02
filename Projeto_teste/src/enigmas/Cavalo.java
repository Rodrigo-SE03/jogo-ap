package enigmas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cavalo {

	private JFrame frame;
	private boolean[] select = new boolean[6];
	private int cont;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cavalo window = new Cavalo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Cavalo() {
		for (int i = 0; i < 6; i++)
			select[i] = false;
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 527, 423);
		frame.setResizable(false);
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

		Texto_enigma caixa = new Texto_enigma();
		caixa.getFrame().setBounds(frame.getX() + frame.getWidth() + 100, frame.getY(), caixa.getFrame().getWidth(),
				caixa.getFrame().getHeight());
		caixa.getTxt1().setText("\r\n"
				+ "Equipes de cavalos estão participando de partidas do cabo de guerra. Todas as equipes são sorteadas a partir de um estábulo de oito cavalos. As três primeiras partidas terminam em empates, como mostrado:\r\n"
				+ "\r\n" + "Jogo 1: A B C D x E F G H\r\n" + "Jogo 2: H C B x G A\r\n" + "Jogo 3: D A x F H E\r\n"
				+ "\r\n"
				+ "Se você deseja que a quarta partida também resulte em um empate, quais cavalos devem estar no time que está puxando contra E e F?\r\n"
				+ "\r\n" + "Toque em um cavalo para adicioná-lo à equipe");
		caixa.resize(0, 100);

		ImageIcon icone = new ImageIcon("src/imagens/Icone.png");
		frame.setIconImage(icone.getImage());

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		ImageIcon cav_img = new ImageIcon("src/imagens/Cav.png");
		cav_img.setImage(cav_img.getImage().getScaledInstance(70, 80, 100));

		JButton[] bot = new JButton[6];
		for (cont = 0; cont < 6; cont++) {
			bot[cont] = new JButton();
			bot[cont].setContentAreaFilled(false);
			bot[cont].setFocusPainted(false);
			bot[cont].setBorderPainted(false);
			bot[cont].setBorder(null);
			bot[cont].setOpaque(false);
			bot[cont].setSelectedIcon(null);
			bot[cont].setSize(65, 70);
			bot[cont].addActionListener(new ActionListener() {
				int y = cont;

				public void actionPerformed(ActionEvent e) {
					if (select[y]) {
						bot[y].setIcon(new ImageIcon());
						select[y] = false;
					} else {
						bot[y].setIcon(cav_img);
						select[y] = true;
					}
				}
			});
			panel.add(bot[cont]);
		}

		
		bot[0].setLocation(170, 118);
		bot[1].setLocation(234, 118);
		bot[2].setLocation(298, 118);
		bot[3].setLocation(170, 179);
		bot[4].setLocation(234, 179);
		bot[5].setLocation(298, 179);
                                 
		JButton btnNewButton = new JButton();
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBorder(null);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.addActionListener(new ActionListener() {
			int k = 0;

			public void actionPerformed(ActionEvent e) {
				if (select[3]) {
					for (int i = 0; i < 6; i++) {
						if (select[i])
							k++;
					}
					if (k == 1) {
						JOptionPane.showMessageDialog(null, "nice");
					} else {
						JOptionPane.showMessageDialog(null, "errrrrrrrrou");
						k = 0;
					}
				} else {
					JOptionPane.showMessageDialog(null, "errrrrrrrrou");
				}
			}
		});
		btnNewButton.setBounds(385, 300, 125, 85);
		panel.add(btnNewButton);

		ImageIcon enigma = new ImageIcon("src/imagens/Cavalo.png");
		enigma.setImage(enigma.getImage().getScaledInstance(513, 387, 100));
		JLabel Fundo = new JLabel();
		Fundo.setIcon(enigma);
		Fundo.setBounds(0, 0, 513, 387);
		panel.add(Fundo);
	}

}
