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

		tx[12] = "<html>Após  o término da reunião, Guradam  " + "<br/>te chama para acompanhá-lo ao seu "
				+ "<br/>escritório. Chegando lá você encontra " + "<br/>Artemisia já esperando por vocês" + "<html>";
		linhas[12] = 3;

		choice = "<html>Artemisia:" + "<br/><br/>Voc\u00EA est\u00E1 bem?" + "<html>";
		op1 = "Mentir";
		op2 = "Ser sincero";

	}

	public void arcan2(int y) {
		int x = 0;

		switch (y) {
		case 1:
			tx = new String[19];
			linhas = new int[19];

			tx[0] = "<html>Voc\u00EA:" + "<br/><br/>Sim, estou bem, nada com que se" + "<br/>preocupar. " + "<html>";
			linhas[0] = 3;

			tx[1] = "<html>Artemisia:" + "<br/><br/>Tem certeza? Afinal, eles destru\u00EDram "
					+ "<br/>sua fam\u00EDlia..." + "<html>";
			linhas[1] = 3;

			tx[2] = "<html>Voc\u00EA:" + "<br/><br/>E eu n\u00E3o vou me deixar abalar por " + "<br/>isso." + "<html>";
			linhas[2] = 3;

			tx[3] = "<html>Artemisia:" + "<br/><br/>N\u00E3o vou deixar que eles destruam "
					+ "<br/>esta nova fam\u00EDlia." + "<html>";
			linhas[3] = 3;

			tx[4] = "<html>Voc\u00EA:" + "<br/><br/>Fico feliz em ouvir isso." + "<html>";
			linhas[4] = 2;
			x = 5;
			break;
		case 2:

			tx = new String[21];
			linhas = new int[21];

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
			} else {
				tx[3] = "<html>Artemisia:" + "<br/><br/> Voc\u00EA est\u00E1 pronta para lutar contra  " + "<br/>eles? "
						+ "<html>";
				linhas[3] = 3;
			}
			tx[4] = "<html>Voc\u00EA:" + "<br/><br/>Sim, n\u00E3o vou deixar que meus "
					+ "<br/>dem\u00F4nios me abalem.  " + "<html>";
			linhas[4] = 3;

			tx[5] = "<html>Artemisia:" + "<br/><br/> Bem, se voc\u00EA diz, est\u00E1 tudo bem. "
					+ "<br/>Mas, eu estou aqui se precisar de " + "<br/>mim." + "<html>";
			linhas[5] = 4;

			tx[6] = "<html>Voc\u00EA:" + "<br/><br/>Agrade\u00E7o." + "<html>";
			linhas[6] = 2;
			x = 7;
			break;

		}

		tx[x + 0] = "<html>Você:" + "<br/><br/>Agora, por que vocês me trouxeram"
				+ "<br/>aqui? Com certeza não foi só para " + "<br/>perguntar como eu estou " + "<html>";
		linhas[x + 0] = 4;

		tx[x + 1] = "<html>Artemisia:" + "<br/><br/>Para vencermos essa guerra nós "
				+ "<br/>precisamos que você aprenda um " + "<br/>feitiço." + "<html>";
		linhas[x + 1] = 4;

		tx[x + 2] = "<html>Você:" + "<br/><br/> Qual feitiço?" + "<html>";
		linhas[x + 2] = 2;

		tx[x + 3] = "<html>Artemisia:" + "<br/><br/>Maelstrom." + "<html>";
		linhas[x + 3] = 2;

		tx[x + 4] = "<html>Você:" + "<br/><br/>Ele é um feitiço sagrado, reservado "
				+ "<br/>somente para os maiores arcanos" + "<br/>então por que eu deveria aprendê-lo? " + "<html>";
		linhas[x + 4] = 4;

		if (player.getSexo() == 0) {
			tx[x + 5] = "<html>Guradam:" + "<br/><br/>Acreditamos que você é o único que  "
					+ "<br/>pode. O feitiço está ligado ao sangue. " + "<br/>Somente aqueles que partilham do "
					+ "<br/>sangue de Merlin podem usá-lo. " + "<html>";
			linhas[x + 5] = 5;

			tx[x + 6] = "<html>Você:" + "<br/><br/> E vocês acreditam que esse sangue "
					+ "<br/>corre em meu corpo. Isso é " + "<br/>loucura, eu cresci no campo, não sou  "
					+ "<br/>de uma família de renome ou algo  " + "<br/>parecido. Isso é impossível. " + "<html>";
			linhas[x + 6] = 6;

			tx[x + 7] = "<html>Artemisia:" + "<br/><br/>" + player.getNome() + " Merlin viveu um  "
					+ "<br/>período em uma torre perto de sua " + "<br/>vila. Segundo o que se diz ele teve "
					+ "<br/>um breve relacionamento com uma " + "<br/>camponesa e daí pode ter vindo sua "
					+ "<br/>família." + "<html>";
			linhas[x + 7] = 7;

			tx[x + 8] = "<html>Artemisia:" + "<br/><br/>De qualquer forma, essa é nossa  "
					+ "<br/>melhor chance. Há muito a Ordem de " + "<br/>Merlin nos deixou e agora você é o  "
					+ "<br/>único que talvez possa usar o feitiço. " + "<html>";
			linhas[x + 8] = 5;

			tx[x + 9] = "<html>Você:" + "<br/><br/>Tudo bem, o que eu preciso fazer  "
					+ "<br/>para realizar esse feitiço?" + "<html>";
			linhas[x + 9] = 3;

			tx[x + 10] = "<html>Guradam:" + "<br/><br/>Para se usar esse feitiço   "
					+ "<br/>perfeitamente você precisa encontrar   " + "<br/>os 3 itens sagrados de Merlin. O seu "
					+ "<br/>livro de feitiços original, que se encontra " + "<br/>escondido em nossa biblioteca."
					+ "<br/>" + "<html>";
			linhas[x + 10] = 6;

			tx[x + 11] = "<html>Guradam:" + "<br/><br/> A jóia do tempo, cujos rumores dizem "
					+ "<br/>que se encontra escondida sob a " + "<br/>Catedral. " + "<html>";
			linhas[x + 11] = 4;

			tx[x + 12] = "<html>Guradam:" + "<br/><br/> E o Cajado de Merlin, que"
					+ "<br/>infelizmente foi roubado de nós " + "<br/>recentemente. Imagino que ainda se"
					+ "<br/>encontre nos armazéns da alameda " + "<br/>dos 3 ponteiros " + "<html>";
			linhas[x + 12] = 6;

			tx[x + 13] = "<html>Guradam:" + "<br/><br/>Por favor recupere esses itens o mais "
					+ "<br/>rápido possível. Mesmo que não  " + "<br/>consiga recuperar todos, talvez  "
					+ "<br/>consiga realizar o feitiço " + "<br/>incompleto. Será melhor do que nada." + "<br/>"
					+ "<html>";
			linhas[x + 13] = 6;

			tx[x + 13] = "<html>Guradam:" + "<br/><br/>Você é o único que pode realizar essa "
					+ "<br/>tarefa. Graças ao seu sangue, você" + "<br/>provavelmente poderá sentir a  "
					+ "<br/>proximidade com tais relíquias. " + "<html>";
			linhas[x + 13] = 5;

			tx[x + 13] = "<html>Guradam:" + "<br/><br/>Além disso, temos de preparar as  "
					+ "<br/>nossas defesas enquanto isso. E " + "<br/>também nos prepararmos para fugir,   "
					+ "<br/>caso tudo dê errado." + "<html>";
			linhas[x + 13] = 5;

			tx[x + 13] = "<html>Você:" + "<br/><br/>Entendo... Nesse caso irei " + "<br/>imediatamente." + "<html>";
			linhas[x + 13] = 3;

		} else {
			tx[x + 5] = "<html>Guradan:" + "<br/><br/>Acreditamos que você é a única que "
					+ "<br/>pode. O feitiço está ligado ao sangue. " + "<br/> Somente aqueles  que partilham do  "
					+ "<br/>sangue de Merlin podem usá-lo." + "<html>";
			linhas[x + 5] = 5;

			tx[x + 6] = "<html>Você:" + "<br/><br/>E Guradan acredita que esse  "
					+ "<br/>sangue corre em meu corpo. Isso é " + "<br/>loucura, eu cresci no campo, não sou  "
					+ "<br/>de uma família de renome ou algo  " + "<br/>parecido. Isso é impossível. " + "<html>";
			linhas[x + 6] = 6;

			tx[x + 7] = "<html>Artemisia:" + "<br/><br/>" + player.getNome() + " Merlin viveu um  "
					+ "<br/>período em uma torre perto de sua " + "<br/>vila. Segundo o que se diz ele teve "
					+ "<br/>um breve relacionamento com uma " + "<br/>camponesa e daí pode ter vindo sua "
					+ "<br/>família." + "<html>";
			linhas[x + 7] = 7;

			tx[x + 8] = "<html>Artemisia:" + "<br/><br/>De qualquer forma, essa é nossa  "
					+ "<br/>melhor chance. Há muito a Ordem de " + "<br/>Merlin nos deixou e agora você é a "
					+ "<br/>única que talvez possa usar o feitiço. " + "<html>";
			linhas[x + 8] = 5;

			tx[x + 9] = "<html>Você:" + "<br/><br/>Tudo bem, o que eu preciso fazer  "
					+ "<br/>para realizar esse feitiço?" + "<html>";
			linhas[x + 9] = 3;

			tx[x + 10] = "<html>Guradam:" + "<br/><br/>Para se usar esse feitiço   "
					+ "<br/>perfeitamente você precisa encontrar   " + "<br/>os 3 itens sagrados de Merlin. O seu "
					+ "<br/>livro de feitiços original, que se encontra " + "<br/>escondido em nossa biblioteca."
					+ "<br/>" + "<html>";
			linhas[x + 10] = 6;

			tx[x + 11] = "<html>Guradam:" + "<br/><br/> A jóia do tempo, cujos rumores dizem "
					+ "<br/>que se encontra escondida sob a " + "<br/>Catedral. " + "<html>";
			linhas[x + 11] = 4;

			tx[x + 12] = "<html>Guradam:" + "<br/><br/> E o Cajado de Merlin, que"
					+ "<br/>infelizmente foi roubado de nós " + "<br/>recentemente. Imagino que ainda se"
					+ "<br/>encontre nos armazéns da alameda " + "<br/>dos 3 ponteiros " + "<html>";
			linhas[x + 12] = 6;

			tx[x + 13] = "<html>Guradam:" + "<br/><br/>Por favor recupere esses itens o mais "
					+ "<br/>rápido possível. Mesmo que não  " + "<br/>consiga recuperar todos, talvez  "
					+ "<br/>consiga realizar o feitiço " + "<br/>incompleto. Será melhor do que nada." + "<br/>"
					+ "<html>";
			linhas[x + 13] = 6;

			tx[x + 13] = "<html>Guradam:" + "<br/><br/>Você é a única que pode realizar essa "
					+ "<br/>tarefa. Graças ao seu sangue, você" + "<br/>provavelmente poderá sentir a  "
					+ "<br/>proximidade com tais relíquias. " + "<html>";
			linhas[x + 13] = 5;

			tx[x + 13] = "<html>Guradam:" + "<br/><br/>Além disso, temos de preparar as  "
					+ "<br/>nossas defesas enquanto isso. E " + "<br/>também nos prepararmos para fugir,   "
					+ "<br/>caso tudo dê errado." + "<html>";
			linhas[x + 13] = 5;

			tx[x + 13] = "<html>Você:" + "<br/><br/>Entendo... Nesse caso irei " + "<br/>imediatamente." + "<html>";
			linhas[x + 13] = 3;
		}

	}

	public void torre() {

		tx = new String[7];
		linhas = new int[7];

		tx[0] = "<html>Ao entrar na biblioteca da Torre, você " + "<br/>encontra Artemisia." + "<html>";
		linhas[0] = 1;

		tx[1] = "<html>Artemisia:" + "<br/><br/>Imagino que você está buscando o " + "<br/>livro de Merlin,certo?"
				+ "<html>";
		linhas[1] = 3;

		tx[2] = "<html>Você:" + "<br/><br/>Exato, mas onde ele está? Eu já  "
				+ "<br/>revirei essa biblioteca inteira e o " + "<br/>máximo que vi foram menções a ele." + "<html>";
		linhas[2] = 4;

		tx[3] = "<html>Artemisia:" + "<br/><br/>Segundo as lendas, ele está em uma  "
				+ "<br/>ala secreta da biblioteca, mas  " + "<br/>somente um descendente de Merlim "
				+ "<br/>pode encontrá - lo. Posso pelo menos " + "<br/>te levar até a ala secreta" + "<html>";
		linhas[3] = 6;

		tx[4] = "<html>Vocês vão para uma parte escondida" + "<br/>da biblioteca e lá Artemisia abre uma"
				+ "<br/>passagem para o que lhe parece um  " + "<br/>labirinto." + "<html>";
		linhas[4] = 3;

		tx[5] = "<html>Artemisia:" + "<br/><br/>Boa sorte." + "<html>";
		linhas[5] = 2;

		tx[6] = "<html>Você:" + "<br/><br/>Obrigado, vou precisar. " + "<html>";
		linhas[6] = 2;

	}

	public void torre2() {

		tx = new String[1];
		linhas = new int[1];

		tx[0] = "<html>Você entra na ala secreta da  " + "<br/>biblioteca" + "<html>";
		linhas[0] = 1;
	}

	public void torreDerrota() {

		if (player.getHoras() == 3) {

			tx = new String[3];
			linhas = new int[3];

			tx[1] = "<html>Já está muito tarde, todos os esforços " + "<br/>do dia pesam sobre seu corpo e você "
					+ "<br/>não conseguiria fazer mais nada sem " + "<br/>dormir um pouco…" + "<html>";
			linhas[1] = 3;

			tx[2] = "<html>Você acorda e percebe que já é o fim " + "<br/>da manhã, você deve se apressar " + "<html>";
			linhas[2] = 1;
		} else {

			tx = new String[1];
			linhas = new int[1];
		}

		tx[0] = "<html>Você pega o livro e um fluxo de " + "<br/>energia percorre o seu corpo. De "
				+ "<br/>repente tudo escurece… Você acorda " + "<br/>em seu quarto, aos poucos as "
				+ "<br/>memórias do ocorrido voltam a sua " + "<br/>mente, e também o conhecimento de "
				+ "<br/>que você não encontrou o livro de " + "<br/>Merlin. Você pode tentar novamente, "
				+ "<br/>mas há tempo o suficiente?" + "<html>";
		linhas[0] = 8;
	}

	public void torreVitoria() {
		tx = new String[8];
		linhas = new int[8];
		tx[0] = "<html>Os três livros que você pegou brilham " + "<br/>intensamente. e quando o brilho "
				+ "<br/>diminui, você nota que os três livros  " + "<br/>agora são apenas um. O poder "
				+ "<br/>emanando do livro te dá a certeza, " + "<br/>esse é o livro de Merlin. " + "<html>";
		linhas[0] = 5;

		tx[1] = "<html>Impressionado pela beleza e  " + "<br/>majestade do livro, você o abre no "
				+ "<br/>pedestal em que encontrou o último " + "<br/>fragmento do livro e começa a leitura. "
				+ "<br/>É magnífico, tantas revelações tantas" + "<br/>coisas. Tudo passando por sua "
				+ "<br/>cabeça em um piscar de olhos. Você " + "<br/>desmaia." + "<html>";
		linhas[1] = 7;

		tx[2] = "<html>Voz: " + "<br/><br/>Bom dia dorminhoco " + "<html>";
		linhas[2] = 2;

		tx[3] = "<html>As luzes do dia batem em seu rosto, " + "<br/>você percebe que já é o fim da manhã." + "<html>";
		linhas[3] = 1;

		tx[4] = "<html>Voz: " + "<br/><br/> o que aconteceu? " + "<html>";
		linhas[4] = 2;
		if (player.getSexo() == 0) {
			tx[5] = "<html>Artemisia: " + "<br/><br/>Você estava demorando muito "
					+ " <br/>tempo naquele labirinto então fomos " + " <br/>procurá-lo. Te encontramos "
					+ " <br/>desmaiado e com o livro aberto, te " + " <br/>trouxemos para o seu quarto e você"
					+ " <br/>está dormindo desde ontem." + "<html>";
			linhas[5] = 7;
		} else {
			tx[5] = "<html>Artemisia: " + "<br/><br/>Você estava demorando muito "
					+ " <br/>tempo naquele labirinto então fomos " + " <br/>procurá-la. Te encontramos "
					+ " <br/>desmaiado e com o livro aberto, te " + " <br/>trouxemos para o seu quarto e você"
					+ " <br/>está dormindo desde ontem." + "<html>";
		}
		tx[6] = "<html>Você: " + "<br/><br/>Caramba, eu não deveria ter dormido " + " <br/>tanto tempo! " + "<html>";
		linhas[6] = 3;

		tx[7] = "<html>Artemisia: " + "<br/><br/>Você não conseguirá fazer nada se "
				+ " <br/>apressando desse jeito. Respire e " + " <br/>pense no que você precisa fazer." + "<html>";
		linhas[7] = 4;
	}

	public void catedral() {

		tx = new String[8];
		linhas = new int[8];

		tx[0] = "<html>Você se encaminha para a Catedral, " + "<br/>chegando lá você encontra o Bispo. É "
				+ "<br/>visível que ele não está feliz em te ver…" + "<html>";
		linhas[0] = 2;
		if (player.getSexo() == 0) {
			tx[1] = "<html>Bispo:" + "<br/><br/>O que levou um herege da Torre Arcana"
					+ "<br/>a pisar no solo sagrado da Catedral?" + "<html>";
			linhas[1] = 3;

			tx[2] = "<html>Você:" + "<br/><br/>Vim em busca da joia do tempo. Dizem "
					+ "<br/>que ela se encontra sob esta Catedral." + "<html>";
			linhas[2] = 3;

			tx[3] = "<html>Bispo:" + "<br/><br/>E o que leva você a pensar que eu  "
					+ "<br/>deixaria um herege invadir a minha " + "<br/>Catedral e roubar tesouros divinos?"
					+ "<html>";
			linhas[3] = 4;
		} else {
			tx[1] = "<html>Bispo:" + "<br/><br/>O que levou uma herege da Torre Arcana a "
					+ "<br/>a pisar no solo sagrado da Catedral?" + "<html>";
			linhas[1] = 3;

			tx[2] = "<html>Você:" + "<br/><br/>Vim em busca da joia do tempo. Dizem "
					+ "<br/>que ela se encontra sob esta Catedral." + "<html>";
			linhas[2] = 3;

			tx[3] = "<html>Bispo:" + "<br/><br/>E o que leva você a pensar que eu  "
					+ "<br/>deixaria uma herege invadir a minha " + "<br/>Catedral e roubar tesouros divinos?"
					+ "<html>";
			linhas[3] = 4;
		}
		tx[4] = "<html>Você:" + "<br/><br/>A joia vai ajudar a proteger a cidade, não"
				+ "<br/>sei se o senhor sabe, mas Bethesda está " + "<br/>se aproximando e ela vai destruir todos "
				+ "<br/>nós. " + "<html>";
		linhas[4] = 5;

		tx[5] = "<html>Bispo:" + "<br/><br/Todos vocês no caso. Bethesda  "
				+ "<br/>compartilha da mesma fé que Helaria, " + "<br/>eles não são uma ameaça à Igreja.  " + "<html>";
		linhas[5] = 4;

		tx[6] = "<html>Você:" + "<br/><br/>Como você pode ser tão egoísta? Pense "
				+ "<br/>em quantas pessoas podemos salvar." + "<html>";
		linhas[6] = 3;

		tx[7] = "<html>Bispo:" + "<br/><br/> Helarianos vão morrer se vocês falharem "
				+ "<br/>e Bethesdences irão morrer se vocês " + "<br/>vencerem. A Igreja não pode escolher "
				+ "<br/>sobre a vida de dois fiéis. Ao menos suas " + "<br/>almas serão salvas." + "<html>";
		linhas[7] = 6;

		choice = "<html>Você tem que chegar nas catacumbas de " + "<br/>qualquer jeito para conseguir a jóia, mas "
				+ "<br/>como passar pelo bispo?" + "<html>";

		op1 = "Continuar insistindo";
		op2 = "Entrar escondido";

	}

	public void catedral2(int y) {
		int x = 0;
		switch (y) {
		case 1:
			if (player.isAndarPelaTorreArcan()) {
				tx = new String[9];
				linhas = new int[9];
			} else {
				tx = new String[8];
				linhas = new int[8];
			}

			tx[0] = "<html>Você continua a pressionar o Bispo, até " + "<br/>que, com um ar de desgosto, ele "
					+ "<br/>concorda em guiar-lhe até as" + "<br/>catacumbas." + "<html>";
			linhas[0] = 3;

			tx[1] = "<html>Ao chegar em uma grande portão de" + "<br/>ferro, o bispo manda você entrar, após  "
					+ "<br/>atravessar o portão, o bispo o fecha e" + "<br/>tranca - o." + "<html>";
			linhas[1] = 3;

			if (player.getSexo() == 0) {
				tx[2] = "<html>Bispo: " + "<br/><br/>Eu lhe disse que te guiaria até as  "
						+ "<br/>catacumbas, nunca disse que você iria" + "<br/>voltar vivo." + "<html>";
				linhas[2] = 4;

				tx[3] = "<html>A fala do bispo te deixa confuso e " + "<br/>preocupado. Mas você não tem opção "
						+ "<br/>além de explorar as catacumbas." + "<html>";
				linhas[3] = 2;

			} else {
				tx[2] = "<html>Bispo: " + "<br/><br/>Eu lhe disse que te guiaria até as  "
						+ "<br/>catacumbas, nunca disse que você iria" + "<br/>voltar viva." + "<html>";
				linhas[2] = 4;

				tx[3] = "<html>A fala do bispo te deixa confuso e " + "<br/>preocupada. Mas você não tem opção "
						+ "<br/>além de explorar as catacumbas." + "<html>";
				linhas[3] = 2;

			}
			x = 4;
			break;
		case 2:
			if (player.isAndarPelaTorreArcan()) {
				tx = new String[6];
				linhas = new int[6];
			} else {
				tx = new String[5];
				linhas = new int[5];
			}
			if (player.getSexo() == 0) {
				tx[0] = "<html>Você sai da Catedral, troca suas roupas "
						+ "<br/>para se parecer como um fiel da Igreja e " + "<br/>não tem muitos problemas para "
						+ "<br/>encontrar  a passagem para as catacumbas." + "<html>";
				linhas[0] = 3;
			} else {
				tx[0] = "<html>Você sai da Catedral, troca suas roupas "
						+ "<br/>para se parecer como uma fiel da Igreja e "
						+ "<br/>não tem muitos problemas para encontrar " + "<br/>a passagem para as catacumbas."
						+ "<html>";
				linhas[0] = 3;
			}
			x = 1;
			break;
		}
		tx[0 + x] = "<html>Após certo explorando tempo você " + "<br/>consegue sentir a presença da jóia por"
				+ "<br/>perto, é como uma voz lhe convidando a  " + "<br/>segui-lá." + "<html>";
		linhas[0 + x] = 3;
		if (player.isAndarPelaTorreArcan()) {
			tx[1 + x] = "<html>Você percebe que essa é a mesma voz " + "<br/>que você tinha ouvido 15 anos atrás, "
					+ "<br/>quando entrou na torre pela primeira vez. " + "<br/>Só que dessa vez mais poderosa, mais"
					+ "<br/>real. Isso te dá a certeza de que a joia " + "<br/>está próxima" + "<html>";
			linhas[1 + x] = 3;
			x++;
		}
		tx[1 + x] = "<html>Enquanto você segue a voz, você repara " + "<br/>que salas das catacumbas estão ficando "
				+ "<br/>cada vez maiores, e percebe um som  " + "<br/>alto, parecendo um animal selvagem. E "
				+ "<br/>um forte cheiro de sangue invade o ar. " + "<br/>surpreende ao encontrar uma Hidra  "
				+ "<br/>guardando a passagem." + "<html>";
		linhas[1 + x] = 6;

		tx[2 + x] = "<html>Você se lembra de seus estudos, que  " + "<br/>Hidras são imunes a magia, por \"sorte\" "
				+ "<br/>as catacumbas estão cheias guerreiros " + "<br/>mortos segurando suas espadas. " + "<html>";
		linhas[2 + x] = 3;

		tx[3 + x] = "<html>Você corre para pegar a espada de um " + "<br/>dos cadáveres e se vira para encarar o  "
				+ "<br/>monstro que está entre você e a jóia do " + "<br/tempo. " + "<html>";
		linhas[3 + x] = 3;
	}

	public void catedral3() {
		tx = new String[1];
		linhas = new int[1];

		tx[0] = "<html>Você segue a passagem do esgoto que" + "<br/>leva as catacumbas e rapidamente você"
				+ "<br/>se encontra na sala da Hidra, " + "<br/>determinado a exterminar a criatura para"
				+ "<br/>poder obter a jóia do tempo" + "<html>";
		linhas[0] = 4;
	}

	public void catedralDerrota(int x) {
		if (player.getHoras() == 3) {

			tx = new String[4];
			linhas = new int[4];

			tx[1] = "<html>Já está muito tarde, todos os esforços " + "<br/>do dia pesam sobre seu corpo e você "
					+ "<br/>não conseguiria fazer mais nada sem " + "<br/>dormir um pouco…" + "<html>";
			linhas[1] = 3;

			tx[2] = "<html>Você acorda e percebe que já é o fim " + "<br/>da manhã, você deve se apressar " + "<html>";
			linhas[2] = 1;
		} else {

			tx = new String[2];
			linhas = new int[2];
		}

		switch (x) {
		case 1:
			tx[0] = "<html>A luta torna - se muito longa, você não " + "<br/>conseguirá batalhar por muito mais  "
					+ "<br/>tempo." + "<html>";
			linhas[0] = 3;
			break;
		case 2:
			tx[0] = "<html>A Hidra é forte de mais e a cada ataque  " + "<br/>ela cresce mais. Você não tem chances "
					+ "<br/>de vencê-la agora." + "<html>";
			linhas[0] = 3;
			break;
		}
		tx[1] = "<html>Sua única opção é fugir, você se vira e " + "<br/>começa a correr pelas catacumbas, por "
				+ "<br/>sorte você encontra uma passagem que" + "<br/>dá nos esgotos da cidade. Depois de "
				+ "<br/>restaurar suas forças você pode tentar" + "<br/>enfrentar a besta de novo, mas será que  "
				+ "<br/>que você não encontrou o livro de " + "<br/>Merlin. Você pode tentar novamente, "
				+ "<br/>há tempo para isso?" + "<html>";
		linhas[1] = 8;
	}

	public void catedralVitoria() {
		tx = new String[6];
		linhas = new int[6];
		if (player.getSexo() == 0) {
			tx[0] = "<html>Depois de destruir o coração da Hidra" + "<br/>você segue as catacumbas.  "
					+ "<br/>Estranhamente você chega a um  " + "<br/>beco vazio. Decepcionado você volta"
					+ "<br/>para a torre, mas mal chega na porta, " + "<br/>desmaia." + "<br/>" + "<html>";
			linhas[0] = 5;
		} else {
			tx[0] = "<html>Depois de destruir o coração da Hidra" + "<br/>você segue as catacumbas.  "
					+ "<br/>Estranhamente você chega a um  " + "<br/>beco vazio. Decepcionadoa você volta"
					+ "<br/>para a torre, mas mal chega na porta, " + "<br/>desmaia." + "<br/>" + "<html>";
			linhas[0] = 5;
		}
		tx[1] = "<html>Chega à madrugada e você acorda  " + "<br/com alguém chamando o seu nome. "
				+ "<br/>Rapidamente você vai em direção ao  " + "<br/>chamado até que se depara com uma "
				+ "<br/>sala totalmente diferente de qualquer " + "<br/>coisa que já tenha visto antes.  " + "<html>";
		linhas[1] = 5;

		tx[2] = "<html>Cheia de tesouros, livros, tapeçarias, " + "<br/>tudo de mais valor possível, essa é a "
				+ "<br/>sala que um dia foi de Merlin e, em " + "<br/>seu centro está a jóia do tempo " + "<html>";
		linhas[2] = 3;

		tx[3] = "<html>É dela que vem o chamado. Você vai " + "<br/>vaté o pedestal e pega a joia. Você "
				+ "<br/>entende que a joia nunca esteve sob " + "<br/>a Catedral, e que era impossível "
				+ "<br/>encontrá-la sem que a joia desejasse" + "<br/>se revelar a você. A Hidra não passou "
				+ "<br/>de um teste para determinar se você " + "<br/>tinha o que é necessário para usar a "
				+ "<br/>jóia" + "<html>";
		linhas[3] = 8;

		tx[4] = "<html>Você volta para a cama porque no dia " + "<br/>seguinte terá muito com o que se "
				+ "<br/>preocupar." + "<html>";
		linhas[4] = 2;

		tx[5] = "<html>Quando você finalmente acorda a " + "<br/>manhã já acabou, e você tem muito o"
				+ "<br/>que fazer." + "<html>";
		linhas[5] = 2;

	}

	public void alameda(){
		tx = new String[1];
		linhas = new int[1];

		tx[0] = "<html> A fazer, teste outro " + "<html>";
		linhas[0] = 1;
	}
//	  tx[] = "<html>"
//		 	+ "<br/>"
//		 	+ "<br/>" 
//		 	+ "<br/>"
//			 +"<html>";
//	linhas[] = ;
}
