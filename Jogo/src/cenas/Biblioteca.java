package cenas;

public class Biblioteca { // Classe que armazena os vetores de texto a serem usados

	private String[] tx; // textos
	private String choice, op1, op2, op3; // Strings para a interface de escolhas
	private int[] linhas; // variavel para ajustar o JLabel ao tamanho do texto
	private int sexo; // variavel para corrigir o gênero do personagem nos textos

	// Getters and Setters

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public String getChoice() {
		return choice;
	}

	public String getOp1() {
		return op1;
	}

	public String getOp2() {
		return op2;
	}

	public String getOp3() {
		return op3;
	}

	public String[] getTx() {
		return tx;
	}

	public String getTx(int x) {
		return tx[x];
	}

	public int getLinhas(int x) {
		return linhas[x];
	}

	// Fim dos Getter and Setters

	// Textos para o prólogo

	public void inicio() { // 0 opções
		tx = new String[23];
		linhas = new int[23];

		tx[0] = "<html>O dia amanheceu. Voce acorda e se" + "<br/>levanta de sua cama e sai de seu" + "<br/> quarto."
				+ "</html>";
		linhas[0] = 2;

		tx[1] = "<html>Mãe:" + "<br/><br/> Bom dia meu bem! Achei que" + "<br/>não ia mais levantar hoje. Já passou "
				+ "<br/>das sete da manhã. Venha logo tomar " + "<br/>café." + "</html>";
		linhas[1] = 5;

		tx[2] = "<html>Você come tranquilamente" + "<br/>enquanto observa sua pequena "
				+ "<br/>irmã brincando com bonecas de  " + "<br/>pano no chão. O dia está  " + "<br/>agradável."
				+ "</html>";
		linhas[2] = 4;

		tx[3] = "<html>Mãe:" + "<br/><br/>Hoje completa um ano da  " + "<br/>morte de seu pai. Vamos ao "
				+ "<br/>cemitério visitá-lo mais tarde." + "</html>";
		linhas[3] = 4;

		tx[4] = "<html>Mãe:" + "<br/><br/>Será que você poderia ir" + "<br/>à cidade comprar um incenso "
				+ "<br/>para levarmos ao seu pai? Ele" + "<br/>adorava usá-los em suas "
				+ "<br/>meditações. Tenho certeza de" + "<br/>que ele irá gostar." + "</html>";
		linhas[4] = 7;

		tx[5] = "<html>Você sai de casa rumo ao mercado da" + "<br/>cidade. Por morar em um local"
				+ "<br/>isolado, leva cerca de uma hora para" + "<br/>chegar ao local." + "</html>";
		linhas[5] = 3;

		tx[6] = "<html>Vendedor de incensos:" + "<br/><br/>Olá, faz tempo que não"
				+ "<br/>te vejo. O que deseja levar dessa " + "<br/>vez? " + "</html>";
		linhas[6] = 4;

		tx[7] = "<html>Você explica que quer comprar" + "<br/>incensos para levar ao túmulo de seu" + "<br/>pai."
				+ "</html>";
		linhas[7] = 2;

		tx[8] = "<html>Vendedor de incensos:" + "<br/><br/>Ah sim, seu pai. Sinto falta"
				+ "<br/>dele, era um bom homem. Morreu de" + "<br/>forma honrosa lutando contra seus."
				+ "<br/>inimigos." + "</html>";
		linhas[8] = 5;

		tx[9] = "<html>Vendedor de incensos:" + "<br/><br/>Aqueles malditos imperiais "
				+ "<br/>continuam querendo nossos " + "<br/>territórios. Tenho ouvido rumores de "
				+ "<br/>que eles planejam atacar nossa " + "<br/>cidade novamente em breve. Você"
				+ "<br/>deveria fugir daqui com sua família o " + "<br/>quanto antes." + "</html>";
		linhas[9] = 8;

		tx[10] = "<html>Há alguns segundos de silêncio. O" + "<br/>vendedor te entrega o incenso e tenta "
				+ "<br/>cortar a tensão." + "</html>";
		linhas[10] = 2;

		tx[11] = "<html>Vendedor de incensos:" + "<br/><br/>Olha, acho que exagerei "
				+ "<br/>um pouco. Não fique muito " + "<br/>preocupado com isso. Leve esse "
				+ "<br/>incenso por minha conta, é meu " + "<br/>presente ao seu pai." + "</html>";
		linhas[11] = 6;

		tx[12] = "<html>Você agradece e sai da loja. Ainda é " + "<br/>manhã, há poucas nuvens no céu e "
				+ "<br/>tudo indica que o dia será calmo " + "<br/>como sempre." + "</html>";
		linhas[12] = 3;

		tx[13] = "<html>Após uma longa caminhada você " + "<br/>começa a se aproximar de casa. Algo "
				+ "<br/>não parece certo. Há um forte cheiro " + "<br/>de queimado no ar e uma grande "
				+ "<br/>nuvem de fumaça vinda da direção da " + "<br/>casa." + "</html>";
		linhas[13] = 5;

		tx[14] = "<html>Ao chegar mais perto, você vê as " + "<br/>chamas consumirem tudo. A casa "
				+ "<br/>começa a desabar e sua visão " + "<br/>começa a ficar turva." + "</html>";
		linhas[14] = 3;

		tx[15] = "<html>Você escuta os gritos de sua mãe e o " + "<br/>choro de sua irmã, que são "
				+ "<br/>bruscamente interrompidos, seguidos" + "<br/>de uma risada sádica." + "</html>";
		linhas[15] = 3;

		tx[16] = "<html>Tudo que se pode ver são vultos de " + "<br/>vários homens ao longe. Você perde "
				+ "<br/>toda a noção e cai de joelhos, " + "<br/>completamente paralisado." + "</html>";
		linhas[16] = 3;

		tx[17] = "<html>Alguém te agarra pelas costas e " + "<br/>começa a te arrastar" + "</html>";
		linhas[17] = 1;

		// Fim do sonho

		tx[18] = "<html>Você acorda lentamente, ainda  " + "<br/>abalado pelo pesadelo. Havia se"
				+ "<br/>passado apenas uma semana desde" + "<br/>o ocorrido. Você está na parte de trás"
				+ "<br/>de uma carroça guiada pelo homem " + "<br/>que o salvou no momento da "
				+ "<br/>destruição. Em todo esse tempo não " + "<br/>houve nenhuma conversa além do "
				+ "<br/>necessário entre vocês." + "</html>";
		linhas[18] = 8;

		tx[19] = "<html>A carroça para. Você escuta o homem " + "<br/>descendo e conversando algo com "
				+ "<br/>alguém. Você desce da carroça." + "</html>";
		linhas[19] = 2;

		tx[20] = "<html>Cocheiro:" + "<br/><br/>Essa é a pessoa de quem eu "
				+ "<br/>falei. Sua família foi morta pelos " + "<br/>soldados imperiais e ele está "
				+ "<br/>desabrigado. Vocês aceitam" + "<br/>refugiados não é? Pois então, pode" + "<br/>ficar."
				+ "</html>";
		linhas[20] = 7;

		tx[21] = "<html>O homem volta para a carroça sem te " + "<br/>falar mais uma palavra sequer e vai "
				+ "<br/>embora. O guarda com quem ele " + "<br/>conversava se dirige a você." + "</html>";
		linhas[21] = 3;

		tx[22] = "<html>Guarda: " + "<br/><br/>Olá, você é muito bem vindo "
				+ "<br/>em nossa cidade. Para entrar basta " + "<br/>preencher esse formulário." + "</html>";
		linhas[22] = 4;
	}

