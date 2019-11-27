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
	 * \u00EA é \u00E9 ê \u00C9 É
	 * 
	 * \u00ED í
	 * 
	 * \u00FA ú
	 * 
	 * \u00F3 Ó \u00F4 ô \u00F5 õ
	 * 
	 */

	public void grr_1() { // 2 opcoes

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

	public void grr_2() {  // 3 opcoes

		tx = new String[16];
		linhas = new int[16];

		tx[0] = "<html>- Agora que terminamos de comer, por" + "<br/>que me chamou aqui t\u00E3o de repente?"
				+ "<html>";
		linhas[0] = 1;

		tx[1] = "<html>- Ontem de noite o Imp\u00E9rio de " + "<br/>Bethesda declarou guerra contra" + "<br/>Helaria. "
				+ "<html>";
		linhas[1] = 2;

		tx[2] = "<html>Voc\u00EA fica em choque com essa " + "<br/>informa\u00E7\u00E3o, uma guerra sendo "
				+ "<br/>iniciada sem nenhum precedente, de" + "<br/>forma t\u00E3o sÃºbita. " + "<html>";
		linhas[2] = 3;

		tx[3] = "<html>Desde que voc\u00EA entrou na Guarda " + "<br/>Real isso nunca tinha acontecido, "
				+ "<br/>ainda mais que o oponente em " + "<br/>quest\u00E3o \u00E9 o Imp\u00E9rio Bethesda\u00E2€¦ "
				+ "<html>";
		linhas[3] = 3;

		tx[4] = "<html>- O que voc\u00EA quer dizer com isso, " + "<br/>General? " + "<html>";
		linhas[4] = 1;

		tx[5] = "<html>- Aparentemente Bethesda tem " + "<br/>interesse nestas ricas terras de "
				+ "<br/>Helaria e, para eles conseguirem o " + "<br/>que querem, n\u00F3s precisamos sair. " + "<html>";
		linhas[5] = 3;

		tx[6] = "<html> - Mas, Bethesda? " + "<html>";
		linhas[6] = 0;

		tx[7] = "<html>- Foram eles que destru\u00EDram sua vila e " + "<br/>mataram sua fam\u00EDlia, n\u00E3o foi?"
				+ "<html>";
		linhas[7] = 1;

		tx[8] = "<html> - Sim... " + "<html>";
		linhas[8] = 0;

		tx[9] = "<html>" + player.getNome() + ", pe\u00E7o que mantenha sua "
				+ "<br/>cabe\u00E7a no lugar nesta guerra que se " + "<br/>aproxima. Sei o quanto deseja se "
				+ "<br/>vingar deles, mas est\u00E1 em jogo algo "
				+ "<br/>muito maior. N\u00E3o deixe que seu \u00F3dio e "
				+ "<br/>seu desejo de vingan\u00E7a tomem conta"
				+ "<br/>de suas a\u00E7\u00F3es. Ã€s vezes as atitudes  " + "<br/>de uma pessoa podem mudar o rumo  "
				+ "<br/>de uma guerra totalmente.  " + "<html>";
		linhas[9] = 8;

		tx[10] = "<html>- Sim, eu sei disso. Eu n\u00E3o deixarei " + "<br/>minhas emo\u00E7\u00F3es tomarem conta de"
				+ "<br/>mim e farei o que for preciso para" + "<br/>proteger Helaria e vencer a guerra." + "<html>";
		linhas[10] = 3;
		
		tx[11] = "<html>A conversa continua por mais "
				+ "<br/>algum tempo, Alexander te "
				+ "<br/>esclarece sobre os detalhes " 
				+ "<br/>conhecidos da guerra e voc\u00E9 "
				+ "<br/>fica sabendo que as tropas de "
				+ "<br/>Bethesda est\u00E3o se aproximando "
				+ "<br/>de Helaria e tem previs\u00E3o de "
				+"<br/>chegada de tr\u00E9s dias."
				+"<html>";
		linhas[11] = 7;
		
		tx[12] = "<html>Voc\u00E9 sai dos aposentos do "
				+ "<br/>General Alexander com uma "
				+ "<br/>miss\u00E3o, conseguir o mapa " 
				+ "<br/>completo dos subterr\u00E2neos da "
				+ "<br/>cidade para planejar uma defesa "
				+ "<br/>e um ataque furtivo. "
				+"<html>";
		linhas[12] = 5;
		
		tx[13] = "<html>O mapa est\u00E1 nos arquivos da "
				+ "<br/>Igreja, mas n\u00E3o ser\u00E1 f\u00E1cil "
				+ "<br/>conseguir. J\u00E1 tem alguns anos " 
				+ "<br/>que a Igreja rompeu com a "
				+ "<br/>Guarda Real e se recusa a "
				+ "<br/>cooperar em diversos assuntos, "
				+ "<br/>inclusive relativos \u00E0 seguran\u00E7a "
				+ "<br/>nacional. "
				+"<html>";
		linhas[13] = 7;
		
		tx[14] = "<html>Voc\u00E9 deve conseguir o mapa "
				+ "<br/>com a Igreja de qualquer forma, "
				+ "<br/>mas primeiro voc\u00E9 deve tentar "
				+ "<br/>vias diplom\u00E1ticas. "
				+"<html>";
		linhas[14] = 3;
		
		tx[15] = "<html>Na mesma manh\u00E3 voc\u00E9 se "
				+ "<br/>encaminha para a Catedral, "
				+ "<br/>chegando l\u00E1 pede para falar"
				+ "<br/>com o Bispo. Ele te atende e"
				+ "<br/>ent\u00E3o come\u00E7a a discuss\u00E3o. "
				+"<html>";
		linhas[15] = 4;

		choice = "<html>- Aceita alguma bebida, Capit\u00E3o? " + "<html>";

		op1 = "<html>Vinho" + "<html>";

		op2 = "<html>Licor" + "<html>";

		op3 = "<html>Nada agora, obrigado." + "<html>";

	}
	
	public void grr_3_vinho() { // vai para grr_4
		
		tx = new String[2];
		linhas = new int[2];	
		
		tx[0] = "<html>- Nada melhor que um bom e "
				+ "<br/>tradicional vinho, n\u00E3o \u00EA mesmo "
				+ "<br/>capit\u00E3o? " 
				+"<html>";
		linhas[0] = 2;
		
		tx[1] = "<html>- N\u00E3o posso dizer que discordo"
				+ "<br/>de voc\u00E9. " 
				+"<html>";
		linhas[1] = 1;
	}
	
	public void grr_3_licor() { // vai para grr_4
		
		tx = new String[2];
		linhas = new int[2];	
		
		tx[0] = "<html>- Vejo que voc\u00E9 tem um paladar "
				+ "<br/>refinado. "
				+"<html>";
		linhas[0] = 1;
		
		tx[1] = "<html>- Nada melhor do que frutas com"
				+ "<br/>\u00E1lcool. - Voc\u00E9 brinca. " 
				+"<html>";
		linhas[1] = 1;
		
	}
	
	public void grr_3_nada() { // vai para grr_4
		
		tx = new String[1];
		linhas = new int[1];	
		
		tx[0] = "<html>- Se este \u00EA o seu desejo, nada "
				+ "<br/>posso fazer. "
				+"<html>";
		linhas[0] = 1;
	
	}

	public void grr_4() { // 2 opcoes
		
		tx = new String[10];
		linhas = new int[10];	
		
		tx[0] = "<html>- Vamos ao que interessa, o que"
				+ "<br/>um capit\u00E3o da Guarda Real est\u00E1"
				+ "<br/>fazendo aqui?" 
				+"<html>";
		linhas[0] = 2;
		
		tx[1] = "<html>- Vim a mando do General "
				+ "<br/>Alexander, tem algo em posse"
				+ "<br/>da Catedral que interessa a " 
				+ "<br/>Guarda Real."
				+"<html>";
		linhas[1] = 3;
		
		tx[2] = "<html>- E o que seria isso? -"
				+"<html>";
		linhas[2] = 0;
		
		tx[3] = "<html>- Mapas, do subterr\u00E2neo da "
				+ "<br/>cidade, preciso de todos que a "
				+ "<br/>Igreja possuir. " 
				+"<html>";
		linhas[3] = 2;
		
		tx[4] = "<html>- E por que eu daria para voc\u00E9? "
				+ "<br/>O que nós vamos ganhar com "
				+ "<br/>isso? " 
				+"<html>";
		linhas[4] = 2;
	
		tx[5] = "<html>- A prote\u00E7\u00E3o da cidade, n\u00E3o sei "
				+ "<br/>se o senhor sabe, mas Bethesda "
				+ "<br/>est\u00E1 se aproximando e ela vai " 
				+ "<br/>destruir todos nós. "
				+"<html>";
		linhas[5] = 3;
		
		tx[6] = "<html> - Todos voc\u00E9s no caso. "
				+"<html>";
		linhas[6] = 0;
		
		tx[7] = "<html>- Bethesda compartilha da "
				+ "<br/>mesma f\u00EA que Helaria, eles "
				+ "<br/>nunca amea\u00E7ariam a Igreja." 
				+"<html>";
		linhas[7] = 2;
		
		tx[8] = "<html>- Como voc\u00E9 pode ser t\u00E3o "
				+ "<br/>ego\u00EDsta? Pense em quantas "
				+ "<br/>pessoas v\u00E3o morrer se nós " 
				+ "<br/>falharmos em proteger a "
				+ "<br/>cidade. "
				+"<html>";
		linhas[8] = 4;
		
		tx[9] = "<html>- Helarianos v\u00E3o morrer se "
				+ "<br/>voc\u00E9s falharem e Bethesdences "
				+ "<br/>ir\u00E3o morrer se voc\u00E9s vencerem. " 
				+ "<br/>A Igreja n\u00E3o pode escolher "
				+ "<br/>sobre a vida de dois fi\u00EAis."
				+"<html>";
		linhas[9] = 0;
		
		choice = "<html>Qual \u00EA sua resposta? " + "<html>";

		op1 = "<html>- Seu cinismo me impressiona." + "<html>";

		op2 = "<html>- A quest\u00E3o do mapa nunca "
				+ "<br/>chegou a ser um pedido. " + "<html>";

		
	}
	
	public void grr_5_cinismo() { // minigame da hidra
		
		tx = new String[16];
		linhas = new int[16];	
		
		tx[0] = "<html>- N\u00E3o \u00EA cinismo, \u00EA quest\u00E3o de "
				+ "<br/>\u00EAtica. Todas as vidas s\u00E3o iguais"
				+ "<br/>perante os deuses. N\u00E3o temos o " 
				+ "<br/>direito de priorizar esta em "
				+ "<br/>detrimento daquela." 
				+"<html>";
		linhas[0] = 4;
		
		tx[1] = "<html>- Passe bem. - Voc\u00E9 diz em um"
				+ "<br/>tom amargo. "
				+"<html>";
		linhas[1] = 1;
		
		tx[2] = "<html>- Igualmente. - No mesmo tom."
				+"<html>";
		linhas[2] = 0;
		
		tx[3] = "<html>Voc\u00E9 vai embora da Catedral,"
				+ "<br/>mas agora precisa pensar em "
				+ "<br/>uma outra forma de obter esse" 
				+ "<br/>mapa. "
				+"<html>";
		linhas[3] = 3;
		
		tx[4] = "<html>Voc\u00E9 volta para o castelo para "
				+ "<br/>reportar os acontecimentos para "
				+ "<br/>o General Alexander. " 
				+"<html>";
		linhas[4] = 2;
	
		tx[5] = "<html>- Entendo. - Alexander diz."
				+"<html>";
		linhas[5] = 0;
		
		tx[6] = "<html>- Nós precisamos de outro"
				+"<br/>plano."
				+"<html>";
		linhas[6] = 0;
		
		tx[7] = "<html>- Voc\u00E9 j\u00E1 ouviu falar na pris\u00E3o "
				+"<br/>que existe dentro da Catedral? "
				+"<br/>\u00C9 l\u00E1 que eles mant\u00E9m os infi\u00EAis " 
				+"<br/>at\u00EA o julgamento. "
				+"<html>";
		linhas[7] = 3;
		
		tx[8] = "<html>- Sim, j\u00E1 ouvi falar, embora "
				+ "<br/>nunca tenha ido."
				+"<html>";
		linhas[8] = 1;
		
		tx[9] = "<html>- Segundo o que se diz essa"
				+ "<br/>pris\u00E3o tem acesso a diversas"
				+ "<br/>partes da Catedral, inclusive" 
				+ "<br/>aos arquivos confidenciais."
				+"<html>";
		linhas[9] = 3;
		
		tx[10] = "<html>- Voc\u00E9 quer que eu invada a "
				+ "<br/>pris\u00E3o, \u00EA isso? "
				+"<html>";
		linhas[10] = 1;
		
		tx[11] = "<html>- E me traga os mapas, mas "
				+ "<br/>tome cuidado, dizem que l\u00E1 \u00EA "
				+ "<br/>um labirinto. " 
				+"<html>";
		linhas[11] = 2;
		
		tx[12] = "<html>- Muito bem, quando devo "
				+ "<br/>partir? "
				+"<html>";
		linhas[12] = 1;
		
		tx[13] = "<html>-Esta noite, \u00EA mais seguro."
				+"<html>";
		linhas[13] = 0;
		
		tx[14] = "<html>Voc\u00E9 vai para a Catedral, mas "
				+ "<br/>antes de chegar entra em bueiro "
				+ "<br/>e abre seu caminho em dire\u00E7\u00E3o " 
				+ "<br/>\u00E0 pris\u00E3o. Chegando l\u00E1 voc\u00E9 "
				+ "<br/>come\u00E7a a procurar pelos " 
				+ "<br/>arquivos, mas, quando chega no" 
				+ "<br/>local v\u00E9 que est\u00E1 guardado por "
				+ "<br/>um terr\u00EDvel monstro de muitas" 
				+"<br/>cabe\u00E7as."
				+"<html>";
		linhas[14] = 8;
		
		tx[15] = "<html>Aparentemente ele responde \u00E0 "
				+ "<br/>uma espec\u00EDfica m\u00E1quina de "
				+ "<br/>som, no entanto ela n\u00E3o est\u00E1 em " 
				+ "<br/>sua posse, logo só te resta "
				+ "<br/>enfrent\u00E1-lo. " 
				+"<html>";
		linhas[15] = 4;
		
		
	}

	public void grr_5_agressivo() { // minigame da hidra
		
		tx = new String[4];
		linhas = new int[4];	
		
		tx[0] = "<html>Voc\u00E9 retira sua espada e vai "
				+ "<br/>atacar o Bispo. Mas ele grita  "
				+ "<br/>pelos guardas e eles chegam antes" 
				+ "<br/>antes que voc\u00E9 consiga acertar "
				+ "<br/>o Sacerdote. "
				+"<html>";
		linhas[0] = 4;

		tx[1] = "<html>Por conta de suas a\u00E7\u00F5es "
				+ "<br/>voc\u00E9 \u00EA jogado na pris\u00E3o dentro "
				+ "<br/>da Catedral e agora precisa " 
				+ "<br/>conseguir o mapa e escapar "
				+ "<br/>antes que seja tarde demais. "
				+"<html>";
		linhas[1] = 4;

		tx[2] = "<html>Chega \u00E0 noite e os guardas "
				+ "<br/>est\u00E3o dormindo, voc\u00E9 consegue "
				+ "<br/>arrombar a porta sem grandes " 
				+ "<br/>problemas. "
				+"<html>";
		linhas[2] = 3;

		tx[3] = "<html>Voc\u00E9 foge e procura pelos "
				+ "<br/>arquivos, encontra a entrada, "
				+ "<br/>mas primeiro voc\u00E9 precisa " 
				+ "<br/>passar por um terr\u00EDvel monstro "
				+ "<br/>que guarda a sala com apenas "
				+ "<br/>uma pequena espada que voc\u00E9 " 
				+ "<br/>encontrou. "
				+"<html>";
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
