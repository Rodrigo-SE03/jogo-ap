package bibliotecas;

public class Biblio_Intro extends Biblioteca { // Classe que armazena os vetores de texto a serem usados

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
	public void inicio() {
		tx = new String[23];

		tx[0] = "O dia amanheceu. Voc\u00EA acorda, se levanta de sua cama e sai de seu  quarto.";

		tx[1] = "M\u00E3e:\n\n Bom dia meu bem! Achei que n\u00E3o ia mais levantar hoje. J\u00E1 passou "
				+ " das sete da manh\u00E3. Venha logo tomar  caf\u00E9.";

		tx[2] = "Voc\u00EA come tranquilamente enquanto observa sua pequena "
				+ " irm\u00E3 brincando com bonecas de   pano no ch\u00E3o. O dia est\u00E1  " + " agrad\u00E1vel.";

		tx[3] = "M\u00E3e:\n\nHoje completa um ano da   morte de seu pai. Vamos ao "
				+ " cemit\u00E9rio visit\u00E1-lo mais tarde.";

		tx[4] = "M\u00E3e:\n\nSer\u00E1 que voc\u00EA poderia ir \u00E0 cidade comprar um incenso "
				+ " para levarmos ao seu pai? Ele adorava us\u00E1-los em suas "
				+ " medita\u00E7\u00F5es. Tenho certeza de que ele ir\u00E1 gostar.";

		tx[5] = "Voc\u00EA sai de casa rumo ao mercado da cidade. Por morar em um local"
				+ " isolado, leva cerca de uma hora para chegar ao local.";

		tx[6] = "Vendedor de incensos:\n\nOl\u00E1, faz tempo que n\u00E3o"
				+ " te vejo. O que deseja levar dessa  vez? ";

		tx[7] = "Voc\u00EA explica que quer comprar incensos para levar ao t\u00FAmulo de seu pai.";

		tx[8] = "Vendedor de incensos:\n\nAh sim, seu pai. Sinto falta dele, era um bom homem. Morreu de"
				+ " forma honrosa lutando contra seus. inimigos.";

		tx[9] = "Vendedor de incensos:\n\nAqueles malditos imperiais  continuam querendo nossos "
				+ " territ\u00F3rios. Tenho ouvido rumores de  que eles planejam atacar nossa "
				+ " cidade novamente em breve. Voc\u00EA deveria fugir daqui com sua fam\u00EDlia o "
				+ " quanto antes.";

		tx[10] = "H\u00E1 alguns segundos de sil\u00EAncio. O vendedor te entrega o incenso e tenta "
				+ " cortar a tens\u00E3o.";

		tx[11] = "Vendedor de incensos:\n\nOlha, acho que exagerei  um pouco. N\u00E3o fique muito "
				+ " preocupado com isso. Leve esse  incenso por minha conta, \u00E9 meu  presente ao seu pai.";

		tx[12] = "Voc\u00EA agradece e sai da loja. Ainda \u00E9 "
				+ " manh\u00E3, h\u00E1 poucas nuvens no c\u00E9u e  tudo indica que o dia ser\u00E1 calmo "
				+ " como sempre.";

		tx[13] = "Ap\u00F3s uma longa caminhada voc\u00EA  come\u00E7a a se aproximar de casa. Algo "
				+ " n\u00E3o parece certo. H\u00E1 um forte cheiro  de queimado no ar e uma grande "
				+ " nuvem de fuma\u00E7a vinda da dire\u00E7\u00E3o da  casa.";

		tx[14] = "Ao chegar mais perto, voc\u00EA v\u00EA as  chamas consumirem tudo. A casa "
				+ " come\u00E7a a desabar e sua vis\u00E3o  come\u00E7a a ficar turva.";

		tx[15] = "Voc\u00EA escuta os gritos de sua m\u00E3e e o  choro de sua irm\u00E3, que s\u00E3o "
				+ " bruscamente interrompidos, seguidos de uma risada s\u00E1dica.";

		tx[16] = "Tudo que se pode ver s\u00E3o vultos de  v\u00E1rios homens ao longe. Voc\u00EA perde "
				+ " toda a no\u00E7\u00E3o e cai de joelhos,  completamente paralisado.";

		tx[17] = "Algu\u00E9m te agarra pelas costas e  come\u00E7a a te arrastar.";

		// Fim do sonho

		tx[18] = "Voc\u00EA acorda lentamente, ainda   abalado pelo pesadelo. Havia se"
				+ " passado apenas uma semana desde o ocorrido. Voc\u00EA est\u00E1 na parte de tr\u00E1s"
				+ " de uma carro\u00E7a guiada pelo homem  que o salvou no momento da "
				+ " destrui\u00E7\u00E3o. Em todo esse tempo n\u00E3o  houve nenhuma conversa al\u00EAm do "
				+ " necess\u00E1rio entre voc\u00EAs.";

		tx[19] = "A carro\u00E7a para. Voc\u00EA escuta o homem  descendo e conversando algo com "
				+ " algu\u00E9m. Voc\u00EA desce da carro\u00E7a.";

		tx[20] = "Cocheiro:\n\nEssa \u00E9 a pessoa de quem eu  falei. Sua fam\u00EDlia foi morta pelos "
				+ " soldados imperiais. Voc\u00EAs aceitam"
				+ " refugiados n\u00E3o \u00E9? Pois ent\u00E3o, pode ficar.";

		tx[21] = "O homem volta para a carro\u00E7a sem te  falar mais uma palavra sequer e vai "
				+ " embora. O guarda com quem ele  conversava se dirige a voc\u00EA.";

		tx[22] = "Guarda: \n\nOl\u00E1, nossa cidade está aberta para receber qualquer pessoa.  "
				+ "Para entrar basta  preencher esse formul\u00E1rio.";
	}

