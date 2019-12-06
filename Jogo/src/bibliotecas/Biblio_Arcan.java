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
				+ "<br/>clima est\u00E1 piorando, \u00E9 como se voc\u00EA "
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

		tx[12] = "<html>Ap\u00F3s  o t\u00E9rmino da reuni\u00E3o, Guradam  "
				+ "<br/>te chama para acompanh\u00E1-lo ao seu "
				+ "<br/>escrit\u00F3rio. Chegando l\u00E1 voc\u00EA encontra "
				+ "<br/>Artemisia j\u00E1 esperando por voc\u00EAs" + "<html>";
		linhas[12] = 3;

		choice = "<html>Artemisia:" + "<br/><br/>Voc\u00EA est\u00E1 bem?" + "<html>";
		if(masculino){
			op2 = "Ser sincero";
		} else op2 = "Ser sincera";
		
		op1 = "Mentir";
		

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

			if (masculino) {
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
				+ "<br/>somente para os maiores arcanos" + "<br/>ent\u00E3o por que eu deveria aprend\u00EA-lo? "
				+ "<html>";
		linhas[x + 4] = 4;

		if (masculino) {
			tx[x + 5] = "<html>Guradam:" + "<br/><br/>Acreditamos que voc\u00EA \u00E9 o \u00FAnico que  "
					+ "<br/>pode. O feiti\u00E7o est\u00E1 ligado ao sangue. "
					+ "<br/>Somente aqueles que partilham do " + "<br/>sangue de Merlin podem us\u00E1-lo. " + "<html>";
			linhas[x + 5] = 5;

			tx[x + 6] = "<html>Voc\u00EA:" + "<br/><br/> E voc\u00EAs acreditam que esse sangue "
					+ "<br/>corre em meu corpo. Isso \u00E9 " + "<br/>loucura, eu cresci no campo, n\u00E3o sou  "
					+ "<br/>de uma fam\u00EDlia de renome ou algo  " + "<br/>parecido. Isso \u00E9 imposs\u00EDvel. "
					+ "<html>";
			linhas[x + 6] = 6;

			tx[x + 7] = "<html>Artemisia:" + "<br/><br/>" + player.getNome() + " Merlin viveu um  "
					+ "<br/>per\u00EDodo em uma torre perto de sua " + "<br/>vila. Segundo o que se diz ele teve "
					+ "<br/>um breve relacionamento com uma " + "<br/>camponesa e da\u00ED pode ter vindo sua "
					+ "<br/>fam\u00EDlia." + "<html>";
			linhas[x + 7] = 7;

			tx[x + 8] = "<html>Artemisia:" + "<br/><br/>De qualquer forma, essa \u00E9 nossa  "
					+ "<br/>melhor chance. H\u00E1 muito a Ordem de "
					+ "<br/>Merlin nos deixou e agora voc\u00EA \u00E9 o  "
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
					+ "<br/>na Alameda dos Três Ponteiros em " + "<br/>seus subterrâneos onde um dia foi o "
					+ "<br/>esconderijo de Elrond, um grande " + "<br/>amigo de Merlin. " + "<html>";
			linhas[x + 12] = 6;

			tx[x + 13] = "<html>Guradam:" + "<br/><br/>Por favor recupere esses itens o mais "
					+ "<br/>r\u00E1pido poss\u00EDvel. Mesmo que n\u00E3o  " + "<br/>consiga recuperar todos, talvez  "
					+ "<br/>consiga realizar o feiti\u00E7o " + "<br/>incompleto. Ser\u00E1 melhor do que nada."
					+ "<br/>" + "<html>";
			linhas[x + 13] = 6;

			tx[x + 13] = "<html>Guradam:" + "<br/><br/>Voc\u00EA \u00E9 o \u00FAnico que pode realizar essa "
					+ "<br/>tarefa. Gra\u00E7as ao seu sangue, voc\u00EA" + "<br/>provavelmente poder\u00E1 sentir a  "
					+ "<br/>proximidade com tais rel\u00EDquias. " + "<html>";
			linhas[x + 13] = 5;

			tx[x + 13] = "<html>Guradam:" + "<br/><br/>Al\u00E9m disso, temos de preparar as  "
					+ "<br/>nossas defesas enquanto isso. E " + "<br/>tamb\u00E9m nos prepararmos para fugir,   "
					+ "<br/>caso tudo d\u00EA errado." + "<html>";
			linhas[x + 13] = 5;

			tx[x + 13] = "<html>Voc\u00EA:" + "<br/><br/>Entendo... Nesse caso irei " + "<br/>imediatamente."
					+ "<html>";
			linhas[x + 13] = 3;

		} else {
			tx[x + 5] = "<html>Guradan:" + "<br/><br/>Acreditamos que voc\u00EA \u00E9 a \u00FAnica que "
					+ "<br/>pode. O feiti\u00E7o est\u00E1 ligado ao sangue. "
					+ "<br/> Somente aqueles  que partilham do  " + "<br/>sangue de Merlin podem us\u00E1-lo."
					+ "<html>";
			linhas[x + 5] = 5;

			tx[x + 6] = "<html>Voc\u00EA:" + "<br/><br/>E Guradan acredita que esse  "
					+ "<br/>sangue corre em meu corpo. Isso \u00E9 "
					+ "<br/>loucura, eu cresci no campo, n\u00E3o sou  "
					+ "<br/>de uma fam\u00EDlia de renome ou algo  " + "<br/>parecido. Isso \u00E9 imposs\u00EDvel. "
					+ "<html>";
			linhas[x + 6] = 6;

			tx[x + 7] = "<html>Artemisia:" + "<br/><br/>" + player.getNome() + " Merlin viveu um  "
					+ "<br/>per\u00EDodo em uma torre perto de sua " + "<br/>vila. Segundo o que se diz ele teve "
					+ "<br/>um breve relacionamento com uma " + "<br/>camponesa e da\u00ED pode ter vindo sua "
					+ "<br/>fam\u00EDlia." + "<html>";
			linhas[x + 7] = 7;

			tx[x + 8] = "<html>Artemisia:" + "<br/><br/>De qualquer forma, essa \u00E9 nossa  "
					+ "<br/>melhor chance. H\u00E1 muito a Ordem de "
					+ "<br/>Merlin nos deixou e agora voc\u00EA \u00E9 a "
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
					+ "<br/>consiga realizar o feiti\u00E7o " + "<br/>incompleto. Ser\u00E1 melhor do que nada."
					+ "<br/>" + "<html>";
			linhas[x + 13] = 6;

			tx[x + 13] = "<html>Guradam:" + "<br/><br/>Voc\u00EA \u00E9 a \u00FAnica que pode realizar essa "
					+ "<br/>tarefa. Gra\u00E7as ao seu sangue, voc\u00EA" + "<br/>provavelmente poder\u00E1 sentir a  "
					+ "<br/>proximidade com tais rel\u00EDquias. " + "<html>";
			linhas[x + 13] = 5;

			tx[x + 13] = "<html>Guradam:" + "<br/><br/>Al\u00E9m disso, temos de preparar as  "
					+ "<br/>nossas defesas enquanto isso. E " + "<br/>tamb\u00E9m nos prepararmos para fugir,   "
					+ "<br/>caso tudo d\u00EA errado." + "<html>";
			linhas[x + 13] = 5;

			tx[x + 13] = "<html>Voc\u00EA:" + "<br/><br/>Entendo... Nesse caso irei " + "<br/>imediatamente."
					+ "<html>";
			linhas[x + 13] = 3;
		}

	}

	public void torre() {

		tx = new String[7];
		linhas = new int[7];

		tx[0] = "<html>Ao entrar na biblioteca da Torre, voc\u00EA " + "<br/>encontra Artemisia." + "<html>";
		linhas[0] = 1;

		tx[1] = "<html>Artemisia:" + "<br/><br/>Imagino que voc\u00EA est\u00E1 buscando o "
				+ "<br/>livro de Merlin,certo?" + "<html>";
		linhas[1] = 3;

		tx[2] = "<html>Voc\u00EA:" + "<br/><br/>Exato, mas onde ele est\u00E1? Eu j\u00E1  "
				+ "<br/>revirei essa biblioteca inteira e o " + "<br/>m\u00E1ximo que vi foram men\u00E7\u00F5es a ele."
				+ "<html>";
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

			tx[1] = "<html>J\u00E1 est\u00E1 muito tarde, todos os esfor\u00E7os "
					+ "<br/>do dia pesam sobre seu corpo e voc\u00EA "
					+ "<br/>n\u00E3o conseguiria fazer mais nada sem " + "<br/>dormir um pouco." + "<html>";
			linhas[1] = 3;

			tx[2] = "<html>Voc\u00EA acorda e percebe que j\u00E1 \u00E9 o fim "
					+ "<br/>da manh\u00E3, voc\u00EA deve se apressar " + "<html>";
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
				+ "<br/>\u00C9 magn\u00EDfico, tantas revela\u00E7\u00F5es tantas"
				+ "<br/>coisas. Tudo passando por sua " + "<br/>cabe\u00E7a em um piscar de olhos. Voc\u00EA "
				+ "<br/>desmaia." + "<html>";
		linhas[1] = 7;

		tx[2] = "<html>Voz: " + "<br/><br/>Bom dia dorminhoco " + "<html>";
		linhas[2] = 2;

		tx[3] = "<html>As luzes do dia batem em seu rosto, "
				+ "<br/>voc\u00EA percebe que j\u00E1 \u00E9 o fim da manh\u00E3." + "<html>";
		linhas[3] = 1;

		tx[4] = "<html>Voz: " + "<br/><br/> o que aconteceu? " + "<html>";
		linhas[4] = 2;
		if (masculino) {
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
			linhas[5] = 7;
		}
		tx[6] = "<html>Voc\u00EA: " + "<br/><br/>Caramba, eu n\u00E3o deveria ter dormido " + " <br/>tanto tempo! "
				+ "<html>";
		linhas[6] = 3;

		tx[7] = "<html>Artemisia: " + "<br/><br/>Voc\u00EA n\u00E3o conseguir\u00E1 fazer nada se "
				+ " <br/>apressando desse jeito. Respire e " + " <br/>pense no que voc\u00EA precisa fazer." + "<html>";
		linhas[7] = 4;
	}

	public void catedral() {

		tx = new String[8];
		linhas = new int[8];

		tx[0] = "<html>Voc\u00EA se encaminha para a Catedral, "
				+ "<br/>chegando l\u00E1 voc\u00EA encontra o Bispo. \u00C9 "
				+ "<br/>vis\u00EDvel que ele n\u00E3o est\u00E1 feliz em te ver" + "<html>";
		linhas[0] = 2;
		if (masculino) {
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
			tx[1] = "<html>Bispo:" + "<br/><br/>O que levou uma herege da Torre Arcana"
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
				+ "<br/>compartilha da mesma f\u00E9 que Helaria, "
				+ "<br/>eles n\u00E3o s\u00E3o uma amea\u00E7a \u00E0  Igreja.  " + "<html>";
		linhas[5] = 4;

		tx[6] = "<html>Voc\u00EA:" + "<br/><br/>Como voc\u00EA pode ser t\u00E3o ego\u00EDsta? Pense "
				+ "<br/>em quantas pessoas podemos salvar." + "<html>";
		linhas[6] = 3;

		tx[7] = "<html>Bispo:" + "<br/><br/> Helarianos v\u00E3o morrer se voc\u00EAs falharem "
				+ "<br/>e Bethesdences ir\u00E3o morrer se voc\u00EAs "
				+ "<br/>vencerem. A Igreja n\u00E3o pode escolher "
				+ "<br/>sobre a vida de dois fi\u00E9is. Ao menos suas " + "<br/>almas ser\u00E3o salvas." + "<html>";
		linhas[7] = 6;

		choice = "<html>Voc\u00EA tem que chegar nas catacumbas de "
				+ "<br/>qualquer jeito para conseguir a j\u00F3ia, mas " + "<br/>como passar pelo bispo?" + "<html>";

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

			tx[1] = "<html>Ao chegar em uma grande port\u00E3o de"
					+ "<br/>ferro, o bispo manda voc\u00EA entrar, ap\u00F3s  "
					+ "<br/>atravessar o port\u00E3o, o bispo o fecha e" + "<br/>tranca - o." + "<html>";
			linhas[1] = 3;

			if (masculino) {
				tx[2] = "<html>Bispo: " + "<br/><br/>Eu lhe disse que te guiaria at\u00E9 as  "
						+ "<br/>catacumbas, nunca disse que voc\u00EA iria" + "<br/>voltar vivo." + "<html>";
				linhas[2] = 4;

				tx[3] = "<html>A fala do bispo te deixa confuso e "
						+ "<br/>preocupado. Mas voc\u00EA n\u00E3o tem op\u00E7\u00E3o "
						+ "<br/>al\u00E9m de explorar as catacumbas." + "<html>";
				linhas[3] = 2;

			} else {
				tx[2] = "<html>Bispo: " + "<br/><br/>Eu lhe disse que te guiaria at\u00E9 as  "
						+ "<br/>catacumbas, nunca disse que voc\u00EA iria" + "<br/>voltar viva." + "<html>";
				linhas[2] = 4;

				tx[3] = "<html>A fala do bispo te deixa confusa e "
						+ "<br/>preocupada. Mas voc\u00EA n\u00E3o tem op\u00E7\u00E3o "
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
			if (masculino) {
				tx[0] = "<html>Voc\u00EA sai da Catedral, troca suas roupas "
						+ "<br/>para se parecer como um fiel da Igreja e " + "<br/>n\u00E3o tem muitos problemas para "
						+ "<br/>encontrar  a passagem para as <br/> catacumbas." + "<html>";
				linhas[0] = 4;
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
		tx[0 + x] = "<html>Ap\u00F3s certo explorando tempo voc\u00EA "
				+ "<br/>consegue sentir a presen\u00E7a da j\u00F3ia por"
				+ "<br/>perto, \u00E9 como uma voz lhe convidando a  " + "<br/>segui-l\u00E1." + "<html>";
		linhas[0 + x] = 3;
		if (player.isAndarPelaTorreArcan()) {
			tx[1 + x] = "<html>Voc\u00EA percebe que essa \u00E9 a mesma voz "
					+ "<br/>que voc\u00EA tinha ouvido 15 anos atr\u00E1s, "
					+ "<br/>quando entrou na torre pela primeira vez. "
					+ "<br/>S\u00F3 que dessa vez mais poderosa, mais"
					+ "<br/>real. Isso te d\u00E1 a certeza de que a joia " + "<br/>est\u00E1 pr\u00F3xima" + "<html>";
			linhas[1 + x] = 3;
			x++;
		}
		tx[1 + x] = "<html>Enquanto voc\u00EA segue a voz, voc\u00EA repara "
				+ "<br/>que salas das catacumbas est\u00E3o ficando " + "<br/>cada vez maiores, e percebe um som  "
				+ "<br/>alto, parecendo um animal selvagem. E " + "<br/>um forte cheiro de sangue invade o ar. "
				+ "<br/>surpreende ao encontrar uma Hidra  " + "<br/>guardando a passagem." + "<html>";
		linhas[1 + x] = 6;

		tx[2 + x] = "<html>Voc\u00EA se lembra de seus estudos, que  "
				+ "<br/>Hidras s\u00E3o imunes a magia, por \"sorte\" "
				+ "<br/>as catacumbas est\u00E3o cheias guerreiros " + "<br/>mortos segurando suas espadas. "
				+ "<html>";
		linhas[2 + x] = 3;

		tx[3 + x] = "<html>Voc\u00EA corre para pegar a espada de um "
				+ "<br/>dos cad\u00E1veres e se vira para encarar o  "
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

			tx[1] = "<html>J\u00E1 est\u00E1 muito tarde, todos os esfor\u00E7os "
					+ "<br/>do dia pesam sobre seu corpo e voc\u00EA "
					+ "<br/>n\u00E3o conseguiria fazer mais nada sem " + "<br/>dormir um pouco" + "<html>";
			linhas[1] = 3;

			tx[2] = "<html>Voc\u00EA acorda e percebe que j\u00E1 \u00E9 o fim "
					+ "<br/>da manh\u00E3, voc\u00EA deve se apressar " + "<html>";
			linhas[2] = 1;
		} else {

			tx = new String[2];
			linhas = new int[2];
		}

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
				+ "<br/>come\u00E7a a correr pelas catacumbas, por " + "<br/>sorte voc\u00EA encontra uma passagem que"
				+ "<br/>d\u00E1 nos esgotos da cidade. Depois de "
				+ "<br/>restaurar suas for\u00E7as voc\u00EA pode tentar"
				+ "<br/>enfrentar a besta de novo, mas ser\u00E1 que  "
				+ "<br/>que voc\u00EA n\u00E3o encontrou o livro de " + "<br/>Merlin. Voc\u00EA pode tentar novamente, "
				+ "<br/>h\u00E1 tempo para isso?" + "<html>";
		linhas[1] = 8;
	}

	public void catedralVitoria() {
		tx = new String[6];
		linhas = new int[6];
		if (masculino) {
			tx[0] = "<html>Depois de destruir o cora\u00E7\u00E3o da Hidra" + "<br/>voc\u00EA segue as catacumbas.  "
					+ "<br/>Estranhamente voc\u00EA chega a um  " + "<br/>beco vazio. Decepcionado voc\u00EA volta"
					+ "<br/>para a torre, mas mal chega na porta, " + "<br/>desmaia." + "<br/>" + "<html>";
			linhas[0] = 5;
		} else {
			tx[0] = "<html>Depois de destruir o cora\u00E7\u00E3o da Hidra" + "<br/>voc\u00EA segue as catacumbas.  "
					+ "<br/>Estranhamente voc\u00EA chega a um  " + "<br/>beco vazio. Decepcionada voc\u00EA volta"
					+ "<br/>para a torre, mas mal chega na porta, " + "<br/>desmaia." + "<br/>" + "<html>";
			linhas[0] = 5;
		}
		tx[1] = "<html>Chega a madrugada e voc\u00EA acorda  " + "<br/com algu\u00E9m chamando o seu nome. "
				+ "<br/>Rapidamente voc\u00EA vai em dire\u00E7\u00E3o ao  "
				+ "<br/>chamado at\u00E9 que se depara com uma " + "<br/>sala totalmente diferente de qualquer "
				+ "<br/>coisa que j\u00E1 tenha visto antes.  " + "<html>";
		linhas[1] = 5;

		tx[2] = "<html>Cheia de tesouros, livros, tape\u00E7arias, "
				+ "<br/>tudo de mais valor poss\u00EDvel, essa \u00E9 a " + "<br/>sala que um dia foi de Merlin e, em "
				+ "<br/>seu centro est\u00E1 a j\u00F3ia do tempo " + "<html>";
		linhas[2] = 3;

		tx[3] = "<html>\u00C9 dela que vem o chamado. Voc\u00EA vai "
				+ "<br/>vat\u00E9 o pedestal e pega a joia. Voc\u00EA " + "<br/>entende que a joia nunca esteve sob "
				+ "<br/>a Catedral, e que era imposs\u00EDvel " + "<br/>encontr\u00E1-la sem que a joia desejasse"
				+ "<br/>se revelar a voc\u00EA. A Hidra n\u00E3o passou "
				+ "<br/>de um teste para determinar se voc\u00EA "
				+ "<br/>tinha o que \u00E9 necess\u00E1rio para usar a " + "<br/>j\u00F3ia" + "<html>";
		linhas[3] = 8;

		tx[4] = "<html>Voc\u00EA volta para a cama porque no dia " + "<br/>seguinte ter\u00E1 muito com o que se "
				+ "<br/>preocupar." + "<html>";
		linhas[4] = 2;

		tx[5] = "<html>Quando voc\u00EA finalmente acorda a "
				+ "<br/>manh\u00E3 j\u00E1 acabou, e voc\u00EA tem muito o" + "<br/>que fazer." + "<html>";
		linhas[5] = 2;

	}

	public void alameda() {
		tx = new String[3];
		linhas = new int[3];

		tx[0] = "<html>Quando chega nos subterrâneos,  " + "<br/>pega o caminho que te foi indicado "
				+ "<br/>por seus companheiros e com " + "<br/>cautela, afinal os subterrâneos "
				+ "<br/>possuem muitas criaturas perigosas, " + "<br/>segue até chegar próximo do "
				+ "<br/>esconderijo. " + "<html>";
		linhas[0] = 6;

		tx[1] = "<html>Um portão te impede o caminho, você  " + "<br/>já sabia dele, Artemisia havia lhe "
				+ "<br/>alertado e te dado um papel antigo que  " + "<br/>contém um enigma com a senha.  " + "<html>";
		linhas[1] = 3;

		tx[2] = "<html>Você também sabe que ele tem um   " + "<br/>alarme que se disparado atrairá as  "
				+ "<br/>criaturas do subterrâneo e você terá  " + "<br/>que esperar algumas horas até o "
				+ "<br/>caminho  estar livre e você poder " + "<br/>tentar de novo,ou mesmo para você "
				+ "<br/>voltar a superfície" + "<html>";
		linhas[2] = 6;
	}

	public void alameda2() {
		tx = new String[1];
		linhas = new int[1];

		tx[0] = "<html>Você chega até a porta que dá no  " + "<br/>esconderijo de Elrond, já preparado  "
				+ "<br/>para resolver o enigma e recuperar " + "<br/>o cajado. " + "<html>";
		linhas[0] = 3;
	}

	public void alamedaVitoria() {
		tx = new String[3];
		linhas = new int[3];

		tx[0] = "<html>Você consegue abrir a porta e entra   " + "<br/>no esconderijo de Elrond. Você não  "
				+ "<br/>precisa vasculhar muito, pois o cetro " + "<br/>está pendurado na parede. Você se "
				+ "<br/>aproxima e pega o cetro. Nisso, um  " + "<br/>papel cai e você o pega para lê-lo.  "
				+ "<br/>Nele está escrito: " + "<html>";
		linhas[0] = 6;

		tx[1] = "<html>“O livro para liberar" + "<br/>A pedra para dominar" + "<br/>O cetro para lançar"
				+ "<br/>Ao custo de uma vida" + "<br/>O amor que você deve pagar" + "<br/>Para Maelstrom poder usar.”"
				+ "<html>";
		linhas[1] = 5;

		tx[2] = "<html>Você guarda o poema e volta para a  " + "<br/>Torre Arcana. O dia está terminando e  "
				+ "<br/>você precisa descansar." + "<html>";
		linhas[2] = 2;

//		tx[3] = "<html>Quando voc\u00EA finalmente acorda a "
//				+ "<br/>manh\u00E3 j\u00E1 acabou, e voc\u00EA tem muito o" + "<br/>que fazer." + "<html>";
//		linhas[3] = 2;
	}

	public void alamedaDerrota() {
		tx = new String[1];
		linhas = new int[1];

		tx[0] = "<htmlO alarme é soado e você precisa  " + "<br/>correr. Horas passam até que os  "
				+ "<br/>túneis estejam seguros novamente. " + "<html>";
		linhas[0] = 2;
	}

	public void todosItens() {

		tx = new String[5];
		linhas = new int[5];

		tx[0] = "<html>Depois de pegar todos os itens você " + "<br/>está de volta na Torre Arcana e sabe"
				+ "<br/>o que precisa fazer, matar alguém que" + "<br/>você ama pela salvação de todos. "
				+ "<br/>Desde a morte de sua família, você só " + "<br/>realmente amou uma pessoa, "
				+ "<br/>Artemisia, e é a vida dela que você" + "<br/>deve tirar." + "<html>";
		linhas[0] = 7;

		tx[1] = "<html>Quando você chega, Guradan e " + "<br/>Artemisia te chamam para conversar "
				+ "<br/>na sala dele. Eles perguntam como foi " + "<br/>sua busca e você conta tudo que "
				+ "<br/>aconteceu e o que precisa fazer." + "<html>";
		linhas[1] = 4;

		tx[2] = "<html>Nesse momento Artemisia te olha e " + "<br/>entende o que precisa ser feito." + "<html>";
		linhas[2] = 1;

		tx[3] = "<html>" + player.getNome() + " , por favor faça " + "<br/>isso. Eu estou pronta. Não precisa se "
				+ "<br/>preocupar, eu vou ficar bem" + "<html>";
		linhas[3] = 2;

		tx[4] = "<html>Ela começa a chorar enquanto diz " + "<br/>isso. Ela não quer morrer, mas "
				+ "<br/>sempre esteve disposta caso fosse " + "<br/>necessário." + "<html>";
		linhas[4] = 3;

		choice = "<html>Mas será que você está disposto a ir" + "<br/>até às últimas consequências para "
				+ "<br/>proteger Helaria?" + "<html>";

		op1 = "Matá-la";
		op2 = "Poupá-la";
	}

	public void todosItensMatar() {

		tx = new String[6];
		linhas = new int[6];

		tx[0] = "<html>Para atingir sua vingança e para " + "<br/>proteger Helaria você está disposto a "
				+ "<br/>tudo, inclusive sacrificar a pessoa que" + "<br/>te acolheu e te deu uma nova vida." + "<html>";
		linhas[0] = 3;

		tx[1] = "<html>Você pega o cetro de Merlin e " + "<br/>atravessa o peito de Artemisia com "
				+ "<br/>ele. Ela não tem tempo de dizer uma " + "<br/>última palavra enquanto cai no chão." + "<html>";
		linhas[1] = 3;

		tx[2] = "<html>Com a Joia do Tempo unida ao " + "<br/>Cajado da Morte agora você tem os "
				+ "<br/>itens necessários para utilizar o feitiço" + "<br/>mais poderoso que já existiu. Você "
				+ "<br/>sente o poder correr em suas e cai no" + "<br/>chão, mas não é tempo de descansar, "
				+ "<br/>é preciso preparar o enterro de " + "<br/>Artemisia." + "<html>";
		linhas[2] = 7;

		tx[3] = "<html>Foi uma cerimônia muito triste com" + "<br/>toda a Ordem Arcana presente, todos "
				+ "<br/>aqueles que eram mais próximos dela " + "<br/>dizem algo, menos você, que ainda "
				+ "<br/>não conseguiu aceitar o que fez." + "<html>";
		linhas[3] = 4;

		tx[4] = "<html>O  funeral mal termina e você têm que " + "<br/>se posicionar para a batalha." + "<html>";
		linhas[4] = 1;

		tx[5] = "<html>Você e um grupo de arcanos são " + "<br/>encaminhados para ficarem nos "
				+ "<br/>muros, destruindo qualquer soldado " + "<br/>que se aproximar." + "<html>";
		linhas[5] = 3;

	}

	public void vitoriaPerfectMatar() {

		tx = new String[7];
		linhas = new int[7];

		tx[0] = "<html>As primeiras tropas que aparecem " + "<br/>são esmagadas, porém mais estão"
				+ "<br/>chegando. São muito numerosas, " + "<br/>apenas com feitiços simples não será "
				+ "<br/>possível contê-las. " + "<html>";
		linhas[0] = 4;

		tx[1] = "<html>Você se prepara para usar Maelstrom, " + "<br/>se lembra de todos que dependem de"
				+ "<br/>você, se lembra de seus pais que " + "<br/>morreram em decorrência da guerra e "
				+ "<br/>se lembra de Artemisia." + "<html>";
		linhas[1] = 4;

		tx[2] = "<html>Você está calmo e pronto, ninguém" + "<br/>pode pará-lo agora. Então, o feitiço é "
				+ "<br/>liberado. Todo o exército de Bethesda " + "<br/>e Helaria é afetado, mas ninguém é "
				+ "<br/>morto, ao que parece todos " + "<br/>simplesmente perderam os motivos "
				+ "<br/>para continuar a luta. " + "<html>";
		linhas[2] = 6;

		tx[3] = "<html>Ninguém vê mais sentido nesta " + "<br/>guerra, é como se de repente todo "
				+ "<br/>mundo percebesse que a guerra não" + "<br/>é do interesse deles e sim daquele "
				+ "<br/>que estão no topo dos dois lados. O " + "<br/>povo não tem mais vontade de lutar "
				+ "<br/>contra si, apenas contra aqueles que " + "<br/>os oprimem." + "<html>";
		linhas[3] = 7;

		tx[4] = "<html>Neste momento você entende o que " + "<br/>realmente faz Maelstrom, ele realiza "
				+ "<br/>seu mais profundo desejo e, naquele" + "<br/>momento, você não desejava nada "
				+ "<br/>além de paz. " + "<html>";
		linhas[4] = 4;

		tx[5] = "<html>Mas, para haver paz precisa haver " + "<br/>antes uma última guerra, mas não "
				+ "<br/>uma guerra entre reinos, e sim do " + "<br/>povo contra seus opressores. Neste "
				+ "<br/>dia algo novo surgiu no mundo e você " + "<br/>percebe isso e quer fazer parte." + "<html>";
		linhas[5] = 5;

		tx[6] = "<html>Você decide deixar a Ordem Arcana e " + "<br/>se juntar ao povo, para que juntos "
				+ "<br/>vocês consigam criar um caminho " + "<br/>melhor. Artemisia, sua mãe, seu pai, "
				+ "<br/>sua irmã, você nunca os esquecera e " + "<br/>eles estarão para sempre do seu lado "
				+ "<br/>nestes novos tempos." + "<html>";
		linhas[6] = 6;
	}

	public void derrotaPerfectBIMatar() {

		tx = new String[6];
		linhas = new int[6];

		tx[0] = "<html>Mesmo com seus esforços conjuntos, " + "<br/>as tropas de Bethesda estão entrando "
				+ "<br/>em Helaria. Não há tempo, só tem um " + "<br/>jeito de vencer, liberar imediatamente  "
				+ "<br/>Maelstrom. O feitiço é liberado, as " + "<br/>tropas de Bethesda são destruídas, a "
				+ "<br/>guerra está terminada." + "<html>";
		linhas[0] = 6;

		tx[1] = "<html>Algo está te puxando, das" + "<br/>profundezas da sua própria mente, "
				+ "<br/>uma força terrível e maligna, uma  " + "<br/>força cheia de ódio e de dor,  "
				+ "<br/>Maelstrom. Ou seria você mesmo?." + "<html>";
		linhas[1] = 4;

		tx[2] = "<html>Maelstrom potencializa tudo aquilo " + "<br/>que está dentro de você, era isso o   "
				+ "<br/>que dizia o livro, você agora entende." + "<html>";
		linhas[2] = 2;

		tx[3] = "<html>Quando você utilizou o feitiço, estava " + "<br/>com ódio de Bethesda, ódio de você, "
				+ "<br/>ódio do mundo inteiro, e agora todo " + "<br/>esse ódio e essa dor querem te  "
				+ "<br/>consumir." + "<html>";
		linhas[3] = 4;

		tx[4] = "<html>Mas, de repente você vê uma luz, " + "<br/>todos aqueles que você amou e  "
				+ "<br/>perdeu estão te chamando e você " + "<br/>atende ao chamado." + "<html>";
		linhas[4] = 3;

		tx[5] = "<html>As trevas não conseguem te  " + "<br/>consumir, mas para isso você se  "
				+ "<br/>entrega à luz, seu papel foi cumprido, " + "<br/>a guerra terminou e Helaria venceu, "
				+ "<br/>esse mundo não precisa mais de você  " + "<br/>e nem você dele, tem outros que você "
				+ "<br/>precisa encontrar. Sua mãe, seu pai, " + "<br/>sua irmã e Artemisia, eles querem sua "
				+ "<br/>companhia mais uma vez." + "<html>";
		linhas[5] = 8;

	}

	public void derrotaPerfectMatar() {

		tx = new String[6];
		linhas = new int[6];

		tx[0] = "<html>Mesmo com seus esforços conjuntos, " + "<br/>as tropas de Bethesda estão entrando "
				+ "<br/>em Helaria. Não há tempo, só tem um " + "<br/>jeito de vencer, liberar imediatamente  "
				+ "<br/>Maelstrom. O feitiço é liberado, as " + "<br/>tropas de Bethesda são destruídas, a "
				+ "<br/>guerra está terminada." + "<html>";
		linhas[0] = 6;

		tx[1] = "<html>Algo está te puxando, das" + "<br/>profundezas da sua própria mente, "
				+ "<br/>uma força terrível e maligna, uma  " + "<br/>força cheia de ódio e de dor,  "
				+ "<br/>Maelstrom. Ou seria você mesmo?." + "<html>";
		linhas[1] = 4;

		tx[2] = "<html>Maelstrom potencializa tudo aquilo " + "<br/>que está dentro de você, era isso o   "
				+ "<br/>que dizia o livro, você agora entende." + "<html>";
		linhas[2] = 2;

		tx[3] = "<html>Quando você utilizou o feitiço, estava " + "<br/>com ódio de Bethesda, ódio de você, "
				+ "<br/>ódio do mundo inteiro, e agora todo " + "<br/>esse ódio e essa dor querem te  "
				+ "<br/>consumir." + "<html>";
		linhas[3] = 4;

		tx[4] = "<html>E ele consegue. Você sucumbe às " + "<br/>trevas, renasce como um novo ser de  "
				+ "<br/>puro ódio, dor, corrupção. Helaria  " + "<br/>venceu a guerra, mas agora precisa "
				+ "<br/>de um novo comandante, adequado " + "<br/>aos novos rumos que ela deve tomar. " + "<html>";
		linhas[4] = 5;

		tx[5] = "<html>Não basta destruir o exército de " + "<br/>Bethesda enquanto seu povo ainda  "
				+ "<br/>existe. Esse é o caminho que você irá  " + "<br/>tomar e ninguém poderá te parar. " + "<html>";
		linhas[5] = 3;

	}

	public void todosItensPoup() {

		tx = new String[3];
		linhas = new int[3];

		tx[0] = "<html>Você se recusa a matar Artemisia. De " + "<br/>certa forma os dois ficam aliviados,  "
				+ "<br/>mas ao mesmo tempo decepcionados " + "<br/> contigo, as esperanças de vitória "
				+ "<br/> diminuíram muito." + "<html>";
		linhas[0] = 4;

		tx[1] = "<html>Como você não será capaz de usar " + "<br/>Maelstrom, os planos para a guerra  "
				+ "<br/>mudam e vocês tem que se preparar." + "<html>";
		linhas[1] = 2;

		tx[2] = "<html>No dia seguinte a Ordem Arcana é  " + "<br/>encarregada de proteger os muros da "
				+ "<br/>cidade e impedir a aproximação das " + "<br/>tropas inimigas." + "<html>";
		linhas[2] = 3;

	}

	public void vitoriaPerfectPoup() {

		tx = new String[4];
		linhas = new int[4];

		tx[0] = "<html>Vocês conseguem impedir a " + "<br/>aproximação de uma quantidade "
				+ "<br/>significativa de tropas inimigas, mas  " + "<br/> algumas ainda conseguem invadir a "
				+ "<br/>cidade. Dentro dos muros se dá uma " + "<br/>violenta batalha. Milhares de mortos "
				+ "<br/>dos dois lados, inclusive de grande " + "<br/>parte da Ordem Arcana, contando "
				+ "<br/>com Guradan." + "<html>";
		linhas[0] = 8;

		tx[1] = "<html>No final Helaria sai vencedora e a " + "<br/>Ordem Arcana destruída. Você e "
				+ "<br/>Ordem Arcana destruída. Você e" + "<br/>Artemisa agora tem a missão de"
				+ "<br/>reestruturar a Ordem e ajudar na " + "<br/>reconstrução da cidade." + "<html>";
		linhas[1] = 5;

		tx[2] = "<html>Helaria passou por uma fase  " + "<br/>extremamente difícil, mas agora pode "
				+ "<br/>significar o começo de um novo tempo " + "<br/>e vocês tem um papel importante" + "<br/>nisso."
				+ "<html>";
		linhas[2] = 4;

		tx[3] = "<html>O preço de não usar Maelstrom foi " + "<br/>caro, mas, você pensa, o de usá-lo  "
				+ "<br/>poderia ter sido ainda mais caro. É um " + "<br/>pensamento egoísta, mas você não "
				+ "<br/>se importa, não conseguiria imaginar " + "<br/>sua vida sem Artemisia e pretende "
				+ "<br/>ficar com ela até seus últimos dias. No " + "<br/>final, você está feliz." + "<html>";
		linhas[3] = 7;

	}

	public void derrotaPerfectPoup() {

		tx = new String[3];
		linhas = new int[3];

		tx[0] = "<html>As tropas inimigas são muitas, vocês " + "<br/>não conseguem contê-las. Helaria é "
				+ "<br/>invadida e não demorará muito a cair. " + "<html>";
		linhas[0] = 2;

		tx[1] = "<html>Você e Artemisia tomam frente na  " + "<br/>batalha, mas não é suficiente, vocês  "
				+ "<br/>são esmagados. Helaria cai." + "<html>";
		linhas[1] = 2;

		tx[2] = "<html>Seus últimos combatentes perecem   " + "<br/>lutando. Você e Artemisia morrem  "
				+ "<br/>lado a lado em paz na certeza de" + "<br/>terem dado o seu melhor.E assim "
				+ "<br/termina a história de Helaria." + "<html>";
		linhas[2] = 4;

	}

	public void itens2BI() {

		tx = new String[5];
		linhas = new int[5];

		tx[0] = "<html>Termina o terceiro dia e você está de " + "<br/>volta na Torre Arcana. Guradan e "
				+ "<br/>Artemisia te chamam para conversar" + "<br/>querendo saber tudo que aconteceu."
				+ "<br/>Cada parte você conta, mas no final " + "<br/>você falhou, não conseguiu juntar "
				+ "<br/>todos os itens, portanto Maelstrom" + "<br/>não poderá ser lançado." + "<html>";
		linhas[0] = 7;

		tx[1] = "<html>Ou pelo menos é isso que você " + "<br/>pensa, até Gurandan dizer." + "<html>";
		linhas[1] = 1;

		tx[2] = "<html>Gurandan " + "<br/><br/> Ainda existe um jeito, é possível usar "
				+ "<br/>Maelstrom com apenas dois dos itens" + "<br/>e o sangue de um de seus "
				+ "<br/>descendentes, mas o preço é muito " + "<br/>alto, é necessário o sacrifício de uma "
				+ "<br/>grande quantidade de magia. " + "<html>";
		linhas[2] = 7;

		tx[3] = "<html>Você:" + "<br/><br/>Quanta magia e em que forma?" + "<html>";
		linhas[3] = 2;

		tx[4] = "<html>Guradan:" + "<br/><br/>Na forma de vidas humanas e, " + "<br/>possivelmente, em uma quantidade "
				+ "<br/>que todos nesta Torre terão que dar " + "<br/>suas vidas para que você possa "
				+ "<br/>lançar, mas também custará sua vida. " + "<html>";
		linhas[4] = 6;

		choice = "<html>Guradan " + "<br/><br/>Você está disposto a tentar? A se "
				+ "<br/>sacrificar e sacrificar todos que você " + "<br/>ama e admira?" + "<html>";

		op1 = "Sim";
		op2 = "Não";

	}

	public void itens2BISIM() {

		tx = new String[7];
		linhas = new int[7];

		tx[0] = "<html>Artemisia:  " + "<br/><br/>Então nós o faremos. Agora vá  "
				+ "<br/>descansar, você precisa estar bem" + "<br/>para poder lançar o feitiço." + "<html>";
		linhas[0] = 4;

		tx[1] = "<html>Você vai para seus aposentos e  " + "<br/>dorme um pouco. Logo Artemisia te "
				+ "<br/>acorda para iniciar os preparativos " + "<br/>para o feitiço." + "<html>";
		linhas[1] = 3;

		tx[2] = "<html>Os preparativos logo estão prontos,  " + "<br/>vocês só estão esperando os alarmes "
				+ "<br/da cidade soarem para poderem" + "<br/>lançar o feitiço. " + "<html>";
		linhas[2] = 3;

		tx[3] = "<html>Os alarmes soam. Helaria está sendo" + "<br/>invadida, agora é o momento." + "<html>";
		linhas[3] = 2;

		tx[4] = "<html>Todos na Torre se suicidam" + "<br/>simultaneamente e com todo esse  "
				+ "<br/>poder e sua própria alma, você libera  " + "<br/>Maelstrom. " + "<html>";
		linhas[4] = 3;

		tx[5] = "<html>No mesmo instante todas as tropas de " + "<br/>Bethesda caem e Helaria é salva. " + "<html>";
		linhas[5] = 1;

		tx[6] = "<html>O rei procura pelos responsáveis por " + "<br/>essa vitória e descobre do destino da "
				+ "<br/>Ordem Arcana. Ele decide " + "<br/>reestruturar a Ordem, convida  "
				+ "<br/>arcanistas de diversas regiões do  " + "<br/>mundo para serem membros da Nova  "
				+ "<br/>Ordem Arcana. Helaria nunca  " + "<br/>esquecerá de seu sacrifício para  " + "<br/>salvá-la. "
				+ "<html>";
		linhas[6] = 8;

	}

	public void itens2BINao() {

		tx = new String[2];
		linhas = new int[2];

		tx[0] = "<html>Guradan: " + "<br/><br/> Entendo, realmente é uma escolha "
				+ "<br/>difícil para se fazer, então é melhor " + "<br/>nos prepararmos para a luta. " + "<html>";
		linhas[0] = 4;

		tx[1] = "<html>A Ordem Arcana é encarregada de " + "<br/>proteger os muros da cidade e é para "
				+ "<br/>lá que você vai." + "<html>";
		linhas[1] = 2;

	}

//	public void itens2BIVitoria() == public void vitoriaPerfectPoup()

	public void itens2BIDerrota() {

		tx = new String[4];
		linhas = new int[4];

		tx[0] = "<html>As tropas inimigas são muitas, vocês " + "<br/>não conseguem contê-las. Helaria é "
				+ "<br/>invadida e não demorará muito a cair." + "<html>";
		linhas[0] = 2;

		tx[1] = "<html>Você e Artemisia tomam frente na " + "<br/>batalha, mas não é suficiente, vocês "
				+ "<br/>são esmagados. Helaria cai." + "<html>";
		linhas[1] = 2;

		tx[2] = "<html>Antes de morrer, você Artemisia " + "<br/>lutando perto e ela te dá um último "
				+ "<br/>olhar, um olhar de desprezo, tudo está " + "<br/>acontecendo por sua culpa, logo em "
				+ "<br/>seguida ela é morta, você não dura" + "<br/>muito tempo depois, mas é tempo "
				+ "<br/>suficiente para pensar no que teria " + "<br/>acontecido se você tivesse feito o que "
				+ "<br/>deveria fazer." + "<html>";
		linhas[2] = 8;

		tx[3] = "<html>Assim termina a história de Helaria, " + "<br/>com o lamento de alguém que poderia "
				+ "<br/>ter feito diferente." + "<html>";
		linhas[3] = 2;
	}

	public void itensMin() {

		tx = new String[3];
		linhas = new int[3];

		tx[0] = "<html>Termina o terceiro dia e você está de " + "<br/>volta na Torre Arcana. Guradan e "
				+ "<br/>Artemisia te chamam para conversar" + "<br/>querendo saber tudo que aconteceu."
				+ "<br/>Cada parte você conta, mas no final " + "<br/>você falhou, não conseguiu juntar "
				+ "<br/>todos os itens, portanto Maelstrom" + "<br/>não poderá ser lançado." + "<html>";
		linhas[0] = 7;

		tx[1] = "<html>Agora só resta a Ordem Arcana se " + "<br/>preparar para enfrentar em combate "
				+ "<br/>as tropas de Bethesda. Vocês são " + "<br/>encarregados de defender os muros"
				+ "<br/>da cidade." + "<html>";
		linhas[1] = 5;

		tx[2] = "<html>Está na hora de se preparar, você vai" + "<br/>para o posto que deve ocupar e se dá"
				+ "<br/>início a guerra." + "<html>";
		linhas[2] = 2;

	}

	public void vitoriaMin() {

		tx = new String[3];
		linhas = new int[3];

		tx[0] = "<html>Vocês conseguem impedir a " + "<br/>aproximação de uma quantidade "
				+ "<br/>significativa de tropas inimigas, mas " + "<br/>algumas ainda conseguem invadir a "
				+ "<br/>cidade. Dentro dos muros se dá uma " + "<br/>violenta batalha. Milhares de mortos "
				+ "<br/>dos dois lados, inclusive de grande " + "<br/>parte da Ordem Arcana, contando "
				+ "<br/>com Guradan." + "<html>";
		linhas[0] = 8;

		tx[1] = "<html>No final Helaria sai vencedora e a " + "<br/>Ordem Arcana destruída. Você e "
				+ "<br/>Artemisa agora tem a missão de" + "<br/>reestruturar a Ordem e ajudar na "
				+ "<br/>reconstrução da cidade." + "<html>";
		linhas[1] = 4;

		tx[2] = "<html>Helaria passou por uma fase " + "<br/>extremamente difícil, mas agora pode "
				+ "<br/>significar o começo de um novo tempo " + "<br/>e vocês tem um papel importante " + "<br/>nisso."
				+ "<html>";
		linhas[2] = 5;

	}

	public void derrotaMin() {

		tx = new String[3];
		linhas = new int[3];

		tx[0] = "<html>As tropas inimigas são muitas, vocês" + "<br/>não conseguem contê-las. Helaria é "
				+ "<br/>invadida e não demorará muito a cair." + "<html>";
		linhas[0] = 2;

		tx[1] = "<html>Você e Artemisia tomam frente na " + "<br/>batalha, mas não é suficiente, vocês"
				+ "<br/>são esmagados. Helaria cai." + "<html>";
		linhas[1] = 2;

		tx[2] = "<html>Seus últimos combatentes perecem " + "<br/>lutando. Você e Artemisia morrem"
				+ "<br/>lado a lado em paz na certeza de " + "<br/>terem dado o seu melhor. E assim "
				+ "<br/>termina a história de Helaria." + "<html>";
		linhas[2] = 4;

	}
//	  tx[] = "<html>"
//		 	+ "<br/>"
//		 	+ "<br/>" 
//		 	+ "<br/>"
//			 +"<html>";
//	linhas[] = ;
}
