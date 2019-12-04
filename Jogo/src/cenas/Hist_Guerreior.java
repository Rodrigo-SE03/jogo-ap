package cenas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import bibliotecas.Biblio_Guerreiro;
import enigmas.Hidra;
import enigmas.Labirinto;
import enigmas.Porta;
import graficos.Geral;
import graficos.Texto;
import mapas.Maps;
import menus.Creditos;
import modelo.Teste;
import personagens.Jogador;
import sons.Musica;

public class Hist_Guerreior {

	private ActionListener continuar, escolha1, escolha2, escolha3;
	private Biblio_Guerreiro vet = new Biblio_Guerreiro(); // Vetor de texto
	private Musica musica = new Musica();
	private Musica[] musicasSegunda;
	private Jogador player;

	public void guerreiro1(Texto t1, Jogador player) {
		Geral geral = new Geral();

		this.player = player;
		vet.setPlayer(player);
		vet.grr_1();
		geral.escolhas_3(t1, vet);

		escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				guerreiro2(t1, 1);

			}
		};

		escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				guerreiro2(t1, 2);

			}
		};

		escolha3 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				guerreiro2(t1, 3);

			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);
		geral.getChoice().getOpcao3().addActionListener(escolha3);
	}

	public void guerreiro2(Texto t1, int x) {

		Geral geral = new Geral();

		vet.grr_2(x);
		geral.escolhas_3(t1, vet);

		escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				t1.zerar();
				t1.getTexto().remove(geral.getChoice().getPanel_1());
				guerreiro3(t1, 1);

			}
		};

		escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				guerreiro3(t1, 2);

			}
		};

		escolha3 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				guerreiro3(t1, 3);

			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);
		geral.getChoice().getOpcao3().addActionListener(escolha3);
	}

	public void guerreiro3(Texto t1, int x) {
		Geral geral = new Geral();

		vet.grr_3(x);

		geral.escolhas_2(t1, vet);

		escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				guerreiro4(t1, 1);

			}
		};

		escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				guerreiro4(t1, 2);

			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);
	}

	public void guerreiro4(Texto t1, int x) {
		Geral geral = new Geral();

		switch (x) {
		case 1:
			vet.grr_4_cinismo();
			break;
		case 2:
			vet.grr_4_agressivo();
			break;
		}

		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.zerar();
						t1.getContinuar().removeActionListener(continuar);
						t1.getTexto().dispose();
						new Hidra(new Jogador());
					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);
	}

	public void destino() {

		if (player.getDias() != 0) {

			JFrame frame = new JFrame();
			JLabel dias = new JLabel("faltam " + player.getDias() + " dias");
			dias.setBounds(1030, 120, 200, 100);
			dias.setFont(new Font("Georgia", Font.BOLD, 14));
			dias.setForeground(Color.BLACK);
			frame.getContentPane().add(dias);

			ImageIcon relogioIMG = new ImageIcon("src/imagens/relogio" + player.getHoras() + ".png");
			relogioIMG.setImage(relogioIMG.getImage().getScaledInstance(100, 100, 100));
			JLabel rel = new JLabel(relogioIMG);
			rel.setBounds(1030, 50, 100, 100);
			frame.getContentPane().add(rel);

			Maps mapa = new Maps(frame);
			mapa.zerarBotoes();

			ActionListener casaNobre = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					player.passaHora();
				}

			};
			ActionListener catedral = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					player.passaHora();
				}

			};
			ActionListener torre = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					player.passaHora();
				}

			};
			if (!player.getEnigma(0)) {
				mapa.getBtnAlamedaPonteiros().setVisible(true);
				mapa.getAlamedaPonteirosFundo().setVisible(true);
				mapa.getBtnAlamedaPonteiros().addActionListener(casaNobre);
			}
			if (!player.getEnigma(1)) {
				mapa.getBtnCatedral().setVisible(true);
				mapa.getCatedralFundo().setVisible(true);
				mapa.getBtnCatedral().addActionListener(catedral);
			}
			if (!player.getEnigma(2)) {
				mapa.getBtnTorreArcana().setVisible(true);
				mapa.getTorreArcanaFundo().setVisible(true);
				mapa.getBtnTorreArcana().addActionListener(torre);
			}
		} else {
			player.setQtd();
			guerra();
		}

	}

	public void torre() {
		Geral geral = new Geral();
		Texto t1 = new Texto();

		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
						t1.getTexto().dispose();
						new Labirinto(player);
					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);

	}

	public void torreDerrota(Jogador player) {

		Geral geral = new Geral();
		Texto t1 = new Texto();
		this.player = player;
		vet.setPlayer(player);

		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
						t1.getTexto().dispose();
						destino();

					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);

	}

	public void torreVitoria(Jogador player) {

		Geral geral = new Geral();
		Texto t1 = new Texto();

		this.player = player;
		this.player.setEnigma(2, true);
		this.player.passaDia();

		vet.setPlayer(this.player);

		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
						t1.getTexto().dispose();
						destino();
					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);

	}

	public void catedral() {
		Geral geral = new Geral();
		Texto t1 = new Texto();

		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
						t1.getTexto().dispose();
						new Hidra(player);
					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);

	}

	public void catedralDerrota(Jogador player, int x) {

		Geral geral = new Geral();
		Texto t1 = new Texto();
		this.player = player;
		vet.setPlayer(player);

		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
						t1.getTexto().dispose();
						destino();

					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);
	}

	public void catedralVitoria(Jogador player) {

		Geral geral = new Geral();
		Texto t1 = new Texto();
		this.player = player;
		this.player.setEnigma(1, true);
		this.player.passaDia();

		vet.setPlayer(this.player);

		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
						t1.getTexto().dispose();
						destino();
					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);

	}

	public void alameda() {
		Geral geral = new Geral();
		Texto t1 = new Texto();

		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
						t1.getTexto().dispose();
						new Porta(player);
					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);

	}

	public void alamedaDerrota(Jogador player) {

		Geral geral = new Geral();
		Texto t1 = new Texto();
		this.player = player;
		vet.setPlayer(player);

		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
						t1.getTexto().dispose();
						destino();

					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);

	}

	public void alamedaVitoria(Jogador player) {

		Geral geral = new Geral();
		Texto t1 = new Texto();

		this.player = player;
		this.player.setEnigma(0, true);
		this.player.passaDia();

		vet.setPlayer(this.player);

		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
						t1.getTexto().dispose();
						destino();
					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);

	}

	public void guerra() {
		Geral geral = new Geral();
		Texto t1 = new Texto();

		geral.escolhas_0(t1, vet);
		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
						new Teste();
					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);

	}

	public void guerraVitoria() {
		Geral geral = new Geral();
		Texto t1 = new Texto();

		switch (player.getQtd()) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			break;
		}

		geral.escolhas_0(t1, vet);
		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
						new Creditos();
					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);

	}

	public void guerraDerrota() {
		Geral geral = new Geral();
		Texto t1 = new Texto();

		geral.escolhas_0(t1, vet);
		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
						new Creditos();
					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);

	}

}
