package enigmas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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

public class Labirinto implements MouseListener, MouseMotionListener {

	private Dimension size; // Adquire o tamanho da tela
	private JPanel panel;
	private ImageIcon icone;
	private JFrame frame;
	private JLabel[] parede;
	private JLabel playerImg, fundo, piso, livro, livroV, livroA;
	private static JDialog dica;
	private Jogador player;
	private boolean amarelo, azul;
	private int x, y;
	private int ordem = 0;

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

	/**
	 * Initialize the contents of the frame.
	 */
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
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

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

		ImageIcon img1 = new ImageIcon("src/imagens/mago.png");
		img1.setImage(img1.getImage().getScaledInstance(50, 50, 100));

		playerImg = new JLabel(img1);
		playerImg.setBounds(10, 568, 60, 60);
		playerImg.setOpaque(true);
		playerImg.setBackground(Color.WHITE);
		playerImg.addMouseListener(this);
		playerImg.addMouseMotionListener(this);
		panel.add(playerImg);

		ImageIcon fund = new ImageIcon("src/imagens/AreaClara.png");
		fund.setImage(fund.getImage().getScaledInstance(frame.getBounds().width * 2, frame.getBounds().width * 2, 100));

		fundo = new JLabel();
		fundo.setSize(frame.getBounds().width * 2, frame.getBounds().width * 2);
		fundo.setLocation(
				((playerImg.getLocation().x) - (fundo.getSize().width / 2) + (playerImg.getSize().width / 2) + 30),
				(playerImg.getLocation().y - (fundo.getSize().height / 2) + (playerImg.getSize().height / 2)) - 5);
		panel.add(fundo);

		ImageIcon imgParedeV = new ImageIcon("src/imagens/Tile2-export.png");
		imgParedeV.setImage(imgParedeV.getImage().getScaledInstance(100, 200, 100));

		ImageIcon imgParedeH = new ImageIcon("src/imagens/ParedeX.png");
		imgParedeH.setImage(imgParedeH.getImage().getScaledInstance(100, 200, 100));

		ImageIcon livroimg = new ImageIcon("src/imagens/Livro.png");
		livroimg.setImage(livroimg.getImage().getScaledInstance(79, 82, 100));

		ImageIcon livroVimg = new ImageIcon("src/imagens/LivroV.png");
		livroVimg.setImage(livroVimg.getImage().getScaledInstance(79, 82, 100));

		ImageIcon livroAimg = new ImageIcon("src/imagens/LivroA.png");
		livroAimg.setImage(livroAimg.getImage().getScaledInstance(79, 82, 100));

		livro = new JLabel(livroimg);
		livroV = new JLabel(livroVimg);
		livroA = new JLabel(livroAimg);

