package cenas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import graficos.Escolhas;
import graficos.Texto;
import personagens.Jogador;

public class Inicio_CorrerAtras {
		
		private ActionListener continuar,escolha1,escolha2;
		
		private String[] tx; // Strings com os textos a serem mostrados
		private int[] linhas; // Quantidade de pula linha em cada texto
		private Escolhas choice = new Escolhas();
		
		public Inicio_CorrerAtras(Texto t1, Jogador player) {
			texto(t1,player);
		}
		
		private void texto(Texto t1, Jogador player){
			
			t1.atualizaTexto("<html>Você corre atrás do bandido e pula "
					+"<br/>em cima dele, você o está segurando, "
					+"<br/>ele está em sua posse, a rua não está  "
					+"<br/>totalmente movimentada e nem"
					+"<br/>conversar com você."
					+"<br/>totalmente vazia, duas pessoas se "
					+"<br/>destacam no meio das outra, um "
					+"<br/>guarda e alguém que se esconde "
					+"<br/>atrás de um capuz. "
					+"<html>",8);
			
			continuar = new ActionListener() {
				int cont = -2;
				public void actionPerformed(ActionEvent e) {
						if(cont == -2) {
							t1.zerar();
							choice.doEscolhas_2(t1.getTexto(), "<html>O que você fará?<html>",
									"Recuperar seu dinheiro e deixá-lo ir",
									"Recuperar seu dinheiro e mantê-lo preso");
							cont++;
						}
						else if(cont<(tx.length-1)) {
							cont++;
							t1.atualizaTexto(tx[cont],linhas[cont]);
						}
						else {
							t1.zerar();
							t1.getContinuar().removeActionListener(continuar);
						}
					
				}
				
			};
			
			escolha1 = new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					choice.getPanel_1().setVisible(false);
					tx = new String[6];
					linhas =  new int[6];
					t1.atualizaTexto("<html>Você pega novamente seus pertences "
							+"<br/>e libera o ladrão, que corre em "
							+"<br/>direção a liberdade, uma mulher "
							+"<br/>misteriosa se aproxima e começa a"
							+"<br/>conversar com você."
				 			+"<html>",4);
					
					
					tx[0] = "<html>Estranho de capuz: "
							+"<br/><br/>Interessante...  "
							+ "<html>";
					linhas[0]=2;
					
					tx[1] = "<html>Estranho de capuz: "
							+"<br/><br/>O seu ato, você perseguiu essa "
							+"<br/>pessoa que te roubou, mostrando que "
							+"<br/>está determinado a lutar pelo seu"
							+"<br/>direito ."
							+ "<html>";
					linhas[1]=5;
					
					tx[2] = "<html>Estranho de capuz: "
							+"<br/><br/>E, quando o capturou, mostrou "
							+"<br/>compaixão com um irmão, já tinha "
							+"<br/>recuperado seus pertences, controlou "
							+"<br/>a raiva que pulsava em seus olhos e o "
							+"<br/>liberou. Não é algo que se veja todos "
							+"<br/>os dias." 
							+ "<html>";
					linhas[2]=7;
					
					tx[3] = "<html>Estranho de capuz: "
							+"<br/><br/>Meu nome é Artemisia, sou uma  "
							+"<br/>arcana da Torre Anciã E. Quanto ao "
							+"<br/>que eu quero, percebo em você tem "
							+"<br/>um potencial raro, uma força de "
							+"<br/>vontade, determinação e  "
							+"<br/>principalmente bondade e controle " 
							+"<br/>para se tornar um arcano." 
							+ "<html>";
					linhas[3]=8;
					
					tx[4] =  "<html>Artemisia: "
							+"<br/><br/>Se você tiver interesse venha me  "
							+"<br/>procurar na Torre Anciã (colocar "
							+"<br/>localização baseada no mapa) está "
							+"<br/>noite"
							+ "<html>";
					linhas[4]=5;
					
					tx[5] =  "<html>Artemisia vai embora e te deixa "
							+"<br/>pensando em sua oferta. "
							+ "<html>";
					linhas[5]=1;
		
				}
			};
			
			escolha2 = new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					choice.getPanel_1().setVisible(false);
					t1.getContinuar().removeActionListener(continuar);
				}
			};
			
			choice.getOpcao1().addActionListener(escolha1);
			choice.getOpcao2().addActionListener(escolha2);
			t1.getContinuar().addActionListener(continuar);
			
			
		
	}

}
