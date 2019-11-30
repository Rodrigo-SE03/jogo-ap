
package cenas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import bibliotecas.Biblio_Intro;
import graficos.Escolhas;
import graficos.Geral;
import graficos.Texto;
import mapas.Maps;
import menus.Formulario;
import personagens.Jogador;
import sons.Musica;

public class Hist_Inicio {

	private ActionListener continuar, escolha1, escolha2, escolha3;
	private Biblio_Intro vet = new Biblio_Intro(); // Vetor de texto
	private Musica musica = new Musica();
	private Musica musica2 = new Musica();
	private Musica musica3 = new Musica();

	public void admin(Jogador player) {
		Texto t1 = new Texto();
		Escolhas choice = new Escolhas();
		t1.zerar();
		choice.doEscolhas_2(t1.getTexto(), "", "Seguir história", "Pular pras classes");
		escolha1 = new ActionListener() { // Action caso escolha a 1ï¿½ opï¿½ï¿½o

			public void actionPerformed(ActionEvent e) {
				t1.getTexto().dispose();
				inicio2(player);
			}
		};

		escolha2 = new ActionListener() {// Action caso escolha a 2ï¿½ opï¿½ï¿½o

			public void actionPerformed(ActionEvent e) {
				t1.getTexto().dispose();
				admin1(player);
			}
		};

		choice.getOpcao1().addActionListener(escolha1);
		choice.getOpcao2().addActionListener(escolha2);

	}

	public void admin1(Jogador player) {
		Texto t1 = new Texto();
		t1.zerar();
		Escolhas choice = new Escolhas();
		choice.doEscolhas_3(t1.getTexto(), "Qual classe?", "Arcano", "Guerreiro", "Assassino");
		ActionListener escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				t1.getTexto().remove(choice.getPanel_1());
				new Hist_Arcan().arcan1(t1, player);
			}
		};

		ActionListener escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				t1.getTexto().remove(choice.getPanel_1());
				new Hist_Guerreior().guerreiro1(t1, player);

			}
		};

		ActionListener escolha3 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				t1.getTexto().remove(choice.getPanel_1());
				new Hist_Assassin().assassin1(t1, player);

			}
		};

		choice.getOpcao1().addActionListener(escolha1);
		choice.getOpcao2().addActionListener(escolha2);
		choice.getOpcao3().addActionListener(escolha3);

	}

	public void inicio() { // 1ï¿½ parte do prï¿½logo

		Texto t1 = new Texto(); // Cria o JFrame e instancia a classe que gera os textos
		Geral geral = new Geral(); // Classe geral para manipular a geraï¿½ï¿½o dos textos
		vet.inicio(); // Instancia os vetores de texto para o conjunto de textos do metodo inicio
		geral.escolhas_0(t1, vet); // Chama a funï¿½ao para manipular a geraï¿½ï¿½o de textos
		musica.TocaMusica("src/sons/musicaCasa.wav");

		musica.setVolume(0.8f);

		continuar = new ActionListener() { // ActionListener para regir o destino do programa ao fim dos textos
			int cont = 0; // Contador para verificar a posiï¿½ï¿½o do vetor de texto

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					System.out.println(cont);
					switch (cont) {
					case 10:
						musica.reduzVolume(0.4f, 90);
						break;
					case 12:
						musica.reduzVolume(0.02f, 40);
						musica2.TocaMusica("src/sons/musicaDesespero.wav");
						musica2.setVolume(0.0f);
						musica2.aumentaVolume(0.8f, 100);
						musica3.TocaMusica("src/sons/fogo.wav");
						musica3.setVolume(0.0f);
						musica3.aumentaVolume(0.4f,40);
						break;
					case 13:
						musica.stop();
						musica3.aumentaVolume(0.6f,40);
						break;
					case 14:
						musica.TocaMusica("src/sons/grito.wav");
						musica.setVolume(0.2f);
						musica.reduzVolume(0.0f,50);
						break;
					case 15:
						musica.stop();
						musica2.reduzVolume(0.2f, 50);
						musica3.aumentaVolume(0.8f,40);
						break;
					case 17:
						musica3.stop();
						break;
					case 18:
						musica2.stop();
						break;
					default:
						break;
					}
					if (cont == (vet.getTx().length - 1)) {// Verifica se acabaram os vetores de texto
						new Formulario(); // Chama a funï¿½ï¿½o para abrir o formulï¿½rio
						t1.getTexto().dispose(); // Fecha a janela de textos
					} else // Atualiza o contador para verificar a posiï¿½ï¿½o do vetor de texto
						cont++;
				}
			}
		};
		JButton pular = new JButton("Pular");
		pular.setBounds(500, 0, 100, 30);
		t1.getTexto().add(pular);

		pular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				musica.stop();
				// TODO Auto-generated method stub
				musica2.stop();