	public void inicio2() {
		tx = new String[4];

		if (player.getSexo() == 0) {

			tx[0] = "Guarda:\n\nTudo certo, mas antes de voc\u00EA entrar, me permita lhe dar um"
					+ " conselho: pense muito bem nas suas primeiras a\u00E7\u00F5es aqui na cidade de "
					+ " Helaria, pois elas definir\u00E3o como ser\u00E1  seu futuro aqui. Boa sorte garoto!";

		} else {
			tx[0] = "Guarda:\n\nTudo certo, mas antes de voc\u00EA entrar, me permita lhe dar um"
					+ " conselho: pense muito bem nas suas primeiras a\u00E7\u00F5es aqui na cidade de "
					+ " Helaria, pois elas definir\u00E3o como ser\u00E1  seu futuro aqui. Boa sorte garota!";
		}

		tx[1] = "Voc\u00EA entra na cidade e procura pelo  mercado,foi uma viagem longa e dif\u00EDcil"
				+ " e j\u00E1 tem alguns dias que voc\u00EA precisa comer. ";

		tx[2] = "Chegando ao mercado voc\u00EA v\u00EA uma  barraca com frutas frescas, bem "
				+ " diferente dos lixos ressecados que  voc\u00EA costumava comer em viagens. ";

		tx[3] = "Voc\u00EA vai em dire\u00E7\u00E3o a uma barraca  quando, de repente, um homem "
				+ " esbarra em voc\u00EA, um incidente sem import\u00E2ncia, mas quando voc\u00EA vai"
				+ " comprar sua t\u00E3o sonhada refei\u00E7\u00E3o  percebe que est\u00E1 sem seu dinheiro ";

		choice = "O homem que esbarrou em voc\u00EA  ainda est\u00E1 \u00E0 vista, se voc\u00EA correr"
				+ "  ainda conseguir\u00E1 alcan\u00E7\u00E3-lo.  O que far\u00E1? ";

		op1 = "Correr atr\u00E1s do Homem";
		op2 = "Deix\u00E1-lo ir embora";

	}

	public void inicio_correr() {

		tx = new String[1];

		tx[0] = "Voc\u00EA corre atr\u00E1s do bandido e pula  em cima dele, voc\u00EA o est\u00E1 segurando, "
				+ " ele est\u00E1 em sua posse, a rua n\u00E3o est\u00E1   totalmente movimentada e nem"
				+ " totalmente vazia. Duas pessoas se  destacam em meio as outras: um "
				+ " guarda e algu\u00EAm que se esconde  atr\u00E1s de um capuz.  ";

		choice = "O que voc\u00EA far\u00E1? ";
		op1 = "Recuperar seu dinheiro e deix\u00E1-lo ir";
		op2 = "Recuperar seu dinheiro e mant\u00EA-lo preso";

	}

	public void inicio_artemis() {

		tx = new String[8];

		if (player.getSexo() == 0) {

			tx[4] = "Estranho de capuz: \n\nMeu nome \u00E9 Artemisia, sou uma  "
					+ " arcana da Torre Anci\u00E3 .E, quanto ao  que eu quero, percebo em voc\u00EA tem "
					+ " um potencial raro, uma for\u00E7a de  vontade, determina\u00E7\u00E3o e  "
					+ " principalmente bondade e controle  para se tornar um arcano. ";

		} else {

			tx[4] = "Estranho de capuz: \n\nMeu nome \u00E9 Artemisia, sou uma  "
					+ " arcana da Torre Anci\u00E3 .E, quanto ao  que eu quero, percebo em voc\u00EA tem "
					+ " um potencial raro, uma for\u00E7a de  vontade, determina\u00E7\u00E3o e  "
					+ " principalmente bondade e controle  para se tornar uma arcana. ";

		}

		tx[0] = "Voc\u00EA pega novamente seus pertences  e libera o ladr\u00E3o, que corre em "
				+ " dire\u00E7\u00E3o a liberdade. O estranho  encapuzado se aproxima e come\u00E7a a"
				+ " conversar com voc\u00EA. ";

		tx[1] = "Estranho de capuz: \n\nInteressante...   ";

		tx[2] = "Estranho de capuz: \n\nO seu ato, voc\u00EA perseguiu essa "
				+ " pessoa que te roubou, mostrando que  est\u00E1 determinado a lutar pelo seu direito.";

		tx[3] = "Estranho de capuz: \n\nE, quando o capturou, mostrou "
				+ " compaix\u00E3o com o ladr\u00E3o. J\u00E1 tinha  recuperado seus pertences, controlou "
				+ " a raiva que pulsava em seus olhos e o  liberou. N\u00E3o \u00E9 algo que se v\u00E9 todos "
				+ " os dias. ";

		tx[5] = "Artemisia: \n\nSe voc\u00EA tiver interesse venha me  "
				+ " procurar na Torre Anci\u00E3 no norte da  cidade esta noite ";

		tx[6] = "Artemisia vai embora e te deixa  pensando em sua oferta.  ";

		tx[7] = "O dia est\u00E1 caminhando para o seu  final e voc\u00EA tem que decidir para onde "
				+ " ir\u00E1 esta noite. ";
	}

	public void inicio_manterPreso() {

		tx = new String[3];

		tx[0] = "Voc\u00EA consegue recuperar seus  pertences, mas  o mant\u00E9m com a cara"
				+ " no ch\u00E3o. Ele v\u00EA seu olhar de relance e   come\u00E7a a pedir por miseric\u00F3rdia";

		tx[1] = "Ladr\u00E3o:\n\nPor favor, voc\u00EA n\u00E3o precisa fazer isso, "
				+ " sou s\u00F3 uma pessoa comum. Sei que cometi erros, mas eu tenho uma "
				+ " fam\u00EDlia que precisa de mim. ";

		tx[2] = "Ladr\u00E3o:\n\nSomos p\u00E1rias, n\u00E3o existe dignidade"
				+ " em nossas vidas, para sobreviver fa\u00E7o tudo que est\u00E1 ao meu alcance, "
				+ " mesmo que para isso eu tenha at\u00E9  que roubar de pessoas que, como eu, nada possuem.";

		choice = "Ap\u00F3s escutar essas palavras cabe a  voc\u00EA decidir destino do homem que te " + " assaltou ";

		op1 = "Liber\u00E1-lo";
		op2 = "Mat\u00E1-lo";

	}

