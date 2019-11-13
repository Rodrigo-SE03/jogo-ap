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

public class Labirinto implements MouseListener, MouseMotionListener {

	private JFrame frame;
	boolean on;
	JLabel player;
	private int x, y;
	private JLabel parede;
	private JLabel parede1;
	private JLabel parede2;
	private JLabel parede3;
	private JLabel parede4;
	private JLabel parede5;
	

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
		player.setBounds(414, 75,55,55);
		player.addMouseListener( this );
		player.addMouseMotionListener( this ); 
		panel.add(player);
		
		parede = new JLabel("");
		parede.setBackground(Color.BLACK);
		parede.setBounds(480, 100, 160, 160);
		parede.setOpaque(true);
		panel.add(parede);
		
//		parede1 = new JLabel("New label");
//		parede1.setOpaque(true);
//		parede1.setBackground(Color.BLACK);
//		parede1.setBounds(356, 20, 90, 20);
//		panel.add(parede1);
//		
//		parede2 = new JLabel("New label");
//		parede2.setOpaque(true);
//		parede2.setBackground(Color.BLACK);
//		parede2.setBounds(337, 20, 20, 180);
//		panel.add(parede2);
//		
//		parede3 = new JLabel("New label");
//		parede3.setOpaque(true);
//		parede3.setBackground(Color.BLACK);
//		parede3.setBounds(337, 155, 20, 160);
//		panel.add(parede3);
//		
//		parede4 = new JLabel("New label");
//		parede4.setOpaque(true);
//		parede4.setBackground(Color.BLACK);
//		parede4.setBounds(337, 200, 180, 20);
//		panel.add(parede4);
//		
//		parede5 = new JLabel("New label");
//		parede5.setOpaque(true);
//		parede5.setBackground(Color.BLACK);
//		parede5.setBounds(426, 32, 20, 90);
//		panel.add(parede5);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		on = true;
	}

	@Override
	public void mouseExited(MouseEvent e) {
		on = false;
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
		
		int xParedemax = parede.getBounds().x+parede.getBounds().width;
		int xParedemin = parede.getBounds().x;
		
		int yParedemax = parede.getBounds().y+parede.getBounds().height;
		int yParedemin = parede.getBounds().y;
		
		boolean xs,ys;
		
		int x1, y1;
		x1 = e.getX() - x;
		y1 = e.getY() - y;
		
		if( ( ( xPlayermin  >= xParedemax) && ( (xPlayermin + x1) <= xParedemax) )||
		    ( ( xPlayermax  <= xParedemin) && ( (xPlayermax + x1) >= xParedemin) ) ){
				System.out.println("x1");
				if( ( (yPlayermin <= yParedemax) && (yPlayermax >= yParedemax) )||
					( (yPlayermin <= yParedemin) && (yPlayermax >= yParedemin) )||
					( (yPlayermin >= yParedemin) && (yPlayermax <= yParedemax) )) {
						x1 = 0;
						xs = false;
						System.out.println("x2");
				}
				else xs = true;
							
		}
		else xs = true;
		if( ( ( yPlayermin >= yParedemax) && ( (yPlayermin + y1) < yParedemax) )||
			( ( yPlayermax <= yParedemin) && ( (yPlayermax + y1) > yParedemin) ) ){
			System.out.println("y1");
					if( ( (xPlayermin >= xParedemin) && (xPlayermax <= xParedemax) )||
						( (xPlayermin <= xParedemin) && (xPlayermax >= xParedemin) )||
						( (xPlayermin <= xParedemax) && (xPlayermax >= xParedemax) ) ) {
							y1 = 0;
							ys = false;
							System.out.println("x2");
					}
					else ys = true;
		}
		else ys = true;
		
		if(on && xs && ys)player.setLocation(player.getBounds().x + x1, player.getBounds().y + y1);
		
	}
}