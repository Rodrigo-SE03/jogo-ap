package bibliotecas;


public class Biblio_Guerreiro extends Biblioteca {

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

	public void grr_1() { // 3 opcoes

		tx = new String[5];
		linhas = new int[5];

		if (masculino) {

			tx[0] = "Quinze anos se passaram desde que  voc\u00EA entrou para a Guarda Real. Voc\u00EA "
					+ " foi acolhido e eles se tornaram sua  nova fam\u00EDlia, em especial o Capit\u00E3o"
					+ " Alexander, atualmente General "
					+ " Alexander e voc\u00EA \u00E9 o novo Capit\u00E3o do  mesmo S\u00E9timo Comando. "
					+ "";
			linhas[0] = 6;

			tx[2] = "Hoje voc\u00EA \u00E9 um dos melhores  combatentes que Helaria j\u00E1 viu um "
					+ " diplomata extremamente habilidoso,  tudo isso gra\u00E7as a Alexander e a seu "
					+ " irm\u00E3o, assassinado h\u00E1 poucos anos  pela Guilda Vigilante. ";
			linhas[2] = 5;

		} else {

			tx[0] = "Quinze anos se passaram desde que  voc\u00EA entrou para a Guarda Real. Voc\u00EA "
					+ " foi acolhida e eles se tornaram sua  nova fam\u00EDlia, em especial o Capit\u00E3o"
					+ " Alexander, atualmente General  Alexander e voc\u00EA \u00E9 a nova Capit\u00E3 do "
					+ " mesmo S\u00E9timo Comando. ";
			linhas[0] = 6;

			tx[2] = "Hoje voc\u00EA \u00E9 uma das melhores  combatentes que Helaria j\u00E1 viu uma "
					+ " diplomata extremamente habilidosa,  tudo isso gra\u00E7as a Alexander e a seu "
					+ " irm\u00E3o, assassinado h\u00E1 poucos anos  pela Guilda Vigilante. ";
			linhas[2] = 5;
		}

		tx[1] = "Em todo esse per\u00EDodo Alexander  atuou como um pai para voc\u00EA, um  "
				+ " amigo nos momentos em que voc\u00EA  precisava e, principalmente um "
				+ " mentor em todos os momentos, te  treinou nas artes de combate e na "
				+ " diplomacia. ";
		linhas[1] = 6;

		tx[3] = "Voc\u00EAs sentem muita falta dele, afinal  ele era um membro da fam\u00EDlia, mas "
				+ " juntos conseguiram superar sua  morte, por\u00E9m nunca conseguiram "
				+ "  prender os culpados. ";
		linhas[3] = 4;

		tx[4] = "Hoje voc\u00EA acorda com a chegada de   um mensageiro em seus aposentos, "
				+ "  General Alexander pede seu  comparecimento imediato em seus  aposentos."
				+ "";
		linhas[4] = 4;

		choice = "Nos aposentos do general voc\u00EA tem "
				+ "  algumas op\u00E7\u00F3es para comer, o que ser\u00E1?";

		op1 = "Caf\u00E9 com p\u00E3es e roscas ";

		op2 = "Leite com fatias de bolo ";

		op3 = "Vinho com frutas ";

	}

	public void grr_2(int x) { // apos termino do metodo ir para o mapa

		tx = new String[16];
		linhas = new int[16];

		switch (x) {
		case 1:
			tx[0] = "Alexander: \n\nVoc\u00EA sempre gostou das coisas  mais b\u00E1sicas."
					+ "";
			linhas[0] = 3;
			break;
		case 2:
			tx[0] = "Alexander: \n\nParece que algu\u00E9m tem um  apetite por doces"
					+ "";
			linhas[0] = 3;
			break;
		case 3:
			tx[0] = "Alexander: \n\nUma refei\u00E7\u00E3o refinada para "
					+ " algu\u00E9m de h\u00E1bitos refinados";
			linhas[0] = 3;
			break;
		}

		tx[1] = "Voc\u00EA:\n\nAgora que terminamos de comer, por"
				+ " que me chamou aqui t\u00E3o de repente?";
		linhas[1] = 3;

		tx[2] = "Alexander:\n\nOntem de noite o Imp\u00E9rio de "
				+ " Bethesda declarou guerra contra Helaria. ";
		linhas[2] = 4;

		tx[3] = "Voc\u00EA fica em choque com essa  informa\u00E7\u00E3o, uma guerra sendo "
				+ " iniciada sem nenhum precedente, de forma t\u00E3o s\u00FAbita. ";
		linhas[3] = 3;

		tx[4] = "Desde que voc\u00EA entrou na Guarda  Real isso nunca tinha acontecido, "
				+ " ainda mais que o oponente em  quest\u00E3o \u00E9 o Imp\u00E9rio Bethesda";
		linhas[4] = 3;

		tx[5] = "Voc\u00EA:\n\nO que voc\u00EA quer dizer com isso,  General? ";
		linhas[5] = 3;

		tx[6] = "Alexander:\n\nAparentemente Bethesda tem  interesse nestas ricas terras de "
				+ " Helaria e, para eles conseguirem o  que querem, n\u00F3s precisamos sair. ";
		linhas[6] = 5;

		tx[7] = "Voc\u00EA:\n\nMas, Bethesda? ";
		linhas[7] = 2;

		tx[8] = "Alexander:\n\nForam eles que destru\u00EDram sua vila e "
				+ " mataram sua fam\u00EDlia, n\u00E3o foi?";
		linhas[8] = 3;

		tx[9] = "Voc\u00EA:\n\nSim... ";
		linhas[9] = 2;

		tx[10] = "Alexander:\n\n" + player.getNome() + ", pe\u00E7o que mantenha sua "
				+ " cabe\u00E7a no lugar nesta guerra que se  aproxima. Sei o quanto deseja se "
				+ " vingar deles, mas est\u00E1 em jogo algo  muito maior.";
		linhas[10] = 6;

		tx[11] = "Alexander:\n\nN\u00E3o deixe que seu \u00F3dio e "
				+ " seu desejo de vingan\u00E7a tomem conta"
				+ " de suas a\u00E7\u00F5es. \u00C1s vezes as atitudes  "
				+ " de uma pessoa podem mudar o rumo   de uma guerra totalmente.  ";
		linhas[11] = 6;

		tx[12] = "Voc\u00EA: \n\nSim, eu sei disso. Eu n\u00E3o deixarei "
				+ " minhas emo\u00E7\u00F5es tomarem conta de mim e farei o que for preciso para"
				+ " proteger Helaria e vencer a guerra.";
		linhas[12] = 5;

		tx[13] = "A conversa continua por mais algum  tempo, Alexander te esclarece sobre os "
				+ " detalhes conhecidos da guerra e voc\u00EA fica sabendo que as tropas de Bethesda "
				+ " est\u00E3o se aproximando de Helaria e tem "
				+ " previs\u00E3o de chegada de tr\u00EAs dias. ";
		linhas[13] = 5;

		tx[14] = "Voc\u00EA sai dos aposentos do General "
				+ " Alexander com tr\u00EAs miss\u00F5es, conseguir "
				+ " os mapas do subterr\u00E2neo da cidade na  Catedral, recrutar os arcanos treinados "
				+ " em combate na Torre Arcana e conseguir a ajuda do ladr\u00E3o Kelastar, na Alameda "
				+ " dos Tr\u00EAs Ponteiros. Para onde voc\u00EA ir\u00E1 ";
		linhas[14] = 6;

		tx[15] = "Para onde voc\u00EA ir\u00E1 primeiro ? ";
		linhas[15] = 1;

	}

