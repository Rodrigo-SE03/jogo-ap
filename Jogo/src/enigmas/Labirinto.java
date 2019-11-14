package enigmas;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.Icon;

public class Labirinto implements MouseListener, MouseMotionListener {

	Dimension size = Toolkit.getDefaultToolkit().getScreenSize();// Adquire o tamanho da tela
	JPanel panel;
	private JFrame frame;
	private JLabel[] parede;
	private JLabel player, fundo, piso, fim;
	private int x, y;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Labirinto window = new Labirinto();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Labirinto() {
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
						"Tem certeza que deseja sair do jogo (todo seu progresso ser� perdido)?", "Sair",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		frame.setIconImage(new ImageIcon("src/imagens/Icone.png").getImage());

		panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		ImageIcon img1 = new ImageIcon("src/imagens/mago.png");
		img1.setImage(img1.getImage().getScaledInstance(50, 50, 100));

		player = new JLabel(img1);
		player.setBounds(10, 568, 60, 60);
		player.setOpaque(true);
		player.setBackground(Color.WHITE);
		player.addMouseListener(this);
		player.addMouseMotionListener(this);
		panel.add(player);

		ImageIcon fund = new ImageIcon("src/imagens/AreaClara.png");
		fund.setImage(fund.getImage().getScaledInstance(frame.getBounds().width * 2, frame.getBounds().width * 2, 100));
		
		fundo = new JLabel(fund);
		fundo.setSize(frame.getBounds().width * 2, frame.getBounds().width * 2);
		fundo.setLocation(((player.getLocation().x) - (fundo.getSize().width / 2) + (player.getSize().width / 2) + 30),
				(player.getLocation().y - (fundo.getSize().height / 2) + (player.getSize().height / 2)) - 5);
		panel.add(fundo);

		ImageIcon imgParedeV = new ImageIcon("src/imagens/Tile2-export.png");
		imgParedeV.setImage(imgParedeV.getImage().getScaledInstance(50, 100, 100));

		ImageIcon imgParedeH = new ImageIcon("src/imagens/ParedeX.png");
		imgParedeH.setImage(imgParedeH.getImage().getScaledInstance(100, 50, 100));
		
		ImageIcon livro = new ImageIcon("src/imagens/Livro.png");
		livro.setImage(livro.getImage().getScaledInstance(79, 82, 100));


		fim = new JLabel(livro);
		
		switch(new Random().nextInt(4)) {
			case 0:
				fim.setBounds(696, 568, 79, 82);
				break;
		    case 1:
		    	fim.setBounds(885, 570, 79, 82);
		    	break;
		    case 2:
		    	fim.setBounds(470, 212, 79, 82);
		    	break;
		    default:
		    	fim.setBounds(1000, 325, 79, 82);
		    	break;		
		}
		
		panel.add(fim);
		
		parede = new JLabel[73];
		
		parede[0] = new JLabel(imgParedeH);
		parede[0].setBounds(0, 650, 100, 50);
		panel.add(parede[0]);

		parede[1] = new JLabel(imgParedeH);
		parede[1].setBounds(100, 650, 100, 50);
		panel.add(parede[1]);

		parede[2] = new JLabel(imgParedeH);
		parede[2].setBounds(200, 650, 100, 50);
		panel.add(parede[2]);

		parede[3] =new JLabel(imgParedeH);
		parede[3].setBounds(300, 650, 100, 50);
		panel.add(parede[3]);

		parede[4] = new JLabel(imgParedeH);
		parede[4].setBounds(500, 650, 100, 50);
		panel.add(parede[4]);

		parede[5] = new JLabel(imgParedeH);
		parede[5].setBounds(400, 650, 100, 50);
		panel.add(parede[5]);

		parede[6] = new JLabel(imgParedeV);
		parede[6].setBounds(800, 550, 50, 100);
		panel.add(parede[6]);

		parede[7] = new JLabel(imgParedeV);
		parede[7].setBounds(450, 450, 50, 100);
		panel.add(parede[7]);

		parede[8] = new JLabel(imgParedeV);
		parede[8].setBounds(150, 450, 50, 100);
		panel.add(parede[8]);

		parede[9] = new JLabel(imgParedeV);
		parede[9].setBounds(0, 350, 50, 100);
		panel.add(parede[9]);

		parede[10] = new JLabel(imgParedeV);
		parede[10].setBounds(0, 250, 50, 100);
		panel.add(parede[10]);

		parede[11] = new JLabel(imgParedeV);
		parede[11].setBounds(300, 400, 50, 100);
		panel.add(parede[11]);

		parede[12] = new JLabel(imgParedeV);
		parede[12].setBounds(300, 300, 50, 100);
		panel.add(parede[12]);

		parede[13] = new JLabel(imgParedeH);
		parede[13].setBounds(900, 650, 100, 50);
		panel.add(parede[13]);

		parede[14] = new JLabel(imgParedeH);
		parede[14].setBounds(800, 650, 100, 50);
		panel.add(parede[14]);

		parede[15] = new JLabel(imgParedeH);
		parede[15].setBounds(700, 650, 100, 50);
		panel.add(parede[15]);

		parede[16] = new JLabel(imgParedeH);
		parede[16].setBounds(600, 650, 100, 50);
		panel.add(parede[16]);

		parede[17] = new JLabel(imgParedeH);
		parede[17].setBounds(300, 150, 100, 50);
		panel.add(parede[17]);

		parede[18] = new JLabel(imgParedeH);
		parede[18].setBounds(650, 300, 100, 50);
		panel.add(parede[18]);

		parede[19] = new JLabel(imgParedeH);
		parede[19].setBounds(850, 500, 100, 50);
		panel.add(parede[19]);

		parede[20] = new JLabel(imgParedeV);
		parede[20].setBounds(950, 450, 50, 100);
		panel.add(parede[20]);

		parede[21] = new JLabel(imgParedeV);
		parede[21].setBounds(0, 150, 50, 100);
		panel.add(parede[21]);

		parede[22] = new JLabel(imgParedeH);
		parede[22].setBounds(0, 0, 100, 50);
		panel.add(parede[22]);

		parede[23] = new JLabel(imgParedeH);
		parede[23].setBounds(200, 0, 100, 50);
		panel.add(parede[23]);

		parede[24] = new JLabel(imgParedeH);
		parede[24].setBounds(750, 300, 100, 50);
		panel.add(parede[24]);

		parede[25] = new JLabel(imgParedeH);
		parede[25].setBounds(1000, 450, 100, 50);
		panel.add(parede[25]);

		parede[26] = new JLabel(imgParedeV);
		parede[26].setBounds(950, 200, 50, 100);
		panel.add(parede[26]);

		parede[27] = new JLabel(imgParedeV);
		parede[27].setBounds(800, 200, 50, 100);
		panel.add(parede[27]);

		parede[28] = new JLabel(imgParedeH);
		parede[28].setBounds(1100, 650, 100, 50);
		panel.add(parede[28]);

		parede[29] = new JLabel(imgParedeH);
		parede[29].setBounds(1200, 650, 100, 50);
		panel.add(parede[29]);

		parede[30] = new JLabel(imgParedeV);
		parede[30].setBounds(1300, 600, 50, 100);
		panel.add(parede[30]);

		parede[31] = new JLabel(imgParedeV);
		parede[31].setBounds(1300, 500, 50, 100);
		panel.add(parede[31]);

		parede[32] = new JLabel(imgParedeV);
		parede[32].setBounds(1300, 400, 50, 100);
		panel.add(parede[32]);

		parede[33] = new JLabel(imgParedeV);
		parede[33].setBounds(1300, 300, 50, 100);
		panel.add(parede[33]);

		parede[34] = new JLabel(imgParedeV);
		parede[34].setBounds(1300, 200, 50, 100);
		panel.add(parede[34]);

		parede[35] = new JLabel(imgParedeV);
		parede[35].setBounds(1300, 100, 50, 100);
		panel.add(parede[35]);

		parede[36] = new JLabel(imgParedeV);
		parede[36].setBounds(1300, 0, 50, 100);
		panel.add(parede[36]);

		parede[37] = new JLabel(imgParedeH);
		parede[37].setBounds(1200, 0, 100, 50);
		panel.add(parede[37]);

		parede[38] = new JLabel(imgParedeH);
		parede[38].setBounds(1100, 0, 100, 50);
		panel.add(parede[38]);

		parede[39] = new JLabel(imgParedeH);
		parede[39].setBounds(1000, 0, 100, 50);
		panel.add(parede[39]);

		parede[40] = new JLabel(imgParedeH);
		parede[40].setBounds(900, 0, 100, 50);
		panel.add(parede[40]);

		parede[41] = new JLabel(imgParedeH);
		parede[41].setBounds(800, 0, 100, 50);
		panel.add(parede[41]);

		parede[42] = new JLabel(imgParedeH);
		parede[42].setBounds(700, 0, 100, 50);
		panel.add(parede[42]);

		parede[43] = new JLabel(imgParedeH);
		parede[43].setBounds(600, 0, 100, 50);
		panel.add(parede[43]);

		parede[44] = new JLabel(imgParedeH);
		parede[44].setBounds(500, 0, 100, 50);
		panel.add(parede[44]);

		parede[45] = new JLabel(imgParedeH);
		parede[45].setBounds(400, 0, 100, 50);
		panel.add(parede[45]);

		parede[46] = new JLabel(imgParedeH);
		parede[46].setBounds(300, 0, 100, 50);
		panel.add(parede[46]);

		parede[47] = new JLabel(imgParedeH);
		parede[47].setBounds(500, 150, 100, 50);
		panel.add(parede[47]);

		parede[48] = new JLabel(imgParedeH);
		parede[48].setBounds(400, 150, 100, 50);
		panel.add(parede[48]);

		parede[49] = new JLabel(imgParedeH);
		parede[49].setBounds(950, 150, 100, 50);
		panel.add(parede[49]);

		parede[50] = new JLabel(imgParedeV);
		parede[50].setBounds(600, 550, 50, 100);
		panel.add(parede[50]);

		parede[51] = new JLabel(imgParedeH);
		parede[51].setBounds(1000, 650, 100, 50);
		panel.add(parede[51]);

		parede[52] = new JLabel(imgParedeH);
		parede[52].setBounds(1100, 450, 100, 50);
		panel.add(parede[52]);

		parede[53] = new JLabel(imgParedeH);
		parede[53].setBounds(1050, 150, 100, 50);
		panel.add(parede[53]);

		parede[54] = new JLabel(imgParedeV);
		parede[54].setBounds(1150, 250, 50, 100);
		panel.add(parede[54]);

		parede[55] = new JLabel(imgParedeV);
		parede[55].setBounds(1150, 150, 50, 100);
		panel.add(parede[55]);

		parede[56] = new JLabel(imgParedeV);
		parede[56].setBounds(1150, 350, 50, 100);
		panel.add(parede[56]);

		parede[57] = new JLabel(imgParedeV);
		parede[57].setBounds(600, 450, 50, 100);
		panel.add(parede[57]);

		parede[58] = new JLabel(imgParedeV);
		parede[58].setBounds(800, 450, 50, 100);
		panel.add(parede[58]);

		parede[59] = new JLabel(imgParedeV);
		parede[59].setBounds(800, 350, 50, 100);
		panel.add(parede[59]);

		parede[60] = new JLabel(imgParedeV);
		parede[60].setBounds(450, 350, 50, 100);
		panel.add(parede[60]);

		parede[61] = new JLabel(imgParedeH);
		parede[61].setBounds(350, 300, 100, 50);
		panel.add(parede[61]);

		parede[62] = new JLabel(imgParedeH);
		parede[62].setBounds(450, 300, 100, 50);
		panel.add(parede[62]);

		parede[63] = new JLabel(imgParedeV);
		parede[63].setBounds(0, 50, 50, 100);
		panel.add(parede[63]);

		parede[64] = new JLabel(imgParedeH);
		parede[64].setBounds(100, 0, 100, 50);
		panel.add(parede[64]);

		parede[65] = new JLabel(imgParedeH);
		parede[65].setBounds(550, 300, 100, 50);
		panel.add(parede[65]);

		parede[66] = new JLabel(imgParedeH);
		parede[66].setBounds(750, 150, 100, 50);
		panel.add(parede[66]);

		parede[67] = new JLabel(imgParedeV);
		parede[67].setBounds(0, 450, 50, 100);
		panel.add(parede[67]);

		parede[68] = new JLabel(imgParedeV);
		parede[68].setBounds(150, 350, 50, 100);
		panel.add(parede[68]);

		parede[69] = new JLabel(imgParedeV);
		parede[69].setBounds(150, 250, 50, 100);
		panel.add(parede[69]);

		parede[70] = new JLabel(imgParedeV);
		parede[70].setBounds(150, 150, 50, 100);
		panel.add(parede[70]);

		parede[71] = new JLabel(imgParedeH);
		parede[71].setBounds(200, 150, 100, 50);
		panel.add(parede[71]);

		parede[72] = new JLabel(imgParedeV);
		parede[72].setBounds(550, 200, 50, 100);
		panel.add(parede[72]);
		
		JLabel preto = new JLabel("");
		preto.setOpaque(true);
		preto.setBackground(Color.BLACK);
		preto.setSize(size);
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

		int xPlayermin = player.getBounds().x; // Esquerda
		int xPlayermax = player.getBounds().x + player.getBounds().width; // Direita

		int yPlayermin = player.getBounds().y; // Cima
		int yPlayermax = player.getBounds().y + player.getBounds().height;// Baixo

		int xParedemax, xParedemin, yParedemax, yParedemin;

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

		player.setLocation(player.getBounds().x + x1, player.getBounds().y + y1);

		fundo.setLocation(((player.getLocation().x) - (fundo.getSize().width / 2) + (player.getSize().width / 2) + 30),
				(player.getLocation().y - (fundo.getSize().height / 2) + (player.getSize().height / 2)) - 5);
		

		if (((yPlayermin >= (fim.getBounds().y + fim.getBounds().width)) && ((yPlayermin + y1) < (fim.getBounds().y + fim.getBounds().height)))
				|| ((yPlayermax <= fim.getBounds().y) && ((yPlayermax + y1) > fim.getBounds().y))) {
			if (((xPlayermin >= fim.getBounds().x) && (xPlayermax <= fim.getBounds().x + fim.getBounds().height))
					|| ((xPlayermin <= fim.getBounds().x) && (xPlayermax >= fim.getBounds().x))
					|| ((xPlayermin <= fim.getBounds().x + fim.getBounds().height) && (xPlayermax >= fim.getBounds().x + fim.getBounds().height))) {
				JOptionPane.showMessageDialog(null,"nice");
			}
		}
		else if (((xPlayermin >= fim.getBounds().x + fim.getBounds().width) && ((xPlayermin + x1) < fim.getBounds().x + fim.getBounds().width))
				|| ((xPlayermax <= fim.getBounds().x) && ((xPlayermax + x1) > fim.getBounds().x))) {
				if (((yPlayermin <= (fim.getBounds().y + fim.getBounds().width)) && (yPlayermax >= (fim.getBounds().y + fim.getBounds().width)))
					|| ((yPlayermin <= fim.getBounds().y) && (yPlayermax >= fim.getBounds().y))
					|| ((yPlayermin >= fim.getBounds().y) && (yPlayermax <= (fim.getBounds().y + fim.getBounds().width)))) {
					JOptionPane.showMessageDialog(null,"nice");
				}
				
			}
	}
}