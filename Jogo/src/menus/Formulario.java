package menus;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.Component;
import java.awt.Point;

public class Formulario {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario window = new Formulario();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public Formulario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1031, 697);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		nome.setIcon(new ImageIcon("src\\imagens\\formulario_nome.png"));
		nome.setBounds(35, 35, 236, 68);
		frame.getContentPane().add(nome);
		
		JLabel idade = new JLabel("New label");
		idade.setIcon(new ImageIcon("src\\imagens\\formulario_idade.png"));
		idade.setBounds(35, 186, 233, 79);
		frame.getContentPane().add(idade);
		
		JLabel sexo = new JLabel("New label");
		sexo.setIcon(new ImageIcon("src\\imagens\\formulario_sexo.png"));
		sexo.setBounds(35, 356, 217, 59);
		frame.getContentPane().add(sexo);
		
		JComboBox Sexo = new JComboBox();
		Sexo.setBackground(new Color(245, 222, 179));
		Sexo.setFont(new Font("Georgia", Font.PLAIN, 40));
		Sexo.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Feminino"}));
		Sexo.setBounds(331, 356, 647, 59);
		frame.getContentPane().add(Sexo);
		
		JLabel origem = new JLabel("New label");
		origem.setIcon(new ImageIcon("src\\imagens\\formulario_origem.png"));
		origem.setBounds(35, 503, 299, 68);
		frame.getContentPane().add(origem);
		
		JLabel Monsores = new JLabel("New label");
		Monsores.setIcon(new ImageIcon("src\\imagens\\formulario_monsores.png"));
		Monsores.setBounds(379, 500, 587, 74);
		frame.getContentPane().add(Monsores);
		
		JLabel Fundo = new JLabel("New label");
        Fundo.setIcon(new ImageIcon("src\\imagens\\formulario.jpg"));
        Fundo.setBounds(0, 0, 1025, 665);
        frame.getContentPane().add(Fundo);
		
        frame.setVisible(true);
	}
}
