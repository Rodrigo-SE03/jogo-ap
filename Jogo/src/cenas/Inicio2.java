package cenas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import graficos.Texto;
import personagens.Jogador;

public class Inicio2 {

	private Texto t1;
	private String[] tx = new String[23]; // Strings com os textos a serem mostrados
	private int[] linhas = new int[23]; // Quantidade de pula linha em cada texto

	public Inicio2(Jogador player) {

		t1 = new Texto("<html> Em breve : " + "</br>2ª parte do inicio </html>", 1);

		ActionListener continuar = new ActionListener() {

			public void actionPerformed(ActionEvent actionEvent) {
				t1.getTexto().dispose();
			}
		};

		t1.getContinuar().addActionListener(continuar);
	}
}
