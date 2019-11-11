package testes;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;

public class Maps {

	private JFrame frame;
	private JButton btnCastelo, btnCasaNobre, btnCatedral, btnPraaCentral, btnTorreArcana, btnMercado,
			btnAlamedaPonteiros, btnDocas, btnAraResidencial, btnFloresta;
	
	public JButton getBtnCastelo() {
		return btnCastelo;
	}

	public JButton getBtnCasaNobre() {
		return btnCasaNobre;
	}

	public JButton getBtnCatedral() {
		return btnCatedral;
	}

	public JButton getBtnPraaCentral() {
		return btnPraaCentral;
	}

	public JButton getBtnTorreArcana() {
		return btnTorreArcana;
	}

	public JButton getBtnMercado() {
		return btnMercado;
	}

	public JButton getBtnAlamedaPonteiros() {
		return btnAlamedaPonteiros;
	}

	public JButton getBtnDocas() {
		return btnDocas;
	}

	public JButton getBtnAraResidencial() {
		return btnAraResidencial;
	}

	public JButton getBtnFloresta() {
		return btnFloresta;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Maps window = new Maps();
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
	
	public Maps() {
		initialize();
		zerarBotoes();
		mostrarTudo();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.setSize(1280, 761);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setUndecorated(true);
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

		btnCastelo = new JButton("Castelo");
		btnCastelo.setBackground(Color.LIGHT_GRAY);
		btnCastelo.setBounds(743, 315, 75, 23);
		btnCastelo.setFont(new Font("Georgia", Font.BOLD, 12));
		btnCastelo.setForeground(Color.BLACK);
		btnCastelo.setBorderPainted(false);
		btnCastelo.setBorder(null);
		btnCastelo.setContentAreaFilled(true);
		btnCastelo.setFocusPainted(false);
		panel.add(btnCastelo);

		btnCasaNobre = new JButton("Casa Nobre");
		btnCasaNobre.setBackground(Color.LIGHT_GRAY);
		btnCasaNobre.setBounds(855, 335, 89, 23);
		btnCasaNobre.setFont(new Font("Georgia", Font.BOLD, 12));
		btnCasaNobre.setForeground(Color.BLACK);
		btnCasaNobre.setBorderPainted(false);
		btnCasaNobre.setBorder(null);
		btnCasaNobre.setContentAreaFilled(true);
		btnCasaNobre.setFocusPainted(false);
		panel.add(btnCasaNobre);

		btnCatedral = new JButton("Catedral");
		btnCatedral.setBackground(Color.LIGHT_GRAY);
		btnCatedral.setBounds(634, 347, 89, 23);
		btnCatedral.setFont(new Font("Georgia", Font.BOLD, 12));
		btnCatedral.setForeground(Color.BLACK);
		btnCatedral.setBorderPainted(false);
		btnCatedral.setBorder(null);
		btnCatedral.setContentAreaFilled(true);
		btnCatedral.setFocusPainted(false);
		panel.add(btnCatedral);

		btnPraaCentral = new JButton("Pra\u00E7a Central");
		btnPraaCentral.setBackground(Color.LIGHT_GRAY);
		btnPraaCentral.setBounds(532, 379, 115, 23);
		btnPraaCentral.setFont(new Font("Georgia", Font.BOLD, 12));
		btnPraaCentral.setForeground(Color.BLACK);
		btnPraaCentral.setBorderPainted(false);
		btnPraaCentral.setBorder(null);
		btnPraaCentral.setContentAreaFilled(true);
		btnPraaCentral.setFocusPainted(false);
		panel.add(btnPraaCentral);

		btnTorreArcana = new JButton("Torre Arcana");
		btnTorreArcana.setBackground(Color.LIGHT_GRAY);
		btnTorreArcana.setBounds(506, 258, 115, 23);
		btnTorreArcana.setFont(new Font("Georgia", Font.BOLD, 12));
		btnTorreArcana.setForeground(Color.BLACK);
		btnTorreArcana.setBorderPainted(false);
		btnTorreArcana.setBorder(null);
		btnTorreArcana.setContentAreaFilled(true);
		btnTorreArcana.setFocusPainted(false);
		panel.add(btnTorreArcana);

		btnMercado = new JButton("Mercado");
		btnMercado.setBackground(Color.LIGHT_GRAY);
		btnMercado.setBounds(376, 335, 89, 23);
		btnMercado.setFont(new Font("Georgia", Font.BOLD, 12));
		btnMercado.setForeground(Color.BLACK);
		btnMercado.setBorderPainted(false);
		btnMercado.setBorder(null);
		btnMercado.setContentAreaFilled(true);
		btnMercado.setFocusPainted(false);
		panel.add(btnMercado);

		btnAlamedaPonteiros = new JButton("Alameda 3 Ponteiros");
		btnAlamedaPonteiros.setBackground(Color.LIGHT_GRAY);
		btnAlamedaPonteiros.setBounds(376, 435, 182, 23);
		btnAlamedaPonteiros.setFont(new Font("Georgia", Font.BOLD, 12));
		btnAlamedaPonteiros.setForeground(Color.BLACK);
		btnAlamedaPonteiros.setBorderPainted(false);
		btnAlamedaPonteiros.setBorder(null);
		btnAlamedaPonteiros.setContentAreaFilled(true);
		btnAlamedaPonteiros.setFocusPainted(false);
		panel.add(btnAlamedaPonteiros);

		btnDocas = new JButton("Docas");
		btnDocas.setBackground(Color.LIGHT_GRAY);
		btnDocas.setBounds(558, 484, 89, 23);
		btnDocas.setFont(new Font("Georgia", Font.BOLD, 12));
		btnDocas.setForeground(Color.BLACK);
		btnDocas.setBorderPainted(false);
		btnDocas.setBorder(null);
		btnDocas.setContentAreaFilled(true);
		btnDocas.setFocusPainted(false);
		panel.add(btnDocas);

		btnAraResidencial = new JButton("Ar\u00E9a residencial");
		btnAraResidencial.setBackground(Color.LIGHT_GRAY);
		btnAraResidencial.setBounds(743, 435, 132, 23);
		btnAraResidencial.setFont(new Font("Georgia", Font.BOLD, 12));
		btnAraResidencial.setForeground(Color.BLACK);
		btnAraResidencial.setBorderPainted(false);
		btnAraResidencial.setBorder(null);
		btnAraResidencial.setContentAreaFilled(true);
		btnAraResidencial.setFocusPainted(false);
		panel.add(btnAraResidencial);

		btnFloresta = new JButton("Floresta");
		btnFloresta.setBackground(Color.LIGHT_GRAY);
		btnFloresta.setBounds(256, 171, 89, 23);
		btnFloresta.setFont(new Font("Georgia", Font.BOLD, 12));
		btnFloresta.setForeground(Color.BLACK);
		btnFloresta.setBorderPainted(false);
		btnFloresta.setBorder(null);
		btnFloresta.setContentAreaFilled(true);
		btnFloresta.setFocusPainted(false);
		panel.add(btnFloresta);

		JLabel fundo = new JLabel(new ImageIcon("src/imagens/cidade.jpg"));
		fundo.setBounds(0, 0, 1280, 761);
		panel.add(fundo);

	}
	
	public void zerarBotoes() {
		
		btnAlamedaPonteiros.setVisible(false);
		btnAraResidencial.setVisible(false);
		btnCasaNobre.setVisible(false);
		btnCastelo.setVisible(false);
		btnCatedral.setVisible(false);
		btnDocas.setVisible(false);
		btnFloresta.setVisible(false);
		btnMercado.setVisible(false);
		btnPraaCentral.setVisible(false);
		btnTorreArcana.setVisible(false);
		
	}
	
	public void mostrarTudo() {
		
		btnAlamedaPonteiros.setVisible(true);
		btnAraResidencial.setVisible(true);
		btnCasaNobre.setVisible(true);
		btnCastelo.setVisible(true);
		btnCatedral.setVisible(true);
		btnDocas.setVisible(true);
		btnFloresta.setVisible(true);
		btnMercado.setVisible(true);
		btnPraaCentral.setVisible(true);
		btnTorreArcana.setVisible(true);
		
	}

}

	