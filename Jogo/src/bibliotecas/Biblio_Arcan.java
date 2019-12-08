package bibliotecas;

public class Biblio_Arcan extends Biblioteca {

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
	public void arcan1() {

		tx = new String[13];

		if (masculino) {

			tx[0] = "Quinze anos se passaram desde sua inicia\u00E7\u00E3o na Ordem Arcana. "
					+ " Atualmente voc\u00EA est\u00E1 com 32 anos e recentemente alcan\u00E7ou o ranque de"
					+ " Mestre Arcano, posi\u00E7\u00E3o essa alcan\u00E7ada apenas pelos melhores da "
					+ " sua Ordem. ";

			tx[6] = "Guradam:\n\nH\u00E1 quinze anos atr\u00E1s n\u00F3s acolhemos"
					+ " um novo membro, ele se tornou parte da nossa grande fam\u00EDlia e, hoje, \u00E9 um"
					+ " membro deste Conselho. Todos n\u00F3s conhecemos ele e ouvimos sobre seu passado. ";

			tx[7] = "Guradam:\n\nVeio da guerra, teve sua casa e sua "
					+ " fam\u00EDlia destru\u00EDdas, chegou em Helaria sem nada e nunca desistiu. Sempre "
					+ " esteve disposto a enfrentar qualquer adversidade. Mas, agora a situa\u00E7\u00E3o \u00E9 "
					+ " outra, os mesmos que destru\u00EDram sua casa e sua fam\u00EDlia se aproximam.";

			op2 = "Ser sincero";

		} else {

			tx[0] = "Quinze anos se passaram desde sua inicia\u00E7\u00E3o na Ordem Arcana. "
					+ " Atualmente voc\u00EA est\u00E1 com 32 anos e recentemente alcan\u00E7ou o ranque de"
					+ " Mestre Arcana, posi\u00E7\u00E3o essa alcan\u00E7ada apenas pelos melhores da "
					+ " sua Ordem. ";

			tx[6] = "Guradam:\n\nH\u00E1 quinze anos atr\u00E1s n\u00F3s acolhemos"
					+ " um novo membro, ela se tornou parte da nossa grande fam\u00EDlia e, hoje, \u00E9"
					+ " membro deste Conselho. Todos n\u00F3s conhecemos ela e ouvimos sobre seu passado. ";

			tx[7] = "Guradam:\n\nVeio da guerra, teve sua casa e sua "
					+ " fam\u00EDlia destru\u00EDdas, chegou em Helaria sem nada e nunca desistiu. Sempre "
					+ " esteve disposta a enfrentar qualquer adversidade. Mas, agora a situa\u00E7\u00E3o \u00E9 "
					+ " outra, os mesmos que destru\u00EDram sua casa e sua fam\u00EDlia se aproximam.";

			op2 = "Ser sincera";

		}

		tx[1] = "Artemisia tamb\u00E9m compartilha de sua posi\u00E7\u00E3o, embora ela a tenha "
				+ " alcan\u00E7ado alguns anos antes, afinal ela iniciou na Ordem quando ainda "
				+ " era uma crian\u00E7a. ";

		tx[2] = "Durante todos esses anos ela foi uma amiga, uma irm\u00E3 e uma professora "
				+ " para voc\u00EA, ela te ajudou a superar a morte da sua fam\u00EDlia e aceitar uma "
				+ " nova, voc\u00EA fez amigos, irm\u00E3os por quem voc\u00EA daria a vida.";

		tx[3] = "Hoje foi convocada uma reuni\u00E3o de emerg\u00EAncia, sua primeira desde que "
				+ " alcan\u00E7ou o ranque de Mestre e conseguiu sua vaga no Conselho Anci\u00E3o.";

		tx[4] = "Reuni\u00F5es de emerg\u00EAncia s\u00E3o uma coisa rara, e sempre significam "
				+ " problemas, algo est\u00E1 acontecendo, os outros mestres, l\u00EDderes do Conselho "
				+ " est\u00E3o estranhos nos \u00FAltimos dias, o "
				+ " clima est\u00E1 piorando, \u00E9 como se voc\u00EA "
				+ " pudesse sentir a aproxima\u00E7\u00E3o de algo ruim.";

		tx[5] = "A reuni\u00E3o come\u00E7a, todos se sentam em seus respectivos lugares e todos "
				+ " prestam aten\u00E7\u00E3o no S\u00E1bio Mor, Guradam, um homem de 189 anos.";

		tx[8] = "Guradam:\n\nO Insuper\u00E1vel Imp\u00E9rio de Bethesda se "
				+ " aproxima e est\u00E1 preparado para a guerra. Eu gostaria que todos voc\u00EAs "
				+ " se preparassem porque n\u00F3s vamos proteger a cidade nessa guerra. ";

		tx[9] = "Guradam:\n\nE, " + player.getNome() + ", eu quero saber, se"
				+ " voc\u00EA vai deixar seu \u00F3dio tomar conta de voc\u00EA nesta guerra ou vai "
				+ " manter a calma e fazer o que te for pedido. ";

		tx[10] = "Voc\u00EA:\n\nVoc\u00EAs podem confiar em mim. Eu farei o que for preciso para proteger a "
				+ " cidade e obedecerei qualquer ordem que me for designada. N\u00E3o deixarei "
				+ " nenhuma emo\u00E7\u00E3o do passado me afetar agora.";

		tx[11] = "A reuni\u00E3o continua por mais algumas horas, s\u00E3o discutidos alguns detalhes"
				+ " de como a Ordem Arcana atuar\u00E1 durante a guerra, voc\u00EA \u00E9 informado "
				+ " que as tropas de Bethesda chegar\u00E3o em Helaria em tr\u00EAs dias e esse \u00E9 o "
				+ " tempo que voc\u00EA tem para se preparar. ";

		tx[12] = "Ap\u00F3s o t\u00E9rmino da reuni\u00E3o, Guradam te chama para acompanh\u00E1-lo ao seu "
				+ " escrit\u00F3rio. Chegando l\u00E1 voc\u00EA encontra "
				+ " Artemisia j\u00E1 esperando por voc\u00EAs";

		choice = "Artemisia:\n\nVoc\u00EA est\u00E1 bem?";

		op1 = "Mentir";

	}

