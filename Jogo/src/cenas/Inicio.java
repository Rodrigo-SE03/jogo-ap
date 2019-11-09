package cenas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import graficos.Texto;
import mapas.Mapa1;
public class Inicio {
	
	Texto t1;
	String[] tx = new String[19]; //Strings com os textos a serem mostrados
	int[] linhas = new int[19]; //Quantidade de pula linha em cada texto
	
	public Inicio() {
		
		// Textos a serem mostrados nas caixas de texto
		
		t1 = new Texto("<html>O dia amanheceu. Voce acorda e se"
				+ "<br/>levanta de sua cama e sai de seu"
				+ "<br/> quarto.</html>",2);
		
		tx[1] = "<html>M�e:"
				+"<br/><br/> Bom dia meu bem! Achei que"
				+"<br/>n�o ia mais levantar hoje. J� passou "
				+"<br/>das sete da manh�. Venha logo tomar "
				+"<br/>caf�."
				+"</html>";
		linhas[1] = 5;
		
		tx[2] = "<html>Voc� come tranquilamente"
				+"<br/>enquanto observa sua pequena "
				+"<br/>irm� brincando com bonecas de  "
				+"<br/>pano no ch�o. O dia est�  "
				+"<br/>agrad�vel."
				+"</html>";
		linhas[2] = 4;
		
		
		tx[3] = "<html>M�e:"
				+"<br/><br/>Hoje completa um ano da  "
				+"<br/>morte de seu pai. Vamos ao "
				+"<br/>cemit�rio visit�-lo mais tarde."
				+"</html>";
		linhas[3] = 4;
		
		
		tx[4] = "<html>M�e:"
				+"<br/><br/>Ser� que voc� poderia ir"
				+"<br/>� cidade comprar um incenso "
				+"<br/>para levarmos ao seu pai? Ele"
				+"<br/>adorava us�-los em suas "
				+"<br/>medita��es. Tenho certeza de"
				+"<br/>que ele ir� gostar."
				+"</html>";
		linhas[4] = 7;
		
		tx[5] = "<html>Voc� sai de casa rumo ao mercado da"
				+"<br/>cidade. Por morar em um local"
				+"<br/>isolado, leva cerca de uma hora para"
				+"<br/>chegar ao local."
				+"</html>";
		linhas[5] = 3;
		
		tx[6] = "<html>Vendedor de incensos:"
				+"<br/><br/>Ol�, faz tempo que n�o"
				+"<br/>te vejo. O que deseja levar dessa "
				+"<br/>vez? "
				+"</html>";
		linhas[6] = 4;
		
		tx[7] = "<html>Voc� explica que quer comprar"
				+"<br/>incensos para levar ao t�mulo de seu"
				+"<br/>pai."
				+"</html>";
		linhas[7] = 2;
		
		tx[8] = "<html>Vendedor de incensos:"
				+"<br/><br/>Ah sim, seu pai. Sinto falta"
				+"<br/>dele, era um bom homem. Morreu de"
				+"<br/>forma honrosa lutando contra seus."
				+"<br/>inimigos."
				+"</html>";
		linhas[8] = 5;
		
		tx[9] = "<html>Vendedor de incensos:"
				+"<br/><br/>Aqueles malditos imperiais "
				+"<br/>continuam querendo nossos "
				+"<br/>territ�rios. Tenho ouvido rumores de "
				+"<br/>que eles planejam atacar nossa "
				+"<br/>cidade novamente em breve. Voc�"
				+"<br/>deveria fugir daqui com sua fam�lia o "
				+"<br/>quanto antes."
				+"</html>";
		linhas[9] = 8;
		
		tx[10] = "<html>H� alguns segundos de sil�ncio. O"
				+"<br/>vendedor te entrega o incenso e tenta "
				+"<br/>cortar a tens�o."
				+"</html>";
		linhas[10] = 2;

		tx[11] = "<html>Vendedor de incensos:"
				+"<br/><br/>Olha, acho que exagerei "
				+"<br/>um pouco. N�o fique muito "
				+"<br/>preocupado com isso. Leve esse "
				+"<br/>incenso por minha conta, � meu "
				+"<br/>presente ao seu pai."
				+"</html>";
		linhas[11] = 6;

		tx[12] = "<html>Voc� agradece e sai da loja. Ainda � "
				+"<br/>manh�, h� poucas nuvens no c�u e "
				+"<br/>tudo indica que o dia ser� calmo "
				+"<br/>como sempre."
				+"</html>";
		linhas[12] = 3;
		
		tx[13] = "<html>Ap�s uma longa caminhada voc� "
				+"<br/>come�a a se aproximar de casa. Algo "
				+"<br/>n�o parece certo. H� um forte cheiro "
				+"<br/>de queimado no ar e uma grande "
				+"<br/>nuvem de fuma�a vinda da dire��o da "
				+"<br/>casa."
				+"</html>";
		linhas[13] = 5;
		
		tx[14] = "<html>Ao chegar mais perto, voc� v� as "
				+"<br/>chamas consumirem tudo. A casa "
				+"<br/>come�a a desabar e sua vis�o "
				+"<br/>come�a a ficar turva."
				+"</html>";
		linhas[14] = 3;
		
		tx[15] = "<html>Voc� escuta os gritos de sua m�e e o "
				+"<br/>choro de sua irm�, que s�o "
				+"<br/>bruscamente interrompidos, seguidos"
				+"<br/>de uma risada s�dica."
				+"</html>";
		linhas[15] = 3;

		tx[16] = "<html>Tudo que se pode ver s�o vultos de "
				+"<br/>v�rios homens ao longe. Voc� perde "
				+"<br/>toda a no��o e cai de joelhos, "
				+"<br/>completamente paralisado."
				+"</html>";
		linhas[16] = 3;
		
		tx[17] = "<html>Algu�m te agarra pelas costas e "
				+"<br/>come�a a te arrastar"
				+"</html>";
		linhas[17] = 1;
		
		continuar(t1,tx[1],linhas[1],18,1); //Realiza a a��o do bot�o
	}
	
	public void continuar(Texto t,String txt, int x, int max,int cont) {
		
		int c;
		c = cont + 1;
		
		t.getContinuar().addActionListener( new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				
				t.getTexto().dispose();
            	if(cont<max) { // Verifica se ainda h� mais textos por vir
            		continuar(new Texto(txt,x),tx[c],linhas[c],max,c);//Recursividade para chamar o pr�ximi texto
            	}
            	else
            		new Mapa1().mostraMapa();
            } });
    }
	
}
