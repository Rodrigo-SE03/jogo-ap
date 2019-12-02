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

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Roda window = new Roda();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

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
		
		JButton[] opcao = new JButton[5];
		for(int i = 0; i < 5; i++) {
			opcao[i] = new JButton();
			opcao[i].setFocusPainted(false);
			opcao[i].setBorderPainted(false);
			opcao[i].setBorder(null);
			opcao[i].setContentAreaFilled(false);
			opcao[i].setSelectedIcon(null);
			opcao[i].setSize(33,36);
			opcao[i].addActionListener(perdeu);
			panel.add(opcao[i]);
		}
		
		opcao[0].setLocation(159, 37);
		opcao[1].setLocation(159, 98);
		opcao[2].setLocation(159, 170);
		opcao[3].setLocation(159, 257);
		opcao[4].setLocation(159, 333);

		opcao[0].removeActionListener(perdeu);
		opcao[0].addActionListener(venceu);

		ImageIcon enigma = new ImageIcon("src/imagens/EnigmaRoda.jpg");
		enigma.setImage(enigma.getImage().getScaledInstance(513, 387, 100));
		JLabel Fundo = new JLabel();
		Fundo.setIcon(enigma);
		Fundo.setBounds(0, 0, 513, 387);
		panel.add(Fundo);
		
		frame.setVisible(true);
	}

}
