package enigmas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;

import cenas.Hist_Assassin;
import graficos.Texto;
import personagens.Jogador;
import sons.Musica;

public class Cartola {

	private JFrame frame;
	private Musica musica;

	public Cartola(Jogador player, Texto t1) {
		initialize(player, t1);
		musica = new Musica();
		testaMusica();
	}

	private void initialize(Jogador player, Texto t1) {

		frame = new JFrame();
		frame.setSize(680, 375);
		frame.setLocationRelativeTo(null);
		frame.setLocation(100, 100);
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
		ImageIcon icone = new ImageIcon("src/imagens/Icone.png");
		frame.setIconImage(icone.getImage());

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JFormattedTextField resp = new JFormattedTextField();
		resp.setBackground(new Color(255, 248, 220));
		resp.setHorizontalAlignment(SwingConstants.CENTER);
		resp.setFont(new Font("Georgia", Font.BOLD, 30));
		resp.setBounds(350, 270, 150, 60);
		resp.setEnabled(true);
		maskLetter(resp);
		panel.add(resp);

		Texto_enigma caixa = new Texto_enigma();
		caixa.getFrame().setBounds(frame.getX() + frame.getWidth() + 100, frame.getY(), caixa.getFrame().getWidth(),
				caixa.getFrame().getHeight());
		caixa.getTxt1().setText(
				"Cassius apenas te entrega esse papel com essa gravura e diz para escrever a resposta no campo em branco.");

		JButton continuar = new JButton(new ImageIcon("src/imagens/continuar.png"));
		continuar.setLayout(null);
		continuar.setVisible(true);
		continuar.setBounds(500, 270, 158, 60);
		continuar.setContentAreaFilled(false);
		panel.add(continuar);
		continuar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent actionEvent) {

				if (resp.getText().equalsIgnoreCase("ASS")) {
					JOptionPane.showMessageDialog(null,
							"Hahaha, parabéns! Gostou da charadinha? Bem, agora você é um dos nossos.");
					frame.dispose();
					caixa.getFrame().dispose();
					musica.stop();
					if (!player.isBonus_inicio())
						player.setBonus_inicio(true);
					new Hist_Assassin(player).assassin1(t1);
				} else {
					JOptionPane.showMessageDialog(null,
							"Parece que essa não é a resposta, uma pena. Mesmo assim\nvocê ainda foi aceito, isso"
									+ "foi apenas uma brincadeira minha hahaha.");
					frame.dispose();
					caixa.getFrame().dispose();
					musica.stop();
					new Hist_Assassin(player).assassin1(t1);
				}
			}
		});

		JLabel Fundo = new JLabel();
		Fundo.setIcon(new ImageIcon("src/imagens/Cartola.png"));
		Fundo.setBounds(0, 0, 670, 335);
		panel.add(Fundo);

		frame.setVisible(true);
	}

	public void maskLetter(JFormattedTextField jtf) {
		MaskFormatter formatoDois;
		try {
			formatoDois = new MaskFormatter("***");
			formatoDois.setValidCharacters("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
			formatoDois.install(jtf);
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null, this,
					"Não foi possivel inserir mask nos campos letras: " + e.getMessage(), 0);
		}
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

}