	public void arcan2(int y) {

		int x = 0;
		switch (y) {

		case 1:
			x = 5;
			tx = new String[19];

			tx[0] = "Voc\u00EA:\n\nSim, estou bem, nada com que se preocupar. ";

			tx[1] = "Artemisia:\n\nTem certeza? Afinal, eles destru\u00EDram sua fam\u00EDlia...";

			tx[2] = "Voc\u00EA:\n\nE eu n\u00E3o vou me deixar abalar por isso.";

			tx[3] = "Artemisia:\n\nN\u00E3o vou deixar que eles destruam esta nova fam\u00EDlia.";

			tx[4] = "Voc\u00EA:\n\nFico feliz em ouvir isso.";

			break;

		case 2:
			x = 7;
			tx = new String[21];

			tx[0] = "Voc\u00EA:\n\nEstou vivendo um dia de cada vez.";

			tx[1] = "Artemisia:\n\nA aproxima\u00E7\u00E3o de Bethesda mexeu contigo n\u00E3o \u00E9?";

			tx[2] = "Voc\u00EA:\n\nUm pouco... ";

			if (masculino) {

				tx[3] = "Artemisia:\n\nVoc\u00EA est\u00E1 pronto para lutar contra eles? ";

			} else {

				tx[3] = "Artemisia:\n\nVoc\u00EA est\u00E1 pronta para lutar contra eles? ";

			}

			tx[4] = "Voc\u00EA:\n\nSim, n\u00E3o vou deixar que meus dem\u00F4nios me abalem. ";

			tx[5] = "Artemisia:\n\n Bem, se voc\u00EA diz, est\u00E1 tudo bem. "
					+ " Mas, eu estou aqui se precisar de mim.";

			tx[6] = "Voc\u00EA:\n\nAgrade\u00E7o.";

			break;

		}

		tx[x + 0] = "Voc\u00EA:\n\nAgora, por que voc\u00EAs me trouxeram"
				+ " aqui? Com certeza n\u00E3o foi s\u00F3 para perguntar como eu estou ";

		tx[x + 1] = "Artemisia:\n\nPara vencermos essa guerra n\u00F3s precisamos que voc\u00EA aprenda um "
				+ " feiti\u00E7o.";

		tx[x + 2] = "Voc\u00EA:\n\n Qual feiti\u00E7o?";

		tx[x + 3] = "Artemisia:\n\nMaelstrom.";

		tx[x + 4] = "Voc\u00EA:\n\nEle \u00E9 um feiti\u00E7o sagrado, reservado "
				+ " somente para os maiores arcanos ent\u00E3o por que eu deveria aprend\u00EA-lo? ";

		if (masculino) {
			tx[x + 5] = "Guradam:\n\nAcreditamos que voc\u00EA \u00E9 o \u00FAnico que "
					+ " pode. O feiti\u00E7o est\u00E1 ligado ao sangue. Somente aqueles que partilham do "
					+ " sangue de Merlin podem us\u00E1-lo. ";

			tx[x + 6] = "Voc\u00EA:\n\n E voc\u00EAs acreditam que esse sangue "
					+ " corre em meu corpo. Isso \u00E9 loucura, eu cresci no campo, n\u00E3o sou "
					+ " de uma fam\u00EDlia de renome ou algo parecido. Isso \u00E9 imposs\u00EDvel. ";

			tx[x + 7] = "Artemisia:\n\n" + player.getNome() + " Merlin viveu um "
					+ " per\u00EDodo em uma torre perto de sua vila. Segundo o que se diz ele teve "
					+ " um breve relacionamento com uma camponesa e da\u00ED pode ter vindo sua " + " fam\u00EDlia.";

			tx[x + 8] = "Artemisia:\n\nDe qualquer forma, essa \u00E9 nossa "
					+ " melhor chance. H\u00E1 muito a Ordem de Merlin nos deixou e agora voc\u00EA \u00E9 o "
					+ " \u00FAnico que talvez possa usar o feiti\u00E7o. ";

			tx[x + 9] = "Voc\u00EA:\n\nTudo bem, o que eu preciso fazer para realizar esse feiti\u00E7o?";

			tx[x + 10] = "Guradam:\n\nPara se usar esse feiti\u00E7o "
					+ " perfeitamente voc\u00EA precisa encontrar os 3 itens sagrados de Merlin. O seu "
					+ " livro de feiti\u00E7os original, que se encontra escondido em nossa biblioteca. ";

			tx[x + 11] = "Guradam:\n\n A joia do tempo, cujos rumores dizem "
					+ " que se encontra escondida sob a Catedral. ";

			tx[x + 12] = "Guradam:\n\n E o Cajado de Merlin, que está na Alameda dos Três Ponteiros em "
					+ " seus subterrâneos onde um dia foi o esconderijo de Elrond, um grande " + " amigo de Merlin. ";

			tx[x + 13] = "Guradam:\n\nPor favor recupere esses itens o mais "
					+ " r\u00E1pido poss\u00EDvel. Mesmo que n\u00E3o consiga recuperar todos, talvez "
					+ " consiga realizar o feiti\u00E7o incompleto. Ser\u00E1 melhor do que nada. ";

			tx[x + 13] = "Guradam:\n\nVoc\u00EA \u00E9 o \u00FAnico que pode realizar essa "
					+ " tarefa. Gra\u00E7as ao seu sangue, voc\u00EA provavelmente poder\u00E1 sentir a "
					+ " proximidade com tais rel\u00EDquias. ";

			tx[x + 13] = "Guradam:\n\nAl\u00E9m disso, temos de preparar as "
					+ " nossas defesas enquanto isso. E tamb\u00E9m nos prepararmos para fugir, "
					+ " caso tudo d\u00EA errado.";

			tx[x + 13] = "Voc\u00EA:\n\nEntendo... Nesse caso irei imediatamente.";

		} else {

			tx[x + 5] = "Guradan:\n\nAcreditamos que voc\u00EA \u00E9 a \u00FAnica que "
					+ " pode. O feiti\u00E7o est\u00E1 ligado ao sangue. Somente aqueles que partilham do "
					+ " sangue de Merlin podem us\u00E1-lo.";

			tx[x + 6] = "Voc\u00EA:\n\nE Guradan acredita que esse sangue corre em meu corpo. Isso \u00E9 "
					+ " loucura, eu cresci no campo, n\u00E3o sou de uma fam\u00EDlia de renome ou algo "
					+ " parecido. Isso \u00E9 imposs\u00EDvel. ";

			tx[x + 7] = "Artemisia:\n\n" + player.getNome() + " Merlin viveu um "
					+ " per\u00EDodo em uma torre perto de sua vila. Segundo o que se diz ele teve "
					+ " um breve relacionamento com uma camponesa e da\u00ED pode ter vindo sua " + " fam\u00EDlia.";

			tx[x + 8] = "Artemisia:\n\nDe qualquer forma, essa \u00E9 nossa "
					+ " melhor chance. H\u00E1 muito a Ordem de Merlin nos deixou e agora voc\u00EA \u00E9 a "
					+ " \u00FAnica que talvez possa usar o feiti\u00E7o. ";

			tx[x + 9] = "Voc\u00EA:\n\nTudo bem, o que eu preciso fazer para realizar esse feiti\u00E7o?";

			tx[x + 10] = "Guradam:\n\nPara se usar esse feiti\u00E7o "
					+ " perfeitamente voc\u00EA precisa encontrar os 3 itens sagrados de Merlin. O seu "
					+ " livro de feiti\u00E7os original, que se encontra escondido em nossa biblioteca. ";

			tx[x + 11] = "Guradam:\n\n A joia do tempo, cujos rumores dizem "
					+ " que se encontra escondida sob a Catedral. ";

			tx[x + 12] = "Guradam:\n\n E o Cajado de Merlin, que está na Alameda dos Três Ponteiros em "
					+ " seus subterrâneos onde um dia foi o esconderijo de Elrond, um grande " + " amigo de Merlin. ";

			tx[x + 13] = "Guradam:\n\nPor favor recupere esses itens o mais "
					+ " r\u00E1pido poss\u00EDvel. Mesmo que n\u00E3o consiga recuperar todos, talvez "
					+ " consiga realizar o feiti\u00E7o incompleto. Ser\u00E1 melhor do que nada. ";

			tx[x + 13] = "Guradam:\n\nVoc\u00EA \u00E9 a \u00FAnica que pode realizar essa "
					+ " tarefa. Gra\u00E7as ao seu sangue, voc\u00EA provavelmente poder\u00E1 sentir a "
					+ " proximidade com tais rel\u00EDquias. ";

			tx[x + 13] = "Guradam:\n\nAl\u00E9m disso, temos de preparar as "
					+ " nossas defesas enquanto isso. E tamb\u00E9m nos prepararmos para fugir, "
					+ " caso tudo d\u00EA errado.";

			tx[x + 13] = "Voc\u00EA:\n\nEntendo... Nesse caso irei imediatamente.";

		}

	}

