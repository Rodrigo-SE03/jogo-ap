package enigmas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import cenas.Hist_Arcan;
import cenas.Hist_Assassin;
import cenas.Hist_Guerreior;
import personagens.Jogador;

public class Porta {

	private JFrame frame;
	private JDialog relogio;
	private JTextPane text;
	private int i;
	private int min, seg;
	private int time;
	private Texto_enigma caixa;
	private Thread tempo;

	public Porta(Jogador player) {
		initialize(player);
		this.time = 180;
		this.min = 3;
		this.seg = 0;
		tempo(player);
	}

	private void initialize(Jogador player) {
		frame = new JFrame();
		frame.setBounds(100, 100, 527, 423);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setIconImage(new ImageIcon("src/imagens/Icone.png").getImage());
		frame.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent windowEvent) {
				if (JOptionPane.showConfirmDialog(null,
						"Tem certeza que deseja sair do jogo (todo seu progresso será perdido)?", "Sair",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});

		caixa = new Texto_enigma(frame);
		caixa.getFrame().setBounds(frame.getX() + frame.getWidth() + 100, frame.getY(), caixa.getFrame().getWidth(),
				caixa.getFrame().getHeight());
		caixa.getTxt1()
				.setText("	Encontre o código de quatro dígitos que abre a porta. Você pode usar os"
						+ " números de 0 a 5, mas cada um só pode ser usado uma vez. As pequenas luzes"
						+ " ao lado de cada sequência de números são as chaves para a resolução do"
						+ " desafio, uma vez que elas indicam as semelhanças entre a sequência e o"
						+ " código final. Cada luz branca indica um número em comum com o código mas"
						+ " com a posição diferente da que teria no código final. Cada luz laranja"
						+ " indica um número em comum com o código e com a posição correta do código final.");

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel[] digitos = new JLabel[4];
		JButton[] botao = new JButton[4];
		for (i = 0; i < 4; i++) {
			digitos[i] = new JLabel("0");
			digitos[i].setIcon(new ImageIcon(Porta.class.getResource("/imagens/senha_0.png")));
			digitos[i].setBounds(143 + (i * 63), 277, 48, 61);
			panel.add(digitos[i]);

			botao[i] = new JButton();
			botao[i].setFocusPainted(false);
			botao[i].setBorderPainted(false);
			botao[i].setBorder(null);
			botao[i].setPressedIcon(new ImageIcon(Porta.class.getResource("/imagens/senha_botao_pressionado.png")));
			botao[i].setContentAreaFilled(false);
			botao[i].setIcon(new ImageIcon(Porta.class.getResource("/imagens/senha_botao.png")));
			botao[i].setSelectedIcon(null);
			botao[i].setBounds(143 + (i * 63), 245, 41, 34);
			botao[i].addActionListener(new ActionListener() {
				int k = 1;
				int y = i;

				public void actionPerformed(ActionEvent e) {
					digitos[y].setIcon(new ImageIcon("src/imagens/senha_" + k + ".png"));
					digitos[y].setText("" + k);
					k++;
					if (k == 6)
						k = 0;
				}
			});
			panel.add(botao[i]);
		}

		ImageIcon confirm = new ImageIcon("src/imagens/Botão confirm.png");
		confirm.setImage(confirm.getImage().getScaledInstance(100, 60, 100));
		JButton confirma = new JButton(confirm);
		confirma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caixa.getFrame().dispose();
				if (digitos[0].getText().contentEquals("0") && digitos[1].getText().contentEquals("1")
						&& digitos[2].getText().contentEquals("5") && digitos[3].getText().contentEquals("4")) {
					vencer(player); // Acertou a combinação
				} else {
					perder(player);
				}
			}
		});
		confirma.setBounds(410, 300, 100, 60);
		panel.add(confirma);

		JLabel Fundo = new JLabel();
		Fundo.setIcon(new ImageIcon(Porta.class.getResource("/imagens/senha.png")));
		Fundo.setBounds(0, 0, 513, 387);
		panel.add(Fundo);

		relogio = new JDialog(frame);
		relogio.setSize(150, 80);
		relogio.setUndecorated(true);
		relogio.setAlwaysOnTop(true);
		relogio.setLocation(frame.getLocation());

		text = new JTextPane();
		text.setBounds(0, 0, 200, 100);
		text.setOpaque(false);
		text.setFont(new Font("Georgia", Font.BOLD, 50));
		text.setForeground(Color.black);
		relogio.getContentPane().add(text);

		ImageIcon back = new ImageIcon("src/imagens/caixa_de_texto_enigma.png");
		back.setImage(back.getImage().getScaledInstance(relogio.getSize().width, relogio.getSize().height, 100));
		JLabel fundo1 = new JLabel(back);
		fundo1.setLocation(0, 0);
		fundo1.setSize(relogio.getSize());
		fundo1.setVisible(true);
		relogio.getContentPane().add(fundo1);

		relogio.setVisible(true);
		frame.setVisible(true);
	}

	public void perder(Jogador player) {
		tempo.interrupt();
		caixa.getFrame().dispose();
		switch (player.getClase()) {

		case 0:
			frame.dispose();
			new Hist_Arcan(player).alamedaDerrota();
			break;
		case 1:
			frame.dispose();
			new Hist_Assassin(player).CasaNobreDerrota();
			break;
		case 2:
			frame.dispose();
			new Hist_Guerreior(player).alamedaDerrota();
			break;

		default:
			break;
		}

	}

	public void vencer(Jogador player) {
		tempo.interrupt();
		switch (player.getClase()) {

		case 0:
			frame.dispose();
			new Hist_Arcan(player).alamedaVitoria();
			break;
		case 1:
			frame.dispose();
			new Hist_Assassin(player).CasaNobreVitoria();
			break;
		case 2:
			frame.dispose();
			new Hist_Guerreior(player).alamedaVitoria();
			break;
		default:
			break;

		}
	}

	public void tempo(Jogador player) {

		tempo = new Thread() {
			public void run() {
				try {
					while (time > 0) {

						if (seg < 10) {
							text.setText(" " + min + ":" + "0" + seg);
						} else {
							text.setText(" " + min + ":" + seg);
						}
						Thread.sleep(1000);
						time--;
						seg = time;
						min = seg / 60;
						seg = seg % 60;
					}
					perder(player);

				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
		};
		tempo.start();
	}
}
