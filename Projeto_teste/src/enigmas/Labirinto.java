package enigmas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import cenas.Hist_Arcan;
import personagens.Jogador;

public class Labirinto {

	private JFrame frame;
	private JDialog dica;
	private JPanel panel;
	private JLabel[] parede, livros;
	private JLabel playerImg, fundo, piso;
	private ImageIcon icone;
	private Dimension size; // Adquire o tamanho da tela
	private Jogador player;
	private MouseMotionListener mover;
	private int x, y;
	private boolean amarelo, azul;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Labirinto(new Jogador());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Labirinto(Jogador player) {
		this.player = player;
		this.icone = new ImageIcon("src/imagens/Icone.png");
		this.size = Toolkit.getDefaultToolkit().getScreenSize();
		initialize();
	}

	private void initialize() {

		frame = new JFrame();
		frame.setSize(size);
		frame.setLocationRelativeTo(null);
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
		frame.setIconImage(icone.getImage());

		panel = new JPanel();
		panel.setLayout(null);
		frame.getContentPane().add(panel, BorderLayout.CENTER);

		criarDica();
		Criarlistener();
		criarPlayer();
		criarLivros();
		criarParedes();

		JLabel preto = new JLabel();

		preto.setSize(size);
		preto.setOpaque(true);
		preto.setBackground(Color.BLACK);
		preto.setLocation(0, 0);
		preto.setBounds(0, 664, 1366, 75);
		panel.add(preto);

		ImageIcon chao = new ImageIcon("src/imagens/Piso.png");
		chao.setImage(chao.getImage().getScaledInstance(frame.getBounds().width, frame.getBounds().width, 100));

		piso = new JLabel(chao);
		piso.setOpaque(true);
		piso.setBackground(Color.RED);
		piso.setSize(size);
		piso.setLocation(0, 0);
		panel.add(piso);

		frame.setVisible(true);
		dica.setVisible(true);

	}

	private void Criarlistener() {
		mover = new MouseMotionListener() {
			public void mouseDragged(MouseEvent e) {
				x = e.getX() - (playerImg.getSize().width / 2);
				y = e.getY() - (playerImg.getSize().height / 2);
				colisao();
				playerImg.setLocation(playerImg.getBounds().x + x, playerImg.getBounds().y + y);
			}

			public void mouseMoved(MouseEvent e) {
			}

		};
	}

	public void criarPlayer() {

		ImageIcon img1 = new ImageIcon("src/imagens/mago.png");
		img1.setImage(img1.getImage().getScaledInstance(50, 50, 100));
		playerImg = new JLabel(img1);
		playerImg.setBounds(10, 568, 60, 60);
		playerImg.setOpaque(true);
		playerImg.setBackground(Color.WHITE);
		playerImg.addMouseMotionListener(mover);
		panel.add(playerImg);

		ImageIcon fund = new ImageIcon("src/imagens/AreaClara.png");
		fund.setImage(fund.getImage().getScaledInstance(frame.getBounds().width * 2, frame.getBounds().width * 2, 100));
		fundo = new JLabel(fund);
		fundo.setSize(frame.getBounds().width * 2, frame.getBounds().width * 2);
		fundo.setLocation(
				((playerImg.getLocation().x) - (fundo.getSize().width / 2) + (playerImg.getSize().width / 2) + 30),
				(playerImg.getLocation().y - (fundo.getSize().height / 2) + (playerImg.getSize().height / 2)) - 5);
		panel.add(fundo);
	}

