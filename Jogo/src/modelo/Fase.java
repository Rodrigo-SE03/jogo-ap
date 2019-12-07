package modelo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import cenas.Hist_Arcan;
import cenas.Hist_Assassin;
import cenas.Hist_Guerreior;
import personagens.Jogador;
import sons.Musica;

public class Fase extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// atributos
	private Image fundo;
	private Player player;
	private Timer timer;
	private List<Inimigo1> inimigo1;
	private boolean emJogo, vitoria;
	private int situacao, cont = 0, contP = 0;
	private JFrame frame;
	Jogador jogador;
	private Musica musica;

	public int getContP() {
		return contP;
	}

	public void setContP(int contP) {
		this.contP = contP;
	}

	// construtor
	public Fase(JFrame frame, Jogador jogador)

	{
		musica = new Musica();
		musica.TocaMusica("src/sons/batalha.wav");
		musica.setVolume(0.7f);
		this.jogador = jogador;

		// ficar mais bonitu
		setFocusable(true);
		setDoubleBuffered(true);

		// plano de fundo
		ImageIcon a = new ImageIcon(getClass().getResource("fundo.jpeg"));
		fundo = a.getImage();

		// chamar player
		player = new Player(jogador);
		player.load();

		// teclado
		addKeyListener(new TecladoAdaptor());

		// velocidade do jogo
		timer = new Timer(5, this);
		timer.start();
		// chamar bixos
		inicializaInimigos();
		// botar em jogo
		emJogo = true;
		vitoria = false;

		this.frame = frame;
	}

	// chamar inimigos em vetor infinito (list)
	public void inicializaInimigos() {
		int coordenadas[] = new int[100];
		inimigo1 = new ArrayList<Inimigo1>();

		// for para ramdomizar a posição dos inimigos em x e y, dando alguns problemas
		// (rever)
		for (int i = 0; i < coordenadas.length; i++) {
			int x = (int) (Math.random() * 8000 + 1280);
			int y = (int) (Math.random() * 650 + 30);
			inimigo1.add(new Inimigo1(x, y));
		}
	}

	// colocar imagem na tela
	public void paint(Graphics g) {
		// instanciar objeto
		Graphics2D graficos = (Graphics2D) g;
		if (emJogo == true) {
			// desenhar fundo
			graficos.drawImage(fundo, 0, 0, null);

			// desenhar player
			graficos.drawImage(player.getImagem(), player.getX(), player.getY(), this);

			// desenhar ataques
			List<Ataque> ataques = player.getAtaques();
			int i;
			// for estranho
			for (i = 0; i < ataques.size(); i++) {
				Ataque a = ataques.get(i);
				a.load();
				graficos.drawImage(a.getImagem(), a.getX(), a.getY(), this);
			}
			// for estranho
			for (int o = 0; o < inimigo1.size(); o++) {
				Inimigo1 in = inimigo1.get(o);
				in.load();
				graficos.drawImage(in.getImagem(), in.getX(), in.getY(), this);
			}
		}
		// aparecer tela de game over
		else {
			musica.stop();
			terminar();
			ImageIcon fimJogo = new ImageIcon(getClass().getResource("game_over.jpeg"));
			graficos.drawImage(fimJogo.getImage(), 0, 0, null);

		}
		g.dispose();
	}

	public boolean isEmJogo() {
		return emJogo;
	}

	public void setEmJogo(boolean emJogo) {
		this.emJogo = emJogo;
	}

	@Override
	// ataques
	public void actionPerformed(ActionEvent arg0) {
		if (frame.isActive() && emJogo) {
			player.atualizar();

			List<Ataque> ataques = player.getAtaques();
			int i;
			for (i = 0; i < ataques.size(); i++) {
				Ataque a = ataques.get(i);
				if (a.isVisible()) {
					a.uptade();
				} else {
					ataques.remove(i);
				}
			}
			// inimigos
			for (int j = 0; j < inimigo1.size(); j++) {
				Inimigo1 in = inimigo1.get(j);
				if (in.getX() < 0) {
					setContP(contP + 1);
					if (contP >= 50) {
						emJogo = false;
					}
					inimigo1.remove(j);
				}
				if (in.isVisible()) {
					in.uptade();
				} else {
					inimigo1.remove(j);
				}
			}
			checarColisoes();
			repaint();
		}
	}

	// checar colisões
	public void checarColisoes() {
		Rectangle formaNave = player.getBounds();
		Rectangle formaInimigo1;
		Rectangle formaAtaque;

		for (int i = 0; i < inimigo1.size(); i++) {
			Inimigo1 tempInimigo1 = inimigo1.get(i);
			formaInimigo1 = tempInimigo1.getBounds();
			if (formaNave.intersects(formaInimigo1)) {
				player.setVisivel(false);
				tempInimigo1.setVisible(false);
				situacao = 0;
				emJogo = false;
			}
		}

		List<Ataque> ataques = player.getAtaques();
		for (int j = 0; j < ataques.size(); j++) {
			Ataque tempAtaque = ataques.get(j);
			formaAtaque = tempAtaque.getBounds();
			for (int o = 0; o < inimigo1.size(); o++) {
				Inimigo1 tempInimigo1 = inimigo1.get(o);
				formaInimigo1 = tempInimigo1.getBounds();
				if (formaAtaque.intersects(formaInimigo1)) {
					tempInimigo1.setVisible(false);
					tempAtaque.setVisible(false);
					setCont(cont + 1);
					if (cont > 50) {
						situacao = 1;
						vitoria = true;
						emJogo = false;
					}
				}
			}
		}
	}

	public void terminar() {
		frame.dispose();
		switch (jogador.getClase()) {
		case 0:

			if (vitoria)
				new Hist_Arcan(jogador).guerraVitoria();
			else
				new Hist_Arcan(jogador).guerraDerrota();

			break;
		case 1:

			if (vitoria)
				new Hist_Assassin(jogador).guerraVitoria();
			else
				new Hist_Assassin(jogador).guerraDerrota();

			break;
		case 2:

			if (vitoria)
				new Hist_Guerreior(jogador).guerraVitoria();
			else
				new Hist_Guerreior(jogador).guerraDerrota();

			break;
		}
	}

	// chamar teclado
	private class TecladoAdaptor extends KeyAdapter {

		@Override
		// pressionado
		public void keyPressed(KeyEvent e) {
			player.keyPressed(e);
		}

		// recebido
		@Override
		public void keyReleased(KeyEvent e) {
			player.keyRealeased(e);
		}
	}

	// gets e sets
	public int getSituacao() {
		return situacao;
	}

	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

}
