package bibliotecas;

public class Biblio_Intro extends Biblioteca{ // Classe que armazena os vetores de texto a serem usados

 
	/*
	 * 
	 * Lista de acentos (evita que bugue ao mandar pro GitKraken)
	 * 
	 * \u00E7 ç
	 * 
	 * \u00E0 à  \u00E1 á  \u00E2 â \u00E3 ã \u00C1 Á
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

	// Textos para o pr\u00F3logo

	public void inicio() { // 0 op\u00E7\u00F5es
		tx = new String[23];
		linhas = new int[23];

		tx[0] = "<html>O dia amanheceu. Voc\u00EA acorda e se" + "<br/>levanta de sua cama e sai de seu"
				+ "<br/> quarto." + "</html>";
		linhas[0] = 2;

		tx[1] = "<html>M\u00E3e:" + "<br/><br/> Bom dia meu bem! Achei que"
				+ "<br/>n\u00E3o ia mais levantar hoje. J\u00E1 passou "
				+ "<br/>das sete da manh\u00E3. Venha logo tomar " + "<br/>caf\u00E9." + "</html>";
		linhas[1] = 5;

		tx[2] = "<html>Voc\u00EA come tranquilamente" + "<br/>enquanto observa sua pequena "
				+ "<br/>irm\u00E3 brincando com bonecas de  " + "<br/>pano no ch\u00E3o. O dia est\u00E1  "
				+ "<br/>agrad\u00E1vel." + "</html>";
		linhas[2] = 4;

		tx[3] = "<html>M\u00E3e:" + "<br/><br/>Hoje completa um ano da  " + "<br/>morte de seu pai. Vamos ao "
				+ "<br/>cemit\u00E9rio visit\u00E1-lo mais tarde." + "</html>";
		linhas[3] = 4;

		tx[4] = "<html>M\u00E3e:" + "<br/><br/>Ser\u00E1 que voc\u00EA poderia ir"
				+ "<br/>\u00E0 cidade comprar um incenso " + "<br/>para levarmos ao seu pai? Ele"
				+ "<br/>adorava us\u00E1-los em suas " + "<br/>medita\u00E7\u00F5es. Tenho certeza de"
				+ "<br/>que ele ir\u00E1 gostar." + "</html>";
		linhas[4] = 7;

		tx[5] = "<html>Voc\u00EA sai de casa rumo ao mercado da" + "<br/>cidade. Por morar em um local"
				+ "<br/>isolado, leva cerca de uma hora para" + "<br/>chegar ao local." + "</html>";
		linhas[5] = 3;

		tx[6] = "<html>Vendedor de incensos:" + "<br/><br/>Ol\u00E1, faz tempo que n\u00E3o"
				+ "<br/>te vejo. O que deseja levar dessa " + "<br/>vez? " + "</html>";
		linhas[6] = 4;

		tx[7] = "<html>Voc\u00EA explica que quer comprar" + "<br/>incensos para levar ao t\u00FAmulo de seu"
				+ "<br/>pai." + "</html>";
		linhas[7] = 2;

		tx[8] = "<html>Vendedor de incensos:" + "<br/><br/>Ah sim, seu pai. Sinto falta"
				+ "<br/>dele, era um bom homem. Morreu de" + "<br/>forma honrosa lutando contra seus."
				+ "<br/>inimigos." + "</html>";
		linhas[8] = 5;

		tx[9] = "<html>Vendedor de incensos:" + "<br/><br/>Aqueles malditos imperiais "
				+ "<br/>continuam querendo nossos " + "<br/>territ\u00F3rios. Tenho ouvido rumores de "
				+ "<br/>que eles planejam atacar nossa " + "<br/>cidade novamente em breve. Voc\u00EA"
				+ "<br/>deveria fugir daqui com sua fam\u00EDlia o " + "<br/>quanto antes." + "</html>";
		linhas[9] = 8;

		tx[10] = "<html>H\u00E1 alguns segundos de sil\u00EAncio. O" + "<br/>vendedor te entrega o incenso e tenta "
				+ "<br/>cortar a tens\u00E3o." + "</html>";
		linhas[10] = 2;

		tx[11] = "<html>Vendedor de incensos:" + "<br/><br/>Olha, acho que exagerei "
				+ "<br/>um pouco. N\u00E3o fique muito " + "<br/>preocupado com isso. Leve esse "
				+ "<br/>incenso por minha conta, \u00E9 meu " + "<br/>presente ao seu pai." + "</html>";
		linhas[11] = 6;

		tx[12] = "<html>Voc\u00EA agradece e sai da loja. Ainda \u00E9 "
				+ "<br/>manh\u00E3, h\u00E1 poucas nuvens no c\u00E9u e "
				+ "<br/>tudo indica que o dia ser\u00E1 calmo " + "<br/>como sempre." + "</html>";
		linhas[12] = 3;

		tx[13] = "<html>Ap\u00F3s uma longa caminhada voc\u00EA " + "<br/>come\u00E7a a se aproximar de casa. Algo "
				+ "<br/>n\u00E3o parece certo. H\u00E1 um forte cheiro " + "<br/>de queimado no ar e uma grande "
				+ "<br/>nuvem de fuma\u00E7a vinda da dire\u00E7\u00E3o da " + "<br/>casa." + "</html>";
		linhas[13] = 5;

		tx[14] = "<html>Ao chegar mais perto, voc\u00EA v\u00EA as " + "<br/>chamas consumirem tudo. A casa "
				+ "<br/>come\u00E7a a desabar e sua vis\u00E3o " + "<br/>come\u00E7a a ficar turva." + "</html>";
		linhas[14] = 3;

		tx[15] = "<html>Voc\u00EA escuta os gritos de sua m\u00E3e e o " + "<br/>choro de sua irm\u00E3, que s\u00E3o "
				+ "<br/>bruscamente interrompidos, seguidos" + "<br/>de uma risada s\u00E1dica." + "</html>";
		linhas[15] = 3;

		tx[16] = "<html>Tudo que se pode ver s\u00E3o vultos de " + "<br/>v\u00E1rios homens ao longe. Voc\u00EA perde "
				+ "<br/>toda a no\u00E7\u00E3o e cai de joelhos, " + "<br/>completamente paralisado." + "</html>";
		linhas[16] = 3;

		tx[17] = "<html>Algu\u00E9m te agarra pelas costas e " + "<br/>come\u00E7a a te arrastar" + "</html>";
		linhas[17] = 1;

		// Fim do sonho

		tx[18] = "<html>Voc\u00EA acorda lentamente, ainda  " + "<br/>abalado pelo pesadelo. Havia se"
				+ "<br/>passado apenas uma semana desde" + "<br/>o ocorrido. Voc\u00EA est\u00E1 na parte de tr\u00E1s"
				+ "<br/>de uma carro\u00E7a guiada pelo homem " + "<br/>que o salvou no momento da "
				+ "<br/>destrui\u00E7\u00E3o. Em todo esse tempo n\u00E3o "
				+ "<br/>houve nenhuma conversa al\u00E1m do " + "<br/>necess\u00E1rio entre voc\u00EAs." + "</html>";
		linhas[18] = 8;

		tx[19] = "<html>A carro\u00E7a para. Voc\u00EA escuta o homem " + "<br/>descendo e conversando algo com "
				+ "<br/>algu\u00E9m. Voc\u00EA desce da carro\u00E7a." + "</html>";
		linhas[19] = 2;

		tx[20] = "<html>Cocheiro:" + "<br/><br/>Essa \u00E9 a pessoa de quem eu "
				+ "<br/>falei. Sua fam\u00EDlia foi morta pelos " + "<br/>soldados imperiais e ele est\u00E1 "
				+ "<br/>desabrigado. Voc\u00EAs aceitam" + "<br/>refugiados n\u00E3o \u00E9? Pois ent\u00E3o, pode"
				+ "<br/>ficar." + "</html>";
		linhas[20] = 7;

		tx[21] = "<html>O homem volta para a carro\u00E7a sem te " + "<br/>falar mais uma palavra sequer e vai "
				+ "<br/>embora. O guarda com quem ele " + "<br/>conversava se dirige a voc\u00EA." + "</html>";
		linhas[21] = 3;

		tx[22] = "<html>Guarda: " + "<br/><br/>Ol\u00E1, voc\u00EA \u00E9 muito bem vindo "
				+ "<br/>em nossa cidade. Para entrar basta " + "<br/>preencher esse formul\u00E1rio." + "</html>";
		linhas[22] = 4;
	}

	public void inicio2() { // 2 op\u00E7\u00F5es
		tx = new String[4];
		linhas = new int[4];

		if (player.getSexo() == 0) {
			tx[0] = "<html>Guarda:" + "<br/><br/>Tudo certo, mas antes de voc\u00EA"
					+ "<br/>entrar, me permita lhe dar um" + "<br/>conselho: pense muito bem nas suas"
					+ "<br/>primeiras a\u00E7\u00F5es aqui na cidade de "
					+ "<br/>Helaria, pois elas definir\u00E3o como ser\u00E1 "
					+ "<br/>seu futuro aqui. Boa sorte garoto" + "</html>";
			linhas[0] = 8;
		} else {
			tx[0] = "<html>Guarda:" + "<br/><br/>Tudo certo, mas antes de voc\u00EA"
					+ "<br/>entrar, me permita lhe dar um" + "<br/>conselho: pense muito bem nas suas"
					+ "<br/>primeiras a\u00E7\u00F5es aqui na cidade de "
					+ "<br/>Helaria, pois elas definir\u00E3o como ser\u00E1 "
					+ "<br/>seu futuro aqui. Boa sorte garota" + "</html>";
			linhas[0] = 8;
		}

		tx[1] = "<html> Voc\u00EA entra na cidade e procura pelo" + "<br/> mercado,foi uma viagem longa e dif\u00EDcil"
				+ "<br/>e j\u00E1 tem alguns dias que voc\u00EA" + "<br/>precisa comer." + "<html>";
		linhas[1] = 3;

		tx[2] = "<html>Chegando ao mercado voc\u00EA v\u00EA uma " + "<br/>barraca com frutas frescas, bem "
				+ "<br/>diferente dos lixos ressecados que " + "<br/>voc\u00EA costumava comer em viagens" + "<html>";
		linhas[2] = 3;

		tx[3] = "<html>Voc\u00EA vai em dire\u00E7\u00E3o a uma barraca " + "<br/>quando, de repente, um homem "
				+ "<br/>esbarra em voc\u00EA, um incidente sem" + "<br/>import\u00E2ncia, mas quando voc\u00EA vai"
				+ "<br/>comprar sua t\u00E3o sonhada refei\u00E7\u00E3o "
				+ "<br/>percebe que est\u00E1 sem seu dinheiro" + "<html>";
		linhas[3] = 5;

		choice = "<html>O homem que esbarrou em voc\u00EA" + "<br/> ainda est\u00E1 \u00E0 vista, se voc\u00EA correr"
				+ "<br/> ainda conseguir\u00E1 alcan\u00E7\u00E3-lo." + "<br/> O que far\u00E1?" + "<html>";

		op1 = "Correr atr\u00E1s do Homem";
		op2 = "Deix\u00E1-lo ir embora";

	}

	public void inicio_correr() { // 2 op\u00E7\u00F5es

		tx = new String[1];
		linhas = new int[1];

		tx[0] = "<html>Voc\u00EA corre atr\u00E1s do bandido e pula "
				+ "<br/>em cima dele, voc\u00EA o est\u00E1 segurando, "
				+ "<br/>ele est\u00E1 em sua posse, a rua n\u00E3o est\u00E1  " + "<br/>totalmente movimentada e nem"
				+ "<br/>totalmente vazia. Duas pessoas se " + "<br/>destacam em meio as outras: um "
				+ "<br/>guarda e algu\u00EAm que se esconde " + "<br/>atr\u00E1s de um capuz. " + "<html>";
		linhas[0] = 8;

		choice = "<html>O que voc\u00EA far\u00E1?<html>";
		op1 = "Recuperar seu dinheiro e deix\u00E1-lo ir";
		op2 = "Recuperar seu dinheiro e mant\u00EA-lo preso";
	}

	public void inicio_artemis() { // 0 op\u00E7\u00F5es

		tx = new String[8];
		linhas = new int[8];

		tx[0] = "<html>Voc\u00EA pega novamente seus pertences " + "<br/>e libera o ladr\u00E3o, que corre em "
				+ "<br/>dire\u00E7\u00E3o a liberdade. O estranho " + "<br/>encapuzado se aproxima e come\u00E7a a"
				+ "<br/>conversar com voc\u00EA." + "<html>";
		linhas[0] = 4;

		tx[1] = "<html>Estranho de capuz: " + "<br/><br/>Interessante...  " + "<html>";
		linhas[1] = 2;

		tx[2] = "<html>Estranho de capuz: " + "<br/><br/>O seu ato, voc\u00EA perseguiu essa "
				+ "<br/>pessoa que te roubou, mostrando que " + "<br/>est\u00E1 determinado a lutar pelo seu"
				+ "<br/>direito." + "<html>";
		linhas[2] = 5;

		tx[3] = "<html>Estranho de capuz: " + "<br/><br/>E, quando o capturou, mostrou "
				+ "<br/>compaix\u00E3o com o ladr\u00E3o. J\u00E1 tinha " + "<br/>recuperado seus pertences, controlou "
				+ "<br/>a raiva que pulsava em seus olhos e o "
				+ "<br/>liberou. N\u00E3o \u00E9 algo que se veja todos " + "<br/>os dias." + "<html>";
		linhas[3] = 7;

		if (player.getSexo() == 0) {

			tx[4] = "<html>Estranho de capuz: " + "<br/><br/>Meu nome \u00E9 Artemisia, sou uma  "
					+ "<br/>arcana da Torre Anci\u00E3 E. Quanto ao " + "<br/>que eu quero, percebo em voc\u00EA tem "
					+ "<br/>um potencial raro, uma for\u00E7a de " + "<br/>vontade, determina\u00E7\u00E3o e  "
					+ "<br/>principalmente bondade e controle " + "<br/>para se tornar um arcano." + "<html>";
			linhas[4] = 8;

		} else {

			tx[4] = "<html>Estranho de capuz: " + "<br/><br/>Meu nome \u00E9 Artemisia, sou uma  "
					+ "<br/>arcana da Torre Anci\u00E3 E. Quanto ao " + "<br/>que eu quero, percebo em voc\u00EA tem "
					+ "<br/>um potencial raro, uma for\u00E7a de " + "<br/>vontade, determina\u00E7\u00E3o e  "
					+ "<br/>principalmente bondade e controle " + "<br/>para se tornar uma arcana." + "<html>";
			linhas[4] = 8;

		}

		tx[5] = "<html>Artemisia: " + "<br/><br/>Se voc\u00EA tiver interesse venha me  "
				+ "<br/>procurar na Torre Anci\u00E3 no norte da " + "<br/>cidade esta noite" + "<html>";
		linhas[5] = 5;

		tx[6] = "<html>Artemisia vai embora e te deixa " + "<br/>pensando em sua oferta. " + "<html>";
		linhas[6] = 1;

		tx[7] = "<html>O dia est\u00E1 caminhando para o seu " + "<br/>final e voc\u00EA tem que decidir para onde "
				+ "<br/>ir\u00E1 esta noite." + "<html>";
		linhas[7] = 2;

	}

	public void inicio_manterPreso() { // 2 op\u00E7\u00F5es

		tx = new String[3];
		linhas = new int[3];

		tx[0] = "<html>Voc\u00EA consegue recuperar seus " + "<br/>pertences, mas  o mant\u00E9m com a cara"
				+ "<br/>no ch\u00E3o. Ele v\u00EA seu olhar de relance e  "
				+ "<br/>come\u00E7a a pedir por miseric\u00F3rdia" + "<html>";
		linhas[0] = 3;

		tx[1] = "<html>Ladr\u00E3o:" + "<br/><br/>Por favor, voc\u00EA n\u00E3o precisa fazer isso, "
				+ "<br/>sou s\u00F3 uma pessoa comum. Sei que" + "<br/>cometi erros, mas eu tenho uma "
				+ "<br/>fam\u00EDlia que precisa de mim." + "<html>";
		linhas[1] = 5;

		tx[2] = "<html>Ladr\u00E3o:" + "<br/><br/>Somos p\u00E1rias, n\u00E3o existe dignidade"
				+ "<br/>em nossas vidas, para sobreviver" + "<br/>fa\u00E7o tudo que est\u00E1 ao meu alcance, "
				+ "<br/>mesmo que para isso eu tenha at\u00E9 " + "<br/>que roubar de pessoas que, como eu,"
				+ "<br/>nada possuem." + "<html>";
		linhas[2] = 7;

		choice = "<html>Ap\u00F3s escutar essas palavras cabe a " + "<br/>voc\u00EA decidir destino do homem que te "
				+ "<br/>assaltou" + "<html>";

		op1 = "Liber\u00E1-lo";
		op2 = "Mat\u00E1-lo";

	}

	public void inicio_ladino() { // 0 op\u00E7\u00F5es

		tx = new String[7];
		linhas = new int[7];

		if (player.getSexo() == 0) {
			tx[0] = "<html>Ladr\u00E3o:" + "<br/><br/>Muito obrigado senhor, voc\u00EA possui "
					+ "<br/>uma alma nobre e caridosa, o " + "<br/>que \u00E9 raro nesta cidade de "
					+ "<br/>hipocrisias. Nesta cidade s\u00E3o todos uns " + "<br/>hip\u00F3critas que adoram a um "
					+ "<br/>deus caridoso, mas cospem no " + "<br/>mendigo da rua. " + "<html>";
			linhas[0] = 8;
		} else {
			tx[0] = "<html>Ladr\u00E3o:" + "<br/><br/>Muito obrigado senhorita, voc\u00EA possui "
					+ "<br/>uma alma nobre e caridosa, o " + "<br/>que \u00E9 raro nesta cidade de "
					+ "<br/>hipocrisias. Nesta cidade s\u00E3o todos uns " + "<br/>hip\u00F3critas que adoram a um "
					+ "<br/>deus caridoso, mas cospem no " + "<br/>mendigo da rua. " + "<html>";
			linhas[0] = 8;
		}

		tx[1] = "<html>Ladr\u00E3o:" + "<br/><br/>S\u00E3o poucos os locais em que ainda se "
				+ "<br/>encontram valores como os seus. Na " + "<br/>verdade, eu s\u00F3 penso na Alameda "
				+ "<br/>dos Tr\u00EAs Ponteiros, um local da mais "
				+ "<br/>pura corrup\u00E7\u00E3o, onde \u00E9 revelado o " + "<br/>melhor e o pior das pessoas."
				+ "<html>";
		linhas[1] = 7;

		tx[2] = "<html>Ladr\u00E3o:" + "<br/><br/>Voc\u00EA deveria fazer uma visita l\u00E1. Ali "
				+ "<br/>\u00E9 poss\u00EDvel encontrar coisas al\u00E1m da sua" + "<br/>imagina\u00E7\u00E3o. "
				+ "<html>";
		linhas[2] = 4;

		if (player.getSexo() == 0) {
			tx[3] = "<html>Ladr\u00E3o:" + "<br/><br/>H\u00E1 muito n\u00E3o vejo algu\u00EAm t\u00E3o nobre "
					+ "<br/>quanto o senhor, mesmo depois de eu " + "<br/>ter te assaltado voc\u00EA me poupou, pelo "
					+ "<br/>jeito a mis\u00E9ria te revolta mais do que " + "<br/>um crime." + "<html>";
			linhas[3] = 6;
		} else {
			tx[3] = "<html>Ladr\u00E3o:" + "<br/><br/>A muito n\u00E3o vejo algu\u00EAm t\u00E3o nobre "
					+ "<br/>quanto a senhorita, mesmo depois de eu "
					+ "<br/>ter te assaltado voc\u00EA me poupou, pelo "
					+ "<br/>jeito a mis\u00E9ria te revolta mais do que " + "<br/>um crime." + "<html>";
			linhas[3] = 6;
		}

		tx[4] = "<html>Cassius: " + "<br/><br/>Meu nome \u00E9 Cassius e, se eu estiver "
				+ "<br/>certo, me preste uma visita na " + "<br/>Alameda dos Tr\u00EAs Ponteiros."
				+ "<br/>L\u00E1 voc\u00EA poder\u00E1 usar " + "<br/>suas habilidades para ajudar a acabar"
				+ "<br/>com as injusti\u00E7as que existem nessa " + "<br/>cidade." + "<html>";
		linhas[4] = 8;

		tx[5] = "<html>Ele vai embora e voc\u00EA v\u00EA o guarda" + "<br/>abandonar o local decepcionado. "
				+ "<html>";
		linhas[5] = 1;

		tx[6] = "<html>O dia est\u00E1 caminhando para o seu " + "<br/>final e voc\u00EA tem que decidir para onde "
				+ "<br/>ir\u00E1 esta noite." + "<html>";
		linhas[6] = 2;

	}

	public void inicio_guerreiro() { // 0 op\u00E7\u00F5es

		tx = new String[6];
		linhas = new int[6];

		tx[0] = "<html>Voc\u00EA ignora o que esse miser\u00E1vel te"
				+ "<br/>falou e come\u00E7a a bater sua cabe\u00E7a " + "<br/>contra o ch\u00E3o incessantemente, sem"
				+ "<br/>se importar com as pessoas perto ou" + "<br/>com o guarda que te observa. Voc\u00EA"
				+ "<br/>bate a cabe\u00E7a dele no ch\u00E3o at\u00E9 ele " + "<br/>desmaiar, e depois continua a "
				+ "<br/>espanca-lo" + "<html>";
		linhas[0] = 7;

		tx[1] = "<html>Ap\u00F3s alguns minutos, o guarda retira" + "<br/>sua espada e perfura o cr\u00E2nio do "
				+ "<br/>pobre diabo e vira-se para conversar" + "<br/>contigo. " + "<html>";
		linhas[1] = 3;

		if (player.getSexo() == 0) {
			tx[2] = "<html>Guarda:" + "<br/><br/>Um homem de fibra que est\u00E1 disposto"
					+ "<br/>a colocar esses miser\u00E1veis em seu" + "<br/>devido lugar." + "<html>";
			linhas[2] = 4;

			tx[3] = "<html>Guarda:" + "<br/><br/>A Guarda Real precisa de homens "
					+ "<br/>como o senhor. Apare\u00E7a esta noite " + "<br/>nos dom\u00EDnios do Castelo e procure "
					+ "<br/>pelo Capit\u00E3o Alexander do S\u00E9timo "
					+ "<br/>Comando, garanto que n\u00E3o ir\u00E1 se " + "<br/>arrepender." + "<html>";
			linhas[3] = 7;
		} else {
			tx[2] = "<html>Guarda:" + "<br/><br/>Uma mulher de fibra que est\u00E1 disposta"
					+ "<br/>a colocar esses miser\u00E1veis em seu" + "<br/>devido lugar." + "<html>";
			linhas[2] = 4;

			tx[3] = "<html>Guarda:" + "<br/><br/>A Guarda Real precisa de membros "
					+ "<br/>como a senhorita. Apare\u00EAa esta noite " + "<br/>nos dom\u00EDnios do Castelo e procure "
					+ "<br/>pelo Capit\u00E3o Alexander do S\u00E9timo "
					+ "<br/>Comando, garanto que n\u00E3o ir\u00E1 se " + "<br/>arrepender." + "<html>";
			linhas[3] = 7;
		}

		tx[4] = "<html>O guarda vai embora carregando o corpo " + "<br/>do homem morto enquanto assobia "
				+ "<br/>uma m\u00FAsica alegre." + "<html>";
		linhas[4] = 2;

		tx[5] = "<html>O dia est\u00E1 caminhando para o seu " + "<br/>final e voc\u00EA tem que decidir para onde "
				+ "<br/>ir\u00E1 esta noite." + "<html>";
		linhas[5] = 3;

	}

	public void inicio_naoCorrer() {// 3 op\u00E7\u00F5es

		tx = new String[3];
		linhas = new int[3];

		tx[0] = "<html> Voc\u00EA decide n\u00E3o ir atr\u00E1s de quem te "
				+ "<br/>assaltou e come\u00E7a a conversar com " + "<br/>as pessoas no Mercado, afinal voc\u00EA "
				+ "<br/>est\u00E1 com fome e est\u00E1 sem dinheiro, " + "<br/>precisa saber de possibilidades de "
				+ "<br/>conseguir uma renda." + "<html>";
		linhas[0] = 5;

		tx[1] = "<html>Nisso voc\u00EA ouve falar da Alameda dos " + "<br/>Tr\u00EAs Ponteiros, onde est\u00E3o "
				+ "<br/>concentrados os mais vis ladr\u00F5es e" + "<br/>assassinos da cidade, da Torre Anci\u00E3, "
				+ "<br/>onde se localizam os maiores " + "<br/>estudiosos das artes arcanas do "
				+ "<br/>mundo, e da Guarda Real, lar dos " + "<br/>guerreiros mais destemidos e ferozes"
				+ "<br/>que existem." + "<html>";
		linhas[1] = 8;

		tx[2] = "<html>O dia est\u00E1 caminhando para o seu " + "<br/>final e voc\u00EA tem que decidir para onde "
				+ "<br/>ir\u00E1 esta noite." + "<html>";
		linhas[2] = 3;

//		choice = "<html>Antes de decidir-se, tem a impress\u00E3o" + "<br/>de que tal escolha ter\u00E1 profunda"
//				+ "<br/>influ\u00EAncia em seu fururo" + "<html>";
//		op1 = "Alameda dos Tr\u00EAs Ponteiros";
//		op2 = "Torre Arcana";
//		op3 = "Alistar - se a Guarda Real";

	}

	// Intro Arcanista:

	public void intro_arcanista() { // 2 op\u00E7\u00F5es
		tx = new String[2];
		linhas = new int[2];

		tx[0] = "<html>Voc\u00EA se encaminha para a Torre" + "<br/>Arcana. Chegando, voc\u00EA v\u00EA uma "
				+ "<br/>enorme torre branca, com expans\u00F5es " + "<br/>laterais que parece estarem flutuando. "
				+ "<br/>Ela \u00E9 impressionante, uma torre como " + "<br/>nunca se v\u00EA outra na vida." + "<html>";
		linhas[0] = 5;

		tx[1] = "<html>Voc\u00EA se aproxima do port\u00E3o,que se " + "<br/>abre sozinho. A ala de entrada est\u00E1 "
				+ "<br/>totalmente vazia, na verdade, parece "
				+ "<br/>que a torre inteira est\u00E1 vazia, at\u00E9 que "
				+ "<br/>voc\u00EA escuta uma voz baixinha:  " + "<br/><br/>..." + player.getNome() + "..." + "<html>";
		linhas[1] = 6;

		choice = "O que voc\u00EA ira fazer?";
		op1 = "Seguir a voz";
		op2 = "Ignorar a voz";

	}

	public void seguir_voz() { // 3 op\u00E7\u00F5es

		tx = new String[2];
		linhas = new int[2];

		if (player.isBonus_inicio()) {
			tx[0] = "<html>Voc\u00EA acaba por encontrar Artemisia," + "<br/>por\u00E9m desta vez sem o capuz e com "
					+ "<br/>vestes mais parecidas com a de um " + "<br/>arcano." + "<html>";
			linhas[0] = 3;

			tx[1] = "<html>Artemisia:" + "<br/><br/>O que te trouxe aqui? Uma mulher "
					+ "<br/>desconhecida numa cidade estranha " + "<br/>te chama para um lugar no qual voc\u00EA"
					+ "<br/>nunca ouviu falar e voc\u00EA vem sem " + "<br/>hesitar, me pergunto se \u00E9 loucura ou "
					+ "<br/>burrisse..." + "<html>";
			linhas[1] = 7;
		} else {

			tx[0] = "<html>Voc\u00EA acaba por encontrar uma mulher" + "<br/>misteriosa com vestes de arcano."
					+ "<html>";
			linhas[0] = 1;

			tx[1] = "<html>Arcana:" + "<br/><br/>O que te trouxe aqui? Voc\u00EA entra sem "
					+ "<br/>convite na torre dos maiores arcanos " + "<br/>conhecidos, me pergunto se voc\u00EA \u00E9 "
					+ "<br/>nunca ouviu falar e voc\u00EA vem sem " + "<br/>hesitar, me pergunto se \u00E9 sinal de  "
					+ "<br/>loucura ou burrisse..." + "." + "<html>";
			linhas[1] = 7;
		}

		choice = "<html>Voc\u00EA a encara e responde:<html>";
		op1 = "Provavelmente burrice";
		op2 = "Um pouco de loucura nunca fez mal a ningu\u00EAm";
		op3 = "Sou apenas algu\u00EAm sem nada a perder";
	}

	public void ignorar_voz() {// 3 op\u00E7\u00F5es

		tx = new String[6];
		linhas = new int[6];

		tx[0] = "<html>Voc\u00EA come\u00E7a a andar pela torre " + "<br/>procurando algo que nem voc\u00EA sabe o"
				+ "<br/>que \u00E9. " + "<html>";
		linhas[0] = 2;

		tx[1] = "<html>De repente se depara com uma " + "<br/>pequena sala aparentemente vazia ou "
				+ "<br/>quase vazia, existe um pequeno pilar " + "<br/>com uma esp\u00E9cie de pedra em cima. "
				+ "<html>";
		linhas[1] = 3;

		tx[2] = "<html>Voc\u00EA n\u00E3o tinha notado antes, mas " + "<br/>duas vozes estavam te chamando e, "
				+ "<br/>uma delas, est\u00E1 vindo desta pedra. "
				+ "<br/>Voc\u00EA se aproxima, mas \u00E9 subitamente " + "<br/>repelido para fora da sala e ela "
				+ "<br/>desaparece." + "<html>";
		linhas[2] = 5;

		tx[3] = "<html> Sem notar voc\u00EA se encaminha na" + "<br/>dire\u00E7\u00E3o da outra voz, entretanto com"
				+ "<br/>o estranho acontecimento ainda em " + "<br/> mente." + "<html>";
		linhas[3] = 3;

		if (player.isBonus_inicio()) {
			tx[4] = "<html>Voc\u00EA acaba por encontrar Artemisia," + "<br/>por\u00E9m desta vez sem o capuz e com "
					+ "<br/>vestes mais parecidas com a de um " + "<br/>arcano" + "<html>";
			linhas[4] = 3;

			tx[5] = "<html>Artemisia:" + "<br/><br/>O que te trouxe aqui? Uma mulher "
					+ "<br/>desconhecida numa cidade estranha " + "<br/>te chama para um lugar no qual voc\u00EA"
					+ "<br/>nunca ouviu falar e voc\u00EA vem sem " + "<br/>hesitar, me pergunto se \u00E9 loucura ou "
					+ "<br/>burrisse..." + "<html>";
			linhas[5] = 7;
		} else {

			tx[4] = "<html>Voc\u00EA acaba por encontrar uma mulher" + "<br/>misteriosa com vestes de arcano."
					+ "<html>";
			linhas[4] = 1;

			tx[5] = "<html>Arcana:" + "<br/><br/>O que te trouxe aqui? Voc\u00EA entra sem "
					+ "<br/>convite na torre dos maiores arcanos " + "<br/>conhecidos, me pergunto se voc\u00EA \u00E9 "
					+ "<br/>nunca ouviu falar e voc\u00EA vem sem " + "<br/>hesitar, me pergunto se \u00E9 sinal de  "
					+ "<br/>loucura ou burrisse..." + "." + "<html>";
			linhas[5] = 7;
		}

		choice = "<html>Voc\u00EA a encara e responde:<html>";
		op1 = "Provavelmente burrice";
		op2 = "Um pouco de loucura nunca fez mal a ningu\u00EAm";
		op3 = "Sou apenas algu\u00EAm sem nada a perder";
	}

	public void resposta_arcana(int x) { // 0 op\u00E7\u00F5es

		tx = new String[5];
		linhas = new int[5];

		switch (x) {
		case 1:
			if (player.isBonus_inicio()) {
				tx[0] = "<html>Artemisia:" + "<br/><br/>Isso d\u00E1 para perceber s\u00F3 de olhar "
						+ "<br/>para voc\u00EA." + "<html>";
				linhas[0] = 3;
			} else {
				tx[0] = "<html>Arcana:" + "<br/><br/>Isso d\u00E1 para perceber s\u00F3 de olhar "
						+ "<br/>para voc\u00EA." + "<html>";
				linhas[0] = 3;
			}
			break;
		case 2:
			if (player.isBonus_inicio()) {
				tx[0] = "<html>Artemisia:" + "<br/><br/>Diga isso para as milhares de "
						+ "<br/>pessoas que est\u00E3o sofrendo com essa " + "<br/>guerra iniciada por homens loucos."
						+ "<html>";
				linhas[0] = 4;
			} else {
				tx[0] = "<html>Arcana:" + "<br/><br/>Diga isso para as milhares de "
						+ "<br/>pessoas que est\u00E3o sofrendo com essa " + "<br/>guerra iniciada por homens loucos."
						+ "<html>";
				linhas[0] = 4;
			}
			break;
		case 3:
			if (player.isBonus_inicio()) {
				tx[0] = "<html>Artemisia:" + "<br/><br/>Agora eu entendo..." + "<html>";
				linhas[0] = 3;
			} else {
				tx[0] = "<html>Arcana:" + "<br/><br/>Agora eu entendo..." + "<html>";
				linhas[0] = 3;
			}
			break;
		}
		if (player.isBonus_inicio()) {
			tx[1] = "<html>Artemisia:" + "<br/><br/>De qualquer forma, vejo que voc\u00EA tem "
					+ "<br/>o que \u00E9 preciso para atingir um poder"
					+ "<br/>maior, um poder que muitos cobi\u00E7am, " + "<br/>mas poucos conseguem." + "<html>";
			linhas[1] = 5;

			if (player.getSexo() == 0) {
				tx[2] = "<html>Artemisia:" + "<br/><br/>" + player.getNome() + ","
						+ "<br/>voc\u00EA acha que tem o que \u00E9 preciso "
						+ "<br/>para se juntar a ordem arcana? Est\u00E1 " + "<br/>disposto a renunciar muito do que a"
						+ "<br/>vida poderia te dar, tudo em nome de" + "<br/>um prop\u00F3sito maior?" + "<html>";
				linhas[2] = 7;
			} else {
				tx[2] = "<html>Artemisia:" + "<br/><br/>" + player.getNome() + ","
						+ "<br/>voc\u00EA acha que tem o que \u00E9 preciso "
						+ "<br/>para se juntar a ordem arcana? Est\u00E1 " + "<br/>disposta a renunciar muito do que a"
						+ "<br/>vida poderia te dar, tudo em nome de" + "<br/>um prop\u00F3sito maior?" + "<html>";
				linhas[2] = 7;
			}

			tx[3] = "<html>Algo mais forte que voc\u00EA te impele a"
					+ "<br/>aceitar, e voc\u00EA, mesmo em d\u00FAvida, " + "<br/>responde que sim." + "<html>";
			linhas[3] = 2;

			tx[3] = "<html>Algo mais forte que voc\u00EA te impele a" + "<br/>aceitar, e voc\u00EA, mesmo resoluta, "
					+ "<br/>responde que sim." + "<html>";
			linhas[3] = 2;

			tx[4] = "<html>Artemisia:" + "<br/><br/>Agora que isso est\u00E1 acertado,voc\u00EA"
					+ "<br/>precisa passar por um pequeno teste " + "<br/>para sabermos do que voc\u00EA \u00E9 capaz. "
					+ "<html>";
			linhas[4] = 4;
		} else {
			tx[1] = "<html>Arcana:" + "<br/><br/>De qualquer forma, vejo que voc\u00EA tem "
					+ "<br/>o que \u00E9 preciso para atingir um poder"
					+ "<br/>maior, um poder que muitos cobi\u00E7am, " + "<br/>mas poucos conseguem." + "<html>";
			linhas[1] = 5;

			if (player.getSexo() == 0) {
				tx[2] = "<html>Arcana:" + "<br/><br/>" + player.getNome() + ","
						+ "<br/>voc\u00EA acha que tem o que \u00E9 preciso "
						+ "<br/>para se juntar a ordem arcana? Est\u00E1 " + "<br/>disposto a renunciar muito do que a"
						+ "<br/>vida poderia te dar, tudo em nome de" + "<br/>um prop\u00F3sito maior?" + "<html>";
				linhas[2] = 7;

				tx[3] = "<html>Algo mais forte que voc\u00EA te impele a" + "<br/>aceitar, e voc\u00EA mesmo resoluto, "
						+ "<br/>responde que sim." + "<html>";
				linhas[3] = 2;
			} else {
				tx[2] = "<html>Arcana:" + "<br/><br/>" + player.getNome() + ","
						+ "<br/>voc\u00EA acha que tem o que \u00E9 preciso "
						+ "<br/>para se juntar a ordem arcana? Est\u00E1 " + "<br/>disposta a renunciar muito do que a"
						+ "<br/>vida poderia te dar, tudo em nome de" + "<br/>um prop\u00F3sito maior?" + "<html>";
				linhas[2] = 7;

				tx[3] = "<html>Algo mais forte que voc\u00EA te impele a"
						+ "<br/>aceitar, e voc\u00EA, mesmo resoluta, " + "<br/>responde que sim." + "<html>";
				linhas[3] = 2;
			}

			tx[4] = "<html>Arcana:" + "<br/><br/>Agora que isso est\u00E1 acertado,voc\u00EA"
					+ "<br/>precisa passar por um pequeno teste " + "<br/>para sabermos do que voc\u00EA \u00E9 capaz. "
					+ "<html>";
			linhas[4] = 4;
		}

	}

	// Intro Ladino:

	public void intro_ladino() { // 3 op\u00E7\u00F5es
		tx = new String[3];
		linhas = new int[3];

		tx[0] = "<html>Voc\u00EA vai para a Alameda dos Tr\u00EAs " + "<br/>Ponteiros. Um lugar sujo, abandonado "
				+ "<br/>pelos deuses (se \u00E9 que existe algum) " + "<br/>e pelo Estado." + "<html>";
		linhas[0] = 3;

		tx[1] = "<html>A corrup\u00E7\u00E3o humana corre por todo " + "<br/>local, nas ruas se v\u00EA prostitutas"
				+ "<br/>ladr\u00F5es, assassinos, agiotas, " + "<br/>traficantes, se v\u00EA a fome, a mis\u00E9ria, o "
				+ "<br/>sofrimento, a dor e o \u00F3dio, mas " + "<br/>tamb\u00E9m se v\u00EA o carinho, a luta, a "
				+ "<br/>esperan\u00E7a e o amor no cora\u00E7\u00E3o de " + "<br/>v\u00E1rias pessoas. " + "<html>";
		linhas[1] = 7;

		tx[2] = "<html>Voc\u00EA segue andando, sem rumo, at\u00E9 " + "<br/>que vv\u00EA uma taverna, chamada O Bom "
				+ "<br/>Tom, na qual voc\u00EA entra." + "<html>";
		linhas[2] = 2;

		choice = "<html>Voc\u00EA vai at\u00E9 o balc\u00E3o e o taverneiro pergunta "
				+ "<br/>o voc\u00EA que quer<html>";
		op1 = "Cerveja";
		op2 = "\u00C1gua";
		op3 = "Nada";
	}

	public void bebida_ladino(int x) { // 3 op\u00E7\u00F5es
		tx = new String[4];
		linhas = new int[4];

		switch (x) {
		case 1:
			tx[0] = "<html>Taverneiro: " + "<br/><br/>Cl\u00E1ssica cerveja rivesiana. Boa " + "<br/>pedida!"
					+ "<html>";
			linhas[0] = 3;
			break;
		case 2:
			if (player.getSexo() == 0) {
				tx[0] = "<html>Taverneiro: " + "<br/><br/>Voc\u00EA n\u00E3o \u00E9 velho demais para beber"
						+ "<br/>isso?" + "<html>";
				linhas[0] = 3;
			} else {
				tx[0] = "<html>Taverneiro: " + "<br/><br/>Voc\u00EA n\u00E3o \u00E9 velha demais para beber"
						+ "<br/>isso?" + "<html>";
				linhas[0] = 3;
			}
			break;
		case 3:
			tx[0] = "<html>Taverneiro: " + "<br/><br/>Em uma taverna sem uma bebida."
					+ "<br/>Vejo que voc\u00EA n\u00E3o \u00E9 do tipo divertido." + "<html>";
			linhas[0] = 3;
			break;
		}

		tx[1] = "<html>Voc\u00EA senta em uma mesa vazia e" + "<br/>come\u00E7a a observar as pessoas, "
				+ "<br/>segredos contados, transa\u00E7\u00F5es " + "<br/>realizadas, contratos fechados e,"
				+ "<br/>principalmente, capuzes escondendo o "
				+ "<br/>rosto. \u00C9 n\u00EDtido que as pessoas v\u00E3o"
				+ "<br/>para fazer tudo nesta taberna, menos "
				+ "<br/>comer e beber, isso \u00E9 s\u00F3 um b\u00F4nus." + "<html>";
		linhas[1] = 7;

		if (player.isBonus_inicio()) {
			tx[2] = "<html>Depois de alguns minutos sozinho " + "<br/>algu\u00EAm te aborda, voc\u00EA n\u00E3o o "
					+ "<br/>reconhece a princ\u00EDpio at\u00E9 que ele " + "<br/>come\u00E7a a falar." + "<html>";
			linhas[2] = 3;

			tx[3] = "<html>Cassiu:" + "<br/><br/>N\u00E3o somos t\u00E3o diferentes quanto "
					+ "<br/>parecemos. Eu sou p\u00E1ria desde que " + "<br/>nasci, sempre tive que lutar pela"
					+ "<br/>sobreviv\u00EAncia." + "<html>";
			linhas[3] = 5;

			if (player.getSexo() == 0) {
				tx[3] = "<html>Cassiu:" + "<br/><br/>Eu tamb\u00E9m vejo o sofrimento em seu"
						+ "<br/>rosto, vejo que tamb\u00E9m \u00E9 um lutador, "
						+ "<br/>e, suas fei\u00E7\u00F5es, n\u00E3o s\u00E3o daqui. Eu  "
						+ "<br/>ouvi sobre a guerra em Iriandra e  "
						+ "<br/>conhe\u00E7o uma ou duas pessoas de l\u00E1" + "<html>";
				linhas[3] = 6;
			} else {
				tx[3] = "<html>Cassiu:" + "<br/><br/>Eu tamb\u00E9m vejo o sofrimento em seu"
						+ "<br/>rosto, vejo que tamb\u00E9m \u00E9 uma lutadora, "
						+ "<br/>e, suas fei\u00E7\u00F5es, n\u00E3o s\u00E3o daqui. Eu  "
						+ "<br/>ouvi sobre a guerra em Iriandra e  "
						+ "<br/>conhe\u00E7o uma ou duas pessoas de l\u00E1" + "<html>";
				linhas[3] = 6;
			}
			choice = "<html>Cassiu:" + "<br/><br/>Voc\u00EA veio aqui fugindo dela n\u00E3o foi?";
		} else {
			tx[2] = "<html>Depois de alguns minutos sozinho  " + "<br/>algu\u00EAm que voc\u00EA n\u00E3o conhece te  "
					+ "<br/>aborda e come\u00E7a a falar " + "<html>";
			linhas[2] = 2;

			tx[3] = "<html>Estranho:" + "<br/><br/>N\u00E3o somos t\u00E3o diferentes quanto "
					+ "<br/>parecemos. Eu sou p\u00E1ria desde que " + "<br/>nasci, sempre tive que lutar pela"
					+ "<br/>sobreviv\u00EAncia." + "<html>";
			linhas[3] = 5;

			if (player.getSexo() == 0) {
				tx[3] = "<html>Estranho:" + "<br/><br/>Eu tamb\u00E9m vejo o sofrimento em seu"
						+ "<br/>rosto, vejo que tamb\u00E9m \u00E9 um lutador, "
						+ "<br/>e, suas fei\u00E7\u00F5es, n\u00E3o s\u00E3o daqui. Eu  "
						+ "<br/>ouvi sobre a guerra em Iriandra e  "
						+ "<br/>conhe\u00E7o uma ou duas pessoas de l\u00E1" + "<html>";
				linhas[3] = 6;
			} else {
				tx[3] = "<html>Estranho:" + "<br/><br/>Eu tamb\u00E9m vejo o sofrimento em seu"
						+ "<br/>rosto, vejo que tamb\u00E9m \u00E9 uma lutadora, "
						+ "<br/>e, suas fei\u00E7\u00F5es, n\u00E3o s\u00E3o daqui. Eu  "
						+ "<br/>ouvi sobre a guerra em Iriandra e  "
						+ "<br/>conhe\u00E7o uma ou duas pessoas de l\u00E1" + "<html>";
				linhas[3] = 6;
			}

			choice = "<html>Estranho:" + "<br/><br/>Voc\u00EA veio aqui fugindo dela n\u00E3o foi?";
		}
		op1 = "N\u00E3o te interessa";
		op2 = "Sim";
		op3 = "Nasci e cresci em Helaria";
	}

	public void resp_lad(int x) { // 2 op\u00E7\u00F5es

		tx = new String[1];
		linhas = new int[1];

		switch (x) {
		case 1:
			if (player.isBonus_inicio()) {
				tx[0] = "<html>Cassiu: " + "<br/><br/>Voc\u00EA pode at\u00E9 n\u00E3o querer dizer, mas  "
						+ "<br/>isso \u00E9 claro." + "<html>";
				linhas[0] = 3;
			} else {
				tx[0] = "<html>Estranho: " + "<br/><br/>Voc\u00EA pode at\u00E9 n\u00E3o querer dizer, mas  "
						+ "<br/>isso \u00E9 claro." + "<html>";
				linhas[0] = 3;
			}
			break;
		case 2:
			if (player.isBonus_inicio()) {
				if (player.getSexo() == 0) {
					tx[0] = "<html>Cassiu: " + "<br/><br/>A verdade pode ser dura, mas n\u00E3o  "
							+ "<br/>podemos fugir dela, eu te entendo e" + "<br/>respeito meu amigo" + "<html>";
					linhas[0] = 3;
				} else {
					tx[0] = "<html>Cassiu: " + "<br/><br/>A verdade pode ser dura, mas n\u00E3o  "
							+ "<br/>podemos fugir dela, eu te entendo e" + "<br/>respeito minha amiga" + "<html>";
					linhas[0] = 3;
				}
			} else {
				if (player.getSexo() == 0) {
					tx[0] = "<html>Estranho: " + "<br/><br/>A verdade pode ser dura, mas n\u00E3o  "
							+ "<br/>podemos fugir dela, eu te entendo e" + "<br/>respeito meu amigo" + "<html>";
					linhas[0] = 3;
				} else {
					tx[0] = "<html>Estranho: " + "<br/><br/>A verdade pode ser dura, mas n\u00E3o  "
							+ "<br/>podemos fugir dela, eu te entendo e" + "<br/>respeito minha amiga" + "<html>";
					linhas[0] = 3;
				}
			}
			break;
		case 3:
			if (player.isBonus_inicio()) {
				tx[0] = "<html>Cassiu: " + "<br/><br/>E eu sou o Rei do Norte! Hahahaha!"
						+ "<br/>N\u00E3o precisa mentir para mim. " + "<br/>Eu n\u00E3o sou um idiota." + "<html>";
				linhas[0] = 4;
			} else {
				tx[0] = "<html>Estranho: " + "<br/><br/>E eu sou o Rei do Norte! Hahahaha!"
						+ "<br/>N\u00E3o precisa mentir para mim. " + "<br/>Eu n\u00E3o sou um idiota." + "<html>";
				linhas[0] = 4;
			}
			break;
		}
		if (player.isBonus_inicio()) {
			if (player.getSexo() == 0) {
				choice = "<html>Cassiu:" + "<br/><br/>Bom, de qualquer forma, vamos agora "
						+ "<br/>ao que interessa. Est\u00E1 disposto a me ouvir?<html>";
			} else {
				choice = "<html>Cassiu:" + "<br/><br/>Bom, de qualquer forma, vamos agora "
						+ "<br/>ao que interessa. Est\u00E1 disposta a me ouvir?<html>";
			}
		} else {
			if (player.getSexo() == 0) {
				choice = "<html>Estranho:" + "<br/><br/>Bom, de qualquer forma, vamos agora "
						+ "<br/>ao que interessa. Est\u00E1 disposto a me ouvir?<html>";
			} else {
				choice = "<html>Estranho:" + "<br/><br/>Bom, de qualquer forma, vamos agora "
						+ "<br/>ao que interessa. Est\u00E1 disposta a me ouvir?<html>";
			}
		}

		op1 = "Eu n\u00E3o tenho nada mais a perder.";
		op2 = "L\u00F3gico, porque n\u00E3o?";

	}

	public void neg_lad(int x) { // 0 op\u00E7\u00F5es

		tx = new String[7];
		linhas = new int[7];

		switch (x) {
		case 1:
			if (player.isBonus_inicio()) {
				if (player.getSexo() == 0) {
					tx[0] = "<html>Cassiu: " + "<br/><br/>Eu estava certo sobre voc\u00EA. \u00E9 um  "
							+ "<br/>lutador, tem coragem e est\u00E1 pronto " + "<br/>para novos desafios" + "<html>";
					linhas[0] = 4;
				} else {
					tx[0] = "<html>Cassiu: " + "<br/><br/>Eu estava certo sobre voc\u00EA. \u00C9 uma  "
							+ "<br/>lutadora, tem coragem e est\u00E1 pronta " + "<br/>para novos desafios" + "<html>";
					linhas[0] = 4;
				}
			} else {
				if (player.getSexo() == 0) {
					tx[0] = "<html>Estranho: " + "<br/><br/>Eu estava certo sobre voc\u00EA. \u00C9 um  "
							+ "<br/>lutador, tem coragem e est\u00E1 pronto " + "<br/>para novos desafios" + "<html>";
					linhas[0] = 4;
				} else {
					tx[0] = "<html>Estranho: " + "<br/><br/>Eu estava certo sobre voc\u00EA. \u00C9 uma  "
							+ "<br/>lutadora, tem coragem e est\u00E1 pronta " + "<br/>para novos desafios" + "<html>";
					linhas[0] = 4;
				}
			}
			break;
		case 2:
			if (player.isBonus_inicio()) {
				tx[0] = "<html>Cassiu: " + "<br/><br/>Arrogante... Eu gosto disso. Nem   "
						+ "<br/>todos sabem apreciar como uma " + "<br/>virtude, mas eu, sem d\u00FAvida alguma, "
						+ "<br/>sei." + "<html>";
				linhas[0] = 5;
			} else {
				tx[0] = "<html>Estranho: " + "<br/><br/>Arrogante... Eu gosto disso. Nem   "
						+ "<br/>todos sabem apreciar como uma " + "<br/>virtude, mas eu, sem d\u00FAvida alguma, "
						+ "<br/>sei." + "<html>";
				linhas[0] = 5;
				break;
			}
		}

		if (player.isBonus_inicio()) {
			tx[1] = "<html>Cassiu: " + "<br/><br/>vamos para um lugar mais privado" + "<br/>para conversarmos em paz "
					+ "<html>";
			linhas[1] = 3;
		} else {
			tx[1] = "<html>Estranho: " + "<br/><br/>vamos para um lugar mais privado" + "<br/>para conversarmos em paz "
					+ "<html>";
			linhas[1] = 3;
		}

		tx[2] = "<html>Voc\u00EAs saem da taberna e v\u00E3o para " + "<br/>uma pequena casa escondida no "
				+ "<br/>meio da podrid\u00E3o do lugar. L\u00E1" + "<br/> v\u00EA que n\u00E3o est\u00E3o sozinhos, "
				+ "<br/>existem outras pessoas no lugar, sete" + "<br/>ao todo, mas nenhuma fala nada." + "<html>";
		linhas[2] = 5;

		if (player.isBonus_inicio()) {
			tx[3] = "<html>Cassiu: " + "<br/><br/>Nos somos a Guilda Vigilante."
					+ "<br/>Esta cidade est\u00E1 indo para o inferno e  "
					+ "<br/>n\u00F3s estamos tentando impedir isso. " + "<br/>Para isso nos valemos de diversos"
					+ "<br/>meios como assaltos, assassinatos e " + "<br/>extors\u00F5es entre outras coisas"
					+ "<html>";
			linhas[3] = 7;

			tx[4] = "<html>Cassiu: " + "<br/><br/>Nos te chamamos aqui por acharmos "
					+ "<br/>que  tem o que \u00E9 preciso para  " + "<br/>entrar nesta Guilda. Desde que   "
					+ "<br/>chegou na cidade estivemos te " + "<br/>observando. Ent\u00E3o, oque me diz?" + "<html>";
			linhas[4] = 6;

			tx[5] = "<html>Voc\u00EA ouve e sabe que tudo que foi dito "
					+ "<br/>\u00E9 verdade, e n\u00E3o hesita em aceitar " + "<br/>a oferta." + "<html>";
			linhas[5] = 2;

			if (player.getSexo() == 0) {
				tx[6] = "<html>Cassiu: " + "<br/><br/>Perfeito, mas antes temos que test\u00E1-lo" + "<html>";
				linhas[6] = 2;
			} else {
				tx[6] = "<html>Cassiu: " + "<br/><br/>Perfeito, mas antes temos que test\u00E1-la" + "<html>";
				linhas[6] = 2;
			}

		} else {
			tx[3] = "<html>Estranho: " + "<br/><br/>Nos somos a Guilda Vigilante."
					+ "<br/>Esta cidade est\u00E1 indo para o inferno e  "
					+ "<br/>n\u00F3s estamos tentando impedir isso. " + "<br/>Para isso nos valemos de diversos"
					+ "<br/>meios como assaltos, assassinatos e " + "<br/>extors\u00F5es entre outras coisas"
					+ "<html>";
			linhas[3] = 7;

			tx[4] = "<html>Estranho: " + "<br/><br/>Nos te chamamos aqui por acharmos "
					+ "<br/>que voc\u00EA tem o que \u00E9 preciso para  "
					+ "<br/>entrar nesta Guilda. Desde que voc\u00EA  " + "<br/>chegou na cidade estivemos te "
					+ "<br/>observando. Ent\u00E3o, oque me diz?" + "<html>";
			linhas[4] = 6;

			tx[5] = "<html>Voc\u00EA ouve e sabe que tudo que foi dito "
					+ "<br/>\u00E9 verdade, e n\u00E3o hesita em aceitar " + "<br/>a oferta." + "<html>";
			linhas[5] = 2;

			if (player.getSexo() == 0) {
				tx[6] = "<html>Estranho: " + "<br/><br/>Perfeito, mas antes temos que test\u00E1-lo" + "<html>";
				linhas[6] = 2;
			} else {
				tx[6] = "<html>Estranho: " + "<br/><br/>Perfeito, mas antes temos que test\u00E1-la" + "<html>";
				linhas[6] = 2;
			}
		}

	}

	// Intro Guerreiro

	public void intro_guerreiro() {// 2 op\u00E7\u00F5es

		tx = new String[2];
		linhas = new int[2];

		tx[0] = "<html>Voc\u00EA vai para o castelo. Um magn\u00EDfico "
				+ "<br/>edf\u00EDcio que, em todo seu esplendor, " + "<br/>se destaca da mis\u00E9ria da cidade."
				+ "<html>";
		linhas[0] = 2;

		tx[1] = "<html>Voc\u00EA nunca viu nada que ao menos" + "<br/>se comparasse com o Pal\u00E1cio Real, "
				+ "<br/>na verdade, \u00E9 improv\u00E2vel a exist\u00EAncia "
				+ "<br/>algo que possa se comparar com isso." + "<br/>No port\u00E3o, um guarda te para" + "<html>";
		linhas[1] = 4;

		choice = "<html>Guarda:" + "<br/><br/>O que voc\u00EA faz aqui?" + "<html>";
		op1 = "Contar sua hist\u00F3ria";
		op2 = "Interesses pessoais";
	}

	public void contar_hist() {// 0 op\u00E7\u00F5es

		tx = new String[6];
		linhas = new int[6];

		if (player.isBonus_inicio()) { // 0 op\u00E7\u00F5es

			tx[0] = "<html>Voc\u00EA conta como sobre tudo o que " + "<br/>aconteceu com voc\u00EA e que um "
					+ "<br/>soldado o havia convidado para se " + "<br/>apresentar ao capit\u00E3o Alexander."
					+ "<html>";
			linhas[0] = 3;

			if (player.getSexo() == 0) {
				tx[1] = "<html>Soldado:" + "<br/><br/>Me lembro de Erebor falando sobre"
						+ "<br/>um estranho vir ver o capit\u00E3o hoje.  "
						+ "<br/>Tudo certo pode entrar, \u00E9 s\u00F3 seguir "
						+ "<br/>reto e subir o primeiro lance de "
						+ "<br/>escadas que voc\u00EA ir\u00E1 encontr\u00E1 - lo" + "<html>";
				linhas[1] = 6;

				tx[2] = "<html>Voc\u00EA segue o caminho indicado, "
						+ "<br/>encontra a sala do capit\u00E3o. L\u00E1 dentro  "
						+ "<br/>voc\u00EA encontra uma pessoa id\u00EAntica ao  "
						+ "<br/>soldado que voc\u00EA conheceu mais " + "<br/>cedo." + "<html>";
				linhas[2] = 4;

				tx[3] = "<html>Capit\u00E3o Alexander:" + "<br/><br/>Suponho que voc\u00EA seja o garoto que "
						+ "<br/>meu irm\u00E3o Erebor encontrou mais"
						+ "<br/>cedo. N\u00E3o se preocupe, ele j\u00E1 me"
						+ "<br/>contou sua hist\u00F3ria.Ent\u00E3o voc\u00EA acha "
						+ "<br/>que tem o que \u00E9 preciso para entrar " + "<br/>na Guarda Real?" + "<html>";
				linhas[3] = 7;

				tx[4] = "<html>Voc\u00EA n\u00E3o tem  nenhuma d\u00FAvida ao " + "<br/>responder que sim. " + "<html>";
				linhas[4] = 1;

				tx[5] = "<html>Capit\u00E3o Alexander:" + "<br/><br/>Voc\u00EA tem vontade de entrar para a "
						+ "<br/>Guarda, mas agora n\u00F3s vamos ver se " + "<br/>voc\u00EA tem o que \u00E9 preciso."
						+ "<html>";
				linhas[5] = 4;

			} else {
				tx[1] = "<html>Soldado:" + "<br/><br/>Me lembro de Erebor falando sobre"
						+ "<br/>uma estranha vir ver o capit\u00E3o hoje.  "
						+ "<br/>Tudo certo pode entrar, \u00E9 s\u00F3 seguir "
						+ "<br/>reto e subir o primeiro lance de "
						+ "<br/>escadas que voc\u00EA ir\u00E1 encontr\u00E1 - lo" + "<html>";
				linhas[1] = 6;

				tx[2] = "<html>Voc\u00EA segue o caminho indicado, "
						+ "<br/>encontra a sala do capit\u00E3o. L\u00E1 dentro  "
						+ "<br/>voc\u00EA encontra uma pessoa id\u00EAntica ao  "
						+ "<br/>soldado que voc\u00EA conheceu mais " + "<br/>cedo." + "<html>";
				linhas[2] = 4;

				tx[3] = "<html>Capit\u00E3o Alexander:" + "<br/><br/>Suponho que voc\u00EA seja a garota que "
						+ "<br/>meu irm\u00E3o Erebor encontrou mais"
						+ "<br/>cedo. N\u00E3o se preocupe, ele j\u00E1 me"
						+ "<br/>contou sua hist\u00F3ria.Ent\u00E3o voc\u00EA acha "
						+ "<br/>que tem o que \u00E9 preciso para entrar " + "<br/>na Guarda Real?" + "<html>";
				linhas[3] = 7;

				tx[4] = "<html>Voc\u00EA n\u00E3o tem  nenhuma d\u00FAvida ao " + "<br/>responder que sim. " + "<html>";
				linhas[4] = 1;

				tx[5] = "<html>Capit\u00E3o Alexander:" + "<br/><br/>Voc\u00EA tem vontade de entrar para a "
						+ "<br/>Guarda, mas agora n\u00F3s vamos ver se " + "<br/>voc\u00EA tem o que \u00E9 preciso."
						+ "<html>";
				linhas[5] = 4;

			}
		} else {
			tx[0] = "<html>Voc\u00EA conta como sobre tudo o que " + "<br/>aconteceu com voc\u00EA e que voc\u00EA "
					+ "<br/>deseja se alistar a Guarda Real." + "<html>";
			linhas[0] = 2;

			if (player.getSexo() == 0) {
				tx[1] = "<html>Soldado:" + "<br/><br/>N\u00E3o sei por que a Guarda precisaria"
						+ "<br/>de um garoto como voc\u00EA, mas tudo "
						+ "<br/>bem.Pode entrar, \u00E9 s\u00F3 seguir reto e"
						+ "<br/>subir o primeiro lance de escadas que  "
						+ "<br/>voc\u00EA ir\u00E1 encontrar o capit\u00E3o." + "<html>";
				linhas[1] = 6;

				tx[2] = "<html>Voc\u00EA segue o caminho indicado, "
						+ "<br/>encontra a sala do capit\u00E3o. L\u00E1 dentro  "
						+ "<br/>voc\u00EA encontra uma pessoa que voc\u00EA  "
						+ "<br/>imagina ser o capit\u00E3o da Guarda." + "<html>";
				linhas[2] = 4;

				tx[3] = "<html>Capit\u00E3o:" + "<br/><br/>Vejo nos seus olhos que voc\u00EA deseja "
						+ "<br/>se alistar na Guarda Real, mas n\u00F3s s\u00F3"
						+ "<br/>aceitamos os mais fortes, ser\u00E1 que "
						+ "<br/>voc\u00EA tem o que \u00E9 necess\u00E1rio para  " + "<br/>entrar? " + "<html>";
				linhas[3] = 6;

				tx[4] = "<html>Voc\u00EA n\u00E3o tem  nenhuma d\u00FAvida ao " + "<br/>responder que sim. " + "<html>";
				linhas[4] = 1;

				tx[5] = "<html>Capit\u00E3o:" + "<br/><br/>Voc\u00EA tem vontade de entrar para a "
						+ "<br/>Guarda, mas agora n\u00F3s vamos ver se " + "<br/>voc\u00EA tem o que \u00E9 preciso."
						+ "<html>";
				linhas[5] = 4;

			} else {
				tx[1] = "<html>Soldado:" + "<br/><br/>N\u00E3o sei por que a Guarda precisaria"
						+ "<br/>de uma garota como voc\u00EA, mas tudo "
						+ "<br/>bem.Pode entrar, \u00E9 s\u00F3 seguir reto e"
						+ "<br/>subir o primeiro lance de escadas que  "
						+ "<br/>voc\u00EA ir\u00E1 encontrar o capit\u00E3o." + "<html>";
				linhas[1] = 6;

				tx[2] = "<html>Voc\u00EA segue o caminho indicado, "
						+ "<br/>encontra a sala do capit\u00E3o. L\u00E1 dentro  "
						+ "<br/>voc\u00EA encontra uma pessoa que voc\u00EA  "
						+ "<br/>imagina ser o capit\u00E3o da Guarda." + "<html>";
				linhas[2] = 4;

				tx[3] = "<html>Capit\u00E3o:" + "<br/><br/>Vejo nos seus olhos que voc\u00EA deseja "
						+ "<br/>se alistar na Guarda Real, mas n\u00F3s s\u00F3"
						+ "<br/>aceitamos os mais fortes, ser\u00E1 que "
						+ "<br/>voc\u00EA tem o que \u00E9 necess\u00E1rio para  " + "<br/>entrar? " + "<html>";
				linhas[3] = 6;

				tx[4] = "<html>Voc\u00EA n\u00E3o tem  nenhuma d\u00FAvida ao " + "<br/>responder que sim. " + "<html>";
				linhas[4] = 1;

				tx[5] = "<html>Capit\u00E3o:" + "<br/><br/>Voc\u00EA tem vontade de entrar para a "
						+ "<br/>Guarda, mas agora n\u00F3s vamos ver se " + "<br/>voc\u00EA tem o que \u00E9 preciso."
						+ "<html>";
				linhas[5] = 4;
			}

		}

	}

	public void naoEdaSuaConta() { // 3 op\u00E7\u00F5es

		tx = new String[2];
		linhas = new int[2];

		tx[0] = "<html>Soldado:" + "<br/><br/>Isso n\u00E3o \u00E9 problema meu." + "<br/>V\u00E1 embora daqui !"
				+ "<html>";
		linhas[0] = 3;

		tx[1] = "<html>Soldado:" + "<br/><br/>Voc\u00EA se afasta da vis\u00E3o dele e "
				+ "<br/>procura outra forma de entrar no " + "<br/>pal\u00E1cio. Voc\u00EA consegue entrar no "
				+ "<br/>castelo gra\u00E7as a uma falha no muro " + "<br/>que voc\u00EA consegue escalar, mas a"
				+ "<br/>guarda do lado de dentro \u00E9 grande. " + "<html>";
		linhas[1] = 7;

		choice = "<html>Existem tr\u00EAs caminhos poss\u00EDveis, " + "<br/>pelos jardins pelos est\u00E1bulos, "
				+ "<br/>anexados \u00E0 parte central ou por uma" + "<br/>porta aparentemente sem guardas.  "
				+ "<html>";

		op1 = "Jardins";
		op2 = "Est\u00E1bulos";
		op3 = "Porta";

	}

	public void jardins() { // 2 op\u00E7\u00F5es

		tx = new String[1];
		linhas = new int[1];

		tx[0] = "<html>O caminho pelos jardins est\u00E1 livre, " + "<br/>voc\u00EA consegue entrar no castelo. Mas"
				+ "<br/>voc\u00EA est\u00E1 perdido, n\u00E3o sabe onde \u00E9 a  " + "<br/>sala do capit\u00E3o."
				+ "<html>";
		linhas[0] = 3;

		choice = "<html>Dois soldados se aproximam <br/>lentamente<html>";
		op1 = "Falar com eles";
		op2 = "Se esconder";
	}

	public void estabulos() { // 2 op\u00E7\u00F5es

		tx = new String[1];
		linhas = new int[1];

		tx[0] = "<html>Os est\u00E1bulos est\u00E3o vazios quase  " + "<br/>totalmente vazios, exceto por um "
				+ "<br/>soldado b\u00EAbado desacordado." + "<html>";
		linhas[0] = 2;

		choice = "<html>Pegar as vestes dele pode ser uma " + " <br/>boa ideia para se camuflar, mas elas "
				+ " <br/>s\u00E3o grandes e pesadas. O que voc\u00EA" + "<html>";

		op1 = "Pegar vestes";
		op2 = "N\u00E3o pegar";
	}

	public void salaCap(int x) { // 0 op\u00E7\u00F5es

		tx = new String[8];
		linhas = new int[8];

		switch (x) {
		case 1:
			tx[0] = "<html>Eles est\u00E3o um pouco embriagados e " + "<br/>cansados, de bom grado lhe d\u00E3o a"
					+ "<br/>informa\u00E7\u00E3o e voc\u00EA pode prosseguir" + "<br/>para a sala do capit\u00E3o sem "
					+ "<br/>problemas." + "<html>";
			linhas[0] = 5;
			break;
		case 2:
			tx[0] = "<html>Eles v\u00E3o embora e voc\u00EA pode " + "<br/>prosseguir. Depois de muito se "
					+ "<br/>esconder voc\u00EA consegue chegar at\u00E9 a " + "<br/>sala do capit\u00E3o." + "<html>";
			linhas[0] = 3;
			break;
		case 3:
			tx[0] = "<html>Voc\u00EA coloca os trajes militares e entra "
					+ "<br/>no castelo. Camuflado, voc\u00EA n\u00E3o " + "<br/>enfrenta muitos problemas para "
					+ "<br/>encontrar a sala do capit\u00E3o.Chegando"
					+ "<br/>l\u00E1 voc\u00EA deixa a roupa e abre a porta." + "<html>";
			linhas[0] = 4;
			break;
		case 4:
			tx[0] = "<html>Voc\u00EA entra no castelo com suas " + "<br/>roupas de campon\u00EAs. N\u00E3o demora "
					+ "<br/>muito para encontrar soldados. Eles  "
					+ "<br/>v\u00E3o na sua dire\u00E7\u00E3o, voc\u00EA come\u00E7a a "
					+ "<br/>correr at\u00E9 que entra em uma sala. Por "
					+ "<br/>coincid\u00EAncia esta \u00E9 a sala do capit\u00E3o" + "<html>";
			linhas[0] = 5;
			break;

		case 5:
			tx[0] = "<html>O caminho pela porta est\u00E1 totalmente " + "<br/>vazio e cont\u00E9m um mapa com as "
					+ "<br/>principais salas do castelo, voc\u00EA " + "<br/>consegue chegar na sala do capit\u00E3o "
					+ "<br/>sem grandes problemas." + "<html>";
			linhas[0] = 4;
			break;
		}

		if (player.isBonus_inicio()) {

			tx[1] = "<html>O capit\u00E3o se assusta com a sua  " + "<br/>chegada  repentina, e desembainha a "
					+ "<br/>espada." + "<html>";
			linhas[1] = 2;

			tx[2] = "<html>Capit\u00E3o Alexander:" + "<br/><br/>Quem \u00E9 voc\u00EA?" + "<html>";
			linhas[2] = 2;

			tx[3] = "<html>Voc\u00EA se sente confuso porque ele \u00E9 "
					+ "<br/>id\u00EAntico ao guarda que encontrou  " + "<br/>mais cedo, mas conta a sua hist\u00F3ria"
					+ "<html>";
			linhas[3] = 2;

			tx[4] = "<html>Capit\u00E3o Alexander:" + "<br/><br/>Quem voc\u00EA encontrou mais cedo foi"
					+ "<br/>meu irm\u00E3o, Erebor. Ele me avisou que "
					+ "<br/>algu\u00E9m iria me ver hoje, s\u00F3 n\u00E3o "
					+ "<br/>esperava que fosse entrar de repente " + "<br/>e sem ser anunciado." + "<html>";
			linhas[4] = 6;
			if (player.getSexo() == 0) {
				tx[5] = "<html>Capit\u00E3o Alexander:" + "<br/><br/>N\u00E3o \u00E9 qualquer um que conseguiria "
						+ "<br/>invadir esse castelo. Entendo o  " + "<br/>porqu\u00EA de Erebor ter te mandado "
						+ "<br/>aqui. Diga meu jovem, voc\u00EA tem" + "<br/>interesse em entrar para a Guarda "
						+ "<br/>Real?" + "<html>";
				linhas[5] = 7;
			} else {
				tx[5] = "<html>Capit\u00E3o Alexander:" + "<br/><br/>N\u00E3o \u00E9 qualquer um que conseguiria "
						+ "<br/>invadir esse castelo. Entendo o  " + "<br/>porqu\u00EA de Erebor ter te mandado "
						+ "<br/>aqui. Diga minha jovem, voc\u00EA tem" + "<br/>interesse em entrar para a Guarda "
						+ "<br/>Real?" + "<html>";
				linhas[5] = 7;
			}

			tx[6] = "<html>Voc\u00EA nem pensa antes de responder " + "<br/>positivamente." + "<html>";
			linhas[6] = 1;

			tx[7] = "<html>Capit\u00E3o Alexander:" + "<br/><br/>Muito bem, mas antes vamos testar "
					+ "<br/>suas outras habilidades." + "<html>";
			linhas[7] = 3;
		} else {

			tx[1] = "<html>O capit\u00E3o se assusta com a sua  " + "<br/>chegada  repentina, e desembainha a "
					+ "<br/>espada." + "<html>";
			linhas[1] = 2;

			tx[2] = "<html>Capit\u00E3o:" + "<br/><br/>Quem \u00E9 voc\u00EA?" + "<html>";
			linhas[2] = 2;

			tx[3] = "<html>Voc\u00EA se sente assustado com a " + "<br/>presen\u00E7a do capit\u00E3o e se apressa em  "
					+ "<br/>contar sua hist\u00F3ria" + "<html>";
			linhas[3] = 2;

			tx[4] = "<html>Capit\u00E3o:" + "<br/><br/>Muita ousadia da sua parte invadir o"
					+ "<br/>castelo dessa maneira, eu n\u00E3o  " + "<br/>esperava ningu\u00E9m para se alistar  "
					+ "<br/>hoje. " + "<html>";
			linhas[4] = 5;

			if (player.getSexo() == 0) {
				tx[5] = "<html>Capit\u00E3o:" + "<br/><br/>Mas, n\u00E3o \u00E9 qualquer um que "
						+ "<br/>conseguiria invadir esse castelo.   " + "<br/>Ent\u00E3o, diga meu jovem, voc\u00EA  "
						+ "<br/>realmente tem interesse em entrar " + "<br/>para a Guarda Real?" + "<html>";
				linhas[5] = 6;
			} else {
				tx[5] = "<html>Capit\u00E3o:" + "<br/><br/>Mas, n\u00E3o \u00E9 qualquer um que "
						+ "<br/>conseguiria invadir esse castelo.   " + "<br/>Ent\u00E3o, diga minha jovem, voc\u00EA  "
						+ "<br/>realmente tem interesse em entrar " + "<br/>para a Guarda Real?" + "<html>";
				linhas[5] = 6;
			}

			tx[6] = "<html>Voc\u00EA nem pensa antes de responder " + "<br/>positivamente." + "<html>";
			linhas[6] = 1;

			tx[7] = "<html>Capit\u00E3o:" + "<br/><br/>Muito bem, mas antes vamos testar "
					+ "<br/>suas outras habilidades." + "<html>";
			linhas[7] = 3;
		}

	}

//	  tx[] = "<html>"
//		 + "<br/>"
//		 + "<br/>" 
//		 + "<br/>"
//		 +"<html>";
//  linhas[] = ;

	// Fim dos textos do Pr\u00F3logo
}
