package bibliotecas;

public class Biblio_Assassin extends Biblioteca {

	/*
	 * 
	 * Lista de acentos (evita que bugue ao mandar pro GitKraken)
	 * 
	 * \u00E7 ç
	 * 
	 * \u00E0 à  \u00E1 á \u00E2 â \u00E3 ã \u00C1 Á
	 * 
	 * \u00EA ê \u00E9 é \u00C9 É
	 * 
	 * \u00ED í
	 * 
	 * \u00FA ú
	 * 
	 * \u00F3 ó \u00F4 ô \u00F5 õ
	 * 
	 */

	public void hpAssassin() {
		tx = new String[18];
		linhas = new int[18];

		tx[0] = "<html>Quinze anos se passaram desde que" + "<br/>Voc\u00EA se juntou \u00E0 Guilda Vigilante."
				+ "<br/>Voc\u00EA se tornou um membro " + "<br/>valioso, um assassino  r\u00E1pido e eficiente,  "
				+ "<br/>completou in\u00FAmeras miss\u00F5es, deixou " + "<br/>in\u00FAmeros cad\u00E1veres."
				+ "<html>";
		linhas[0] = 5;

		tx[1] = "<html>" + "<br/>Em todos esses anos as pessoas da Ordem"
				+ "<br/>se tornaram sua fam\u00EDlia, em especial "
				+ "<br/>Cassius, ele foi um irm\u00E3o mais velho, um"
				+ "<br/>amigo e um mentor para voc\u00EA. Te ajudou" + "<br/>a superar a morte da sua fam\u00EDlia e a"
				+ "<br/>destrui\u00E7\u00E3o de seu lar, te ofereceu uma" + "<br/>nova casa e uma nova fam\u00EDlia."
				+ "<html>";
		linhas[1] = 7;

		tx[2] = "<html>Hoje foi marcada uma reuni\u00E3o com " + "<br/>todos os membros da Guilda."
				+ "<br/>Isso n\u00E3o \u00E9 um bom sinal," + "<br/> geralmente significam ou morte"
				+ "<br/> ou problemas, mas, hoje em" + "<br/>especial, parece significar os dois" + "<html> ";
		linhas[2] = 5;

		tx[3] = "<html>" + "<br/>Os diversos membros come\u00E7am a se "
				+ "<br/>juntar e o l\u00EDder da Guilda, por defini\u00E7\u00E3o,"
				+ "<br/> o membro mais antigo vivo, Homero," + "<br/>come\u00E7a a falar:" + "<html>";
		linhas[3] = 4;

		tx[4] = "<html>Homero:" + "<br/><br/>Durante muito tempo vivemos em um"
				+ "<br/>per\u00EDodo de relativa paz. Tivemos nossos"
				+ "<br/>conflitos internos e externos, \u00E9 claro, mas"
				+ "<br/>nunca enfrentamos amea\u00E7a que pudesse"
				+ "<br/>nos dizimar. Hoje a situa\u00E7\u00E3o \u00E9 diferente,"
				+ "<br/>pela primeira vez todos n\u00F3s corremos o" + "<br/>risco de sermos dizimados." + "<html>";
		linhas[4] = 8;

		tx[5] = "<html>Todos come\u00E7am a se agitar e debater o" + "<br/>que Homero estava dizendo, afinal, que"
				+ "<br/>amea\u00E7a poderia ser t\u00E3o grande para"
				+ "<br/>destruir toda a Guilda? No passado voc\u00EAs"
				+ "<br/>j\u00E1 tinham tido in\u00FAmeros conflitos com a" + "<br/>Guarda Real, mas nenhum representou"
				+ "<br/>amea\u00E7a t\u00E3o grande." + "<html>";
		linhas[5] = 6;

		tx[6] = "<html>Homero:" + "<br/><br/>SILÊNCIO!" + "<br/>Eu sei que todos est\u00E3o preocupados com "
				+ "<br/>o que acabei de dizer, mas pelo menos me" + "<br/>deixem terminar antes de pensar"
				+ "<br/>qualquer coisa est\u00FApida." + "<html>";
		linhas[6] = 6;

		tx[7] = "<html>O sil\u00EAncio aos poucos volta," + "<br/>permitindo Homero continuar." + "<html>";
		linhas[7] = 1;

		tx[8] = "<html>Homero:" + "<br/><br/>O Imp\u00E9rio de Bethesda declarou guerra"
				+ "<br/>contra Helaria na noite de ontem." + "<br/>Bethesda \u00E9 conhecido por destruir"
				+ "<br/>qualquer um que esteja em seu caminho,"
				+ "<br/>cidades s\u00E3o queimadas, popula\u00E7\u00F5es s\u00E3o" + "<html>";
		linhas[8] = 6;

		tx[9] = "<html>Homero:" + "<br/><br/>destru\u00EDdas e culturas apagadas, e, \u00E9 isso"
				+ "<br/>que acontecer\u00E1 com Helaria se n\u00E3o" + "<br/>fizermos nada." + "<html>";
		linhas[9] = 4;

		tx[10] = "<html>Um homem irritado:" + "<br/><br/>  Mas por que n\u00F3s far\u00EDamos"
				+ "<br/> alguma coisa por Helaria" + "<br/>se Helaria nunca fez nada por n\u00F3s?!" + "<html>";
		linhas[10] = 4;

		tx[11] = "<html>Voc\u00EA:" + "<br/><br/> Porque n\u00F3s vivemos aqui seu imbecil!" + "<html>";
		linhas[11] = 2;

		tx[12] = "<html>Voc\u00EA retruca com ferocidade," + "<br/>afinal foi Bethesda que"
				+ "<br/>destruiu sua vila, queimou sua casa e" + "<br/>matou sua fam\u00EDlia." + "<html>";
		linhas[12] = 3;

		tx[13] = "<html>Pelo seu tom ficou claro para todos que " + "<br/>conhecem um pouco da sua hist\u00F3ria que "
				+ "<br/>voc\u00EA est\u00E1 disposto a tudo para " + "<br/>obter vingan\u00E7a." + "<html>";
		linhas[13] = 3;

		tx[14] = "<html>Homero:" + "<br/><br/>Percebo que" + "<br/>posso contar com voc\u00EA nessa guerra,<br/>"
				+ player.getNome() + "." + "<html>";
		linhas[14] = 4;

		tx[15] = "<html>A reuni\u00E3o continua por mais um tempo," + "<br/>detalhes da guerra s\u00E3o discutidos e"
				+ "<br/>esclarecidos. O Imp\u00E9rio de Bethesda est\u00E1"
				+ "<br/>marchando em dire\u00E7\u00E3o a Helaria e tem"
				+ "<br/>previs\u00E3o de chegar dentro de tr\u00EAs dias." + "<html>";
		linhas[15] = 4;

		tx[16] = "<html>Nesse per\u00EDodo voc\u00EA ser\u00E1 apresentado \u00E0"
				+ "<br/>algumas miss\u00F5es e poder\u00E1 completar" + "<br/>uma parte delas, mas lembre-se que elas"
				+ "<br/>ter\u00E3o consequ\u00EAncias, ent\u00E3o escolha bem"
				+ "<br/>quais voc\u00E9 ir\u00E1 fazer, pois assim que uma"
				+ "<br/>miss\u00E3o for iniciada, voc\u00EA n\u00E3o poder\u00E1"
				+ "<br/>iniciar outra at\u00E9 que termine a primeira." + "<html>";
		linhas[16] = 6;
		tx[17] = "<html>No final da reunião Cassius" + "<br/>te chama para conversar." + "<html>";
		linhas[17] = 1;

		choice = "<html>Cassius:" + "<br/><br/>Voc\u00EA est\u00E1 bem?" + "<html>";
		op1 = "Mentir";
		op2 = "Dizer a verdade";
	}