	public void grr_3_catedral() {

		tx = new String[3];
		linhas = new int[3];

		tx[0] = "O mapa est\u00E1 nos arquivos da  Igreja, mas n\u00E3o ser\u00E1 f\u00E1cil "
				+ " conseguir. J\u00E1 tem alguns anos  que a Igreja rompeu com a "
				+ " Guarda Real e se recusa a  cooperar em diversos assuntos, "
				+ " inclusive relativos \u00E0 seguran\u00E7a  nacional. ";
		linhas[0] = 7;

		tx[1] = "Voc\u00EA deve conseguir o mapa  com a Igreja de qualquer forma, "
				+ " mas primeiro voc\u00EA deve tentar  vias diplom\u00E1ticas. ";
		linhas[1] = 3;

		tx[2] = "Na mesma manh\u00E3 voc\u00EA se  encaminha para a Catedral, "
				+ " chegando l\u00E1 pede para falar com o Bispo. Ele te atende e"
				+ " ent\u00E3o come\u00E7a a discuss\u00E3o. ";
		linhas[2] = 4;

		if (masculino) {
			choice = "Bispo:\n\nAceita alguma bebida, Capit\u00E3o? ";
		} else {
			choice = "Bispo:\n\nAceita alguma bebida, Capit\u00E3? ";
		}

		op1 = "Vinho";

		op2 = "Licor";

		op3 = "Nada agora, obrigado.";
	}

	public void grr_4_catedral(int x) { // cinismo ou agressao

		int y = 0;
		switch (x) {
		case 1:
			tx = new String[12];
			linhas = new int[12];
			if (masculino) {
				tx[0] = "Bispo: \n\nNada melhor que um bom e "
						+ " tradicional vinho, n\u00E3o \u00E9 mesmo  capit\u00E3o? ";
				linhas[0] = 4;
			} else
				tx[0] = "Bispo: \n\nNada melhor que um bom e "
						+ " tradicional vinho, n\u00E3o \u00EA mesmo  capit\u00E3? ";
			linhas[0] = 4;

			tx[1] = "Voc\u00EA\n\n N\u00E3o posso dizer que discordo de voc\u00EA.";
			linhas[1] = 2;
			y = 2;
			break;
		case 2:
			tx = new String[12];
			linhas = new int[12];

			tx[0] = "Bispo:\n\nVejo que voc\u00EA tem um paladar  refinado. ";
			linhas[0] = 3;

			tx[1] = "Voc\u00EA\n\n Nada melhor do que frutas com \u00E1lcool.";
			linhas[1] = 2;
			y = 2;
			break;
		case 3:
			tx = new String[11];
			linhas = new int[11];
			tx[0] = "Bispo: \n\nSe este \u00E9 o seu desejo, nada  posso fazer. ";
			linhas[0] = 3;
			y = 1;
		}
		if (masculino) {
			tx[y + 0] = "Bispo:\n\nMas vamos ao que interessa, o que"
					+ " um capit\u00E3o da Guarda Real est\u00E1 fazendo aqui?";
			linhas[y + 0] = 4;
		} else {
			tx[y + 0] = "Bispo:\n\nMas vamos ao que interessa, o que"
					+ " uma capit\u00E3 da Guarda Real est\u00E1 fazendo aqui?";
			linhas[y + 0] = 4;
		}

		tx[y + 1] = "Voc\u00EA:\n\nVim a mando do General  Alexander, tem algo em posse"
				+ " da Catedral que interessa a  Guarda Real.";
		linhas[y + 1] = 5;

		tx[y + 2] = "Bispo:\n\nE o que seria isso?";
		linhas[y + 2] = 2;

		tx[y + 3] = "Voc\u00EA:\n\nMapas, do subterr\u00E2neo da "
				+ " cidade, preciso de todos que a  Igreja possuir. ";
		linhas[y + 3] = 4;

		tx[y + 4] = "Bispo:\n\nE por que eu daria para voc\u00EA? "
				+ " O que n\u00F3s vamos ganhar com  isso? ";
		linhas[y + 4] = 4;

		tx[y + 5] = "Voc\u00EA:\n\nA prote\u00E7\u00E3o da cidade, n\u00E3o sei "
				+ " se o senhor sabe, mas Bethesda  est\u00E1 se aproximando e ela vai "
				+ " destruir todos n\u00F3s. ";
		linhas[y + 5] = 5;

		tx[y + 6] = "Bispo:\n\nTodos voc\u00EAs no caso. ";
		linhas[y + 6] = 2;

		tx[y + 7] = "Bispo:\n\nBethesda compartilha da  mesma f\u00EA que Helaria, eles "
				+ " nunca amea\u00E7ariam a Igreja.";
		linhas[y + 7] = 4;

		tx[y + 8] = "Voc\u00EA:\n\nComo voc\u00EA pode ser t\u00E3o "
				+ " ego\u00EDsta? Pense em quantas  pessoas v\u00E3o morrer se n\u00F3s "
				+ " falharmos em proteger a  cidade. ";
		linhas[y + 8] = 6;

		tx[y + 9] = "Bispo:\n\nHelarianos v\u00E3o morrer se "
				+ " voc\u00EAs falharem e Bethesdences  ir\u00E3o morrer se voc\u00EAs vencerem. "
				+ " A Igreja n\u00E3o pode escolher  sobre a vida de dois fi\u00EAis.";
		linhas[y + 9] = 6;

		choice = "Qual \u00E9 sua resposta? ";

		op1 = "Seu cinismo me impressiona.";

		op2 = "A quest\u00E3o do mapa nunca  chegou a ser um pedido. ";

	}