	public void inicio2() { // 2 opções
		tx = new String[4];
		linhas = new int[4];

		if (sexo == 0) {
			tx[0] = "<html>Guarda:" + "<br/><br/>Tudo certo, mas antes de você" + "<br/>entrar, me permita lhe dar um"
					+ "<br/>conselho: pense muito bem nas suas" + "<br/>primeiras ações aqui na cidade de "
					+ "<br/>Helaria, pois elas definirão como será " + "<br/>seu futuro aqui. Boa sorte garoto"
					+ "</html>";
			linhas[0] = 8;
		} else {
			tx[0] = "<html>Guarda:" + "<br/><br/>Tudo certo, mas antes de você" + "<br/>entrar, me permita lhe dar um"
					+ "<br/>conselho: pense muito bem nas suas" + "<br/>primeiras ações aqui na cidade de "
					+ "<br/>Helaria, pois elas definirão como será " + "<br/>seu futuro aqui. Boa sorte garota"
					+ "</html>";
			linhas[0] = 8;
		}

		tx[1] = "<html> Você entra na cidade e procura pelo" + "<br/> mercado,foi uma viagem longa e difícil"
				+ "<br/>e já tem alguns dias que você" + "<br/>precisa comer." + "<html>";
		linhas[1] = 3;

		tx[2] = "<html>Chegando ao mercado você vê uma " + "<br/>barraca com frutas frescas, bem "
				+ "<br/>diferente dos lixos ressecados que " + "<br/>você costumava comer em viagens" + "<html>";
		linhas[2] = 3;

		tx[3] = "<html>Você vai em direção a barraca " + "<br/>quando, de repente, um homem "
				+ "<br/>esbarra em você, um incidente sem" + "<br/>importância, mas quando você vai"
				+ "<br/>comprar sua tão sonhada refeição " + "<br/>percebe que está sem seu dinheiro" + "<html>";
		linhas[3] = 5;

		choice = "<html>O homem que esbarrou em você" + "<br/> ainda está à vista, se você correr"
				+ "<br/> ainda conseguirá alcançá-lo." + "<br/> O que fará?" + "<html>";

		op1 = "Correr atrás do Homem";
		op2 = "Deixá-lo ir embora";

	}

