package menus;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import cenas.Hist_Inicio;
import graficos.Janela;
import graficos.Loading;
import sons.Musica;

public class Menu_inicial extends Janela {

	private static final long serialVersionUID = 1L;
	private Musica musica = new Musica();
	private Janela menu = new Janela();
	private JButton iniciar = new JButton(new ImageIcon("src/imagens/botao_iniciar.png"));
	private JButton creditos = new JButton(new ImageIcon("src/imagens/Creditos.png"));
	private JLabel titulo = new JLabel(new ImageIcon("src/imagens/titulo.png"));
	private JLabel fundo = new JLabel(new ImageIcon("src/imagens/menu.png"));
	private Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
	public Menu_inicial() {
		// Redimensionar e reposicionar!!!

		this.menu.construirJanela();// metodo q seta as configurações da janela

		// Titulo
		this.menu.add(titulo);
		this.titulo.setLayout(null);
		this.titulo.setBounds(0, 750, 900, 200);
		if(this.titulo.getLocation().y>(size.getHeight() + 200));
			this.titulo.setLocation(0, (int) (size.getHeight() - 220));

		// Creditos)
		this.menu.add(creditos);
		this.creditos.setLayout(null);
		this.creditos.setVisible(true);
		this.creditos.setContentAreaFilled(false);
		this.creditos.setBounds(1050, 150, 208, 95);

		// Iniciar
		this.menu.add(iniciar);
		this.iniciar.setLayout(null);
		this.iniciar.setVisible(true);
		this.iniciar.setContentAreaFilled(false);
		this.iniciar.setBounds(1050, 10, 208, 95);

		// Fundo
		this.menu.add(fundo);
		this.fundo.setBounds(0, 0, 1280, 960);

		this.menu.setVisible(true);
		// Ações dos botões
		ativaCreditos();
		ativaIniciar();

		// musica de fundo
		musica.TocaMusica("src/sons/MusicaMenu.wav");
	}

	public void ativaCreditos() {

		this.creditos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Creditos cr = new Creditos(); // Criar créditos
				cr.mostraCreditos();
			}
		});
	}

	public void ativaIniciar() {

		this.iniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				musica.stop();
				menu.dispose();
//				new Hist_Inicio().inicio();
            		Loading load = new Loading();
					load.start();
					new Thread() {
						public void run() {
							try {
								sleep(5000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							Hist_Inicio jogo = new Hist_Inicio();
							load.interrupt();
							jogo.inicio();
						}
					}.start();

			}
		});
	}

}