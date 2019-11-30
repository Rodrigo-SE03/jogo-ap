package cenas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bibliotecas.Biblio_Guerreiro;
import enigmas.Hidra;
import graficos.Geral;
import graficos.Texto;
import personagens.Jogador;
import sons.Musica;

public class Hist_Guerreior {

	private ActionListener continuar, escolha1, escolha2, escolha3;
	private Biblio_Guerreiro vet = new Biblio_Guerreiro(); // Vetor de texto
	private Musica musica = new Musica();
	private Musica[] musicasSegunda;

	public void guerreiro1(Texto t1, Jogador player) {
		Geral geral = new Geral();

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
}
