package bibliotecas;

public class Biblio_Arcan extends Biblioteca {

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

	public void arcan1() {// 2 op\u00E7\u00F5es

		tx = new String[13];
		linhas = new int[13];

		if (player.getSexo() == 0) {
			tx[0] = "<html>Quinze anos se passaram desde sua" + "<br/>inicia\u00E7\u00E3o na Ordem Arcana. "
					+ "<br/>Atualmente voc\u00EA est\u00E1 com 32 anos e "
					+ "<br/>recentemente alcan\u00E7ou o ranque de" + "<br/>Mestre Arcano, posi\u00E7\u00E3o essa "
					+ "<br/>alcan\u00E7ada apenas pelos melhores da " + "<br/>sua Ordem. " + "<html>";
			linhas[0] = 6;
		} else {
			tx[0] = "<html>Quinze anos se passaram desde sua" + "<br/>inicia\u00E7\u00E3o na Ordem Arcana. "
					+ "<br/>Atualmente voc\u00EA est\u00E1 com 32 anos e "
					+ "<br/>recentemente alcan\u00E7ou o ranque de" + "<br/>Mestre Arcana, posi\u00E7\u00E3o essa "
					+ "<br/>alcan\u00E7ada apenas pelos melhores da " + "<br/>sua Ordem. " + "<html>";
			linhas[0] = 6;
		}

		tx[1] = "<html>Artemisia tamb\u00E9m compartilha de sua " + "<br/>posi\u00E7\u00E3o, embora ela a tenha "
				+ "<br/>alcan\u00E7ado alguns anos antes, afinal" + "<br/>ela iniciou na Ordem quando ainda "
				+ "<br/>era uma crian\u00E7a. " + "<html>";
		linhas[1] = 4;

		tx[2] = "<html>Durante todos esses anos ela foi uma " + "<br/>amiga, uma irm\u00E3 e uma professora "
				+ "<br/>para voc\u00EA, ela te ajudou a superar a " + "<br/>morte da sua fam\u00EDlia e aceitar uma "
				+ "<br/>nova, voc\u00EA fez amigos, irm\u00E3os por " + "<br/>quem voc\u00EA daria a vida." + "<html>";
		linhas[2] = 5;

		tx[3] = "<html>Hoje foi convocada uma reuni\u00E3o de" + "<br/>emerg\u00EAncia, sua primeira desde que "
				+ "<br/>alcan\u00E7ou o ranque de Mestre e " + "<br/>conseguiu sua vaga no Conselho "
				+ "<br/>Anci\u00E3o." + "<html>";
		linhas[3] = 4;

		tx[4] = "<html>Reuni\u00F5es de emerg\u00EAncia s\u00E3o uma " + "<br/>coisa rara, e sempre significam "
				+ "<br/>problemas, algo est\u00E1 acontecendo, os" + "<br/>outros mestres, l\u00EDderes do Conselho "
				+ "<br/>est\u00E3o estranhos nos \u00FAltimos dias, o "
				+ "<br/>clima est\u00E1 piorando \u00E9 como se voc\u00EA "
				+ "<br/>pudesse sentir a aproxima\u00E7\u00E3o de algo " + "<br/>ruim." + "<html>";
		linhas[4] = 7;

		tx[5] = "<html>A reuni\u00E3o come\u00E7a, todos se sentam " + "<br/>em seus respectivos lugares e todos "
				+ "<br/>prestam aten\u00E7\u00E3o no S\u00E1bio Mor, " + "<br/>Guradam, um homem de 189 anos."
				+ "<html>";
		linhas[5] = 3;

		if (player.getSexo() == 0) {
			tx[6] = "<html>Guradam:" + "<br/><br/>H\u00E1 quinze anos atr\u00E1s n\u00F3s acolhemos"
					+ "<br/>um novo membro, ele se tornou parte "
					+ "<br/>da nossa grande fam\u00EDlia e, hoje, \u00E9 um"
					+ "<br/>membro deste Conselho. Todos n\u00F3s " + "<br/>conhecemos ele e ouvimos sobre seu "
					+ "<br/>passado. " + "<html>";
			linhas[6] = 7;

			tx[7] = "<html>Guradam:" + "<br/><br/>Veio da guerra, teve sua casa e sua "
					+ "<br/>fam\u00EDlia destru\u00EDdas, chegou em Helaria "
					+ "<br/>sem nada e nunca desistiu. Sempre " + "<br/>esteve disposto a enfrentar qualquer "
					+ "<br/>adversidade. Mas, agora a situa\u00E7\u00E3o \u00E9 "
					+ "<br/>outra, os mesmos que destru\u00EDram sua " + "<br/>casa e sua fam\u00EDlia se aproximam."
					+ "<html>";
			linhas[7] = 8;
		} else {
			tx[6] = "<html>Guradam:" + "<br/><br/>H\u00E1 quinze anos atr\u00E1s n\u00F3s acolhemos"
					+ "<br/>um novo membro, ela se tornou parte " + "<br/>da nossa grande fam\u00EDlia e, hoje, \u00E9"
					+ "<br/>membro deste Conselho. Todos n\u00F3s " + "<br/>conhecemos ela e ouvimos sobre seu "
					+ "<br/>passado. " + "<html>";
			linhas[6] = 7;

			tx[7] = "<html>Guradam:" + "<br/><br/>Veio da guerra, teve sua casa e sua "
					+ "<br/>fam\u00EDlia destru\u00EDdas, chegou em Helaria "
					+ "<br/>sem nada e nunca desistiu. Sempre " + "<br/>esteve disposta a enfrentar qualquer "
					+ "<br/>adversidade. Mas, agora a situa\u00E7\u00E3o \u00E9 "
					+ "<br/>outra, os mesmos que destru\u00EDram sua " + "<br/>casa e sua fam\u00EDlia se aproximam."
					+ "<html>";
			linhas[7] = 8;
		}

		tx[8] = "<html>Guradam:" + "<br/><br/>O Insuper\u00E1vel Imp\u00E9rio de Bethesda se "
				+ "<br/>aproxima e est\u00E1 preparado para a " + "<br/>guerra. Eu gostaria que todos voc\u00EAs "
				+ "<br/>se preparassem porque n\u00F3s vamos " + "<br/>proteger a cidade nessa guerra. " + "<html>";
		linhas[8] = 6;

		tx[9] = "<html>Guradam:" + "<br/><br/>E, " + player.getNome() + ", eu quero saber, se"
				+ "<br/>voc\u00EA vai deixar seu \u00F3dio tomar" + "<br/>conta de voc\u00EA nesta guerra ou vai "
				+ "<br/>manter a calma e fazer o que te for " + "<br/>pedido. " + "<html>";
		linhas[9] = 6;

		tx[10] = "<html>Voc\u00EA:" + "<br/><br/>Voc\u00EAs podem confiar em mim. Eu"
				+ "<br/>farei o que for preciso para proteger a " + "<br/>cidade e obedecerei qualquer ordem "
				+ "<br/>que me for designada. N\u00E3o deixarei " + "<br/>nenhuma emo\u00E7\u00E3o do passado me "
				+ "<br/>afetar agora." + "<html>";
		linhas[10] = 7;

		tx[11] = "<html>A reuni\u00E3o continua por mais algumas " + "<br/>horas, s\u00E3o discutidos alguns detalhes"
				+ "<br/>de como a Ordem Arcana atuar\u00E1 " + "<br/>durante a guerra, voc\u00EA \u00E9 informado "
				+ "<br/>que as tropas de Bethesda chegar\u00E3o " + "<br/>em Helaria em tr\u00EAs dias e esse \u00E9 o "
				+ "<br/>tempo que voc\u00EA tem para se preparar. " + "<html>";
		linhas[11] = 6;

		tx[12] = "<html>Artemisia te chama para conversar na "
				+ "<br/>biblioteca ap\u00F3s o t\u00E9rmino da reuni\u00E3o." + "<html>";
		linhas[12] = 1;

		choice = "<html>Artemisia:" + "<br/><br/>Voc\u00EA est\u00E1 bem?" + "<html>";
		op1 = "Mentir";
		op2 = "Ser sincero";

	}


