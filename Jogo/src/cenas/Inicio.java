
package cenas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import graficos.Texto;
import menus.Formulario;
import personagens.Jogador;

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

				geral.getChoice().getPanel_1().setVisible(false);; // "apaga" os componentes do frame, deixando apenas uma "tela em branco"
				correrAtras(t1); // Chama o próximo componente da história

			}
		};

		escolha2 = new ActionListener() {// Action caso escolha a 2ª opção

			public void actionPerformed(ActionEvent e) {

				geral.getChoice().getPanel_1().setVisible(false);

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
			
				geral.getChoice().getPanel_1().setVisible(false);;
				inicio_Artemis(t1);
			
			}
		};

		ActionListener escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			
				geral.getChoice().getPanel_1().setVisible(false);
				
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
					t1.getContinuar().removeActionListener(continuar);
				} else
					cont++;
			
			}
		};

		t1.getContinuar().addActionListener(continuar);
	}

}