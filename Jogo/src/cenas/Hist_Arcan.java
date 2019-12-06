package cenas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import bibliotecas.Biblio_Arcan;
import enigmas.Hidra;
import enigmas.Labirinto;
import enigmas.Porta;
import graficos.Geral;
import graficos.Loading;
import graficos.Texto;
import mapas.Maps;
import menus.Creditos;
import menus.Menu_inicial;
import modelo.Teste;
import personagens.Jogador;
import sons.Musica;

public class Hist_Arcan {

	private ActionListener continuar, escolha1, escolha2, escolha3;
	private Biblio_Arcan vet = new Biblio_Arcan(); // Vetor de texto
	private static Musica musica = new Musica();
	private Musica[] musicasSegunda;
	private Jogador player;

	public Hist_Arcan(Jogador player) {
		this.player = player;
		this.player.setClase(0);
		this.player.setDias(3);
		this.player.setHoras(3);
		vet.setPlayer(this.player);
	}

	public void arcan1(Texto t1) {
		Geral geral = new Geral();

		vet.arcan1();
		geral.escolhas_2(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					// System.out.println(cont);
					switch (cont) {
					case 0:
						musica.TocaMusica("src/sons/reuniaoArcana.wav");
						musica.setVolume(0.0f);
						musica.aumentaVolume(0.2f, 80);
						break;
					case 4:
						musica.aumentaVolume(0.6f, 50);
						break;
					default:
						break;
					}
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
					} else
						cont++;

				}
			}
		};

		t1.getContinuar().addActionListener(continuar);

		escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				arcan2(t1, 1);

			}
		};

		escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				arcan2(t1, 2);

			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);
	}

	public void arcan2(Texto t1, int x) {
		Geral geral = new Geral();

		vet.arcan2(x);

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

	public void destino() {

		if (musica.isPlaying()) {
			musica.stop();
		}
		if (player.getDias() != 0 && !(player.getEnigma(0) && player.getEnigma(1) && player.getEnigma(2))) {

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

			ActionListener catedral = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					player.passaHora();
					if (player.getFirstTry(0)) {
						player.setFirstTry(0, false);
						catedral();
					} else {
						catedral3();
					}

				}

			};

			ActionListener alameda = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					player.passaHora();
					alameda();
				}

			};

			ActionListener torre = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					player.passaHora();
					torre();

				}

			};
			if (!player.getEnigma(0)) {
				mapa.getBtnCatedral().setVisible(true);
				mapa.getCatedralFundo().setVisible(true);
				mapa.getBtnCatedral().addActionListener(catedral);
			}
			if (!player.getEnigma(1)) {
				mapa.getBtnAlamedaPonteiros().setVisible(true);
				mapa.getAlamedaPonteirosFundo().setVisible(true);
				mapa.getBtnAlamedaPonteiros().addActionListener(alameda);
			}
			if (!player.getEnigma(2)) {
				mapa.getBtnTorreArcana().setVisible(true);
				mapa.getTorreArcanaFundo().setVisible(true);
				mapa.getBtnTorreArcana().addActionListener(torre);
			}
		} else {
			player.setQtd();
			switch (player.getQtd()) {
			case 2:
				if (player.isBonus_inicio()) {
					guerra1();
				}
				break;
			case 3:
				guerra1();
				break;
			default:
				guerra2();
				break;
			}
		}

	}

	public void torre() {
		Geral geral = new Geral();
		Texto t1 = new Texto();

		if (player.getFirstTry(2)) {
			vet.torre();
			player.setFirstTry(2, false);
		} else
			vet.torre2();

		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					switch (cont) {
					case 0:
						if (musica.isPlaying())
							musica.stop();
						musica.TocaMusica("src/sons/torre.wav");
						musica.setVolume(0.4f);
						break;
					default:
						break;
					}
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
//						t1.getTexto().dispose();
						musica.stop();
//						Loading load = new Loading();
//						load.start();
//						try {
//							Thread.sleep(5000);
//						} catch (InterruptedException e1) {
//							// TODO Auto-generated catch block
//							e1.printStackTrace();
//						}
						new Labirinto(player, t1.getTexto());
					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);

	}

	public void torreDerrota() {

		Geral geral = new Geral();
		Texto t1 = new Texto();

		vet.torreDerrota();
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

	public void torreVitoria() {

		Geral geral = new Geral();
		Texto t1 = new Texto();

		this.player.setEnigma(2, true);
		this.player.passaDia();

		vet.torreVitoria();
		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					switch (cont) {
					case 2:
						musica.TocaMusica("src/sons/mercado.wav");
						musica.setVolume(0.1f);
						musica.aumentaVolume(0.6f, 50);
						break;
					default:
						break;
					}
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

		vet.catedral();

		geral.escolhas_2(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					// System.out.println(cont);
					switch (cont) {
					case 0:
						if (musica.isPlaying()) {
							musica.stop();
						}
						musica.TocaMusica("src/sons/catedral.wav");
						musica.setVolume(0.9f);
						break;
					default:
						break;
					}
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);

		escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				catedral2(t1, 1);

			}
		};

		escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				catedral2(t1, 2);

			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);
	}

	public void catedral2(Texto t1, int x) {

		Geral geral = new Geral();

		vet.catedral2(x);

		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
						t1.getTexto().dispose();
						musica.setVolume(0.0f);
						new Hidra(player);
					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);
	}

	public void catedral3() {
		Geral geral = new Geral();
		Texto t1 = new Texto();

		vet.catedral3();

		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
						t1.getTexto().dispose();
						musica.setVolume(0.0f);
						new Hidra(player);
					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);

	}

	public void catedralDerrota(int x) {

		Geral geral = new Geral();
		Texto t1 = new Texto();

		vet.catedralDerrota(x);
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

	public void catedralVitoria() {

		Geral geral = new Geral();
		Texto t1 = new Texto();

		this.player.setEnigma(0, true);
		this.player.passaDia();

		vet.catedralVitoria();
		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					switch (cont) {
					case 0:
						musica.aumentaVolume(0.7f, 80);
						break;
					default:
						break;
					}
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
						t1.getTexto().dispose();
						musica.reduzVolume(0.0f, 40);
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

		if (player.getFirstTry(1)) {
			player.setFirstTry(1, false);
			vet.alameda();
		} else {
			vet.alameda2();
		}

		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					switch (cont) {
					case 0:
						if (musica.isPlaying())
							musica.stop();
						musica.TocaMusica("src/sons/alameda.wav");
						musica.setVolume(0.3f);
						break;
					case 2:
						musica.aumentaVolume(0.6f, 50);
						break;
					default:
						break;
					}
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

	public void alamedaDerrota() {

		Geral geral = new Geral();
		Texto t1 = new Texto();

		vet.alamedaDerrota();
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

	public void alamedaVitoria() {

		Geral geral = new Geral();
		Texto t1 = new Texto();

		this.player.setEnigma(1, true);
		this.player.passaDia();

		vet.alamedaVitoria();
		geral.escolhas_0(t1, vet);
		geral.setGo(false);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					switch (cont) {
					case 3:
						musica.reduzVolume(0.0f, 40);
					default:
						break;
					}
					if (geral.isGo()) {
						t1.getTexto().dispose();
						t1.getContinuar().removeActionListener(continuar);
						destino();

					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);

	}

	public void guerra1() {

		Geral geral = new Geral();
		Texto t1 = new Texto();

		if (player.getQtd() == 3) {

			vet.todosItens();

		} else {

			vet.itens2BI();
		}

		geral.escolhas_2(t1, vet);

		escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				player.setSacrificio(true);
				if (player.getQtd() == 3)
					sacrificio(t1);
				else
					itens2BISIM(t1);
			}
		};

		escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				t1.getTexto().remove(geral.getChoice().getPanel_1());
				sacrificio(t1);
			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);
	}

	public void itens2BISIM(Texto t1) {
		Geral geral = new Geral();
		vet.itens2BISIM();

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

	public void sacrificio(Texto t1) {
		Geral geral = new Geral();

		if (player.isSacrificio()) {
			if (player.getQtd() == 3)
				vet.todosItensMatar();
		} else {
			if (player.getQtd() == 3)
				vet.todosItensPoup();
			else
				vet.itens2BINao();
		}

		geral.escolhas_0(t1, vet);
		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
						t1.getTexto().dispose();
						new Teste(player);
					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);
	}

	public void guerra2() {
		Geral geral = new Geral();
		Texto t1 = new Texto();

		vet.itensMin();
		geral.escolhas_0(t1, vet);
		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
						t1.getTexto().dispose();
						new Teste(player);
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

		if (player.getQtd() == 3) {
			if (player.isSacrificio())
				vet.vitoriaPerfectMatar();
			else
				vet.vitoriaPerfectPoup();
		} else {
			if (player.getQtd() == 2 && player.isBonus_inicio())
				vet.vitoriaPerfectPoup();
			else
				vet.vitoriaMin();
		}
		geral.escolhas_0(t1, vet);
		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
						t1.getTexto().dispose();
						Creditos cr = new Creditos();

						new Thread() {
							public void run() {
								try {
									sleep(5000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								cr.setVisible(false);
								new Menu_inicial();
							}
						}.start();

						cr.mostraCreditos();
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

		if (player.getQtd() == 3) {
			if (player.isSacrificio()) {
				if (player.isBonus_inicio())
					vet.derrotaPerfectBIMatar();
				else
					vet.derrotaPerfectMatar();
			} else
				vet.derrotaPerfectPoup();
		} else if (player.getQtd() == 2 && player.isBonus_inicio())
			vet.itens2BIDerrota();
		else
			vet.derrotaMin();

		geral.escolhas_0(t1, vet);
		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
						t1.getTexto().dispose();
						Creditos cr = new Creditos();

						new Thread() {
							public void run() {
								try {
									sleep(5000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								cr.setVisible(false);
								new Menu_inicial();
							}
						}.start();

						cr.mostraCreditos();
					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);

	}
}
