package testes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import graficos.Texto;
import menus.Formulario;
import personagens.Jogador;

public class Inicio{
	
	private ActionListener continuar,escolha1,escolha2;
	private Biblioteca vet = new Biblioteca();
	private Jogador player;
	
	public void inicio() {
		
			 Texto t1 = new Texto("",0);
			 Geral geral = new Geral();
			 
			 vet.inicio();
			 geral.escolhas_0(t1,vet);
			 
			continuar = new ActionListener() {
				int cont = 0;	
				 public void actionPerformed(ActionEvent e) {
						if(cont==(vet.getTx().length-1)) {
							new Formulario();
							t1.getContinuar().removeActionListener(continuar);
							t1.getTexto().dispose();
						}
						else cont++;
					}
				};
			 
			t1.getContinuar().addActionListener(continuar);
	}
	
	public void inicio2(Jogador player) {
		 
		Geral geral = new Geral();
		
		this.player = player;
		 
		 Texto t1 = new Texto("",0);
		 vet.setSexo(player.getSexo());
		 vet.inicio2();
		 geral.escolhas_2(t1,vet);
	
		 escolha1 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				geral.getChoice().zerar();
				t1.getContinuar().removeActionListener(continuar);
				correrAtras(t1);
			}
		};
		
		escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				geral.getChoice().zerar();
				System.out.println("2");
			}
		};
	 
	 geral.getChoice().getOpcao1().addActionListener(escolha1);
	 geral.getChoice().getOpcao2().addActionListener(escolha2);
		
	}
	
	public void correrAtras(Texto t1) {
		
		Geral geral = new Geral();
		
		 vet.setSexo(player.getSexo());
		 vet.inicio_correr();
		 geral.escolhas_2(t1,vet);
	
		 ActionListener escolha1 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				geral.getChoice().zerar();
				inicio_Artemis(t1);
			}
		};
		
		ActionListener escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				geral.getChoice().zerar();
				System.out.println("2");
			}
		};
	 
		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);
		
	}
	
	public void inicio_Artemis(Texto t1) {

		Geral geral = new Geral();
		
		 vet.inicio_artemis();
		 geral.escolhas_0(t1,vet);
		 
		continuar = new ActionListener() {
			int cont = 0;	
			 public void actionPerformed(ActionEvent e) {
					if(cont==(vet.getTx().length-1)) {
						t1.getContinuar().removeActionListener(continuar);
					}
					else cont++;
				}
			};
		 
		t1.getContinuar().addActionListener(continuar);
}
		 
		
}