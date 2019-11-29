package menus;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

import cenas.Inicio;
import personagens.Jogador;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { Formulario window = new Formulario();
	 * window.frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); }
	 * } }); }
	 */

	/**
	 * Create the application.
	 */

	public Formulario() {
		initialize();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		frame = new JFrame();
		frame.setSize(1040, 703);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent windowEvent) {
				if (JOptionPane.showConfirmDialog(null,
						"Tem certeza que deseja sair do jogo (todo seu progresso serï¿½ perdido)?", "Sair",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});

		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		ImageIcon icone = new ImageIcon("src/imagens/Icone.png");
		frame.setIconImage(icone.getImage());

		JFormattedTextField txtNome = new JFormattedTextField();
		txtNome.setBackground(new Color(255, 248, 220));
		txtNome.setHorizontalAlignment(SwingConstants.CENTER);
		txtNome.setFont(new Font("Georgia", Font.BOLD, 40));
		txtNome.setBounds(331, 47, 647, 59);
		frame.getContentPane().add(txtNome);

		JLabel nome = new JLabel("New label");
		nome.setIcon(new ImageIcon(Formulario.class.getResource("/imagens/formulario_nome.png")));
		nome.setBounds(35, 35, 236, 68);
		frame.getContentPane().add(nome);

		JLabel idade = new JLabel("New label");
		idade.setIcon(new ImageIcon(Formulario.class.getResource("/imagens/formulario_idade.png")));
		idade.setBounds(35, 186, 233, 79);
		frame.getContentPane().add(idade);

		JLabel sexo = new JLabel("New label");
		sexo.setIcon(new ImageIcon(Formulario.class.getResource("/imagens/formulario_sexo.png")));
		sexo.setBounds(35, 356, 217, 59);
		frame.getContentPane().add(sexo);

		JComboBox Sexo = new JComboBox();
		Sexo.setBackground(new Color(245, 222, 179));
		Sexo.setFont(new Font("Georgia", Font.PLAIN, 40));
		Sexo.setModel(new DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));
		Sexo.setBounds(331, 356, 647, 59);
		frame.getContentPane().add(Sexo);

		JLabel origem = new JLabel("New label");
		origem.setIcon(new ImageIcon(Formulario.class.getResource("/imagens/formulario_origem.png")));
		origem.setBounds(35, 503, 299, 68);
		frame.getContentPane().add(origem);

		JLabel Monsores = new JLabel("New label");
		Monsores.setIcon(new ImageIcon(Formulario.class.getResource("/imagens/formulario_monsores.png")));
		Monsores.setBounds(379, 500, 587, 74);
		frame.getContentPane().add(Monsores);

		JButton continuar = new JButton(new ImageIcon(Formulario.class.getResource("/imagens/continuar.png")));
		continuar.setLayout(null);
		continuar.setVisible(true);
		continuar.setBounds(867, 606, 158, 59);
		continuar.setContentAreaFilled(false);
		frame.getContentPane().add(continuar);

		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon(Formulario.class.getResource("/imagens/17.png")));
		label.setBounds(335, 188, 82, 74);
		frame.getContentPane().add(label);

		ImageIcon fund = new ImageIcon("src/imagens/formulario.jpg");
		fund.setImage(fund.getImage().getScaledInstance(this.frame.getSize().width, this.frame.getSize().height, 100));
		JLabel Fundo = new JLabel(fund);
		Fundo.setBounds(frame.getBounds());
		Fundo.setLocation(0, 0);
		frame.getContentPane().add(Fundo);

		frame.setVisible(true);

		ActionListener next = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				int cont = 0;
				String name;
				for (int i = 0; i < txtNome.getText().length(); i++) {
					if (Character.isWhitespace(txtNome.getText().charAt(i))) {
						cont++;
					}
				}

				if (cont == txtNome.getText().length() || txtNome.getText().length() == 0) {// Caso o Player nï¿½o ponha
																							// nada no nome
					JOptionPane.showMessageDialog(null,
							"Desculpe, não poderei te deixar entrar sem que tenha um nome. Se não tiver um pode inventar. "
									+ "Helaria te dará a chance de um novo começo para sua vida.",
							"Guarda: ", 0);
				} else {

					cont = 0;
					for (int i = 0; Character.isWhitespace(txtNome.getText().charAt(i)); i++) {
						cont++;
					}
					name = txtNome.getText().substring(cont);

					cont = name.length();
					for (int i = name.length() - 1; Character.isWhitespace(name.charAt(i)); i--) {
						cont--;
					}
					name = name.substring(0, cont);

					if (name.length() > 12) {

						if (JOptionPane.showConfirmDialog(null,
								"Você percebe que o formulário não tem espaço o suficiente para o seu nome. "
										+ "\nParece que há espaço para até 12 caracteres.\n Deseja se registrar apenas como  "
										+ name.substring(0, 12) + "?",
								"", JOptionPane.YES_NO_OPTION,
								JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {

							Jogador player = new Jogador();
							player.setNome(name.substring(0, 12));

							if (Sexo.getSelectedItem() == "Masculino")
								player.setSexo(0);
							else
								player.setSexo(1);

							frame.dispose();
							new Inicio().admin(player);

						} else {
							JOptionPane.showMessageDialog(null, "É melhor registrar-se com um nome menor...", "", 0);
						}

					} else {
						Jogador player = new Jogador();
						player.setNome(name);

						if (Sexo.getSelectedItem() == "Masculino")
							player.setSexo(0);
						else
							player.setSexo(1);

						frame.dispose();
						new Inicio().admin(player);
					}
				}
			}
		};
		continuar.addActionListener(next);
	}
}