	public void Escolha1Assassin(int a) {
		tx = new String[10];
		linhas = new int[10];

		switch (a) {
		case 1://mentir
			tx[0] = "<html>Voc\u00EA:" + "<br/><br/>Estou bem, nenhum problema com isso." + "<html>";
			linhas[0] = 2;

			tx[1] = "<html>Cassius:" + "<br/><br/>Fico feliz de ouvir isso." + "<html>";
			linhas[1] = 2;
			break;
		case 2://dizer a verdade
			tx[0] = "<html>Voc\u00EA:" + "<br/><br/>Não estou confortável com Bethesda,"
					+ "<br/>mas isso não atrapalhará minha luta" + "<html>";
			linhas[0] = 3;

			tx[1] = "<html>Cassius:" + "<br/><br/>Fique tranquilo, nós vamos passar por " + "<br/>isso juntos."
					+ "<html>";
			linhas[1] = 3;
			break;
		}
		tx[2] = "<html>Voc\u00EA:" + "<br/><br/>Mas não foi só para ver como" + "<br/>estou que você me chamou aqui"
				+ "<html>";
		linhas[2] = 3;

		tx[3] = "<html>Cassius:" + "<br/><br/>Eu preciso que você recrute" + "<br/>algumas pessoas para nos ajudar."
				+ "<html>";
		linhas[3] = 3;

		tx[4] = "<html>Voc\u00EA:" + "<br/><br/>Quem?" + "<html>";
		linhas[4] = 2;

		tx[5] = "<html>Cassius:" + "<br/><br/>Ariandra, a Elfa arqueira que"
				+ "<br/>recentemente chegou em Helaria, ela vive" + "<br/>na Casa Nobre Letos, o Anão, que "
				+ "<br/>está preso dentro da Catedral. " + "<br/>E Terraira, uma sacerdotisa da<br/>Torre Arcana."
				+ "<html>";
		linhas[5] = 7;

		tx[6] = "<html>Voc\u00EA:" + "<br/><br/>E por que o interesse" + "<br/>nessas pessoas em específico?"
				+ "<html>";
		linhas[6] = 3;

		tx[7] = "<html>Cassius:" + "<br/><br/>Eles são os melhores no que" + "<br/>fazem e nós vamos montar um pequeno"
				+ "<br/> grupo para atacar os acampamentos" + "<br/>de Bethesda antes da guerra começar." + "<html>";
		linhas[7] = 5;

		tx[8] = "<html>Voc\u00EA:" + "<br/><br/>Entendo." + "<html>";
		linhas[8] = 2;

		tx[9] = "<html>Jogador agora você terá três opções" + "<br/>de locais para ir,"
				+ "<br/>faça sua escolha com sabedoria. " + "<html>";
		linhas[9] = 2;
	}

	public void CasaNobreAssassin() {
		tx = new String[2];
		linhas = new int[2];

		tx[0] = "<html>Você chega nas proximidades da Casa" + "<br/>Nobre, mas ela é extremamente vigiada,"
				+ "<br/>entrar pela porta da frente" + "<br/>é impossível." + "<br/>Tem um sistema de esgotos que"
				+ "<br/>talvez possa te" + "<br/>levar para dentro dela," + "<br/>você decide usá-lo. " + "<html>";
		linhas[0] = 7;

		tx[1] = "<html>Os esgotos são úmidos e imundos" + "<br/>e a travessia é cansativa, mas você"
				+ "<br/>entra nas fronteiras da casa." + "<br/>Você continua prosseguindo até chegar "
				+ "<br/>no ponto em que deve sair,no entanto" + "<br/> uma porta impede seu caminho. " + "<html>";
		linhas[1] = 5;

	}

	public void EnigmaPortaAssasin(int x) {
		switch (x) {
		case 1:// se acertar
			tx = new String[1];
			linhas = new int[1];

			tx[0] = "<html>A porta se abre e voc\u00EA consegue" + "<br/>entrar dentro da casa."
					+ "<br/>Ariandra est\u00E1 no quarto de h\u00F3spedes e \u00E9"
					+ "<br/>para l\u00E1 que com cautela voc\u00EA se encaminha."
					+ "<br/>A porta do quarto est\u00E1 aberta" + "<br/>e voc\u00EA entra."
					+ "<br/>Uma flecha voa na sua dire\u00E7\u00E3o,"
					+ "<br/>mas voc\u00EA consegue desviar por pouco. " + "<html>";
			linhas[0] = 7;
			choice = "<html>Ariandra:" + "<br/><br/>Quem \u00E9 voc\u00EA e o que quer aqui?" + "<html>";
			op1 = "Cassius me mandou.";
			op2 = "Sou " + player.getNome() + " e vim pedir sua ajuda.";
			break;
		case 2:// se errar
			tx[0] = "<html>A porta n\u00E3o se abre e um alarme" + "<br/>\u00E9 disparado, \u00E9 melhor voc\u00EA ir "
					+ "<br/>embora antes que seja capturado." + "<br/>O tempo passa e voc\u00EA"
					+ "<br/>pode tentar outra vez ou em outro local." + "<html>";
			linhas[0] = 4;
		}
	}

	public void OQueVoceQuerAssassin(int x) {
		tx = new String[2];
		linhas = new int[2];

		switch (x) {
		case 1://cassius me mandou
			tx[0] = "<html>Ariandra:\" + \"<br/><br/>Cassius?"
					+ "<html>";
	      linhas[0] =2;
	      
	      tx[1] = "<html>Voc\u00EA:\" + \"<br/><br/>Membro da Guilda Vigilante,"
	    		    + "<br/>ele me mandou para"  
	    		    + "<br/>pedir sua ajuda."  
					+ "<html>";
	      linhas[1] =4;
	      
	      choice = "<html>Ariandra:" + "<br/><br/>E que ajuda eu poderia oferecer a Cassius?" + "<html>";
			op1 = "Voc\u00EA \u00E9 uma ex\u00EDmia arqueira, que ajuda n\u00E3o poderia oferecer?";
			op2 = "Bethesda est\u00E1 se aproximando, ele quer sua ajuda para lutar.";
			break;
		case 2://sou...
			tx[0] = "<html>Ariandra:\" + \"<br/><br/>Ajuda para que??"
					+ "<html>";
	      linhas[0] =2;
	      
	      tx[1] = "<html>Voc\u00EA:\" + \"<br/><br/>Bethesda est\u00E1 se aproximando"
	    		    + "<br/>de Helaria e com seu talento podemos"  
	    		    + "<br/>er uma chance de vencer."  
					+ "<html>";
	      linhas[1] =4;
	      
	      choice = "<html>Ariandra:" + "<br/><br/>Por que eu deveria me importar com isso?" + "<html>";
			op1 = "Algu\u00E9m com quem voc\u00EA se importa.";
			op2 = "N\u00E3o se importa com todas as vidas perdidas?";
			break;
		}
	}

	public void CassiusmeMandou(int x) {
		tx = new String[9];
		linhas = new int[9];
		switch (x) {
		case 1://voce é uma...
			tx[0] = "<html>Ela baixa um pouco a guarda"
					 + "<br/>e afrouxa a corda do arco."  
					+ "<html>";
			linhas[1] = 3;

			tx[2] = "<html>Voc\u00EA:" + "<br/><br/>N\u00F3s estamos formando um?"
					+ "<br/>pequeno grupo para proteger Helaria"
					+ "<br/>Sua participa\u00E7\u00E3o ser\u00E1 de grande valor." + "<html>";
			linhas[2] = 4;

			tx[3] = "<html>Ariandra:" + "<br/><br/>Quem mais" + "<br/>est\u00E1 nesse grupo?" + "<html>";
			linhas[3] = 3;

			tx[4] = "<html>Voc\u00EA:" + "<br/><br/>O an\u00E3o Letos," + "<br/>a sacerdotisa Terraira, Cassius e eu."
					+ "<html>";
			linhas[4] = 3;

			tx[5] = "<html>Ariandra:" + "<br/><br/>Voc\u00EA conseguiu reunir" + "<br/>um grupo e tanto"
					+ "<br/>E suas habilidades tamb\u00E9m n\u00E3o" + "<br/>s\u00E3o porcas, n\u00E3o \u00E9 qualquer"
					+ "<br/>um que consegue desviar" + "<br/>das minhas flechas." + "<html>";
			linhas[5] = 7;

			tx[6] = "<html>Voc\u00EA:" + "<br/><br/>Ent\u00E3o voc\u00EA est\u00E1 dentro?" + "<html>";
			linhas[6] = 2;

			tx[7] = "<html>Ariandra:" + "<br/><br/>Pode contar comigo" + "<html>";
			linhas[7] = 2;

			tx[8] = "<html>O dia termina e voc\u00EA volta" + "<br/>para a Alameda dos"
					+ "<br/>Tr\u00EAs Ponteiros, vit\u00F3ria." + "<html>";
			linhas[8] = 2;

			break;
		case 2://Bethesheda está chegando
			
	      choice = "<html>Ariandra:" + "<br/><br/>Essa guerra \u00E9 imposs\u00EDvel. Voc\u00EA est\u00E1 louco?" + "<html>";
			op1 = "\u00C9 loucura querer proteger sua cidade? Se for ent\u00E3o estou louco.";
			op2 = "Suas habilidades s\u00E3o \u00FAnicas, com sua ajuda podemos vencer.";
	      break;}
	}
		