		switch (new Random().nextInt(4)) {
		case 0:
			livro.setBounds(696, 568, 79, 82);

			switch (new Random().nextInt(3)) {
			case 0:
				livroA.setBounds(885, 570, 79, 82);

				switch (new Random().nextInt(2)) {
				case 0:
					livroV.setBounds(470, 212, 79, 82);
					break;
				default:
					livroV.setBounds(1000, 325, 79, 82);
					break;
				}
				break;
			case 1:
				livroA.setBounds(470, 212, 79, 82);
				switch (new Random().nextInt(2)) {
				case 0:
					livroV.setBounds(885, 570, 79, 82);
					break;
				default:
					livroV.setBounds(1000, 325, 79, 82);
					break;
				}
				break;
			default:
				livroA.setBounds(1000, 325, 79, 82);
				switch (new Random().nextInt(2)) {
				case 0:
					livroV.setBounds(885, 570, 79, 82);
					break;
				default:
					livroV.setBounds(470, 212, 79, 82);
					break;
				}
				break;
			}
			break;

		case 1:
			livro.setBounds(885, 570, 79, 82);
			switch (new Random().nextInt(3)) {
			case 0:
				livroA.setBounds(696, 568, 79, 82);

				switch (new Random().nextInt(2)) {
				case 0:
					livroV.setBounds(470, 212, 79, 82);
					break;
				default:
					livroV.setBounds(1000, 325, 79, 82);
					break;
				}
				break;
			case 1:
				livroA.setBounds(470, 212, 79, 82);
				switch (new Random().nextInt(2)) {
				case 0:
					livroV.setBounds(696, 568, 79, 82);
					break;
				default:
					livroV.setBounds(1000, 325, 79, 82);
					break;
				}
				break;
			default:
				livroA.setBounds(1000, 325, 79, 82);
				switch (new Random().nextInt(2)) {
				case 0:
					livroV.setBounds(696, 568, 79, 82);
					break;
				default:
					livroV.setBounds(470, 212, 79, 82);
					break;
				}
				break;
			}
			break;
		case 2:
			livro.setBounds(470, 212, 79, 82);
			switch (new Random().nextInt(3)) {
			case 0:
				livroA.setBounds(696, 568, 79, 82);

				switch (new Random().nextInt(2)) {
				case 0:
					livroV.setBounds(885, 570, 79, 82);
					break;
				default:
					livroV.setBounds(1000, 325, 79, 82);
					break;
				}
				break;
			case 1:
				livroA.setBounds(885, 570, 79, 82);
				switch (new Random().nextInt(2)) {
				case 0:
					livroV.setBounds(696, 568, 79, 82);
					break;
				default:
					livroV.setBounds(1000, 325, 79, 82);
					break;
				}
				break;
			default:
				livroA.setBounds(1000, 325, 79, 82);
				switch (new Random().nextInt(2)) {
				case 0:
					livroV.setBounds(696, 568, 79, 82);
					break;
				default:
					livroV.setBounds(885, 570, 79, 82);
					break;
				}
				break;
			}
			break;
		default:
			livro.setBounds(1000, 325, 79, 82);
			switch (new Random().nextInt(3)) {
			case 0:
				livroA.setBounds(696, 568, 79, 82);

				switch (new Random().nextInt(2)) {
				case 0:
					livroV.setBounds(885, 570, 79, 82);
					break;
				default:
					livroV.setBounds(470, 212, 79, 82);
					break;
				}
				break;
			case 1:
				livroA.setBounds(885, 570, 79, 82);
				switch (new Random().nextInt(2)) {
				case 0:
					livroV.setBounds(696, 568, 79, 82);
					break;
				default:
					livroV.setBounds(470, 212, 79, 82);
					break;
				}
				break;
			default:
				livroA.setBounds(470, 212, 79, 82);
				switch (new Random().nextInt(2)) {
				case 0:
					livroV.setBounds(696, 568, 79, 82);
					break;
				default:
					livroV.setBounds(885, 570, 79, 82);
					break;
				}
				break;
			}
			break;
		}

		panel.add(livro);
		panel.add(livroA);
		panel.add(livroV);

		JLabel parede[] = new JLabel[18];

		for (int i = 0; i < 10; i++) {
			parede[i] = new JLabel(imgParedeV);
		}
		for (int i = 10; i < 18; i++) {
			parede[i] = new JLabel(imgParedeH);
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
		parede[15].setBounds(850, 500, 100, 50);
		parede[16].setBounds(1000, 450, 200, 50);
		parede[17].setBounds(0, 650, 1350, 50);

		for (int i = 0; i < 18; i++) {
			parede[i].setOpaque(true);
			parede[i].setBackground(Color.BLACK);
			panel.add(parede[i]);
		}

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

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		x = e.getX();
		y = e.getY();
	}