	public void grr_5_catedral_cinismo() { // minigame da hidra

		tx = new String[16];
		linhas = new int[16];

		tx[0] = "Bispo:\n\nN\u00E3o \u00E9 cinismo, \u00E9 quest\u00E3o de "
				+ " \u00E9tica. Todas as vidas s\u00E3o iguais perante os deuses. N\u00E3o temos o "
				+ " direito de priorizar esta em  detrimento daquela.";
		linhas[0] = 6;

		tx[1] = "Voc\u00EA:\n\nPasse bem.";
		linhas[1] = 2;

		tx[2] = "Bispo:\n\nIgualmente.";
		linhas[2] = 2;

		tx[3] = "Voc\u00EA vai embora da Catedral, mas agora precisa pensar em "
				+ " uma outra forma de obter esse mapa. ";
		linhas[3] = 3;

		tx[4] = "Voc\u00EA volta para o castelo para  reportar os acontecimentos para "
				+ " o General Alexander. ";
		linhas[4] = 2;

		tx[5] = "Alexander:\n\nEntendo.";
		linhas[5] = 2;

		tx[6] = "Voc\u00EA:\n\nN\u00F3s precisamos de outro plano.";
		linhas[6] = 3;

		tx[7] = "Alexander:\n\nVoc\u00EA j\u00E1 ouviu falar na pris\u00E3o "
				+ " que existe dentro da Catedral?  \u00C9 l\u00E1 que eles mant\u00E9m os infi\u00EAis "
				+ " at\u00EA o julgamento. ";
		linhas[7] = 5;

		tx[8] = "Voc\u00EA:\n\nSim, j\u00E1 ouvi falar, embora  nunca tenha ido.";
		linhas[8] = 3;

		tx[9] = "Alexander:\n\nSegundo o que se diz essa pris\u00E3o tem acesso a diversas"
				+ " partes da Catedral, inclusive aos arquivos confidenciais.";
		linhas[9] = 5;

		tx[10] = "Voc\u00EA:\n\nVoc\u00EA quer que eu invada a  pris\u00E3o, \u00E9 isso? "
				+ "";
		linhas[10] = 3;

		tx[11] = "Alexander:\n\nE me traga os mapas, mas "
				+ " tome cuidado, dizem que l\u00E1 \u00E9  um labirinto. ";
		linhas[11] = 4;

		tx[12] = "Voc\u00EA\n\nMuito bem, quando devo  partir? ";
		linhas[12] = 3;

		tx[13] = "Alexander:\n\nEsta noite, \u00E9 mais seguro.";
		linhas[13] = 2;

		tx[14] = "Voc\u00EA vai para a Catedral, mas  antes de chegar entra em bueiro "
				+ " e abre seu caminho em dire\u00E7\u00E3o "
				+ " \u00E0 pris\u00E3o. Chegando l\u00E1 voc\u00EA  come\u00E7a a procurar pelos "
				+ " arquivos, mas, quando chega no local v\u00EA que est\u00E1 guardado por "
				+ " um terr\u00EDvel monstro de muitas cabe\u00E7as.";
		linhas[14] = 8;

		tx[15] = "Aparentemente ele responde \u00E0  uma espec\u00EDfica m\u00E1quina de "
				+ " som, no entanto ela n\u00E3o est\u00E1 em  sua posse, logo s\u00F3 te resta "
				+ " enfrent\u00E1-lo. ";
		linhas[15] = 4;

	}