		public void voceEstaLouco(int x) {
			switch (x)
			{
			case 1://locura querer protegr a cidade?
				tx = new String[5];
				linhas = new int[5];
				 tx[0] =  "<html>Ariandra:" + "<br/><br/>Voc\u00EA tem determina\u00E7\u00E3o, mas s\u00F3 isso"
						 + "<br/>n\u00E3o \u00E9 suficiente."  
						 + "<br/>Qual \u00E9 seu plano?"  
			    		  + "<html>";
			      linhas[0] =2;
			      
			      tx[1] =  "<html> Voc\u00EA:" + "<br/><br/>N\u00F3s estamos montando um pequeno"
							 + "<br/>grupo para atacar os acampamentos de Bethesda"  
							 + "<br/>antes da guerra iniciar diminuindo"  
							 + "<br/>suas for\u00E7as. Esse \u00E9 o plano."  
				    		  + "<html>";
				      linhas[1] =2;
				      
				      tx[2] =  "<html>Ariandra:" + "<br/><br/>Quem est\u00E1 nesse grupo?"
					    		  + "<html>";
					      linhas[2] =2;
					      
					      tx[3] =  "<html> Voc\u00EA:" + "<br/><br/>Eu, Cassius, o an\u00E3o Letos"
									 + "<br/>e a sacerdotisa Terraira." 
						    		  + "<html>";
						      linhas[3] =3;
						      
						      tx[3] =  "<html> Ariandra:" + "<br/><br/>\u00C9 um grupo de peso."
										 + "<br/>Tudo bem, pode contar comigo." 
							    		  + "<html>";
							      linhas[3] =3;
							      
							      tx[4] = "<html>O dia termina e voc\u00EA volta"
											 + "<br/>para a Alameda dos"  
											 + "<br/>Tr\u00EAs Ponteiros, vit\u00F3ria."  
											+ "<html>";
							      linhas[4] =2;   
			      break;
			case 2://suas habilidades são unicas
				tx = new String[2];
				linhas = new int[2];
				
				 tx[0] =  "<html> Ariandra:" + "<br/><br/>Caso voc\u00EA n\u00E3o saiba eu estou"
						 + "<br/>aposentada, n\u00E3o fa\u00E7o mais esse tipo" 
						 + "<br/>de servi\u00E7o. Agora v\u00E1 embora"  
						 + "<br/>antes que eu me enfure\u00E7a." 
			    		  + "<html>";
			      linhas[0] =5;
			      
			      tx[1] = "<html>O dia acaba e voc\u00EA volta para"
							 + "<br/>a Alameda dos Tr\u00EAs Ponteiros,"  
							 + "<br/>mas sem a ajuda de Ariandra."  
							+ "<html>";
			      linhas[4] =2;  
			      break;
			}
		}
		
		public void porqueDeveriaMeImportar(int x) {
			switch (x) {
			
			case 1://alguem com quem voce se importa
				
			tx = new String[5];
			linhas = new int[5];
			
			tx[0] =  "<html> Voc\u00EA:" + "<br/><br/>Porque tem algu\u00E9m aqui com"
					 + "<br/>quem voc\u00EA se importa, que" 
					 + "<br/>mesmo que voc\u00EAs fossem embora, esse algu\u00E9m"  
					 + "<br/>nunca esqueceria seu lar perdido de Helaria." 
		    		  + "<html>";
		      linhas[0] =5;
		      
		      tx[1] =  "<html> Ariandra:" + "<br/><br/>Como voc\u00EA sabe disso?"
			    		  + "<html>";
			      linhas[1] =2;
			      
			      tx[2] =  "<html> Voc\u00EA:" + "<br/><br/>Eu n\u00E3o sei, apenas imaginei."
							 + "<br/>N\u00E3o \u00E9 qualquer pessoa que" 
							 + "<br/>consegue se hospedar nessa casa."  
				    		  + "<html>";
				      linhas[2] =4;
				      
				      tx[3] = "<html> Ariandra:" + "<br/><br/>Voc\u00EA est\u00E1 certo, eu lutarei"
				    		  + "<br/>por Helaria. Agora v\u00E1" 
				    		  + "<br/>embora antes que eu mude de ideia." 
		    		  + "<html>";
		      linhas[3] =4;
		      
		      tx[4] = "<html>O dia termina e voc\u00EA"
						 + "<br/>volta para a Alameda"  
						 + "<br/>dos Tr\u00EAs Ponteiros, vit\u00F3ria."  
						+ "<html>";
		      linhas[4] =2;  
		      break;
			case 2:// não se importa com as vidas perdidas
				tx = new String[5];
				linhas = new int[5];
				tx[0] =  "<html> Voc\u00EA:" + "<br/><br/>Voc\u00EA n\u00E3o se preocupa com"
						 + "<br/>todos que ir\u00E3o morrer, com o massacre" 
						 + "<br/>que acontecer\u00E1?" 
			    		  + "<html>";
			      linhas[0] =4;
			      
			      tx[1] =  "<html> Ariandra:" + "<br/><br/>Um massacre acontecer\u00E1 de qualquer"
			    		  + "<br/>forma, seja de um lado ou de outro." 
			    		  + "<br/>Agora v\u00E1 embora antes que eu me irrite." 
			    		  + "<html>";
			      linhas[1] =4;
			      
			      tx[2] = "<html>O dia termina e voc\u00EA"
							 + "<br/>volta para a Alameda"  
							 + "<br/>dos Tr\u00EAs Ponteiros, mas"  
							 + "<br/>sem a ajuda de Ariandra." 
							+ "<html>";
			      linhas[2] =3;     
			      break;}
		}
			
			public void TorreArcanaAssassin() {
				tx = new String[18];
				linhas = new int[18];
				 tx[0] = "<html>Voc\u00EA pega seu caminho para a"
						 + "<br/>Torre Arcana e consegue"  
						 + "<br/>entrar sem problemas."  
						 + "<br/>\u00C9 recebido por dois arcanos de" 
						 + "<br/>baixo grau que perguntam" 
						 + "<br/>o que voc\u00EA quer." 
						+ "<html>";
		      linhas[0] =5;    
		      
		      tx[1] =  "<html> Voc\u00EA:" + "<br/><br/>Procuro a Sacerdotisa Terraira."
						 + "<br/>\u00C9 um assunto urgente que tenho" 
						 + "<br/>para falar com ela." 
			    		  + "<html>";
			      linhas[1] =4;
			      
			      tx[2] =  "<html> Arcanos:" + "<br/><br/>Ela est\u00E1 em seus aposentos."
							 + "<br/>\u00C9 s\u00F3 subir as escadas at\u00E9 o quarto" 
							 + "<br/>piso e virar no segundo quarto a esquerda." 
				    		  + "<html>";
				      linhas[2] =4;
				      
				      tx[3] =  "<html> Voc\u00EA:" + "<br/><br/>Obrigado."
					    		  + "<html>";
					      linhas[3] =2;
					      
					      tx[4] = "<html>Voc\u00EA pega o caminho que te"
									 + "<br/>informaram e chega em um quarto"  
									 + "<br/>com a porta fechada,"  
									 + "<br/>voc\u00EA bate na porta e ela se abre." 
									+ "<html>";
					      linhas[4] =3;    
					      
					      tx[5] =  "<html> Uma mulher que voc\u00EA julga ser Terraira<br/> diz:" + "<br/><br/>Bem-vindo,"+player.getNome()
						    		  + "<html>";
						      linhas[5] =3;
						      
						      tx[6] =  "<html> Voc\u00EA:" + "<br/><br/>Como voc\u00EA sabe meu nome?"
						    		  + "<html>";
						      linhas[6] =2;
						      
						      tx[7] =  "<html> Terraira:" + "<br/><br/>Eu sou uma sacerdotisa,"
						    		  + "<br/>sei muitas coisas."  
						    		  + "<br/>Agora vem a quest\u00E3o do"  
						    		  + "<br/>que voc\u00EA quer aqui."  
						    		  + "<html>";
						      linhas[7] =5;
						      
						      tx[8] =  "<html> Voc\u00EA:" + "<br/><br/>Eu preciso..."
						    		  + "<html>";
						      linhas[8] =2;
						      
						      tx[9] =  "<html> Terraira:" + "<br/><br/>Eu sei o que voc\u00EA quer"
						    		  + "<br/>e o que voc\u00EA precisa,"  
						    		  + "<br/>eu sei da guerra, mas por que eu deveria te"  
						    		  + "<br/>ajudar ao inv\u00E9s de"  
						    		  + "<br/>lutar com os meus?"  
						    		  + "<html>";
						      linhas[9] =6;
						      
						      
						      tx[10] =  "<html> Voc\u00EA:" + "<br/><br/>Porque n\u00F3s temos um plano para..."
						    		  + "<html>";
						      linhas[10] =2;
						      
						      tx[11] =  "<html> Terraira:" + "<br/><br/>Foi uma pergunta ret\u00F3rica."
						    		  + "<br/>Eu sei seus planos,"  
						    		  + "<br/>s\u00F3 n\u00E3o sei seu valor."  
						    		  + "<html>";
						      linhas[11] =4;
						      
						      tx[12] =  "<html> Voc\u00EA:" + "<br/><br/>O que voc\u00EA quer que eu fa\u00E7a?"
						    		  + "<html>";
						      linhas[12] =2;
						      
						      tx[13] =  "<html> Terraira:" + "<br/><br/>Finalmente fomos ao que interessa."
						    		  + "<br/>Se eu for lutar com voc\u00EA,"  
						    		  + "<br/>vou precisar que busque um livro para <br/>mim."  
						    		  + "<html>";
						      linhas[13] =5;
						      
						      tx[14] =  "<html> Voc\u00EA:" + "<br/><br/>Qual livro e onde?"
						    		  + "<html>";
						      linhas[14] =2;
						      
						      tx[15] =  "<html> Terraira:" + "<br/><br/>Mem\u00F3rias de Mago Esquecido."
						    		  + "<br/>\u00C9 um livro que cont\u00E9m"  
						    		  + "<br/>alguns feiti\u00E7os antigos."  
						    		  + "<br/>E, quanto ao local, ele est\u00E1 aqui,"  
						    		  + "<br/>em uma sala que cont\u00E9m um labirinto,"  
						    		  + "<br/>se voc\u00EA conseguir me trazer at\u00E9 o final"  
						    		  + "<br/>do dia eu me juntarei a voc\u00EA." 
						    		  + "<html>";
						      linhas[15] =8;
						      
						      tx[16] =  "<html> Voc\u00EA:" + "<br/><br/>Muito bem, ent\u00E3o pode se arrumar."
						    		  + "<html>";
						      linhas[16] =2;
						      
						      tx[17] =  "<html>  Terraira:" + "<br/><br/>\u00C9 o que veremos."
						    		  + "<html>";
						      linhas[17] =2;
						     			      
			}
			
