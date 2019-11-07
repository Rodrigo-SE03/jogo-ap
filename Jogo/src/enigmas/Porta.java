package enigmas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Porta {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Porta window = new Porta();
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
	public Porta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 527, 423);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.addWindowListener(new java.awt.event.WindowAdapter() {
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		        if (JOptionPane.showConfirmDialog(null, 
		            "Tem certeza que deseja sair do jogo (todo seu progresso será perdido)?", "Sair", 
		            JOptionPane.YES_NO_OPTION,
		            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
		            System.exit(0);
		        }
		    }
		});
		
		Texto_enigma caixa = new Texto_enigma();
		caixa.getFrame().setBounds(frame.getX()+caixa.getFrame().getWidth()+200,frame.getY(),caixa.getFrame().getWidth(),caixa.getFrame().getHeight());
		caixa.getTxt1().setText("	Nesse enigma, as luzes na frente das sequências representam dicas para o código. Cada luz branca indica um número que está no código, mas em uma posição diferente da mostrada na sequência. Cada luz laranja indica um número que está no código na mesma posição mostrada na sequência");
		
		ImageIcon icone = new ImageIcon("src/imagens/Icone.png");
		frame.setIconImage(icone.getImage());
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel L0 = new JLabel("0");
		L0.setIcon(new ImageIcon(Porta.class.getResource("/imagens/senha_0.png")));
		L0.setBounds(143, 277, 48, 61);
		panel.add(L0);
		
		JLabel L1 = new JLabel("0");
		L1.setIcon(new ImageIcon(Porta.class.getResource("/imagens/senha_0.png")));
		L1.setBounds(207, 277, 41, 61);
		panel.add(L1);
		
		JLabel L2 = new JLabel("0");
		L2.setIcon(new ImageIcon(Porta.class.getResource("/imagens/senha_0.png")));
		L2.setBounds(271, 277, 41, 61);
		panel.add(L2);
		
		JLabel L3 = new JLabel("0");
		L3.setIcon(new ImageIcon(Porta.class.getResource("/imagens/senha_0.png")));
		L3.setBounds(333, 277, 41, 61);
		panel.add(L3);
		
		JButton bot1 = new JButton("");
		bot1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(L0.getText().contentEquals("0")) {
					L0.setIcon(new ImageIcon("src/imagens/senha_1.png"));
					L0.setText("1");
				}
				else if(L0.getText().contentEquals("1")) {
					L0.setIcon(new ImageIcon("src/imagens/senha_2.png"));
					L0.setText("2");
				}
				else if(L0.getText().contentEquals("2")) {
					L0.setIcon(new ImageIcon("src/imagens/senha_3.png"));
					L0.setText("3");
				}
				else if(L0.getText().contentEquals("3")) {
					L0.setIcon(new ImageIcon("src/imagens/senha_4.png"));
					L0.setText("4");
				}
				else if(L0.getText().contentEquals("4")) {
					L0.setIcon(new ImageIcon("src/imagens/senha_5.png"));
					L0.setText("5");
				}
				else if(L0.getText().contentEquals("5")) {
					L0.setIcon(new ImageIcon("src/imagens/senha_0.png"));
					L0.setText("0");
				}
			}
		});
		bot1.setFocusPainted(false);
		bot1.setBorderPainted(false);
		bot1.setBorder(null);
		bot1.setPressedIcon(new ImageIcon(Porta.class.getResource("/imagens/senha_botao_pressionado.png")));
		bot1.setContentAreaFilled(false);
		bot1.setIcon(new ImageIcon(Porta.class.getResource("/imagens/senha_botao.png")));
		bot1.setSelectedIcon(null);
		bot1.setBounds(143, 245, 41, 34);
		panel.add(bot1);
		
		JButton bot2 = new JButton("");
		bot2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(L1.getText().contentEquals("0")) {
					L1.setIcon(new ImageIcon("src/imagens/senha_1.png"));
					L1.setText("1");
				}
				else if(L1.getText().contentEquals("1")) {
					L1.setIcon(new ImageIcon("src/imagens/senha_2.png"));
					L1.setText("2");
				}
				else if(L1.getText().contentEquals("2")) {
					L1.setIcon(new ImageIcon("src/imagens/senha_3.png"));
					L1.setText("3");
				}
				else if(L1.getText().contentEquals("3")) {
					L1.setIcon(new ImageIcon("src/imagens/senha_4.png"));
					L1.setText("4");
				}
				else if(L1.getText().contentEquals("4")) {
					L1.setIcon(new ImageIcon("src/imagens/senha_5.png"));
					L1.setText("5");
				}
				else if(L1.getText().contentEquals("5")) {
					L1.setIcon(new ImageIcon("src/imagens/senha_0.png"));
					L1.setText("0");
				}
			}
		});
		bot2.setFocusPainted(false);
		bot2.setBorderPainted(false);
		bot2.setBorder(null);
		bot2.setPressedIcon(new ImageIcon(Porta.class.getResource("/imagens/senha_botao_pressionado.png")));
		bot2.setIcon(new ImageIcon(Porta.class.getResource("/imagens/senha_botao.png")));
		bot2.setContentAreaFilled(false);
		bot2.setBounds(207, 245, 41, 34);
		panel.add(bot2);
		
		JButton bot3 = new JButton("");
		bot3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(L2.getText().contentEquals("0")) {
					L2.setIcon(new ImageIcon("src/imagens/senha_1.png"));
					L2.setText("1");
				}
				else if(L2.getText().contentEquals("1")) {
					L2.setIcon(new ImageIcon("src/imagens/senha_2.png"));
					L2.setText("2");
				}
				else if(L2.getText().contentEquals("2")) {
					L2.setIcon(new ImageIcon("src/imagens/senha_3.png"));
					L2.setText("3");
				}
				else if(L2.getText().contentEquals("3")) {
					L2.setIcon(new ImageIcon("src/imagens/senha_4.png"));
					L2.setText("4");
				}
				else if(L2.getText().contentEquals("4")) {
					L2.setIcon(new ImageIcon("src/imagens/senha_5.png"));
					L2.setText("5");
				}
				else if(L2.getText().contentEquals("5")) {
					L2.setIcon(new ImageIcon("src/imagens/senha_0.png"));
					L2.setText("0");
				}
			}
		});
		bot3.setFocusPainted(false);
		bot3.setBorderPainted(false);
		bot3.setBorder(null);
		bot3.setPressedIcon(new ImageIcon(Porta.class.getResource("/imagens/senha_botao_pressionado.png")));
		bot3.setIcon(new ImageIcon(Porta.class.getResource("/imagens/senha_botao.png")));
		bot3.setContentAreaFilled(false);
		bot3.setBounds(271, 245, 41, 34);
		panel.add(bot3);
		
		JButton bot4 = new JButton("");
		bot4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(L3.getText().contentEquals("0")) {
					L3.setIcon(new ImageIcon("src/imagens/senha_1.png"));
					L3.setText("1");
				}
				else if(L3.getText().contentEquals("1")) {
					L3.setIcon(new ImageIcon("src/imagens/senha_2.png"));
					L3.setText("2");
				}
				else if(L3.getText().contentEquals("2")) {
					L3.setIcon(new ImageIcon("src/imagens/senha_3.png"));
					L3.setText("3");
				}
				else if(L3.getText().contentEquals("3")) {
					L3.setIcon(new ImageIcon("src/imagens/senha_4.png"));
					L3.setText("4");
				}
				else if(L3.getText().contentEquals("4")) {
					L3.setIcon(new ImageIcon("src/imagens/senha_5.png"));
					L3.setText("5");
				}
				else if(L3.getText().contentEquals("5")) {
					L3.setIcon(new ImageIcon("src/imagens/senha_0.png"));
					L3.setText("0");
				}
			}
		});
		bot4.setFocusPainted(false);
		bot4.setBorderPainted(false);
		bot4.setBorder(null);
		bot4.setPressedIcon(new ImageIcon(Porta.class.getResource("/imagens/senha_botao_pressionado.png")));
		bot4.setIcon(new ImageIcon(Porta.class.getResource("/imagens/senha_botao.png")));
		bot4.setContentAreaFilled(false);
		bot4.setBounds(333, 245, 41, 34);
		panel.add(bot4);
		
		JButton btnNewButton = new JButton("Confirma");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(L0.getText().contentEquals("0") && L1.getText().contentEquals("1") && L2.getText().contentEquals("5") && L3.getText().contentEquals("4")) {
					JOptionPane.showMessageDialog(null,"nice"); //Acertou a combinação
				}
				else {
					JOptionPane.showMessageDialog(null,"errrrrrrrrou");
				}
			}
		});
		btnNewButton.setBounds(422, 350, 89, 23);
		panel.add(btnNewButton);
		
		JLabel Fundo = new JLabel("New label");
		Fundo.setIcon(new ImageIcon(Porta.class.getResource("/imagens/senha.png")));
		Fundo.setBounds(0, 0, 513, 387);
		panel.add(Fundo);
	}
}