	public void grr_5_catedral_agressivo() { // minigame da hidra

		tx = new String[4];
		linhas = new int[4];

		if (masculino) {
			tx[1] = "Por conta de suas a\u00E7\u00F5es  voc\u00EA \u00E9 jogado na pris\u00E3o dentro "
					+ " da Catedral e agora precisa  conseguir o mapa e escapar "
					+ " antes que seja tarde demais. ";
			linhas[1] = 4;
		} else {
			tx[1] = "Por conta de suas a\u00E7\u00F5es  voc\u00EA \u00EA jogada na pris\u00E3o dentro "
					+ " da Catedral e agora precisa  conseguir o mapa e escapar "
					+ " antes que seja tarde demais. ";
			linhas[1] = 4;
		}

		tx[0] = "Voc\u00EA retira sua espada e vai  atacar o Bispo. Mas ele grita  "
				+ " pelos guardas e eles chegam antes antes que voc\u00EA consiga acertar "
				+ " o Sacerdote. ";
		linhas[0] = 4;

		tx[2] = "Chega \u00E0 noite e os guardas  est\u00E3o dormindo, voc\u00EA consegue "
				+ " arrombar a porta sem grandes  problemas. ";
		linhas[2] = 3;

		tx[3] = "Voc\u00EA foge e procura pelos  arquivos, encontra a entrada, "
				+ " mas primeiro voc\u00EA precisa  passar por uma terr\u00EDvel criatura "
				+ " que guarda a sala com apenas  uma pequena espada que voc\u00EA  encontrou. "
				+ "";
		linhas[3] = 6;
	}

	public void grr_5_catedral2Try() {
		tx = new String[1];
		linhas = new int[1];
		tx[0] = "Voc\u00EA vai para a Catedral, mas  antes de chegar entra em bueiro "
				+ " e abre seu caminho em dire\u00E7\u00E3o  \u00E0 aos arquivos à hidra ";
		linhas[0] = 3;
	}

	public void grr_6() { // caso derrote a hidra

		tx = new String[1];
		linhas = new int[1];

		tx[0] = "Agora a porta para os arquivos est\u00E1   aberta e voc\u00EA pode entrar. Demora "
				+ " algumas horas, mas eventualmente voc\u00EA "
				+ " consegue encontrar o livro que cont\u00E9m os  "
				+ " mapas. Assim que o encontra, voc\u00EA foge  da Catedral e volta para o Castelo da "
				+ " Guarda Real para descansar.";
		linhas[0] = 6;
	}

	public void grr_6catedralDerrota(int x) {

		tx = new String[2];
		linhas = new int[2];
		switch (x) {
		case 1:
			tx[0] = "A luta torna - se muito longa, voc\u00EA n\u00E3o "
					+ " conseguir\u00E1 batalhar por muito mais   tempo.";
			linhas[0] = 3;
			break;
		case 2:
			tx[0] = "A Hidra \u00E9 forte de mais e a cada ataque  "
					+ " ela cresce mais. Voc\u00EA n\u00E3o tem chances  de venc\u00EA-la agora."
					+ "";
			linhas[0] = 3;
			break;
		}
		tx[1] = "Sua \u00FAnica op\u00E7\u00E3o \u00E9 fugir, voc\u00EA se vira e "
				+ " come\u00E7a a correr, voc\u00EA encontra uma  passagem que "
				+ " d\u00E1 nos esgotos da cidade. Depois de "
				+ " restaurar suas for\u00E7as voc\u00EA pode tentar enfrentar a besta de novo."
				+ "";
		linhas[1] = 5;
	}