	public void criarDica() {

		JLabel txtdica = new JLabel();
		txtdica.setFont(new Font("Georgia", Font.BOLD, 25));
		txtdica.setForeground(Color.black);
		txtdica.setBounds(50, 50, 500, 500);

		if (player.getClase() == 0) {
			txtdica.setText(
					"<html>Segundo as lendas, o livro de Merlim " + "<br/>foi separado em 3 diferentes livros. A"
							+ "<br/>única forma de recuperar o livro " + "<br/>original é pegando suas partes na "
							+ "<br/>ordem correta. Tudo que se sabe " + "<br/>sobre a ordem é que … " + "<html>");
		}

		dica = new JDialog();
		dica.setIconImage(icone.getImage());
		dica.setModal(true);
		dica.setBounds(((size.width / 2) - 350), ((size.height / 2) - 350), 700, 700);
		dica.add(txtdica);

		ImageIcon background = new ImageIcon("src/imagens/fundo_dialogo.png");
		background.setImage(background.getImage().getScaledInstance(700, 700, 100));

		JLabel back = new JLabel(background);
		back.setBounds(0, 0, 700, 700);
		dica.add(back);

		ImageIcon lampada = new ImageIcon("src/imagens/lampada.png");
		lampada.setImage(lampada.getImage().getScaledInstance(50, 50, 100));

		JButton botao = new JButton(lampada);
		botao.setBounds(25, 25, 50, 50);
		botao.setBorderPainted(false);
		botao.setContentAreaFilled(false);
		botao.setBorderPainted(false);
		botao.setBorder(null);
		panel.add(botao);

		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dica.setVisible(true);

			}
		});
	}

	public void criarParedes() {

		ImageIcon imgParede = new ImageIcon("src/imagens/Parede.png");
		imgParede.setImage(imgParede.getImage().getScaledInstance(1400, 1400, 100));

		parede = new JLabel[18];
		for (int i = 0; i < 18; i++) {
			parede[i] = new JLabel(imgParede);
		}

		parede[0].setBounds(0, 50, 50, 500);
		parede[1].setBounds(150, 150, 50, 400);
		parede[2].setBounds(300, 300, 50, 200);
		parede[3].setBounds(450, 350, 50, 200);
		parede[4].setBounds(550, 200, 50, 100);
		parede[5].setBounds(600, 450, 50, 200);
		parede[6].setBounds(800, 200, 50, 450);
		parede[7].setBounds(950, 200, 50, 100);
		parede[8].setBounds(1150, 150, 50, 300);
		parede[9].setBounds(1300, 0, 50, 650);
		parede[10].setBounds(0, 0, 1350, 50);
		parede[11].setBounds(200, 150, 400, 50);
		parede[12].setBounds(750, 150, 100, 50);
		parede[13].setBounds(950, 150, 200, 50);
		parede[14].setBounds(350, 300, 500, 50);
		parede[16].setBounds(950, 450, 250, 50);
		parede[15].setBounds(800, 500, 200, 50);
		parede[17].setBounds(0, 650, 1350, 50);

		for (int i = 0; i < 18; i++) {
			parede[i].setOpaque(true);
			parede[i].setBackground(Color.BLACK);
			panel.add(parede[i]);
		}

	}

	public void criarLivros() {

		int x;
		livros = new JLabel[3];
		ImageIcon livroimg;
		Point[] p = new Point[4];
		p[0] = new Point(696, 568);
		p[1] = new Point(885, 570);
		p[2] = new Point(470, 212);
		p[3] = new Point(1000, 325);

		for (int i = 0; i < 3; i++) {
			livroimg = new ImageIcon("src/imagens/Livro" + i + ".png");
			livroimg.setImage(livroimg.getImage().getScaledInstance(79, 82, 100));
			livros[i] = new JLabel(livroimg);
			livros[i].setSize(79, 82);
			x = new Random().nextInt(4 - i);
			livros[i].setLocation(p[x]);
			p[x] = p[3 - i];
			panel.add(livros[i]);
		}
	}

	public void confirmar(int ordem) {

		JDialog confirma = new JDialog();
		confirma.setIconImage(icone.getImage());
		confirma.setBounds(((size.width / 2) - 200), ((size.height / 2) - 200), 400, 400);
		confirma.setModal(true);
		confirma.setUndecorated(true);

		JButton sim = new JButton("SIM");
		sim.setBackground(new Color(139, 69, 19));
		sim.setForeground(Color.BLACK);
		sim.setFont(new Font("Georgia", Font.BOLD, 25));
		sim.setContentAreaFilled(true);
		sim.setBorderPainted(false);
		sim.setBorder(null);
		sim.setFocusPainted(false);
		sim.setBounds(25, 300, 150, 50);
		sim.addActionListener(new ActionListener() {
			// amarelo,azul,verde
			@Override
			public void actionPerformed(ActionEvent e) {
				confirma.setVisible(false);
				pegarLivro(ordem);
			}
		});

		JButton nao = new JButton("NÃO");
		nao.setBackground(new Color(139, 69, 19));
		nao.setForeground(Color.BLACK);
		nao.setFont(new Font("Georgia", Font.BOLD, 25));
		nao.setContentAreaFilled(true);
		nao.setBorderPainted(false);
		nao.setBorder(null);
		nao.setFocusPainted(false);
		nao.setBounds(225, 300, 150, 50);
		nao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				confirma.setVisible(false);
			}
		});

		JLabel txtConfirma = new JLabel("<html>Tem certeza de que quer pegar esse livro?<html>");
		txtConfirma.setFont(new Font("Georgia", Font.BOLD, 25));
		txtConfirma.setForeground(Color.black);
		txtConfirma.setBounds(50, 25, 350, 300);

		ImageIcon background = new ImageIcon("src/imagens/fundo_dialogo.png");
		background.setImage(background.getImage().getScaledInstance(400, 400, 100));

		JLabel back = new JLabel(background);
		back.setBounds(0, 0, 400, 400);

		confirma.add(sim);
		confirma.add(nao);
		confirma.add(txtConfirma);
		confirma.add(back);
		confirma.setVisible(true);
	}

	public void pegarLivro(int ordem) {
		switch (ordem) {
		case 1:
			amarelo = true;
			livros[0].setVisible(false);
			break;
		case 2:
			if (amarelo)
				azul = true;
			else {
				perder();
			}
			livros[1].setVisible(false);
			break;
		case 3:
			if (azul) {
				vencer();
			} else {
				perder();
			}
			livros[2].setVisible(false);
			break;
		}
	}

	public void perder() {

		switch (player.getClase()) {

		case 0:
			frame.dispose();
			new Hist_Arcan().torreDerrota(player);
			break;

		default:
			break;
		}

	}

	public void vencer() {

		switch (player.getClase()) {

		case 0:
			frame.dispose();
			new Hist_Arcan().torreVitoria(player);
			break;

		default:
			break;
		}
	}

	public void colisao() {

		int xPlayermin = playerImg.getBounds().x; // Esquerda
		int xPlayermax = playerImg.getBounds().x + playerImg.getBounds().width; // Direita

		int yPlayermin = playerImg.getBounds().y; // Cima
		int yPlayermax = playerImg.getBounds().y + playerImg.getBounds().height;// Baixo

		int xParedemax, xParedemin, yParedemax, yParedemin;

		for (int cont = 0; cont < parede.length; cont++) {

			xParedemax = parede[cont].getBounds().x + parede[cont].getBounds().width;
			xParedemin = parede[cont].getBounds().x;
			yParedemax = parede[cont].getBounds().y + parede[cont].getBounds().height;
			yParedemin = parede[cont].getBounds().y;

			if (((xPlayermin >= xParedemax) && ((xPlayermin + x) < xParedemax))
					|| ((xPlayermax <= xParedemin) && ((xPlayermax + x) > xParedemin))) {
				if (((yPlayermin <= yParedemax) && (yPlayermax >= yParedemax))
						|| ((yPlayermin <= yParedemin) && (yPlayermax >= yParedemin))
						|| ((yPlayermin >= yParedemin) && (yPlayermax <= yParedemax))) {
					x = 0;
				}

			}
			if (((yPlayermin >= yParedemax) && ((yPlayermin + y) < yParedemax))
					|| ((yPlayermax <= yParedemin) && ((yPlayermax + y) > yParedemin))) {
				if (((xPlayermin >= xParedemin) && (xPlayermax <= xParedemax))
						|| ((xPlayermin <= xParedemin) && (xPlayermax >= xParedemin))
						|| ((xPlayermin <= xParedemax) && (xPlayermax >= xParedemax))) {
					y = 0;
				}
			}
		}

		fundo.setLocation(
				((playerImg.getLocation().x) - (fundo.getSize().width / 2) + (playerImg.getSize().width / 2) + 30),
				(playerImg.getLocation().y - (fundo.getSize().height / 2) + (playerImg.getSize().height / 2)) - 5);

		if (((yPlayermin >= (livros[0].getBounds().y + livros[0].getBounds().width))
				&& ((yPlayermin + y) < (livros[0].getBounds().y + livros[0].getBounds().height)))
				|| ((yPlayermax <= livros[0].getBounds().y) && ((yPlayermax + y) > livros[0].getBounds().y))) {
			if (((xPlayermin >= livros[0].getBounds().x)
					&& (xPlayermax <= livros[0].getBounds().x + livros[0].getBounds().height))
					|| ((xPlayermin <= livros[0].getBounds().x) && (xPlayermax >= livros[0].getBounds().x))
					|| ((xPlayermin <= livros[0].getBounds().x + livros[0].getBounds().height)
							&& (xPlayermax >= livros[0].getBounds().x + livros[0].getBounds().height))) {
				if (!amarelo) {
					confirmar(1);
				}

			}

		} else if (((xPlayermin >= livros[0].getBounds().x + livros[0].getBounds().width)
				&& ((xPlayermin + x) < livros[0].getBounds().x + livros[0].getBounds().width))
				|| ((xPlayermax <= livros[0].getBounds().x) && ((xPlayermax + x) > livros[0].getBounds().x))) {
			if (((yPlayermin <= (livros[0].getBounds().y + livros[0].getBounds().width))
					&& (yPlayermax >= (livros[0].getBounds().y + livros[0].getBounds().width)))
					|| ((yPlayermin <= livros[0].getBounds().y) && (yPlayermax >= livros[0].getBounds().y))
					|| ((yPlayermin >= livros[0].getBounds().y)
							&& (yPlayermax <= (livros[0].getBounds().y + livros[0].getBounds().width)))) {
				if (!amarelo) {
					confirmar(1);
				}
			}

		}

		if (((yPlayermin >= (livros[1].getBounds().y + livros[1].getBounds().width))
				&& ((yPlayermin + y) < (livros[1].getBounds().y + livros[1].getBounds().height)))
				|| ((yPlayermax <= livros[1].getBounds().y) && ((yPlayermax + y) > livros[1].getBounds().y))) {
			if (((xPlayermin >= livros[1].getBounds().x)
					&& (xPlayermax <= livros[1].getBounds().x + livros[1].getBounds().height))
					|| ((xPlayermin <= livros[1].getBounds().x) && (xPlayermax >= livros[1].getBounds().x))
					|| ((xPlayermin <= livros[1].getBounds().x + livros[1].getBounds().height)
							&& (xPlayermax >= livros[1].getBounds().x + livros[1].getBounds().height))) {
				if (!azul) {
					confirmar(2);
				}
			}

		} else if (((xPlayermin >= livros[1].getBounds().x + livros[1].getBounds().width)
				&& ((xPlayermin + x) < livros[1].getBounds().x + livros[1].getBounds().width))
				|| ((xPlayermax <= livros[1].getBounds().x) && ((xPlayermax + x) > livros[1].getBounds().x))) {
			if (((yPlayermin <= (livros[1].getBounds().y + livros[1].getBounds().width))
					&& (yPlayermax >= (livros[1].getBounds().y + livros[1].getBounds().width)))
					|| ((yPlayermin <= livros[1].getBounds().y) && (yPlayermax >= livros[1].getBounds().y))
					|| ((yPlayermin >= livros[1].getBounds().y)
							&& (yPlayermax <= (livros[1].getBounds().y + livros[1].getBounds().width)))) {
				if (!azul) {
					confirmar(2);
				}
			}

		}

		if (((yPlayermin >= (livros[2].getBounds().y + livros[2].getBounds().width))
				&& ((yPlayermin + y) < (livros[2].getBounds().y + livros[2].getBounds().height)))
				|| ((yPlayermax <= livros[2].getBounds().y) && ((yPlayermax + y) > livros[2].getBounds().y))) {
			if (((xPlayermin >= livros[2].getBounds().x)
					&& (xPlayermax <= livros[2].getBounds().x + livros[2].getBounds().height))
					|| ((xPlayermin <= livros[2].getBounds().x) && (xPlayermax >= livros[2].getBounds().x))
					|| ((xPlayermin <= livros[2].getBounds().x + livros[2].getBounds().height)
							&& (xPlayermax >= livros[2].getBounds().x + livros[2].getBounds().height))) {
				confirmar(3);
			}

		} else if (((xPlayermin >= livros[2].getBounds().x + livros[2].getBounds().width)
				&& ((xPlayermin + x) < livros[2].getBounds().x + livros[2].getBounds().width))
				|| ((xPlayermax <= livros[2].getBounds().x) && ((xPlayermax + x) > livros[2].getBounds().x))) {
			if (((yPlayermin <= (livros[2].getBounds().y + livros[2].getBounds().width))
					&& (yPlayermax >= (livros[2].getBounds().y + livros[2].getBounds().width)))
					|| ((yPlayermin <= livros[2].getBounds().y) && (yPlayermax >= livros[2].getBounds().y))
					|| ((yPlayermin >= livros[2].getBounds().y)
							&& (yPlayermax <= (livros[2].getBounds().y + livros[2].getBounds().width)))) {
				confirmar(3);
			}

		}

	}
}