	@Override
	public void mouseDragged(MouseEvent e) {

		int xPlayermin = playerImg.getBounds().x; // Esquerda
		int xPlayermax = playerImg.getBounds().x + playerImg.getBounds().width; // Direita

		int yPlayermin = playerImg.getBounds().y; // Cima
		int yPlayermax = playerImg.getBounds().y + playerImg.getBounds().height;// Baixo

		int xParedemax, xParedemin, yParedemax, yParedemin;

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
				switch (ordem) {
				case 1:
					amarelo = true;
					livro.setVisible(false);
					break;
				case 2:
					if (amarelo)
						azul = true;
					else {
						switch (player.getClase()) {
						case 0:
							frame.dispose();
							new Hist_Arcan().torreDerrota(player);
							break;
						default:
							break;
						}
					}
					livroA.setVisible(false);
					break;
				case 3:
					if (azul) {
						switch (player.getClase()) {
						case 0:
							frame.dispose();
							new Hist_Arcan().torreVitoria(player);
							break;
						default:
							break;
						}
					} else {
						switch (player.getClase()) {
						case 0:
							frame.dispose();
							new Hist_Arcan().torreDerrota(player);
							break;
						default:
							break;
						}
					}
					livroV.setVisible(false);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Algo deu errado");
					break;
				}

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

		int x1, y1;
		x1 = e.getX() - x;
		y1 = e.getY() - y;

		for (int cont = 0; cont < parede.length; cont++) {

			xParedemax = parede[cont].getBounds().x + parede[cont].getBounds().width;
			xParedemin = parede[cont].getBounds().x;
			yParedemax = parede[cont].getBounds().y + parede[cont].getBounds().height;
			yParedemin = parede[cont].getBounds().y;

			if (((xPlayermin >= xParedemax) && ((xPlayermin + x1) < xParedemax))
					|| ((xPlayermax <= xParedemin) && ((xPlayermax + x1) > xParedemin))) {
				if (((yPlayermin <= yParedemax) && (yPlayermax >= yParedemax))
						|| ((yPlayermin <= yParedemin) && (yPlayermax >= yParedemin))
						|| ((yPlayermin >= yParedemin) && (yPlayermax <= yParedemax))) {
					x1 = 0;
				}

			}
			if (((yPlayermin >= yParedemax) && ((yPlayermin + y1) < yParedemax))
					|| ((yPlayermax <= yParedemin) && ((yPlayermax + y1) > yParedemin))) {
				if (((xPlayermin >= xParedemin) && (xPlayermax <= xParedemax))
						|| ((xPlayermin <= xParedemin) && (xPlayermax >= xParedemin))
						|| ((xPlayermin <= xParedemax) && (xPlayermax >= xParedemax))) {
					y1 = 0;
				}
			}
		}

		playerImg.setLocation(playerImg.getBounds().x + x1, playerImg.getBounds().y + y1);

		fundo.setLocation(
				((playerImg.getLocation().x) - (fundo.getSize().width / 2) + (playerImg.getSize().width / 2) + 30),
				(playerImg.getLocation().y - (fundo.getSize().height / 2) + (playerImg.getSize().height / 2)) - 5);

		if (((yPlayermin >= (livro.getBounds().y + livro.getBounds().width))
				&& ((yPlayermin + y1) < (livro.getBounds().y + livro.getBounds().height)))
				|| ((yPlayermax <= livro.getBounds().y) && ((yPlayermax + y1) > livro.getBounds().y))) {
			if (((xPlayermin >= livro.getBounds().x) && (xPlayermax <= livro.getBounds().x + livro.getBounds().height))
					|| ((xPlayermin <= livro.getBounds().x) && (xPlayermax >= livro.getBounds().x))
					|| ((xPlayermin <= livro.getBounds().x + livro.getBounds().height)
							&& (xPlayermax >= livro.getBounds().x + livro.getBounds().height))) {
				if (!amarelo) {
					ordem = 1;
					confirma.setVisible(true);
				}

			}
		} else if (((xPlayermin >= livro.getBounds().x + livro.getBounds().width)
				&& ((xPlayermin + x1) < livro.getBounds().x + livro.getBounds().width))
				|| ((xPlayermax <= livro.getBounds().x) && ((xPlayermax + x1) > livro.getBounds().x))) {
			if (((yPlayermin <= (livro.getBounds().y + livro.getBounds().width))
					&& (yPlayermax >= (livro.getBounds().y + livro.getBounds().width)))
					|| ((yPlayermin <= livro.getBounds().y) && (yPlayermax >= livro.getBounds().y))
					|| ((yPlayermin >= livro.getBounds().y)
							&& (yPlayermax <= (livro.getBounds().y + livro.getBounds().width)))) {
				if (!amarelo) {
					ordem = 1;
					confirma.setVisible(true);
				}
			}

		}

		if (((yPlayermin >= (livroA.getBounds().y + livroA.getBounds().width))
				&& ((yPlayermin + y1) < (livroA.getBounds().y + livroA.getBounds().height)))
				|| ((yPlayermax <= livroA.getBounds().y) && ((yPlayermax + y1) > livroA.getBounds().y))) {
			if (((xPlayermin >= livroA.getBounds().x)
					&& (xPlayermax <= livroA.getBounds().x + livroA.getBounds().height))
					|| ((xPlayermin <= livroA.getBounds().x) && (xPlayermax >= livroA.getBounds().x))
					|| ((xPlayermin <= livroA.getBounds().x + livroA.getBounds().height)
							&& (xPlayermax >= livroA.getBounds().x + livroA.getBounds().height))) {
				if (!azul) {
					ordem = 2;
					confirma.setVisible(true);
				}
			}
		} else if (((xPlayermin >= livroA.getBounds().x + livroA.getBounds().width)
				&& ((xPlayermin + x1) < livroA.getBounds().x + livroA.getBounds().width))
				|| ((xPlayermax <= livroA.getBounds().x) && ((xPlayermax + x1) > livroA.getBounds().x))) {
			if (((yPlayermin <= (livroA.getBounds().y + livroA.getBounds().width))
					&& (yPlayermax >= (livroA.getBounds().y + livroA.getBounds().width)))
					|| ((yPlayermin <= livroA.getBounds().y) && (yPlayermax >= livroA.getBounds().y))
					|| ((yPlayermin >= livroA.getBounds().y)
							&& (yPlayermax <= (livroA.getBounds().y + livroA.getBounds().width)))) {
				if (!azul) {
					ordem = 2;
					confirma.setVisible(true);
				}
			}

		}

		if (((yPlayermin >= (livroV.getBounds().y + livroV.getBounds().width))
				&& ((yPlayermin + y1) < (livroV.getBounds().y + livroV.getBounds().height)))
				|| ((yPlayermax <= livroV.getBounds().y) && ((yPlayermax + y1) > livroV.getBounds().y))) {
			if (((xPlayermin >= livroV.getBounds().x)
					&& (xPlayermax <= livroV.getBounds().x + livroV.getBounds().height))
					|| ((xPlayermin <= livroV.getBounds().x) && (xPlayermax >= livroV.getBounds().x))
					|| ((xPlayermin <= livroV.getBounds().x + livroV.getBounds().height)
							&& (xPlayermax >= livroV.getBounds().x + livroV.getBounds().height))) {
				ordem = 3;
				confirma.setVisible(true);
			}
		} else if (((xPlayermin >= livroV.getBounds().x + livroV.getBounds().width)
				&& ((xPlayermin + x1) < livroV.getBounds().x + livroV.getBounds().width))
				|| ((xPlayermax <= livroV.getBounds().x) && ((xPlayermax + x1) > livroV.getBounds().x))) {
			if (((yPlayermin <= (livroV.getBounds().y + livroV.getBounds().width))
					&& (yPlayermax >= (livroV.getBounds().y + livroV.getBounds().width)))
					|| ((yPlayermin <= livroV.getBounds().y) && (yPlayermax >= livroV.getBounds().y))
					|| ((yPlayermin >= livroV.getBounds().y)
							&& (yPlayermax <= (livroV.getBounds().y + livroV.getBounds().width)))) {
				ordem = 3;
				confirma.setVisible(true);
			}

		}

	}

}