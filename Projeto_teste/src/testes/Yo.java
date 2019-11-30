package testes;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Rectangle;

public class Yo {

	private JFrame frame;
	private JButton continuar;
	private JLabel txt;
	private JLabel fundo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Yo window = new Yo();
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
	public Yo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.frame.setSize(610,438);
		this.frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		//botão continuar
		continuar = new JButton();
		continuar.setIcon(new ImageIcon(Yo.class.getResource("/imagens/continuar.png")));
		this.frame.getContentPane().add(continuar);
		this.continuar.setLayout(null);
		this.continuar.setVisible(true);
		this.continuar.setBounds(430,338,150,50);
		this.continuar.setContentAreaFilled(false);
		
		
		
		//definição do texto da janela
		txt = new JLabel();
//		this.txt.setText("Carapaça");
		this.txt.setBounds(50,52,500,30);
		this.txt.setFont(new Font("Georgia",Font.BOLD, 25));
		this.txt.setForeground(Color.black);
		this.frame.getContentPane().add(txt);
		
		//fundo
		ImageIcon fund = new ImageIcon("src/imagens/fundo_dialogo.png");
		fund.setImage(fund.getImage().getScaledInstance(this.frame.getSize().width,this.frame.getSize().height,100));
		fundo = new JLabel(fund);
		this.frame.getContentPane().add(fundo);
		this.fundo.setBounds(new Rectangle(96, 0, 498, 399));
		this.frame.setVisible(true);
		
	}
	
public JFrame getTexto() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JButton getContinuar() {
		return continuar;
	}

	public void setContinuar(JButton continuar) {
		this.continuar = continuar;
	}

	public JLabel getTxt() {
		return txt;
	}

	public void setTxt(JLabel txt) {
		this.txt = txt;
	}

	public JLabel getFundo() {
		return fundo;
	}

	public void setFundo(JLabel fundo) {
		this.fundo = fundo;
	}

public void atualizaTexto(String tex,int pulalinha) {
		
		//botão continuar
				this.frame.add(continuar);
				this.continuar.setLayout(null);
				this.continuar.setVisible(true);
				this.continuar.setBounds(430,338,150,50);
				this.continuar.setContentAreaFilled(false);

				//definição do texto da janela
				this.txt.setText(tex);
				this.txt.setBounds(50,52,tex.length()*10,30*(1+pulalinha));
				this.txt.setFont(new Font("Georgia",Font.BOLD, 25));
				this.txt.setForeground(Color.black);
				this.txt.setVisible(true);
				this.frame.add(txt);
				
				
				//fundo
				this.frame.add(fundo);
				this.fundo.setVisible(true);
				this.fundo.setBounds(0,0,600,400);
				
				
				this.frame.setVisible(true);
	}
	
	public void zerar() {
		this.continuar.setVisible(false);
		this.txt.setVisible(false);
		this.fundo.setVisible(false);
	}

}