	public void torre() {

		tx = new String[7];

		tx[0] = "Ao entrar na biblioteca da Torre, voc\u00EA encontra Artemisia.";

		tx[1] = "Artemisia:\n\nImagino que voc\u00EA est\u00E1 buscando o livro de Merlin,certo?";

		tx[2] = "Voc\u00EA:\n\nExato, mas onde ele est\u00E1? Eu j\u00E1 "
				+ " revirei essa biblioteca inteira e o m\u00E1ximo que vi foi men\u00E7\u00F5es a ele.";

		tx[3] = "Artemisia:\n\nSegundo as lendas, ele est\u00E1 em uma ala secreta da biblioteca, mas "
				+ " somente um descendente de Merlim pode encontr\u00E1 - lo. Posso pelo menos "
				+ " te levar at\u00E9 a ala secreta";

		tx[4] = "Voc\u00EAs v\u00E3o para uma parte escondida da biblioteca e l\u00E1 Artemisia abre uma"
				+ " passagem para o que lhe parece um labirinto.";

		tx[5] = "Artemisia:\n\nBoa sorte.";

		tx[6] = "Voc\u00EA:\n\nObrigado, vou precisar. ";

	}

	public void torre2() {

		tx = new String[1];

		tx[0] = "Voc\u00EA entra na ala secreta da biblioteca";

	}

	public void torreDerrota() {

		if (player.getHoras() == 3) {

			tx = new String[3];

			tx[1] = "J\u00E1 est\u00E1 muito tarde, todos os esfor\u00E7os "
					+ " do dia pesam sobre seu corpo e voc\u00EA n\u00E3o conseguiria fazer mais nada sem "
					+ " dormir um pouco.";

			tx[2] = "Voc\u00EA acorda e percebe que j\u00E1 \u00E9 o fim "
					+ " da manh\u00E3, voc\u00EA deve se apressar ";

		} else {

			tx = new String[1];

		}

		tx[0] = "Voc\u00EA pega o livro e um fluxo de energia percorre o seu corpo. De "
				+ " repente tudo escurece. Voc\u00EA acorda em seu quarto, aos poucos as "
				+ " mem\u00F3rias do ocorrido voltam a sua mente, e tamb\u00E9m o conhecimento de "
				+ " que voc\u00EA n\u00E3o encontrou o livro de Merlin. Voc\u00EA pode tentar novamente, "
				+ " mas h\u00E1 tempo o suficiente?";

	}

