package bibliotecas;

public class Biblio_Arcan extends Biblioteca {

	/*
	 * 
	 * Lista de acentos (evita que bugue ao mandar pro GitKraken)
	 * 
	 * \u00E7 \u00E7
	 * 
	 * \u00E0 \u00E0 Â  \u00E1 \u00E1 \u00E2 \u00E0¢ \u00E3 \u00E0\u00E9£ \u00C1 \u00E0�
	 * 
	 * \u00EA \u00EA \u00E9  \u00C9 \u00C9
	 * 
	 * \u00ED \u00ED
	 * 
	 * \u00FA \u00FA
	 * 
	 * \u00F3 \u00F3 \u00F4 \u00E0´ \u00F5 \u00F5
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

		tx[12] = "<html>Ap\u00F3s  o t\u00E9rmino da reuni\u00E3o, Guradam  " + "<br/>te chama para acompanh\u00E1-lo ao seu "
				+ "<br/>escrit\u00F3rio. Chegando l\u00E1 voc\u00EA encontra " + "<br/>Artemisia j\u00E1 esperando por voc\u00EAs" + "<html>";
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

		tx[x + 0] = "<html>Voc\u00EA:" + "<br/><br/>Agora, por que voc\u00EAs me trouxeram"
				+ "<br/>aqui? Com certeza n\u00E3o foi s\u00F3 para " + "<br/>perguntar como eu estou " + "<html>";
		linhas[x + 0] = 4;

		tx[x + 1] = "<html>Artemisia:" + "<br/><br/>Para vencermos essa guerra n\u00F3s "
				+ "<br/>precisamos que voc\u00EA aprenda um " + "<br/>feiti\u00E7o." + "<html>";
		linhas[x + 1] = 4;

		tx[x + 2] = "<html>Voc\u00EA:" + "<br/><br/> Qual feiti\u00E7o?" + "<html>";
		linhas[x + 2] = 2;

		tx[x + 3] = "<html>Artemisia:" + "<br/><br/>Maelstrom." + "<html>";
		linhas[x + 3] = 2;

		tx[x + 4] = "<html>Voc\u00EA:" + "<br/><br/>Ele \u00E9 um feiti\u00E7o sagrado, reservado "
				+ "<br/>somente para os maiores arcanos" + "<br/>ent\u00E3o por que eu deveria aprend\u00EA-lo? " + "<html>";
		linhas[x + 4] = 4;

		if (player.getSexo() == 0) {
			tx[x + 5] = "<html>Guradam:" + "<br/><br/>Acreditamos que voc\u00EA \u00E9 o \u00FAnico que  "
					+ "<br/>pode. O feiti\u00E7o est\u00E1 ligado ao sangue. " + "<br/>Somente aqueles que partilham do "
					+ "<br/>sangue de Merlin podem us\u00E1-lo. " + "<html>";
			linhas[x + 5] = 5;

			tx[x + 6] = "<html>Voc\u00EA:" + "<br/><br/> E voc\u00EAs acreditam que esse sangue "
					+ "<br/>corre em meu corpo. Isso \u00E9 " + "<br/>loucura, eu cresci no campo, n\u00E3o sou  "
					+ "<br/>de uma fam\u00EDlia de renome ou algo  " + "<br/>parecido. Isso \u00E9 imposs\u00EDvel. " + "<html>";
			linhas[x + 6] = 6;

			tx[x + 7] = "<html>Artemisia:" + "<br/><br/>" + player.getNome() + " Merlin viveu um  "
					+ "<br/>per\u00EDodo em uma torre perto de sua " + "<br/>vila. Segundo o que se diz ele teve "
					+ "<br/>um breve relacionamento com uma " + "<br/>camponesa e da\u00ED pode ter vindo sua "
					+ "<br/>fam\u00EDlia." + "<html>";
			linhas[x + 7] = 7;

			tx[x + 8] = "<html>Artemisia:" + "<br/><br/>De qualquer forma, essa \u00E9 nossa  "
					+ "<br/>melhor chance. H\u00E1 muito a Ordem de " + "<br/>Merlin nos deixou e agora voc\u00EA \u00E9 o  "
					+ "<br/>\u00FAnico que talvez possa usar o feiti\u00E7o. " + "<html>";
			linhas[x + 8] = 5;

			tx[x + 9] = "<html>Voc\u00EA:" + "<br/><br/>Tudo bem, o que eu preciso fazer  "
					+ "<br/>para realizar esse feiti\u00E7o?" + "<html>";
			linhas[x + 9] = 3;

			tx[x + 10] = "<html>Guradam:" + "<br/><br/>Para se usar esse feiti\u00E7o   "
					+ "<br/>perfeitamente voc\u00EA precisa encontrar   " + "<br/>os 3 itens sagrados de Merlin. O seu "
					+ "<br/>livro de feiti\u00E7os original, que se encontra " + "<br/>escondido em nossa biblioteca."
					+ "<br/>" + "<html>";
			linhas[x + 10] = 6;

			tx[x + 11] = "<html>Guradam:" + "<br/><br/> A j\u00F3ia do tempo, cujos rumores dizem "
					+ "<br/>que se encontra escondida sob a " + "<br/>Catedral. " + "<html>";
			linhas[x + 11] = 4;

			tx[x + 12] = "<html>Guradam:" + "<br/><br/> E o Cajado de Merlin, que"
					+ "<br/>infelizmente foi roubado de n\u00F3s " + "<br/>recentemente. Imagino que ainda se"
					+ "<br/>encontre nos armaz\u00E9ns da alameda " + "<br/>dos 3 ponteiros " + "<html>";
			linhas[x + 12] = 6;

			tx[x + 13] = "<html>Guradam:" + "<br/><br/>Por favor recupere esses itens o mais "
					+ "<br/>r\u00E1pido poss\u00EDvel. Mesmo que n\u00E3o  " + "<br/>consiga recuperar todos, talvez  "
					+ "<br/>consiga realizar o feiti\u00E7o " + "<br/>incompleto. Ser\u00E1 melhor do que nada." + "<br/>"
					+ "<html>";
			linhas[x + 13] = 6;

			tx[x + 13] = "<html>Guradam:" + "<br/><br/>Voc\u00EA \u00E9 o \u00FAnico que pode realizar essa "
					+ "<br/>tarefa. Gra\u00E7as ao seu sangue, voc\u00EA" + "<br/>provavelmente poder\u00E1 sentir a  "
					+ "<br/>proximidade com tais rel\u00EDquias. " + "<html>";
			linhas[x + 13] = 5;

			tx[x + 13] = "<html>Guradam:" + "<br/><br/>Al\u00E9m disso, temos de preparar as  "
					+ "<br/>nossas defesas enquanto isso. E " + "<br/>tamb\u00E9m nos prepararmos para fugir,   "
					+ "<br/>caso tudo d\u00EA errado." + "<html>";
			linhas[x + 13] = 5;

			tx[x + 13] = "<html>Voc\u00EA:" + "<br/><br/>Entendo... Nesse caso irei " + "<br/>imediatamente." + "<html>";
			linhas[x + 13] = 3;

		} else {
			tx[x + 5] = "<html>Guradan:" + "<br/><br/>Acreditamos que voc\u00EA \u00E9 a \u00FAnica que "
					+ "<br/>pode. O feiti\u00E7o est\u00E1 ligado ao sangue. " + "<br/> Somente aqueles  que partilham do  "
					+ "<br/>sangue de Merlin podem us\u00E1-lo." + "<html>";
			linhas[x + 5] = 5;

			tx[x + 6] = "<html>Voc\u00EA:" + "<br/><br/>E Guradan acredita que esse  "
					+ "<br/>sangue corre em meu corpo. Isso \u00E9 " + "<br/>loucura, eu cresci no campo, n\u00E3o sou  "
					+ "<br/>de uma fam\u00EDlia de renome ou algo  " + "<br/>parecido. Isso \u00E9 imposs\u00EDvel. " + "<html>";
			linhas[x + 6] = 6;

			tx[x + 7] = "<html>Artemisia:" + "<br/><br/>" + player.getNome() + " Merlin viveu um  "
					+ "<br/>per\u00EDodo em uma torre perto de sua " + "<br/>vila. Segundo o que se diz ele teve "
					+ "<br/>um breve relacionamento com uma " + "<br/>camponesa e da\u00ED pode ter vindo sua "
					+ "<br/>fam\u00EDlia." + "<html>";
			linhas[x + 7] = 7;

			tx[x + 8] = "<html>Artemisia:" + "<br/><br/>De qualquer forma, essa \u00E9 nossa  "
					+ "<br/>melhor chance. H\u00E1 muito a Ordem de " + "<br/>Merlin nos deixou e agora voc\u00EA \u00E9 a "
					+ "<br/>\u00FAnica que talvez possa usar o feiti\u00E7o. " + "<html>";
			linhas[x + 8] = 5;

			tx[x + 9] = "<html>Voc\u00EA:" + "<br/><br/>Tudo bem, o que eu preciso fazer  "
					+ "<br/>para realizar esse feiti\u00E7o?" + "<html>";
			linhas[x + 9] = 3;

			tx[x + 10] = "<html>Guradam:" + "<br/><br/>Para se usar esse feiti\u00E7o   "
					+ "<br/>perfeitamente voc\u00EA precisa encontrar   " + "<br/>os 3 itens sagrados de Merlin. O seu "
					+ "<br/>livro de feiti\u00E7os original, que se encontra " + "<br/>escondido em nossa biblioteca."
					+ "<br/>" + "<html>";
			linhas[x + 10] = 6;

			tx[x + 11] = "<html>Guradam:" + "<br/><br/> A j\u00F3ia do tempo, cujos rumores dizem "
					+ "<br/>que se encontra escondida sob a " + "<br/>Catedral. " + "<html>";
			linhas[x + 11] = 4;

			tx[x + 12] = "<html>Guradam:" + "<br/><br/> E o Cajado de Merlin, que"
					+ "<br/>infelizmente foi roubado de n\u00F3s " + "<br/>recentemente. Imagino que ainda se"
					+ "<br/>encontre nos armaz\u00E9ns da alameda " + "<br/>dos 3 ponteiros " + "<html>";
			linhas[x + 12] = 6;

			tx[x + 13] = "<html>Guradam:" + "<br/><br/>Por favor recupere esses itens o mais "
					+ "<br/>r\u00E1pido poss\u00EDvel. Mesmo que n\u00E3o  " + "<br/>consiga recuperar todos, talvez  "
					+ "<br/>consiga realizar o feiti\u00E7o " + "<br/>incompleto. Ser\u00E1 melhor do que nada." + "<br/>"
					+ "<html>";
			linhas[x + 13] = 6;

			tx[x + 13] = "<html>Guradam:" + "<br/><br/>Voc\u00EA \u00E9 a \u00FAnica que pode realizar essa "
					+ "<br/>tarefa. Gra\u00E7as ao seu sangue, voc\u00EA" + "<br/>provavelmente poder\u00E1 sentir a  "
					+ "<br/>proximidade com tais rel\u00EDquias. " + "<html>";
			linhas[x + 13] = 5;

			tx[x + 13] = "<html>Guradam:" + "<br/><br/>Al\u00E9m disso, temos de preparar as  "
					+ "<br/>nossas defesas enquanto isso. E " + "<br/>tamb\u00E9m nos prepararmos para fugir,   "
					+ "<br/>caso tudo d\u00EA errado." + "<html>";
			linhas[x + 13] = 5;

			tx[x + 13] = "<html>Voc\u00EA:" + "<br/><br/>Entendo... Nesse caso irei " + "<br/>imediatamente." + "<html>";
			linhas[x + 13] = 3;
		}

	}

	public void torre() {

		tx = new String[7];
		linhas = new int[7];

		tx[0] = "<html>Ao entrar na biblioteca da Torre, voc\u00EA " + "<br/>encontra Artemisia." + "<html>";
		linhas[0] = 1;

		tx[1] = "<html>Artemisia:" + "<br/><br/>Imagino que voc\u00EA est\u00E1 buscando o " + "<br/>livro de Merlin,certo?"
				+ "<html>";
		linhas[1] = 3;

		tx[2] = "<html>Voc\u00EA:" + "<br/><br/>Exato, mas onde ele est\u00E1? Eu j\u00E1  "
				+ "<br/>revirei essa biblioteca inteira e o " + "<br/>m\u00E1ximo que vi foram men\u00E7\u00F5es a ele." + "<html>";
		linhas[2] = 4;

		tx[3] = "<html>Artemisia:" + "<br/><br/>Segundo as lendas, ele est\u00E1 em uma  "
				+ "<br/>ala secreta da biblioteca, mas  " + "<br/>somente um descendente de Merlim "
				+ "<br/>pode encontr\u00E1 - lo. Posso pelo menos " + "<br/>te levar at\u00E9 a ala secreta" + "<html>";
		linhas[3] = 6;

		tx[4] = "<html>Voc\u00EAs v\u00E3o para uma parte escondida" + "<br/>da biblioteca e l\u00E1 Artemisia abre uma"
				+ "<br/>passagem para o que lhe parece um  " + "<br/>labirinto." + "<html>";
		linhas[4] = 3;

		tx[5] = "<html>Artemisia:" + "<br/><br/>Boa sorte." + "<html>";
		linhas[5] = 2;

		tx[6] = "<html>Voc\u00EA:" + "<br/><br/>Obrigado, vou precisar. " + "<html>";
		linhas[6] = 2;

	}

	public void torre2() {

		tx = new String[1];
		linhas = new int[1];

		tx[0] = "<html>Voc\u00EA entra na ala secreta da  " + "<br/>biblioteca" + "<html>";
		linhas[0] = 1;
	}

	public void torreDerrota() {

		if (player.getHoras() == 3) {

			tx = new String[3];
			linhas = new int[3];

			tx[1] = "<html>J\u00E1 est\u00E1 muito tarde, todos os esfor\u00E7os " + "<br/>do dia pesam sobre seu corpo e voc\u00EA "
					+ "<br/>n\u00E3o conseguiria fazer mais nada sem " + "<br/>dormir um pouco." + "<html>";
			linhas[1] = 3;

			tx[2] = "<html>Voc\u00EA acorda e percebe que j\u00E1 \u00E9 o fim " + "<br/>da manh\u00E3, voc\u00EA deve se apressar " + "<html>";
			linhas[2] = 1;
		} else {

			tx = new String[1];
			linhas = new int[1];
		}

		tx[0] = "<html>Voc\u00EA pega o livro e um fluxo de " + "<br/>energia percorre o seu corpo. De "
				+ "<br/>repente tudo escureceâ€¦ Voc\u00EA acorda " + "<br/>em seu quarto, aos poucos as "
				+ "<br/>mem\u00F3rias do ocorrido voltam a sua " + "<br/>mente, e tamb\u00E9m o conhecimento de "
				+ "<br/>que voc\u00EA n\u00E3o encontrou o livro de " + "<br/>Merlin. Voc\u00EA pode tentar novamente, "
				+ "<br/>mas h\u00E1 tempo o suficiente?" + "<html>";
		linhas[0] = 8;
	}

	public void torreVitoria() {
		tx = new String[8];
		linhas = new int[8];
		tx[0] = "<html>Os tr\u00EAs livros que voc\u00EA pegou brilham " + "<br/>intensamente. e quando o brilho "
				+ "<br/>diminui, voc\u00EA nota que os tr\u00EAs livros  " + "<br/>agora s\u00E3o apenas um. O poder "
				+ "<br/>emanando do livro te d\u00E1 a certeza, " + "<br/>esse \u00E9 o livro de Merlin. " + "<html>";
		linhas[0] = 5;

		tx[1] = "<html>Impressionado pela beleza e  " + "<br/>majestade do livro, voc\u00EA o abre no "
				+ "<br/>pedestal em que encontrou o \u00FAltimo " + "<br/>fragmento do livro e come\u00E7a a leitura. "
				+ "<br/>\u00C9 magn\u00EDfico, tantas revela\u00E7\u00F5es tantas" + "<br/>coisas. Tudo passando por sua "
				+ "<br/>cabe\u00E7a em um piscar de olhos. Voc\u00EA " + "<br/>desmaia." + "<html>";
		linhas[1] = 7;

		tx[2] = "<html>Voz: " + "<br/><br/>Bom dia dorminhoco " + "<html>";
		linhas[2] = 2;

		tx[3] = "<html>As luzes do dia batem em seu rosto, " + "<br/>voc\u00EA percebe que j\u00E1 \u00E9 o fim da manh\u00E3." + "<html>";
		linhas[3] = 1;

		tx[4] = "<html>Voz: " + "<br/><br/> o que aconteceu? " + "<html>";
		linhas[4] = 2;
		if (player.getSexo() == 0) {
			tx[5] = "<html>Artemisia: " + "<br/><br/>Voc\u00EA estava demorando muito "
					+ " <br/>tempo naquele labirinto ent\u00E3o fomos " + " <br/>procur\u00E1-lo. Te encontramos "
					+ " <br/>desmaiado e com o livro aberto, te " + " <br/>trouxemos para o seu quarto e voc\u00EA"
					+ " <br/>est\u00E1 dormindo desde ontem." + "<html>";
			linhas[5] = 7;
		} else {
			tx[5] = "<html>Artemisia: " + "<br/><br/>Voc\u00EA estava demorando muito "
					+ " <br/>tempo naquele labirinto ent\u00E3o fomos " + " <br/>procur\u00E1-la. Te encontramos "
					+ " <br/>desmaiado e com o livro aberto, te " + " <br/>trouxemos para o seu quarto e voc\u00EA"
					+ " <br/>est\u00E1 dormindo desde ontem." + "<html>";
		}
		tx[6] = "<html>Voc\u00EA: " + "<br/><br/>Caramba, eu n\u00E3o deveria ter dormido " + " <br/>tanto tempo! " + "<html>";
		linhas[6] = 3;

		tx[7] = "<html>Artemisia: " + "<br/><br/>Voc\u00EA n\u00E3o conseguir\u00E1 fazer nada se "
				+ " <br/>apressando desse jeito. Respire e " + " <br/>pense no que voc\u00EA precisa fazer." + "<html>";
		linhas[7] = 4;
	}

	public void catedral() {

		tx = new String[8];
		linhas = new int[8];

		tx[0] = "<html>Voc\u00EA se encaminha para a Catedral, " + "<br/>chegando l\u00E1 voc\u00EA encontra o Bispo. \u00C9 "
				+ "<br/>vis\u00EDvel que ele n\u00E3o est\u00E1 feliz em te verâ€¦" + "<html>";
		linhas[0] = 2;
		if (player.getSexo() == 0) {
			tx[1] = "<html>Bispo:" + "<br/><br/>O que levou um herege da Torre Arcana"
					+ "<br/>a pisar no solo sagrado da Catedral?" + "<html>";
			linhas[1] = 3;

			tx[2] = "<html>Voc\u00EA:" + "<br/><br/>Vim em busca da joia do tempo. Dizem "
					+ "<br/>que ela se encontra sob esta Catedral." + "<html>";
			linhas[2] = 3;

			tx[3] = "<html>Bispo:" + "<br/><br/>E o que leva voc\u00EA a pensar que eu  "
					+ "<br/>deixaria um herege invadir a minha " + "<br/>Catedral e roubar tesouros divinos?"
					+ "<html>";
			linhas[3] = 4;
		} else {
			tx[1] = "<html>Bispo:" + "<br/><br/>O que levou uma herege da Torre Arcana a "
					+ "<br/>a pisar no solo sagrado da Catedral?" + "<html>";
			linhas[1] = 3;

			tx[2] = "<html>Voc\u00EA:" + "<br/><br/>Vim em busca da joia do tempo. Dizem "
					+ "<br/>que ela se encontra sob esta Catedral." + "<html>";
			linhas[2] = 3;

			tx[3] = "<html>Bispo:" + "<br/><br/>E o que leva voc\u00EA a pensar que eu  "
					+ "<br/>deixaria uma herege invadir a minha " + "<br/>Catedral e roubar tesouros divinos?"
					+ "<html>";
			linhas[3] = 4;
		}
		tx[4] = "<html>Voc\u00EA:" + "<br/><br/>A joia vai ajudar a proteger a cidade, n\u00E3o"
				+ "<br/>sei se o senhor sabe, mas Bethesda est\u00E1 " + "<br/>se aproximando e ela vai destruir todos "
				+ "<br/>n\u00F3s. " + "<html>";
		linhas[4] = 5;

		tx[5] = "<html>Bispo:" + "<br/><br/Todos voc\u00EAs no caso. Bethesda  "
				+ "<br/>compartilha da mesma f\u00E9 que Helaria, " + "<br/>eles n\u00E3o s\u00E3o uma amea\u00E7a \u00E0  Igreja.  " + "<html>";
		linhas[5] = 4;

		tx[6] = "<html>Voc\u00EA:" + "<br/><br/>Como voc\u00EA pode ser t\u00E3o ego\u00EDsta? Pense "
				+ "<br/>em quantas pessoas podemos salvar." + "<html>";
		linhas[6] = 3;

		tx[7] = "<html>Bispo:" + "<br/><br/> Helarianos v\u00E3o morrer se voc\u00EAs falharem "
				+ "<br/>e Bethesdences ir\u00E3o morrer se voc\u00EAs " + "<br/>vencerem. A Igreja n\u00E3o pode escolher "
				+ "<br/>sobre a vida de dois fi\u00E9is. Ao menos suas " + "<br/>almas ser\u00E3o salvas." + "<html>";
		linhas[7] = 6;

		choice = "<html>Voc\u00EA tem que chegar nas catacumbas de " + "<br/>qualquer jeito para conseguir a j\u00F3ia, mas "
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

			tx[0] = "<html>Voc\u00EA continua a pressionar o Bispo, at\u00E9 " + "<br/>que, com um ar de desgosto, ele "
					+ "<br/>concorda em guiar-lhe at\u00E9 as" + "<br/>catacumbas." + "<html>";
			linhas[0] = 3;

			tx[1] = "<html>Ao chegar em uma grande port\u00E3o de" + "<br/>ferro, o bispo manda voc\u00EA entrar, ap\u00F3s  "
					+ "<br/>atravessar o port\u00E3o, o bispo o fecha e" + "<br/>tranca - o." + "<html>";
			linhas[1] = 3;

			if (player.getSexo() == 0) {
				tx[2] = "<html>Bispo: " + "<br/><br/>Eu lhe disse que te guiaria at\u00E9 as  "
						+ "<br/>catacumbas, nunca disse que voc\u00EA iria" + "<br/>voltar vivo." + "<html>";
				linhas[2] = 4;

				tx[3] = "<html>A fala do bispo te deixa confuso e " + "<br/>preocupado. Mas voc\u00EA n\u00E3o tem op\u00E7\u00E3o "
						+ "<br/>al\u00E9m de explorar as catacumbas." + "<html>";
				linhas[3] = 2;

			} else {
				tx[2] = "<html>Bispo: " + "<br/><br/>Eu lhe disse que te guiaria at\u00E9 as  "
						+ "<br/>catacumbas, nunca disse que voc\u00EA iria" + "<br/>voltar viva." + "<html>";
				linhas[2] = 4;

				tx[3] = "<html>A fala do bispo te deixa confuso e " + "<br/>preocupada. Mas voc\u00EA n\u00E3o tem op\u00E7\u00E3o "
						+ "<br/>al\u00E9m de explorar as catacumbas." + "<html>";
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
				tx[0] = "<html>Voc\u00EA sai da Catedral, troca suas roupas "
						+ "<br/>para se parecer como um fiel da Igreja e " + "<br/>n\u00E3o tem muitos problemas para "
						+ "<br/>encontrar  a passagem para as catacumbas." + "<html>";
				linhas[0] = 3;
			} else {
				tx[0] = "<html>Voc\u00EA sai da Catedral, troca suas roupas "
						+ "<br/>para se parecer como uma fiel da Igreja e "
						+ "<br/>n\u00E3o tem muitos problemas para encontrar " + "<br/>a passagem para as catacumbas."
						+ "<html>";
				linhas[0] = 3;
			}
			x = 1;
			break;
		}
		tx[0 + x] = "<html>Ap\u00F3s certo explorando tempo voc\u00EA " + "<br/>consegue sentir a presen\u00E7a da j\u00F3ia por"
				+ "<br/>perto, \u00E9 como uma voz lhe convidando a  " + "<br/>segui-l\u00E1." + "<html>";
		linhas[0 + x] = 3;
		if (player.isAndarPelaTorreArcan()) {
			tx[1 + x] = "<html>Voc\u00EA percebe que essa \u00E9 a mesma voz " + "<br/>que voc\u00EA tinha ouvido 15 anos atr\u00E1s, "
					+ "<br/>quando entrou na torre pela primeira vez. " + "<br/>S\u00F3 que dessa vez mais poderosa, mais"
					+ "<br/>real. Isso te d\u00E1 a certeza de que a joia " + "<br/>est\u00E1 pr\u00F3xima" + "<html>";
			linhas[1 + x] = 3;
			x++;
		}
		tx[1 + x] = "<html>Enquanto voc\u00EA segue a voz, voc\u00EA repara " + "<br/>que salas das catacumbas est\u00E3o ficando "
				+ "<br/>cada vez maiores, e percebe um som  " + "<br/>alto, parecendo um animal selvagem. E "
				+ "<br/>um forte cheiro de sangue invade o ar. " + "<br/>surpreende ao encontrar uma Hidra  "
				+ "<br/>guardando a passagem." + "<html>";
		linhas[1 + x] = 6;

		tx[2 + x] = "<html>Voc\u00EA se lembra de seus estudos, que  " + "<br/>Hidras s\u00E3o imunes a magia, por \"sorte\" "
				+ "<br/>as catacumbas est\u00E3o cheias guerreiros " + "<br/>mortos segurando suas espadas. " + "<html>";
		linhas[2 + x] = 3;

		tx[3 + x] = "<html>Voc\u00EA corre para pegar a espada de um " + "<br/>dos cad\u00E1veres e se vira para encarar o  "
				+ "<br/>monstro que est\u00E1 entre voc\u00EA e a j\u00F3ia do " + "<br/tempo. " + "<html>";
		linhas[3 + x] = 3;
	}

	public void catedral3() {
		tx = new String[1];
		linhas = new int[1];

		tx[0] = "<html>Voc\u00EA segue a passagem do esgoto que" + "<br/>leva as catacumbas e rapidamente voc\u00EA"
				+ "<br/>se encontra na sala da Hidra, " + "<br/>determinado a exterminar a criatura para"
				+ "<br/>poder obter a j\u00F3ia do tempo" + "<html>";
		linhas[0] = 4;
	}

	public void catedralDerrota(int x) {
		if (player.getHoras() == 3) {

			tx = new String[4];
			linhas = new int[4];

			tx[1] = "<html>J\u00E1 est\u00E1 muito tarde, todos os esfor\u00E7os " + "<br/>do dia pesam sobre seu corpo e voc\u00EA "
					+ "<br/>n\u00E3o conseguiria fazer mais nada sem " + "<br/>dormir um poucoâ€¦" + "<html>";
			linhas[1] = 3;

			tx[2] = "<html>Voc\u00EA acorda e percebe que j\u00E1 \u00E9 o fim " + "<br/>da manh\u00E3, voc\u00EA deve se apressar " + "<html>";
			linhas[2] = 1;
		} else {

			tx = new String[2];
			linhas = new int[2];
		}

		switch (x) {
		case 1:
			tx[0] = "<html>A luta torna - se muito longa, voc\u00EA n\u00E3o " + "<br/>conseguir\u00E1 batalhar por muito mais  "
					+ "<br/>tempo." + "<html>";
			linhas[0] = 3;
			break;
		case 2:
			tx[0] = "<html>A Hidra \u00E9 forte de mais e a cada ataque  " + "<br/>ela cresce mais. Voc\u00EA n\u00E3o tem chances "
					+ "<br/>de venc\u00EA-la agora." + "<html>";
			linhas[0] = 3;
			break;
		}
		tx[1] = "<html>Sua \u00FAnica op\u00E7\u00E3o \u00E9 fugir, voc\u00EA se vira e " + "<br/>come\u00E7a a correr pelas catacumbas, por "
				+ "<br/>sorte voc\u00EA encontra uma passagem que" + "<br/>d\u00E1 nos esgotos da cidade. Depois de "
				+ "<br/>restaurar suas for\u00E7as voc\u00EA pode tentar" + "<br/>enfrentar a besta de novo, mas ser\u00E1 que  "
				+ "<br/>que voc\u00EA n\u00E3o encontrou o livro de " + "<br/>Merlin. Voc\u00EA pode tentar novamente, "
				+ "<br/>h\u00E1 tempo para isso?" + "<html>";
		linhas[1] = 8;
	}

	public void catedralVitoria() {
		tx = new String[6];
		linhas = new int[6];
		if (player.getSexo() == 0) {
			tx[0] = "<html>Depois de destruir o cora\u00E7\u00E3o da Hidra" + "<br/>voc\u00EA segue as catacumbas.  "
					+ "<br/>Estranhamente voc\u00EA chega a um  " + "<br/>beco vazio. Decepcionado voc\u00EA volta"
					+ "<br/>para a torre, mas mal chega na porta, " + "<br/>desmaia." + "<br/>" + "<html>";
			linhas[0] = 5;
		} else {
			tx[0] = "<html>Depois de destruir o cora\u00E7\u00E3o da Hidra" + "<br/>voc\u00EA segue as catacumbas.  "
					+ "<br/>Estranhamente voc\u00EA chega a um  " + "<br/>beco vazio. Decepcionadoa voc\u00EA volta"
					+ "<br/>para a torre, mas mal chega na porta, " + "<br/>desmaia." + "<br/>" + "<html>";
			linhas[0] = 5;
		}
		tx[1] = "<html>Chega a madrugada e voc\u00EA acorda  " + "<br/com algu\u00E9m chamando o seu nome. "
				+ "<br/>Rapidamente voc\u00EA vai em dire\u00E7\u00E3o ao  " + "<br/>chamado at\u00E9 que se depara com uma "
				+ "<br/>sala totalmente diferente de qualquer " + "<br/>coisa que j\u00E1 tenha visto antes.  " + "<html>";
		linhas[1] = 5;

		tx[2] = "<html>Cheia de tesouros, livros, tape\u00E7arias, " + "<br/>tudo de mais valor poss\u00EDvel, essa \u00E9 a "
				+ "<br/>sala que um dia foi de Merlin e, em " + "<br/>seu centro est\u00E1 a j\u00F3ia do tempo " + "<html>";
		linhas[2] = 3;

		tx[3] = "<html>\u00C9 dela que vem o chamado. Voc\u00EA vai " + "<br/>vat\u00E9 o pedestal e pega a joia. Voc\u00EA "
				+ "<br/>entende que a joia nunca esteve sob " + "<br/>a Catedral, e que era imposs\u00EDvel "
				+ "<br/>encontr\u00E1-la sem que a joia desejasse" + "<br/>se revelar a voc\u00EA. A Hidra n\u00E3o passou "
				+ "<br/>de um teste para determinar se voc\u00EA " + "<br/>tinha o que \u00E9 necess\u00E1rio para usar a "
				+ "<br/>j\u00F3ia" + "<html>";
		linhas[3] = 8;

		tx[4] = "<html>Voc\u00EA volta para a cama porque no dia " + "<br/>seguinte ter\u00E1 muito com o que se "
				+ "<br/>preocupar." + "<html>";
		linhas[4] = 2;

		tx[5] = "<html>Quando voc\u00EA finalmente acorda a " + "<br/>manh\u00E3 j\u00E1 acabou, e voc\u00EA tem muito o"
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
