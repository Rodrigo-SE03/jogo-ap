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
	private Jogador player; // informa��es do playerS
	private Musica musica = new Musica();
	private Musica[] musicasSegunda;
	
	public void guerreiro1(Texto t1, Jogador Player) {
		Geral geral = new Geral();

		vet.setPlayer(player);
		vet.grr_1();

		geral.escolhas_2(t1, vet);

		ActionListener escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());


			}
		};

		ActionListener escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());


			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);
	}
}