			public void posLabirinto(int x) {
				switch (x){
				case 1://ganhar
					tx = new String[2];
					linhas = new int[2];
					
					 tx[0] =  "<html>  Terraira:" + "<br/><br/>Muito bem, voc\u00EA"
							 + "<br/>me provou suas capacidades,"  
							 + "<br/>eu irei contigo." 
				    		  + "<html>";
				      linhas[0] =4;
				      
				      tx[1] = "<html>O dia termina e voc\u00EA volta"
								 + "<br/>para a Alameda dos Tr\u00EAs"  
								 + "<br/>Ponteiros. Vit\u00F3ria."  
								+ "<html>";
				      linhas[1] =2;    
				      break;
				case 2://perder
					   tx[1] = "<html>Voc\u00EA sente uma forte dor de cabe\u00E7a"
								 + "<br/>e desmaia. Pouco depois "  
								 + "<br/>voc\u00EA acorda na enfermaria."  
								+ "<html>";
				      linhas[1] =2;    
				}
			}
			
			/*public void Catederal()
			{tx = new String[5];
			linhas = new int[5];
			
			 tx[0] = "<html>Voc\u00EA vai para os limites da Catedral"
					 + "<br/> at\u00E9 encontrar uma entrada para o"  
					 + "<br/> esgoto. Para algu\u00E9m como"  
					 + "<br/> voc\u00EA n\u00E3o existe "  
					 + "<br/> outro meio de acesso a"  
					 + "<br/> esse local, especialmente"  
					 + "<br/> a sua pris\u00E3o. "  
					+ "<html>";
			linhas[3] = 3;

			tx[3] = "<html> Ariandra:" + "<br/><br/>\u00C9 um grupo de peso." + "<br/>Tudo bem, pode contar comigo."
					+ "<html>";
	      linhas[1] =5;  
	      
	      tx[2] = "<html>se existir um inferno na Terra"
					 + "<br/> com certeza aqui"  
					 + "<br/> est\u00E1 pr\u00F3ximo, voc\u00EA pensa."  
					 + "<br/> Para entrar na ala"  
					 + "<br/> onde est\u00E3o as celas voc\u00EA "  
					 + "<br/> precisa passar por "
					 + "<br/> uma grande porta."
					+ "<html>";
	      linhas[2] =6;  
	      
	      tx[3] = "<html>Voc\u00EA se aproxima, pronto"
					 + "<br/> para destranc\u00E1-la, mas"  
					 + "<br/> ela j\u00E1 est\u00E1 aberta"  
					 + "<br/> e voc\u00EA entra. "  
					+ "<html>";
	      linhas[3] =3; 
	      
	      tx[4] = "<html>Uma enorme Hidra"
					 + "<br/>est\u00E1 guardando a sala e a porta"  
					 + "<br/>se fechou, para sobreviver"  
					 + "<br/>voc\u00EA precisa derrotar a Hidra."  
					+ "<html>";
	      linhas[4] =3; 
	     
			}*/
			
			public void posHidra(int x) {
				switch (x) {
				case 1://ganhar
				tx = new String[13];
				linhas = new int[13];
				tx[0] = "<html>Voc\u00EA consegue superar a"
						 + "<br/> Hidra e entrar na pris\u00E3o."  
						 + "<br/> Ela \u00E9 pouco vigiada, afinal"  
						 + "<br/> j\u00E1 tinha um monstro"  
						 + "<br/> guardando-a. Apenas um"  
						 + "<br/> guarda adormecido com as"  
						 + "<br/> chaves"  
						+ "<html>";
		      linhas[0] =6; 
		      
		      tx[1] = "<html>Furtivamente voc\u00EA vai at\u00E9 ele e se"
						 + "<br/> apropria delas e vai"  
						 + "<br/> em busca de Letos,"  
						 + "<br/>  An\u00E3o. Em uma cela "  
						 + "<br/> distante l\u00E1 est\u00E1 ele,"  
						 + "<br/> dormindo. Voc\u00EA o acorda."  
						+ "<html>";
		      linhas[1] =5; 
		      
		      tx[2] =  "<html> Voc\u00EA:" + "<br/><br/>Est\u00E1 interessado em"
		    		  + "<br/> ir embora deste inferno?"
		    		  + "<html>";
		      linhas[2] =3;
		      
		      tx[3] =  "<html> Letos:" + "<br/><br/>Com toda certeza,"
		    		  + "<br/> mas quem \u00E9 voc\u00EA?"
		    		  + "<html>";
		      linhas[3] =3;
		      
		      tx[4] =  "<html> Voc\u00EA:" + "<br/><br/>Sou um enviado de Cassius."
		    		  + "<br/> Precisamos da sua ajuda?"
		    		  + "<html>";
		      linhas[4] =3;
		      
		      tx[5] =  "<html> Letos:" + "<br/><br/>No que eu"
		    		  + "<br/> poderia ajudar?"
		    		  + "<html>";
		      linhas[5] =3;
		      
		      tx[6] =  "<html> Voc\u00EA:" + "<br/><br/>Voc\u00EA est\u00E1 preso por"
		    		  + "<br/>matar quinze pessoas numa"
		    		  + "<br/>briga de bar com um"
		    		  + "<br/>machado. Treze delas"
		    		  + "<br/>eram soldados altamente treinados"
		    		  + "<html>";
		      linhas[6] =6;
		      
		      tx[7] =  "<html> Letos:" + "<br/><br/>E o que voc\u00EAs"
		    		  + "<br/> querem que eu fa\u00E7a?"
		    		  + "<html>";
		      linhas[7] =3;
		      
		      tx[8] =  "<html> Voc\u00EA:" + "<br/><br/>Helaria ser\u00E1 invadida por"
		    		  + "<br/>Bethesda dentro de pouco"
		    		  + "<br/>tempo, n\u00F3s estamos montando"
		    		  + "<br/>um grupo para lutar contra"
		    		  + "<br/>e sua presen\u00E7a ser\u00E1 valiosa."
		    		  + "<html>";
		      linhas[8] =6;
		      
		      tx[9] =  "<html> Letos:" + "<br/><br/>E voc\u00EA s\u00F3 vai"
		    		  + "<br/>me libertar se eu"
		    		  + "<br/>me juntar a voc\u00EA?"
		    		  + "<html>";
		      linhas[9] =3;
		      
		      tx[10] =  "<html> Voc\u00EA:" + "<br/><br/>Precisamente."
		    		  + "<html>";
		      linhas[10] =2;
		      
		      tx[11] =  "<html> Letos:" + "<br/><br/>Muito bem,"
		    		  + "<br/>estou dentro. Afinal, o que"
		    		  + "<br/>eu tenho a perder?"
		    		  + "<html>";
		      linhas[11] =3;
		      
		      tx[12] = "<html>Voc\u00EA abre a cela."
						 + "<br/>O dia est\u00E1 terminando "  
						 + "<br/>e voc\u00EA retorna para "  
						 + "<br/>a Alameda dos Tr\u00EAs Ponteiros"  
						 + "<br/> com Letos, o An\u00E3o. Vit\u00F3ria."  
						+ "<html>";
		      linhas[12] =4; 
		      break;
		      
				}
			}
			