	public void torreVitoria() {

		tx = new String[8];

		if (masculino) {

			tx[5] = "Artemisia: \n\nVoc\u00EA estava demorando muito "
					+ " tempo naquele labirinto ent\u00E3o fomos procur\u00E1-lo. Te encontramos "
					+ " desmaiado e com o livro aberto, te trouxemos para o seu quarto e voc\u00EA"
					+ " est\u00E1 dormindo desde ontem.";

		} else {

			tx[5] = "Artemisia: \n\nVoc\u00EA estava demorando muito"
					+ " tempo naquele labirinto ent\u00E3o fomos procur\u00E1-la. Te encontramos "
					+ " desmaiado e com o livro aberto, te trouxemos para o seu quarto e voc\u00EA"
					+ " est\u00E1 dormindo desde ontem.";

		}

		tx[0] = "Os tr\u00EAs livros que voc\u00EA pegou brilham intensamente. e quando o brilho "
				+ " diminui, voc\u00EA nota que os tr\u00EAs livros agora s\u00E3o apenas um. O poder "
				+ " emanando do livro te d\u00E1 a certeza, esse \u00E9 o livro de Merlin. ";

		tx[1] = "Impressionado pela beleza e majestade do livro, voc\u00EA o abre no "
				+ " pedestal em que encontrou o \u00FAltimo fragmento do livro e come\u00E7a a leitura. "
				+ " \u00C9 magn\u00EDfico, tantas revela\u00E7\u00F5es tantas coisas. Tudo passando por sua "
				+ " cabe\u00E7a em um piscar de olhos. Voc\u00EA desmaia.";

		tx[2] = "Voz: \n\nBom dia dorminhoco ";

		tx[3] = "As luzes do dia batem em seu rosto, voc\u00EA percebe que j\u00E1 \u00E9 o fim da manh\u00E3.";

		tx[4] = "Voz: \n\n o que aconteceu? ";

		tx[6] = "Voc\u00EA: \n\nCaramba, eu n\u00E3o deveria ter dormido tanto tempo! ";

		tx[7] = "Artemisia: \n\nVoc\u00EA n\u00E3o conseguir\u00E1 fazer nada se "
				+ " apressando desse jeito. Respire e pense no que voc\u00EA precisa fazer.";

	}

	public void catedral() {

		tx = new String[8];

		if (masculino) {

			tx[1] = "Bispo:\n\nO que levou um herege da Torre Arcana a pisar no solo sagrado da Catedral?";

			tx[2] = "Voc\u00EA:\n\nVim em busca da joia do tempo. Dizem " + " que ela se encontra sob esta Catedral.";

			tx[3] = "Bispo:\n\nE o que leva voc\u00EA a pensar que eu deixaria um herege invadir a minha "
					+ " Catedral e roubar tesouros divinos?";

		} else {

			tx[1] = "Bispo:\n\nO que levou uma herege da Torre Arcana a pisar no solo sagrado da Catedral?";

			tx[2] = "Voc\u00EA:\n\nVim em busca da joia do tempo. Dizem " + " que ela se encontra sob esta Catedral.";

			tx[3] = "Bispo:\n\nE o que leva voc\u00EA a pensar que eu deixaria uma herege invadir a minha "
					+ " Catedral e roubar tesouros divinos?";

		}

		tx[0] = "Voc\u00EA se encaminha para a Catedral, chegando l\u00E1 voc\u00EA encontra o Bispo. \u00C9 "
				+ " vis\u00EDvel que ele n\u00E3o est\u00E1 feliz em te ver";

		tx[4] = "Voc\u00EA:\n\nA joia vai ajudar a proteger a cidade, n\u00E3o"
				+ " sei se o senhor sabe, mas Bethesda est\u00E1 se aproximando e ela vai destruir todos "
				+ " n\u00F3s. ";

		tx[5] = "Bispo:\n\nTodos voc\u00EAs no caso. Bethesda compartilha da mesma f\u00E9 que Helaria, "
				+ " eles n\u00E3o s\u00E3o uma amea\u00E7a \u00E0  Igreja. ";

		tx[6] = "Voc\u00EA:\n\nComo voc\u00EA pode ser t\u00E3o ego\u00EDsta? Pense "
				+ " em quantas pessoas podemos salvar.";

		tx[7] = "Bispo:\n\n Helarianos v\u00E3o morrer se voc\u00EAs falharem "
				+ " e Bethesdences ir\u00E3o morrer se voc\u00EAs vencerem. A Igreja n\u00E3o pode escolher "
				+ " sobre a vida de dois fi\u00E9is. Ao menos suas almas ser\u00E3o salvas.";

		choice = "Voc\u00EA tem que chegar nas catacumbas de qualquer jeito para conseguir a joia, mas "
				+ " como passar pelo bispo?";

		op1 = "Continuar insistindo";
		op2 = "Entrar escondido";

	}