	public void grr_3_torre() { // dialogo antes do puzzle do labirinto na primeira vez que ele entra na torre

		tx = new String[19];
		linhas = new int[19];

		tx[0] = "Voc\u00EA precisa recrutar alguns arcanistas  para lutar ao seu lado nesta guerra. Para"
				+ " isso voc\u00EA vai para a Torre Arcana e \u00E9  recebido por arcanistas menores. "
				+ " Voc\u00EA explica o que quer l\u00E1 e eles te  encaminham para a sala onde os "
				+ " arcanistas especializados em batalha  treinam. ";
		linhas[0] = 7;

		tx[1] = "L\u00E1 voc\u00EA conversa com Muriel, a l\u00EDder"
				+ " dessa inst\u00E2ncia da Ordem Arcana.";
		linhas[1] = 1;

		tx[2] = "Muriel:\n\n O que voc\u00EA procura aqui," + player.getNome() + " ? ";
		linhas[2] = 2;

		tx[3] = "Você:\n\n Preciso da ajuda de voc\u00EAs. A guerra"
				+ " contra Bethesda se aproxima e sua ajuda  ser\u00E1 imprescind\u00EDvel.";
		linhas[3] = 4;

		tx[4] = "Muriel:\n\n Muito bem, voc\u00EA quer nossa ajuda e n\u00F3s"
				+ " queremos te ajudar, mas primeiro preciso "
				+ " que voc\u00EA prove que tipo de pessoa voc\u00EA "
				+ " \u00E9, para sabermos se vale a pena lutar ao  seu lado.";
		linhas[4] = 6;

		tx[5] = "Você:\n\n Muito bem, o que voc\u00EA quer que eu  fa\u00E7a?";
		linhas[5] = 3;

		tx[6] = "Muriel:\n\n Existe um livro de feiti\u00E7os dentro de um "
				+ " labirinto aqui. O Tratado da Magia, \u00E9 seu "
				+ " nome. Eu preciso que voc\u00EA o traga para mim at\u00E9 o final do dia.";
		linhas[6] = 5;

		tx[7] = "Você:\n\n Ah, mas vai ser f\u00E1cil ent\u00E3o.";
		linhas[7] = 2;

		tx[8] = "Muriel:\n\n A\u00ED que voc\u00EA se engana apenas aqueles "
				+ " que s\u00E3o puros de cora\u00E7\u00E3o conseguir\u00E3o "
				+ " juntar corretamente suas tr\u00EAs partes. ";
		linhas[8] = 4;

		tx[9] = "Você:\n\n S\u00E3o tr\u00EAs partes?";
		linhas[9] = 2;

		tx[10] = "Muriel:\n\n Precisamente, espalhadas pelo labirinto. ";
		linhas[10] = 2;

		tx[11] = "Você:\n\n Tudo bem, antes do fim do dia voc\u00EA ter\u00E1 esse livro."
				+ "";
		linhas[11] = 3;

		tx[12] = "Quando voc\u00EA est\u00E1 no caminho para o  labirinto Muriel te chama.";
		linhas[12] = 1;

		tx[13] = "Muriel:\n\n Espere, tem algo que preciso te dizer.";
		linhas[13] = 2;

		tx[14] = "Muriel:\n\n As partes precisam ser unidas em uma"
				+ " ordem espec\u00EDfica de acordo com um poema, se pegar uma parte errada, ser\u00E1"
				+ " obrigado a sair e tentar de novo algumas horas depois, quando o equil\u00EDbrio do "
				+ " labirinto for restabelecido.";
		linhas[14] = 7;

		tx[15] = "Você:\n\n Muito bem, qual \u00E9 o poema.";
		linhas[15] = 2;

		tx[16] = "Muriel te entrega um velho pergaminho <br/com o poema";
		linhas[16] = 1;

		if(masculino) {
			tx[17] = "Você:\n\n Obrigado, agora se prepare para se  juntar a minha equipe.";
			linhas[17] = 3;
		}else {
			tx[17] = "Você:\n\n Obrigada, agora se prepare para se  juntar a minha equipe.";
			linhas[17] = 3;
		}
		

		tx[18] = "Voc\u00EA vai para o labirinto.";
		linhas[18] = 1;
	}

	public void grr_3_torre2Try() {
		tx = new String[1];
		linhas = new int[1];
		tx[0] = "Você se dirige imediatamente ao labirinto para buscar os livros de Muriel."
				+ "";
		linhas[0] = 2;
	}

	public void grr_4_torre_win() {

		tx = new String[1];
		linhas = new int[1];

		tx[0] = "Voc\u00EA consegue juntar todas as partes e  entrega o livro para Muriel. Ela e sua"
				+ " equipe ir\u00E3o se juntar a voc\u00EA nesta guerra. "
				+ " Voc\u00EA volta para o Castelo da Guarda  Real para descansar.";
		linhas[0] = 5;

	}

	public void grr_4_torre_lose() { // se nao houver mais tempo mostrar uma mensagem diferente

		tx = new String[1];
		linhas = new int[1];

		tx[0] = "Voc\u00EA sente uma grande energia indo em "
				+ " sua dire\u00E7\u00E3o e precisa sair do labirinto "
				+ " para que o equil\u00EDbrio seja reestabelecido. "
				+ " Algumas horas se passam e voc\u00EA pode  tentar novamente.";
		linhas[0] = 5;
	}