//				musicasSegunda[0].stop();
				new Formulario(); // Chama a funï¿½ï¿½o para abrir o formulï¿½rio
				t1.getTexto().dispose();
			}
		});

		t1.getContinuar().addActionListener(continuar); // Vincula o botï¿½o ao ActionListener
	}

	public void inicio2(Jogador player) {// 2ï¿½ parte do prï¿½logo

		Geral geral = new Geral(); // Atualiza as informaï¿½ï¿½es do player
		vet.setPlayer(player);
		Texto t1 = new Texto();

		vet.setPlayer(player); // Atualiza o gï¿½nero do player nos textos
		vet.inicio2();
		geral.escolhas_2(t1, vet);

		escolha1 = new ActionListener() { // Action caso escolha a 1ï¿½ opï¿½ï¿½o

			public void actionPerformed(ActionEvent e) {

				player.setBonus_inicio(true);
				vet.setPlayer(player);

				t1.getTexto().remove(geral.getChoice().getPanel_1()); // "apaga" os componentes do frame, deixando
																		// apenas uma "tela em branco"
				correrAtras(t1); // Chama o prï¿½ximo componente da histï¿½ria

			}
		};

		escolha2 = new ActionListener() {// Action caso escolha a 2ï¿½ opï¿½ï¿½o

			public void actionPerformed(ActionEvent e) {

				player.setBonus_inicio(false);
				vet.setPlayer(player);
				t1.getTexto().remove(geral.getChoice().getPanel_1());
				inicio_NaoCorrer(t1);

			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);

	}

	public void correrAtras(Texto t1) {

		Geral geral = new Geral();

		vet.inicio_correr();
		geral.escolhas_2(t1, vet);

		ActionListener escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				inicio_Artemis(t1);

			}
		};

		ActionListener escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				inicio_ManterPreso(t1);

			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);

	}

	public void inicio_Artemis(Texto t1) {

		Geral geral = new Geral();

		vet.inicio_artemis();
		geral.escolhas_2(t1, vet);

		escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				seguir_voz(t1);
			}
		};

		escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				ignorar_voz(t1);

			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);

	}

	public void inicio_ManterPreso(Texto t1) {
		Geral geral = new Geral();

		vet.inicio_manterPreso();
		geral.escolhas_2(t1, vet);

		ActionListener escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				inicio_Ladino(t1);
			}
		};

		ActionListener escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				inicio_Guerreiro(t1);

			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);

	}

	public void inicio_Ladino(Texto t1) {
		Geral geral = new Geral();

		vet.inicio_ladino();
		geral.escolhas_3(t1, vet);

		escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				bebidaLadino(t1, 1);
			}
		};

		escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				bebidaLadino(t1, 2);
			}
		};

		ActionListener escolha3 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				bebidaLadino(t1, 3);
			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);
		geral.getChoice().getOpcao3().addActionListener(escolha3);
	}

	public void inicio_Guerreiro(Texto t1) {
		Geral geral = new Geral();

		vet.inicio_guerreiro();
		geral.escolhas_2(t1, vet);

		escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				contHist(t1);
			}
		};

		escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				naoCont(t1);
			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);
	}

	public void inicio_NaoCorrer(Texto t1) {
		Geral geral = new Geral();

		vet.inicio_naoCorrer();
		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.zerar();
						t1.getContinuar().removeActionListener(continuar);
						t1.getTexto().dispose();

						Maps mapa = new Maps();
						mapa.zerarBotoes();

						ActionListener castelo = new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								mapa.getFrame().dispose();
								castelo(new Texto());

							}

						};

						ActionListener alameda = new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								mapa.getFrame().dispose();
								alameda3(new Texto());

							}

						};

						ActionListener torre = new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								mapa.getFrame().dispose();
								torreArcana(new Texto());

							}

						};

						mapa.getBtnCastelo().setVisible(true);
						mapa.getCasteloFundo().setVisible(true);
						mapa.getBtnAlamedaPonteiros().setVisible(true);
						mapa.getAlamedaPonteirosFundo().setVisible(true);
						mapa.getBtnTorreArcana().setVisible(true);
						mapa.getTorreArcanaFundo().setVisible(true);

						mapa.getBtnCastelo().addActionListener(castelo);
						mapa.getBtnAlamedaPonteiros().addActionListener(alameda);
						mapa.getBtnTorreArcana().addActionListener(torre);

					} else
						cont++;

				}
			}
		};

		t1.getContinuar().addActionListener(continuar);

	}

	public void torreArcana(Texto t1) {

		Geral geral = new Geral();
		vet.intro_arcanista();
		geral.escolhas_2(t1, vet);

		escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				seguir_voz(t1);
			}
		};

		escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				ignorar_voz(t1);

			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);
	}

	public void seguir_voz(Texto t1) {
		Geral geral = new Geral();

		vet.seguir_voz();
		geral.escolhas_3(t1, vet);

		ActionListener escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				resposta_a_arcana(t1, 1);
			}
		};

		ActionListener escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				resposta_a_arcana(t1, 2);
			}
		};

		ActionListener escolha3 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				resposta_a_arcana(t1, 3);
			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);
		geral.getChoice().getOpcao3().addActionListener(escolha3);
	}

	public void ignorar_voz(Texto t1) {

		Geral geral = new Geral();
		
		vet.getPlayer().setAndarPelaTorreArcan(true);
		vet.ignorar_voz();
		geral.escolhas_3(t1, vet);

		escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				resposta_a_arcana(t1, 1);
			}
		};

		escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				resposta_a_arcana(t1, 2);
			}
		};

		escolha3 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				resposta_a_arcana(t1, 3);
			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);
		geral.getChoice().getOpcao3().addActionListener(escolha3);
	}

	public void resposta_a_arcana(Texto t1, int x) {

		Geral geral = new Geral();

		vet.resposta_arcana(x);
		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.zerar();
						t1.getContinuar().removeActionListener(continuar);
						new Hist_Arcan().arcan1(t1, vet.getPlayer());
					} else
						cont++;

				}
			}
		};

		t1.getContinuar().addActionListener(continuar);
	}

	public void alameda3(Texto t1) {
		Geral geral = new Geral();

		vet.intro_ladino();
		geral.escolhas_3(t1, vet);

		escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				bebidaLadino(t1, 1);
			}
		};

		escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				bebidaLadino(t1, 2);
			}
		};

		ActionListener escolha3 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				bebidaLadino(t1, 3);
			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);
		geral.getChoice().getOpcao3().addActionListener(escolha3);
	}

	public void bebidaLadino(Texto t1, int x) {
		Geral geral = new Geral();

		vet.bebida_ladino(x);
		geral.escolhas_3(t1, vet);

		escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				resposta1Ladino(t1, 1);
			}
		};

		escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				resposta1Ladino(t1, 2);
			}
		};

		escolha3 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				resposta1Ladino(t1, 3);
			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);
		geral.getChoice().getOpcao3().addActionListener(escolha3);
	}

	public void resposta1Ladino(Texto t1, int x) {
		Geral geral = new Geral();

		vet.resp_lad(x);
		geral.escolhas_2(t1, vet);

		escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				resposta2Ladino(t1, 1);
			}
		};

		escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				resposta2Ladino(t1, 2);
			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);

	}

	public void resposta2Ladino(Texto t1, int x) {
		Geral geral = new Geral();

		vet.neg_lad(x);
		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.zerar();
						t1.getTexto().remove(t1.getTexto().getContentPane());
						t1.getContinuar().removeActionListener(continuar);
						new Hist_Assassin().assassin1(t1, vet.getPlayer());
					} else
						cont++;

				}
			}
		};

		t1.getContinuar().addActionListener(continuar);
	}

	public void castelo(Texto t1) {
		Geral geral = new Geral();

		vet.intro_guerreiro();
		geral.escolhas_2(t1, vet);

		escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				contHist(t1);
			}
		};

		escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				naoCont(t1);
			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);
	}

	public void contHist(Texto t1) {
		Geral geral = new Geral();

		vet.contar_hist();
		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.zerar();
						t1.getContinuar().removeActionListener(continuar);
						new Hist_Guerreior().guerreiro1(t1, vet.getPlayer());
					} else
						cont++;

				}
			}
		};

		t1.getContinuar().addActionListener(continuar);
	}

	public void naoCont(Texto t1) {
		Geral geral = new Geral();

		vet.naoEdaSuaConta();
		geral.escolhas_3(t1, vet);

		escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				entrJardim(t1);
			}
		};

		escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				entrEstabulo(t1);
			}
		};

		escolha3 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				salaCap(t1, 5);
			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);
		geral.getChoice().getOpcao3().addActionListener(escolha3);
	}

	public void entrJardim(Texto t1) {
		Geral geral = new Geral();

		vet.jardins();
		geral.escolhas_2(t1, vet);

		escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				salaCap(t1, 1);
			}
		};

		escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				salaCap(t1, 2);
			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);

	}

	public void entrEstabulo(Texto t1) {
		Geral geral = new Geral();

		vet.estabulos();
		geral.escolhas_2(t1, vet);

		escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				salaCap(t1, 3);
			}
		};

		escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				salaCap(t1, 4);
			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);

	}

	public void salaCap(Texto t1, int x) {

		Geral geral = new Geral();

		vet.salaCap(x);
		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.zerar();
						t1.getContinuar().removeActionListener(continuar);
						new Hist_Guerreior().guerreiro1(t1, vet.getPlayer());
					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);
	}

}