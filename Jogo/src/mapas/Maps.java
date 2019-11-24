package mapas;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
	private JLabel casteloFundo, casaNobreFundo, catedralFundo, praaCentralFundo, torreArcanaFundo, mercadoFundo,
			alamedaPonteirosFundo, docasFundo, araResidencialFundo, florestaFundo;

	public JLabel getCasteloFundo() {
		return casteloFundo;
	}

	public JLabel getCasaNobreFundo() {
		return casaNobreFundo;
	}

	public JLabel getCatedralFundo() {
		return catedralFundo;
	}

	public JLabel getPraaCentralFundo() {
		return praaCentralFundo;
	}

	public JLabel getTorreArcanaFundo() {
		return torreArcanaFundo;
	}

	public JLabel getMercadoFundo() {
		return mercadoFundo;
	}

	public JLabel getAlamedaPonteirosFundo() {
		return alamedaPonteirosFundo;
	}

	public JLabel getDocasFundo() {
		return docasFundo;
	}

	public JLabel getAraResidencialFundo() {
		return araResidencialFundo;
	}

	public JLabel getFlorestaFundo() {
		return florestaFundo;
	}

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
		btnCastelo.setBackground(Color.BLUE);
		btnCastelo.setBounds(750, 310, 55, 20);
		btnCastelo.setFont(new Font("Georgia", Font.BOLD, 14));
		btnCastelo.setForeground(Color.WHITE);
		btnCastelo.setBorderPainted(false);
		btnCastelo.setBorder(null);
		btnCastelo.setContentAreaFilled(true);
		btnCastelo.setFocusPainted(false);
		panel.add(btnCastelo);

		ImageIcon img = new ImageIcon("src/imagens/btn1.png");
		img.setImage(img.getImage().getScaledInstance(130, 130, 100));

		casteloFundo = new JLabel(img);
		casteloFundo.setSize(130, 130);
		casteloFundo.setLocation(
				((btnCastelo.getLocation().x) - (casteloFundo.getSize().width / 2) + (btnCastelo.getSize().width / 2)
						- 4),
				(btnCastelo.getLocation().y - (casteloFundo.getSize().height / 2) + (btnCastelo.getSize().height / 2)
						- 2));
		panel.add(casteloFundo);

		btnCasaNobre = new JButton("Casa Nobre");
		btnCasaNobre.setBackground(Color.BLUE);
		btnCasaNobre.setBounds(860, 335, 80, 20);
		btnCasaNobre.setFont(new Font("Georgia", Font.BOLD, 12));
		btnCasaNobre.setForeground(Color.WHITE);
		btnCasaNobre.setBorderPainted(false);
		btnCasaNobre.setBorder(null);
		btnCasaNobre.setContentAreaFilled(true);
		btnCasaNobre.setFocusPainted(false);
		panel.add(btnCasaNobre);

		ImageIcon img1 = new ImageIcon("src/imagens/btn1.png");
		img1.setImage(img.getImage().getScaledInstance(180, 130, 100));

		casaNobreFundo = new JLabel(img1);
		casaNobreFundo.setSize(180, 130);
		casaNobreFundo.setLocation(
				((btnCasaNobre.getLocation().x) - (casaNobreFundo.getSize().width / 2)
						+ (btnCasaNobre.getSize().width / 2) - 5),
				(btnCasaNobre.getLocation().y - (casaNobreFundo.getSize().height / 2)
						+ (btnCasaNobre.getSize().height / 2) - 2));
		panel.add(casaNobreFundo);

		btnCatedral = new JButton("Catedral");
		btnCatedral.setBackground(Color.BLUE);
		btnCatedral.setBounds(634, 347, 89, 23);
		btnCatedral.setFont(new Font("Georgia", Font.BOLD, 12));
		btnCatedral.setForeground(Color.WHITE);
		btnCatedral.setBorderPainted(false);
		btnCatedral.setBorder(null);
		btnCatedral.setContentAreaFilled(true);
		btnCatedral.setFocusPainted(false);
		panel.add(btnCatedral);

		ImageIcon img2 = new ImageIcon("src/imagens/btn1.png");
		img2.setImage(img.getImage().getScaledInstance(200, 130, 100));

		catedralFundo = new JLabel(img2);
		catedralFundo.setSize(200, 130);
		catedralFundo.setLocation(
				((btnCatedral.getLocation().x) - (catedralFundo.getSize().width / 2) + (btnCatedral.getSize().width / 2)
						- 5),
				(btnCatedral.getLocation().y - (catedralFundo.getSize().height / 2) + (btnCatedral.getSize().height / 2)
						- 2));
		panel.add(catedralFundo);

		btnPraaCentral = new JButton("Pra\u00E7a Central");
		btnPraaCentral.setBackground(Color.BLUE);
		btnPraaCentral.setBounds(532, 385, 115, 23);
		btnPraaCentral.setFont(new Font("Georgia", Font.BOLD, 12));
		btnPraaCentral.setForeground(Color.WHITE);
		btnPraaCentral.setBorderPainted(false);
		btnPraaCentral.setBorder(null);
		btnPraaCentral.setContentAreaFilled(true);
		btnPraaCentral.setFocusPainted(false);
		panel.add(btnPraaCentral);

		ImageIcon img3 = new ImageIcon("src/imagens/btn1.png");
		img3.setImage(img.getImage().getScaledInstance(265, 140, 100));

		praaCentralFundo = new JLabel(img3);
		praaCentralFundo.setSize(265, 130);
		praaCentralFundo.setLocation(
				((btnPraaCentral.getLocation().x) - (praaCentralFundo.getSize().width / 2)
						+ (btnPraaCentral.getSize().width / 2) - 8),
				(btnPraaCentral.getLocation().y - (praaCentralFundo.getSize().height / 2)
						+ (btnPraaCentral.getSize().height / 2) - 2));
		panel.add(praaCentralFundo);

		btnTorreArcana = new JButton("Torre Arcana");
		btnTorreArcana.setBackground(Color.BLUE);
		btnTorreArcana.setBounds(506, 258, 115, 23);
		btnTorreArcana.setFont(new Font("Georgia", Font.BOLD, 12));
		btnTorreArcana.setForeground(Color.WHITE);
		btnTorreArcana.setBorderPainted(false);
		btnTorreArcana.setBorder(null);
		btnTorreArcana.setContentAreaFilled(true);
		btnTorreArcana.setFocusPainted(false);
		panel.add(btnTorreArcana);

		ImageIcon img4 = new ImageIcon("src/imagens/btn1.png");
		img4.setImage(img.getImage().getScaledInstance(265, 140, 100));

		torreArcanaFundo = new JLabel(img4);
		torreArcanaFundo.setSize(265, 130);
		torreArcanaFundo.setLocation(
				((btnTorreArcana.getLocation().x) - (torreArcanaFundo.getSize().width / 2)
						+ (btnTorreArcana.getSize().width / 2) - 8),
				(btnTorreArcana.getLocation().y - (torreArcanaFundo.getSize().height / 2)
						+ (btnTorreArcana.getSize().height / 2) - 2));
		panel.add(torreArcanaFundo);

		btnMercado = new JButton("Mercado");
		btnMercado.setBackground(Color.BLUE);
		btnMercado.setBounds(376, 335, 89, 23);
		btnMercado.setFont(new Font("Georgia", Font.BOLD, 12));
		btnMercado.setForeground(Color.WHITE);
		btnMercado.setBorderPainted(false);
		btnMercado.setBorder(null);
		btnMercado.setContentAreaFilled(true);
		btnMercado.setFocusPainted(false);
		panel.add(btnMercado);

		ImageIcon img5 = new ImageIcon("src/imagens/btn1.png");
		img5.setImage(img.getImage().getScaledInstance(200, 140, 100));

		mercadoFundo = new JLabel(img5);
		mercadoFundo.setSize(200, 130);
		mercadoFundo.setLocation(
				((btnMercado.getLocation().x) - (mercadoFundo.getSize().width / 2) + (btnMercado.getSize().width / 2)
						- 5),
				(btnMercado.getLocation().y - (mercadoFundo.getSize().height / 2) + (btnMercado.getSize().height / 2)
						- 2));
		panel.add(mercadoFundo);

		btnAlamedaPonteiros = new JButton("Alameda 3 Ponteiros");
		btnAlamedaPonteiros.setBackground(Color.BLUE);
		btnAlamedaPonteiros.setBounds(376, 435, 182, 23);
		btnAlamedaPonteiros.setFont(new Font("Georgia", Font.BOLD, 12));
		btnAlamedaPonteiros.setForeground(Color.WHITE);
		btnAlamedaPonteiros.setBorderPainted(false);
		btnAlamedaPonteiros.setBorder(null);
		btnAlamedaPonteiros.setContentAreaFilled(true);
		btnAlamedaPonteiros.setFocusPainted(false);
		panel.add(btnAlamedaPonteiros);

		ImageIcon img6 = new ImageIcon("src/imagens/btn1.png");
		img6.setImage(img.getImage().getScaledInstance(400, 140, 100));

		alamedaPonteirosFundo = new JLabel(img6);
		alamedaPonteirosFundo.setSize(400, 130);
		alamedaPonteirosFundo.setLocation(
				((btnAlamedaPonteiros.getLocation().x) - (alamedaPonteirosFundo.getSize().width / 2)
						+ (btnAlamedaPonteiros.getSize().width / 2) - 10),
				(btnAlamedaPonteiros.getLocation().y - (alamedaPonteirosFundo.getSize().height / 2)
						+ (btnAlamedaPonteiros.getSize().height / 2) - 2));
		panel.add(alamedaPonteirosFundo);

		btnDocas = new JButton("Docas");
		btnDocas.setBackground(Color.BLUE);
		btnDocas.setBounds(575, 500, 89, 23);
		btnDocas.setFont(new Font("Georgia", Font.BOLD, 12));
		btnDocas.setForeground(Color.WHITE);
		btnDocas.setBorderPainted(false);
		btnDocas.setBorder(null);
		btnDocas.setContentAreaFilled(true);
		btnDocas.setFocusPainted(false);
		panel.add(btnDocas);

		ImageIcon img7 = new ImageIcon("src/imagens/btn1.png");
		img7.setImage(img.getImage().getScaledInstance(200, 140, 100));

		docasFundo = new JLabel(img7);
		docasFundo.setSize(200, 130);
		docasFundo.setLocation(
				((btnDocas.getLocation().x) - (docasFundo.getSize().width / 2) + (btnDocas.getSize().width / 2) - 5),
				(btnDocas.getLocation().y - (docasFundo.getSize().height / 2) + (btnDocas.getSize().height / 2) - 2));
		panel.add(docasFundo);

		btnAraResidencial = new JButton("Ar\u00E9a residencial");
		btnAraResidencial.setBackground(Color.BLUE);
		btnAraResidencial.setBounds(745, 440, 132, 23);
		btnAraResidencial.setFont(new Font("Georgia", Font.BOLD, 12));
		btnAraResidencial.setForeground(Color.WHITE);
		btnAraResidencial.setBorderPainted(false);
		btnAraResidencial.setBorder(null);
		btnAraResidencial.setContentAreaFilled(true);
		btnAraResidencial.setFocusPainted(false);
		panel.add(btnAraResidencial);

		ImageIcon img8 = new ImageIcon("src/imagens/btn1.png");
		img8.setImage(img.getImage().getScaledInstance(300, 140, 100));

		araResidencialFundo = new JLabel(img8);
		araResidencialFundo.setSize(300, 130);
		araResidencialFundo.setLocation(
				((btnAraResidencial.getLocation().x) - (araResidencialFundo.getSize().width / 2)
						+ (btnAraResidencial.getSize().width / 2) - 8),
				(btnAraResidencial.getLocation().y - (araResidencialFundo.getSize().height / 2)
						+ (btnAraResidencial.getSize().height / 2) - 2));
		panel.add(araResidencialFundo);

		btnFloresta = new JButton("Floresta");
		btnFloresta.setBackground(Color.BLUE);
		btnFloresta.setBounds(256, 171, 89, 23);
		btnFloresta.setFont(new Font("Georgia", Font.BOLD, 12));
		btnFloresta.setForeground(Color.WHITE);
		btnFloresta.setBorderPainted(false);
		btnFloresta.setBorder(null);
		btnFloresta.setContentAreaFilled(true);
		btnFloresta.setFocusPainted(false);
		panel.add(btnFloresta);

		ImageIcon img9 = new ImageIcon("src/imagens/btn1.png");
		img9.setImage(img.getImage().getScaledInstance(200, 140, 100));

		florestaFundo = new JLabel(img9);
		florestaFundo.setSize(200, 130);
		florestaFundo.setLocation(
				((btnFloresta.getLocation().x) - (florestaFundo.getSize().width / 2) + (btnFloresta.getSize().width / 2)
						- 5),
				(btnFloresta.getLocation().y - (florestaFundo.getSize().height / 2) + (btnFloresta.getSize().height / 2)
						- 2));
		panel.add(florestaFundo);

		JLabel fundo = new JLabel(new ImageIcon("src/imagens/cidade.jpg"));
		fundo.setBounds(0, 0, 1280, 761);
		panel.add(fundo);

		MouseListener b1 = new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				btnAlamedaPonteiros.setBackground(Color.CYAN);
				btnAlamedaPonteiros.setForeground(Color.BLACK);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnAlamedaPonteiros.setBackground(Color.BLUE);
				btnAlamedaPonteiros.setForeground(Color.WHITE);
			}
		};

		MouseListener b2 = new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				btnAraResidencial.setBackground(Color.CYAN);
				btnAraResidencial.setForeground(Color.BLACK);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnAraResidencial.setBackground(Color.BLUE);
				btnAraResidencial.setForeground(Color.WHITE);
			}
		};

		MouseListener b3 = new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				btnCasaNobre.setBackground(Color.CYAN);
				btnCasaNobre.setForeground(Color.BLACK);

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnCasaNobre.setBackground(Color.BLUE);
				btnCasaNobre.setForeground(Color.WHITE);

			}
		};

		MouseListener b4 = new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				btnCastelo.setBackground(Color.CYAN);
				btnCastelo.setForeground(Color.BLACK);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnCastelo.setBackground(Color.BLUE);
				btnCastelo.setForeground(Color.WHITE);
			}
		};

		MouseListener b5 = new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				btnCatedral.setBackground(Color.CYAN);
				btnCatedral.setForeground(Color.BLACK);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnCatedral.setBackground(Color.BLUE);
				btnCatedral.setForeground(Color.WHITE);
			}
		};

		MouseListener b6 = new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				btnDocas.setBackground(Color.CYAN);
				btnDocas.setForeground(Color.BLACK);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnDocas.setBackground(Color.BLUE);
				btnDocas.setForeground(Color.WHITE);
			}
		};

		MouseListener b7 = new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				btnFloresta.setBackground(Color.CYAN);
				btnFloresta.setForeground(Color.BLACK);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnFloresta.setBackground(Color.BLUE);
				btnFloresta.setForeground(Color.WHITE);
			}
		};

		MouseListener b8 = new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				btnMercado.setBackground(Color.CYAN);
				btnMercado.setForeground(Color.BLACK);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnMercado.setBackground(Color.BLUE);
				btnMercado.setForeground(Color.WHITE);
			}
		};

		MouseListener b9 = new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				btnPraaCentral.setBackground(Color.CYAN);
				btnPraaCentral.setForeground(Color.BLACK);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnPraaCentral.setBackground(Color.BLUE);
				btnPraaCentral.setForeground(Color.WHITE);
			}
		};

		MouseListener b10 = new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				btnTorreArcana.setBackground(Color.CYAN);
				btnTorreArcana.setForeground(Color.BLACK);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnTorreArcana.setBackground(Color.BLUE);
				btnTorreArcana.setForeground(Color.WHITE);
			}
		};

		btnAlamedaPonteiros.addMouseListener(b1);
		btnAraResidencial.addMouseListener(b2);
		btnCasaNobre.addMouseListener(b3);
		btnCastelo.addMouseListener(b4);
		btnCatedral.addMouseListener(b5);
		btnDocas.addMouseListener(b6);
		btnFloresta.addMouseListener(b7);
		btnMercado.addMouseListener(b8);
		btnPraaCentral.addMouseListener(b9);
		btnTorreArcana.addMouseListener(b10);

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

		alamedaPonteirosFundo.setVisible(false);
		araResidencialFundo.setVisible(false);
		casaNobreFundo.setVisible(false);
		casteloFundo.setVisible(false);
		catedralFundo.setVisible(false);
		docasFundo.setVisible(false);
		florestaFundo.setVisible(false);
		mercadoFundo.setVisible(false);
		praaCentralFundo.setVisible(false);
		torreArcanaFundo.setVisible(false);

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

		alamedaPonteirosFundo.setVisible(true);
		araResidencialFundo.setVisible(true);
		casaNobreFundo.setVisible(true);
		casteloFundo.setVisible(true);
		catedralFundo.setVisible(true);
		docasFundo.setVisible(true);
		florestaFundo.setVisible(true);
		mercadoFundo.setVisible(true);
		praaCentralFundo.setVisible(true);
		torreArcanaFundo.setVisible(true);

	}

}
