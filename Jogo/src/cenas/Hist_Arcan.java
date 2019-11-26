package cenas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bibliotecas.Biblio_Arcan;
import graficos.Texto;
import personagens.Jogador;
import sons.Musica;

public class Hist_Arcan {
	private ActionListener continuar, escolha1, escolha2;
	private Biblio_Arcan vet = new  Biblio_Arcan(); // Vetor de texto
	private Jogador player; // informa��es do playerS
	private Musica musica = new Musica();
	private Musica[] musicasSegunda;
	
	public void arcan1(Texto t1, Jogador player) {
		Geral geral = new Geral();

		vet.setPlayer(player);
//		vet.arcan();

		geral.escolhas_2(t1, vet);

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