			public void finalAssassin()
			{tx = new String[5];
			linhas = new int[5];
				tx[0] = "<html>Termina o terceiro dia e"
					 + "<br/> voc\u00EA vai para seu quarto"  
					 + "<br/> descansar. Voc\u00EA s\u00F3 ter\u00E1"  
					 + "<br/> algumas poucas horas"  
					 + "<br/> de sono antes de"  
					 + "<br/> sa\u00EDrem para colocar"  
					 + "<br/> o plano em pr\u00E1tica,"  
					+ "<html>";
	      linhas[0] =6; 
	      
	      tx[1] = "<html>ent\u00E3o \u00E9 melhor"
					 + "<br/> fazer valer o tempo."  
					 + "<br/> Chega a hora e voc\u00EA"  
					 + "<br/> se levanta e se prepara."  
					 + "<br/> Voc\u00EAs se encontram"  
					 + "<br/>  em uma sa\u00EDda da cidade."  
					+ "<html>";
	      linhas[1] =5; 
	      
	      tx[2] = "<html>Seu grupo \u00E9 composto"
					 + "<br/>  por voc\u00EA, Cassius,"  
					 + "<br/>(aqueles que voc\u00EA conseguiu"  
					 + "<br/>recrutar), e dois"  
					 + "<br/> outros assassinos." 
					+ "<html>";
	      linhas[2] =4; 
	      
	      tx[3] = "<html>Furtivamente voc\u00EAs saem"
					 + "<br/>da cidade e se encaminham"  
					 + "<br/>para o acampamento inimigo"  
					 + "<br/> enquanto todos est\u00E3o dormindo"  
					 + "<br/>No acampamento voc\u00EAs" 
					 + "<br/>pretendem causar um inc\u00EAndio."  
					+ "<html>";
	      linhas[3] =5; 
	      
	      tx[3] = "<html>O inc\u00EAndio tem in\u00EDcio"
					 + "<br/>e as tropas come\u00E7am a acordar."  
					 + "<br/>Seu objetivo \u00E9 garantir que elas"  
					 + "<br/> fiquem o m\u00E1ximo poss\u00EDvel"  
					 + "<br/>no foco do fogo para" 
					 + "<br/>que pere\u00E7am"  
					+ "<html>";
	      linhas[3] =5; 
				
	      tx[4] = "<html>todos voc\u00EAs retiram"
					 + "<br/>suas armas e come\u00E7a"  
					 + "<br/>a primeira batalha da guerra."  
					+ "<html>";
	      linhas[4] =2 ; 
			}
			
			public void derrotaSemBonus() {
				tx = new String[4];
				linhas = new int[4];
					tx[0] = "<html>S\u00E3o muitos soldados"
						 + "<br/>e voc\u00EAs n\u00E3o conseguem"  
						 + "<br/>cont\u00EA-los. Eles conseguem"  
						 + "<br/>fugir do inc\u00EAndio"  
						 + "<br/>quase intactos e est\u00E3o"  
						 + "<br/>prontos para a guerra."  
						+ "<html>";
		      linhas[0] =5; 
		      
		      tx[1] = "<html>Todo seu grupo \u00E9"
						 + "<br/>massacrado e voc\u00EA"  
						 + "<br/>perece em batalha."  
						 + "<br/>Com as tropas de"  
						 + "<br/>Bethesda despertas e"  
						 + "<br/>prontas, Helaria \u00E9"  
						 + "<br/>invadida"  
						+ "<html>";
		      linhas[1] =6; 
		      
		      tx[2] = "<html>Helaria ir\u00E1 cair."
						 + "<br/>Milhares de vidas s\u00E3o"  
						 + "<br/>perdidas e a cidade"  
						 + "<br/>\u00E9 massacrada, a hist\u00F3ria"  
						 + "<br/>de Helaria \u00E9 esquecida" 
						 + "<br/> assim como seu povo."  
						+ "<html>";
		      linhas[2] =6; 
		      
		      tx[3] = "<html>FIM DE JOGO!"
		    		  + "<br/>..."
						+ "<html>";
		      linhas[3] =1; 
			}
			
			public void derrotaComBonusOuVitoriaSemRecrutas() {
				tx = new String[2];
				linhas = new int[2];
				
				tx[0] = "<html>S\u00E3o muitos soldados"
						 + "<br/>e voc\u00EAs n\u00E3o conseguem"  
						 + "<br/>cont\u00EA-los. mesmo com "  
						 + "<br/>v\u00E1rios ca\u00EDdos eles conseguem"  
						 + "<br/>fugir do inc\u00EAndio"  
						 + "<br/>em grande n\u00FAmero"  
						 + "<br/>e est\u00E3o prontos para a guerra."  
						+ "<html>";
		      linhas[0] =6; 
		      
		      tx[1] = "<html>Todo seu grupo \u00E9"
						 + "<br/>massacrado, no entanto"  
						 + "<br/>voc\u00EA ainda est\u00E1 vivo."  
						+ "<html>";
		      linhas[1] =2; 
		      
		      choice = "<html>O que voc\u00EA ir\u00E1 fazer?" + "<html>";
				op1 = "Lutar";
				op2 = "Fugir";
			}
			
			public void derrotaComBonusOuVitoriaSemRecrutas2(int x) {
				switch (x) {
				case 1://lutar
					tx = new String[4];
					linhas = new int[4];
					tx[0] = "<html>Voc\u00EA fugiu uma vez de Bethesda"
							 + "<br/>em sua adolesc\u00EAncia,"  
							 + "<br/>n\u00E3o ir\u00E1 fugir agora."  
							 + "<br/>Voc\u00EA volta para"  
							 + "<br/>Helaria para ter"  
							 + "<br/>sua \u00FAltima batalha."  
							+ "<html>";
			      linhas[0] =5; 
			      
			      tx[1] = "<html>Helaria n\u00E3o est\u00E1 preparada"
							 + "<br/>e nem tem for\u00E7as"  
							 + "<br/>suficientes para resistir"  
							 + "<br/>um ataque massivo"  
							 + "<br/>e Bethesda, n\u00E3o existem"  
							 + "<br/>esperan\u00E7as, Helaria cair\u00E1"  
							+ "<html>";
			      linhas[1] =5; 
			      
			      tx[2] = "<html>E Helaria cai, voc\u00EA cai,"
							 + "<br/>um massacre acontece e"  
							 + "<br/>grande parte de seu povo"  
							 + "<br/>desaparece, mas ainda"  
							 + "<br/>existe uma parcela que est\u00E1"  
							 + "<br/>viva e eles ser\u00E3o os respons\u00E1veis"  
							 + "<br/>em contar a hist\u00F3ria de Helaria,"  
							+ "<html>";
			      linhas[2] =6; 
			      
			      tx[3] = "<html>FIM DE JOGO!"
			    		  + "<br/>..."
							+ "<html>";
			      linhas[3] =1; 
			      break;
				case 2://fugir
					tx = new String[2];
					linhas = new int[2];
					tx[0] = "<html>N\u00E3o \u00E9 porque Helaria"
							 + "<br/>cair\u00E1 que voc\u00EA tamb\u00E9m"  
							 + "<br/>precisa cair."  
							 + "<br/>Voc\u00EA vai embora"  
							 + "<br/> e atravessa as montanhas,"  
							 + "<br/>pronto para come\u00E7ar"  
							 + "<br/>uma nova vida." 
							+ "<html>";
			      linhas[0] =6; 
			      
			      tx[1] = "<html>Chega em terras distantes"
							 + "<br/>e passa a viver nelas"  
							 + "<br/>como um simples alde\u00E3o,"  
							 + "<br/>da mesma forma que sua"  
							 + "<br/>vida tinha come\u00E7ado."  
							 + "<br/>FIM DE JOGO!"  
							+ "<html>";
			      linhas[1] =5; 
			      break;
				}
			}
			