	public void inicio_correr() { // 2 opções

		tx = new String[1];
		linhas = new int[1];

		tx[0] = "<html>Você corre atrás do bandido e pula " + "<br/>em cima dele, você o está segurando, "
				+ "<br/>ele está em sua posse, a rua não está  " + "<br/>totalmente movimentada e nem"
				+ "<br/>conversar com você." + "<br/>totalmente vazia, duas pessoas se "
				+ "<br/>destacam no meio das outra, um " + "<br/>guarda e alguém que se esconde "
				+ "<br/>atrás de um capuz. " + "<html>";
		linhas[0] = 8;

		choice = "<html>O que você fará?<html>";
		op1 = "Recuperar seu dinheiro e deixá-lo ir";
		op2 = "Recuperar seu dinheiro e mantê-lo preso";
	}

	public void inicio_artemis() { // 0 opções

		tx = new String[8];
		linhas = new int[8];

		tx[0] = "<html>Você pega novamente seus pertences " + "<br/>e libera o ladrão, que corre em "
				+ "<br/>direção a liberdade, uma mulher " + "<br/>misteriosa se aproxima e começa a"
				+ "<br/>conversar com você." + "<html>";
		linhas[0] = 4;

		tx[1] = "<html>Estranho de capuz: " + "<br/><br/>Interessante...  " + "<html>";
		linhas[1] = 2;

		tx[2] = "<html>Estranho de capuz: " + "<br/><br/>O seu ato, você perseguiu essa "
				+ "<br/>pessoa que te roubou, mostrando que " + "<br/>está determinado a lutar pelo seu"
				+ "<br/>direito ." + "<html>";
		linhas[2] = 5;

		tx[3] = "<html>Estranho de capuz: " + "<br/><br/>E, quando o capturou, mostrou "
				+ "<br/>compaixão com um irmão, já tinha " + "<br/>recuperado seus pertences, controlou "
				+ "<br/>a raiva que pulsava em seus olhos e o " + "<br/>liberou. Não é algo que se veja todos "
				+ "<br/>os dias." + "<html>";
		linhas[3] = 7;

		tx[4] = "<html>Estranho de capuz: " + "<br/><br/>Meu nome é Artemisia, sou uma  "
				+ "<br/>arcana da Torre Anciã E. Quanto ao " + "<br/>que eu quero, percebo em você tem "
				+ "<br/>um potencial raro, uma força de " + "<br/>vontade, determinação e  "
				+ "<br/>principalmente bondade e controle " + "<br/>para se tornar um arcano." + "<html>";
		linhas[4] = 8;

		tx[5] = "<html>Artemisia: " + "<br/><br/>Se você tiver interesse venha me  "
				+ "<br/>procurar na Torre Anciã (colocar " + "<br/>localização baseada no mapa) esta " + "<br/>noite"
				+ "<html>";
		linhas[5] = 5;

		tx[6] = "<html>Artemisia vai embora e te deixa " + "<br/>pensando em sua oferta. " + "<html>";
		linhas[6] = 1;
		
		tx[7] = "<html>O dia está caminhando para o seu "
				  + "<br/>final e você tem que decidir para onde "
				  + "<br/>irá esta noite ou se não irá para local" 
				  + "<br/>algum"
				  +"<html>";
		 linhas[7] = 3;

	}

