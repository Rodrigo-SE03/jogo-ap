package cenas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import graficos.Escolhas;
import graficos.Texto;
import personagens.Jogador;

public class Inicio2 {

	private Texto t1;
	private String[] tx = new String[23]; // Strings com os textos a serem mostrados
	private int[] linhas = new int[23]; // Quantidade de pula linha em cada texto
	private Escolhas choice = new Escolhas();
	
	public Inicio2(Jogador player) {

		t1 = new Texto("<html> Prévia : " + "</br>2ª parte do inicio </html>", 1);
		tx[1] = "<html> Você chegou na cidade, foi no mercado"
				+ "<br/> e um cara te roubou"
				+ "<br/>Você corre atras dele e o pega"
				+ "<html>";
		linhas[1]=2;
				
		
		ActionListener continuar = new ActionListener() {
			int cont = 0;
			public void actionPerformed(ActionEvent actionEvent) {			
				if(cont<1) { // Verifica se ainda há mais textos por vir
	            	cont++;
	            	t1.atualizaTexto(tx[cont],linhas[cont]);
	            }	
				else{
					t1.zerar();
					choice.doEscolhas_3(t1.getTexto(), "Oque você faz com o ladino?", 
							"Recuperar seu dinheiro e deixá-lo ir",
							"Liberá-lo, afinal ele é um miserável como você",
							"MATAR O FILHA DA PUTA NA BICUDA");
				}
			}					
			
		};
		
		ActionListener escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				t1.getTexto().dispose();
				System.out.println("1");
			}
		};
		
		ActionListener escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				t1.getTexto().dispose();
				System.out.println("2");
			}
		};
		
		ActionListener escolha3 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				t1.getTexto().dispose();
				System.out.println("3");
			}
		};

		choice.getOpcao1().addActionListener(escolha1);
		choice.getOpcao2().addActionListener(escolha2);
		choice.getOpcao3().addActionListener(escolha3);
		t1.getContinuar().addActionListener(continuar);
	}
}