	public void inicio_ladino() {

		tx = new String[7];

		if (player.getSexo() == 0) {

			tx[0] = "Ladr\u00E3o:\n\nMuito obrigado senhor, voc\u00EA possui  uma alma nobre e caridosa, o "
					+ " que \u00E9 raro nesta cidade de  hipocrisias. Nesta cidade s\u00E3o todos uns "
					+ " hip\u00F3critas que adoram a um  deus caridoso, mas cospem no  mendigo da rua. ";

			tx[3] = "Ladr\u00E3o:\n\nH\u00E1 muito n\u00E3o vejo algu\u00EAm t\u00E3o nobre "
					+ " quanto o senhor, mesmo depois de eu  ter te assaltado voc\u00EA me poupou, pelo "
					+ " jeito a mis\u00E9ria te revolta mais do que  um crime. ";
		} else {

			tx[0] = "Ladr\u00E3o:\n\nMuito obrigado senhorita, voc\u00EA possui "
					+ " uma alma nobre e caridosa, o  que \u00E9 raro nesta cidade de "
					+ " hipocrisias. Nesta cidade s\u00E3o todos uns  hip\u00F3critas que adoram a um "
					+ " deus caridoso, mas cospem no  mendigo da rua.  ";

			tx[3] = "Ladr\u00E3o:\n\nA muito n\u00E3o vejo algu\u00EAm t\u00E3o nobre "
					+ " quanto a senhorita, mesmo depois de eu  ter te assaltado voc\u00EA me poupou, pelo "
					+ " jeito a mis\u00E9ria te revolta mais do que  um crime. ";
		}

		tx[1] = "Ladr\u00E3o:\n\nS\u00E3o poucos os locais em que ainda se "
				+ " encontram valores como os seus. Na  verdade, eu s\u00F3 penso na Alameda "
				+ " dos Tr\u00EAs Ponteiros, um local da mais  pura corrup\u00E7\u00E3o, onde \u00E9 revelado o "
				+ " melhor e o pior das pessoas. ";

		tx[2] = "Ladr\u00E3o:\n\nVoc\u00EA deveria fazer uma visita l\u00E1. Ali "
				+ " \u00E9 poss\u00EDvel encontrar coisas al\u00E1m da sua imagina\u00E7\u00E3o.  ";

		tx[4] = "Cassius: \n\nMeu nome \u00E9 Cassius e, se eu estiver  certo, me preste uma visita na "
				+ " Alameda dos Tr\u00EAs Ponteiros. L\u00E1 voc\u00EA poder\u00E1 usar "
				+ " suas habilidades para ajudar a acabar com as injusti\u00E7as que existem nessa  cidade.";

		tx[5] = "Ele vai embora e voc\u00EA v\u00EA o guarda abandonar o local decepcionado.  ";

		tx[6] = "O dia est\u00E1 caminhando para o seu  final e voc\u00EA tem que decidir para onde "
				+ " ir\u00E1 esta noite. ";
	}

	public void inicio_guerreiro() {

		tx = new String[6];

		if (player.getSexo() == 0) {

			tx[2] = "Guarda:\n\nUm homem de fibra que est\u00E1 disposto"
					+ " a colocar esses miser\u00E1veis em seu devido lugar. ";

			tx[3] = "Guarda:\n\nA Guarda Real precisa de homens  como o senhor. Apare\u00E7a esta noite "
					+ " nos dom\u00EDnios do Castelo e procure  pelo Capit\u00E3o Alexander do S\u00E9timo "
					+ " Comando, garanto que n\u00E3o ir\u00E1 se  arrepender. ";

		} else {

			tx[2] = "Guarda:\n\nUma mulher de fibra que est\u00E1 disposta"
					+ " a colocar esses miser\u00E1veis em seu devido lugar. ";

			tx[3] = "Guarda:\n\nA Guarda Real precisa de membros  como a senhorita. Apare\u00EAa esta noite "
					+ " nos dom\u00EDnios do Castelo e procure  pelo Capit\u00E3o Alexander do S\u00E9timo "
					+ " Comando, garanto que n\u00E3o ir\u00E1 se  arrepender. ";

		}

		tx[0] = "Voc\u00EA ignora o que esse miser\u00E1vel te falou e come\u00E7a a bater sua cabe\u00E7a "
				+ " contra o ch\u00E3o incessantemente, sem se importar com as pessoas perto ou"
				+ " com o guarda que te observa. Voc\u00EA bate a cabe\u00E7a dele no ch\u00E3o at\u00E9 ele "
				+ " desmaiar, e depois continua a  espanca-lo ";

		tx[1] = "Ap\u00F3s alguns minutos, o guarda retira sua espada e perfura o cr\u00E2nio do "
				+ " pobre diabo e vira-se para conversar contigo.  ";

		tx[4] = "O guarda vai embora carregando o corpo  do homem morto enquanto assobia "
				+ " uma m\u00FAsica alegre. ";

		tx[5] = "O dia est\u00E1 caminhando para o seu  final e voc\u00EA tem que decidir para onde "
				+ " ir\u00E1 esta noite. ";
	}

	public void inicio_naoCorrer() {

		tx = new String[3];

		tx[0] = "Voc\u00EA decide n\u00E3o ir atr\u00E1s de quem te  assaltou e come\u00E7a a conversar com "
				+ " as pessoas no Mercado, afinal voc\u00EA  est\u00E1 com fome e est\u00E1 sem dinheiro, "
				+ " precisa saber de possibilidades de  conseguir uma renda. ";

		tx[1] = "Nisso voc\u00EA ouve falar da Alameda dos  Tr\u00EAs Ponteiros, onde est\u00E3o "
				+ " concentrados os mais vis ladr\u00F5es e assassinos da cidade, da Torre Anci\u00E3, "
				+ " onde se localizam os maiores  estudiosos das artes arcanas do "
				+ " mundo, e da Guarda Real, lar dos  guerreiros mais destemidos e ferozes que existem.";

		tx[2] = "O dia est\u00E1 caminhando para o seu  final e voc\u00EA tem que decidir para onde "
				+ " ir\u00E1 esta noite. ";

	}

	// Intro Arcanista:

	public void intro_arcanista() {

		tx = new String[2];

		tx[0] = "Voc\u00EA se encaminha para a Torre Arcana. Chegando, voc\u00EA v\u00EA uma "
				+ " enorme torre branca, com expans\u00F5es  laterais que parece estarem flutuando. "
				+ " Ela \u00E9 impressionante, uma torre como  nunca se viu outra na vida. ";

		tx[1] = "Voc\u00EA se aproxima do port\u00E3o,que se  abre sozinho. A ala de entrada est\u00E1 "
				+ " totalmente vazia, na verdade, parece  que a torre inteira est\u00E1 vazia, at\u00E9 que "
				+ " voc\u00EA escuta uma voz baixinha:  \n\n..." + player.getNome() + "... ";

		choice = "O que voc\u00EA ira fazer?";
		op1 = "Seguir a voz";
		op2 = "Ignorar a voz";

	}

