package menus;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

import cenas.Inicio2;
import personagens.Jogador;
import testes.Inicio;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario{

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
						"Tem certeza que deseja sair do jogo (todo seu progresso será perdido)?", "Sair",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		ImageIcon icone = new ImageIcon("src/imagens/Icone.png");
		frame.setIconImage(icone.getImage());

		JFormattedTextField frmtdtxtfldNome = new JFormattedTextField();
		frmtdtxtfldNome.setBackground(new Color(255, 248, 220));
		frmtdtxtfldNome.setHorizontalAlignment(SwingConstants.CENTER);
		frmtdtxtfldNome.setFont(new Font("Georgia", Font.BOLD, 40));
		frmtdtxtfldNome.setBounds(331, 47, 647, 59);
		frame.getContentPane().add(frmtdtxtfldNome);

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

		JLabel Fundo = new JLabel("New label");
		Fundo.setIcon(new ImageIcon(Formulario.class.getResource("/imagens/formulario.jpg")));
		Fundo.setBounds(0, 0, 1025, 665);
		frame.getContentPane().add(Fundo);

		frame.setVisible(true);

		ActionListener next = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {

				Jogador player = new Jogador(); // Arrumar para caso o Player não ponha nada no nome
				player.setNome(frmtdtxtfldNome.getText());
				
				if (Sexo.getSelectedItem() == "Masculino")
					player.setSexo(0);
				else
					player.setSexo(1);

				frame.dispose();
				new Inicio().inicio2(player);
//				new Inicio2(player);
			}
		};

		continuar.addActionListener(next);

	}
}