	public void grr_3_alameda() { // dialogo antes do puzzle da porta na primeira vez que ele entra na alameda

		tx = new String[19];
		linhas = new int[19];

		if (masculino) {
			tx[2] = "Voz:\n\nParem, ele \u00E9 meu.";
			linhas[2] = 2;

			tx[4] = "Kelastar:\n\nSou Kelastar. Ouvi que estava "
					+ " procurando por mim e vim pessoalmente "
					+ " ao seu encontro. N\u00E3o \u00E9 sempre que um "
					+ " Capit\u00E3o da Guarda Real vem me  procurar, pelo menos n\u00E3o em paz eu "
					+ " suponho. ";
			linhas[4] = 7;

			tx[8] = "Kelastar:\n\n O que voc\u00EA quer comigo, capit\u00E3o? ";
			linhas[8] = 2;
		} else {
			tx[2] = "Voz:\n\nParem, ela \u00E9 minha.";
			linhas[2] = 2;

			tx[4] = "Kelastar:\n\nSou Kelastar. Ouvi que estava "
					+ " procurando por mim e vim pessoalmente "
					+ " ao seu encontro. N\u00E3o \u00E9 sempre que uma "
					+ " Capit\u00E3 da Guarda Real vem me  procurar, pelo menos n\u00E3o em paz eu "
					+ " suponho. ";
			linhas[4] = 7;

			tx[8] = "Kelastar:\n\n O que voc\u00EA quer comigo, capit\u00E3? ";
			linhas[8] = 2;
		}

		tx[0] = "Voc\u00EA vai para a Alameda dos Tr\u00EAs "
				+ " Ponteiros a procura do ladr\u00E3o Kelastar. Segundo suas fontes ele costuma ficar no "
				+ " Beco da Garganta Degolada e \u00E9 para l\u00E1  que voc\u00EA vai.";
		linhas[0] = 4;

		tx[1] = "Quando voc\u00EA chega, algumas pessoas come\u00E7am a se aproximar em forma de"
				+ " uma emboscada, mas de repente uma voz:";
		linhas[1] = 2;

		tx[3] = "Voc\u00EA:\n\nQuem \u00E9 voc\u00EA?";
		linhas[3] = 2;

		tx[5] = "Voc\u00EA:\n\nEu n\u00E3o diria paz... Podemos conversar"
				+ " em um local um pouco mais privado? ";
		linhas[5] = 3;

		tx[6] = "Kalastar:\n\n Vamos para meu escrit\u00F3rio ent\u00E3o. ";
		linhas[6] = 2;

		tx[7] = "Kelastar lidera o caminho e voc\u00EA o segue"
				+ " O escrit\u00F3rio \u00E9 um lugar sujo e feio, tudo l\u00E1 "
				+ " lembra decad\u00EAncia e corrup\u00E7\u00E3o, mas "
				+ " voc\u00EAs est\u00E3o sozinhos e \u00E9 isso que  importa.";
		linhas[7] = 4;

		tx[9] = "Voc\u00EA:\n\n Voc\u00EA \u00E9 um dos ladr\u00F5es mais habilidosos"
				+ " dessa cidade, dizem que n\u00E3o exista uma "
				+ " porta que voc\u00EA n\u00E3o consiga arrombar, um local que n\u00E3o consiga roubar."
				+ "";
		linhas[9] = 5;

		tx[10] = "Kalastar:\n\n  Ok, al\u00E9m de afirmar o \u00F3bvio, o que voc\u00EA"
				+ " veio fazer aqui?";
		linhas[10] = 3;

		tx[11] = "Voc\u00EA:\n\n Preciso das suas habilidades. Uma "
				+ " guerra est\u00E1 vindo e estou montando uma  equipe. Os melhores da Guarda Real, da"
				+ " Torre Arcana e da Alameda dos Tr\u00EAs"
				+ " Ponteiros e n\u00F3s queremos voc\u00EA e os seus dentro.";
		linhas[11] = 7;

		tx[12] = "Kalastar:\n\n Hum... Parece interessante, mas o que  eu ganho com isso?"
				+ "";
		linhas[12] = 3;

		tx[13] = "Voc\u00EA:\n\n Sobreviv\u00EAncia, se voc\u00EA n\u00E3o nos ajudar"
				+ " a cidade cair\u00E1.";
		linhas[13] = 3;

		tx[14] = "Kalastar:\n\n  Disso eu sei, mas quero saber al\u00E9m "
				+ " disso. Estou falando de dinheiro, t\u00EDtulos.";
		linhas[14] = 3;

		tx[15] = "Voc\u00EA:\n\n N\u00E3o posso prometer t\u00EDtulos, mas ter\u00E1 "
				+ " todo o dinheiro com que puder sonhar. ";
		linhas[15] = 3;

		tx[16] = "Kalastar:\n\n  Eu posso sonhar com quantidades bem "
				+ " altas... De qualquer forma, eu preciso "
				+ " saber se posso confiar em voc\u00EA, s\u00F3 que ao modo de Tr\u00EAs Ponteiros."
				+ "";
		linhas[16] = 5;

		tx[17] = "Voc\u00EA:\n\n O que voc\u00EA quer que eu fa\u00E7a?";
		linhas[17] = 2;

		tx[18] = "Kalastar:\n\nEst\u00E1 vendo aquela porta? Prove para"
				+ " mim que voc\u00EA consegue abri-la com sua "
				+ " intelig\u00EAncia, assim saberei o tipo de  pessoa que lutarei ao lado.";
		linhas[18] = 5;

	}

	public void grr_3_alameda2Try() {
		tx = new String[1];
		linhas = new int[1];

		tx[0] = "Você se dirige a porta, pronto para novamente tentar abri-la  ";
		linhas[0] = 2;
	}

	public void grr_4_alameda_win() {

		tx = new String[3];
		linhas = new int[3];

		tx[0] = "Kalastar:\n\n Voc\u00EA tem seu valor. A Alameda dos Tr\u00EAs"
				+ " Ponteiros lutar\u00E1 ao seu lado.";
		linhas[0] = 3;

		tx[1] = "Voc\u00EA:\n\n Agrade\u00E7o.";
		linhas[1] = 2;

		tx[2] = "O dia est\u00E1 acabando e voc\u00EA volta vitorioso para o castelo.";
		linhas[2] = 1;
	}

	public void grr_4_alameda_lose() {

		tx = new String[1];
		linhas = new int[1];

		tx[0] = "A porta n\u00E3o se abre. Voc\u00EA olha para "
				+ " Kelastar e ele te d\u00E1 um olhar permitindo mais uma tentativa. ";
		linhas[0] = 2;
	}

	public void grr_5_com_map() { // consegue mapa - minigame daniel

		tx = new String[4];
		linhas = new int[4];

		tx[0] = "O terceiro dia est\u00E1 chegando ao fim e "
				+ " Alexander analisou os mapas. Voc\u00EAs ir\u00E3o"
				+ " montar uma linha de defesa nos esgotos "
				+ " abaixo do mercado. \u00C9 um ponto fr\u00E1gil e"
				+ " que o inimigo pode usar para um r\u00E1pido acesso ao interior da cidade.";
		linhas[0] = 5;

		tx[1] = "Voc\u00EA vai dormir para se preparar para o dia seguinte.";
		linhas[1] = 1;

		tx[2] = "No dia seguinte sua equipe se encontra  na entrada do esgoto e voc\u00EAs "
				+ " prosseguem at\u00E9 a parte central, melhor"
				+ " posi\u00E7\u00E3o para montar uma emboscada.";
		linhas[2] = 3;

		tx[3] = "Voc\u00EA ouve sons, as tropas de Bethesda "
				+ " est\u00E3o se aproximando, voc\u00EAs devem ficar  a postos.";
		linhas[3] = 2;
	}

