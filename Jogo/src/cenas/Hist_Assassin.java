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
import graficos.Loading;
import graficos.Texto;
import mapas.Maps;
import menus.Creditos;
import menus.Menu_inicial;
import modelo.Teste;
import personagens.Jogador;
import sons.Musica;

public class Hist_Assassin {
	private ActionListener continuar, escolha1, escolha2;
	private Biblio_Assassin vet = new Biblio_Assassin(); // Vetor de texto
	private static Musica musica = new Musica();
	private Musica musica2 = new Musica();
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

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					switch (cont) {
					case 0:
						musica.TocaMusica("src/sons/reuniaoArcana.wav");
						musica.setVolume(0.0f);
						musica.aumentaVolume(0.7f, 80);
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

		if (musica.isPlaying()) {
			musica.stop();
		}
		if (musica2.isPlaying()) {
			musica2.stop();
		}
		if (player.getDias() > 0) {

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
			guerra();

		}

	}

	public void torre() {
		Geral geral = new Geral();
		Texto t1 = new Texto();

		if (player.getFirstTry(1)) {
			vet.TorreArcanaAssassin();
			player.setFirstTry(2, false);
		} else
			vet.labirinto2();

		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					switch (cont) {
					case 0:
						musica.TocaMusica("src/sons/torre.wav");
						musica.setVolume(0.6f);
						break;
					default:
						break;
					}
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
						musica.setVolume(0.0f);
						t1.getTexto().dispose();
						Loading load = new Loading();
						load.start();
						new Thread() {
							public void run() {
								Labirinto lab = new Labirinto(player);
								load.interrupt();
								lab.go();
							}
						}.start();
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
					switch (cont) {
					case 0:
						musica.aumentaVolume(0.6f, 50);
						break;
					default:
						break;
					}
					if (cont == (vet.getTx().length - 1)) {
						new Thread() {
							public void run() {
								while (!geral.isGo()) {
									try {
										sleep(100);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
								t1.getContinuar().removeActionListener(continuar);
								t1.getTexto().dispose();
								destino();
							}
						}.start();
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
		if (player.getHoras() != 3)
			this.player.passaDia();

		vet.posLabirinto(1);
		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					switch (cont) {
					case 0:
						musica.aumentaVolume(0.6f, 50);
						break;
					default:
						break;
					}
					if (cont == (vet.getTx().length - 1)) {
						new Thread() {
							public void run() {
								while (!geral.isGo()) {
									try {
										sleep(100);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
								t1.getContinuar().removeActionListener(continuar);
								t1.getTexto().dispose();
								destino();
							}
						}.start();
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

		if (player.getFirstTry(1)) {
			vet.Catederal();
			player.setFirstTry(1, false);
		} else
			vet.Hidra2();
		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					switch (cont) {
					case 0:
						musica.TocaMusica("src/sons/prisao.wav");
						musica.setVolume(0.9f);
						break;
					default:
						break;
					}
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

		vet.posHidra(2);
		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						new Thread() {
							public void run() {
								while (!geral.isGo()) {
									try {
										sleep(100);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
								t1.getContinuar().removeActionListener(continuar);
								t1.getTexto().dispose();
								destino();
							}
						}.start();
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
		if (player.getHoras() != 3)
			this.player.passaDia();

		vet.posHidra(1);
		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					switch (cont) {
					case 0:
						musica.aumentaVolume(0.9f, 50);
						break;
					default:
						break;
					}
					if (cont == (vet.getTx().length - 1)) {
						new Thread() {
							public void run() {
								while (!geral.isGo()) {
									try {
										sleep(100);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
								t1.getContinuar().removeActionListener(continuar);
								t1.getTexto().dispose();
								destino();
							}
						}.start();
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

		musica.TocaMusica("src/sons/casaNobre.wav");
		musica.setVolume(0.7f);

		if (player.getFirstTry(0)) {
			vet.CasaNobreAssassin();
			player.setFirstTry(0, false);
		} else
			vet.EnigmaPortaAssassin2();

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

		musica.stop();
		Geral geral = new Geral();
		Texto t1 = new Texto();

		vet.EnigmaPortaAssasin(2);

		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						new Thread() {
							public void run() {
								while (!geral.isGo()) {
									try {
										sleep(100);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
								t1.getContinuar().removeActionListener(continuar);
								t1.getTexto().dispose();
								destino();
							}
						}.start();
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
		if (player.getHoras() != 3)
			this.player.passaDia();

		vet.EnigmaPortaAssasin(1);

		geral.escolhas_2(t1, vet);

		escolha1 = new ActionListener() { // Action caso escolha a 1� op��o

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				casaNobreVitoria1(t1);
			}
		};

		escolha2 = new ActionListener() {// Action caso escolha a 2� op��o

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				casaNobreVitoria2(t1);
			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);

	}

	public void casaNobreVitoria1(Texto t1) {
		Geral geral = new Geral();

		vet.OQueVoceQuerAssassin(1);
		geral.escolhas_2(t1, vet);

		escolha1 = new ActionListener() { // Action caso escolha a 1� op��o

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				casaNobreVitoria1_1(t1);
			}
		};

		escolha2 = new ActionListener() {// Action caso escolha a 2� op��o

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				casaNobreVitoria1_2(t1);
			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);

	}

	public void casaNobreVitoria1_1(Texto t1) {
		Geral geral = new Geral();

		vet.CassiusmeMandou(1);
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

	public void casaNobreVitoria1_2(Texto t1) {
		Geral geral = new Geral();

		vet.CassiusmeMandou(2);
		geral.escolhas_2(t1, vet);

		escolha1 = new ActionListener() { // Action caso escolha a 1� op��o

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				casaNobreVitoria1_3(t1, 1);
			}
		};

		escolha2 = new ActionListener() {// Action caso escolha a 2� op��o

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				casaNobreVitoria1_3(t1, 2);
			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);

	}

	public void casaNobreVitoria1_3(Texto t1, int x) {
		Geral geral = new Geral();

		if (x == 2)
			player.setRecAriandra(true);
		vet.voceEstaLouco(x);

		geral.escolhas_0(t1, vet);
		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						new Thread() {
							public void run() {
								while (!geral.isGo()) {
									try {
										sleep(100);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
								t1.getContinuar().removeActionListener(continuar);
								t1.getTexto().dispose();
								destino();
							}
						}.start();
					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);

	}

	public void casaNobreVitoria2(Texto t1) {
		Geral geral = new Geral();

		vet.OQueVoceQuerAssassin(2);
		geral.escolhas_2(t1, vet);

		escolha1 = new ActionListener() { // Action caso escolha a 1� op��o

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				casaNobreVitoria2_1(t1, 1);
			}
		};

		escolha2 = new ActionListener() {// Action caso escolha a 2� op��o

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				casaNobreVitoria2_1(t1, 2);

			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);

	}

	public void casaNobreVitoria2_1(Texto t1, int x) {
		Geral geral = new Geral();
		if (x == 2)
			player.setRecAriandra(true);

		vet.porqueDeveriaMeImportar(x);

		geral.escolhas_0(t1, vet);
		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						new Thread() {
							public void run() {
								while (!geral.isGo()) {
									try {
										sleep(100);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
								t1.getContinuar().removeActionListener(continuar);
								t1.getTexto().dispose();
								destino();
							}
						}.start();
					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);

	}

	public void guerra() {
		musica.TocaMusica("src/sons/preGuerra.wav");
		musica.setVolume(0.6f);
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
						musica.stop();
						new Teste(player);
					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);

	}

	public void guerraVitoria() {
		musica.TocaMusica("src/sons/final.wav");
		musica.setVolume(0.7f);

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
			guerraBon_Zero();
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
							musica.stop();
							Creditos cr = new Creditos();
							try {
								Thread.sleep(2000);
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							musica.TocaMusica("src/sons/creditos.wav");
							musica.setVolume(0.9f);

							new Thread() {
								public void run() {
									try {
										sleep(10000);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									musica.stop();
									cr.setVisible(false);
									new Menu_inicial();
								}
							}.start();
							cr.setUndecorated(true);
							t1.getTexto().dispose();
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

		musica.TocaMusica("src/sons/final.wav");
		musica.setVolume(0.7f);

		if (player.isBonus_inicio()) {
			guerraBon_Zero();
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

							Creditos cr = new Creditos();
							musica.stop();
							try {
								Thread.sleep(2000);
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							musica.TocaMusica("src/sons/creditos.wav");
							musica.setVolume(0.9f);
							new Thread() {
								public void run() {
									try {
										sleep(10000);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									musica.stop();
									cr.setVisible(false);
									new Menu_inicial();
								}
							}.start();
							cr.setUndecorated(true);
							t1.getTexto().dispose();
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
								musica.stop();
								Creditos cr = new Creditos();
								try {
									Thread.sleep(2000);
								} catch (InterruptedException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								musica.TocaMusica("src/sons/creditos.wav");
								musica.setVolume(0.9f);
								new Thread() {
									public void run() {
										try {
											sleep(10000);
										} catch (InterruptedException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
										musica.stop();
										cr.setVisible(false);
										new Menu_inicial();
									}
								}.start();
								cr.setUndecorated(true);
								t1.getTexto().dispose();
								cr.mostraCreditos();

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
								musica.stop();
								Creditos cr = new Creditos();
								try {
									Thread.sleep(2000);
								} catch (InterruptedException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								musica.TocaMusica("src/sons/creditos.wav");
								musica.setVolume(0.9f);
								new Thread() {
									public void run() {
										try {
											sleep(10000);
										} catch (InterruptedException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
										musica.stop();
										cr.setVisible(false);
										new Menu_inicial();
									}
								}.start();
								cr.setUndecorated(true);
								t1.getTexto().dispose();
								cr.mostraCreditos();

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