			public void vitoria3Recrutados() {
				tx = new String[5];
			linhas = new int[5];
			tx[0] = "<html> Voc\u00EA:" + "<br/><br/>Voc\u00EA n\u00E3o se preocupa com"
					+ "<br/>todos que ir\u00E3o morrer, com o massacre" + "<br/>que acontecer\u00E1?" + "<html>";
			linhas[0] = 4;

			tx[1] = "<html> Ariandra:" + "<br/><br/>Um massacre acontecer\u00E1 de qualquer"
					+ "<br/>forma, seja de um lado ou de outro." + "<br/>Agora v\u00E1 embora antes que eu me irrite."
					+ "<html>";
			linhas[1] = 4;

			tx[2] = "<html>O dia termina e voc\u00EA" + "<br/>volta para a Alameda"
					+ "<br/>dos Tr\u00EAs Ponteiros, mas" + "<br/>sem a ajuda de Ariandra." + "<html>";
			linhas[2] = 3;
			//break;
		}
	

	/*public void TorreArcanaAssassin() {
		tx = new String[18];
		linhas = new int[18];
		tx[0] = "<html>Voc\u00EA pega seu caminho para a" + "<br/>Torre Arcana e consegue"
				+ "<br/>entrar sem problemas." + "<br/>\u00C9 recebido por dois arcanos de"
				+ "<br/>baixo grau que perguntam" + "<br/>o que voc\u00EA quer." + "<html>";
		linhas[0] = 5;

		tx[1] = "<html> Voc\u00EA:" + "<br/><br/>Procuro a Sacerdotisa Terraira."
				+ "<br/>\u00C9 um assunto urgente que tenho" + "<br/>para falar com ela." + "<html>";
		linhas[1] = 4;

		tx[2] = "<html> Arcanos:" + "<br/><br/>Ela est\u00E1 em seus aposentos."
				+ "<br/>\u00C9 s\u00F3 subir as escadas at\u00E9 o quarto"
				+ "<br/>piso e virar no segundo quarto a esquerda." + "<html>";
		linhas[2] = 4;

		tx[3] = "<html> Voc\u00EA:" + "<br/><br/>Obrigado." + "<html>";
		linhas[3] = 2;

		tx[4] = "<html>Voc\u00EA pega o caminho que te" + "<br/>informaram e chega em um quarto"
				+ "<br/>com a porta fechada," + "<br/>voc\u00EA bate na porta e ela se abre." + "<html>";
		linhas[4] = 3;

		tx[5] = "<html> Uma mulher que voc\u00EA julga ser Terraira diz.:" + "<br/><br/>Bem-vindo," + player.getNome()
				+ "<html>";
		linhas[5] = 2;

		tx[6] = "<html> Voc\u00EA:" + "<br/><br/>Como voc\u00EA sabe meu nome?" + "<html>";
		linhas[6] = 2;

		tx[7] = "<html> Terraira:" + "<br/><br/>Eu sou uma sacerdotisa," + "<br/>sei muitas coisas."
				+ "<br/>Agora vem a quest\u00E3o do" + "<br/>que voc\u00EA quer aqui." + "<html>";
		linhas[7] = 5;

		tx[8] = "<html> Voc\u00EA:" + "<br/><br/>Eu preciso..." + "<html>";
		linhas[8] = 2;

		tx[9] = "<html> Terraira:" + "<br/><br/>Eu sei o que voc\u00EA quer" + "<br/>e o que voc\u00EA precisa,"
				+ "<br/>eu sei da guerra, mas por que eu deveria te" + "<br/>ajudar ao inv\u00E9s de"
				+ "<br/>lutar com os meus?" + "<html>";
		linhas[9] = 5;

		tx[10] = "<html> Voc\u00EA:" + "<br/><br/>Porque n\u00F3s temos um plano para..." + "<html>";
		linhas[10] = 2;

		tx[11] = "<html> Terraira:" + "<br/><br/>Foi uma pergunta ret\u00F3rica." + "<br/>Eu sei seus planos,"
				+ "<br/>s\u00F3 n\u00E3o sei seu valor." + "<html>";
		linhas[11] = 4;

		tx[12] = "<html> Voc\u00EA:" + "<br/><br/>O que voc\u00EA quer que eu fa\u00E7a?" + "<html>";
		linhas[12] = 2;

		tx[13] = "<html> Terraira:" + "<br/><br/>Finalmente fomos ao que interessa."
				+ "<br/>Se eu for lutar com voc\u00EA," + "<br/>vou precisar que busque um livro para mim." + "<html>";
		linhas[13] = 4;

		tx[14] = "<html> Voc\u00EA:" + "<br/><br/>Qual livro e onde?" + "<html>";
		linhas[14] = 2;

		tx[15] = "<html> Terraira:" + "<br/><br/>Mem\u00F3rias de Mago Esquecido."
				+ "<br/>\u00C9 um livro que cont\u00E9m" + "<br/>alguns feiti\u00E7os antigos."
				+ "<br/>E, quanto ao local, ele est\u00E1 aqui," + "<br/>em uma sala que cont\u00E9m um labirinto,"
				+ "<br/>se voc\u00EA conseguir me trazer at\u00E9 o final" + "<br/>do dia eu me juntarei a voc\u00EA."
				+ "<html>";
		linhas[15] = 8;

		tx[16] = "<html> Voc\u00EA:" + "<br/><br/>Muito bem, ent\u00E3o pode se arrumar." + "<html>";
		linhas[16] = 2;

		tx[17] = "<html>  Terraira:" + "<br/><br/>\u00C9 o que veremos." + "<html>";
		linhas[17] = 2;

	}*/

	/*public void posLabirinto(int x) {
		switch (x) {
		case 1:
			tx = new String[2];
			linhas = new int[2];

			tx[0] = "<html>  Terraira:" + "<br/><br/>Muito bem, voc\u00EA" + "<br/>me provou suas capacidades,"
					+ "<br/>eu irei contigo." + "<html>";
			linhas[0] = 4;

			tx[1] = "<html>O dia termina e voc\u00EA volta" + "<br/>para a Alameda dos Tr\u00EAs"
					+ "<br/>Ponteiros. Vit\u00F3ria." + "<html>";
			linhas[1] = 2;
			break;
		case 2:
			tx[1] = "<html>Voc\u00EA sente uma forte dor de cabe\u00E7a" + "<br/>e desmaia. Pouco depois "
					+ "<br/>voc\u00EA acorda na enfermaria." + "<html>";
			linhas[1] = 2;
		}
	}*/

	public void Catederal() {
		tx = new String[5];
		linhas = new int[5];

		tx[0] = "<html>Voc\u00EA vai para os limites da Catedral" + "<br/> at\u00E9 encontrar uma entrada para o"
				+ "<br/> esgoto. Para algu\u00E9m como" + "<br/> voc\u00EA n\u00E3o existe "
				+ "<br/> outro meio de acesso a" + "<br/> esse local, especialmente" + "<br/> a sua pris\u00E3o. "
				+ "<html>";
		linhas[0] = 6;

		tx[1] = "<html>Voc\u00EA segue pelo esgoto" + "<br/> at\u00E9 encontrar uma entrada para a parte"
				+ "<br/> subterr\u00E2nea da Catedral," + "<br/> onde fica a pris\u00E3o."
				+ "<br/> \u00C9 um lugar escuro e \u00FAmido," + "<br/> fede a medo e morte." + "<html>";
		linhas[1] = 5;

		tx[2] = "<html>se existir um inferno na Terra" + "<br/> com certeza aqui"
				+ "<br/> est\u00E1 pr\u00F3ximo, voc\u00EA pensa." + "<br/> Para entrar na ala"
				+ "<br/> onde est\u00E3o as celas voc\u00EA " + "<br/> precisa passar por " + "<br/> uma grande porta."
				+ "<html>";
		linhas[2] = 6;

		tx[3] = "<html>Voc\u00EA se aproxima, pronto" + "<br/> para destranc\u00E1-la, mas"
				+ "<br/> ela j\u00E1 est\u00E1 aberta" + "<br/> e voc\u00EA entra. " + "<html>";
		linhas[3] = 3;

		tx[4] = "<html>Uma enorme Hidra" + "<br/>est\u00E1 guardando a sala e a porta"
				+ "<br/>se fechou, para sobreviver" + "<br/>voc\u00EA precisa derrotar a Hidra." + "<html>";
		linhas[4] = 3;

	}