	public void seguir_voz() {

		tx = new String[2];

		if (player.isBonus_inicio()) {

			tx[0] = "Voc\u00EA acaba por encontrar Artemisia, por\u00E9m desta vez sem o capuz e com "
					+ " vestes mais parecidas com a de um  arcano. ";

			tx[1] = "Artemisia:\n\nO que te trouxe aqui? Uma mulher  desconhecida numa cidade estranha "
					+ " te chama para um lugar no qual voc\u00EA nunca ouviu falar e voc\u00EA vem sem "
					+ " hesitar, me pergunto se \u00E9 loucura ou  burrisse... ";

		} else {

			tx[0] = "Voc\u00EA acaba por encontrar uma mulher misteriosa com vestes de arcano. ";

			tx[1] = "Arcana:\n\nO que te trouxe aqui? Voc\u00EA entra sem "
					+ " convite na torre dos maiores arcanos  conhecidos, me pergunto se voc\u00EA \u00E9 "
					+ " nunca ouviu falar e voc\u00EA vem sem  hesitar, me pergunto se \u00E9 sinal de  "
					+ " loucura ou burrisse.... ";

		}

		choice = "Voc\u00EA a encara e responde: ";
		op1 = "Provavelmente burrice";
		op2 = "Um pouco de loucura nunca fez mal a ningu\u00E9m";
		op3 = "Sou apenas algu\u00E9m sem nada a perder";
	}

	public void ignorar_voz() {

		tx = new String[6];

		if (player.isBonus_inicio()) {

			tx[4] = "Voc\u00EA acaba por encontrar Artemisia, por\u00E9m desta vez sem o capuz e com "
					+ " vestes mais parecidas com a de um  arcano ";

			tx[5] = "Artemisia:\n\nO que te trouxe aqui? Uma mulher  desconhecida numa cidade estranha "
					+ " te chama para um lugar no qual voc\u00EA nunca ouviu falar e voc\u00EA vem sem "
					+ " hesitar, me pergunto se \u00E9 loucura ou  burrisse... ";
		} else {

			tx[4] = "Voc\u00EA acaba por encontrar uma mulher misteriosa com vestes de arcano. ";

			tx[5] = "Arcana:\n\nO que te trouxe aqui? Voc\u00EA entra sem "
					+ " convite na torre dos maiores arcanos  conhecidos, me pergunto se voc\u00EA \u00E9 "
					+ " nunca ouviu falar e voc\u00EA vem sem  hesitar, me pergunto se \u00E9 sinal de  "
					+ " loucura ou burrisse.... ";
		}

		tx[0] = "Voc\u00EA come\u00E7a a andar pela torre  procurando algo que nem voc\u00EA sabe o" + " que \u00E9.  ";

		tx[1] = "De repente se depara com uma  pequena sala aparentemente vazia, ou "
				+ " quase vazia, existe um pequeno pilar  com uma esp\u00E9cie de pedra em cima.  ";

		tx[2] = "Voc\u00EA n\u00E3o tinha notado antes, mas  duas vozes estavam te chamando e, "
				+ " uma delas, est\u00E1 vindo desta pedra.  Voc\u00EA se aproxima, mas \u00E9 subitamente "
				+ " repelido para fora da sala e ela  desaparece. ";

		tx[3] = "Sem notar voc\u00EA se encaminha na dire\u00E7\u00E3o da outra voz, entretanto com"
				+ " o estranho acontecimento ainda em   mente. ";

		choice = "Voc\u00EA a encara e responde: ";
		op1 = "Provavelmente burrice";
		op2 = "Um pouco de loucura nunca fez mal a ningu\u00E9m";
		op3 = "Sou apenas algu\u00E9m sem nada a perder";

	}

	public void resposta_arcana(int x) {

		tx = new String[5];

		switch (x) {

		case 1:
			if (player.isBonus_inicio()) {

				tx[0] = "Artemisia:\n\nIsso d\u00E1 para perceber s\u00F3 de olhar  para voc\u00EA. ";

			} else {

				tx[0] = "Arcana:\n\nIsso d\u00E1 para perceber s\u00F3 de olhar  para voc\u00EA. ";

			}
			break;
		case 2:
			if (player.isBonus_inicio()) {

				tx[0] = "Artemisia:\n\nDiga isso para as milhares de "
						+ " pessoas que est\u00E3o sofrendo com essa  guerra iniciada por homens loucos. ";

			} else {

				tx[0] = "Arcana:\n\nDiga isso para as milhares de  pessoas que est\u00E3o sofrendo com essa "
						+ " guerra iniciada por homens loucos. ";

			}
			break;
		case 3:
			if (player.isBonus_inicio()) {

				tx[0] = "Artemisia:\n\nAgora eu entendo... ";

			} else {

				tx[0] = "Arcana:\n\nAgora eu entendo... ";

			}
			break;
		}

		if (player.isBonus_inicio()) {
			tx[1] = "Artemisia:\n\nDe qualquer forma, vejo que voc\u00EA tem "
					+ " o que \u00E9 preciso para atingir um poder maior, um poder que muitos cobi\u00E7am, "
					+ " mas poucos conseguem. ";

			if (player.getSexo() == 0) {
				tx[2] = "Artemisia:\n\n" + player.getNome() + ","
						+ " voc\u00EA acha que tem o que \u00E9 preciso  para se juntar a ordem arcana? Est\u00E1 "
						+ " disposto a renunciar muito do que a vida poderia te dar, tudo em nome de"
						+ " um prop\u00F3sito maior? ";

			} else {

				tx[2] = "Artemisia:\n\n" + player.getNome() + ","
						+ " voc\u00EA acha que tem o que \u00E9 preciso  para se juntar a ordem arcana? Est\u00E1 "
						+ " disposta a renunciar muito do que a vida poderia te dar, tudo em nome de"
						+ " um prop\u00F3sito maior? ";

			}

			tx[3] = "Algo mais forte que voc\u00EA te impele a aceitar, e voc\u00EA, mesmo em d\u00FAvida, "
					+ " responde que sim. ";

			tx[4] = "Artemisia:\n\nAgora que isso est\u00E1 acertado,voc\u00EA"
					+ " precisa passar por um pequeno teste  para sabermos do que voc\u00EA \u00E9 capaz.  ";

		} else {

			tx[1] = "Arcana:\n\nDe qualquer forma, vejo que voc\u00EA tem "
					+ " o que \u00E9 preciso para atingir um poder maior, um poder que muitos cobi\u00E7am, "
					+ " mas poucos conseguem. ";

			if (player.getSexo() == 0) {

				tx[2] = "Arcana:\n\n" + player.getNome() + ", voc\u00EA acha que tem o que \u00E9 preciso "
						+ " para se juntar a ordem arcana? Est\u00E1  disposto a renunciar muito do que a"
						+ " vida poderia te dar, tudo em nome de um prop\u00F3sito maior? ";

				tx[3] = "Algo mais forte que voc\u00EA te impele a aceitar, e voc\u00EA mesmo resoluto, "
						+ " responde que sim. ";

			} else {

				tx[2] = "Arcana:\n\n" + player.getNome() + ", voc\u00EA acha que tem o que \u00E9 preciso "
						+ " para se juntar a ordem arcana? Est\u00E1  disposta a renunciar muito do que a"
						+ " vida poderia te dar, tudo em nome de um prop\u00F3sito maior? ";

				tx[3] = "Algo mais forte que voc\u00EA te impele a aceitar, e voc\u00EA, mesmo resoluta, "
						+ " responde que sim. ";

			}

			tx[4] = "Arcana:\n\nAgora que isso est\u00E1 acertado,voc\u00EA"
					+ " precisa passar por um pequeno teste  para sabermos do que voc\u00EA \u00E9 capaz.  ";

		}

	}