	public void inicio_manterPreso() { // 2 opções

		tx = new String[3];
		linhas = new int[3];

		tx[0] = "<html>Você consegue recuperar seus " + "<br/>pertences, mas  o mantém com a cara"
				+ "<br/>no chão. Ele vê seu olhar de relance e  " + "<br/>começa a pedir por misericórdia" + "<html>";
		linhas[0] = 3;

		tx[1] = "<html>Ladrão:" + "<br/><br/>Por favor, você não precisa fazer isso, "
				+ "<br/>sou só uma pessoa comum. Sei que" + "<br/>cometi erros, mas eu tenho uma "
				+ "<br/>família que precisa de mim." + "<html>";
		linhas[1] = 5;

		tx[2] = "<html>Ladrão:" + "<br/><br/>Somos párias, não existe dignidade"
				+ "<br/>em nossas vidas, para sobrevivermos" + "<br/>faço tudo que está ao meu alcance, "
				+ "<br/>mesmo que para isso eu tenha até " + "<br/>que roubar de pessoas que não tem"
				+ "<br/>nada como eu." + "<html>";
		linhas[2] = 7;

		choice = "<html>Após escutar essas palavras cabe a " + "<br/>você decidir destino do homem que te "
				+ "<br/>assaltou" + "<html>";

		op1 = "Liberá-lo";
		op2 = "Matá-lo";

	}

	public void inicio_ladino() { // 0 opções

		tx = new String[7];
		linhas = new int[7];

		tx[0] = "<html>Ladrão:" + "<br/><br/>Muito obrigado senhor, você possui "
				+ "<br/>uma alma nobre e determinação, o " + "<br/>que é raro nesta cidade de "
				+ "<br/>hipocrisias. Seus cidadãos são uns " + "<br/>puta hipócritas que adoram a um "
				+ "<br/>deus caridoso, mas cospem no " + "<br/>mendigo da rua. " + "<html>";
		linhas[0] = 8;

		tx[1] = "<html>Ladrão:" + "<br/><br/>São poucos os locais que ainda se "
				+ "<br/>encontram valores como os seus. Na " + "<br/>verdade, eu só penso na Alameda "
				+ "<br/>dos Três Ponteiros, um local da mais " + "<br/>pura corrupção, onde é revelado o "
				+ "<br/>melhor e o pior das pessoas." + "<html>";
		linhas[1] = 7;

		tx[2] = "<html>Ladrão:" + "<br/><br/>Você deveria fazer uma visita lá, você "
				+ "<br/>poderia encontrar coisas além da sua" + "<br/>imaginação. " + "<html>";
		linhas[2] = 4;

		tx[3] = "<html>Ladrão:" + "<br/><br/>Há muito não vejo alguém tão nobre "
				+ "<br/>quanto o senhor, mesmo depois de eu " + "<br/>ter te assaltado você me poupou, pelo "
				+ "<br/>jeito a miséria te revolta mais do que " + "<br/>um crime." + "<html>";
		linhas[3] = 6;

		tx[4] = "<html>Cassius: " + "<br/><br/>Meu nome é Cassius e, se eu estiver "
				+ "<br/>certo, me preste uma visita na " + "<br/>Alameda dos Três Ponteiro na (parte "
				+ "<br/>tal da cidade), lá você poderá usar " + "<br/>suas habilidades para ajudar a acabar"
				+ "<br/>com as injustiças que existem nessa " + "<br/>cidade." + "<html>";
		linhas[4] = 8;

		tx[5] = "<html>Ele vai embora e você vê o guarda" + "<br/>abandonar o local decepcionado. " + "<html>";
		linhas[5] = 1;
		
		tx[6] = "<html>O dia está caminhando para o seu "
				  + "<br/>final e você tem que decidir para onde "
				  + "<br/>irá esta noite ou se não irá para local" 
				  + "<br/>algum"
				  +"<html>";
		linhas[6] = 3;

	}

