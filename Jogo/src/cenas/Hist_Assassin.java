package cenas;

import java.awt.event.ActionListener;

import bibliotecas.Biblio_Assassin;
import personagens.Jogador;
import sons.Musica;

public class Hist_Assassin {
	private ActionListener continuar, escolha1, escolha2;
	private Biblio_Assassin vet = new Biblio_Assassin(); // Vetor de texto
	private Jogador player; // informa��es do playerS
	private Musica musica = new Musica();
	private Musica[] musicasSegunda;
}