	public void grr_6_kelastar() { // se conseguir mapa e arrombou porta

		tx = new String[3];
		linhas = new int[3];

		tx[0] = "Voc\u00EAs est\u00E3o conseguindo conter as "
				+ " tropas inimigas, mas elas n\u00E3o param de"
				+ " chegar. Ent\u00E3o, voc\u00EA ouve um grito, "
				+ " Kelastar est\u00E1 sinalizando para voc\u00EAs procurarem abrigo em um piso superior,"
				+ " ele abriu as comportas que retinham \u00E1gua no esgoto.";
		linhas[0] = 6;

		tx[1] = "As tropas de Bethesda foram   severamente flageladas e Helaria   "
				+ " consegue uma vit\u00F3ria f\u00E1cil. Todos voc\u00EAs "
				+ " conseguem gl\u00F3ria perante a cidade,   t\u00EDtulos e ouro, como Kelastar queria."
				+ "";
		linhas[1] = 4;

		tx[2] = "Depois da guerra Helaria se torna um  local melhor para se viver com a uni\u00E3o de"
				+ " seus habitantes e voc\u00EA teve um papel  importante nisso.";
		linhas[2] = 3;

	}

	public void grr_6_muriel() { // se conseguir mapa e arrombou porta

		tx = new String[3];
		linhas = new int[3];

		tx[0] = "Voc\u00EAs est\u00E3o conseguindo conter grande  parte das tropas inimigas, mas uma "
				+ " quantidade significativa ainda consegue passar por voc\u00EAs. Bethesda consegue "
				+ " invadir um peda\u00E7o da cidade e tanto l\u00E1 "
				+ " em cima, como aqui em baixo est\u00E1 tendo uma violenta batalha.";
		linhas[0] = 6;

		tx[1] = "No fim do dia as tropas de Bethesda minguam e Helaria sai vencedora da "
				+ " guerra, no entanto uma parte significativa  "
				+ " da cidade foi destru\u00EDda e muitas pessoas  foram mortas.";
		linhas[1] = 4;

		tx[2] = "Voc\u00EAs s\u00E3o homenageados pelo rei e  "
				+ " recebem t\u00EDtulos e posses. Agora voc\u00EA \u00E9"
				+ " escutado pelo rei. Voc\u00EA pretende levar  Helaria para um novo rumo e "
				+ " provavelmente conseguir\u00E1.";
		linhas[2] = 4;

	}

	public void grr_6_ninguem() {

		tx = new String[2];
		linhas = new int[2];

		tx[0] = "As tropas inimigas s\u00E3o muitas e uma  parte significativa delas consegue passar "
				+ " por voc\u00EAs. Na cidade e embaixo dela se d\u00E3o batalhas violentas.";
		linhas[0] = 3;

		tx[1] = "Voc\u00EAs resistem at\u00E9 suas \u00FAltimas for\u00E7as,  "
				+ " mas quando o \u00FAltimo soldado de  Bethesda cai por suas m\u00E3os, voc\u00EA cai "
				+ " junto com ele. Helaria conseguiu vencer a "
				+ " guerra e voc\u00EA sabe disso, agora voc\u00EA  pode morrer em paz.";
		linhas[1] = 6;

	}

	public void grr_6_lose() {

		tx = new String[2];
		linhas = new int[2];

		tx[0] = "As tropas inimigas s\u00E3o muito numerosas, elas conseguem esmagar suas defesas e "
				+ " passar sem problemas, deixando uma  mancha com seu sangue no ch\u00E3o. "
				+ " Helaria \u00E9 totalmente invadida e n\u00E3o tem"
				+ " esperan\u00E7as de sobreviv\u00EAncia, destinada  ao esquecimento.";
		linhas[0] = 6;

		tx[1] = "Esse \u00E9 o mesmo destino de seu corpo  inerte, ser esquecido e devorado pelos"
				+ " vermes. Um her\u00F3i esquecido de uma   cidade esquecida. ";
		linhas[1] = 3;
	}

	public void grr_5_sem_mapa() {

		tx = new String[3];
		linhas = new int[3];

		tx[0] = "O terceiro dia chega, mas sem os  mapas da cidade \u00E9 imposs\u00EDvel verificar os "
				+ " pontos de fraqueza subterr\u00E2neos, por  isso sua equipe \u00E9 encarregada de"
				+ " defender o port\u00E3o principal.";
		linhas[0] = 4;

		tx[1] = "De noite voc\u00EA vai para seu quarto  e descansa at\u00E9 o dia seguinte. Amanhece"
				+ " e chega a hora, voc\u00EA deve se arrumar  para a batalha.";
		linhas[1] = 3;

		tx[2] = "Voc\u00EA encontra seus companheiros  na porta da cidade, prontos para morrer "
				+ " por ela. Os inimigos se aproximam. ";
		linhas[2] = 2;

	}

