package testes;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;

public class Labirinto implements MouseListener, MouseMotionListener {

	private JFrame frame;
	JLabel player;
	private int x, y;
	private JLabel[] parede;
	

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
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();//Adquire o tamanho da tela
		frame.setSize(size );
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
		frame.setIconImage(new ImageIcon("src/imagens/Icone.png").getImage());
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		ImageIcon img1 = new ImageIcon("src/imagens/mago.png");
		img1.setImage(img1.getImage().getScaledInstance(50, 50, 100));

		player = new JLabel(img1);
		player.setBounds(366, 51,55,55);
		player.addMouseListener( this );
		player.addMouseMotionListener( this ); 
		panel.add(player);
		
		parede = new JLabel[18];
		parede[0] = new JLabel("PAREDE");
		parede[0].setFont(new Font("Georgia", Font.BOLD, 20));
		parede[0].setForeground(Color.WHITE);
		parede[0].setBackground(Color.BLACK);
		parede[0].setBounds(426, 117, 160, 20);
		parede[0].setOpaque(true);
		panel.add(parede[0]);
		
		parede[1] = new JLabel("New label");
		parede[1].setOpaque(true);
		parede[1].setBackground(Color.BLACK);
		parede[1].setBounds(356, 20, 90, 20);
		panel.add(parede[1]);
		
		parede[2] = new JLabel("New label");
		parede[2].setOpaque(true);
		parede[2].setBackground(Color.BLACK);
		parede[2].setBounds(337, 20, 20, 180);
		panel.add(parede[2]);
		
		parede[3] = new JLabel("New label");
		parede[3].setOpaque(true);
		parede[3].setBackground(Color.BLACK);
		parede[3].setBounds(337, 155, 20, 160);
		panel.add(parede[3]);
		
		parede[4] = new JLabel("New label");
		parede[4].setOpaque(true);
		parede[4].setBackground(Color.BLACK);
		parede[4].setBounds(347, 212, 180, 20);
		panel.add(parede[4]);
		
		parede[5] = new JLabel("New label");
		parede[5].setOpaque(true);
		parede[5].setBackground(Color.BLACK);
		parede[5].setBounds(426, 32, 20, 90);
		panel.add(parede[5]);
		
		parede[6] = new JLabel("New parede[6]");
		parede[6].setOpaque(true);
		parede[6].setBackground(Color.BLACK);
		parede[6].setBounds(513, 212, 90, 20);
		panel.add(parede[6]);
		
		parede[7] = new JLabel("New label");
		parede[7].setOpaque(true);
		parede[7].setBackground(Color.BLACK);
		parede[7].setBounds(356, 295, 90, 20);
		panel.add(parede[7]);
		
		parede[8] = new JLabel("New label");
		parede[8].setOpaque(true);
		parede[8].setBackground(Color.BLACK);
		parede[8].setBounds(440, 295, 90, 20);
		panel.add(parede[8]);
		
		parede[9] = new JLabel("New label");
		parede[9].setOpaque(true);
		parede[9].setBackground(Color.BLACK);
		parede[9].setBounds(513, 295, 90, 20);
		panel.add(parede[9]);
		
		parede[10] = new JLabel("New label");
		parede[10].setOpaque(true);
		parede[10].setBackground(Color.BLACK);
		parede[10].setBounds(674, 295, 90, 20);
		panel.add(parede[10]);
		
		parede[11] = new JLabel("New label");
		parede[11].setOpaque(true);
		parede[11].setBackground(Color.BLACK);
		parede[11].setBounds(581, 117, 90, 20);
		panel.add(parede[11]);
		
		parede[12] = new JLabel("New label");
		parede[12].setOpaque(true);
		parede[12].setBackground(Color.BLACK);
		parede[12].setBounds(595, 295, 90, 20);
		panel.add(parede[12]);
		
		parede[13] = new JLabel("New label");
		parede[13].setOpaque(true);
		parede[13].setBackground(Color.BLACK);
		parede[13].setBounds(663, 117, 90, 20);
		panel.add(parede[13]);
		
		parede[14] = new JLabel("New label");
		parede[14].setOpaque(true);
		parede[14].setBackground(Color.BLACK);
		parede[14].setBounds(752, 117, 90, 20);
		panel.add(parede[14]);
		
		parede[15] = new JLabel("New label");
		parede[15].setOpaque(true);
		parede[15].setBackground(Color.BLACK);
		parede[15].setBounds(822, 130, 20, 90);
		panel.add(parede[15]);
		
		parede[16] = new JLabel("New label");
		parede[16].setOpaque(true);
		parede[16].setBackground(Color.BLACK);
		parede[16].setBounds(822, 219, 20, 96);
		panel.add(parede[16]);
		
		parede[17] = new JLabel("New label");
		parede[17].setOpaque(true);
		parede[17].setBackground(Color.BLACK);
		parede[17].setBounds(740, 295, 90, 20);
		panel.add(parede[17]);
		
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

		int xPlayermin = player.getBounds().x; //Esquerda
		int xPlayermax = player.getBounds().x + player.getBounds().width; //Direita
		
		int yPlayermin = player.getBounds().y; //Cima
		int yPlayermax = player.getBounds().y + player.getBounds().height;//Baixo
		
		int xParedemax,xParedemin,yParedemax,yParedemin;
		
		
		int x1, y1;
		x1 = e.getX() - x;
		y1 = e.getY() - y;
		
		for(int cont = 0; cont < parede.length; cont ++) {
			 
			 xParedemax = parede[cont].getBounds().x+parede[cont].getBounds().width;
			 xParedemin = parede[cont].getBounds().x;
			 yParedemax = parede[cont].getBounds().y+parede[cont].getBounds().height;
			 yParedemin = parede[cont].getBounds().y;
			
			if( ( ( xPlayermin  >= xParedemax) && ( (xPlayermin + x1) <= xParedemax) )||
				    ( ( xPlayermax  <= xParedemin) && ( (xPlayermax + x1) >= xParedemin) ) ){
						if( ( (yPlayermin <= yParedemax) && (yPlayermax >= yParedemax) )||
							( (yPlayermin <= yParedemin) && (yPlayermax >= yParedemin) )||
							( (yPlayermin >= yParedemin) && (yPlayermax <= yParedemax) )) {
								x1 = 0;
						}
									
				}
				if( ( ( yPlayermin >= yParedemax) && ( (yPlayermin + y1) < yParedemax) )||
					( ( yPlayermax <= yParedemin) && ( (yPlayermax + y1) > yParedemin) ) ){
							if( ( (xPlayermin >= xParedemin) && (xPlayermax <= xParedemax) )||
								( (xPlayermin <= xParedemin) && (xPlayermax >= xParedemin) )||
								( (xPlayermin <= xParedemax) && (xPlayermax >= xParedemax) ) ) {
									y1 = 0;
							}
				}
		}
		
		
		player.setLocation(player.getBounds().x + x1, player.getBounds().y + y1);
		
	}
}