	// Intro Ladino:

	public void intro_ladino() {

		tx = new String[3];

		tx[0] = "Voc\u00EA vai para a Alameda dos Tr\u00EAs  Ponteiros. Um lugar sujo, abandonado "
				+ " pelos deuses (se \u00E9 que existe algum)  e pelo Estado. ";

		tx[1] = "A corrup\u00E7\u00E3o humana corre por todo  local, nas ruas se v\u00EA prostitutas"
				+ " ladr\u00F5es, assassinos, agiotas,  traficantes, se v\u00EA a fome, a mis\u00E9ria, o "
				+ " sofrimento, a dor e o \u00F3dio, mas  tamb\u00E9m se v\u00EA o carinho, a luta, a "
				+ " esperan\u00E7a e o amor no cora\u00E7\u00E3o de  v\u00E1rias pessoas.  ";

		tx[2] = "Voc\u00EA segue andando, sem rumo, at\u00E9  que vv\u00EA uma taverna, chamada O Bom "
				+ " Tom, na qual voc\u00EA entra. ";

		choice = "Voc\u00EA vai at\u00E9 o balc\u00E3o e o taverneiro pergunta  o voc\u00EA que quer ";
		op1 = "Cerveja";
		op2 = "\u00C1gua";
		op3 = "Nada";

	}

	public void bebida_ladino(int x) {

		tx = new String[4];

		switch (x) {
		case 1:

			tx[0] = "Taverneiro: \n\nCl\u00E1ssica cerveja rivesiana. Boa  pedida! ";
			break;

		case 2:

			if (player.getSexo() == 0) {

				tx[0] = "Taverneiro: \n\nVoc\u00EA n\u00E3o \u00E9 velho demais para beber isso? ";

			} else {

				tx[0] = "Taverneiro: \n\nVoc\u00EA n\u00E3o \u00E9 velha demais para beber isso? ";

			}
			break;

		case 3:

			tx[0] = "Taverneiro: \n\nEm uma taverna sem uma bebida."
					+ " Vejo que voc\u00EA n\u00E3o \u00E9 do tipo divertido. ";
			break;

		}

		tx[1] = "Voc\u00EA senta em uma mesa vazia e come\u00E7a a observar as pessoas, "
				+ " segredos contados, transa\u00E7\u00F5es  realizadas, contratos fechados e,"
				+ " principalmente, capuzes escondendo o  rosto. \u00C9 n\u00EDtido que as pessoas v\u00E3o"
				+ " para fazer tudo nesta taberna, menos  comer e beber, isso \u00E9 s\u00F3 um b\u00F4nus. ";

		if (player.isBonus_inicio()) {

			tx[2] = "Depois de alguns minutos sozinho  algu\u00EAm te aborda, voc\u00EA n\u00E3o o "
					+ " reconhece a princ\u00EDpio at\u00E9 que ele  come\u00E7a a falar. ";

			tx[3] = "Cassiu:\n\nN\u00E3o somos t\u00E3o diferentes quanto "
					+ " parecemos. Eu sou p\u00E1ria desde que  nasci, sempre tive que lutar pela"
					+ " sobreviv\u00EAncia. ";

			if (player.getSexo() == 0) {

				tx[3] = "Cassiu:\n\nEu tamb\u00E9m vejo o sofrimento em seu"
						+ " rosto, vejo que tamb\u00E9m \u00E9 um lutador, "
						+ " e, suas fei\u00E7\u00F5es, n\u00E3o s\u00E3o daqui. Eu  "
						+ " ouvi sobre a guerra em Iriandra e   conhe\u00E7o uma ou duas pessoas de l\u00E1 ";

			} else {
				tx[3] = "Cassiu:\n\nEu tamb\u00E9m vejo o sofrimento em seu"
						+ " rosto, vejo que tamb\u00E9m \u00E9 uma lutadora, "
						+ " e, suas fei\u00E7\u00F5es, n\u00E3o s\u00E3o daqui. Eu  "
						+ " ouvi sobre a guerra em Iriandra e   conhe\u00E7o uma ou duas pessoas de l\u00E1 ";
			}

			choice = "Cassiu:\n\nVoc\u00EA veio aqui fugindo dela n\u00E3o foi?";

		} else {

			tx[2] = "Depois de alguns minutos sozinho   algu\u00EAm que voc\u00EA n\u00E3o conhece te  "
					+ " aborda e come\u00E7a a falar  ";

			tx[3] = "Estranho:\n\nN\u00E3o somos t\u00E3o diferentes quanto "
					+ " parecemos. Eu sou p\u00E1ria desde que  nasci, sempre tive que lutar pela"
					+ " sobreviv\u00EAncia. ";

			if (player.getSexo() == 0) {

				tx[3] = "Estranho:\n\nEu tamb\u00E9m vejo o sofrimento em seu"
						+ " rosto, vejo que tamb\u00E9m \u00E9 um lutador, "
						+ " e, suas fei\u00E7\u00F5es, n\u00E3o s\u00E3o daqui. Eu  "
						+ " ouvi sobre a guerra em Iriandra e   conhe\u00E7o uma ou duas pessoas de l\u00E1 ";

			} else {

				tx[3] = "Estranho:\n\nEu tamb\u00E9m vejo o sofrimento em seu"
						+ " rosto, vejo que tamb\u00E9m \u00E9 uma lutadora, "
						+ " e, suas fei\u00E7\u00F5es, n\u00E3o s\u00E3o daqui. Eu  "
						+ " ouvi sobre a guerra em Iriandra e   conhe\u00E7o uma ou duas pessoas de l\u00E1 ";

			}

			choice = "Estranho:\n\nVoc\u00EA veio aqui fugindo dela n\u00E3o foi?";

		}
		op1 = "N\u00E3o te interessa";
		op2 = "Sim";
		op3 = "Nasci e cresci em Helaria";

	}