	public void posHidra() {
		tx = new String[13];
		linhas = new int[13];
		tx[0] = "<html>Voc\u00EA consegue superar a" + "<br/> Hidra e entrar na pris\u00E3o."
				+ "<br/> Ela \u00E9 pouco vigiada, afinal" + "<br/> j\u00E1 tinha um monstro"
				+ "<br/> guardando-a. Apenas um" + "<br/> guarda adormecido com as" + "<br/> chaves" + "<html>";
		linhas[0] = 6;

		tx[1] = "<html>Furtivamente voc\u00EA vai at\u00E9 ele e se" + "<br/> apropria delas e vai"
				+ "<br/> em busca de Letos," + "<br/>  An\u00E3o. Em uma cela "
				+ "<br/> distante l\u00E1 est\u00E1 ele," + "<br/> dormindo. Voc\u00EA o acorda." + "<html>";
		linhas[1] = 5;

		tx[2] = "<html> Voc\u00EA:" + "<br/><br/>Est\u00E1 interessado em" + "<br/> ir embora deste inferno?"
				+ "<html>";
		linhas[2] = 3;

		tx[3] = "<html> Letos:" + "<br/><br/>Com toda certeza," + "<br/> mas quem \u00E9 voc\u00EA?" + "<html>";
		linhas[3] = 3;

		tx[4] = "<html> Voc\u00EA:" + "<br/><br/>Sou um enviado de Cassius." + "<br/> Precisamos da sua ajuda?"
				+ "<html>";
		linhas[4] = 3;

		tx[5] = "<html> Letos:" + "<br/><br/>No que eu" + "<br/> poderia ajudar?" + "<html>";
		linhas[5] = 3;

		tx[6] = "<html> Voc\u00EA:" + "<br/><br/>Voc\u00EA est\u00E1 preso por" + "<br/>matar quinze pessoas numa"
				+ "<br/>briga de bar com um" + "<br/>machado. Treze delas" + "<br/>eram soldados altamente treinados"
				+ "<html>";
		linhas[6] = 6;

		tx[7] = "<html> Letos:" + "<br/><br/>E o que voc\u00EAs" + "<br/> querem que eu fa\u00E7a?" + "<html>";
		linhas[7] = 3;

		tx[8] = "<html> Voc\u00EA:" + "<br/><br/>Helaria ser\u00E1 invadida por" + "<br/>Bethesda dentro de pouco"
				+ "<br/>tempo, n\u00F3s estamos montando" + "<br/>um grupo para lutar contra"
				+ "<br/>e sua presen\u00E7a ser\u00E1 valiosa." + "<html>";
		linhas[8] = 6;

		tx[9] = "<html> Letos:" + "<br/><br/>E voc\u00EA s\u00F3 vai" + "<br/>me libertar se eu"
				+ "<br/>me juntar a voc\u00EA?" + "<html>";
		linhas[9] = 4;

		tx[10] = "<html> Voc\u00EA:" + "<br/><br/>Precisamente." + "<html>";
		linhas[10] = 2;

		tx[11] = "<html> Letos:" + "<br/><br/>Muito bem," + "<br/>estou dentro. Afinal, o que"
				+ "<br/>eu tenho a perder?" + "<html>";
		linhas[11] = 4;

		tx[12] = "<html>Voc\u00EA abre a cela." + "<br/>O dia est\u00E1 terminando " + "<br/>e voc\u00EA retorna para "
				+ "<br/>a Alameda dos Tr\u00EAs Ponteiros" + "<br/> com Letos, o An\u00E3o. Vit\u00F3ria." + "<html>";
		linhas[12] = 4;
	}

	/*public void finalAssassin() {
		tx = new String[5];
		linhas = new int[5];
		tx[0] = "<html>Termina o terceiro dia e" + "<br/> voc\u00EA vai para seu quarto"
				+ "<br/> descansar. Voc\u00EA s\u00F3 ter\u00E1" + "<br/> algumas poucas horas"
				+ "<br/> de sono antes de" + "<br/> sa\u00EDrem para colocar" + "<br/> o plano em pr\u00E1tica,"
				+ "<html>";
		linhas[0] = 6;

		tx[1] = "<html>ent\u00E3o \u00E9 melhor" + "<br/> fazer valer o tempo." + "<br/> Chega a hora e voc\u00EA"
				+ "<br/> se levanta e se prepara." + "<br/> Voc\u00EAs se encontram"
				+ "<br/>  em uma sa\u00EDda da cidade." + "<html>";
		linhas[1] = 5;

		tx[2] = "<html>Seu grupo \u00E9 composto" + "<br/>  por voc\u00EA, Cassius,"
				+ "<br/>(aqueles que voc\u00EA conseguiu" + "<br/>recrutar), e dois" + "<br/> outros assassinos."
				+ "<html>";
		linhas[2] = 4;

		tx[3] = "<html>Furtivamente voc\u00EAs saem" + "<br/>da cidade e se encaminham"
				+ "<br/>para o acampamento inimigo" + "<br/> enquanto todos est\u00E3o dormindo"
				+ "<br/>No acampamento voc\u00EAs" + "<br/>pretendem causar um inc\u00EAndio." + "<html>";
		linhas[3] = 5;

		tx[3] = "<html>O inc\u00EAndio tem in\u00EDcio" + "<br/>e as tropas come\u00E7am a acordar."
				+ "<br/>Seu objetivo \u00E9 garantir que elas" + "<br/> fiquem o m\u00E1ximo poss\u00EDvel"
				+ "<br/>no foco do fogo para" + "<br/>que pere\u00E7am" + "<html>";
		linhas[3] = 5;

		tx[4] = "<html>todos voc\u00EAs retiram" + "<br/>suas armas e come\u00E7a"
				+ "<br/>a primeira batalha da guerra." + "<html>";
		linhas[4] = 2;
	}

	public void derrotaSemBonus() {
		tx = new String[4];
		linhas = new int[4];
		tx[0] = "<html>S\u00E3o muitos soldados" + "<br/>e voc\u00EAs n\u00E3o conseguem"
				+ "<br/>cont\u00EA-los. Eles conseguem" + "<br/>fugir do inc\u00EAndio"
				+ "<br/>quase intactos e est\u00E3o" + "<br/>prontos para a guerra." + "<html>";
		linhas[0] = 5;

		tx[1] = "<html>Todo seu grupo \u00E9" + "<br/>massacrado e voc\u00EA" + "<br/>perece em batalha."
				+ "<br/>Com as tropas de" + "<br/>Bethesda despertas e" + "<br/>prontas, Helaria \u00E9"
				+ "<br/>invadida" + "<html>";
		linhas[1] = 6;

		tx[2] = "<html>Helaria ir\u00E1 cair." + "<br/>Milhares de vidas s\u00E3o" + "<br/>perdidas e a cidade"
				+ "<br/>\u00E9 massacrada, a hist\u00F3ria" + "<br/>de Helaria \u00E9 esquecida"
				+ "<br/> assim como seu povo." + "<html>";
		linhas[2] = 6;

		tx[3] = "<html>FIM DE JOGO!" + "<br/>..." + "<html>";
		linhas[3] = 1;
	}

	public void derrotaComBonusOuVitoriaSemRecrutas() {
		tx = new String[2];
		linhas = new int[2];

		tx[0] = "<html>S\u00E3o muitos soldados" + "<br/>e voc\u00EAs n\u00E3o conseguem"
				+ "<br/>cont\u00EA-los. mesmo com " + "<br/>v\u00E1rios ca\u00EDdos eles conseguem"
				+ "<br/>fugir do inc\u00EAndio" + "<br/>em grande n\u00FAmero"
				+ "<br/>e est\u00E3o prontos para a guerra." + "<html>";
		linhas[0] = 6;

		tx[1] = "<html>Todo seu grupo \u00E9" + "<br/>massacrado, no entanto" + "<br/>voc\u00EA ainda est\u00E1 vivo."
				+ "<html>";
		linhas[1] = 2;

		choice = "<html>O que voc\u00EA ir\u00E1 fazer?" + "<html>";
		op1 = "Lutar";
		op2 = "Fugir";
	}*/

	/*public void derrotaComBonusOuVitoriaSemRecrutas2(int x) {
		switch (x) {
		case 1:
			tx = new String[4];
			linhas = new int[4];
			tx[0] = "<html>Voc\u00EA fugiu uma vez de Bethesda" + "<br/>em sua adolesc\u00EAncia,"
					+ "<br/>n\u00E3o ir\u00E1 fugir agora." + "<br/>Voc\u00EA volta para" + "<br/>Helaria para ter"
					+ "<br/>sua \u00FAltima batalha." + "<html>";
			linhas[0] = 5;

			tx[1] = "<html>Helaria n\u00E3o est\u00E1 preparada" + "<br/>e nem tem for\u00E7as"
					+ "<br/>suficientes para resistir" + "<br/>um ataque massivo" + "<br/>e Bethesda, n\u00E3o existem"
					+ "<br/>esperan\u00E7as, Helaria cair\u00E1" + "<html>";
			linhas[1] = 5;

			tx[2] = "<html>E Helaria cai, voc\u00EA cai," + "<br/>um massacre acontece e"
					+ "<br/>grande parte de seu povo" + "<br/>desaparece, mas ainda"
					+ "<br/>existe uma parcela que est\u00E1" + "<br/>viva e eles ser\u00E3o os respons\u00E1veis"
					+ "<br/>em contar a hist\u00F3ria de Helaria," + "<html>";
			linhas[2] = 6;

			tx[3] = "<html>FIM DE JOGO!" + "<br/>..." + "<html>";
			linhas[3] = 1;
			break;
		case 2:
			tx = new String[2];
			linhas = new int[2];
			tx[0] = "<html>N\u00E3o \u00E9 porque Helaria" + "<br/>cair\u00E1 que voc\u00EA tamb\u00E9m"
					+ "<br/>precisa cair." + "<br/>Voc\u00EA vai embora" + "<br/> e atravessa as montanhas,"
					+ "<br/>pronto para come\u00E7ar" + "<br/>uma nova vida." + "<html>";
			linhas[0] = 6;

			tx[1] = "<html>Chega em terras distantes" + "<br/>e passa a viver nelas"
					+ "<br/>como um simples alde\u00E3o," + "<br/>da mesma forma que sua"
					+ "<br/>vida tinha come\u00E7ado." + "<br/>FIM DE JOGO!" + "<html>";
			linhas[1] = 5;
			break;
		}
	}*/

