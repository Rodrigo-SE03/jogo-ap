package bibliotecas;

public class Biblio_Assassin extends Biblioteca {

	/*
	 * 
	 * Lista de acentos (evita que bugue ao mandar pro GitKraken)
	 * 
	 * \u00E7 ç
	 * 
	 * \u00E0 à \u00E1 á \u00E2 â \u00E3 ã \u00C1 Á
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

		tx = new String[17];

		if (masculino) {
			tx[0] = "Quinze anos se passaram desde que Voc\u00EA se juntou \u00E0 Guilda Vigilante."
					+ " Voc\u00EA se tornou um membro  valioso, um assassino  r\u00E1pido e eficiente,  "
					+ " completou in\u00FAmeras miss\u00F5es, deixou  in\u00FAmeros cad\u00E1veres.";

			tx[13] = "Pelo seu tom ficou claro para todos que " + " conhecem um pouco da sua hist\u00F3ria que "
					+ " voc\u00EA est\u00E1 disposto a tudo para  obter vingan\u00E7a.";

		} else {

			tx[0] = "Quinze anos se passaram desde que Voc\u00EA se juntou \u00E0 Guilda Vigilante."
					+ " Voc\u00EA se tornou um membro  valioso, uma assassina  r\u00E1pido e eficiente,  "
					+ " completou in\u00FAmeras miss\u00F5es, deixou  in\u00FAmeros cad\u00E1veres.";

			tx[13] = "Pelo seu tom ficou claro para todos que " + " conhecem um pouco da sua hist\u00F3ria que "
					+ " voc\u00EA est\u00E1 disposta a tudo para  obter vingan\u00E7a.";
		}

		tx[1] = "Em todos esses anos as pessoas da Ordem" + " se tornaram sua fam\u00EDlia, em especial "
				+ " Cassius, ele foi um irm\u00E3o mais velho, um"
				+ " amigo e um mentor para voc\u00EA. Te ajudou a superar a morte da sua fam\u00EDlia e a"
				+ " destrui\u00E7\u00E3o de seu lar, te ofereceu uma nova casa e uma nova fam\u00EDlia.";

		tx[2] = "Hoje foi marcada uma reuni\u00E3o com  todos os membros da Guilda."
				+ " Isso n\u00E3o \u00E9 um bom sinal,  geralmente significam ou morte"
				+ "  ou problemas, mas, hoje em especial, parece significar os dois ";
		tx[3] = "Os diversos membros come\u00E7am a se " + " juntar e o l\u00EDder da Guilda, por defini\u00E7\u00E3o,"
				+ "  o membro mais antigo vivo, Homero, come\u00E7a a falar:";

		tx[4] = "Homero:\n\nDurante muito tempo vivemos em um" + " per\u00EDodo de relativa paz. Tivemos nossos"
				+ " conflitos internos e externos, \u00E9 claro, mas" + " nunca enfrentamos amea\u00E7a que pudesse"
				+ " nos dizimar. Hoje a situa\u00E7\u00E3o \u00E9 diferente,"
				+ " pela primeira vez todos n\u00F3s corremos o risco de sermos dizimados.";

		tx[5] = "Todos come\u00E7am a se agitar e debater o que Homero estava dizendo, afinal, que"
				+ " amea\u00E7a poderia ser t\u00E3o grande para" + " destruir toda a Guilda? No passado voc\u00EAs"
				+ " j\u00E1 tiveram in\u00FAmeros conflitos com a Guarda Real, mas nenhum representou"
				+ " amea\u00E7a t\u00E3o grande.";

		tx[6] = "Homero:\n\nSILÊNCIO! Eu sei que todos est\u00E3o preocupados com "
				+ " o que acabei de dizer, mas pelo menos me deixem terminar antes de pensar"
				+ " qualquer coisa est\u00FApida.";

		tx[7] = "O sil\u00EAncio aos poucos volta, permitindo Homero continuar.";

		tx[8] = "Homero:\n\nO Imp\u00E9rio de Bethesda declarou guerra"
				+ " contra Helaria na noite de ontem. Bethesda \u00E9 conhecido por destruir"
				+ " qualquer um que esteja em seu caminho,"
				+ " cidades s\u00E3o queimadas, popula\u00E7\u00F5es s\u00E3o";

		tx[9] = "Homero:\n\ndestru\u00EDdas e culturas apagadas, e, \u00E9 isso"
				+ " que acontecer\u00E1 com Helaria se n\u00E3o fizermos nada.";

		tx[10] = "Um homem irritado:\n\n  Mas por que n\u00F3s far\u00EDamos"
				+ "  alguma coisa por Helaria se Helaria nunca fez nada por n\u00F3s?!";

		tx[11] = "Voc\u00EA:\n\n Porque n\u00F3s vivemos aqui seu imbecil!";

		tx[12] = "Voc\u00EA retruca com ferocidade, afinal foi Bethesda que"
				+ " destruiu sua vila, queimou sua casa e matou sua fam\u00EDlia.";

		tx[14] = "Homero:\n\nPercebo que posso contar com voc\u00EA nessa guerra, " + player.getNome() + ".";

		tx[15] = "A reuni\u00E3o continua por mais um tempo, detalhes da guerra s\u00E3o discutidos e"
				+ " esclarecidos. O Imp\u00E9rio de Bethesda est\u00E1"
				+ " marchando em dire\u00E7\u00E3o a Helaria e tem"
				+ " previs\u00E3o de chegar dentro de tr\u00EAs dias.";

		tx[16] = "No final da reuni\u00E3o Cassius te chama para conversar.";

		choice = "Cassius:\n\nVoc\u00EA est\u00E1 bem?";
		op1 = "Mentir";
		op2 = "Dizer a verdade";
	}

	public void Escolha1Assassin(int a) {

		tx = new String[10];

		switch (a) {
		case 1:// mentir

			tx[0] = "Voc\u00EA:\n\nEstou bem, nenhum problema com isso.";

			tx[1] = "Cassius:\n\nFico feliz de ouvir isso.";
			break;

		case 2:// dizer a verdade

			if (masculino) {

				tx[1] = "Cassius:\n\nFique tranquilo, n\u00F3s vamos passar por  isso juntos.";

			} else {

				tx[1] = "Cassius:\n\nFique tranquila, n\u00F3s vamos passar por  isso juntos.";

			}

			tx[0] = "Voc\u00EA:\n\nN\u00E3o estou confort\u00E1vel com Bethesda,"
					+ " mas isso n\u00E3o atrapalhar\u00E1 minha luta";

			break;

		}

		tx[2] = "Voc\u00EA:\n\nMas n\u00E3o foi s\u00F3 para ver como" + " estou que voc\u00EA me chamou aqui, certo?";

		tx[3] = "Cassius:\n\nEu preciso que voc\u00EA recrute" + " algumas pessoas para nos ajudar.";

		tx[4] = "Voc\u00EA:\n\nQuem?";

		tx[5] = "Cassius:\n\nAriandra, a Elfa arqueira que"
				+ " recentemente chegou em Helaria, ela vive na Casa Nobre Letos, o An\u00E3o, que "
				+ " est\u00E1 preso dentro da Catedral.  E Terraira, uma sacerdotisa da Torre Arcana.";

		tx[6] = "Voc\u00EA:\n\nE por que o interesse nessas pessoas em espec\u00EDfico?";

		tx[7] = "Cassius:\n\nEles s\u00E3o os melhores no que"
				+ " fazem e n\u00F3s vamos montar um pequeno  grupo para atacar os acampamentos"
				+ " de Bethesda antes da guerra come\u00E7ar.";

		tx[8] = "Voc\u00EA:\n\nEntendo.";

		tx[9] = "Jogador agora voc\u00EA ter\u00E1 tr\u00EAs op\u00E7\u00F5es de locais para ir,"
				+ " fa\u00E7a sua escolha com sabedoria. ";
	}

	public void CasaNobreAssassin() {

		tx = new String[2];

		tx[0] = "Voc\u00EA chega nas proximidades da Casa Nobre, mas ela \u00E9 extremamente vigiada,"
				+ " entrar pela porta da frente \u00E9 imposs\u00EDvel."
				+ " Tem um sistema de esgotos que talvez possa te levar para dentro dela,"
				+ " voc\u00EA decide us\u00E1-lo. ";

		tx[1] = "Os esgotos s\u00E3o \u00FAmidos e imundos e a travessia \u00E9 cansativa, mas voc\u00EA"
				+ " entra nas fronteiras da casa. Voc\u00EA continua prosseguindo at\u00E9 chegar "
				+ " no ponto em que deve sair,no entanto  uma porta impede seu caminho. ";

	}

	public void EnigmaPortaAssassin2() {

		tx = new String[1];

		if (masculino) {

			tx[0] = "Voc\u00EA chega nas proximidades da Casa Nobre, e se dirige aos esgostos,"
					+ " obstinado a tentar abrir aquela maldita porta";

		} else {

			tx[0] = "Voc\u00EA chega nas proximidades da Casa Nobre, e se dirige aos esgostos,"
					+ " obstinada a tentar abrir aquela maldita porta";

		}

	}

	public void EnigmaPortaAssasin(int x) {

		switch (x) {
		case 1:// se acertar

			tx = new String[1];

			tx[0] = "A porta se abre e voc\u00EA consegue entrar dentro da casa."
					+ " Ariandra est\u00E1 no quarto de h\u00F3spedes e \u00E9"
					+ " para l\u00E1 que com cautela voc\u00EA se encaminha.A porta do quarto est\u00E1"
					+ "  aberta e voc\u00EA entra. Uma flecha voa na sua dire\u00E7\u00E3o,"
					+ " mas voc\u00EA consegue desviar por pouco. ";

			choice = "Ariandra:\n\nQuem \u00E9 voc\u00EA e o que quer aqui?";
			op1 = "Cassius me mandou.";
			op2 = "Sou " + player.getNome() + " e vim pedir sua ajuda.";
			break;

		case 2:// se errar

			tx = new String[1];

			tx[0] = "A porta n\u00E3o se abre e um alarme>\u00E9 disparado, \u00E9 melhor voc\u00EA ir "
					+ ">embora antes que seja capturado.>O tempo passa e voc\u00EA"
					+ ">pode tentar outra vez ou em outro local.";

		}
	}

	public void OQueVoceQuerAssassin(int x) {

		tx = new String[2];

		switch (x) {
		case 1:// cassius me mandou

			tx[0] = "Ariandra:\n\nCassius?";

			tx[1] = "Voc\u00EA:\n\nMembro da Guilda Vigilante, ele me mandou para" + " pedir sua ajuda.";

			choice = "Ariandra:\n\nE que ajuda eu poderia oferecer a Cassius?";
			op1 = "Voc\u00EA \u00E9 uma ex\u00EDmia arqueira, que ajuda n\u00E3o poderia oferecer?";
			op2 = "Bethesda est\u00E1 se aproximando, ele quer sua ajuda para lutar.";
			break;

		case 2:// sou...

			tx[0] = "Ariandra:\n\nAjuda para que??";

			tx[1] = "Voc\u00EA:\n\nBethesda est\u00E1 se aproximando"
					+ " de Helaria e com seu talento podemos er uma chance de vencer.";

			choice = "Ariandra:\n\nPor que eu deveria me importar com isso?";
			op1 = "Algu\u00E9m com quem voc\u00EA se importa.";
			op2 = "N\u00E3o se importa com todas as vidas perdidas?";
			break;

		}
	}

	public void CassiusmeMandou(int x) {

		switch (x) {
		case 1:// voce \u00E9 uma...

			tx = new String[8];

			tx[0] = "Ela baixa um pouco a guarda e afrouxa a corda do arco.";

			tx[1] = "Voc\u00EA:\n\nN\u00F3s estamos formando um?" + " pequeno grupo para proteger Helaria"
					+ " Sua participa\u00E7\u00E3o ser\u00E1 de grande valor.";

			tx[2] = "Ariandra:\n\nQuem mais est\u00E1 nesse grupo?";

			if (player.getEnigma(1) && player.getEnigma(2)) {

				tx[3] = "Voc\u00EA:\n\nEu, Cassius, o an\u00E3o Letos" + " e a sacerdotisa Terraira.";

			} else if (player.getEnigma(1)) {

				tx[3] = "Voc\u00EA:\n\nEu, Cassius, o an\u00E3o Letos" + " e pretendo recrutar a sacerdotisa Terraira.";

			} else if (player.getEnigma(2)) {

				tx[3] = "Voc\u00EA:\n\nEu, Cassius, a sacerdotisa Terraira" + "  o an\u00E3o Letos.";

			} else {

				tx[3] = "Voc\u00EA:\n\nEu, Cassius e pretendo recrutar"
						+ " a sacerdotisa Terraira e o an\u00E3o Letos.";

			}

			tx[4] = "Ariandra:\n\nVoc\u00EA têm reunir um grupo e tanto"
					+ " E suas habilidades tamb\u00E9m n\u00E3o s\u00E3o porcas, n\u00E3o \u00E9 qualquer"
					+ " um que consegue desviar das minhas flechas.";

			tx[5] = "Voc\u00EA:\n\nEnt\u00E3o voc\u00EA est\u00E1 dentro?";

			tx[6] = "Ariandra:\n\nPode contar comigo";

			tx[7] = "O dia termina e voc\u00EA volta para a Alameda dos" + " Tr\u00EAs Ponteiros, vit\u00F3ria.";
			break;

		case 2:// Bethesheda est\u00E1 chegando

			tx = new String[1];

			tx[0] = "Ariandra:\n\nEssa guerra \u00E9 imposs\u00EDvel.";

			choice = "Ariandra:\n\nVoc\u00EA est\u00E1 louco?";
			op1 = "\u00C9 loucura querer proteger sua cidade? Se for ent\u00E3o estou louco.";
			op2 = "Suas habilidades s\u00E3o \u00FAnicas, com sua ajuda podemos vencer.";
			break;

		}
	}

	public void voceEstaLouco(int x) {

		switch (x) {
		case 1:// locura querer protegr a cidade?

			tx = new String[6];

			tx[0] = "Ariandra:\n\nVoc\u00EA tem determina\u00E7\u00E3o, mas s\u00F3 isso"
					+ " n\u00E3o \u00E9 suficiente. Qual \u00E9 seu plano?";

			tx[1] = "Voc\u00EA:\n\nN\u00F3s estamos montando um pequeno"
					+ " grupo para atacar os acampamentos de  Bethesda antes da guerra iniciar "
					+ " diminuindosuas for\u00E7as. Esse \u00E9 o plano.";

			tx[2] = "Ariandra:\n\nQuem mais estar\u00E1 nesse grupo?";

			if (player.getEnigma(1) && player.getEnigma(2)) {

				tx[3] = "Voc\u00EA:\n\nEu, Cassius, o an\u00E3o Letos" + " e a sacerdotisa Terraira.";

			} else if (player.getEnigma(1)) {

				tx[3] = "Voc\u00EA:\n\nEu, Cassius, o an\u00E3o Letos" + " e pretendo recrutar a sacerdotisa Terraira.";

			} else if (player.getEnigma(2)) {

				tx[3] = "Voc\u00EA:\n\nEu, Cassius, a sacerdotisa Terraira" + "  o an\u00E3o Letos.";

			} else {

				tx[3] = "Voc\u00EA:\n\nEu, Cassius e pretendo recrutar"
						+ " a sacerdotisa Terraira e o an\u00E3o Letos.";

			}

			tx[4] = "Ariandra:\n\n\u00C9 um grupo de peso. Tudo bem, pode contar comigo.";

			tx[5] = "O dia termina e voc\u00EA volta para a Alameda dos" + " Tr\u00EAs Ponteiros, vit\u00F3ria.";
			break;

		case 2:// suas habilidades s\u00E3o unicas

			tx = new String[2];

			tx[0] = "Ariandra:\n\nCaso voc\u00EA n\u00E3o saiba eu estou"
					+ " aposentada, n\u00E3o fa\u00E7o mais esse tipo"
					+ " de servi\u00E7o. Agora v\u00E1 embora antes que eu me enfure\u00E7a.";

			tx[1] = "O dia acaba e voc\u00EA volta para a Alameda dos Tr\u00EAs Ponteiros,"
					+ " mas sem a ajuda de Ariandra.";
			break;

		}

	}

	public void porqueDeveriaMeImportar(int x) {

		switch (x) {
		case 1:// alguem com quem voce se importa

			tx = new String[5];

			tx[0] = "Voc\u00EA:\n\nPorque tem algu\u00E9m aqui com" + " quem voc\u00EA se importa, que"
					+ " mesmo que voc\u00EAs fossem embora, esse algu\u00E9m"
					+ " nunca esqueceria seu lar perdido de Helaria.";

			tx[1] = "Ariandra:\n\nComo voc\u00EA sabe disso?";

			tx[2] = "Voc\u00EA:\n\nEu n\u00E3o sei, apenas imaginei."
					+ " N\u00E3o \u00E9 qualquer pessoa que consegue se hospedar nessa casa.";

			tx[3] = "Ariandra:\n\nVoc\u00EA est\u00E1 certo, eu lutarei"
					+ " por Helaria. Agora v\u00E1 embora antes que eu mude de ideia.";

			tx[4] = "O dia termina e voc\u00EA volta para a Alameda" + " dos Tr\u00EAs Ponteiros, vit\u00F3ria.";
			break;

		case 2:// n\u00E3o se importa com as vidas perdidas

			tx = new String[3];

			tx[0] = "Voc\u00EA:\n\nVoc\u00EA n\u00E3o se preocupa com"
					+ " todos que ir\u00E3o morrer, com o massacre que acontecer\u00E1?";

			tx[1] = "Ariandra:\n\nUm massacre acontecer\u00E1 de qualquer"
					+ " forma, seja de um lado ou de outro. Agora v\u00E1 embora antes que eu me irrite.";

			tx[2] = "O dia termina e voc\u00EA volta para a Alameda"
					+ " dos Tr\u00EAs Ponteiros, mas sem a ajuda de Ariandra.";
			break;

		}
	}

	public void TorreArcanaAssassin() {

		tx = new String[21];

		tx[0] = "Voc\u00EA pega seu caminho para a Torre Arcana e consegue"
				+ " entrar sem problemas. \u00C9 recebido por dois arcanos de"
				+ " baixo grau que perguntam o que voc\u00EA quer.";

		tx[1] = "Voc\u00EA:\n\nProcuro a Sacerdotisa Terraira."
				+ " \u00C9 um assunto urgente que tenho para falar com ela.";

		tx[2] = "Arcanos:\n\nEla est\u00E1 em seus aposentos." + " \u00C9 s\u00F3 subir as escadas at\u00E9 o quarto"
				+ " piso e virar no segundo quarto a esquerda.";

		tx[3] = "Voc\u00EA:\n\nObrigado.";

		tx[4] = "Voc\u00EA pega o caminho que te informaram e chega em um quarto"
				+ " com a porta fechada, voc\u00EA bate na porta e ela se abre.";

		tx[5] = "Uma mulher que voc\u00EA julga ser Terraira diz.:\n\nBem-vindo," + player.getNome();

		tx[6] = "Voc\u00EA:\n\nComo voc\u00EA sabe meu nome?";

		tx[7] = "Terraira:\n\nEu sou uma sacerdotisa, sei muitas coisas."
				+ " Agora vem a quest\u00E3o do que voc\u00EA quer aqui.";

		tx[8] = "Voc\u00EA:\n\nEu preciso...";

		tx[9] = "Terraira:\n\nEu sei o que voc\u00EA quer e o que voc\u00EA precisa,"
				+ " eu sei da guerra, mas por que eu deveria te ajudar ao inv\u00E9s de" + " lutar com os meus?";

		tx[10] = "Voc\u00EA:\n\nPorque n\u00F3s temos um plano para...";

		tx[11] = "Terraira:\n\nFoi uma pergunta ret\u00F3rica. Eu sei seus planos,"
				+ " s\u00F3 n\u00E3o sei seu valor.";

		tx[12] = "Voc\u00EA:\n\nO que voc\u00EA quer que eu fa\u00E7a?";

		tx[13] = "Terraira:\n\nFinalmente fomos ao que interessa."
				+ " Se eu for lutar com voc\u00EA, vou precisar que busque um livro para mim.";

		tx[14] = "Voc\u00EA:\n\nQual livro e onde?";

		tx[15] = "Terraira:\n\nMem\u00F3rias de Mago Esquecido."
				+ " \u00C9 um livro que cont\u00E9m alguns feiti\u00E7os antigos."
				+ " E, quanto ao local, ele est\u00E1 aqui, em uma sala que cont\u00E9m um labirinto,"
				+ " se voc\u00EA conseguir me trazer at\u00E9 o final do dia eu me juntarei a voc\u00EA.";

		tx[16] = "Terraira:\n\n As partes precisam ser unidas em uma"
				+ " ordem espec\u00EDfica de acordo com um poema, se pegar uma parte errada, ser\u00E1"
				+ " obrigado a sair e tentar de novo algumas horas depois, quando o equil\u00EDbrio do "
				+ " labirinto for restabelecido.";

		tx[17] = "Voc\u00EA:\n\n Muito bem, qual \u00E9 o poema.";

		tx[18] = "Terraira te entrega um velho pergaminho com o poema";

		tx[19] = "Voc\u00EA:\n\nMuito bem, ent\u00E3o pode se arrumar.";

		tx[20] = "Terraira:\n\n\u00C9 o que veremos.";

	}

	public void labirinto2() {

		tx = new String[1];

		tx[0] = "Voc\u00EA rapidamente pega seu caminho para a Torre Arcana e vai ter com Terraira"
				+ " novamente, dessa vez voc\u00EA desvedera o enigma do labirinto";

	}

	public void posLabirinto(int x) {

		switch (x) {
		case 1:

			tx = new String[2];

			tx[0] = " Terraira:\n\nMuito bem, voc\u00EA me provou suas capacidades," + " eu irei contigo.";

			tx[1] = "O dia termina e voc\u00EA volta para a Alameda dos Tr\u00EAs" + " Ponteiros. Vit\u00F3ria.";
			break;

		case 2:

			tx = new String[1];

			tx[0] = "Voc\u00EA sente uma forte dor de cabe\u00E7a e desmaia. Pouco depois "
					+ " voc\u00EA acorda na enfermaria.";
			break;

		}
	}

	public void Catederal() {

		tx = new String[5];

		tx[0] = "Voc\u00EA vai para os limites da Catedral  at\u00E9 encontrar uma entrada para o"
				+ "  esgoto. Para algu\u00E9m como  voc\u00EA n\u00E3o existe "
				+ "  outro meio de acesso a  esse local, especialmente  a sua pris\u00E3o. ";

		tx[1] = "Voc\u00EA segue pelo esgoto  at\u00E9 encontrar uma entrada para a parte"
				+ "  subterr\u00E2nea da Catedral,  onde fica a pris\u00E3o."
				+ "  \u00C9 um lugar escuro e \u00FAmido,  fede a medo e morte.";

		tx[2] = "se existir um inferno na Terra  com certeza aqui"
				+ "  est\u00E1 pr\u00F3ximo, voc\u00EA pensa.  Para entrar na ala"
				+ "  onde est\u00E3o as celas voc\u00EA   precisa passar por   uma grande porta.";
		;

		tx[3] = "Voc\u00EA se aproxima, pronto  para destranc\u00E1-la, mas"
				+ "  ela j\u00E1 est\u00E1 aberta  e voc\u00EA entra. ";

		tx[4] = "Uma enorme Hidra est\u00E1 guardando a sala e a porta"
				+ " se fechou, para sobreviver voc\u00EA precisa derrotar a Hidra.";

	}

	public void Hidra2() {

		tx = new String[1];

		tx[0] = "Voc\u00EA vai rapidamente para os limites da Catedral  e segue pelo esgoto, dessa vez"
				+ "  voc\u00EA derrotar\u00E1 a hidra  de uma vez por todas";

	}

	public void posHidra(int x) {

		switch (x) {
		case 1:// ganhar

			tx = new String[13];

			if (masculino) {

				tx[4] = "Voc\u00EA:\n\nSou um enviado de Cassius.  Precisamos da sua ajuda?";

			} else {

				tx[4] = "Voc\u00EA:\n\nSou uma enviada de Cassius.  Precisamos da sua ajuda?";

			}

			tx[0] = "Voc\u00EA consegue superar a  Hidra e entrar na pris\u00E3o."
					+ "  Ela \u00E9 pouco vigiada, afinal  j\u00E1 tinha um monstro"
					+ "  guardando-a. Apenas um  guarda adormecido com as  chaves";

			tx[1] = "Furtivamente voc\u00EA vai at\u00E9 ele e se  apropria delas e vai"
					+ "  em busca de Letos,   An\u00E3o. Em uma cela "
					+ "  distante l\u00E1 est\u00E1 ele,  dormindo. Voc\u00EA o acorda.";

			tx[2] = "Voc\u00EA:\n\nEst\u00E1 interessado em  ir embora deste inferno?";

			tx[3] = "Letos:\n\nCom toda certeza,  mas quem \u00E9 voc\u00EA?";

			tx[5] = "Letos:\n\nNo que eu  poderia ajudar?";

			tx[6] = "Voc\u00EA:\n\nVoc\u00EA est\u00E1 preso por matar quinze pessoas numa"
					+ " briga de bar com um machado. Treze delas" + " eram soldados altamente treinados";

			tx[7] = "Letos:\n\nE o que voc\u00EAs  querem que eu fa\u00E7a?";

			tx[8] = "Voc\u00EA:\n\nHelaria ser\u00E1 invadida por Bethesda dentro de pouco"
					+ " tempo, n\u00F3s estamos montando um grupo para lutar contra"
					+ " e sua presen\u00E7a ser\u00E1 valiosa.";

			tx[9] = "Letos:\n\nE voc\u00EA s\u00F3 vai me libertar se eu" + " me juntar a voc\u00EA?";

			tx[10] = "Voc\u00EA:\n\nPrecisamente.";

			tx[11] = "Letos:\n\nMuito bem, estou dentro. Afinal, o que" + " eu tenho a perder?";

			tx[12] = "Voc\u00EA abre a cela. O dia est\u00E1 terminando "
					+ " e voc\u00EA retorna para  a Alameda dos Tr\u00EAs Ponteiros"
					+ "  com Letos, o An\u00E3o. Vit\u00F3ria.";
			break;

		case 2:// se perder

			tx = new String[1];
			tx[0] = "Voc\u00EA n\u00E3o consegue superar a  Hidra, ela \u00E9 muito forte"
					+ "  com o pouco de for\u00E7a que  ainda lhe resta Voc\u00EA,   foge";
			break;

		}
	}

	public void finalAssassin() {

		tx = new String[5];

		tx[0] = "Termina o terceiro dia e  voc\u00EA vai para seu quarto"
				+ "  descansar. Voc\u00EA s\u00F3 ter\u00E1  algumas poucas horas"
				+ "  de sono antes de  sa\u00EDrem para colocar  o plano em pr\u00E1tica,";

		tx[1] = "ent\u00E3o \u00E9 melhor  fazer valer o tempo.  Chega a hora e voc\u00EA"
				+ "  se levanta e se prepara.  Voc\u00EAs se encontram" + "   em uma sa\u00EDda da cidade.";

		player.setQtd();
		switch (player.getQtd()) {
		case 0:

			tx[2] = "Seu grupo \u00E9 composto por voc\u00EA   , Cassius e dois" + "  outros assassinos.";
			break;

		case 1:

			if (player.getEnigma(1)) {

				tx[2] = "Seu grupo \u00E9 composto por voc\u00EA   , Cassius, Letos e dois" + "  outros assassinos.";

			} else if (player.getEnigma(2)) {

				tx[2] = "Seu grupo \u00E9 composto por voc\u00EA   , Cassius, Terraira  e dois"
						+ "  outros assassinos.";

			} else {

				tx[2] = "Seu grupo \u00E9 composto por voc\u00EA   , Cassius, Ariandra  e dois"
						+ "  outros assassinos.";

			}
			break;

		case 2:

			if (!player.getEnigma(1)) {

				tx[2] = "Seu grupo \u00E9 composto por voc\u00EA   , Cassius, Terraira, Ariandra e "
						+ "  dois outros assassinos.";

			} else if (!player.getEnigma(2)) {

				tx[2] = "Seu grupo \u00E9 composto por voc\u00EA   , Cassius, Ariandra, Letos e "
						+ " dois outros assassinos.";

			} else {

				tx[2] = "Seu grupo \u00E9 composto por voc\u00EA   , Cassius, Letos, Terraira e "
						+ " dois outros assassinos.";

			}
			break;

		case 3:

			tx[2] = "Seu grupo \u00E9 composto por voc\u00EA   , Cassius, Letos, Terraira, Ariandra"
					+ " e dois outros assassinos.";
			break;

		}

		tx[3] = "Furtivamente voc\u00EAs saem da cidade e se encaminham"
				+ " para o acampamento inimigo  enquanto todos est\u00E3o dormindo"
				+ " No acampamento voc\u00EAs pretendem causar um inc\u00EAndio.";

		tx[3] = "O inc\u00EAndio tem in\u00EDcio e as tropas come\u00E7am a acordar."
				+ " Seu objetivo \u00E9 garantir que elas  fiquem o m\u00E1ximo poss\u00EDvel"
				+ " no foco do fogo para que pere\u00E7am";

		tx[4] = "todos voc\u00EAs retiram suas armas e come\u00E7a" + " a primeira batalha da guerra.";
	}

	public void derrotaSemBonus() {

		tx = new String[4];

		tx[0] = "S\u00E3o muitos soldados e voc\u00EAs n\u00E3o conseguem"
				+ " cont\u00EA-los. Eles conseguem fugir do inc\u00EAndio"
				+ " quase intactos e est\u00E3o prontos para a guerra.";

		tx[1] = "Todo seu grupo \u00E9 massacrado e voc\u00EA perece em batalha."
				+ " Com as tropas de Bethesda despertas e prontas, Helaria \u00E9" + " invadida";

		tx[2] = "Helaria ir\u00E1 cair. Milhares de vidas s\u00E3o perdidas e a cidade"
				+ " \u00E9 massacrada, a hist\u00F3ria de Helaria \u00E9 esquecida" + "  assim como seu povo.";

		tx[3] = "FIM DE JOGO! ...";

	}

	public void derrotaComBonusOuVitoriaSemRecrutas() {

		tx = new String[2];

		tx[0] = "S\u00E3o muitos soldados e voc\u00EAs n\u00E3o conseguem"
				+ " cont\u00EA-los. mesmo com  v\u00E1rios ca\u00EDdos eles conseguem"
				+ " fugir do inc\u00EAndio em grande n\u00FAmero" + " e est\u00E3o prontos para a guerra.";

		tx[1] = "Todo seu grupo \u00E9 massacrado, no entanto voc\u00EA ainda est\u00E1 vivo.";

		choice = "O que voc\u00EA ir\u00E1 fazer?";
		op1 = "Lutar";
		op2 = "Fugir";

	}

	public void derrotaComBonusOuVitoriaSemRecrutas2(int x) {

		switch (x) {
		case 1:// lutar

			tx = new String[4];

			tx[0] = "Voc\u00EA fugiu uma vez de Bethesda em sua adolesc\u00EAncia,"
					+ " n\u00E3o ir\u00E1 fugir agora. Voc\u00EA volta para Helaria para ter"
					+ " sua \u00FAltima batalha.";

			tx[1] = "Helaria n\u00E3o est\u00E1 preparada e nem tem for\u00E7as"
					+ " suficientes para resistir um ataque massivo e Bethesda, n\u00E3o existem"
					+ " esperan\u00E7as, Helaria cair\u00E1";

			tx[2] = "E Helaria cai, voc\u00EA cai, um massacre acontece e"
					+ " grande parte de seu povo desaparece, mas ainda"
					+ " existe uma parcela que est\u00E1 viva e eles ser\u00E3o os respons\u00E1veis"
					+ " em contar a hist\u00F3ria de Helaria,";

			tx[3] = "FIM DE JOGO! ...";
			break;

		case 2:// fugir

			tx = new String[2];

			tx[0] = "N\u00E3o \u00E9 porque Helaria cair\u00E1 que voc\u00EA tamb\u00E9m"
					+ " precisa cair. Voc\u00EA vai embora  e atravessa as montanhas,"
					+ " pronto para come\u00E7ar uma nova vida.";

			tx[1] = "Chega em terras distantes e passa a viver nelas"
					+ " como um simples alde\u00E3o, da mesma forma que sua"
					+ " vida tinha come\u00E7ado. FIM DE JOGO!";
			break;

		}

	}

	public void vitoria3Recrutados() {

		tx = new String[5];

		tx[0] = "Voc\u00EAs conseguem conter nas chamas uma for\u00E7a"
				+ " significativa de Bethesda. Agora com as tropas  flageladas, Bethesda j\u00E1"
				+ " n\u00E3o representa uma amea\u00E7a t\u00E3o grande.";

		tx[1] = "Helaria v\u00EA as chamas e envia suas tropas para acabar com o que"
				+ " resta das tropas de Bethesda. Uma violenta batalha se"
				+ " inicia e voc\u00EA e seu grupo tomam parte.";

		tx[2] = "As tropas de Bethesda s\u00E3o dizimadas enquanto que as de Helaria est\u00E3o"
				+ " quase inteiras. O rei. deseja saber quem foi o respons\u00E1vel por essa"
				+ " vit\u00F3ria e encontra voc\u00EAs.";

		tx[3] = "Todos recebem o t\u00EDtulo de Guardi\u00E3o Protetor de"
				+ " Helaria e sempre ser\u00E3o ouvidos nas reuni\u00F5es reais"
				+ " Helaria muda muito depois da guerra e de sua  ascens\u00E3o";

		tx[4] = "O povo passa a ter mais voz e cada vez mais se aproxima"
				+ " de um lugar ideal a se viver. PARAB\u00C9NS! VOCÊ TERMINOU O JOGO!";

	}

	public void vitoriaDoisRecrutados() {

		tx = new String[6];

		tx[0] = "Grande parte das tropas do acampamento s\u00E3o mortas ou aleijadas, mas ainda"
				+ " tem uma quantidade  significativa pronta para lutar.";

		tx[1] = "Uma batalha se inicia e tropas de Bethesda e Helaria alertadas"
				+ "  pelo inc\u00EAndio chegam para participar";

		tx[2] = "A batalha \u00E9 violenta e muitos soldados dos dois lados s\u00E3o mortos,"
				+ " mas no final Helaria vence e a cidade permanece intacta.";

		tx[3] = "Depois da guerra o Rei procura pelos respons\u00E1veis"
				+ " pela vit\u00F3ria. Todos voc\u00EAs s\u00E3o recompensados"
				+ " com o t\u00EDtulo de Lordes Guerreiros de Helaria";

		tx[4] = "Depois dessa guerra Helaria come\u00E7a a se militarizar intensamente"
				+ " ao ponto do ex\u00E9rcito se tornar a institui\u00E7\u00E3o mais importante" + " do Estado.";

		tx[5] = "Voc\u00EAs tiveram a vit\u00F3ria, mas voc\u00EA s\u00F3 n\u00E3o sabe"
				+ " at\u00E9 que ponto ela valeu a pena. PARAB\u00C9NS SOLDADO!" + " VOCÊ TERMINOU O JOGO!";

	}

	public void vitoriaUmRecrutado() {

		tx = new String[8];

		if (masculino) {

			tx[7] = "PARAB\u00C9NS AVENTUREIRO! VOCÊ TERMINOU O JOGO!";

		} else {

			tx[7] = "PARAB\u00C9NS AVENTUREIRA! VOCÊ TERMINOU O JOGO!";

		}

		tx[0] = "As tropas inimigas s\u00E3o muito numerosas e voc\u00EAs"
				+ " conseguem eliminar apenas uma parte delas. O inc\u00EAndio desperta"
				+ " o restante das tropas de Bethesda";

		tx[1] = "Uma violenta batalha \u00E9 iniciada marcada no in\u00EDcio pelo avan\u00E7o"
				+ "  de Bethesda at\u00E9 entrar nos muros da cidade.";

		tx[2] = "Quando a guerra chega no interior da cidade, Helaria come\u00E7a a virar"
				+ " a situa\u00E7\u00E3o e Bethesda come\u00E7a a perder.";

		tx[3] = "Voc\u00EAs lutam bravamente at\u00E9 suas \u00FAltimas for\u00E7as,"
				+ " mas no fim perecem para proteger Helaria.";

		tx[4] = "Grande parte de Helaria \u00E9 destru\u00EDda, mas no fim ela sai vitoriosa."
				+ " O Rei procura pelos respons\u00E1veis pelo inc\u00EAndio"
				+ " que possibilitou a vit\u00F3ria e descobre suas hist\u00F3rias.";

		tx[5] = "Um monumento \u00E9 erguido em suas homenagens para que todos se"
				+ " lembrem dos salvadores de Helaria para sempre.";

		tx[6] = "Os anos passam e Helaria \u00E9 reconstru\u00EDda. Hoje,"
				+ " todos sabem da hist\u00F3ria da grande guerra e de quem foram os her\u00F3is"
				+ " que deram suas vidas para salvar a cidade.";
	}

}