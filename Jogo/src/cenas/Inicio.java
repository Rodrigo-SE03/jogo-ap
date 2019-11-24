
package cenas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import graficos.Texto;
import menus.Formulario;
import personagens.Jogador;
import cenas.Biblioteca;

public class Inicio {

	private ActionListener continuar, escolha1, escolha2;
	private Biblioteca vet = new Biblioteca(); // Vetor de texto
	private Jogador player; // informações do playerS

	public void inicio() { // 1ª parte do prólogo

		Texto t1 = new Texto("", 0); // Cria o JFrame e instancia a classe que gera os textos
		Geral geral = new Geral(); // Classe geral para manipular a geração dos textos

		vet.inicio(); // Instancia os vetores de texto para o conjunto de textos do metodo inicio
		geral.escolhas_0(t1, vet); // Chama a funçao para manipular a geração de textos

		continuar = new ActionListener() { // ActionListener para regir o destino do programa ao fim dos textos
			int cont = 0; // Contador para verificar a posição do vetor de texto

			public void actionPerformed(ActionEvent e) {
				if (cont == (vet.getTx().length - 1)) {// Verifica se acabaram os vetores de texto
					new Formulario(); // Chama a função para abrir o formulário
					t1.getTexto().dispose(); // Fecha a janela de textos
				} else // Atualiza o contador para verificar a posição do vetor de texto
					cont++;
			}
		};

		t1.getContinuar().addActionListener(continuar); // Vincula o botão ao ActionListener
	}

	public void inicio2(Jogador player) {// 2ª parte do prólogo

		Geral geral = new Geral();
		this.player = player; // Atualiza as informações do player
		Texto t1 = new Texto("", 0);

		vet.setSexo(player.getSexo()); // Atualiza o gênero do player nos textos
		vet.inicio2();
		geral.escolhas_2(t1, vet);

		escolha1 = new ActionListener() { // Action caso escolha a 1ª opção

			public void actionPerformed(ActionEvent e) {

				player.setBonus_inicio(true);

				t1.getTexto().remove(geral.getChoice().getPanel_1()); // "apaga" os componentes do frame, deixando
																		// apenas uma "tela em branco"
				correrAtras(t1); // Chama o próximo componente da história

			}
		};

		escolha2 = new ActionListener() {// Action caso escolha a 2ª opção

			public void actionPerformed(ActionEvent e) {

				player.setBonus_inicio(false);
				t1.getTexto().remove(geral.getChoice().getPanel_1());
				inicio_NaoCorrer(t1);

			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);

	}

	public void correrAtras(Texto t1) {

		Geral geral = new Geral();

		vet.setSexo(player.getSexo());
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
		geral.escolhas_3(t1, vet);

		ActionListener escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				alameda3(t1);

			}
		};

		ActionListener escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				torreArcana(t1);
			}
		};

		ActionListener escolha3 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				castelo(t1);

			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);
		geral.getChoice().getOpcao3().addActionListener(escolha3);
	}

	public void torreArcana(Texto t1) {

		Geral geral = new Geral();
		vet.intro_arcanista(player);
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

		vet.seguir_voz(player);
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

		vet.ignorar_voz(player);
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

		vet.resposta_arcana(x, player);
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

		vet.intro_ladino(player);
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

		vet.bebida_ladino(player, x);
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

		vet.resp_lad(player, x);
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

		vet.neg_lad(player, x);
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

		vet.contar_hist(player);
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

		vet.naoEdaSuaConta(player);
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

		vet.salaCap(player, x);
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