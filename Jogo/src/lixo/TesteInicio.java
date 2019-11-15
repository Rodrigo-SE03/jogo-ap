package lixo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import graficos.Texto;
import menus.Formulario;

public class TesteInicio {
	
		private Texto t1;
		private String[] tx = new String[23]; //Strings com os textos a serem mostrados
		private int[] linhas = new int[23]; //Quantidade de pula linha em cada texto
		
		public TesteInicio() {
			
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
			
			//Fim do sonho 
			
			tx[18] = "<html>Você acorda lentamente, ainda  "
					+"<br/>abalado pelo pesadelo. Havia se"
					+"<br/>passado apenas uma semana desde"
					+"<br/>o ocorrido. Você está na parte de trás"
					+"<br/>de uma carroça guiada pelo homem "
					+"<br/>que o salvou no momento da "
					+"<br/>destruição. Em todo esse tempo não "
					+"<br/>houve nenhuma conversa além do "
					+"<br/>necessário entre vocês."
					+"</html>";
			linhas[18] = 8;
			
			tx[19] = "<html>A carroça para. Você escuta o homem "
					+"<br/>descendo e conversando algo com "
					+"<br/>alguém. Você desce da carroça."
					+"</html>";
			linhas[19] = 2;
			
			tx[20] = "<html>Cocheiro:"
					+"<br/><br/>Essa é a pessoa de quem eu "
					+"<br/>falei. Sua família foi morta pelos "
					+"<br/>soldados imperiais e ele está "
					+"<br/>desabrigado. Vocês aceitam"
					+"<br/>refugiados não é? Pois então, pode"
					+"<br/>ficar."
					+"</html>";
			linhas[20] = 7;
			
			tx[21] = "<html>O homem volta para a carroça sem te "
					+"<br/>falar mais uma palavra sequer e vai "
					+"<br/>embora. O guarda com quem ele "
					+"<br/>conversava se dirige a você."
					+"</html>";
			linhas[21] = 3;
			
			tx[22] = "<html>Guarda: "
					+"<br/><br/>Olá, você é muito bem vindo "
					+"<br/>em nossa cidade. Para entrar basta "
					+"<br/>preencher esse formulário."
					+"</html>";
			linhas[22] = 4;
			
			
			ActionListener continuar = new ActionListener() {
				int cont=0;
				public void actionPerformed(ActionEvent actionEvent) {
		            if(cont<22) { // Verifica se ainda há mais textos por vir
		            	cont++;
		            	t1.atualizaTexto(tx[cont],linhas[cont]);
		            }
		            else {
		            	t1.getTexto().dispose();
		            	new Formulario();
		        
		            }
				}
			};
		            
		    t1.getContinuar().addActionListener(continuar);
			
		}
	}

