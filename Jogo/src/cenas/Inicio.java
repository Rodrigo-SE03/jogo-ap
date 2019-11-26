
package cenas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import bibliotecas.Biblio_Intro;
import graficos.Texto;
import mapas.Maps;
import menus.Formulario;
import personagens.Jogador;
import sons.Musica;

public class Inicio {

	private ActionListener continuar, escolha1, escolha2;
	private Biblio_Intro vet = new Biblio_Intro(); // Vetor de texto
	private Jogador player; // informa��es do playerS
	private Musica musica = new Musica();
	private Musica[] musicasSegunda;
	

	public void inicio() { // 1� parte do pr�logo

		Texto t1 = new Texto(); // Cria o JFrame e instancia a classe que gera os textos
		Geral geral = new Geral(); // Classe geral para manipular a gera��o dos textos
		musicasSegunda = new Musica[1];
		for(int cont = 0; cont< musicasSegunda.length;cont ++) musicasSegunda[cont] = new Musica();
		vet.inicio(); // Instancia os vetores de texto para o conjunto de textos do metodo inicio
		geral.escolhas_0(t1, vet); // Chama a fun�ao para manipular a gera��o de textos
		musica.TocaMusica("src/sons/musicaCasa.wav");
		//musicasSegunda[0].TocaMusica("src/sons/musicaHidra.wav");
		
		continuar = new ActionListener() { // ActionListener para regir o destino do programa ao fim dos textos
			int cont = 0; // Contador para verificar a posi��o do vetor de texto

			public void actionPerformed(ActionEvent e) {
				switch (cont) {
				case 12:
					musica.stop();
					break;
				default:
					break;
				}
				if (cont == (vet.getTx().length - 1)) {// Verifica se acabaram os vetores de texto
					new Formulario(); // Chama a fun��o para abrir o formul�rio
					t1.getTexto().dispose(); // Fecha a janela de textos
				} else // Atualiza o contador para verificar a posi��o do vetor de texto
					cont++;
			}
		};
		JButton pular = new JButton("Pular");
		pular.setBounds(500,0,100,30);
		t1.getTexto().add(pular);
		
		pular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Formulario(); // Chama a fun��o para abrir o formul�rio
				t1.getTexto().dispose();
			}
		});
		t1.getContinuar().addActionListener(continuar); // Vincula o bot�o ao ActionListener
	}

	public void inicio2(Jogador player) {// 2� parte do pr�logo

		Geral geral = new Geral();
		this.player = player; // Atualiza as informa��es do player
		vet.setPlayer(player);
		Texto t1 = new Texto();

		vet.setPlayer(player); // Atualiza o g�nero do player nos textos
		vet.inicio2();
		geral.escolhas_2(t1, vet);

		escolha1 = new ActionListener() { // Action caso escolha a 1� op��o

			public void actionPerformed(ActionEvent e) {

				player.setBonus_inicio(true);
				vet.setPlayer(player);

				t1.getTexto().remove(geral.getChoice().getPanel_1()); // "apaga" os componentes do frame, deixando
																		// apenas uma "tela em branco"
				correrAtras(t1); // Chama o pr�ximo componente da hist�ria

			}
		};

		escolha2 = new ActionListener() {// Action caso escolha a 2� op��o

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
		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				
				switch(cont) {
				case 1:
				default:
					break;
				}
				
				if (cont == (vet.getTx().length - 1)) {
					t1.zerar();
					t1.getContinuar().removeActionListener(continuar);
					torreArcana(t1);
					
				} else
					cont++;
				
			}
		};

		t1.getContinuar().addActionListener(continuar);
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
		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {

				if (cont == (vet.getTx().length - 1)) {
					t1.zerar();
					t1.getContinuar().removeActionListener(continuar);
					alameda3(t1);
				} else
					cont++;

			}
		};

		t1.getContinuar().addActionListener(continuar);
	}

	public void inicio_Guerreiro(Texto t1) {
		Geral geral = new Geral();

		vet.inicio_guerreiro();
		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {

				if (cont == (vet.getTx().length - 1)) {
					t1.zerar();
					t1.getContinuar().removeActionListener(continuar);
					castelo(t1);
				} else
					cont++;

			}
		};

		t1.getContinuar().addActionListener(continuar);
	}

	public void inicio_NaoCorrer(Texto t1) {
		Geral geral = new Geral();

		vet.inicio_naoCorrer();
		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {

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
		};

		t1.getContinuar().addActionListener(continuar);


	}

	public void torreArcana(Texto t1) {

		Geral geral = new Geral();
		vet.intro_arcanista();
		geral.escolhas_2(t1, vet);

		ActionListener escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				seguir_voz(t1);
			}
		};

		ActionListener escolha2 = new ActionListener() {

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

		vet.ignorar_voz();
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

	public void resposta_a_arcana(Texto t1, int x) {

		Geral geral = new Geral();

		vet.resposta_arcana(x);
		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {

				if (cont == (vet.getTx().length - 1)) {
					t1.zerar();
					t1.getContinuar().removeActionListener(continuar);
				} else
					cont++;

			}
		};

		t1.getContinuar().addActionListener(continuar);
	}
	
	public void alameda3 (Texto t1) {
		Geral geral = new Geral();

		vet.intro_ladino();
		geral.escolhas_3(t1, vet);

		ActionListener escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				bebidaLadino(t1, 1);
			}
		};

		ActionListener escolha2 = new ActionListener() {

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
	
	public void bebidaLadino(Texto t1,int x) {
		Geral geral = new Geral();

		vet.bebida_ladino(x);
		geral.escolhas_3(t1, vet);

		ActionListener escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				resposta1Ladino(t1,1);
			}
		};

		ActionListener escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				resposta1Ladino(t1,2);
			}
		};

		ActionListener escolha3 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				resposta1Ladino(t1,3);
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

		ActionListener escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				resposta2Ladino(t1,1);
			}
		};

		ActionListener escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				resposta2Ladino(t1,2);
			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);

	}

	public void resposta2Ladino(Texto t1,int x) {
		Geral geral = new Geral();

		vet.neg_lad (x);
		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {

				if (cont == (vet.getTx().length - 1)) {
					t1.zerar();
					t1.getContinuar().removeActionListener(continuar);
				} else
					cont++;

			}
		};

		t1.getContinuar().addActionListener(continuar);
	}
	
	public void castelo(Texto t1) {
		Geral geral = new Geral();

		vet.intro_guerreiro();
		geral.escolhas_2(t1, vet);

		ActionListener escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				contHist(t1);
			}
		};

		ActionListener escolha2 = new ActionListener() {

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

				if (cont == (vet.getTx().length - 1)) {
					t1.zerar();
					t1.getContinuar().removeActionListener(continuar);
				} else
					cont++;

			}
		};

		t1.getContinuar().addActionListener(continuar);
	}
	
	public void naoCont(Texto t1) {
		Geral geral = new Geral();

		vet.naoEdaSuaConta();
		geral.escolhas_3(t1, vet);

		ActionListener escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				entrJardim(t1);
			}
		};

		ActionListener escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				entrEstabulo(t1);
			}
		};

		ActionListener escolha3 = new ActionListener() {

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

		ActionListener escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				salaCap(t1, 1);
			}
		};

		ActionListener escolha2 = new ActionListener() {

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

		ActionListener escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				salaCap(t1, 3);
			}
		};

		ActionListener escolha2 = new ActionListener() {

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

				if (cont == (vet.getTx().length - 1)) {
					t1.zerar();
					t1.getContinuar().removeActionListener(continuar);
				} else
					cont++;
			}
		};

		t1.getContinuar().addActionListener(continuar);
	}





}