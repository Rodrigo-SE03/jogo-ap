package cenas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bibliotecas.Biblio_Arcan;
import enigmas.Hidra;
import enigmas.Labirinto;
import graficos.Geral;
import graficos.Texto;
import personagens.Jogador;
import sons.Musica;

public class Hist_Arcan {
	private ActionListener continuar, escolha1, escolha2, escolha3;
	private Biblio_Arcan vet = new Biblio_Arcan(); // Vetor de texto
	private Musica musica = new Musica();
	private Musica[] musicasSegunda;

	public void arcan1(Texto t1, Jogador player) {
		Geral geral = new Geral();

		vet.setPlayer(player);
		vet.arcan1();

		geral.escolhas_2(t1, vet);

		escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				t1.getContinuar().addActionListener(continuar);
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
						t1.zerar();
						t1.getContinuar().removeActionListener(continuar);
						t1.getTexto().dispose();
						new Labirinto();
					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);
	}
}
