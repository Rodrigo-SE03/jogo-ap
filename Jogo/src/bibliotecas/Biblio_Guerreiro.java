package bibliotecas;

public class Biblio_Guerreiro extends Biblioteca {

	/*
	 * 
	 * Lista de acentos (evita que bugue ao mandar pro GitKraken)
	 * 
	 * \u00E7 ç
	 * 
	 * \u00E0 à  \u00E1 á \u00E2 â \u00E3 ã \u00C1 Á
	 * 
	 * \u00EA ê  \u00E9 é \u00C9 É
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

		tx[0] = "<html>Quinze anos se passaram desde que " + "<br/>voc\u00EA entrou para a Guarda Real. Voc\u00EA "
				+ "<br/>foi acolhido e eles se tornaram sua " + "<br/>nova fam\u00EDlia, em especial o Capit\u00E3o"
				+ "<br/>Alexander, atualmente General " + "<br/>Alexander e voc\u00EA \u00E9 o novo Capit\u00E3o do "
				+ "<br/>mesmo S\u00E9timo Comando. " + "<html>";
		linhas[0] = 6;

		tx[1] = "<html>Em todo esse per\u00EDodo Alexander " + "<br/>atuou como um pai para voc\u00EA, um  "
				+ "<br/>amigo nos momentos em que voc\u00EA " + "<br/>precisava e, principalmente um "
				+ "<br/>mentor em todos os momentos, te " + "<br/>treinou nas artes de combate e na "
				+ "<br/>diplomacia. " + "<html>";
		linhas[1] = 6;

		tx[2] = "<html>Hoje voc\u00EA \u00E9 um dos melhores " + "<br/>combatentes que Helaria j\u00E1 viu um "
				+ "<br/>diplomata extremamente habilidoso, " + "<br/>tudo isso gra\u00E7as a Alexander e a seu "
				+ "<br/>irm\u00E3o, assassinado h\u00E1 poucos anos " + "<br/>pela Guilda Vigilante. " + "<html>";
		linhas[2] = 5;

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

	public void grr_1_cafe() { // vai para grr_2

		tx = new String[1];
		linhas = new int[1];

	
	}

	public void grr_2(int x) { // 3 opcoes

		tx = new String[18];
		linhas = new int[18];
		
		switch (x) {
		case 1 :
			tx[0] = "<html>Alexander: " + "<br/><br/>Voc\u00EA sempre gostou das coisas"
					+ "<br/> mais b\u00E1sicas." + "<html>";
			linhas[0] = 3;
			break;
		case 2:
			tx[0] = "<html>Alexander: " + "<br/><br/>Parece que algu\u00E9m tem um "
					+ "<br/>apetite por doces" + "<html>";
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
				+ "<br/>ainda mais que o oponente em " + "<br/>quest\u00E3o \u00E9 o Imp\u00E9rio Bethesda"
				+ "<html>";
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

		tx[10] = "<html>Alexander:" + "<br/><br/>"+player.getNome() +", pe\u00E7o que mantenha sua "
				+ "<br/>cabe\u00E7a no lugar nesta guerra que se " + "<br/>apr0oxima. Sei o quanto deseja se "
				+ "<br/>vingar deles, mas est\u00E1 em jogo algo " + "<br/>muito maior." + "<html>";
		linhas[10] = 6;

		tx[11] = "<html>Alexander:" + "<br/><br/>N\u00E3o deixe que seu \u00F3dio e "
				+ "<br/>seu desejo de vingan\u00E7a tomem conta"
				+ "<br/>de suas a\u00E7\u00F5es. \u00C1s vezes as atitudes  " + "<br/>de uma pessoa podem mudar o rumo  "
				+ "<br/>de uma guerra totalmente.  " + "<html>";
		linhas[11] = 6;

		tx[12] = "<html>Voc\u00EA: " + "<br/><br/>Sim, eu sei disso. Eu n\u00E3o deixarei "
				+ "<br/>minhas emo\u00E7\u00F5es tomarem conta de" + "<br/>mim e farei o que for preciso para"
				+ "<br/>proteger Helaria e vencer a guerra." + "<html>";
		linhas[12] = 5;

		tx[13] = "<html>A conversa continua por mais " + "<br/>algum tempo, Alexander te "
				+ "<br/>esclarece sobre os detalhes " + "<br/>conhecidos da guerra e voc\u00EA "
				+ "<br/>fica sabendo que as tropas de " + "<br/>Bethesda est\u00E3o se aproximando "
				+ "<br/>de Helaria e tem previs\u00E3o de " + "<br/>chegada de tr\u00EAs dias." + "<html>";
		linhas[13] = 7;

		tx[14] = "<html>Voc\u00E9 sai dos aposentos do " + "<br/>General Alexander com uma "
				+ "<br/>miss\u00E3o, conseguir o mapa " + "<br/>completo dos subterr\u00E2neos da "
				+ "<br/>cidade para planejar uma defesa " + "<br/>e um ataque furtivo. " + "<html>";
		linhas[14] = 5;

		tx[15] = "<html>O mapa est\u00E1 nos arquivos da " + "<br/>Igreja, mas n\u00E3o ser\u00E1 f\u00E1cil "
				+ "<br/>conseguir. J\u00E1 tem alguns anos " + "<br/>que a Igreja rompeu com a "
				+ "<br/>Guarda Real e se recusa a " + "<br/>cooperar em diversos assuntos, "
				+ "<br/>inclusive relativos \u00E0 seguran\u00E7a " + "<br/>nacional. " + "<html>";
		linhas[15] = 7;

		tx[16] = "<html>Voc\u00E9 deve conseguir o mapa " + "<br/>com a Igreja de qualquer forma, "
				+ "<br/>mas primeiro voc\u00EA deve tentar " + "<br/>vias diplom\u00E1ticas. " + "<html>";
		linhas[16] = 3;

		tx[17] = "<html>Na mesma manh\u00E3 voc\u00EA se " + "<br/>encaminha para a Catedral, "
				+ "<br/>chegando l\u00E1 pede para falar" + "<br/>com o Bispo. Ele te atende e"
				+ "<br/>ent\u00E3o come\u00E7a a discuss\u00E3o. " + "<html>";
		linhas[17] = 4;

		choice = "<html>Bispo:" + "<br/><br/>Aceita alguma bebida, Capit\u00E3o? " + "<html>";

		op1 = "<html>Vinho" + "<html>";

		op2 = "<html>Licor" + "<html>";

		op3 = "<html>Nada agora, obrigado." + "<html>";

	}

	public void grr_3(int x) { // 2 opcoes

		tx = new String[11];
		linhas = new int[11];
		
		switch (x) {
		case 1:
			tx[0] = "<html>Bispo: "
					+ "<br/><br/>Nada melhor que um bom e " + "<br/>tradicional vinho, n\u00E3o \u00EA mesmo "
					+ "<br/>capit\u00E3o? " + "<html>";
			linhas[0] = 4;
			break;
		case 2:
			tx[0] = "<html>Bispo:"
					+ "<br/><br/>Vejo que voc\u00EA tem um paladar " + "<br/>refinado. " + "<html>";
			linhas[0] = 3;
			break;
		case 3:
			tx[0] = "<html>Bispo: "
					+ "<br/><br/>Se este \u00E9 o seu desejo, nada " + "<br/>posso fazer. " + "<html>";
			linhas[0] = 3;
		}

		tx[1] = "<html>Bispo:"
				+ "<br/><br/>Mas vamos ao que interessa, o que" + "<br/>um capit\u00E3o da Guarda Real est\u00E1"
				+ "<br/>fazendo aqui?" + "<html>";
		linhas[1] = 4;

		tx[2] = "<html>Voc\u00EA:"
				+ "<br/><br/>Vim a mando do General " + "<br/>Alexander, tem algo em posse"
				+ "<br/>da Catedral que interessa a " + "<br/>Guarda Real." + "<html>";
		linhas[2] = 5;

		tx[3] = "<html>Bispo:"
				+ "<br/><br/>E o que seria isso?" + "<html>";
		linhas[3] = 2;

		tx[4] = "<html>Voc\u00EA:"
				+ "<br/><br/>Mapas, do subterr\u00E2neo da " + "<br/>cidade, preciso de todos que a "
				+ "<br/>Igreja possuir. " + "<html>";
		linhas[4] = 4;

		tx[5] = "<html>Bispo:"
				+ "<br/><br/>E por que eu daria para voc\u00EA? " + "<br/>O que n\u00F3s vamos ganhar com " + "<br/>isso? "
				+ "<html>";
		linhas[5] = 4;

		tx[6] = "<html>Voc\u00EA:"
				+ "<br/><br/>A prote\u00E7\u00E3o da cidade, n\u00E3o sei " + "<br/>se o senhor sabe, mas Bethesda "
				+ "<br/>est\u00E1 se aproximando e ela vai " + "<br/>destruir todos n\u00F3s. " + "<html>";
		linhas[6] = 5;

		tx[7] = "<html>Bispo:"
				+ "<br/><br/>Todos voc\u00EAs no caso. " + "<html>";
		linhas[7] = 2;

		tx[8] = "<html>Voc\u00EA:"
				+ "<br/><br/>Bethesda compartilha da " + "<br/>mesma f\u00EA que Helaria, eles "
				+ "<br/>nunca amea\u00E7ariam a Igreja." + "<html>";
		linhas[8] = 4;

		tx[9] = "<html>Bispo:"
				+ "<br/><br/>Como voc\u00EA pode ser t\u00E3o " + "<br/>ego\u00EDsta? Pense em quantas "
				+ "<br/>pessoas v\u00E3o morrer se n\u00F3s " + "<br/>falharmos em proteger a " + "<br/>cidade. " + "<html>";
		linhas[9] = 6;

		tx[10] = "<html>Voc\u00EA:"
				+ "<br/><br/>Helarianos v\u00E3o morrer se " + "<br/>voc\u00EAs falharem e Bethesdences "
				+ "<br/>ir\u00E3o morrer se voc\u00EAs vencerem. " + "<br/>A Igreja n\u00E3o pode escolher "
				+ "<br/>sobre a vida de dois fi\u00EAis." + "<html>";
		linhas[10] = 2;

		choice = "<html>Qual \u00EA sua resposta? " + "<html>";

		op1 = "<html>Seu cinismo me impressiona." + "<html>";

		op2 = "<html>A quest\u00E3o do mapa nunca " + "<br/>chegou a ser um pedido. " + "<html>";

	}

	public void grr_4_cinismo() { // minigame da hidra

		tx = new String[16];
		linhas = new int[16];

		tx[0] = "<html>Bispo:"
				+ "<br/><br/>N\u00E3o \u00E9 cinismo, \u00E9 quest\u00E3o de "
				+ "<br/>\u00E9tica. Todas as vidas s\u00E3o iguais" + "<br/>perante os deuses. N\u00E3o temos o "
				+ "<br/>direito de priorizar esta em " + "<br/>detrimento daquela." + "<html>";
		linhas[0] = 6;

		tx[1] = "<html>Voc\u00EA:<br/><br/>Passe bem."+ "<html>";
		linhas[1] = 2;

		tx[2] = "<html>Bispo:<br/><br/>Igualmente." + "<html>";
		linhas[2] = 2;

		tx[3] = "<html>Voc\u00EA vai embora da Catedral," + "<br/>mas agora precisa pensar em "
				+ "<br/>uma outra forma de obter esse" + "<br/>mapa. " + "<html>";
		linhas[3] = 3;

		tx[4] = "<html>Voc\u00EA volta para o castelo para " + "<br/>reportar os acontecimentos para "
				+ "<br/>o General Alexander. " + "<html>";
		linhas[4] = 2;

		tx[5] = "<html>Alexander:"
				+ "<br/><br/>Entendo." + "<html>";
		linhas[5] = 2;

		tx[6] = "<html>Voc\u00EA:"
				+ "<br/><br/>N\u00F3s precisamos de outro" + "<br/>plano." + "<html>";
		linhas[6] = 3;

		tx[7] = "<html>Alexander:"
				+ "<br/><br/>Voc\u00EA j\u00E1 ouviu falar na pris\u00E3o " + "<br/>que existe dentro da Catedral? "
				+ "<br/>\u00C9 l\u00E1 que eles mant\u00E9m os infi\u00EAis " + "<br/>at\u00EA o julgamento. "
				+ "<html>";
		linhas[7] = 5;

		tx[8] = "<html>Voc\u00EA:"
				+ "<br/><br/>Sim, j\u00E1 ouvi falar, embora " + "<br/>nunca tenha ido." + "<html>";
		linhas[8] = 3;

		tx[9] = "<html>Alexander:"
				+ "<br/><br/>Segundo o que se diz essa" + "<br/>pris\u00E3o tem acesso a diversas"
				+ "<br/>partes da Catedral, inclusive" + "<br/>aos arquivos confidenciais." + "<html>";
		linhas[9] = 5;

		tx[10] = "<html>Voc\u00EA:"
				+ "<br/><br/>Voc\u00EA quer que eu invada a " + "<br/>pris\u00E3o, \u00E9 isso? " + "<html>";
		linhas[10] = 3;

		tx[11] = "<html>Alexander:"
				+ "<br/><br/>E me traga os mapas, mas " + "<br/>tome cuidado, dizem que l\u00E1 \u00E9 "
				+ "<br/>um labirinto. " + "<html>";
		linhas[11] = 4;

		tx[12] = "<html>Voc\u00EA"
				+ "<br/><br/>Muito bem, quando devo " + "<br/>partir? " + "<html>";
		linhas[12] = 3;

		tx[13] = "<html>Alexander:"
				+ "<br/><br/>Esta noite, \u00E9 mais seguro." + "<html>";
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

	public void grr_4_agressivo() { // minigame da hidra

		tx = new String[4];
		linhas = new int[4];

		tx[0] = "<html>Voc\u00EA retira sua espada e vai " + "<br/>atacar o Bispo. Mas ele grita  "
				+ "<br/>pelos guardas e eles chegam antes" + "<br/>antes que voc\u00EA consiga acertar "
				+ "<br/>o Sacerdote. " + "<html>";
		linhas[0] = 4;

		tx[1] = "<html>Por conta de suas a\u00E7\u00F5es " + "<br/>voc\u00EA \u00EA jogado na pris\u00E3o dentro "
				+ "<br/>da Catedral e agora precisa " + "<br/>conseguir o mapa e escapar "
				+ "<br/>antes que seja tarde demais. " + "<html>";
		linhas[1] = 4;

		tx[2] = "<html>Chega \u00E0 noite e os guardas " + "<br/>est\u00E3o dormindo, voc\u00EA consegue "
				+ "<br/>arrombar a porta sem grandes " + "<br/>problemas. " + "<html>";
		linhas[2] = 3;

		tx[3] = "<html>Voc\u00EA foge e procura pelos " + "<br/>arquivos, encontra a entrada, "
				+ "<br/>mas primeiro voc\u00EA precisa " + "<br/>passar por um terr\u00EDvel monstro "
				+ "<br/>que guarda a sala com apenas " + "<br/>uma pequena espada que voc\u00EA " + "<br/>encontrou. "
				+ "<html>";
		linhas[3] = 6;
	}

//	tx = new String[];
//	linhas = new int[];	
//	
//	  tx[] = "<html>"
//		 + "<br/>"
//		 + "<br/>" 
//		 + "<br/>"
//		 + "<br/>"
//		 + "<br/>" 
//		 + "<br/>"
//		 +"<html>";
//linhas[] = ;
}
