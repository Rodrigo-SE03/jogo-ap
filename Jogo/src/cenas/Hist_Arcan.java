package cenas;

import java.awt.event.ActionListener;

import bibliotecas.Biblio_Arcan;
import personagens.Jogador;
import sons.Musica;

public class Hist_Arcan {
	private ActionListener continuar, escolha1, escolha2;
	private Biblio_Arcan vet = new  Biblio_Arcan(); // Vetor de texto
	private Jogador player; // informa��es do playerS
	private Musica musica = new Musica();
	private Musica[] musicasSegunda;
}