	public void catedral2(int y) {

		int x = 0;
		switch (y) {

		case 1:

			x = 4;
			if (player.isAndarPelaTorreArcan()) {

				tx = new String[9];

			} else {

				tx = new String[8];

			}

			tx[0] = "Voc\u00EA continua a pressionar o Bispo, at\u00E9 que, com um ar de desgosto, ele "
					+ " concorda em guiar-lhe at\u00E9 as catacumbas.";

			tx[1] = "Ao chegar em uma grande port\u00E3o de ferro, o bispo manda voc\u00EA entrar, ap\u00F3s "
					+ " atravessar o port\u00E3o, o bispo o fecha e tranca - o.";

			if (masculino) {
				tx[2] = "Bispo: \n\nEu lhe disse que te guiaria at\u00E9 as "
						+ " catacumbas, nunca disse que voc\u00EA iria voltar vivo.";

				tx[3] = "A fala do bispo te deixa confuso e "
						+ " preocupado. Mas voc\u00EA n\u00E3o tem op\u00E7\u00E3o "
						+ " al\u00E9m de explorar as catacumbas.";

			} else {
				tx[2] = "Bispo: \n\nEu lhe disse que te guiaria at\u00E9 as "
						+ " catacumbas, nunca disse que voc\u00EA iria voltar viva.";

				tx[3] = "A fala do bispo te deixa confusa e "
						+ " preocupada. Mas voc\u00EA n\u00E3o tem op\u00E7\u00E3o "
						+ " al\u00E9m de explorar as catacumbas.";

			}

			break;

		case 2:

			x = 1;
			if (player.isAndarPelaTorreArcan()) {

				tx = new String[6];

			} else {

				tx = new String[5];

			}

			if (masculino) {
				tx[0] = "Voc\u00EA sai da Catedral, troca suas roupas para se parecer como um fiel da Igreja e "
						+ " n\u00E3o tem muitos problemas para encontrar a passagem para as catacumbas.";

			} else {

				tx[0] = "Voc\u00EA sai da Catedral, troca suas roupas para se parecer como uma fiel da Igreja e "
						+ " n\u00E3o tem muitos problemas para encontrar a passagem para as catacumbas.";

			}

			break;

		}

		tx[0 + x] = "Ap\u00F3s certo explorando tempo voc\u00EA consegue sentir a presen\u00E7a da joia por"
				+ " perto, \u00E9 como uma voz lhe convidando a segui-l\u00E1.";

		if (player.isAndarPelaTorreArcan()) {
			tx[1 + x] = "Voc\u00EA percebe que essa \u00E9 a mesma voz "
					+ " que voc\u00EA tinha ouvido 15 anos atr\u00E1s, quando entrou na torre pela primeira vez. "
					+ " S\u00F3 que dessa vez mais poderosa, mais real. Isso te d\u00E1 a certeza de que a joia "
					+ " est\u00E1 pr\u00F3xima";
			x++;
		}

		tx[1 + x] = "Enquanto voc\u00EA segue a voz, voc\u00EA repara "
				+ " que salas das catacumbas est\u00E3o ficando cada vez maiores, e percebe um som "
				+ " alto, parecendo um animal selvagem. E um forte cheiro de sangue invade o ar. Mesmo assim você se "
				+ " surpreende ao encontrar uma Hidra guardando a passagem.";

		tx[2 + x] = "Voc\u00EA se lembra de seus estudos, que Hidras s\u00E3o imunes a magia, por \"sorte\" "
				+ " as catacumbas est\u00E3o cheias guerreiros mortos segurando suas espadas. ";

		tx[3 + x] = "Voc\u00EA corre para pegar a espada de um dos cad\u00E1veres e se vira para encarar o "
				+ " monstro que est\u00E1 entre voc\u00EA e a joia do tempo. ";

	}

	public void catedral3() {

		tx = new String[1];

		tx[0] = "Voc\u00EA segue a passagem do esgoto que leva as catacumbas e rapidamente voc\u00EA"
				+ " se encontra na sala da Hidra, determinado a exterminar a criatura para"
				+ " poder obter a joia do tempo";

	}

	public void catedralDerrota(int x) {

		tx = new String[2];

		switch (x) {

		case 1:

			tx[0] = "A luta torna - se muito longa, voc\u00EA n\u00E3o conseguir\u00E1 batalhar por muito mais "
					+ " tempo.";

			break;

		case 2:

			tx[0] = "A Hidra \u00E9 forte de mais e a cada ataque "
					+ " ela cresce mais. Voc\u00EA n\u00E3o tem chances de venc\u00EA-la agora.";

			break;

		}

		tx[1] = "Sua \u00FAnica op\u00E7\u00E3o \u00E9 fugir, voc\u00EA se vira e "
				+ " come\u00E7a a correr pelas catacumbas, por sorte voc\u00EA encontra uma passagem que"
				+ " d\u00E1 nos esgotos da cidade. Depois de restaurar suas for\u00E7as voc\u00EA pode tentar"
				+ " enfrentar a besta de novo, mas ser\u00E1 que h\u00E1 tempo para isso?";

	}

	public void catedralVitoria() {

		tx = new String[6];

		if (masculino) {

			tx[0] = "Depois de destruir o cora\u00E7\u00E3o da Hidra voc\u00EA segue as catacumbas. "
					+ " Estranhamente voc\u00EA chega a um beco vazio. Decepcionado voc\u00EA volta"
					+ " para a torre, mas mal chega na porta, desmaia. ";

		} else {

			tx[0] = "Depois de destruir o cora\u00E7\u00E3o da Hidra voc\u00EA segue as catacumbas. "
					+ " Estranhamente voc\u00EA chega a um beco vazio. Decepcionada voc\u00EA volta"
					+ " para a torre, mas mal chega na porta, desmaia. ";

		}

		tx[1] = "Chega a madrugada e voc\u00EA acorda com algu\u00E9m chamando o seu nome. "
				+ " Rapidamente voc\u00EA vai em dire\u00E7\u00E3o ao chamado at\u00E9 que se depara com uma "
				+ " sala totalmente diferente de qualquer coisa que j\u00E1 tenha visto antes. ";

		tx[2] = "Cheia de tesouros, livros, tape\u00E7arias, tudo de mais valor poss\u00EDvel, essa \u00E9 a "
				+ " sala que um dia foi de Merlin e, em seu centro est\u00E1 a joia do tempo ";

		tx[3] = "\u00C9 dela que vem o chamado. Voc\u00EA vai at\u00E9 o pedestal e pega a joia. Voc\u00EA "
				+ " entende que a joia nunca esteve sob a Catedral, e que era imposs\u00EDvel "
				+ " encontr\u00E1-la sem que a joia desejasse se revelar a voc\u00EA. A Hidra n\u00E3o passou "
				+ " de um teste para determinar se voc\u00EA tinha o que \u00E9 necess\u00E1rio para usar a " + " joia";

		tx[4] = "Voc\u00EA volta para a cama porque no dia seguinte ter\u00E1 muito com o que se preocupar.";

		tx[5] = "Quando voc\u00EA finalmente acorda a manh\u00E3 j\u00E1 acabou, e voc\u00EA tem muito o"
				+ " que fazer.";

	}

