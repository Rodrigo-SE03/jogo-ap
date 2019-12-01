package enigmas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;

import cenas.Hist_Arcan;
import personagens.Jogador;
import sons.Musica;

public class Hidra {

	private JDialog cabeca[] = new JDialog[200];
	private JDialog coracao, relogio;
	private JFrame background;
	private JTextPane text;
	private Musica musica;
	private Jogador player;
	private boolean perdeu, ganhou, mtcabeca, hasCoracao;
	private int numb, numero, min, seg;
	private double time;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					@SuppressWarnings("unused")
					Hidra window = new Hidra(new Jogador());

					// window.frame[cont].setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */

	public Hidra(Jogador player) {
		this.player = player;
		this.time = 180000;
		this.min = 3;
		this.seg = 0;
		this.perdeu = false;
		this.ganhou = false;
		this.mtcabeca = false;
		this.hasCoracao = false;
		initialize();
		tempo();
	}

	private void initialize() {
		musica = new Musica();
		musica.TocaMusica("src/sons/musicaHidra.wav");
		musica.setVolume(0.7f);

		// Frame de fundo
		background = new JFrame();
		background.setIconImage(new ImageIcon("src/imagens/Icone.png").getImage());
		background.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		background.setLocationRelativeTo(null);
		background.setResizable(false);
		background.setDefaultCloseOperation(0);
		background.setLayout(null);
		background.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent windowEvent) {
				JFrame exiting = new JFrame();
				exiting.setAlwaysOnTop(true);
				if (JOptionPane.showConfirmDialog(exiting,
						"Tem certeza que deseja sair do jogo (todo seu progresso será perdido)?", "Sair",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
					System.exit(0);
				} else {
					exiting.dispose();
				}
			}
		});

		ImageIcon back1 = new ImageIcon("src/imagens/masmorra.jpg");
		back1.setImage(
				back1.getImage().getScaledInstance(background.getSize().width, background.getSize().height, 100));

		JLabel fundo = new JLabel(back1);
		fundo.setLocation(0, 0);
		fundo.setSize(background.getSize());
		fundo.setVisible(true);
		background.getContentPane().add(fundo);

		// Temporizador
		relogio = new JDialog(background);
		relogio.setSize(300, 150);
		relogio.setUndecorated(true);
		relogio.setAlwaysOnTop(true);
		relogio.setLocation(background.getLocation());

		text = new JTextPane();
		text.setBounds(0, 0, 300, 150);
		text.setOpaque(false);
		text.setFont(new Font("Georgia", Font.BOLD, 100));
		text.setForeground(Color.black);
		relogio.getContentPane().add(text);

		ImageIcon back = new ImageIcon("src/imagens/contador.png");
		back.setImage(back.getImage().getScaledInstance(relogio.getSize().width, relogio.getSize().height, 100));
		JLabel fundo1 = new JLabel(back);
		fundo1.setLocation(0, 0);
		fundo1.setSize(relogio.getSize());
		fundo1.setVisible(true);
		relogio.getContentPane().add(fundo1);

		// 7 cabacas iniciasis
		JLabel[] cabecaImg = new JLabel[7];
		for (numb = 0; numb < 7; numb++) {
			cabeca[numb] = new JDialog(background);
			cabeca[numb].setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			cabeca[numb].setResizable(false);
			cabeca[numb].setAlwaysOnTop(true);
			cabeca[numb].setSize(294, 275);
			cabeca[numb].setLocationRelativeTo(null);
			cabeca[numb].addWindowListener(new WindowAdapter() {
				int y = numb;

				public void windowClosing(java.awt.event.WindowEvent windowEvent) {
					numero = y;
					spawn();
				}
			});
			cabecaImg[numb] = new JLabel();
			cabecaImg[numb].setIcon(new ImageIcon(Hidra.class.getResource("/imagens/cabeca.png")));
			cabecaImg[numb].setBounds(0, 0, 278, 236);
			cabeca[numb].getContentPane().add(cabecaImg[numb]);

		}
		cabeca[0].setLocation(cabeca[0].getBounds().x - 290, cabeca[0].getBounds().y - (270 / 2) + 50);
		cabeca[1].setLocation(cabeca[1].getBounds().x, cabeca[1].getBounds().y - (270) + 50);
		cabeca[2].setLocation(cabeca[2].getBounds().x + 290, cabeca[2].getBounds().y - (270 / 2) + 50);
		cabeca[3].setLocation(cabeca[3].getBounds().x - 290, cabeca[3].getBounds().y + (270 / 2) + 50);
		cabeca[4].setLocation(cabeca[4].getBounds().x, cabeca[4].getBounds().y + (270) + 50);
		cabeca[5].setLocation(cabeca[5].getBounds().x + 290, cabeca[5].getBounds().y + (270 / 2) + 50);
		cabeca[6].setLocation(cabeca[6].getBounds().x, cabeca[6].getBounds().y + 50);

		// setvisibles
		cabeca[0].setVisible(true);
		cabeca[1].setVisible(true);
		cabeca[2].setVisible(true);
		cabeca[3].setVisible(true);
		cabeca[4].setVisible(true);
		cabeca[5].setVisible(true);
		cabeca[6].setVisible(true);
		relogio.setVisible(true);
		background.setVisible(true);
	}

	private void spawn() {

		if (!hasCoracao) {// Verifica se ja ha coraçao
			hasCoracao = true;
			inicializaCoracao();// Cria o coracao
		}

		JLabel[] cabecaImg = new JLabel[2];
		for (int i = 0; i < 2; i++) {// Cria as 2 novas cabeças
			cabeca[numb] = new JDialog(background);
			cabeca[numb].setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			cabeca[numb].setResizable(false);
			cabeca[numb].setAlwaysOnTop(true);
			cabeca[numb].setSize(294, 275);
			cabeca[numb].setLocationRelativeTo(null);
			cabeca[numb].addWindowListener(new WindowAdapter() {
				int y = numb;

				public void windowClosing(java.awt.event.WindowEvent windowEvent) {
					numero = y;
					spawn();
				}
			});
			cabecaImg[i] = new JLabel();
			cabecaImg[i].setIcon(new ImageIcon(Hidra.class.getResource("/imagens/cabeca.png")));
			cabecaImg[i].setBounds(0, 0, 278, 236);
			cabeca[numb].getContentPane().add(cabecaImg[i]);
			numb++;
		}
		cabeca[numb - 2].setBounds(cabeca[numero].getX() - 133 + new Random().nextInt(40) - 20,
				cabeca[numero].getY() + new Random().nextInt(40) - 20, cabeca[numero].getWidth(),
				cabeca[numero].getHeight());

		cabeca[numb - 1].setBounds(cabeca[numero].getX() + 133 + new Random().nextInt(40) - 20,
				cabeca[numero].getY() + new Random().nextInt(80) - 40, cabeca[numero].getWidth(),
				cabeca[numero].getHeight());

		if (cabeca[numb - 2].getLocation().y <= 50)
			cabeca[numb - 2].setLocation(cabeca[numb - 2].getLocation().x, 50);

		if (cabeca[numb - 1].getLocation().y < 50)
			cabeca[numb - 1].setLocation(cabeca[numb - 1].getLocation().x, 50);

		cabeca[numb - 2].setVisible(true);
		cabeca[numb - 1].setVisible(true);
		cabeca[numb - 2].setVisible(false);
		cabeca[numb - 1].setVisible(false);
		cabeca[numb - 2].setVisible(true);
		cabeca[numb - 1].setVisible(true);

		if (numb > 180) {// Verifica se atingiu o limite de cabecas
			mtcabeca = true;
			perdeu = true;
		}
	}

	public void inicializaCoracao() {

		// Cria o coracao
		int x = new Random().nextInt(7);
		coracao = new JDialog(background);
		coracao.setResizable(false);
		coracao.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		coracao.setResizable(false);
		coracao.setSize(100, 130);
		coracao.setLocation(cabeca[x].getLocation().x + 20, cabeca[x].getLocation().y + 80);

		coracao.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent windowEvent) {
				musica.stop();
				background.dispose();
				relogio.dispose();
				time = 0;
				ganhou = true;
				switch (player.getClase()) {
				case 0:
					new Hist_Arcan().catedralVitoria(player);
					break;
				default:
					break;
				}

			}
		});

		ImageIcon fund = new ImageIcon("src/imagens/coracao.png");
		fund.setImage(fund.getImage().getScaledInstance(coracao.getSize().width, coracao.getSize().height, 100));
		JLabel coracaoImg = new JLabel(fund);
		coracaoImg.setBounds(12, 0, 100, 100);
		coracao.getContentPane().add(coracaoImg);
		coracao.setVisible(true);
		coracao.setVisible(false);
		coracao.setVisible(true);

	}

	public void tempo() {

		new Thread() {
			public void run() {
				try {
					int s;
					while (time > 0 && !perdeu) {
						if (seg < 10) {
							text.setText(" " + min + ":" + "0" + seg);
						} else if (seg >= 10) {
							text.setText(" " + min + ":" + seg);
						}

						s = min;
						Thread.sleep(1000);

						if (time < 180000) {
							min = 2;
						} else if (time < 60000) {
							min = 0;
						}
						if (min != s) {
							seg = 59;
						} else if (min == s && time != 180000) {
							seg--;
						}
						time--;
					}
					perdeu = true;

					if (perdeu && !ganhou) {
						if (mtcabeca) {
							switch (player.getClase()) {
							case 0:
								musica.stop();
								background.dispose();
								relogio.dispose();
								time = 0;
								new Hist_Arcan().catedralDerrota(player, 1);
								break;
							default:
								break;
							}
						} else {
							switch (player.getClase()) {
							case 0:
								musica.stop();
								background.dispose();
								time = 0;
								new Hist_Arcan().catedralDerrota(player, 2);
								break;
							default:
								break;
							}
						}
						// SÓ PRA SINALIZAR QUE PERDEU MESMO, DEPOIS TIRA ISSO
						text.setFont(new Font("Georgia", Font.BOLD, 50));
						text.setText("perdeste");
					}

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();
	}

}