	public void inicio_guerreiro() { // 0 opções

		tx = new String[5];
		linhas = new int[5];

		tx[0] = "<html>Você ignora o que esse miserável te" + "<br/>falou e começa a bater sua cabeça "
				+ "<br/>contra o chão incessantemente, sem" + "<br/>se importar com as pessoas perto ou"
				+ "<br/>com o guarda que te observa. Você" + "<br/>bate a cabeça dele no chão até ele "
				+ "<br/>desmaiar, e depois continua a " + "<br/>espanca-lo" + "<html>";
		linhas[0] = 7;

		tx[1] = "<html>Após alguns minutos, o guarda retira" + "<br/>sua espada e perfura o crânio do "
				+ "<br/>pobre diabo e vira-se para conversar" + "<br/>contigo. " + "<html>";
		linhas[1] = 3;

		tx[2] = "<html>Guarda:" + "<br/><br/>Um homem de fibra que está disposto"
				+ "<br/>a colocar esses miseráveis em seu" + "<br/>devido lugar." + "<html>";
		linhas[2] = 4;

		tx[3] = "<html>Guarda:" + "<br/><br/>A Guarda Real precisa de homens "
				+ "<br/>como o senhor. Apareça esta noite " + "<br/>nos domínios do Castelo e procure "
				+ "<br/>pelo Capitão Alexander do Sétimo " + "<br/>Comando, garanto que não irá se "
				+ "<br/>arrepender." + "<html>";
		linhas[3] = 7;
		
		tx[4] = "<html>O dia está caminhando para o seu "
				  + "<br/>final e você tem que decidir para onde "
				  + "<br/>irá esta noite ou se não irá para local" 
				  + "<br/>algum"
				  +"<html>";
		linhas[4] = 3;

	}

	public void inicio_naoCorrer() {// 3 opções
		
		tx = new String[3];
		linhas = new int[3];
		
 		tx[0] = "<html> Você decide não ir atrás de quem te "
		 + "<br/>assaltou e começa a conversar com "
		 + "<br/>as pessoas no Mercado, afinal você " 
		 + "<br/>está com fome e está sem dinheiro, "
		 + "<br/>precisa saber de possibilidades de "
		 + "<br/>conseguir uma renda."
		 +"<html>";
 		linhas[0] = 5;
 		
 		tx[1] ="<html>Nisso você ouve falar da Alameda dos "
		 + "<br/>Três Ponteiros, onde estão " 
		 + "<br/>concentrados os mais vis ladrões e"
		 + "<br/>assassinos da cidade, da Torre Anciã, "
		 + "<br/>onde se localizam os maiores " 
		 + "<br/>estudiosos das artes arcanas do "
		 + "<br/>mundo, e da Guarda Real, lar dos "
		 + "<br/>guerreiros mais destemidos e ferozes"
		 + "<br/>que existem."
		 +"<html>";
 		linhas[1] = 8;
 		
 		tx[2] = "<html>O dia está caminhando para o seu "
 				  + "<br/>final e você tem que decidir para onde "
 				  + "<br/>irá esta noite ou se não irá para local" 
 				  + "<br/>algum"
 				  +"<html>";
 		 linhas[2] = 3;
 		 		
 		 choice = "<html>Antes de decidir-se, tem a impressão"
 		 		+ "<br/>de que tal escolha terá profunda"
 		 		+ "<br/>influência em seu fururo"
 		 		+ "<html>";
 		 op1 = "Alameda dos Três Ponteiros";
 		 op2 = "Torre Arcana";
 		 op3 = "Alistar - se a Guarda Real";
		
	}

// tx[] = "<html>"
//		 + "<br/>"
//		 + "<br/>" 
//		 + "<br/>"
//		 +"<html>";
//  linhas[] = ;

	// Fim dos textos do Prólogo
}
