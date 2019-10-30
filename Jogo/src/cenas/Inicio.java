package cenas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import graficos.Texto;
import menus.Menu_inicial;
public class Inicio {
	
	Texto t1;
	String[] tx = new String[19]; //Strings com os textos a serem mostrados
	int[] linhas = new int[19]; //Quantidade de pula linha em cada texto
	
	public Inicio() {
		
		// Textos a serem mostrados nas caixas de texto
		
		t1 = new Texto("<html>O dia amanheceu. Voce acorda e se"
				+ "<br/>levanta de sua cama e sai de seu"
				+ "<br/> quarto.</html>",2);
		
		tx[1] = "<html>Mãe:"
				+"<br/><br/> Bom dia meu bem! Achei que"
				+"<br/>não ia mais levantar hoje. Já passou "
				+"<br/>das sete da manhã. Venha logo tomar "
				+"<br/>café."
				+"</html>";
		linhas[1] = 5;
		
		tx[2] = "<html>Você come tranquilamente"
				+"<br/>enquanto observa sua pequena "
				+"<br/>irmã brincando com bonecas de  "
				+"<br/>pano no chão. O dia está  "
				+"<br/>agradável."
				+"</html>";
		linhas[2] = 4;
		
		
		tx[3] = "<html>Mãe:"
				+"<br/><br/>Hoje completa um ano da  "
				+"<br/>morte de seu pai. Vamos ao "
				+"<br/>cemitério visitá-lo mais tarde."
				+"</html>";
		linhas[3] = 4;
		
		
		tx[4] = "<html>Mãe:"
				+"<br/><br/>Será que você poderia ir"
				+"<br/>à cidade comprar um incenso "
				+"<br/>para levarmos ao seu pai? Ele"
				+"<br/>adorava usá-los em suas "
				+"<br/>meditações. Tenho certeza de"
				+"<br/>que ele irá gostar."
				+"</html>";
		linhas[4] = 7;
		
		tx[5] = "<html>Você sai de casa rumo ao mercado da"
				+"<br/>cidade. Por morar em um local"
				+"<br/>isolado, leva cerca de uma hora para"
				+"<br/>chegar ao local."
				+"</html>";
		linhas[5] = 3;
		
		tx[6] = "<html>Vendedor de incensos:"
				+"<br/><br/>Olá, faz tempo que não"
				+"<br/>te vejo. O que deseja levar dessa "
				+"<br/>vez? "
				+"</html>";
		linhas[6] = 4;
		
		tx[7] = "<html>Você explica que quer comprar"
				+"<br/>incensos para levar ao túmulo de seu"
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
				+"<br/>territórios. Tenho ouvido rumores de "
				+"<br/>que eles planejam atacar nossa "
				+"<br/>cidade novamente em breve. Você"
				+"<br/>deveria fugir daqui com sua família o "
				+"<br/>quanto antes."
				+"</html>";
		linhas[9] = 8;
		
		tx[10] = "<html>Há alguns segundos de silêncio. O"
				+"<br/>vendedor te entrega o incenso e tenta "
				+"<br/>cortar a tensão."
				+"</html>";
		linhas[10] = 2;

		tx[11] = "<html>Vendedor de incensos:"
				+"<br/><br/>Olha, acho que exagerei "
				+"<br/>um pouco. Não fique muito "
				+"<br/>preocupado com isso. Leve esse "
				+"<br/>incenso por minha conta, é meu "
				+"<br/>presente ao seu pai."
				+"</html>";
		linhas[11] = 6;

		tx[12] = "<html>Você agradece e sai da loja. Ainda é "
				+"<br/>manhã, há poucas nuvens no céu e "
				+"<br/>tudo indica que o dia será calmo "
				+"<br/>como sempre."
				+"</html>";
		linhas[12] = 3;
		
		tx[13] = "<html>Após uma longa caminhada você "
				+"<br/>começa a se aproximar de casa. Algo "
				+"<br/>não parece certo. Há um forte cheiro "
				+"<br/>de queimado no ar e uma grande "
				+"<br/>nuvem de fumaça vinda da direção da "
				+"<br/>casa."
				+"</html>";
		linhas[13] = 5;
		
		tx[14] = "<html>Ao chegar mais perto, você vê as "
				+"<br/>chamas consumirem tudo. A casa "
				+"<br/>começa a desabar e sua visão "
				+"<br/>começa a ficar turva."
				+"</html>";
		linhas[14] = 3;
		
		tx[15] = "<html>Você escuta os gritos de sua mãe e o "
				+"<br/>choro de sua irmã, que são "
				+"<br/>bruscamente interrompidos, seguidos"
				+"<br/>de uma risada sádica."
				+"</html>";
		linhas[15] = 3;

		tx[16] = "<html>Tudo que se pode ver são vultos de "
				+"<br/>vários homens ao longe. Você perde "
				+"<br/>toda a noção e cai de joelhos, "
				+"<br/>completamente paralisado."
				+"</html>";
		linhas[16] = 3;
		
		tx[17] = "<html>Alguém te agarra pelas costas e "
				+"<br/>começa a te arrastar"
				+"</html>";
		linhas[17] = 1;
		
		continuar(t1,tx[1],linhas[1],18,1); //Realiza a ação do botão
	}
	
	public void continuar(Texto t,String txt, int x, int max,int cont) {
		
		int c;
		c = cont + 1;
		
		t.getContinuar().addActionListener( new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				
				t.getTexto().dispose();
            	if(cont<max) { // Verifica se ainda há mais textos por vir
            		continuar(new Texto(txt,x),tx[c],linhas[c],max,c);//Recursividade para chamar o próximi texto
            	}
            	else;
            } });
    }
	
}