	public void grr_6_sem_mapa_win_dois_rec() {

		tx = new String[3];
		linhas = new int[3];

		tx[0] = "Voc\u00EAs est\u00E3o conseguindo conter o  avan\u00E7o das tropas inimigas com"
				+ " facilidade, at\u00E9 em excesso. Ent\u00E3o, voc\u00EAs "
				+ " recebem um ataque por tr\u00E1s, parte das tropas inimigas pegou uma rota pelos"
				+ " subterr\u00E2neos e te surpreendeu. Voc\u00EAs est\u00E3o lutando em duas frentes."
				+ "";
		linhas[0] = 6;

		tx[1] = "A batalha est\u00E1 complicada, mas voc\u00EA tem"
				+ " os n\u00FAmeros necess\u00E1rios para a vit\u00F3ria. "
				+ " Mesmo com voc\u00EAs lutando em duas frentes Bethesda come\u00E7a a recuar e n\u00E3o "
				+ " demora muito a ser derrotada. Uma  pequena parte de Helaria \u00E9 destru\u00EDda, e "
				+ " muitas vidas foram perdidas, mas Helaria permanece.";
		linhas[1] = 7;

		tx[2] = "Voc\u00EAs s\u00E3o homenageados pelo rei e"
				+ " recebem t\u00EDtulos e ouro, saciando a  vontade de Kelastar. Voc\u00EA recebe um "
				+ " cargo de conselheiro do Rei e tem muitos planos ambiciosos para a cidade. Helaria "
				+ " tem um futuro brilhante em seu caminho.";
		linhas[2] = 5;

	}

	public void grr_6_sem_mapa_win_um_rec() {

		tx = new String[3];
		linhas = new int[3];

		tx[0] = "Voc\u00EAs est\u00E3o conseguindo segurar as "
				+ " tropas inimigas com relativa facilidade,  mas s\u00E3o surpreendidos por um ataque"
				+ " traseiro, Bethesda invadiu Helaria pelos"
				+ " subterr\u00E2neos. A mais violenta batalha j\u00E1 "
				+ " vista tem in\u00EDcio. Muitos s\u00E3o os mortos e"
				+ " uma grande parte da cidade \u00E9 destru\u00EDda, "
				+ " mas no fim do dia as tropas de Bethesda  minguam e Helaria sai vitoriosa.";
		linhas[0] = 8;

		tx[1] = "O Rei decide homenagear sua equipe por ser a primeira linha de defesa da cidade."
				+ " Todos que sobreviveram recebem t\u00EDtulos "
				+ " e posses e voc\u00EA recebe um lugar especia no Conselho da Guerra Real. O Rei"
				+ " planeja militarizar a cidade e voc\u00EA tem um"
				+ " voc\u00EA tem um papel importante nesses  planos.";
		linhas[1] = 7;

		tx[2] = "Helaria um Estado Militar. At\u00E9 o dia de sua morte voc\u00EA se perguntou se "
				+ " suas decis\u00F5es na vida e na guerra foram  as corretas.";
		linhas[2] = 5;

	}

	public void grr_6_sem_mapa_win_sem_rec() {

		tx = new String[5];
		linhas = new int[5];

		tx[0] = "Voc\u00EAs est\u00E3o conseguindo conter "
				+ " com dificuldade as tropas inimigas, eles "
				+ " est\u00E3o em um n\u00FAmero muito maior. Ent\u00E3o, "
				+ " uma grande quantidade de tropas de  Bethesda ataca voc\u00EAs por tr\u00E1s, elas"
				+ " chegaram pelos subterr\u00E2neos da cidade. ";
		linhas[0] = 5;

		tx[1] = "Voc\u00EAs est\u00E3o em uma grande   desvantagem num\u00E9rica, de dez para um, "
				+ " mas como se diz, um soldado de Helaria vale por dez outros."
				+ "\n\nVoc\u00EAs lutam at\u00E9 suas \u00FAltimas"
				+ " for\u00E7as, at\u00E9 o \u00FAltimo soldado de Bethesda"
				+ " cair por suas m\u00E3os nuas, contigo caindo  tamb\u00E9m.";
		linhas[1] = 8;

		tx[2] = "Helaria sai vitoriosa, mas \u00E9 quase totalmente destru\u00EDda. Todos os que"
				+ " lutaram ao seu lado caem junto contigo. A "
				+ " \u00FAnica coisa que ainda os mantinha vivos  era a necessidade de proteger Helaria,"
				+ " mas quando o \u00FAltimo soldado de Bethesda caem eles sabem que podem "
				+ " morrer em paz.";
		linhas[2] = 7;

		tx[3] = "O Rei decide homenagear todos  aqueles que ca\u00EDram para proteger a "
				+ " cidade com um monumento que est\u00E1  sendo constru\u00EDdo ao mesmo tempo que a "
				+ " cidade \u00E9 reconstru\u00EDda.";
		linhas[3] = 4;

		tx[4] = "Todos se lembrar\u00E3o para sempre   dos her\u00F3is que morreram para proteger "
				+ " Helaria. Em sua morte, voc\u00EA est\u00E1 em paz.";
		linhas[4] = 2;

	}

	public void grr_6_sem_mapa_derrota() {

		tx = new String[4];
		linhas = new int[4];

		tx[0] = "As tropas inimigas s\u00E3o muitas e"
				+ " voc\u00EAs tamb\u00E9m s\u00E3o surpreendidos por"
				+ " tr\u00E1s. Ao que parece algumas tropas de Bethesda entraram em Helaria pelos "
				+ " subterr\u00E2neos.";
		linhas[0] = 4;

		tx[1] = "Voc\u00EAs est\u00E3o em menor n\u00FAmero e"
				+ " lutando em duas frentes, n\u00E3o tem como  conseguir a vit\u00F3ria.";
		linhas[1] = 2;

		tx[2] = "Helaria cai e com ela caem os  sonhos e as esperan\u00E7as de todos seus"
				+ " habitantes, reduzidos a manchas de  sangue no ch\u00E3o. Uma cidade destru\u00EDda"
				+ " que ser\u00E1 esquecida pelo tempo.";
		linhas[2] = 4;

		tx[3] = "Essa \u00E9 a hist\u00F3ria de Helaria e de seu  Her\u00F3i ca\u00EDdo."
				+ "";
		linhas[3] = 1;
	}
}