	public void resp_lad(int x) {

		tx = new String[1];

		switch (x) {
		case 1:

			if (player.isBonus_inicio()) {

				tx[0] = "Cassiu: \n\nVoc\u00EA pode at\u00E9 n\u00E3o querer dizer, mas   isso \u00E9 claro.";

			} else {

				tx[0] = "Estranho: \n\nVoc\u00EA pode at\u00E9 n\u00E3o querer dizer, mas  " + " isso \u00E9 claro. ";

			}
			break;

		case 2:

			if (player.isBonus_inicio()) {

				if (player.getSexo() == 0) {

					tx[0] = "Cassiu: \n\nA verdade pode ser dura, mas n\u00E3o  "
							+ " podemos fugir dela, eu te entendo e respeito meu amigo ";
				} else {

					tx[0] = "Cassiu: \n\nA verdade pode ser dura, mas n\u00E3o  "
							+ " podemos fugir dela, eu te entendo e respeito minha amiga ";
				}

			} else {

				if (player.getSexo() == 0) {

					tx[0] = "Estranho: \n\nA verdade pode ser dura, mas n\u00E3o  "
							+ " podemos fugir dela, eu te entendo e respeito meu amigo ";

				} else {

					tx[0] = "Estranho: \n\nA verdade pode ser dura, mas n\u00E3o  "
							+ " podemos fugir dela, eu te entendo e respeito minha amiga ";

				}

			}
			break;

		case 3:

			if (player.isBonus_inicio()) {

				tx[0] = "Cassiu: \n\nE eu sou o Rei do Norte! Hahahaha! N\u00E3o precisa mentir para mim. "
						+ " Eu n\u00E3o sou um idiota. ";

			} else {

				tx[0] = "Estranho: \n\nE eu sou o Rei do Norte! Hahahaha! N\u00E3o precisa mentir para mim. "
						+ " Eu n\u00E3o sou um idiota. ";

			}
			break;

		}

		if (player.isBonus_inicio()) {

			if (player.getSexo() == 0) {

				choice = "Cassiu:\n\nBom, de qualquer forma, vamos agora "
						+ " ao que interessa. Est\u00E1 disposto a me ouvir? ";

			} else {

				choice = "Cassiu:\n\nBom, de qualquer forma, vamos agora "
						+ " ao que interessa. Est\u00E1 disposta a me ouvir? ";

			}
		} else {

			if (player.getSexo() == 0) {

				choice = "Estranho:\n\nBom, de qualquer forma, vamos agora "
						+ " ao que interessa. Est\u00E1 disposto a me ouvir? ";

			} else {

				choice = "Estranho:\n\nBom, de qualquer forma, vamos agora "
						+ " ao que interessa. Est\u00E1 disposta a me ouvir? ";

			}
		}

		op1 = "Eu n\u00E3o tenho nada mais a perder.";
		op2 = "L\u00F3gico, porque n\u00E3o?";

	}

	public void neg_lad(int x) {
		tx = new String[7];

		switch (x) {

		case 1:

			if (player.isBonus_inicio()) {

				if (player.getSexo() == 0) {

					tx[0] = "Cassiu: \n\nEu estava certo sobre voc\u00EA. \u00E9 um  "
							+ " lutador, tem coragem e est\u00E1 pronto  para novos desafios ";

				} else {

					tx[0] = "Cassiu: \n\nEu estava certo sobre voc\u00EA. \u00C9 uma  "
							+ " lutadora, tem coragem e est\u00E1 pronta  para novos desafios ";

				}
			} else {

				if (player.getSexo() == 0) {

					tx[0] = "Estranho: \n\nEu estava certo sobre voc\u00EA. \u00C9 um  "
							+ " lutador, tem coragem e est\u00E1 pronto  para novos desafios ";

				} else {

					tx[0] = "Estranho: \n\nEu estava certo sobre voc\u00EA. \u00C9 uma  "
							+ " lutadora, tem coragem e est\u00E1 pronta  para novos desafios ";

				}
			}
			break;

		case 2:

			if (player.isBonus_inicio()) {

				tx[0] = "Cassiu: \n\nArrogante... Eu gosto disso. Nem    todos sabem apreciar como uma "
						+ " virtude, mas eu, sem d\u00FAvida alguma,  sei. ";

			} else {
				tx[0] = "Estranho: \n\nArrogante... Eu gosto disso. Nem    todos sabem apreciar como uma "
						+ " virtude, mas eu, sem d\u00FAvida alguma,  sei. ";

				break;
			}

		}

		if (player.isBonus_inicio()) {

			tx[1] = "Cassiu: \n\nVamos para um lugar mais privado para conversarmos em paz.";

		} else {

			tx[1] = "Estranho: \n\nVamos para um lugar mais privado para conversarmos em paz, a propósito meu nome é Cassiu.";

		}

		tx[2] = "Voc\u00EAs saem da taberna e v\u00E3o para  uma pequena casa escondida no "
				+ " meio da podrid\u00E3o do lugar. L\u00E1  v\u00EA que n\u00E3o est\u00E3o sozinhos, "
				+ " existem outras pessoas no lugar, sete ao todo, mas nenhuma fala nada. ";

		tx[3] = "Cassiu: \n\nNos somos a Guilda Vigilante. Esta cidade est\u00E1 indo para o inferno e  "
				+ " n\u00F3s estamos tentando impedir isso.  Para isso nos valemos de diversos"
				+ " meios como assaltos, assassinatos e  extors\u00F5es entre outras coisas ";

		tx[4] = "Cassiu: \n\nNos te chamamos aqui por acharmos  que  tem o que \u00E9 preciso para  "
				+ " entrar nesta Guilda. Desde que    chegou na cidade estivemos te "
				+ " observando. Ent\u00E3o, oque me diz? ";

		tx[5] = "Voc\u00EA ouve e sabe que tudo que foi dito  \u00E9 verdade, e n\u00E3o hesita em aceitar "
				+ " a oferta. ";

		if (player.getSexo() == 0) {

			tx[6] = "Cassiu: \n\nPerfeito, mas antes temos que test\u00E1-lo ";

		} else {

			tx[6] = "Cassiu: \n\nPerfeito, mas antes temos que test\u00E1-la ";

		}

	}

	// Intro Guerreiro

	public void intro_guerreiro() {

		tx = new String[2];

		tx[0] = "Voc\u00EA vai para o castelo. Um magn\u00EDfico  edf\u00EDcio que, em todo seu esplendor, "
				+ " se destaca da mis\u00E9ria da cidade. ";

		tx[1] = "Voc\u00EA nunca viu nada que ao menos se comparasse com o Pal\u00E1cio Real, "
				+ " na verdade, \u00E9 improv\u00E2vel a exist\u00EAncia  algo que possa se comparar com isso."
				+ " No port\u00E3o, um guarda te para ";

		choice = "Guarda:\n\nO que voc\u00EA faz aqui? ";
		op1 = "Contar sua hist\u00F3ria";
		op2 = "Interesses pessoais";

	}

