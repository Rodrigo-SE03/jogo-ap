package enigmas;

import javax.swing.JFrame;
import javax.swing.JPanel;

import cenas.Hist_Arcan;
import cenas.Hist_Guerreior;
import graficos.Texto;
import personagens.Jogador;
import sons.Musica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cavalo {

	private JFrame frame;
	private boolean[] isSelect = new boolean[6];
	private int cont;
	private Musica musica;
	
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Cavalo window = new Cavalo(new Jogador(), new Texto());
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	public Cavalo(Jogador player, Texto t1) {
		for (int i = 0; i < 6; i++)
			isSelect[i] = false;
		initialize(player, t1);
		musica = new Musica();
		testaMusica();
	}

	private void initialize(Jogador player, Texto t1) {

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

		caixa.getTxt1().setText(
				 "\r\n O capitão te propõe o seguinte desafio:\r\n"
				+ "Equipes de cavalos estão participando de partidas do cabo de guerra. Todas as equipes são "
				+ "sorteadas a partir de um estábulo de oito cavalos. As três primeiras partidas terminam em empates, "
				+ "como mostrado:\r\n" + "\r\n" + "Jogo 1: A B C D x E F G H\r\n" + "Jogo 2: H C B x G A\r\n"
				+ "Jogo 3: D A x F H E\r\n" + "\r\n"
				+ "Se você deseja que a quarta partida também resulte em um empate, quais cavalos devem estar no time que "
				+ "está puxando contra E e F?\r\n" + "\r\n" + "Toque em um cavalo para adicioná-lo à equipe");

		caixa.resize(0, 100);

		frame.setIconImage(new ImageIcon("src/imagens/Icone.png").getImage());

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		ImageIcon cav_img = new ImageIcon("src/imagens/Cav.png");
		cav_img.setImage(cav_img.getImage().getScaledInstance(70, 70, 100));

		JButton[] cavalo = new JButton[6];
		for (cont = 0; cont < 6; cont++) {
			cavalo[cont] = new JButton();
			cavalo[cont].setContentAreaFilled(false);
			cavalo[cont].setFocusPainted(false);
			cavalo[cont].setBorderPainted(false);
			cavalo[cont].setBorder(null);
			cavalo[cont].setOpaque(false);
			cavalo[cont].setSelectedIcon(null);
			cavalo[cont].setSize(65, 70);
			cavalo[cont].addActionListener(new ActionListener() {
				int y = cont;

				public void actionPerformed(ActionEvent e) {
					if (isSelect[y]) {
						cavalo[y].setIcon(new ImageIcon());
						isSelect[y] = false;
					} else {
						cavalo[y].setIcon(cav_img);
						isSelect[y] = true;
					}
				}
			});
			panel.add(cavalo[cont]);
		}

		cavalo[0].setLocation(170, 116);
		cavalo[1].setLocation(234, 116);
		cavalo[2].setLocation(298, 116);
		cavalo[3].setLocation(170, 177);
		cavalo[4].setLocation(234, 177);
		cavalo[5].setLocation(298, 177);

		JButton confirmar = new JButton();
		confirmar.setFocusPainted(false);
		confirmar.setBorderPainted(false);
		confirmar.setBorder(null);
		confirmar.setContentAreaFilled(false);
		confirmar.setBounds(385, 300, 125, 85);
		confirmar.addActionListener(new ActionListener() {
			int k = 0;

			public void actionPerformed(ActionEvent e) {
				if (isSelect[3]) {
					for (int i = 0; i < 6; i++) {
						if (isSelect[i])
							k++;
					}
					if (k == 1) {

						JOptionPane.showMessageDialog(null,
								"Uau! Ninguém aqui do castelo tinha conseguido resolver isso."
										+ " Parabéns, é um dos nossos agora.");

						if (!player.isBonus_inicio()) {

							player.setBonus_inicio(true);
						}

						musica.stop();
						frame.dispose();
						caixa.getFrame().dispose();
						new Hist_Guerreior(player).guerreiro1(t1);

					} else {

						JOptionPane.showMessageDialog(null,
								"Hahaha, não é como se eu esperasse que você fosse conseguir, nem eu sei resolver isso."
										+ " Mas por ter tentado já está aceito, é um dos nossos agora.");

						musica.stop();
						caixa.getFrame().dispose();
						k = 0;
						vai(player, t1);

					}

				} else {

					JOptionPane.showMessageDialog(null,
							"Hahaha, não é como se eu esperasse que você fosse conseguir, nem eu sei resolver isso. "
									+ "Mas por ter tentado já está aceito, é um dos nossos agora.");

					musica.stop();
					caixa.getFrame().dispose();
					vai(player, t1);
				}
			}

		});
		panel.add(confirmar);

		ImageIcon enigma = new ImageIcon("src/imagens/Cavalo.png");
		enigma.setImage(enigma.getImage().getScaledInstance(513, 387, 100));
		JLabel Fundo = new JLabel();
		Fundo.setIcon(enigma);
		Fundo.setBounds(0, 0, 513, 387);
		panel.add(Fundo);

		frame.setVisible(true);

	}

	public void testaMusica() {

		new Thread() {
			public void run() {

				while (!frame.isVisible()) {
					System.out.println("");
				}
				musica.TocaMusica("src/sons/puzzle.wav");
				musica.setVolume(0.6f);
			}
		}.start();

	}

	private void vai(Jogador player, Texto t1) {

		JFrame pass = new JFrame();
		Thread delay = new Thread() {
			public void run() {

				pass.setIconImage(new ImageIcon("src/imagens/Icone.png").getImage());
				pass.setSize(556, 556);
				pass.setLocationRelativeTo(null);
				pass.setUndecorated(true);
				pass.setResizable(false);
				pass.setDefaultCloseOperation(0);

				JLabel gif = new JLabel(new ImageIcon("src/imagens/passagem.gif"));
				pass.getContentPane().add(gif);

				pass.setVisible(true);

			}
		};
		Thread jogo = new Thread() {
			public void run() {
				try {
					sleep(3800);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				pass.dispose();
				new Hist_Guerreior(player).guerreiro1(t1);
			}
		};
		delay.start();
		jogo.start();
		frame.dispose();
	}
}
