package enigmas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Roda {

	private JFrame frame;

//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Roda window = new Roda();
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	public Roda() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 527, 423);
		frame.setResizable(false);
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

		Texto_enigma caixa = new Texto_enigma();
		caixa.getFrame().setBounds(frame.getX() + frame.getWidth() + 100, frame.getY(), caixa.getFrame().getWidth(),
				caixa.getFrame().getHeight());
		caixa.getTxt1().setText(
				"Na parte de trás de um antigo pátio do castelo, há uma roda velha e deformada no chão, como mostrado abaixo. Uma estrela está apontando para o seu eixo. Embora não seja mais funcional, a roda é interessante porque, quando rolada em uma superfície plana, seu eixo traça um padrão engraçado do lado.\r\n" + 
				"\r\n" + 
				"Dos cinco diagramas abaixo, qual deles representa a trajetória real do eixo?");

		ImageIcon icone = new ImageIcon("src/imagens/Icone.png");
		frame.setIconImage(icone.getImage());

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		ActionListener perdeu = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "errrrrrrrrou");
			}

		};

		ActionListener venceu = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "nice");
			}

		};

		JButton bot1 = new JButton();
		bot1.setFocusPainted(false);
		bot1.setBorderPainted(false);
		bot1.setBorder(null);
		bot1.setContentAreaFilled(false);
		bot1.setSelectedIcon(null);
		bot1.setBounds(159, 37, 33, 36);
		bot1.addActionListener(venceu);
		panel.add(bot1);

		JButton bot2 = new JButton();
		bot2.setFocusPainted(false);
		bot2.setBorderPainted(false);
		bot2.setBorder(null);
		bot2.setContentAreaFilled(false);
		bot2.setBounds(159, 98, 33, 36);

		panel.add(bot2);

		JButton bot3 = new JButton();
		bot3.setFocusPainted(false);
		bot3.setBorderPainted(false);
		bot3.setBorder(null);
		bot3.setContentAreaFilled(false);
		bot3.setBounds(159, 170, 33, 36);
		panel.add(bot3);

		JButton bot4 = new JButton();
		bot4.setFocusPainted(false);
		bot4.setBorderPainted(false);
		bot4.setBorder(null);
		bot4.setContentAreaFilled(false);
		bot4.setBounds(159, 257, 33, 36);
		panel.add(bot4);

		JButton bot5 = new JButton();
		bot5.setFocusPainted(false);
		bot5.setBorderPainted(false);
		bot5.setBorder(null);
		bot5.setContentAreaFilled(false);
		bot5.setBounds(159, 333, 33, 36);
		panel.add(bot5);

		ImageIcon enigma = new ImageIcon("src/imagens/EnigmaRoda.jpg");
		enigma.setImage(enigma.getImage().getScaledInstance(513, 387, 100));
		JLabel Fundo = new JLabel("New label");
		Fundo.setIcon(enigma);
		Fundo.setBounds(0, 0, 513, 387);
		panel.add(Fundo);

		bot2.addActionListener(perdeu);
		bot3.addActionListener(perdeu);
		bot4.addActionListener(perdeu);
		bot5.addActionListener(perdeu);

		frame.setVisible(true);
	}

}
