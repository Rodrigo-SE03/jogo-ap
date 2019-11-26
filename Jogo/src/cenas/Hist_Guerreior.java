package cenas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bibliotecas.Biblio_Guerreiro;
import graficos.Texto;
import personagens.Jogador;
import sons.Musica;

public class Hist_Guerreior {
	private ActionListener continuar, escolha1, escolha2;
	private Biblio_Guerreiro vet = new Biblio_Guerreiro(); // Vetor de texto
	private Musica musica = new Musica();
	private Musica[] musicasSegunda;
	
	public void guerreiro1(Texto t1, Jogador player) {
		Geral geral = new Geral();

		vet.setPlayer(player);
		vet.grr_1();

		geral.escolhas_3(t1, vet);

		ActionListener escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				guerreiro2(t1);

			}
		};

		ActionListener escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				guerreiro2(t1);

			}
		};


		ActionListener escolha3 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				guerreiro2(t1);

			}
		};
		
		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);
		geral.getChoice().getOpcao3().addActionListener(escolha3);
	}
	
	public void guerreiro2(Texto t1) {

		Geral geral = new Geral();

		vet.grr_2();
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