	public void contar_hist() {

		tx = new String[6];

		if (player.isBonus_inicio()) {

			tx[0] = "Voc\u00EA conta como sobre tudo o que  aconteceu com voc\u00EA e que um "
					+ " soldado o havia convidado para se  apresentar ao capit\u00E3o Alexander. ";

			if (player.getSexo() == 0) {

				tx[1] = "Soldado:\n\nMe lembro de Erebor falando sobre" + " um estranho vir ver o capit\u00E3o hoje.  "
						+ " Tudo certo pode entrar, \u00E9 s\u00F3 seguir  reto e subir o primeiro lance de "
						+ " escadas que voc\u00EA ir\u00E1 encontr\u00E1 - lo ";

				tx[2] = "Voc\u00EA segue o caminho indicado,  encontra a sala do capit\u00E3o. L\u00E1 dentro  "
						+ " voc\u00EA encontra uma pessoa id\u00EAntica ao   soldado que voc\u00EA conheceu mais "
						+ " cedo. ";

				tx[3] = "Capit\u00E3o Alexander:\n\nSuponho que voc\u00EA seja o garoto que "
						+ " meu irm\u00E3o Erebor encontrou mais cedo. N\u00E3o se preocupe, ele j\u00E1 me"
						+ " contou sua hist\u00F3ria.Ent\u00E3o voc\u00EA acha "
						+ " que tem o que \u00E9 preciso para entrar  na Guarda Real? ";

				tx[4] = "Voc\u00EA n\u00E3o tem  nenhuma d\u00FAvida ao  responder que sim.  ";

				tx[5] = "Capit\u00E3o Alexander:\n\nVoc\u00EA tem vontade de entrar para a "
						+ " Guarda, mas agora n\u00F3s vamos ver se  voc\u00EA tem o que \u00E9 preciso. ";

			} else {

				tx[1] = "Soldado:\n\nMe lembro de Erebor falando sobre" + " uma estranha vir ver o capit\u00E3o hoje.  "
						+ " Tudo certo pode entrar, \u00E9 s\u00F3 seguir  reto e subir o primeiro lance de "
						+ " escadas que voc\u00EA ir\u00E1 encontr\u00E1 - lo ";

				tx[2] = "Voc\u00EA segue o caminho indicado,  encontra a sala do capit\u00E3o. L\u00E1 dentro  "
						+ " voc\u00EA encontra uma pessoa id\u00EAntica ao   soldado que voc\u00EA conheceu mais "
						+ " cedo. ";

				tx[3] = "Capit\u00E3o Alexander:\n\nSuponho que voc\u00EA seja a garota que "
						+ " meu irm\u00E3o Erebor encontrou mais cedo. N\u00E3o se preocupe, ele j\u00E1 me"
						+ " contou sua hist\u00F3ria.Ent\u00E3o voc\u00EA acha "
						+ " que tem o que \u00E9 preciso para entrar  na Guarda Real? ";

				tx[4] = "Voc\u00EA n\u00E3o tem  nenhuma d\u00FAvida ao  responder que sim.  ";

				tx[5] = "Capit\u00E3o Alexander:\n\nVoc\u00EA tem vontade de entrar para a "
						+ " Guarda, mas agora n\u00F3s vamos ver se  voc\u00EA tem o que \u00E9 preciso. ";

			}

		} else {

			tx[0] = "Voc\u00EA conta como sobre tudo o que  aconteceu com voc\u00EA e que voc\u00EA "
					+ " deseja se alistar a Guarda Real. ";

			if (player.getSexo() == 0) {

				tx[1] = "Soldado:\n\nN\u00E3o sei por que a Guarda precisaria"
						+ " de um garoto como voc\u00EA, mas tudo  bem.Pode entrar, \u00E9 s\u00F3 seguir reto e"
						+ " subir o primeiro lance de escadas que   voc\u00EA ir\u00E1 encontrar o capit\u00E3o.";

				tx[2] = "Voc\u00EA segue o caminho indicado,  encontra a sala do capit\u00E3o. L\u00E1 dentro  "
						+ " voc\u00EA encontra uma pessoa que voc\u00EA imagina ser o capit\u00E3o da Guarda.";

				tx[3] = "Capit\u00E3o:\n\nVejo nos seus olhos que voc\u00EA deseja "
						+ " se alistar na Guarda Real, mas n\u00F3s s\u00F3"
						+ " aceitamos os mais fortes, ser\u00E1 que "
						+ " voc\u00EA tem o que \u00E9 necess\u00E1rio para entrar? ";

				tx[4] = "Voc\u00EA n\u00E3o tem  nenhuma d\u00FAvida ao responder que sim. ";

				tx[5] = "Capit\u00E3o:\n\nVoc\u00EA tem vontade de entrar para a "
						+ " Guarda, mas agora n\u00F3s vamos ver se voc\u00EA tem o que \u00E9 preciso.";

			} else {

				tx[1] = "Soldado:\n\nN\u00E3o sei por que a Guarda precisaria"
						+ " de uma garota como voc\u00EA, mas tudo bem.Pode entrar, \u00E9 s\u00F3 seguir reto e"
						+ " subir o primeiro lance de escadas que voc\u00EA ir\u00E1 encontrar o capit\u00E3o.";

				tx[2] = "Voc\u00EA segue o caminho indicado, encontra a sala do capit\u00E3o. L\u00E1 dentro  "
						+ " voc\u00EA encontra uma pessoa que voc\u00EA imagina ser o capit\u00E3o da Guarda.";

				tx[3] = "Capit\u00E3o:\n\nVejo nos seus olhos que voc\u00EA deseja "
						+ " se alistar na Guarda Real, mas n\u00F3s s\u00F3"
						+ " aceitamos os mais fortes, ser\u00E1 que "
						+ " voc\u00EA tem o que \u00E9 necess\u00E1rio para entrar? ";

				tx[4] = "Voc\u00EA n\u00E3o tem  nenhuma d\u00FAvida ao responder que sim. ";

				tx[5] = "Capit\u00E3o:\n\nVoc\u00EA tem vontade de entrar para a "
						+ " Guarda, mas agora n\u00F3s vamos ver se voc\u00EA tem o que \u00E9 preciso.";
			}

		}

	}

