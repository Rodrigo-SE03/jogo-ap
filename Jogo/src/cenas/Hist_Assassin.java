package cenas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import bibliotecas.Biblio_Assassin;
import enigmas.Hidra;
import enigmas.Labirinto;
import enigmas.Porta;
import graficos.Geral;
import graficos.Texto;
import mapas.Maps;
import menus.Creditos;
import menus.Menu_inicial;
import modelo.Teste;
import personagens.Jogador;
import sons.Musica;

public class Hist_Assassin {
	private ActionListener continuar, escolha1, escolha2, escolha3;
	private Biblio_Assassin vet = new Biblio_Assassin(); // Vetor de texto
	private Musica musica = new Musica();
	private Musica[] musicasSegunda;
	private Jogador player;

	public Hist_Assassin(Jogador player) {
		this.player = player;
		this.player.setClase(1);
		vet.setPlayer(this.player);
	}

	public void assassin1(Texto t1) {
		Geral geral = new Geral();

		vet.hpAssassin();

		geral.escolhas_2(t1, vet);

		escolha1 = new ActionListener() { // Action caso escolha a 1� op��o

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1()); // "apaga" os componentes do frame,
																		// deixando
																		// apenas uma "tela em branco"
				vet.Escolha1Assassin(1); // Chama o pr�ximo componente da hist�ria
				geral.escolhas_0(t1, vet);
				t1.getContinuar().addActionListener(new ActionListener() {
					int cont = 0; // Contador para verificar a posi��o do vetor de texto

					public void actionPerformed(ActionEvent e) {

						if (geral.isFlag()) {
							if (cont == (vet.getTx().length - 1)) {// Verifica se acabaram os vetores de texto
								t1.getContinuar().removeActionListener(continuar);
								t1.getTexto().dispose();
								destino();
							} else // Atualiza o contador para verificar a posi��o do vetor de texto
								cont++;
						}
					}
				});
			}
		};

		escolha2 = new ActionListener() {// Action caso escolha a 2� op��o

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());

				vet.Escolha1Assassin(2);
				geral.escolhas_0(t1, vet);
				t1.getContinuar().addActionListener(new ActionListener() {
					int cont = 0; // Contador para verificar a posi��o do vetor de texto

					public void actionPerformed(ActionEvent e) {

						if (geral.isFlag()) {
							if (cont == (vet.getTx().length - 1)) {// Verifica se acabaram os vetores de texto
								t1.getContinuar().removeActionListener(continuar);
								t1.getTexto().dispose();
								destino();
							} else // Atualiza o contador para verificar a posi��o do vetor de texto
								cont++;
						}
					}
				});

			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);
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
					CasaNobre();
				}

			};
			ActionListener catedral = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					player.passaHora();
					catedral();
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
				mapa.getBtnCasaNobre().setVisible(true);
				mapa.getCasaNobreFundo().setVisible(true);
				mapa.getBtnCasaNobre().addActionListener(casaNobre);
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

		vet.TorreArcanaAssassin();
		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
//						t1.getTexto().dispose();
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

		vet.posLabirinto(2);
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

		vet.posLabirinto(1);
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

		vet.Catederal();
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

	public void catedralDerrota(int x) {

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

		this.player.setEnigma(1, true);
		this.player.passaDia();

		vet.posHidra();
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

	public void CasaNobre() {
		Geral geral = new Geral();
		Texto t1 = new Texto();

		vet.CasaNobreAssassin();
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

	public void CasaNobreDerrota() {

		Geral geral = new Geral();
		Texto t1 = new Texto();

		vet.EnigmaPortaAssasin(2);

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

	public void CasaNobreVitoria() {

		Geral geral = new Geral();
		Texto t1 = new Texto();

		this.player.setEnigma(0, true);
		this.player.passaDia();

		vet.EnigmaPortaAssasin(1);

		geral.escolhas_2(t1, vet);

		escolha1 = new ActionListener() { // Action caso escolha a 1� op��o

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());

			}
		};

		escolha2 = new ActionListener() {// Action caso escolha a 2� op��o

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());

			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);

	}

	public void guerra() {
		Geral geral = new Geral();
		Texto t1 = new Texto();

		vet.finalAssassin();
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
		switch (player.getQtd()) {
		case 1:
			vet.vitoria3Recrutados();
			break;
		case 2:
			vet.vitoriaDoisRecrutados();
			break;
		case 3:
			vet.vitoriaUmRecrutado();
			break;
		default:
			vet.derrotaComBonusOuVitoriaSemRecrutas();
			break;
		}
		if (player.getQtd() > 0) {
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

	public void guerraDerrota() {

		if (player.isBonus_inicio()) {

		} else {
			Geral geral = new Geral();
			Texto t1 = new Texto();
			vet.derrotaSemBonus();
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

	public void guerraBon_Zero() {
		Geral geral = new Geral();
		Texto t1 = new Texto();
		vet.derrotaComBonusOuVitoriaSemRecrutas();

		geral.escolhas_2(t1, vet);

		escolha1 = new ActionListener() { // Action caso escolha a 1� op��o

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1()); // "apaga" os componentes do frame,
																		// deixando
																		// apenas uma "tela em branco"
				vet.derrotaComBonusOuVitoriaSemRecrutas2(1); // Chama o pr�ximo componente da hist�ria
				geral.escolhas_0(t1, vet);
				t1.getContinuar().addActionListener(new ActionListener() {
					int cont = 0; // Contador para verificar a posi��o do vetor de texto

					public void actionPerformed(ActionEvent e) {

						if (geral.isFlag()) {
							if (cont == (vet.getTx().length - 1)) {// Verifica se acabaram os vetores de texto
								t1.getContinuar().removeActionListener(continuar);
								t1.getTexto().dispose();
								destino();
							} else // Atualiza o contador para verificar a posi��o do vetor de texto
								cont++;
						}
					}
				});
			}
		};

		escolha2 = new ActionListener() {// Action caso escolha a 2� op��o

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());

				vet.derrotaComBonusOuVitoriaSemRecrutas2(2);
				geral.escolhas_0(t1, vet);
				t1.getContinuar().addActionListener(new ActionListener() {
					int cont = 0; // Contador para verificar a posi��o do vetor de texto

					public void actionPerformed(ActionEvent e) {

						if (geral.isFlag()) {
							if (cont == (vet.getTx().length - 1)) {// Verifica se acabaram os vetores de texto
								t1.getContinuar().removeActionListener(continuar);
								t1.getTexto().dispose();
								destino();
							} else // Atualiza o contador para verificar a posi��o do vetor de texto
								cont++;
						}
					}
				});

			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);
	}
}
