package enigmas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import sons.Musica;

public class Hidra {
	
	private JDialog frame[] = new JDialog[200];
	private static Musica musica;
	private static int cont;
	private int numb;
	private int numero;
	private static int cut;
	private static int controlCut;
	private JFrame background;
	private JDialog top;
	private JDialog cbc_1;
	private JDialog cbc_2;
	private JDialog cbc_3;
	private JDialog cbc_4;
	private JDialog cbc_5;
	private JDialog cbc_6;
	private JDialog cbc_7;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					@SuppressWarnings("unused")
					Hidra window = new Hidra();
					
					
					//window.frame[cont].setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	@SuppressWarnings("static-access")
	public Hidra() {
		for(int i=0;i<frame.length;i++) {
			frame[i] = new JDialog();
			frame[i].setVisible(false);
		}
		
		this.numb=8;
		this.cont = 0;
		this.cut = 0;
		this.controlCut=0;
		initialize();
		
	}
	
	public int getCut() {
		return cut;
	}

	public void setCut(int cut) {
		Hidra.cut = cut;
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		musica = new Musica();
		musica.TocaMusica("src/sons/musicaHidra.wav");
		
		background = new JFrame();
		ImageIcon icone = new ImageIcon("src/imagens/Icone.png");
		background.setIconImage(icone.getImage());
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
			            JOptionPane.YES_NO_OPTION,
			            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
			            System.exit(0);
			        }
		    	else {
		    		exiting.dispose();
		    	}
		    	
		    }
		});
		
		JLabel fundo = new JLabel("fundoooo");
		fundo.setLocation(0,0);
		fundo.setSize(background.getSize());
		fundo.setVisible(true);
		background.getContentPane().add(fundo);
		background.setVisible(true);
		
		cbc_1 = new JDialog();
		cbc_1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		cbc_1.setResizable(false);
		cbc_1.setAlwaysOnTop(true);
		cbc_1.addWindowListener(new java.awt.event.WindowAdapter() {
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		    		numero = Integer.parseInt(cbc_1.getName());
		        	spawn();
		    		controlCut++;		        	
		        	//System.out.println(cut);
		    }
		});
		cbc_1.setName("0");
		cbc_1.setSize(294,275);
		cbc_1.setLocationRelativeTo(null);
		cbc_1.setLocation(cbc_1.getBounds().x-290,cbc_1.getBounds().y-(270/2));
		cbc_1.setTitle(cbc_1.getName());
		
		JPanel panel = new JPanel();
		cbc_1.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Hidra.class.getResource("/imagens/cabeca.png")));
		lblNewLabel.setBounds(0, 0, 278, 236);
		panel.add(lblNewLabel);
		
		cbc_1.setVisible(true);
		
		
		
		cbc_2 = new JDialog();
		cbc_2.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		cbc_2.setResizable(false);
		cbc_2.setAlwaysOnTop(true);
		cbc_2.addWindowListener(new java.awt.event.WindowAdapter() {
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		    		numero = Integer.parseInt(cbc_2.getName());
		        	spawn();
		    		controlCut++;		        	
		        	//System.out.println(cut);
		    }
		});
		cbc_2.setName("1");
		cbc_2.setSize(294,275);
		cbc_2.setLocationRelativeTo(null);
		cbc_2.setLocation(cbc_2.getBounds().x,cbc_2.getBounds().y-(270));
		cbc_2.setTitle(cbc_2.getName());
		
		JPanel panel_2 = new JPanel();
		cbc_2.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(Hidra.class.getResource("/imagens/cabeca.png")));
		lblNewLabel_2.setBounds(0, 0, 278, 236);
		panel_2.add(lblNewLabel_2);
		
		cbc_2.setVisible(true);
		
		
		cbc_3 = new JDialog();
		cbc_3.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		cbc_3.setResizable(false);
		cbc_3.setAlwaysOnTop(true);
		cbc_3.addWindowListener(new java.awt.event.WindowAdapter() {
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		    		numero = Integer.parseInt(cbc_3.getName());
		        	spawn();
		    		controlCut++;		        	
		        	//System.out.println(cut);
		    }
		});
		cbc_3.setName("2");
		cbc_3.setSize(294,275);
		cbc_3.setLocationRelativeTo(null);
		cbc_3.setLocation(cbc_3.getBounds().x+290,cbc_3.getBounds().y-(270/2));
		cbc_3.setTitle(cbc_3.getName());
		
		JPanel panel_3 = new JPanel();
		cbc_3.getContentPane().add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(Hidra.class.getResource("/imagens/cabeca.png")));
		lblNewLabel_3.setBounds(0, 0, 278, 236);
		panel_3.add(lblNewLabel_3);
		
		cbc_3.setVisible(true);
		
		
		cbc_4 = new JDialog();
		cbc_4.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		cbc_4.setResizable(false);
		cbc_4.setAlwaysOnTop(true);
		cbc_4.addWindowListener(new java.awt.event.WindowAdapter() {
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		    		numero = Integer.parseInt(cbc_4.getName());
		        	spawn();
		    		controlCut++;		        	
		        	//System.out.println(cut);
		    }
		});
		cbc_4.setName("3");
		cbc_4.setSize(294,275);
		cbc_4.setLocationRelativeTo(null);
		cbc_4.setLocation(cbc_4.getBounds().x-290,cbc_4.getBounds().y+(270/2));
		cbc_4.setTitle(cbc_4.getName());
		
		JPanel panel_4 = new JPanel();
		cbc_4.getContentPane().add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(Hidra.class.getResource("/imagens/cabeca.png")));
		lblNewLabel_4.setBounds(0, 0, 278, 236);
		panel_4.add(lblNewLabel_4);
		
		cbc_4.setVisible(true);
		
		
		cbc_5 = new JDialog();
		cbc_5.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		cbc_5.setResizable(false);
		cbc_5.setAlwaysOnTop(true);
		cbc_5.addWindowListener(new java.awt.event.WindowAdapter() {
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		    		numero = Integer.parseInt(cbc_5.getName());
		        	spawn();
		    		controlCut++;		        	
		        	//System.out.println(cut);
		    }
		});
		cbc_5.setName("4");
		cbc_5.setSize(294,275);
		cbc_5.setLocationRelativeTo(null);
		cbc_5.setLocation(cbc_5.getBounds().x,cbc_5.getBounds().y+(270));
		cbc_5.setTitle(cbc_5.getName());
		
		JPanel panel_5 = new JPanel();
		cbc_5.getContentPane().add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(Hidra.class.getResource("/imagens/cabeca.png")));
		lblNewLabel_5.setBounds(0, 0, 278, 236);
		panel_5.add(lblNewLabel_5);
		
		cbc_5.setVisible(true);
		
		
		cbc_6 = new JDialog();
		cbc_6.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		cbc_6.setResizable(false);
		cbc_6.setAlwaysOnTop(true);
		cbc_6.addWindowListener(new java.awt.event.WindowAdapter() {
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		    		numero = Integer.parseInt(cbc_6.getName());
		        	spawn();
		    		controlCut++;		        	
		        	//System.out.println(cut);
		    }
		});
		cbc_6.setName("5");
		cbc_6.setSize(294,275);
		cbc_6.setLocationRelativeTo(null);
		cbc_6.setLocation(cbc_6.getBounds().x+290,cbc_6.getBounds().y+(270/2));
		cbc_6.setTitle(cbc_6.getName());
		
		JPanel panel_6 = new JPanel();
		cbc_6.getContentPane().add(panel_6, BorderLayout.CENTER);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(Hidra.class.getResource("/imagens/cabeca.png")));
		lblNewLabel_6.setBounds(0, 0, 278, 236);
		panel_6.add(lblNewLabel_6);
		
		cbc_6.setVisible(true);
		
		
		cbc_7 = new JDialog();
		cbc_7.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		cbc_7.setResizable(false);
		cbc_7.setAlwaysOnTop(true);
		cbc_7.addWindowListener(new java.awt.event.WindowAdapter() {
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		    		numero = Integer.parseInt(cbc_7.getName());
		        	spawn();
		    		controlCut++;		        	
		        	//System.out.println(cut);
		    }
		});
		cbc_7.setName("6");
		cbc_7.setSize( 294, 275);
		cbc_7.setLocationRelativeTo(null);
		cbc_7.setTitle(cbc_7.getName());
		
		JPanel panel_7 = new JPanel();
		cbc_7.getContentPane().add(panel_7, BorderLayout.CENTER);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon(Hidra.class.getResource("/imagens/cabeca.png")));
		lblNewLabel_7.setBounds(0, 0, 278, 236);
		panel_7.add(lblNewLabel_7);
		
		cbc_7.setVisible(true);
		
		
		
		for(cont=0;cont<7;cont++) {
		if(cont==0) {
		frame[cont].setBounds(cbc_1.getBounds());
		}

		else if(cont==1) {
		frame[cont].setBounds(cbc_2.getBounds());
		}

		else if(cont==2) {
		frame[cont].setBounds(cbc_3.getBounds());
		}

		else if(cont==3) {
		frame[cont].setBounds(cbc_4.getBounds());
		}

		else if(cont==4) {
		frame[cont].setBounds(cbc_5.getBounds());
		}

		else if(cont==5) {
		frame[cont].setBounds(cbc_6.getBounds());
		}

		else if(cont==6) {
		frame[cont].setBounds(cbc_7.getBounds());
		}
		}
		
		
	}
	
	private void spawn() {
		
		if(controlCut==0) {
		inicializaCoracao();
		mudaCoracao();}
		if(numero>=6) {
		if(cut==6) {
    		cut=0;
    		}
    	if(cut<6) {
    		cut++;
    	}}
    	
		Random dis = new Random();
		
		JDialog frame_2 = new JDialog();
		frame_2.setName(""+numb);
		//System.out.println(frame_2.getName());
		frame_2.setAlwaysOnTop(true);
		frame_2.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		frame_2.setResizable(false);
		frame_2.addWindowListener(new java.awt.event.WindowAdapter() {
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		    		numero = Integer.parseInt(frame_2.getName());
		    		controlCut++;
		        	spawn();
		        	//System.out.println(cut);
		    }
		});
		frame_2.setBounds(frame[numero].getX()-133,frame[numero].getY()+dis.nextInt(80)-40,frame[numero].getWidth(),frame[numero].getHeight());
		
		JPanel panel = new JPanel();
		frame_2.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Hidra.class.getResource("/imagens/cabeca.png")));
		lblNewLabel.setBounds(0, 0, 278, 236);
		panel.add(lblNewLabel);
		
		frame[numb] = frame_2;
		frame[numb].setVisible(true);
		
		numb++;
		
		JDialog frame_3 = new JDialog();
		frame_3.setName(""+numb);
		frame_3.setAlwaysOnTop(true);
		//System.out.println(frame_3.getName());
		frame_3.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		frame_3.setResizable(false);
		frame_3.addWindowListener(new java.awt.event.WindowAdapter() {
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		    		numero = Integer.parseInt(frame_3.getName());
		    		controlCut++;
		        	spawn();
		        	//System.out.println(cut);
		    }
		});
		frame_3.setBounds(frame[numero].getX()+133,frame[numero].getY()+dis.nextInt(80)-40,frame[numero].getWidth(),frame[numero].getHeight());
		
		JPanel panel_2 = new JPanel();
		frame_3.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(Hidra.class.getResource("/imagens/cabeca.png")));
		lblNewLabel_2.setBounds(0, 0, 278, 236);
		panel_2.add(lblNewLabel_2);
		
		frame[numb] = frame_3;
		frame[numb].setVisible(true);
		
		numb++;
		
	}
	
	public void inicializaCoracao() {
		top = new JDialog();
		top.setResizable(false);
		top.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		top.setResizable(false);
		top.setSize(100,100);
		
		top.addWindowListener(new java.awt.event.WindowAdapter() {
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		    		musica.stop();
		    		for(int i=0;i<frame.length;i++) {
		    			if(frame[i].isVisible()) {
		    				frame[i].dispose();
		    			}
		    		}
		    		if(cbc_1.isVisible()) {
		    			cbc_1.dispose();
		    		}
		    		if(cbc_2.isVisible()) {
		    			cbc_2.dispose();
		    		}
		    		if(cbc_3.isVisible()) {
		    			cbc_3.dispose();
		    		}
		    		if(cbc_4.isVisible()) {
		    			cbc_4.dispose();
		    		}
		    		if(cbc_5.isVisible()) {
		    			cbc_5.dispose();
		    		}
		    		if(cbc_6.isVisible()) {
		    			cbc_6.dispose();
		    		}
		    		if(cbc_7.isVisible()) {
		    			cbc_7.dispose();
		    		}
		    }
		});

		JPanel painel = new JPanel();
		top.getContentPane().add(painel, BorderLayout.CENTER);
		painel.setLayout(null);
		
		ImageIcon fund = new ImageIcon("src/imagens/coracao.png");
		fund.setImage(fund.getImage().getScaledInstance(top.getSize().width,top.getSize().height,100));
		JLabel coracao = new JLabel(fund);
		coracao.setBounds(12, 0, 100,100);
		painel.add(coracao);
		
		
		
		
		
		//System.out.println(cut);
	
	}
	
	public void mudaCoracao() {
		Random cot = new Random();
		if(cot.nextInt(7)==0) {
			top.setBounds(560+10,200+42,50,130);
		}
		else if(cot.nextInt(7)==1) {
			top.setBounds(550+294+10,275+100+42,50,130);
		}
		else if(cot.nextInt(7)==2) {
			top.setBounds(340+294+200+294+10,200+50,50,130);
		}
		else if(cot.nextInt(7)==3) {
			top.setBounds(560+10,275+200+42,50,130);
		}
		else if(cot.nextInt(7)==4) {
			top.setBounds(550+294+10,275+100+275+42,50,130);
		}
		else if(cot.nextInt(7)==5) {
			top.setBounds(340+294+294+200+10,275+200+42,50,130);
		}
		else if(cot.nextInt(7)==6) {
			top.setBounds(550+294+10,275+100+42,50,130);
		}
		else
			top.setBounds(550+294+10,275+100+42,50,130);
		top.setVisible(true);
		
		/*for(i=0;i<7;i++) {
			if(i!=cot.nextInt(7)) {
				central[i].setVisible(false);
			}
		}*/
		
		
		
	}

	public static int getControlCut() {
		return controlCut;
	}

	public static void setControlCut(int controlCut) {
		Hidra.controlCut = controlCut;
	}
}
