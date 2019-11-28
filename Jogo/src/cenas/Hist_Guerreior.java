package cenas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bibliotecas.Biblio_Guerreiro;
import enigmas.Hidra;
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
				guerreiro_1_cafe(t1);

			}
		};

		ActionListener escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				guerreiro_1_leite(t1);
				

			}
		};


		ActionListener escolha3 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				guerreiro_1_vinho(t1);

			}
		};
		
		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);
		geral.getChoice().getOpcao3().addActionListener(escolha3);
	}
	
	public void guerreiro_1_cafe(Texto t1) {

		Geral geral = new Geral();

		vet.grr_1_cafe();
		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {

				if (cont == (vet.getTx().length - 1)) {
					t1.zerar();
					t1.getContinuar().removeActionListener(continuar);
					guerreiro2(t1);

				} else
					cont++;

			}
		};

		t1.getContinuar().addActionListener(continuar);
	}
	
	public void guerreiro_1_leite(Texto t1) {

		Geral geral = new Geral();

		vet.grr_1_leite();
		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {

				if (cont == (vet.getTx().length - 1)) {
					t1.zerar();
					t1.getContinuar().removeActionListener(continuar);
					guerreiro2(t1);

				} else
					cont++;

			}
		};

		t1.getContinuar().addActionListener(continuar);
	}
	
	public void guerreiro_1_vinho(Texto t1) {

		Geral geral = new Geral();

		vet.grr_1_vinho();
		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {

				if (cont == (vet.getTx().length - 1)) {
					t1.zerar();
					t1.getContinuar().removeActionListener(continuar);
					guerreiro2(t1);

				} else
					cont++;

			}
		};

		t1.getContinuar().addActionListener(continuar);
	}
	
	public void guerreiro2(Texto t1) {

		Geral geral = new Geral();

		vet.grr_2();
		geral.escolhas_3(t1, vet);
		
		ActionListener escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				t1.zerar();
				t1.getTexto().remove(geral.getChoice().getPanel_1());
				guerreiro_3_vinho(t1);

			}
		};

		ActionListener escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				guerreiro_3_licor(t1);

			}
		};

		ActionListener escolha3 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				guerreiro_3_nada(t1);

			}
		};
		
		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);
		geral.getChoice().getOpcao3().addActionListener(escolha3);
	}
	
	public void guerreiro_3_vinho(Texto t1) {

		Geral geral = new Geral();

		vet.grr_3_vinho();
		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {

				if (cont == (vet.getTx().length - 1)) {
					t1.zerar();
					t1.getContinuar().removeActionListener(continuar);
					guerreiro4(t1);;

				} else
					cont++;

			}
		};

		t1.getContinuar().addActionListener(continuar);
	}
	
	public void guerreiro_3_nada(Texto t1) {

		Geral geral = new Geral();

		vet.grr_3_nada();
		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {

				if (cont == (vet.getTx().length - 1)) {
					t1.zerar();
					t1.getContinuar().removeActionListener(continuar);
					guerreiro4(t1);;

				} else
					cont++;

			}
		};

		t1.getContinuar().addActionListener(continuar);
	}
	
	public void guerreiro_3_licor(Texto t1) {

		Geral geral = new Geral();

		vet.grr_3_licor();
		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {

				if (cont == (vet.getTx().length - 1)) {
					t1.zerar();
					t1.getContinuar().removeActionListener(continuar);
					guerreiro4(t1);;

				} else
					cont++;

			}
		};

		t1.getContinuar().addActionListener(continuar);
	}

	public void guerreiro4(Texto t1) {
		Geral geral = new Geral();

		vet.grr_4();

		geral.escolhas_2(t1, vet);

		ActionListener escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				guerreiro5(t1,1);

			}
		};

		ActionListener escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				guerreiro5(t1, 2);

			}
		};

		
		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);
	}
 	
	public void guerreiro5(Texto t1,int x) {
		Geral geral = new Geral();
		
		switch(x) {
		case 1:
			vet.grr_5_agressivo();
			break;
		case 2:
			vet.grr_5_cinismo();
			break;
		}
		
		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {

				if (cont == (vet.getTx().length - 1)) {
					t1.zerar();
					t1.getContinuar().removeActionListener(continuar);
					t1.getTexto().dispose();
					new Hidra();
				} else
					cont++;
			}
		};

		t1.getContinuar().addActionListener(continuar);
	}
}
