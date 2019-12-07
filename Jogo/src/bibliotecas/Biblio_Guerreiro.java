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

			tx[0] = "<html>Quinze anos se passaram desde que " + "<br/>voc\u00EA entrou para a Guarda Real. Voc\u00EA "
					+ "<br/>foi acolhido e eles se tornaram sua " + "<br/>nova fam\u00EDlia, em especial o Capit\u00E3o"
					+ "<br/>Alexander, atualmente General "
					+ "<br/>Alexander e voc\u00EA \u00E9 o novo Capit\u00E3o do " + "<br/>mesmo S\u00E9timo Comando. "
					+ "<html>";
			linhas[0] = 6;

			tx[2] = "<html>Hoje voc\u00EA \u00E9 um dos melhores " + "<br/>combatentes que Helaria j\u00E1 viu um "
					+ "<br/>diplomata extremamente habilidoso, " + "<br/>tudo isso gra\u00E7as a Alexander e a seu "
					+ "<br/>irm\u00E3o, assassinado h\u00E1 poucos anos " + "<br/>pela Guilda Vigilante. " + "<html>";
			linhas[2] = 5;

		} else {

			tx[0] = "<html>Quinze anos se passaram desde que " + "<br/>voc\u00EA entrou para a Guarda Real. Voc\u00EA "
					+ "<br/>foi acolhido e eles se tornaram sua " + "<br/>nova fam\u00EDlia, em especial o Capit\u00E3o"
					+ "<br/>Alexander, atualmente General " + "<br/>Alexander e voc\u00EA \u00E9 a nova Capit\u00E3 do "
					+ "<br/>mesmo S\u00E9timo Comando. " + "<html>";
			linhas[0] = 6;

			tx[2] = "<html>Hoje voc\u00EA \u00E9 uma das melhores " + "<br/>combatentes que Helaria j\u00E1 viu uma "
					+ "<br/>diplomata extremamente habilidosa, " + "<br/>tudo isso gra\u00E7as a Alexander e a seu "
					+ "<br/>irm\u00E3o, assassinado h\u00E1 poucos anos " + "<br/>pela Guilda Vigilante. " + "<html>";
			linhas[2] = 5;
		}

		tx[1] = "<html>Em todo esse per\u00EDodo Alexander " + "<br/>atuou como um pai para voc\u00EA, um  "
				+ "<br/>amigo nos momentos em que voc\u00EA " + "<br/>precisava e, principalmente um "
				+ "<br/>mentor em todos os momentos, te " + "<br/>treinou nas artes de combate e na "
				+ "<br/>diplomacia. " + "<html>";
		linhas[1] = 6;

		tx[3] = "<html>Voc\u00EAs sentem muita falta dele, afinal " + "<br/>ele era um membro da fam\u00EDlia, mas "
				+ "<br/>juntos conseguiram superar sua " + "<br/>morte, por\u00E9m nunca conseguiram "
				+ "<br/> prender os culpados. " + "<html>";
		linhas[3] = 4;

		tx[4] = "<html> Hoje voc\u00EA acorda com a chegada de " + "<br/> um mensageiro em seus aposentos, "
				+ "<br/> General Alexander pede seu " + "<br/>comparecimento imediato em seus " + "<br/>aposentos."
				+ "<html>";
		linhas[4] = 4;

		choice = "<html>Nos aposentos do general voc\u00EA tem "
				+ "<br/> algumas op\u00E7\u00F3es para comer, o que ser\u00E1?" + "<html>";

		op1 = "Caf\u00E9 com p\u00E3es e roscas ";

		op2 = "Leite com fatias de bolo ";

		op3 = "Vinho com frutas ";

	}

	public void grr_2(int x) { // apos termino do metodo ir para o mapa

		tx = new String[16];
		linhas = new int[16];

		switch (x) {
		case 1:
			tx[0] = "<html>Alexander: " + "<br/><br/>Voc\u00EA sempre gostou das coisas" + "<br/> mais b\u00E1sicas."
					+ "<html>";
			linhas[0] = 3;
			break;
		case 2:
			tx[0] = "<html>Alexander: " + "<br/><br/>Parece que algu\u00E9m tem um " + "<br/>apetite por doces"
					+ "<html>";
			linhas[0] = 3;
			break;
		case 3:
			tx[0] = "<html>Alexander: " + "<br/><br/>Uma refei\u00E7\u00E3o refinada para "
					+ "<br/>algu\u00E9m de h\u00E1bitos refinados" + "<html>";
			linhas[0] = 3;
			break;
		}

		tx[1] = "<html>Voc\u00EA:" + "<br/><br/>Agora que terminamos de comer, por"
				+ "<br/>que me chamou aqui t\u00E3o de repente?" + "<html>";
		linhas[1] = 3;

		tx[2] = "<html>Alexander:" + "<br/><br/>Ontem de noite o Imp\u00E9rio de "
				+ "<br/>Bethesda declarou guerra contra" + "<br/>Helaria. " + "<html>";
		linhas[2] = 4;

		tx[3] = "<html>Voc\u00EA fica em choque com essa " + "<br/>informa\u00E7\u00E3o, uma guerra sendo "
				+ "<br/>iniciada sem nenhum precedente, de" + "<br/>forma t\u00E3o s\u00FAbita. " + "<html>";
		linhas[3] = 3;

		tx[4] = "<html>Desde que voc\u00EA entrou na Guarda " + "<br/>Real isso nunca tinha acontecido, "
				+ "<br/>ainda mais que o oponente em " + "<br/>quest\u00E3o \u00E9 o Imp\u00E9rio Bethesda" + "<html>";
		linhas[4] = 3;

		tx[5] = "<html>Voc\u00EA:" + "<br/><br/>O que voc\u00EA quer dizer com isso, " + "<br/>General? " + "<html>";
		linhas[5] = 3;

		tx[6] = "<html>Alexander:" + "<br/><br/>Aparentemente Bethesda tem " + "<br/>interesse nestas ricas terras de "
				+ "<br/>Helaria e, para eles conseguirem o " + "<br/>que querem, n\u00F3s precisamos sair. " + "<html>";
		linhas[6] = 5;

		tx[7] = "<html>Voc\u00EA:" + "<br/><br/>Mas, Bethesda? " + "<html>";
		linhas[7] = 2;

		tx[8] = "<html>Alexander:" + "<br/><br/>Foram eles que destru\u00EDram sua vila e "
				+ "<br/>mataram sua fam\u00EDlia, n\u00E3o foi?" + "<html>";
		linhas[8] = 3;

		tx[9] = "<html>Voc\u00EA:" + "<br/><br/>Sim... " + "<html>";
		linhas[9] = 2;

		tx[10] = "<html>Alexander:" + "<br/><br/>" + player.getNome() + ", pe\u00E7o que mantenha sua "
				+ "<br/>cabe\u00E7a no lugar nesta guerra que se " + "<br/>aproxima. Sei o quanto deseja se "
				+ "<br/>vingar deles, mas est\u00E1 em jogo algo " + "<br/>muito maior." + "<html>";
		linhas[10] = 6;

		tx[11] = "<html>Alexander:" + "<br/><br/>N\u00E3o deixe que seu \u00F3dio e "
				+ "<br/>seu desejo de vingan\u00E7a tomem conta"
				+ "<br/>de suas a\u00E7\u00F5es. \u00C1s vezes as atitudes  "
				+ "<br/>de uma pessoa podem mudar o rumo  " + "<br/>de uma guerra totalmente.  " + "<html>";
		linhas[11] = 6;

		tx[12] = "<html>Voc\u00EA: " + "<br/><br/>Sim, eu sei disso. Eu n\u00E3o deixarei "
				+ "<br/>minhas emo\u00E7\u00F5es tomarem conta de" + "<br/>mim e farei o que for preciso para"
				+ "<br/>proteger Helaria e vencer a guerra." + "<html>";
		linhas[12] = 5;

		tx[13] = "<html>A conversa continua por mais algum " + "<br/>tempo, Alexander te esclarece sobre os "
				+ "<br/>detalhes conhecidos da guerra e voc\u00EA" + "<br/>fica sabendo que as tropas de Bethesda "
				+ "<br/>est\u00E3o se aproximando de Helaria e tem "
				+ "<br/>previs\u00E3o de chegada de tr\u00EAs dias. " + "<html>";
		linhas[13] = 5;

		tx[14] = "<html>Voc\u00EA sai dos aposentos do General "
				+ "<br/>Alexander com tr\u00EAs miss\u00F5es, conseguir "
				+ "<br/>os mapas do subterr\u00E2neo da cidade na " + "<br/>Catedral, recrutar os arcanos treinados "
				+ "<br/>em combate na Torre Arcana e conseguir" + "<br/>a ajuda do ladr\u00E3o Kelastar, na Alameda "
				+ "<br/>dos Tr\u00EAs Ponteiros. Para onde voc\u00EA ir\u00E1 " + "<html>";
		linhas[14] = 6;

		tx[15] = "<html><br/>Para onde voc\u00EA ir\u00E1 primeiro ? " + "<html>";
		linhas[15] = 1;

	}

	public void grr_3_catedral() {

		tx = new String[3];
		linhas = new int[3];

		tx[0] = "<html>O mapa est\u00E1 nos arquivos da " + "<br/>Igreja, mas n\u00E3o ser\u00E1 f\u00E1cil "
				+ "<br/>conseguir. J\u00E1 tem alguns anos " + "<br/>que a Igreja rompeu com a "
				+ "<br/>Guarda Real e se recusa a " + "<br/>cooperar em diversos assuntos, "
				+ "<br/>inclusive relativos \u00E0 seguran\u00E7a " + "<br/>nacional. " + "<html>";
		linhas[0] = 7;

		tx[1] = "<html>Voc\u00EA deve conseguir o mapa " + "<br/>com a Igreja de qualquer forma, "
				+ "<br/>mas primeiro voc\u00EA deve tentar " + "<br/>vias diplom\u00E1ticas. " + "<html>";
		linhas[1] = 3;

		tx[2] = "<html>Na mesma manh\u00E3 voc\u00EA se " + "<br/>encaminha para a Catedral, "
				+ "<br/>chegando l\u00E1 pede para falar" + "<br/>com o Bispo. Ele te atende e"
				+ "<br/>ent\u00E3o come\u00E7a a discuss\u00E3o. " + "<html>";
		linhas[2] = 4;

		if (masculino) {
			choice = "<html>Bispo:" + "<br/><br/>Aceita alguma bebida, Capit\u00E3o? " + "<html>";
		} else {
			choice = "<html>Bispo:" + "<br/><br/>Aceita alguma bebida, Capit\u00E3? " + "<html>";
		}

		op1 = "<html>Vinho" + "<html>";

		op2 = "<html>Licor" + "<html>";

		op3 = "<html>Nada agora, obrigado." + "<html>";
	}

	public void grr_4_catedral(int x) { // cinismo ou agressao

		int y = 0;
		switch (x) {
		case 1:
			tx = new String[12];
			linhas = new int[12];
			if (masculino) {
				tx[0] = "<html>Bispo: " + "<br/><br/>Nada melhor que um bom e "
						+ "<br/>tradicional vinho, n\u00E3o \u00E9 mesmo " + "<br/>capit\u00E3o? " + "<html>";
				linhas[0] = 4;
			} else
				tx[0] = "<html>Bispo: " + "<br/><br/>Nada melhor que um bom e "
						+ "<br/>tradicional vinho, n\u00E3o \u00EA mesmo " + "<br/>capit\u00E3? " + "<html>";
			linhas[0] = 4;

			tx[1] = "<html>Voc\u00EA<br/><br/> N\u00E3o posso dizer que discordo de voc\u00EA." + "<html>";
			linhas[1] = 2;
			y = 2;
			break;
		case 2:
			tx = new String[12];
			linhas = new int[12];

			tx[0] = "<html>Bispo:" + "<br/><br/>Vejo que voc\u00EA tem um paladar " + "<br/>refinado. " + "<html>";
			linhas[0] = 3;

			tx[1] = "<html>Voc\u00EA<br/><br/> Nada melhor do que frutas com \u00E1lcool." + "<html>";
			linhas[1] = 2;
			y = 2;
			break;
		case 3:
			tx = new String[11];
			linhas = new int[11];
			tx[0] = "<html>Bispo: " + "<br/><br/>Se este \u00E9 o seu desejo, nada " + "<br/>posso fazer. " + "<html>";
			linhas[0] = 3;
			y = 1;
		}
		if (masculino) {
			tx[y + 0] = "<html>Bispo:" + "<br/><br/>Mas vamos ao que interessa, o que"
					+ "<br/>um capit\u00E3o da Guarda Real est\u00E1" + "<br/>fazendo aqui?" + "<html>";
			linhas[y + 0] = 4;
		} else {
			tx[y + 0] = "<html>Bispo:" + "<br/><br/>Mas vamos ao que interessa, o que"
					+ "<br/>uma capit\u00E3 da Guarda Real est\u00E1" + "<br/>fazendo aqui?" + "<html>";
			linhas[y + 0] = 4;
		}

		tx[y + 1] = "<html>Voc\u00EA:" + "<br/><br/>Vim a mando do General " + "<br/>Alexander, tem algo em posse"
				+ "<br/>da Catedral que interessa a " + "<br/>Guarda Real." + "<html>";
		linhas[y + 1] = 5;

		tx[y + 2] = "<html>Bispo:" + "<br/><br/>E o que seria isso?" + "<html>";
		linhas[y + 2] = 2;

		tx[y + 3] = "<html>Voc\u00EA:" + "<br/><br/>Mapas, do subterr\u00E2neo da "
				+ "<br/>cidade, preciso de todos que a " + "<br/>Igreja possuir. " + "<html>";
		linhas[y + 3] = 4;

		tx[y + 4] = "<html>Bispo:" + "<br/><br/>E por que eu daria para voc\u00EA? "
				+ "<br/>O que n\u00F3s vamos ganhar com " + "<br/>isso? " + "<html>";
		linhas[y + 4] = 4;

		tx[y + 5] = "<html>Voc\u00EA:" + "<br/><br/>A prote\u00E7\u00E3o da cidade, n\u00E3o sei "
				+ "<br/>se o senhor sabe, mas Bethesda " + "<br/>est\u00E1 se aproximando e ela vai "
				+ "<br/>destruir todos n\u00F3s. " + "<html>";
		linhas[y + 5] = 5;

		tx[y + 6] = "<html>Bispo:" + "<br/><br/>Todos voc\u00EAs no caso. " + "<html>";
		linhas[y + 6] = 2;

		tx[y + 7] = "<html>Bispo:" + "<br/><br/>Bethesda compartilha da " + "<br/>mesma f\u00EA que Helaria, eles "
				+ "<br/>nunca amea\u00E7ariam a Igreja." + "<html>";
		linhas[y + 7] = 4;

		tx[y + 8] = "<html>Voc\u00EA:" + "<br/><br/>Como voc\u00EA pode ser t\u00E3o "
				+ "<br/>ego\u00EDsta? Pense em quantas " + "<br/>pessoas v\u00E3o morrer se n\u00F3s "
				+ "<br/>falharmos em proteger a " + "<br/>cidade. " + "<html>";
		linhas[y + 8] = 6;

		tx[y + 9] = "<html>Bispo:" + "<br/><br/>Helarianos v\u00E3o morrer se "
				+ "<br/>voc\u00EAs falharem e Bethesdences " + "<br/>ir\u00E3o morrer se voc\u00EAs vencerem. "
				+ "<br/>A Igreja n\u00E3o pode escolher " + "<br/>sobre a vida de dois fi\u00EAis." + "<html>";
		linhas[y + 9] = 6;

		choice = "<html>Qual \u00E9 sua resposta? " + "<html>";

		op1 = "<html>Seu cinismo me impressiona." + "<html>";

		op2 = "<html>A quest\u00E3o do mapa nunca " + "<br/>chegou a ser um pedido. " + "<html>";

	}

	public void grr_5_catedral_cinismo() { // minigame da hidra

		tx = new String[16];
		linhas = new int[16];

		tx[0] = "<html>Bispo:" + "<br/><br/>N\u00E3o \u00E9 cinismo, \u00E9 quest\u00E3o de "
				+ "<br/>\u00E9tica. Todas as vidas s\u00E3o iguais" + "<br/>perante os deuses. N\u00E3o temos o "
				+ "<br/>direito de priorizar esta em " + "<br/>detrimento daquela." + "<html>";
		linhas[0] = 6;

		tx[1] = "<html>Voc\u00EA:<br/><br/>Passe bem." + "<html>";
		linhas[1] = 2;

		tx[2] = "<html>Bispo:<br/><br/>Igualmente." + "<html>";
		linhas[2] = 2;

		tx[3] = "<html>Voc\u00EA vai embora da Catedral," + "<br/>mas agora precisa pensar em "
				+ "<br/>uma outra forma de obter esse" + "<br/>mapa. " + "<html>";
		linhas[3] = 3;

		tx[4] = "<html>Voc\u00EA volta para o castelo para " + "<br/>reportar os acontecimentos para "
				+ "<br/>o General Alexander. " + "<html>";
		linhas[4] = 2;

		tx[5] = "<html>Alexander:" + "<br/><br/>Entendo." + "<html>";
		linhas[5] = 2;

		tx[6] = "<html>Voc\u00EA:" + "<br/><br/>N\u00F3s precisamos de outro" + "<br/>plano." + "<html>";
		linhas[6] = 3;

		tx[7] = "<html>Alexander:" + "<br/><br/>Voc\u00EA j\u00E1 ouviu falar na pris\u00E3o "
				+ "<br/>que existe dentro da Catedral? " + "<br/>\u00C9 l\u00E1 que eles mant\u00E9m os infi\u00EAis "
				+ "<br/>at\u00EA o julgamento. " + "<html>";
		linhas[7] = 5;

		tx[8] = "<html>Voc\u00EA:" + "<br/><br/>Sim, j\u00E1 ouvi falar, embora " + "<br/>nunca tenha ido." + "<html>";
		linhas[8] = 3;

		tx[9] = "<html>Alexander:" + "<br/><br/>Segundo o que se diz essa" + "<br/>pris\u00E3o tem acesso a diversas"
				+ "<br/>partes da Catedral, inclusive" + "<br/>aos arquivos confidenciais." + "<html>";
		linhas[9] = 5;

		tx[10] = "<html>Voc\u00EA:" + "<br/><br/>Voc\u00EA quer que eu invada a " + "<br/>pris\u00E3o, \u00E9 isso? "
				+ "<html>";
		linhas[10] = 3;

		tx[11] = "<html>Alexander:" + "<br/><br/>E me traga os mapas, mas "
				+ "<br/>tome cuidado, dizem que l\u00E1 \u00E9 " + "<br/>um labirinto. " + "<html>";
		linhas[11] = 4;

		tx[12] = "<html>Voc\u00EA" + "<br/><br/>Muito bem, quando devo " + "<br/>partir? " + "<html>";
		linhas[12] = 3;

		tx[13] = "<html>Alexander:" + "<br/><br/>Esta noite, \u00E9 mais seguro." + "<html>";
		linhas[13] = 2;

		tx[14] = "<html>Voc\u00EA vai para a Catedral, mas " + "<br/>antes de chegar entra em bueiro "
				+ "<br/>e abre seu caminho em dire\u00E7\u00E3o "
				+ "<br/>\u00E0 pris\u00E3o. Chegando l\u00E1 voc\u00EA " + "<br/>come\u00E7a a procurar pelos "
				+ "<br/>arquivos, mas, quando chega no" + "<br/>local v\u00EA que est\u00E1 guardado por "
				+ "<br/>um terr\u00EDvel monstro de muitas" + "<br/>cabe\u00E7as." + "<html>";
		linhas[14] = 8;

		tx[15] = "<html>Aparentemente ele responde \u00E0 " + "<br/>uma espec\u00EDfica m\u00E1quina de "
				+ "<br/>som, no entanto ela n\u00E3o est\u00E1 em " + "<br/>sua posse, logo s\u00F3 te resta "
				+ "<br/>enfrent\u00E1-lo. " + "<html>";
		linhas[15] = 4;

	}

	public void grr_5_catedral_agressivo() { // minigame da hidra

		tx = new String[4];
		linhas = new int[4];

		if (masculino) {
			tx[1] = "<html>Por conta de suas a\u00E7\u00F5es " + "<br/>voc\u00EA \u00E9 jogado na pris\u00E3o dentro "
					+ "<br/>da Catedral e agora precisa " + "<br/>conseguir o mapa e escapar "
					+ "<br/>antes que seja tarde demais. " + "<html>";
			linhas[1] = 4;
		} else {
			tx[1] = "<html>Por conta de suas a\u00E7\u00F5es " + "<br/>voc\u00EA \u00EA jogada na pris\u00E3o dentro "
					+ "<br/>da Catedral e agora precisa " + "<br/>conseguir o mapa e escapar "
					+ "<br/>antes que seja tarde demais. " + "<html>";
			linhas[1] = 4;
		}

		tx[0] = "<html>Voc\u00EA retira sua espada e vai " + "<br/>atacar o Bispo. Mas ele grita  "
				+ "<br/>pelos guardas e eles chegam antes" + "<br/>antes que voc\u00EA consiga acertar "
				+ "<br/>o Sacerdote. " + "<html>";
		linhas[0] = 4;

		tx[2] = "<html>Chega \u00E0 noite e os guardas " + "<br/>est\u00E3o dormindo, voc\u00EA consegue "
				+ "<br/>arrombar a porta sem grandes " + "<br/>problemas. " + "<html>";
		linhas[2] = 3;

		tx[3] = "<html>Voc\u00EA foge e procura pelos " + "<br/>arquivos, encontra a entrada, "
				+ "<br/>mas primeiro voc\u00EA precisa " + "<br/>passar por uma terr\u00EDvel criatura "
				+ "<br/>que guarda a sala com apenas " + "<br/>uma pequena espada que voc\u00EA " + "<br/>encontrou. "
				+ "<html>";
		linhas[3] = 6;
	}

	public void grr_5_catedral2Try() {
		tx = new String[1];
		linhas = new int[1];
		tx[0] = "<html>Voc\u00EA vai para a Catedral, mas " + "<br/>antes de chegar entra em bueiro "
				+ "<br/>e abre seu caminho em dire\u00E7\u00E3o " + "<br/>\u00E0 aos arquivos à hidra " + "<html>";
		linhas[0] = 3;
	}

	public void grr_6() { // caso derrote a hidra

		tx = new String[1];
		linhas = new int[1];

		tx[0] = "<html>Agora a porta para os arquivos est\u00E1  " + "<br/>aberta e voc\u00EA pode entrar. Demora "
				+ "<br/>algumas horas, mas eventualmente voc\u00EA "
				+ "<br/>consegue encontrar o livro que cont\u00E9m os  "
				+ "<br/>mapas. Assim que o encontra, voc\u00EA foge " + "<br/>da Catedral e volta para o Castelo da "
				+ "<br/>Guarda Real para descansar." + "<html>";
		linhas[0] = 6;
	}

	public void grr_6catedralDerrota(int x) {

		tx = new String[2];
		linhas = new int[2];
		switch (x) {
		case 1:
			tx[0] = "<html>A luta torna - se muito longa, voc\u00EA n\u00E3o "
					+ "<br/>conseguir\u00E1 batalhar por muito mais  " + "<br/>tempo." + "<html>";
			linhas[0] = 3;
			break;
		case 2:
			tx[0] = "<html>A Hidra \u00E9 forte de mais e a cada ataque  "
					+ "<br/>ela cresce mais. Voc\u00EA n\u00E3o tem chances " + "<br/>de venc\u00EA-la agora."
					+ "<html>";
			linhas[0] = 3;
			break;
		}
		tx[1] = "<html>Sua \u00FAnica op\u00E7\u00E3o \u00E9 fugir, voc\u00EA se vira e "
				+ "<br/>come\u00E7a a correr, voc\u00EA encontra uma " + "<br/>passagem que "
				+ "<br/>d\u00E1 nos esgotos da cidade. Depois de "
				+ "<br/>restaurar suas for\u00E7as voc\u00EA pode tentar" + "<br/>enfrentar a besta de novo."
				+ "<html>";
		linhas[1] = 5;
	}

	public void grr_3_torre() { // dialogo antes do puzzle do labirinto na primeira vez que ele entra na torre

		tx = new String[19];
		linhas = new int[19];

		tx[0] = "<html>Voc\u00EA precisa recrutar alguns arcanistas " + "<br/>para lutar ao seu lado nesta guerra. Para"
				+ "<br/>isso voc\u00EA vai para a Torre Arcana e \u00E9 " + "<br/>recebido por arcanistas menores. "
				+ "<br/>Voc\u00EA explica o que quer l\u00E1 e eles te " + "<br/>encaminham para a sala onde os "
				+ "<br/>arcanistas especializados em batalha " + "<br/>treinam. " + "<html>";
		linhas[0] = 7;

		tx[1] = "<html>L\u00E1 voc\u00EA conversa com Muriel, a l\u00EDder"
				+ "<br/>dessa inst\u00E2ncia da Ordem Arcana." + "<html>";
		linhas[1] = 1;

		tx[2] = "<html>Muriel:<br/><br/> O que voc\u00EA procura aqui," + player.getNome() + " ? " + "<html>";
		linhas[2] = 2;

		tx[3] = "<html>Você:<br/><br/> Preciso da ajuda de voc\u00EAs. A guerra"
				+ "<br/>contra Bethesda se aproxima e sua ajuda " + "<br/>ser\u00E1 imprescind\u00EDvel." + "<html>";
		linhas[3] = 4;

		tx[4] = "<html>Muriel:<br/><br/> Muito bem, voc\u00EA quer nossa ajuda e n\u00F3s"
				+ "<br/>queremos te ajudar, mas primeiro preciso "
				+ "<br/>que voc\u00EA prove que tipo de pessoa voc\u00EA "
				+ "<br/>\u00E9, para sabermos se vale a pena lutar ao " + "<br/>seu lado." + "<html>";
		linhas[4] = 6;

		tx[5] = "<html>Você:<br/><br/> Muito bem, o que voc\u00EA quer que eu " + "<br/>fa\u00E7a?" + "<html>";
		linhas[5] = 3;

		tx[6] = "<html>Muriel:<br/><br/> Existe um livro de feiti\u00E7os dentro de um "
				+ "<br/>labirinto aqui. O Tratado da Magia, \u00E9 seu "
				+ "<br/>nome. Eu preciso que voc\u00EA o traga para" + "<br/>mim at\u00E9 o final do dia." + "<html>";
		linhas[6] = 5;

		tx[7] = "<html>Você:<br/><br/> Ah, mas vai ser f\u00E1cil ent\u00E3o." + "<html>";
		linhas[7] = 2;

		tx[8] = "<html>Muriel:<br/><br/> A\u00ED que voc\u00EA se engana apenas aqueles "
				+ "<br/>que s\u00E3o puros de cora\u00E7\u00E3o conseguir\u00E3o "
				+ "<br/>juntar corretamente suas tr\u00EAs partes. " + "<html>";
		linhas[8] = 4;

		tx[9] = "<html>Você:<br/><br/> S\u00E3o tr\u00EAs partes?" + "<html>";
		linhas[9] = 2;

		tx[10] = "<html>Muriel:<br/><br/> Precisamente, espalhadas pelo labirinto. " + "<html>";
		linhas[10] = 2;

		tx[11] = "<html>Você:<br/><br/> Tudo bem, antes do fim do dia voc\u00EA ter\u00E1" + "<br/>esse livro."
				+ "<html>";
		linhas[11] = 3;

		tx[12] = "<html>Quando voc\u00EA est\u00E1 no caminho para o " + "<br/>labirinto Muriel te chama." + "<html>";
		linhas[12] = 1;

		tx[13] = "<html>Muriel:<br/><br/> Espere, tem algo que preciso te dizer." + "<html>";
		linhas[13] = 2;

		tx[14] = "<html>Muriel:<br/><br/> As partes precisam ser unidas em uma"
				+ "<br/>ordem espec\u00EDfica de acordo com um" + "<br/>poema, se pegar uma parte errada, ser\u00E1"
				+ "<br/>obrigado a sair e tentar de novo algumas" + "<br/>horas depois, quando o equil\u00EDbrio do "
				+ "<br/>labirinto for restabelecido." + "<html>";
		linhas[14] = 7;

		tx[15] = "<html>Você:<br/><br/> Muito bem, qual \u00E9 o poema." + "<html>";
		linhas[15] = 2;

		tx[16] = "<html>Muriel te entrega um velho pergaminho " + "<br/com o poema" + "<html>";
		linhas[16] = 1;

		if(masculino) {
			tx[17] = "<html>Você:<br/><br/> Obrigado, agora se prepare para se " + "<br/>juntar a minha equipe." + "<html>";
			linhas[17] = 3;
		}else {
			tx[17] = "<html>Você:<br/><br/> Obrigada, agora se prepare para se " + "<br/>juntar a minha equipe." + "<html>";
			linhas[17] = 3;
		}
		

		tx[18] = "<html>Voc\u00EA vai para o labirinto." + "<html>";
		linhas[18] = 1;
	}

	public void grr_3_torre2Try() {
		tx = new String[1];
		linhas = new int[1];
		tx[0] = "<html>Você se dirige imediatamente" + "<br/>ao labirinto para buscar" + "<br/>os livros de Muriel."
				+ "<html>";
		linhas[0] = 2;
	}

	public void grr_4_torre_win() {

		tx = new String[1];
		linhas = new int[1];

		tx[0] = "<html>Voc\u00EA consegue juntar todas as partes e " + "<br/>entrega o livro para Muriel. Ela e sua"
				+ "<br/>equipe ir\u00E3o se juntar a voc\u00EA nesta guerra." + "<br/>"
				+ "<br/>Voc\u00EA volta para o Castelo da Guarda " + "<br/>Real para descansar." + "<html>";
		linhas[0] = 5;

	}

	public void grr_4_torre_lose() { // se nao houver mais tempo mostrar uma mensagem diferente

		tx = new String[1];
		linhas = new int[1];

		tx[0] = "<html>Voc\u00EA sente uma grande energia indo em "
				+ "<br/>sua dire\u00E7\u00E3o e precisa sair do labirinto "
				+ "<br/>para que o equil\u00EDbrio seja reestabelecido." + "<br/>"
				+ "<br/>Algumas horas se passam e voc\u00EA pode " + "<br/>tentar novamente." + "<html>";
		linhas[0] = 5;
	}

	public void grr_3_alameda() { // dialogo antes do puzzle da porta na primeira vez que ele entra na alameda

		tx = new String[19];
		linhas = new int[19];

		if (masculino) {
			tx[2] = "<html>Voz:<br/><br/>Parem, ele \u00E9 meu." + "<html>";
			linhas[2] = 2;

			tx[4] = "<html>Kelastar:<br/><br/>Sou Kelastar. Ouvi que estava "
					+ "<br/>procurando por mim e vim pessoalmente "
					+ "<br/>ao seu encontro. N\u00E3o \u00E9 sempre que um "
					+ "<br/>Capit\u00E3o da Guarda Real vem me " + "<br/>procurar, pelo menos n\u00E3o em paz eu "
					+ "<br/>suponho. " + "<html>";
			linhas[4] = 7;

			tx[8] = "<html>Kelastar:<br/><br/> O que voc\u00EA quer comigo, capit\u00E3o? " + "<html>";
			linhas[8] = 2;
		} else {
			tx[2] = "<html>Voz:<br/><br/>Parem, ela \u00E9 minha." + "<html>";
			linhas[2] = 2;

			tx[4] = "<html>Kelastar:<br/><br/>Sou Kelastar. Ouvi que estava "
					+ "<br/>procurando por mim e vim pessoalmente "
					+ "<br/>ao seu encontro. N\u00E3o \u00E9 sempre que uma "
					+ "<br/>Capit\u00E3 da Guarda Real vem me " + "<br/>procurar, pelo menos n\u00E3o em paz eu "
					+ "<br/>suponho. " + "<html>";
			linhas[4] = 7;

			tx[8] = "<html>Kelastar:<br/><br/> O que voc\u00EA quer comigo, capit\u00E3? " + "<html>";
			linhas[8] = 2;
		}

		tx[0] = "<html>Voc\u00EA vai para a Alameda dos Tr\u00EAs "
				+ "<br/>Ponteiros a procura do ladr\u00E3o Kelastar." + "<br/>Segundo suas fontes ele costuma ficar no "
				+ "<br/>Beco da Garganta Degolada e \u00E9 para l\u00E1 " + "<br/>que voc\u00EA vai." + "<html>";
		linhas[0] = 4;

		tx[1] = "<html>Quando voc\u00EA chega, algumas pessoas" + "<br/>come\u00E7am a se aproximar em forma de"
				+ "<br/>uma emboscada, mas de repente uma voz:" + "<html>";
		linhas[1] = 2;

		tx[3] = "<html>Voc\u00EA:<br/><br/>Quem \u00E9 voc\u00EA?" + "<html>";
		linhas[3] = 2;

		tx[5] = "<html>Voc\u00EA:<br/><br/>Eu n\u00E3o diria paz... Podemos conversar"
				+ "<br/>em um local um pouco mais privado? " + "<html>";
		linhas[5] = 3;

		tx[6] = "<html>Kalastar:<br/><br/> Vamos para meu escrit\u00F3rio ent\u00E3o. " + "<html>";
		linhas[6] = 2;

		tx[7] = "<html>Kelastar lidera o caminho e voc\u00EA o segue"
				+ "<br/>O escrit\u00F3rio \u00E9 um lugar sujo e feio, tudo l\u00E1 "
				+ "<br/>lembra decad\u00EAncia e corrup\u00E7\u00E3o, mas "
				+ "<br/>voc\u00EAs est\u00E3o sozinhos e \u00E9 isso que " + "<br/>importa." + "<html>";
		linhas[7] = 4;

		tx[9] = "<html>Voc\u00EA:<br/><br/> Voc\u00EA \u00E9 um dos ladr\u00F5es mais habilidosos"
				+ "<br/>dessa cidade, dizem que n\u00E3o exista uma "
				+ "<br/>porta que voc\u00EA n\u00E3o consiga arrombar, um" + "<br/>local que n\u00E3o consiga roubar."
				+ "<html>";
		linhas[9] = 5;

		tx[10] = "<html>Kalastar:<br/><br/>  Ok, al\u00E9m de afirmar o \u00F3bvio, o que voc\u00EA"
				+ "<br/>veio fazer aqui?" + "<html>";
		linhas[10] = 3;

		tx[11] = "<html>Voc\u00EA:<br/><br/> Preciso das suas habilidades. Uma "
				+ "<br/>guerra est\u00E1 vindo e estou montando uma " + "<br/>equipe. Os melhores da Guarda Real, da"
				+ "<br/>Torre Arcana e da Alameda dos Tr\u00EAs"
				+ "<br/>Ponteiros e n\u00F3s queremos voc\u00EA e os seus" + "<br/>dentro." + "<html>";
		linhas[11] = 7;

		tx[12] = "<html>Kalastar:<br/><br/> Hum... Parece interessante, mas o que " + "<br/>eu ganho com isso?"
				+ "<html>";
		linhas[12] = 3;

		tx[13] = "<html>Voc\u00EA:<br/><br/> Sobreviv\u00EAncia, se voc\u00EA n\u00E3o nos ajudar"
				+ "<br/>a cidade cair\u00E1." + "<html>";
		linhas[13] = 3;

		tx[14] = "<html>Kalastar:<br/><br/>  Disso eu sei, mas quero saber al\u00E9m "
				+ "<br/>disso. Estou falando de dinheiro, t\u00EDtulos." + "<html>";
		linhas[14] = 3;

		tx[15] = "<html>Voc\u00EA:<br/><br/> N\u00E3o posso prometer t\u00EDtulos, mas ter\u00E1 "
				+ "<br/>todo o dinheiro com que puder sonhar. " + "<html>";
		linhas[15] = 3;

		tx[16] = "<html>Kalastar:<br/><br/>  Eu posso sonhar com quantidades bem "
				+ "<br/>altas... De qualquer forma, eu preciso "
				+ "<br/>saber se posso confiar em voc\u00EA, s\u00F3 que" + "<br/>ao modo de Tr\u00EAs Ponteiros."
				+ "<html>";
		linhas[16] = 5;

		tx[17] = "<html>Voc\u00EA:<br/><br/> O que voc\u00EA quer que eu fa\u00E7a?" + "<html>";
		linhas[17] = 2;

		tx[18] = "<html>Kalastar:<br/><br/>Est\u00E1 vendo aquela porta? Prove para"
				+ "<br/>mim que voc\u00EA consegue abri-la com sua "
				+ "<br/>intelig\u00EAncia, assim saberei o tipo de " + "<br/>pessoa que lutarei ao lado." + "<html>";
		linhas[18] = 5;

	}

	public void grr_3_alameda2Try() {
		tx = new String[1];
		linhas = new int[1];

		tx[0] = "<html>Você se dirige a porta, pronto para" + "<br/>novamente tentar abri-la  " + "<html>";
		linhas[0] = 2;
	}

	public void grr_4_alameda_win() {

		tx = new String[3];
		linhas = new int[3];

		tx[0] = "<html>Kalastar:<br/><br/> Voc\u00EA tem seu valor. A Alameda dos Tr\u00EAs"
				+ "<br/>Ponteiros lutar\u00E1 ao seu lado." + "<html>";
		linhas[0] = 3;

		tx[1] = "<html>Voc\u00EA:<br/><br/> Agrade\u00E7o." + "<html>";
		linhas[1] = 2;

		tx[2] = "<html>  O dia est\u00E1 acabando e voc\u00EA volta" + "<br/>vitorioso para o castelo." + "<html>";
		linhas[2] = 1;
	}

	public void grr_4_alameda_lose() {

		tx = new String[1];
		linhas = new int[1];

		tx[0] = "<html> A porta n\u00E3o se abre. Voc\u00EA olha para "
				+ "<br/>Kelastar e ele te d\u00E1 um olhar permitindo" + "<br/>mais uma tentativa. " + "<html>";
		linhas[0] = 2;
	}

	public void grr_5_com_map() { // consegue mapa - minigame daniel

		tx = new String[4];
		linhas = new int[4];

		tx[0] = "<html> O terceiro dia est\u00E1 chegando ao fim e "
				+ "<br/>Alexander analisou os mapas. Voc\u00EAs ir\u00E3o"
				+ "<br/>montar uma linha de defesa nos esgotos "
				+ "<br/>abaixo do mercado. \u00C9 um ponto fr\u00E1gil e"
				+ "<br/>que o inimigo pode usar para um r\u00E1pido" + "<br/>acesso ao interior da cidade." + "<html>";
		linhas[0] = 5;

		tx[1] = "<html>	Voc\u00EA vai dormir para se preparar para o" + "<br/>dia seguinte." + "<html>";
		linhas[1] = 1;

		tx[2] = "<html> No dia seguinte sua equipe se encontra " + "<br/>na entrada do esgoto e voc\u00EAs "
				+ "<br/>prosseguem at\u00E9 a parte central, melhor"
				+ "<br/>posi\u00E7\u00E3o para montar uma emboscada." + "<html>";
		linhas[2] = 3;

		tx[3] = "<html>  Voc\u00EA ouve sons, as tropas de Bethesda "
				+ "<br/>est\u00E3o se aproximando, voc\u00EAs devem ficar " + "<br/>a postos." + "<html>";
		linhas[3] = 2;
	}

	public void grr_6_kelastar() { // se conseguir mapa e arrombou porta

		tx = new String[3];
		linhas = new int[3];

		tx[0] = "<html>	Voc\u00EAs est\u00E3o conseguindo conter as "
				+ "<br/>tropas inimigas, mas elas n\u00E3o param de"
				+ "<br/>chegar. Ent\u00E3o, voc\u00EA ouve um grito, "
				+ "<br/>Kelastar est\u00E1 sinalizando para voc\u00EAs" + "<br/>procurarem abrigo em um piso superior,"
				+ "<br/>ele abriu as comportas que retinham" + "<br/>\u00E1gua no esgoto." + "<html>";
		linhas[0] = 6;

		tx[1] = "<html>	As tropas de Bethesda foram  " + "<br/>severamente flageladas e Helaria   "
				+ "<br/>consegue uma vit\u00F3ria f\u00E1cil. Todos voc\u00EAs "
				+ "<br/>conseguem gl\u00F3ria perante a cidade,  " + "<br/>t\u00EDtulos e ouro, como Kelastar queria."
				+ "<html>";
		linhas[1] = 4;

		tx[2] = "<html>	Depois da guerra Helaria se torna um " + "<br/>local melhor para se viver com a uni\u00E3o de"
				+ "<br/>seus habitantes e voc\u00EA teve um papel " + "<br/>importante nisso." + "<html>";
		linhas[2] = 3;

	}

	public void grr_6_muriel() { // se conseguir mapa e arrombou porta

		tx = new String[3];
		linhas = new int[3];

		tx[0] = "<html> Voc\u00EAs est\u00E3o conseguindo conter grande " + "<br/>parte das tropas inimigas, mas uma "
				+ "<br/>quantidade significativa ainda consegue" + "<br/>passar por voc\u00EAs. Bethesda consegue "
				+ "<br/>invadir um peda\u00E7o da cidade e tanto l\u00E1 "
				+ "<br/>em cima, como aqui em baixo est\u00E1 tendo" + "<br/>uma violenta batalha." + "<html>";
		linhas[0] = 6;

		tx[1] = "<html> No fim do dia as tropas de Bethesda" + "<br/>minguam e Helaria sai vencedora da "
				+ "<br/>guerra, no entanto uma parte significativa  "
				+ "<br/>da cidade foi destru\u00EDda e muitas pessoas " + "<br/>foram mortas." + "<html>";
		linhas[1] = 4;

		tx[2] = "<html>	Voc\u00EAs s\u00E3o homenageados pelo rei e  "
				+ "<br/>recebem t\u00EDtulos e posses. Agora voc\u00EA \u00E9"
				+ "<br/>escutado pelo rei. Voc\u00EA pretende levar " + "<br/>Helaria para um novo rumo e "
				+ "<br/>provavelmente conseguir\u00E1." + "<html>";
		linhas[2] = 4;

	}

	public void grr_6_ninguem() {

		tx = new String[2];
		linhas = new int[2];

		tx[0] = "<html>	As tropas inimigas s\u00E3o muitas e uma " + "<br/>parte significativa delas consegue passar "
				+ "<br/>por voc\u00EAs. Na cidade e embaixo dela se" + "<br/>d\u00E3o batalhas violentas." + "<html>";
		linhas[0] = 3;

		tx[1] = "<html>	Voc\u00EAs resistem at\u00E9 suas \u00FAltimas for\u00E7as,  "
				+ "<br/>mas quando o \u00FAltimo soldado de " + "<br/>Bethesda cai por suas m\u00E3os, voc\u00EA cai "
				+ "<br/>junto com ele. Helaria conseguiu vencer a "
				+ "<br/>guerra e voc\u00EA sabe disso, agora voc\u00EA " + "<br/>pode morrer em paz." + "<html>";
		linhas[1] = 6;

	}

	public void grr_6_lose() {

		tx = new String[2];
		linhas = new int[2];

		tx[0] = "<html>	As tropas inimigas s\u00E3o muito numerosas," + "<br/>elas conseguem esmagar suas defesas e "
				+ "<br/>passar sem problemas, deixando uma " + "<br/>mancha com seu sangue no ch\u00E3o. "
				+ "<br/>Helaria \u00E9 totalmente invadida e n\u00E3o tem"
				+ "<br/>esperan\u00E7as de sobreviv\u00EAncia, destinada " + "<br/>ao esquecimento." + "<html>";
		linhas[0] = 6;

		tx[1] = "<html>	Esse \u00E9 o mesmo destino de seu corpo " + "<br/>inerte, ser esquecido e devorado pelos"
				+ "<br/>vermes. Um her\u00F3i esquecido de uma  " + "<br/>cidade esquecida. " + "<html>";
		linhas[1] = 3;
	}

	public void grr_5_sem_mapa() {

		tx = new String[3];
		linhas = new int[3];

		tx[0] = "<html>	O terceiro dia chega, mas sem os " + "<br/>mapas da cidade \u00E9 imposs\u00EDvel verificar os "
				+ "<br/>pontos de fraqueza subterr\u00E2neos, por " + "<br/>isso sua equipe \u00E9 encarregada de"
				+ "<br/>defender o port\u00E3o principal." + "<html>";
		linhas[0] = 4;

		tx[1] = "<html>	De noite voc\u00EA vai para seu quarto " + "<br/>e descansa at\u00E9 o dia seguinte. Amanhece"
				+ "<br/>e chega a hora, voc\u00EA deve se arrumar " + "<br/>para a batalha." + "<html>";
		linhas[1] = 3;

		tx[2] = "<html>		Voc\u00EA encontra seus companheiros " + "<br/>na porta da cidade, prontos para morrer "
				+ "<br/>por ela. Os inimigos se aproximam. " + "<html>";
		linhas[2] = 2;

	}

	public void grr_6_sem_mapa_win_dois_rec() {

		tx = new String[3];
		linhas = new int[3];

		tx[0] = "<html>		Voc\u00EAs est\u00E3o conseguindo conter o " + "<br/>avan\u00E7o das tropas inimigas com"
				+ "<br/>facilidade, at\u00E9 em excesso. Ent\u00E3o, voc\u00EAs "
				+ "<br/>recebem um ataque por tr\u00E1s, parte das" + "<br/>tropas inimigas pegou uma rota pelos"
				+ "<br/>subterr\u00E2neos e te surpreendeu. Voc\u00EAs" + "<br/>est\u00E3o lutando em duas frentes."
				+ "<html>";
		linhas[0] = 6;

		tx[1] = "<html>		A batalha est\u00E1 complicada, mas voc\u00EA tem"
				+ "<br/>os n\u00FAmeros necess\u00E1rios para a vit\u00F3ria. "
				+ "<br/>Mesmo com voc\u00EAs lutando em duas" + "<br/>frentes Bethesda come\u00E7a a recuar e n\u00E3o "
				+ "<br/>demora muito a ser derrotada. Uma " + "<br/>pequena parte de Helaria \u00E9 destru\u00EDda, e "
				+ "<br/>muitas vidas foram perdidas, mas Helaria" + "<br/>permanece." + "<html>";
		linhas[1] = 7;

		tx[2] = "<html>		Voc\u00EAs s\u00E3o homenageados pelo rei e"
				+ "<br/>recebem t\u00EDtulos e ouro, saciando a " + "<br/>vontade de Kelastar. Voc\u00EA recebe um "
				+ "<br/>cargo de conselheiro do Rei e tem muitos" + "<br/>planos ambiciosos para a cidade. Helaria "
				+ "<br/>tem um futuro brilhante em seu caminho." + "<html>";
		linhas[2] = 5;

	}

	public void grr_6_sem_mapa_win_um_rec() {

		tx = new String[3];
		linhas = new int[3];

		tx[0] = "<html>		Voc\u00EAs est\u00E3o conseguindo segurar as "
				+ "<br/>tropas inimigas com relativa facilidade, " + "<br/>mas s\u00E3o surpreendidos por um ataque"
				+ "<br/>traseiro, Bethesda invadiu Helaria pelos"
				+ "<br/>subterr\u00E2neos. A mais violenta batalha j\u00E1 "
				+ "<br/>vista tem in\u00EDcio. Muitos s\u00E3o os mortos e"
				+ "<br/>uma grande parte da cidade \u00E9 destru\u00EDda, "
				+ "<br/>mas no fim do dia as tropas de Bethesda " + "<br/>minguam e Helaria sai vitoriosa." + "<html>";
		linhas[0] = 8;

		tx[1] = "<html>		O Rei decide homenagear sua equipe por" + "<br/>ser a primeira linha de defesa da cidade."
				+ "<br/>Todos que sobreviveram recebem t\u00EDtulos "
				+ "<br/>e posses e voc\u00EA recebe um lugar especia" + "<br/>no Conselho da Guerra Real. O Rei"
				+ "<br/>planeja militarizar a cidade e voc\u00EA tem um"
				+ "<br/>voc\u00EA tem um papel importante nesses " + "<br/>planos." + "<html>";
		linhas[1] = 7;

		tx[2] = "<html>		Helaria um Estado Militar. At\u00E9 o" + "<br/>dia de sua morte voc\u00EA se perguntou se "
				+ "<br/>suas decis\u00F5es na vida e na guerra foram " + "<br/>as corretas." + "<html>";
		linhas[2] = 5;

	}

	public void grr_6_sem_mapa_win_sem_rec() {

		tx = new String[5];
		linhas = new int[5];

		tx[0] = "<html>		Voc\u00EAs est\u00E3o conseguindo conter "
				+ "<br/>com dificuldade as tropas inimigas, eles "
				+ "<br/>est\u00E3o em um n\u00FAmero muito maior. Ent\u00E3o, "
				+ "<br/>uma grande quantidade de tropas de " + "<br/>Bethesda ataca voc\u00EAs por tr\u00E1s, elas"
				+ "<br/>chegaram pelos subterr\u00E2neos da cidade. " + "<html>";
		linhas[0] = 5;

		tx[1] = "<html>		Voc\u00EAs est\u00E3o em uma grande  " + "<br/>desvantagem num\u00E9rica, de dez para um, "
				+ "<br/>mas como se diz, um soldado de Helaria" + "<br/>vale por dez outros."
				+ "<br/><br/>Voc\u00EAs lutam at\u00E9 suas \u00FAltimas"
				+ "<br/>for\u00E7as, at\u00E9 o \u00FAltimo soldado de Bethesda"
				+ "<br/>cair por suas m\u00E3os nuas, contigo caindo " + "<br/>tamb\u00E9m." + "<html>";
		linhas[1] = 8;

		tx[2] = "<html>		Helaria sai vitoriosa, mas \u00E9 quase" + "<br/>totalmente destru\u00EDda. Todos os que"
				+ "<br/>lutaram ao seu lado caem junto contigo. A "
				+ "<br/>\u00FAnica coisa que ainda os mantinha vivos " + "<br/>era a necessidade de proteger Helaria,"
				+ "<br/>mas quando o \u00FAltimo soldado de" + "<br/>Bethesda caem eles sabem que podem "
				+ "<br/>morrer em paz." + "<html>";
		linhas[2] = 7;

		tx[3] = "<html>		O Rei decide homenagear todos " + "<br/>aqueles que ca\u00EDram para proteger a "
				+ "<br/>cidade com um monumento que est\u00E1 " + "<br/>sendo constru\u00EDdo ao mesmo tempo que a "
				+ "<br/>cidade \u00E9 reconstru\u00EDda." + "<html>";
		linhas[3] = 4;

		tx[4] = "<html>		Todos se lembrar\u00E3o para sempre  " + "<br/>dos her\u00F3is que morreram para proteger "
				+ "<br/>Helaria. Em sua morte, voc\u00EA est\u00E1 em paz." + "<html>";
		linhas[4] = 2;

	}

	public void grr_6_sem_mapa_derrota() {

		tx = new String[4];
		linhas = new int[4];

		tx[0] = "<html>		As tropas inimigas s\u00E3o muitas e"
				+ "<br/>voc\u00EAs tamb\u00E9m s\u00E3o surpreendidos por"
				+ "<br/>tr\u00E1s. Ao que parece algumas tropas de" + "<br/>Bethesda entraram em Helaria pelos "
				+ "<br/>subterr\u00E2neos." + "<html>";
		linhas[0] = 4;

		tx[1] = "<html>		Voc\u00EAs est\u00E3o em menor n\u00FAmero e"
				+ "<br/>lutando em duas frentes, n\u00E3o tem como " + "<br/>conseguir a vit\u00F3ria." + "<html>";
		linhas[1] = 2;

		tx[2] = "<html>		Helaria cai e com ela caem os " + "<br/>sonhos e as esperan\u00E7as de todos seus"
				+ "<br/>habitantes, reduzidos a manchas de " + "<br/>sangue no ch\u00E3o. Uma cidade destru\u00EDda"
				+ "<br/>que ser\u00E1 esquecida pelo tempo." + "<html>";
		linhas[2] = 4;

		tx[3] = "<html>		Essa \u00E9 a hist\u00F3ria de Helaria e de seu " + "<br/>Her\u00F3i ca\u00EDdo."
				+ "<html>";
		linhas[3] = 1;
	}

//	tx = new String[];
//	linhas = new int[];	
//
//	tx[] = "<html>"
//			+ "<br/>"
//			+ "<br/>" 
//			+ "<br/>"
//			+ "<br/>"
//			+ "<br/>" 
//			+ "<br/>"
//			+"<html>";
//	linhas[] = ;
}