	public void alameda() {

		tx = new String[3];

		tx[0] = "Quando chega nos subterrâneos, pega o caminho que te foi indicado "
				+ " por seus companheiros e com cautela, afinal os subterrâneos "
				+ " possuem muitas criaturas perigosas, segue até chegar próximo do esconderijo. ";

		tx[1] = "Um portão te impede o caminho, você já sabia dele, Artemisia havia lhe "
				+ " alertado e te dado um papel antigo que contém um enigma com a senha. ";

		tx[2] = "Você também sabe que ele tem um alarme que se disparado atrairá as "
				+ " criaturas do subterrâneo e você terá que esperar algumas horas até o "
				+ " caminho estar livre e você poder tentar de novo,ou mesmo para você voltar a superfície";

	}

	public void alameda2() {

		tx = new String[1];

		tx[0] = "Você chega até a porta que dá no esconderijo de Elrond, já preparado "
				+ " para resolver o enigma e recuperar o cajado. ";

	}

	public void alamedaVitoria() {

		tx = new String[4];

		tx[0] = "Você consegue abrir a porta e entra no esconderijo de Elrond. Você não "
				+ " precisa vasculhar muito, pois o cetro está pendurado na parede. Você se "
				+ " aproxima e pega o cetro. Nisso, um papel cai e você o pega para lê-lo. " + " Nele está escrito: ";

		tx[1] = "“O livro para liberar A pedra para dominar O cetro para lançar Ao custo de uma vida"
				+ " O amor que você deve pagar Para Maelstrom poder usar.”";

		tx[2] = "Você guarda o poema e volta para a Torre Arcana. O dia está terminando e "
				+ " você precisa descansar.";

		tx[3] = "Quando voc\u00EA finalmente acorda a "
				+ " manh\u00E3 j\u00E1 acabou, e voc\u00EA tem muito o que fazer.";

	}

	public void alamedaDerrota() {

		tx = new String[1];

		tx[0] = "O alarme é soado e você precisa correr. Horas passam até que os "
				+ " túneis estejam seguros novamente. ";
	}

	public void todosItens() {

		tx = new String[5];

		tx[0] = "Depois de pegar todos os itens você está de volta na Torre Arcana e sabe"
				+ " o que precisa fazer, matar alguém que você ama pela salvação de todos. "
				+ " Desde a morte de sua família, você só realmente amou uma pessoa, "
				+ " Artemisia, e é a vida dela que você deve tirar.";

		tx[1] = "Quando você chega, Guradan e Artemisia te chamam para conversar "
				+ " na sala dele. Eles perguntam como foi sua busca e você conta tudo que "
				+ " aconteceu e o que precisa fazer.";

		tx[2] = "Nesse momento Artemisia te olha e entende o que precisa ser feito.";

		tx[3] = "" + player.getNome() + " , por favor faça isso. Eu estou pronta. Não precisa se "
				+ " preocupar, eu vou ficar bem";

		tx[4] = "Ela começa a chorar enquanto diz isso. Ela não quer morrer, mas "
				+ " sempre esteve disposta caso fosse necessário.";

		choice = "Mas será que você está disposto a ir até às últimas consequências para proteger Helaria?";

		op1 = "Matá-la";
		op2 = "Poupá-la";

	}

	public void todosItensMatar() {

		tx = new String[6];

		tx[0] = "Para atingir sua vingança e para proteger Helaria você está disposto a "
				+ " tudo, inclusive sacrificar a pessoa que te acolheu e te deu uma nova vida.";

		tx[1] = "Você pega o cetro de Merlin e atravessa o peito de Artemisia com "
				+ " ele. Ela não tem tempo de dizer uma última palavra enquanto cai no chão.";

		tx[2] = "Com a Joia do Tempo unida ao Cajado da Morte agora você tem os "
				+ " itens necessários para utilizar o feitiço mais poderoso que já existiu. Você "
				+ " sente o poder correr em suas e cai no chão, mas não é tempo de descansar, "
				+ " é preciso preparar o enterro de Artemisia.";

		tx[3] = "Foi uma cerimônia muito triste com toda a Ordem Arcana presente, todos "
				+ " aqueles que eram mais próximos dela dizem algo, menos você, que ainda "
				+ " não conseguiu aceitar o que fez.";

		tx[4] = "O funeral mal termina e você têm que se posicionar para a batalha.";

		tx[5] = "Você e um grupo de arcanos são encaminhados para ficarem nos "
				+ " muros, destruindo qualquer soldado que se aproximar.";

	}

	public void vitoriaPerfectMatar() {

		tx = new String[7];

		tx[0] = "As primeiras tropas que aparecem são esmagadas, porém mais estão"
				+ " chegando. São muito numerosas, apenas com feitiços simples não será " + " possível contê-las. ";

		tx[1] = "Você se prepara para usar Maelstrom, se lembra de todos que dependem de"
				+ " você, se lembra de seus pais que morreram em decorrência da guerra e " + " se lembra de Artemisia.";

		tx[2] = "Você está calmo e pronto, ninguém pode pará-lo agora. Então, o feitiço é "
				+ " liberado. Todo o exército de Bethesda e Helaria é afetado, mas ninguém é "
				+ " morto, ao que parece todos simplesmente perderam os motivos para continuar a luta. ";

		tx[3] = "Ninguém vê mais sentido nesta guerra, é como se de repente todo "
				+ " mundo percebesse que a guerra não é do interesse deles e sim daquele "
				+ " que estão no topo dos dois lados. O povo não tem mais vontade de lutar "
				+ " contra si, apenas contra aqueles que os oprimem.";

		tx[4] = "Neste momento você entende o que realmente faz Maelstrom, ele realiza "
				+ " seu mais profundo desejo e, naquele momento, você não desejava nada além de paz. ";

		tx[5] = "Mas, para haver paz precisa haver antes uma última guerra, mas não "
				+ " uma guerra entre reinos, e sim do povo contra seus opressores. Neste "
				+ " dia algo novo surgiu no mundo e você percebe isso e quer fazer parte.";

		tx[6] = "Você decide deixar a Ordem Arcana e se juntar ao povo, para que juntos "
				+ " vocês consigam criar um caminho melhor. Artemisia, sua mãe, seu pai, "
				+ " sua irmã, você nunca os esquecera e eles estarão para sempre do seu lado "
				+ " nestes novos tempos.";

	}