	public void arcan2(int y) {
		int x = 0;

		switch(y) {
		case 1:
			tx = new String[20];
			linhas = new int[20];

			tx[0] = "<html>Voc\u00EA:" + "<br/><br/>Sim, estou bem, nada com que se" + "<br/>preocupar. " + "<html>";
			linhas[0] = 3;

			tx[1] = "<html>Artemisia:" + "<br/><br/>Tem certeza? Afinal, eles destru\u00EDram " + "<br/>sua fam\u00EDlia..."
					+ "<html>";
			linhas[1] = 3;

			tx[2] = "<html>Voc\u00EA:" + "<br/><br/>E eu n\u00E3o vou me deixar abalar por " + "<br/>isso." + "<html>";
			linhas[2] = 3;

			tx[3] = "<html>Artemisia:" + "<br/><br/>N\u00E3o vou deixar que eles destruam " + "<br/>esta nova fam\u00EDlia."
					+ "<html>";
			linhas[3] = 3;

			tx[4] = "<html>Voc\u00EA:" + "<br/><br/>Fico feliz em ouvir isso." + "<html>";
			linhas[4] = 2;
			x = 5;
			break;
		case 2:
			
			tx = new String[22];
			linhas = new int[22];

			tx[0] = "<html>Voc\u00EA:" + "<br/><br/>Estou vivendo um dia de cada vez." + "<html>";
			linhas[0] = 2;

			tx[1] = "<html>Artemisia:" + "<br/><br/>A aproxima\u00E7\u00E3o de Bethesda mexeu "
					+ "<br/>contigo n\u00E3o \u00E9?" + "<html>";
			linhas[1] = 3;

			tx[2] = "<html>Voc\u00EA:" + "<br/><br/>Um pouco... " + "<html>";
			linhas[2] = 2;

			if (player.getSexo() == 0) {
				tx[3] = "<html>Artemisia:" + "<br/><br/> Voc\u00EA est\u00E1 pronto para lutar contra  " + "<br/>eles? "
						+ "<html>";
				linhas[3] = 3;
			}else {
				tx[3] = "<html>Artemisia:" + "<br/><br/> Voc\u00EA est\u00E1 pronta para lutar contra  " + "<br/>eles? "
						+ "<html>";
				linhas[3] = 3;
			}
			tx[4] = "<html>Voc\u00EA:" + "<br/><br/>Sim, n\u00E3o vou deixar que meus " + "<br/>dem\u00F4nios me abalem.  "
					+ "<html>";
			linhas[4] = 3;

			tx[5] = "<html>Artemisia:" + "<br/><br/> Bem, se voc\u00EA diz, est\u00E1 tudo bem. "
					+ "<br/>Mas, eu estou aqui se precisar de " + "<br/>mim." + "<html>";
			linhas[5] = 4;

			tx[6] = "<html>Voc\u00EA:" + "<br/><br/>Agrade\u00E7o." + "<html>";
			linhas[6] = 2;
			x = 7;
			break;
			
		}
		
		tx[x+0] = "<html>Você:" + "<br/><br/>Agora, por que você me trouxe" + "<br/>justamente para a biblioteca? Com "
				+ "<br/>certeza não foi só para perguntar " + "<br/>como eu estava. " + "<html>";
		linhas[x+0] = 5;

		tx[x+1] = "<html>Artemisia:" + "<br/><br/>Para vencermos essa guerra nós "
				+ "<br/>precisamos que você aprenda um " + "<br/>feitiço." + "<html>";
		linhas[x+1] = 4;

		tx[x+2] = "<html>Você:" + "<br/><br/> Qual feitiço?" + "<html>";
		linhas[x+2] = 2;

		tx[x+3] = "<html>Artemisia:" + "<br/><br/>Maelstrom." + "<html>";
		linhas[x+3] = 2;

		tx[x+4] = "<html>Você:" + "<br/><br/>Ele é um feitiço sagrado, reservado "
				+ "<br/>somente para os maiores arcanos" + "<br/>então por que eu deveria aprendê-lo? " + "<html>";
		linhas[x+4] = 4;

		if (player.getSexo() == 0) {
			tx[x+5] = "<html>Artemisia:" + "<br/><br/>Sábio Guradan acredita que você é o "
					+ "<br/>único que pode. O feitiço está " + "<br/>ligado ao sangue. Somente aqueles "
					+ "<br/>que partilham do sangue de Merlin " + "<br/>podem usá-lo." + "<html>";
			linhas[x+5] = 6;

			tx[x+6] = "<html>Você:" + "<br/><br/>E Guradan acredita que esse  "
					+ "<br/>sangue corre em meu corpo. Isso é " + "<br/>loucura, eu cresci no campo, não sou  "
					+ "<br/>de uma família de renome ou algo  " + "<br/>parecido. Isso é impossível. " + "<html>";
			linhas[x+6] = 6;

			tx[x+7] = "<html>Artemisia:" + "<br/><br/>" + player.getNome() + " Merlin viveu um  "
					+ "<br/>período em uma torre perto de sua " + "<br/>vila. Segundo o que se diz ele teve "
					+ "<br/>um breve relacionamento com uma " + "<br/>camponesa e daí pode ter vindo sua "
					+ "<br/>família." + "<html>";
			linhas[x+7] = 7;

			tx[x+8] = "<html>Artemisia:" + "<br/><br/>De qualquer forma, essa é nossa  "
					+ "<br/>melhor chance. Há muito a Ordem de " + "<br/>Merlin nos deixou e agora você é o  "
					+ "<br/>único que talvez possa usar o feitiço. " + "<html>";
			linhas[x+8] = 5;

			tx[x+9] = "<html>Você:" + "<br/><br/>Tudo bem, se eu realmente puder, "
					+ "<br/>onde ele está? Onde está o livro em " + "<br/>que ele é descrito? Eu já revirei essa  "
					+ "<br/>biblioteca inteira e o máximo que vi  " + "<br/>foram menções a ele.  " + "<html>";
			linhas[x+9] = 6;

			tx[x+10] = "<html>Artemisia:" + "<br/><br/>Ele está em uma ala secreta da  "
					+ "<br/>biblioteca, mas para você deve  " + "<br/>encontrá - lo sozinho. Está pronto?" + "<html>";
			linhas[x+10] = 4;

			tx[x+11] = "<html>Você:" + "<br/><br/>Vamos lá." + "<html>";
			linhas[x+11] = 2;

			tx[x+12] = "<html>Vocês vão para uma parte escondida" + "<br/>da biblioteca e lá Artemisia abre uma"
					+ "<br/>passagem para o que lhe parece um  " + "<br/>labirinto." + "<html>";
			linhas[x+12] = 3;

			tx[x+13] = "<html>Artemisia:" + "<br/><br/>Boa sorte." + "<html>";
			linhas[x+13] = 2;

			tx[x+14] = "<html>Você:" + "<br/><br/>Obrigado, vou precisar. " + "<html>";
			linhas[x+14] = 2;
		} else {
			tx[x+5] = "<html>Artemisia:" + "<br/><br/>Sábio Guradan acredita que você é a"
					+ "<br/>única que pode. O feitiço está " + "<br/>ligado ao sangue. Somente aqueles "
					+ "<br/>que partilham do sangue de Merlin " + "<br/>podem usá-lo." + "<html>";
			linhas[x+5] = 6;

			tx[x+6] = "<html>Você:" + "<br/><br/>E Guradan acredita que esse  "
					+ "<br/>sangue corre em meu corpo. Isso é " + "<br/>loucura, eu cresci no campo, não sou  "
					+ "<br/>de uma família de renome ou algo  " + "<br/>parecido. Isso é impossível. " + "<html>";
			linhas[x+6] = 6;

			tx[x+7] = "<html>Artemisia:" + "<br/><br/>" + player.getNome() + " Merlin viveu um  "
					+ "<br/>período em uma torre perto de sua " + "<br/>vila. Segundo o que se diz ele teve "
					+ "<br/>um breve relacionamento com uma " + "<br/>camponesa e daí pode ter vindo sua "
					+ "<br/>família." + "<html>";
			linhas[x+7] = 7;

			tx[x+8] = "<html>Artemisia:" + "<br/><br/>De qualquer forma, essa é nossa  "
					+ "<br/>melhor chance. Há muito a Ordem de " + "<br/>Merlin nos deixou e agora você é a "
					+ "<br/>única que talvez possa usar o feitiço. " + "<html>";
			linhas[x+8] = 5;

			tx[x+9] = "<html>Você:" + "<br/><br/>Tudo bem, se eu realmente puder, "
					+ "<br/>onde ele está? Onde está o livro em " + "<br/>que ele é descrito? Eu já revirei essa  "
					+ "<br/>biblioteca inteira e o máximo que vi  " + "<br/>foram menções a ele.  " + "<html>";
			linhas[x+9] = 6;

			tx[x+10] = "<html>Artemisia:" + "<br/><br/>Ele está em uma ala secreta da  "
					+ "<br/>biblioteca, mas para você deve  " + "<br/>encontrá - lo sozinho. Está pronto?" + "<html>";
			linhas[x+10] = 4;

			tx[x+11] = "<html>Você:" + "<br/><br/>Vamos lá." + "<html>";
			linhas[x+11] = 2;

			tx[x+12] = "<html>Vocês vão para uma parte escondida" + "<br/>da biblioteca e lá Artemisia abre uma"
					+ "<br/>passagem para o que lhe parece um  " + "<br/>labirinto." + "<html>";
			linhas[x+12] = 3;

			tx[x+13] = "<html>Artemisia:" + "<br/><br/>Boa sorte." + "<html>";
			linhas[x+13] = 2;

			tx[x+14] = "<html>Você:" + "<br/><br/>Obrigada, vou precisar. " + "<html>";
			linhas[x+14] = 2;
		}

	}

//	  tx[] = "<html>"
//		 	+ "<br/>"
//		 	+ "<br/>" 
//		 	+ "<br/>"
//			 +"<html>";
//	linhas[] = ;
}
