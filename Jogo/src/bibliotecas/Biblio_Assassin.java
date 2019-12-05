package bibliotecas;

public class Biblio_Assassin extends Biblioteca {

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

	public void hpAssassin() {
		tx = new String[18];
		linhas = new int[18];

		tx[0] = "<html>Quinze anos se passaram desde que" + "<br/>Voc\u00EA se juntou \u00E0 Guilda Vigilante."
				+ "<br/>Voc\u00EA se tornou um membro " + "<br/>valioso, um assassino  r\u00E1pido e eficiente,  "
				+ "<br/>completou in\u00FAmeras miss\u00F5es, deixou " + "<br/>in\u00FAmeros cad\u00E1veres."
				+ "<html>";
		linhas[0] = 5;

		tx[1] = "<html>" + "<br/>Em todos esses anos as pessoas da Ordem"
				+ "<br/>se tornaram sua fam\u00EDlia, em especial "
				+ "<br/>Cassius, ele foi um irm\u00E3o mais velho, um"
				+ "<br/>amigo e um mentor para voc\u00EA. Te ajudou" + "<br/>a superar a morte da sua fam\u00EDlia e a"
				+ "<br/>destrui\u00E7\u00E3o de seu lar, te ofereceu uma" + "<br/>nova casa e uma nova fam\u00EDlia."
				+ "<html>";
		linhas[1] = 7;

		tx[2] = "<html>Hoje foi marcada uma reuni\u00E3o com " + "<br/>todos os membros da Guilda."
				+ "<br/>Isso n\u00E3o \u00E9 um bom sinal," + "<br/> geralmente significam ou morte"
				+ "<br/> ou problemas, mas, hoje em" + "<br/>especial, parece significar os dois" + "<html> ";
		linhas[2] = 5;

		tx[3] = "<html>" + "<br/>Os diversos membros come\u00E7am a se "
				+ "<br/>juntar e o l\u00EDder da Guilda, por defini\u00E7\u00E3o,"
				+ "<br/> o membro mais antigo vivo, Homero," + "<br/>come\u00E7a a falar:" + "<html>";
		linhas[3] = 4;

		tx[4] = "<html>Homero:" + "<br/><br/>Durante muito tempo vivemos em um"
				+ "<br/>per\u00EDodo de relativa paz. Tivemos nossos"
				+ "<br/>conflitos internos e externos, \u00E9 claro, mas"
				+ "<br/>nunca enfrentamos amea\u00E7a que pudesse"
				+ "<br/>nos dizimar. Hoje a situa\u00E7\u00E3o \u00E9 diferente,"
				+ "<br/>pela primeira vez todos n\u00F3s corremos o" + "<br/>risco de sermos dizimados." + "<html>";
		linhas[4] = 8;

		tx[5] = "<html>Todos come\u00E7am a se agitar e debater o" + "<br/>que Homero estava dizendo, afinal, que"
				+ "<br/>amea\u00E7a poderia ser t\u00E3o grande para"
				+ "<br/>destruir toda a Guilda? No passado voc\u00EAs"
				+ "<br/>j\u00E1 tinham tido in\u00FAmeros conflitos com a" + "<br/>Guarda Real, mas nenhum representou"
				+ "<br/>amea\u00E7a t\u00E3o grande." + "<html>";
		linhas[5] = 6;

		tx[6] = "<html>Homero:" + "<br/><br/>SILÊNCIO!" + "<br/>Eu sei que todos est\u00E3o preocupados com "
				+ "<br/>o que acabei de dizer, mas pelo menos me" + "<br/>deixem terminar antes de pensar"
				+ "<br/>qualquer coisa est\u00FApida." + "<html>";
		linhas[6] = 6;

		tx[7] = "<html>O sil\u00EAncio aos poucos volta," + "<br/>permitindo Homero continuar." + "<html>";
		linhas[7] = 1;

		tx[8] = "<html>Homero:" + "<br/><br/>O Imp\u00E9rio de Bethesda declarou guerra"
				+ "<br/>contra Helaria na noite de ontem." + "<br/>Bethesda \u00E9 conhecido por destruir"
				+ "<br/>qualquer um que esteja em seu caminho,"
				+ "<br/>cidades s\u00E3o queimadas, popula\u00E7\u00F5es s\u00E3o" + "<html>";
		linhas[8] = 6;

		tx[9] = "<html>Homero:" + "<br/><br/>destru\u00EDdas e culturas apagadas, e, \u00E9 isso"
				+ "<br/>que acontecer\u00E1 com Helaria se n\u00E3o" + "<br/>fizermos nada." + "<html>";
		linhas[9] = 4;

		tx[10] = "<html>Um homem irritado:" + "<br/><br/>  Mas por que n\u00F3s far\u00EDamos"
				+ "<br/> alguma coisa por Helaria" + "<br/>se Helaria nunca fez nada por n\u00F3s?!" + "<html>";
		linhas[10] = 4;

		tx[11] = "<html>Voc\u00EA:" + "<br/><br/> Porque n\u00F3s vivemos aqui seu imbecil!" + "<html>";
		linhas[11] = 2;

		tx[12] = "<html>Voc\u00EA retruca com ferocidade," + "<br/>afinal foi Bethesda que"
				+ "<br/>destruiu sua vila, queimou sua casa e" + "<br/>matou sua fam\u00EDlia." + "<html>";
		linhas[12] = 3;

		tx[13] = "<html>Pelo seu tom ficou claro para todos que " + "<br/>conhecem um pouco da sua hist\u00F3ria que "
				+ "<br/>voc\u00EA est\u00E1 disposto a tudo para " + "<br/>obter vingan\u00E7a." + "<html>";
		linhas[13] = 3;

		tx[14] = "<html>Homero:" + "<br/><br/>Percebo que" + "<br/>posso contar com voc\u00EA nessa guerra,<br/>"
				+ player.getNome() + "." + "<html>";
		linhas[14] = 4;

		tx[15] = "<html>A reuni\u00E3o continua por mais um tempo," + "<br/>detalhes da guerra s\u00E3o discutidos e"
				+ "<br/>esclarecidos. O Imp\u00E9rio de Bethesda est\u00E1"
				+ "<br/>marchando em dire\u00E7\u00E3o a Helaria e tem"
				+ "<br/>previs\u00E3o de chegar dentro de tr\u00EAs dias." + "<html>";
		linhas[15] = 4;

		tx[16] = "<html>Nesse per\u00EDodo voc\u00EA ser\u00E1 apresentado \u00E0"
				+ "<br/>algumas miss\u00F5es e poder\u00E1 completar" + "<br/>uma parte delas, mas lembre-se que elas"
				+ "<br/>ter\u00E3o consequ\u00EAncias, ent\u00E3o escolha bem"
				+ "<br/>quais voc\u00E9 ir\u00E1 fazer, pois assim que uma"
				+ "<br/>miss\u00E3o for iniciada, voc\u00EA n\u00E3o poder\u00E1"
				+ "<br/>iniciar outra at\u00E9 que termine a primeira." + "<html>";
		linhas[16] = 6;
		tx[17] = "<html>No final da reunião Cassius" + "<br/>te chama para conversar." + "<html>";
		linhas[17] = 1;

		choice = "<html>Cassius:" + "<br/><br/>Voc\u00EA est\u00E1 bem?" + "<html>";
		op1 = "Mentir";
		op2 = "Dizer a verdade";
	}

