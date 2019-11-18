package enigmas;

import java.awt.EventQueue;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import sons.Musica;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Window.Type;

public class Hidra {
	
	private JFrame frame[] = new JFrame[200];
	private static int cont;
	private int numb;
	private int numero;
	private static int cut;
	private static int controlCut;
	private JFrame top;
	private JFrame cbc_1;
	private JFrame cbc_2;
	private JFrame cbc_3;
	private JFrame cbc_4;
	private JFrame cbc_5;
	private JFrame cbc_6;
	private JFrame cbc_7;
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
			frame[i] = new JFrame();
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
		cbc_1 = new JFrame();
		cbc_1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		cbc_1.setBounds(560,200, 294, 275);
		
		JPanel panel = new JPanel();
		cbc_1.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Hidra.class.getResource("/imagens/cabeca.png")));
		lblNewLabel.setBounds(0, 0, 278, 236);
		panel.add(lblNewLabel);
		
		cbc_1.setVisible(true);
		
		
		
		cbc_2 = new JFrame();
		cbc_2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		cbc_2.setBounds(550+294,100, 294, 275);
		
		JPanel panel_2 = new JPanel();
		cbc_2.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(Hidra.class.getResource("/imagens/cabeca.png")));
		lblNewLabel_2.setBounds(0, 0, 278, 236);
		panel_2.add(lblNewLabel_2);
		
		cbc_2.setVisible(true);
		
		
		cbc_3 = new JFrame();
		cbc_3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		cbc_3.setBounds(340+294+200+294,200, 294, 275);
		
		JPanel panel_3 = new JPanel();
		cbc_3.getContentPane().add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(Hidra.class.getResource("/imagens/cabeca.png")));
		lblNewLabel_3.setBounds(0, 0, 278, 236);
		panel_3.add(lblNewLabel_3);
		
		cbc_3.setVisible(true);
		
		
		cbc_4 = new JFrame();
		cbc_4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		cbc_4.setBounds(560,275+200, 294, 275);
		
		JPanel panel_4 = new JPanel();
		cbc_4.getContentPane().add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(Hidra.class.getResource("/imagens/cabeca.png")));
		lblNewLabel_4.setBounds(0, 0, 278, 236);
		panel_4.add(lblNewLabel_4);
		
		cbc_4.setVisible(true);
		
		
		cbc_5 = new JFrame();
		cbc_5.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		cbc_5.setBounds(550+294,275+100+275, 294, 275);
		
		JPanel panel_5 = new JPanel();
		cbc_5.getContentPane().add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(Hidra.class.getResource("/imagens/cabeca.png")));
		lblNewLabel_5.setBounds(0, 0, 278, 236);
		panel_5.add(lblNewLabel_5);
		
		cbc_5.setVisible(true);
		
		
		cbc_6 = new JFrame();
		cbc_6.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		cbc_6.setBounds(340+294+294+200,275+200, 294, 275);
		
		JPanel panel_6 = new JPanel();
		cbc_6.getContentPane().add(panel_6, BorderLayout.CENTER);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(Hidra.class.getResource("/imagens/cabeca.png")));
		lblNewLabel_6.setBounds(0, 0, 278, 236);
		panel_6.add(lblNewLabel_6);
		
		cbc_6.setVisible(true);
		
		
		cbc_7 = new JFrame();
		cbc_7.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		cbc_7.setBounds(550+294,275+100, 294, 275);
		
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
		frame[cont].setBounds(560,200, 294, 275);
		}

		else if(cont==1) {
		frame[cont].setBounds(550+294,100, 294, 275);
		}

		else if(cont==2) {
		frame[cont].setBounds(340+294+200+294,200, 294, 275);
		}

		else if(cont==3) {
		frame[cont].setBounds(560,275+200, 294, 275);
		}

		else if(cont==4) {
		frame[cont].setBounds(550+294,275+100+275, 294, 275);
		}

		else if(cont==5) {
		frame[cont].setBounds(340+294+294+200,275+200, 294, 275);
		}

		else if(cont==6) {
		frame[cont].setBounds(550+294,275+100, 294, 275);
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
		
		JFrame frame_2 = new JFrame();
		frame_2.setName(""+numb);
		//System.out.println(frame_2.getName());
		frame_2.setAlwaysOnTop(true);
		frame_2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		
		JFrame frame_3 = new JFrame();
		frame_3.setName(""+numb);
		frame_3.setAlwaysOnTop(true);
		//System.out.println(frame_3.getName());
		frame_3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		top = new JFrame();
		top.setResizable(false);
		top.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		top.setResizable(false);
		top.addWindowListener(new java.awt.event.WindowAdapter() {
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
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
		
		JLabel coracao = new JLabel("New label");
		coracao.setIcon(new ImageIcon(Hidra.class.getResource("/imagens/coracao.png")));
		coracao.setBounds(0, 0, 100, 99);
		painel.add(coracao);
		
		
		
		
		
		//System.out.println(cut);
	
	}
	
	public void mudaCoracao() {
		Random cot = new Random();
		if(cot.nextInt(7)==0) {
			top.setBounds(560+20,200+40,50,130);
		}
		else if(cot.nextInt(7)==1) {
			top.setBounds(550+294+20,275+100+40,50,130);
		}
		else if(cot.nextInt(7)==2) {
			top.setBounds(340+294+200+294+20,200+40,50,130);
		}
		else if(cot.nextInt(7)==3) {
			top.setBounds(560+20,275+200+40,50,130);
		}
		else if(cot.nextInt(7)==4) {
			top.setBounds(550+294+20,275+100+275+40,50,130);
		}
		else if(cot.nextInt(7)==5) {
			top.setBounds(340+294+294+200+20,275+200+40,50,130);
		}
		else if(cot.nextInt(7)==6) {
			top.setBounds(550+294+20,275+100+40,50,130);
		}
		else
			top.setBounds(550+294+20,275+100+40,50,130);
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