	public void derrotaPerfectBIMatar() {

		tx = new String[6];

		tx[0] = "Mesmo com seus esforços conjuntos, as tropas de Bethesda estão entrando "
				+ " em Helaria. Não há tempo, só tem um jeito de vencer, liberar imediatamente "
				+ " Maelstrom. O feitiço é liberado, as tropas de Bethesda são destruídas, a "
				+ " guerra está terminada.";

		tx[1] = "Algo está te puxando, das profundezas da sua própria mente, "
				+ " uma força terrível e maligna, uma força cheia de ódio e de dor, "
				+ " Maelstrom. Ou seria você mesmo?.";

		tx[2] = "Maelstrom potencializa tudo aquilo que está dentro de você, era isso o "
				+ " que dizia o livro, você agora entende.";

		tx[3] = "Quando você utilizou o feitiço, estava com ódio de Bethesda, ódio de você, "
				+ " ódio do mundo inteiro, e agora todo esse ódio e essa dor querem te consumir.";

		tx[4] = "Mas, de repente você vê uma luz, todos aqueles que você amou e "
				+ " perdeu estão te chamando e você atende ao chamado.";

		tx[5] = "As trevas não conseguem te consumir, mas para isso você se "
				+ " entrega à luz, seu papel foi cumprido, a guerra terminou e Helaria venceu, "
				+ " esse mundo não precisa mais de você e nem você dele, tem outros que você "
				+ " precisa encontrar. Sua mãe, seu pai, sua irmã e Artemisia, eles querem sua "
				+ " companhia mais uma vez.";

	}

	public void derrotaPerfectMatar() {

		tx = new String[6];

		tx[0] = "Mesmo com seus esforços conjuntos, as tropas de Bethesda estão entrando "
				+ " em Helaria. Não há tempo, só tem um jeito de vencer, liberar imediatamente "
				+ " Maelstrom. O feitiço é liberado, as tropas de Bethesda são destruídas, a "
				+ " guerra está terminada.";

		tx[1] = "Algo está te puxando, das profundezas da sua própria mente, "
				+ " uma força terrível e maligna, uma força cheia de ódio e de dor, "
				+ " Maelstrom. Ou seria você mesmo?.";

		tx[2] = "Maelstrom potencializa tudo aquilo que está dentro de você, era isso o "
				+ " que dizia o livro, você agora entende.";

		tx[3] = "Quando você utilizou o feitiço, estava com ódio de Bethesda, ódio de você, "
				+ " ódio do mundo inteiro, e agora todo esse ódio e essa dor querem te consumir.";

		tx[4] = "E ele consegue. Você sucumbe às trevas, renasce como um novo ser de "
				+ " puro ódio, dor, corrupção. Helaria venceu a guerra, mas agora precisa "
				+ " de um novo comandante, adequado aos novos rumos que ela deve tomar. ";

		tx[5] = "Não basta destruir o exército de Bethesda enquanto seu povo ainda "
				+ " existe. Esse é o caminho que você irá tomar e ninguém poderá te parar. ";

	}

	public void todosItensPoup() {

		tx = new String[3];

		tx[0] = "Você se recusa a matar Artemisia. De certa forma os dois ficam aliviados, "
				+ " mas ao mesmo tempo decepcionados contigo, as esperanças de vitória diminuíram muito.";

		tx[1] = "Como você não será capaz de usar Maelstrom, os planos para a guerra "
				+ " mudam e vocês tem que se preparar.";

		tx[2] = "No dia seguinte a Ordem Arcana é encarregada de proteger os muros da "
				+ " cidade e impedir a aproximação das tropas inimigas.";

	}

	public void vitoriaPerfectPoup() {

		tx = new String[4];

		tx[0] = "Vocês conseguem impedir a aproximação de uma quantidade "
				+ " significativa de tropas inimigas, mas algumas ainda conseguem invadir a "
				+ " cidade. Dentro dos muros se dá uma violenta batalha. Milhares de mortos "
				+ " dos dois lados, inclusive de grande parte da Ordem Arcana, contando com Guradan.";

		tx[1] = "No final Helaria sai vencedora e a Ordem Arcana destruída. Você e "
				+ " Ordem Arcana destruída. Você e Artemisa agora tem a missão de"
				+ " reestruturar a Ordem e ajudar na reconstrução da cidade.";

		tx[2] = "Helaria passou por uma fase extremamente difícil, mas agora pode "
				+ " significar o começo de um novo tempo e vocês tem um papel importante nisso.";

		tx[3] = "O preço de não usar Maelstrom foi caro, mas, você pensa, o de usá-lo "
				+ " poderia ter sido ainda mais caro. É um pensamento egoísta, mas você não "
				+ " se importa, não conseguiria imaginar sua vida sem Artemisia e pretende "
				+ " ficar com ela até seus últimos dias. No final, você está feliz.";

	}

	public void derrotaPerfectPoup() {

		tx = new String[3];

		tx[0] = "As tropas inimigas são muitas, vocês não conseguem contê-las. Helaria é "
				+ " invadida e não demorará muito a cair. ";

		tx[1] = "Você e Artemisia tomam frente na batalha, mas não é suficiente, vocês "
				+ " são esmagados. Helaria cai.";

		tx[2] = "Seus últimos combatentes perecem lutando. Você e Artemisia morrem "
				+ " lado a lado em paz na certeza de terem dado o seu melhor.E assim "
				+ "termina a história de Helaria.";

	}

