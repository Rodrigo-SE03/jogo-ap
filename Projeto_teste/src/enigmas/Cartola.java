package enigmas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;

public class Cartola {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cartola window = new Cartola();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Cartola() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setSize(680, 375);
		frame.setLocationRelativeTo(null);
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

		ImageIcon icone = new ImageIcon("src/imagens/Icone.png");
		frame.setIconImage(icone.getImage());

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JFormattedTextField txtresp = new JFormattedTextField();
		txtresp.setBackground(new Color(255, 248, 220));
		txtresp.setHorizontalAlignment(SwingConstants.CENTER);
		txtresp.setFont(new Font("Georgia", Font.BOLD, 30));
		txtresp.setBounds(350, 270, 150, 60);
		maskLetter(txtresp);
		panel.add(txtresp);

		JButton continuar = new JButton(new ImageIcon("src/imagens/continuar.png"));
		continuar.setLayout(null);
		continuar.setVisible(true);
		continuar.setBounds(500, 270, 158, 60);
		continuar.setContentAreaFilled(false);
		panel.add(continuar);
		ActionListener next = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				if (txtresp.getText().equalsIgnoreCase("ASS")) {
					JOptionPane.showMessageDialog(null, "nice");
				} else {
					JOptionPane.showMessageDialog(null, "errrrrrrrrou");
				}
			}
		};
		continuar.addActionListener(next);

		JLabel Fundo = new JLabel();
		Fundo.setIcon(new ImageIcon("src/imagens/Cartola.png"));
		Fundo.setBounds(0, 0, 670, 335);
		panel.add(Fundo);
	}

	public void maskLetter(JFormattedTextField jtf) {
		MaskFormatter formatoDois;
		try {
			formatoDois = new MaskFormatter("***");
			formatoDois.setValidCharacters("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
			formatoDois.install(jtf);
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null, this,
					"Não foi possivel inserir mask nos campos letras: " + e.getMessage(), 0);
		}
	}

}