	public void Escolha1Assassin(int a) {
		tx = new String[10];
		linhas = new int[10];

		switch (a) {
		case 1:
			tx[0] = "<html>Voc\u00EA:" + "<br/><br/>Estou bem, nenhum problema com isso." + "<html>";
			linhas[0] = 2;

			tx[1] = "<html>Cassius:" + "<br/><br/>Fico feliz de ouvir isso." + "<html>";
			linhas[1] = 2;
			break;
		case 2:
			tx[0] = "<html>Voc\u00EA:" + "<br/><br/>Não estou confortável com Bethesda,"
					+ "<br/>mas isso não atrapalhará minha luta" + "<html>";
			linhas[0] = 3;

			tx[1] = "<html>Cassius:" + "<br/><br/>Fique tranquilo, nós vamos passar por isso juntos." + "<html>";
			linhas[1] = 2;
			break;
		}
		tx[2] = "<html>Voc\u00EA:" + "<br/><br/>Mas não foi só para ver como" + "<br/>estou que você me chamou aqui"
				+ "<html>";
		linhas[2] = 3;

		tx[3] = "<html>Cassius:" + "<br/><br/>Eu preciso que você recrute" + "<br/>algumas pessoas para nos ajudar."
				+ "<html>";
		linhas[3] = 3;

		tx[4] = "<html>Voc\u00EA:" + "<br/><br/>Quem?" + "<html>";
		linhas[4] = 2;

		tx[5] = "<html>Cassius:" + "<br/><br/>Ariandra, a Elfa arqueira que"
				+ "<br/>recentemente chegou em Helaria, ela vive" + "<br/>na Casa Nobre Letos, o Anão, que "
				+ "<br/>está preso dentro da Catedral. " + "<br/>E Terraira, uma sacerdotisa da Torre Arcana."
				+ "<html>";
		linhas[5] = 6;

		tx[6] = "<html>Voc\u00EA:" + "<br/><br/>E por que o interesse" + "<br/>nessas pessoas em específico?"
				+ "<html>";
		linhas[6] = 3;

		tx[7] = "<html>Cassius:" + "<br/><br/>Eles são os melhores no que" + "<br/>fazem e nós vamos montar um pequeno"
				+ "<br/> grupo para atacar os acampamentos" + "<br/>de Bethesda antes da guerra começar." + "<html>";
		linhas[7] = 5;

		tx[8] = "<html>Voc\u00EA:" + "<br/><br/>Entendo." + "<html>";
		linhas[8] = 2;

		tx[9] = "<html>Jogador agora você terá três opções" + "<br/>de locais para ir,"
				+ "<br/>faça sua escolha com sabedoria. " + "<html>";
		linhas[9] = 2;
	}

	public void CasaNobreAssassin() {
		tx = new String[2];
		linhas = new int[2];

		tx[0] = "<html>Você chega nas proximidades da Casa" + "<br/>Nobre, mas ela é extremamente vigiada,"
				+ "<br/>entrar pela porta da frente" + "<br/>é impossível." + "<br/>Tem um sistema de esgotos que"
				+ "<br/>talvez possa te" + "<br/>levar para dentro dela," + "<br/>você decide usá-lo. " + "<html>";
		linhas[0] = 7;

		tx[1] = "<html>Os esgotos são úmidos e imundos" + "<br/>e a travessia é cansativa, mas você"
				+ "<br/>entra nas fronteiras da casa." + "<br/>Você continua prosseguindo até chegar "
				+ "<br/>no ponto em que deve sair,no entanto" + "<br/> uma porta impede seu caminho. " + "<html>";
		linhas[1] = 5;

	}

//	  tx[] = "<html>"
//		 + "<br/>"
//		 + "<br/>" 
//		 + "<br/>"
//		 +"<html>";
//linhas[] = ;

}