	/*public void vitoria3Recrutados() {
		tx = new String[5];
		linhas = new int[5];
		tx[0] = "<html>Voc\u00EAs conseguem conter" + "<br/>nas chamas uma for\u00E7a"
				+ "<br/>significativa de Bethesda." + "<br/>Agora com as tropas" + "<br/> flageladas, Bethesda j\u00E1"
				+ "<br/>n\u00E3o representa uma" + "<br/>amea\u00E7a t\u00E3o grande." + "<html>";
		linhas[0] = 6;

		tx[1] = "<html>Helaria v\u00EA as chamas" + "<br/>e envia suas tropas" + "<br/>para acabar com o que"
				+ "<br/>resta das tropas de Bethesda." + "<br/>Uma violenta batalha se"
				+ "<br/>inicia e voc\u00EA e seu" + "<br/>grupo tomam parte." + "<html>";
		linhas[1] = 6;

		tx[2] = "<html>As tropas de Bethesda" + "<br/>s\u00E3o dizimadas enquanto" + "<br/>que as de Helaria est\u00E3o"
				+ "<br/>quase inteiras. O rei." + "<br/>deseja saber quem foi" + "<br/>o respons\u00E1vel por essa"
				+ "<br/>vit\u00F3ria e encontra voc\u00EAs." + "<html>";
		linhas[2] = 6;

		tx[3] = "<html>Todos recebem o t\u00EDtulo" + "<br/>de Guardi\u00E3o Protetor de"
				+ "<br/>Helaria e sempre ser\u00E3o" + "<br/>ouvidos nas reuni\u00F5es reais"
				+ "<br/>Helaria muda muito depois" + "<br/>da guerra e de sua " + "<br/>ascens\u00E3o" + "<html>";
		linhas[3] = 6;

		tx[4] = "<html>O povo passa a ter" + "<br/>mais voz e cada" + "<br/>vez mais se aproxima"
				+ "<br/>de um lugar ideal" + "<br/>a se viver." + "<br/>PARAB\u00C9NS!" + "<br/>VOCÊ TERMINOU O JOGO!"
				+ "<html>";
		linhas[4] = 6;
	}*/

	public void vitoriaDoisRecrutados() {
		tx = new String[6];
		linhas = new int[6];
		tx[0] = "<html>Grande parte das tropas" + "<br/>do acampamento s\u00E3o mortas" + "<br/>ou aleijadas, mas ainda"
				+ "<br/>tem uma quantidade" + "<br/> significativa pronta" + "<br/>para lutar." + "<html>";
		linhas[0] = 5;

		tx[1] = "<html>Uma batalha se inicia" + "<br/>e tropas de Bethesda" + "<br/>e Helaria alertadas"
				+ "<br/> pelo inc\u00EAndio chegam" + "<br/>para participar" + "<html>";
		linhas[1] = 4;

		tx[2] = "<html>A batalha \u00E9 violenta" + "<br/>e muitos soldados dos dois" + "<br/>lados s\u00E3o mortos,"
				+ "<br/>mas no final Helaria" + "<br/>vence e a cidade" + "<br/>permanece intacta." + "<html>";
		linhas[2] = 5;

		tx[3] = "<html>Depois da guerra o Rei" + "<br/>procura pelos respons\u00E1veis"
				+ "<br/>pela vit\u00F3ria. Todos" + "<br/>voc\u00EAs s\u00E3o recompensados"
				+ "<br/>com o t\u00EDtulo de Lordes" + "<br/>Guerreiros de Helaria" + "<html>";
		linhas[3] = 6;

		tx[4] = "<html>Depois dessa guerra" + "<br/>Helaria come\u00E7a a se" + "<br/>militarizar intensamente"
				+ "<br/>ao ponto do ex\u00E9rcito se" + "<br/>tornar a institui\u00E7\u00E3o" + "<br/>mais importante"
				+ "<br/>do Estado." + "<html>";
		linhas[4] = 6;

		tx[5] = "<html>Voc\u00EAs tiveram a vit\u00F3ria," + "<br/>mas voc\u00EA s\u00F3 n\u00E3o sabe"
				+ "<br/>at\u00E9 que ponto" + "<br/>ela valeu a pena." + "<br/>PARAB\u00C9NS SOLDADO!"
				+ "<br/>VOCÊ TERMINOU O JOGO!" + "<html>";
		linhas[5] = 5;
	}

	public void vitoriaUmRecrutado() {
		tx = new String[6];
		linhas = new int[6];
		tx[0] = "<html>As tropas inimigas s\u00E3o" + "<br/>muito numerosas e voc\u00EAs"
				+ "<br/>conseguem eliminar apenas" + "<br/>uma parte delas." + "<br/>O inc\u00EAndio desperta"
				+ "<br/>o restante das tropas" + "<br/>de Bethesda" + "<html>";
		linhas[0] = 5;

		tx[1] = "<html>Uma violenta batalha" + "<br/>\u00E9 iniciada marcada" + "<br/>no in\u00EDcio pelo avan\u00E7o"
				+ "<br/> de Bethesda at\u00E9 entrar" + "<br/>nos muros da cidade." + "<html>";
		linhas[1] = 4;

		tx[2] = "<html>Quando a guerra chega" + "<br/>no interior da cidade," + "<br/>Helaria come\u00E7a a virar"
				+ "<br/>a situa\u00E7\u00E3o e Bethesda" + "<br/>come\u00E7a a perder." + "<html>";
		linhas[2] = 4;

		tx[3] = "<html>Voc\u00EAs lutam bravamente" + "<br/>at\u00E9 suas \u00FAltimas for\u00E7as,"
				+ "<br/>mas no fim perecem" + "<br/>para proteger Helaria." + "<html>";
		linhas[3] = 3;

		tx[4] = "<html>Grande parte de Helaria" + "<br/>\u00E9 destru\u00EDda, mas no" + "<br/>fim ela sai vitoriosa."
				+ "<br/>O Rei procura pelos" + "<br/>respons\u00E1veis pelo inc\u00EAndio"
				+ "<br/>que possibilitou a vit\u00F3ria" + "<br/>e descobre suas hist\u00F3rias." + "<html>";
		linhas[4] = 6;

		tx[5] = "<html>Um monumento \u00E9 erguido" + "<br/>em suas homenagens" + "<br/>para que todos se"
				+ "<br/>lembrem dos salvadores" + "<br/>de Helaria para sempre." + "<html>";
		linhas[5] = 4;

		tx[6] = "<html>Os anos passam e Helaria" + "<br/>\u00E9 reconstru\u00EDda. Hoje,"
				+ "<br/>todos sabem da hist\u00F3ria" + "<br/>da grande guerra e de" + "<br/>quem foram os her\u00F3is"
				+ "<br/>que deram suas vidas" + "<br/>para salvar a cidade." + "<html>";
		linhas[6] = 4;
		tx[6] = "<html>Os anos passam e Helaria" + "<br/>\u00E9 reconstru\u00EDda. Hoje,"
				+ "<br/>todos sabem da hist\u00F3ria" + "<br/>da grande guerra e de" + "<br/>quem foram os her\u00F3is"
				+ "<br/>que deram suas vidas" + "<br/>para salvar a cidade." + "<html>";
		linhas[6] = 4;

		tx[7] = "<html>PARAB\u00C9NS AVENTUREIRO!" + "<br/>VOCÊ TERMINOU O JOGO! " + "<html>";
		linhas[7] = 1;
	}
}

//	  tx[] = "<html>"
//		 + "<br/>"
//		 + "<br/>" 
//		 + "<br/>"
//		 +"<html>";
//linhas[] = ;
