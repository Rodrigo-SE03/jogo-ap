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
		vet.arcan1();

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
		
		ActionListener escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				vet.arcan1_mentir();
				geral.escolhas_0(t1, vet);
				t1.getContinuar().addActionListener(continuar);

			}
		};

		ActionListener escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				vet.arcan1_sincero();
				geral.escolhas_0(t1, vet);
				t1.getContinuar().addActionListener(continuar);

			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);

		
	}
}
