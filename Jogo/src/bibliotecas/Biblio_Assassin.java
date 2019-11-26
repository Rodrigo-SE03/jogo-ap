package bibliotecas;

public class Biblio_Assassin extends Biblioteca{
	
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

	public void hpAssassin() {
		tx = new String[16];
		linhas = new int[16];

		tx[0] = "<html>Quinze anos se passaram desde que"
				+ "<br/>Voc\u00EA se juntou \u00E0 Guilda Vigilante. Voc\u00EA se "
				+ "<br/>tornou um membro valioso, um assassino "
				+ "<br/>r\u00E1pido e eficiente, completou in\u00FAmeras "
				+ "<br/>miss\u00F5es, deixou in\u00FAmeros cad\u00E1veres." + "<html>";
		linhas[0] = 4;

		tx[1] = "<html>" + "<br/>Em todos esses anos as pessoas da Ordem"
				+ "<br/>se tornaram sua fam\u00EDlia, em especial "
				+ "<br/>Cassius, ele foi um irm\u00E3o mais velho, um" + "<br/>amigo e um mentor para vocÃª. Te ajudou"
				+ "<br/>a superar a morte da sua fam\u00EDlia e a" + "<br/>destruiÃ§\u00E3o de seu lar, te ofereceu uma"
				+ "<br/>nova casa e uma nova fam\u00EDlia." + "<html>";
		linhas[1] = 7;

		tx[2] = "<html>Hoje foi marcada uma reuni\u00E3o com todos " + "<br/>os membros da Guilda."
				+ "<br/>Isso n\u00E3o \u00E9 um " + "<br/>bom sinal, geralmente significam ou"
				+ "<br/>morte ou problemas, mas, hoje em" + "<br/>especial, parece significar os dois" + "<html> ";
		linhas[2] = 5;

		tx[3] = "<html>" + "<br/>Os diversos membros comeÃ§am a se "
				+ "<br/>juntar e o l\u00EDder da Guilda, por definiÃ§\u00E3o, o "
				+ "<br/>membro mais antigo vivo, Homero,comeÃ§a a falar:" + "<html>";
		linhas[3] = 3;

		tx[4] = "<html>Homero:" + "<br/><br/>Durante muito tempo vivemos em um"
				+ "<br/>per\u00EDodo de relativa paz. Tivemos nossos"
				+ "<br/>conflitos internos e externos, \u00E9 claro, mas" + "<br/>nunca enfrentamos ameaÃ§a que pudesse"
				+ "<br/>nos dizimar. Hoje a situaÃ§\u00E3o \u00E9 diferente,"
				+ "<br/>pela primeira vez todos nÃ³s corremos o" + "<br/>risco de sermos dizimados." + "<html>";
		linhas[4] = 8;

		tx[5] = "<html>Todos comeÃ§am a se agitar e debater o" + "<br/>que Homero estava dizendo, afinal, que"
				+ "<br/>ameaÃ§a poderia ser t\u00E3o grande para" + "<br/>destruir toda a Guilda? No passado vocÃªs"
				+ "<br/>j\u00E1 tinham tido in\u00FAmeros conflitos com a" + "<br/>Guarda Real, mas nenhum representou"
				+ "<br/>ameaÃ§a t\u00E3o grande." + "<html>";
		linhas[5] = 6;

		tx[6] = "<html>Homero:" + "<br/><br/>SILÃŠNCIO!" + "<br/>Eu sei que todos est\u00E3o preocupados com o que"
				+ "<br/>acabei de dizer, mas pelo menos me" + "<br/>deixem terminar antes de pensar"
				+ "<br/>qualquer coisa est\u00FApida." + "<html>";
		linhas[6] = 6;

		tx[7] = "<html>O silÃªncio aos poucos volta," + "<br/>permitindo Homero continuar." + "<html>";
		linhas[7] = 1;

		tx[8] = "<html>Homero:" + "<br/><br/>O Imp\u00E9rio de Bethesda declarou guerra"
				+ "<br/>contra Helaria na noite de ontem." + "<br/>Bethesda \u00E9 conhecido por destruir"
				+ "<br/>qualquer um que esteja em seu caminho,"
				+ "<br/>cidades s\u00E3o queimadas, populaÃ§\u00F5es s\u00E3o" + "<html>";
		linhas[8] = 6;

		tx[9] = "<html>Homero:" + "<br/><br/>destru\u00EDdas e culturas apagadas, e, \u00E9 isso"
				+ "<br/>que acontecer\u00E1 com Helaria se n\u00E3o" + "<br/>fizermos nada. Mas por que nÃ³s "
				+ "<br/>far\u00EDamos alguma coisa por Helaria" + "<br/>se Helaria nunca fez nada por nÃ³s?!"
				+ "<html>";
		linhas[9] = 6;

		tx[10] = "<html>Um homem irritado:" + "<br/><br/> Porque nÃ³s vivemos aqui seu imbecil!" + "<html>";
		linhas[10] = 2;

		tx[11] = "<html>VocÃª retruca com ferocidade," + "<br/>afinal foi Bethesda que"
				+ "<br/>destruiu sua vila, queimou sua casa e" + "<br/>matou sua fam\u00EDlia." + "<html>";
		linhas[11] = 3;

		tx[12] = "<html>Pelo seu tom ficou claro para todos que conhecem um pouco"
				+ "<br/>da sua histÃ³ria que vocÃª est\u00E1 disposto a" + "<br/>tudo para obter vinganÃ§a." + "<html>";
		linhas[12] = 2;

		tx[13] = "<html>Homero:" + "<br/><br/>Percebo que" + "<br/>posso contar com vocÃª nessa guerra,"
				+ player.getNome() + "." + "<html>";
		linhas[13] = 2;

		tx[14] = "<html>VocÃª diz, pode apostar!" + "<br/>A reuni\u00E3o continua por mais um tempo,"
				+ "<br/>detalhes da guerra s\u00E3o discutidos e"
				+ "<br/>esclarecidos. O Imp\u00E9rio de Bethesda est\u00E1"
				+ "<br/>marchando em direÃ§\u00E3o a Helaria e tem"
				+ "<br/>previs\u00E3o de chegar dentro de trÃªs dias." + "<html>";
		linhas[14] = 5;

		tx[15] = "<html>Nesse per\u00EDodo vocÃª ser\u00E1 apresentado \u00E0"
				+ "<br/>algumas miss\u00F5es e poder\u00E1 completar" + "<br/>uma parte delas, mas lembre-se que elas"
				+ "<br/>ter\u00E3o consequÃªncias, ent\u00E3o escolha bem"
				+ "<br/>quais vocÃª ir\u00E1 fazer, pois assim que uma"
				+ "<br/>miss\u00E3o for iniciada, vocÃª n\u00E3o poder\u00E1"
				+ "<br/>iniciar outra at\u00E9 que termine a primeira." + "<html>";
		linhas[15] = 6;
	}

//	  tx[] = "<html>"
//		 + "<br/>"
//		 + "<br/>" 
//		 + "<br/>"
//		 +"<html>";
//linhas[] = ;
	
}