	public void naoEdaSuaConta() {

		tx = new String[2];

		tx[0] = "Soldado:\n\nIsso n\u00E3o \u00E9 problema meu. V\u00E1 embora daqui !";

		tx[1] = "Soldado:\n\nVoc\u00EA se afasta da vis\u00E3o dele e procura outra forma de entrar no "
				+ " pal\u00E1cio. Voc\u00EA consegue entrar no castelo gra\u00E7as a uma falha no muro "
				+ " que voc\u00EA consegue escalar, mas a guarda do lado de dentro \u00E9 grande. ";

		choice = "Existem tr\u00EAs caminhos poss\u00EDveis, pelos jardins pelos est\u00E1bulos, "
				+ " anexados \u00E0 parte central ou por uma porta aparentemente sem guardas.  ";

		op1 = "Jardins";
		op2 = "Est\u00E1bulos";
		op3 = "Porta";

	}

	public void jardins() {

		tx = new String[1];

		tx[0] = "O caminho pelos jardins est\u00E1 livre, voc\u00EA consegue entrar no castelo. Mas"
				+ " voc\u00EA est\u00E1 perdido, n\u00E3o sabe onde \u00E9 a sala do capit\u00E3o.";

		choice = "Dois soldados se aproximam  lentamente ";
		op1 = "Falar com eles";
		op2 = "Se esconder";

	}

	public void estabulos() {

		tx = new String[1];

		tx[0] = "Os est\u00E1bulos est\u00E3o vazios quase   totalmente vazios, exceto por um "
				+ " soldado b\u00EAbado desacordado. ";

		choice = "Pegar as vestes dele pode ser uma   boa ideia para se camuflar, mas elas "
				+ "  s\u00E3o grandes e pesadas. O que voc\u00EA ";

		op1 = "Pegar vestes";
		op2 = "N\u00E3o pegar";

	}

	public void salaCap(int x) {

		tx = new String[8];

		switch (x) {
		case 1:

			tx[0] = "Eles est\u00E3o um pouco embriagados e cansados, de bom grado lhe d\u00E3o a"
					+ " informa\u00E7\u00E3o e voc\u00EA pode prosseguir para a sala do capit\u00E3o sem "
					+ " problemas.";
			break;

		case 2:

			tx[0] = "Eles v\u00E3o embora e voc\u00EA pode prosseguir. Depois de muito se "
					+ " esconder voc\u00EA consegue chegar at\u00E9 a sala do capit\u00E3o.";
			break;

		case 3:

			tx[0] = "Voc\u00EA coloca os trajes militares e entra no castelo. Camuflado, voc\u00EA n\u00E3o "
					+ " enfrenta muitos problemas para encontrar a sala do capit\u00E3o.Chegando"
					+ " l\u00E1 voc\u00EA deixa a roupa e abre a porta.";
			break;

		case 4:

			tx[0] = "Voc\u00EA entra no castelo com suas  roupas de campon\u00EAs. N\u00E3o demora "
					+ " muito para encontrar soldados. Eles  "
					+ " v\u00E3o na sua dire\u00E7\u00E3o, voc\u00EA come\u00E7a a "
					+ " correr at\u00E9 que entra em uma sala. Por "
					+ " coincid\u00EAncia esta \u00E9 a sala do capit\u00E3o";
			break;

		case 5:

			tx[0] = "O caminho pela porta est\u00E1 totalmente vazio e cont\u00E9m um mapa com as "
					+ " principais salas do castelo, voc\u00EA consegue chegar na sala do capit\u00E3o "
					+ " sem grandes problemas.";
			break;
		}

		if (player.isBonus_inicio()) {

			tx[1] = "O capit\u00E3o se assusta com a sua chegada  repentina, e desembainha a espada.";

			tx[2] = "Capit\u00E3o Alexander:\n\nQuem \u00E9 voc\u00EA?";

			tx[3] = "Voc\u00EA se sente confuso porque ele \u00E9 id\u00EAntico ao guarda que encontrou  "
					+ " mais cedo, mas conta a sua hist\u00F3ria";

			tx[4] = "Capit\u00E3o Alexander:\n\nQuem voc\u00EA encontrou mais cedo foi"
					+ " meu irm\u00E3o, Erebor. Ele me avisou que algu\u00E9m iria me ver hoje, s\u00F3 n\u00E3o "
					+ " esperava que fosse entrar de repente e sem ser anunciado.";

			if (player.getSexo() == 0) {
				tx[5] = "Capit\u00E3o Alexander:\n\nN\u00E3o \u00E9 qualquer um que conseguiria "
						+ " invadir esse castelo. Entendo o porqu\u00EA de Erebor ter te mandado "
						+ " aqui. Diga meu jovem, voc\u00EA tem interesse em entrar para a Guarda Real?";

			} else {
				tx[5] = "Capit\u00E3o Alexander:\n\nN\u00E3o \u00E9 qualquer um que conseguiria "
						+ " invadir esse castelo. Entendo o porqu\u00EA de Erebor ter te mandado "
						+ " aqui. Diga minha jovem, voc\u00EA tem interesse em entrar para a Guarda Real?";
			}

			tx[6] = "Voc\u00EA nem pensa antes de responder positivamente.";

			tx[7] = "Capit\u00E3o Alexander:\n\nMuito bem, mas antes vamos testar suas outras habilidades.";

		} else {

			tx[1] = "O capit\u00E3o se assusta com a sua chegada  repentina, e desembainha a espada.";

			tx[2] = "Capit\u00E3o:\n\nQuem \u00E9 voc\u00EA?";

			tx[3] = "Voc\u00EA se sente assustado com a presen\u00E7a do capit\u00E3o e se apressa em  "
					+ " contar sua hist\u00F3ria";

			tx[4] = "Capit\u00E3o:\n\nMuita ousadia da sua parte invadir o"
					+ " castelo dessa maneira, eu n\u00E3o esperava ningu\u00E9m para se alistar hoje.";

			if (player.getSexo() == 0) {

				tx[5] = "Capit\u00E3o:\n\nMas, n\u00E3o \u00E9 qualquer um que "
						+ " conseguiria invadir esse castelo. Ent\u00E3o, diga meu jovem, voc\u00EA  "
						+ " realmente tem interesse em entrar para a Guarda Real?";

			} else {

				tx[5] = "Capit\u00E3o:\n\nMas, n\u00E3o \u00E9 qualquer um que "
						+ " conseguiria invadir esse castelo. Ent\u00E3o, diga minha jovem, voc\u00EA  "
						+ " realmente tem interesse em entrar para a Guarda Real?";

			}

			tx[6] = "Voc\u00EA nem pensa antes de responder positivamente.";

			tx[7] = "Capit\u00E3o:\n\nMuito bem, mas antes vamos testar suas outras habilidades.";
		}

	}

}