	public void itens2BI() {

		tx = new String[5];

		tx[0] = "Termina o terceiro dia e você está de volta na Torre Arcana. Guradan e "
				+ " Artemisia te chamam para conversar querendo saber tudo que aconteceu."
				+ " Cada parte você conta, mas no final você falhou, não conseguiu juntar "
				+ " todos os itens, portanto Maelstrom não poderá ser lançado.";

		tx[1] = "Ou pelo menos é isso que você pensa, até Gurandan dizer.";

		tx[2] = "Gurandan \n\n Ainda existe um jeito, é possível usar Maelstrom com apenas dois dos itens"
				+ " e o sangue de um de seus descendentes, mas o preço é muito "
				+ " alto, é necessário o sacrifício de uma grande quantidade de magia. ";

		tx[3] = "Você:\n\nQuanta magia e em que forma?";

		tx[4] = "Guradan:\n\nNa forma de vidas humanas e, possivelmente, em uma quantidade "
				+ " que todos nesta Torre terão que dar suas vidas para que você possa "
				+ " lançar, mas também custará sua vida. ";

		choice = "Guradan \n\nVocê está disposto a tentar? A se sacrificar e sacrificar todos que você "
				+ " ama e admira?";

		op1 = "Sim";
		op2 = "Não";

	}

	public void itens2BISIM() {

		tx = new String[7];

		tx[0] = "Artemisia: \n\nEntão nós o faremos. Agora vá descansar, você precisa estar bem"
				+ " para poder lançar o feitiço.";

		tx[1] = "Você vai para seus aposentos e dorme um pouco. Logo Artemisia te "
				+ " acorda para iniciar os preparativos para o feitiço.";

		tx[2] = "Os preparativos logo estão prontos, vocês só estão esperando os alarmes "
				+ "da cidade soarem para poderem lançar o feitiço. ";

		tx[3] = "Os alarmes soam. Helaria está sendo invadida, agora é o momento.";

		tx[4] = "Todos na Torre se suicidam simultaneamente e com todo esse "
				+ " poder e sua própria alma, você libera Maelstrom. ";

		tx[5] = "No mesmo instante todas as tropas de Bethesda caem e Helaria é salva. ";

		tx[6] = "O rei procura pelos responsáveis por essa vitória e descobre do destino da "
				+ " Ordem Arcana. Ele decide reestruturar a Ordem, convida "
				+ " arcanistas de diversas regiões do mundo para serem membros da Nova "
				+ " Ordem Arcana. Helaria nunca esquecerá de seu sacrifício para salvá-la. ";

	}

	public void itens2BINao() {

		tx = new String[2];

		tx[0] = "Guradan: \n\n Entendo, realmente é uma escolha difícil para se fazer, então é melhor "
				+ " nos prepararmos para a luta. ";

		tx[1] = "A Ordem Arcana é encarregada de proteger os muros da cidade e é para lá que você vai.";

	}

	public void itens2BIDerrota() {

		tx = new String[4];

		tx[0] = "As tropas inimigas são muitas, vocês não conseguem contê-las. Helaria é "
				+ " invadida e não demorará muito a cair.";

		tx[1] = "Você e Artemisia tomam frente na batalha, mas não é suficiente, vocês "
				+ " são esmagados. Helaria cai.";

		tx[2] = "Antes de morrer, você Artemisia lutando perto e ela te dá um último "
				+ " olhar, um olhar de desprezo, tudo está acontecendo por sua culpa, logo em "
				+ " seguida ela é morta, você não dura muito tempo depois, mas é tempo "
				+ " suficiente para pensar no que teria acontecido se você tivesse feito o que " + " deveria fazer.";

		tx[3] = "Assim termina a história de Helaria, com o lamento de alguém que poderia " + " ter feito diferente.";

	}

	public void itensMin() {

		tx = new String[3];

		tx[0] = "Termina o terceiro dia e você está de volta na Torre Arcana. Guradan e "
				+ " Artemisia te chamam para conversar querendo saber tudo que aconteceu."
				+ " Cada parte você conta, mas no final você falhou, não conseguiu juntar "
				+ " todos os itens, portanto Maelstrom não poderá ser lançado.";

		tx[1] = "Agora só resta a Ordem Arcana se preparar para enfrentar em combate "
				+ " as tropas de Bethesda. Vocês são encarregados de defender os muros da cidade.";

		tx[2] = "Está na hora de se preparar, você vai para o posto que deve ocupar e se dá início a guerra.";

	}

	public void vitoriaMin() {

		tx = new String[3];

		tx[0] = "Vocês conseguem impedir a aproximação de uma quantidade "
				+ " significativa de tropas inimigas, mas algumas ainda conseguem invadir a "
				+ " cidade. Dentro dos muros se dá uma violenta batalha. Milhares de mortos "
				+ " dos dois lados, inclusive de grande parte da Ordem Arcana, contando com Guradan.";

		tx[1] = "No final Helaria sai vencedora e a Ordem Arcana destruída. Você e "
				+ " Artemisa agora tem a missão de reestruturar a Ordem e ajudar na reconstrução da cidade.";

		tx[2] = "Helaria passou por uma fase extremamente difícil, mas agora pode "
				+ " significar o começo de um novo tempo e vocês tem um papel importante nisso.";

	}

	public void derrotaMin() {

		tx = new String[3];

		tx[0] = "As tropas inimigas são muitas, vocês não conseguem contê-las. Helaria é "
				+ " invadida e não demorará muito a cair.";

		tx[1] = "Você e Artemisia tomam frente na batalha, mas não é suficiente, vocês"
				+ " são esmagados. Helaria cai.";

		tx[2] = "Seus últimos combatentes perecem lutando. Você e Artemisia morrem"
				+ " lado a lado em paz na certeza de terem dado o seu melhor. E assim "
				+ " termina a história de Helaria.";

	}

}
