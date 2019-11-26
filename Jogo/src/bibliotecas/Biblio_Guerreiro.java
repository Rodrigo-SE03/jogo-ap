package bibliotecas;

public class Biblio_Guerreiro extends Biblioteca{

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
	
	public void grr_1() { // 2 opcoes

		tx = new String[5];
		linhas = new int[5];

		tx[0] = "<html>Quinze anos se passaram desde que " + "<br/>voc\u00EA entrou para a Guarda Real. Voc\u00EA "
				+ "<br/>foi acolhido e eles se tornaram sua " + "<br/>nova fam\u00EDlia, em especial o Capit\u00E3o"
				+ "<br/>Alexander, atualmente General " + "<br/>Alexander e voc\u00EA \u00E9 o novo Capit\u00E3o do "
				+ "<br/>mesmo S\u00E9timo Comando. " + "<html>";
		linhas[0] = 6;

		tx[1] = "<html>Em todo esse per\u00EDodo Alexander " + "<br/>atuou como um pai para voc\u00EA, um  "
				+ "<br/>amigo nos momentos em que voc\u00EA " + "<br/>precisava e, principalmente um "
				+ "<br/>mentor em todos os momentos, te " + "<br/>treinou nas artes de combate e na "
				+ "<br/>diplomacia. " + "<html>";
		linhas[1] = 6;

		tx[2] = "<html>Hoje voc\u00EA \u00E9 um dos melhores " + "<br/>combatentes que Helaria j\u00E1 viu um "
				+ "<br/>diplomata extremamente habilidoso, " + "<br/>tudo isso gra\u00E7as a Alexander e a seu "
				+ "<br/>irm\u00E3o, assassinado h\u00E1 poucos anos " + "<br/>pela Guilda Vigilante. " + "<html>";
		linhas[2] = 5;

		tx[3] = "<html>Voc\u00EAs sentem muita falta dele, afinal " + "<br/>ele era um membro da fam\u00EDlia, mas "
				+ "<br/>juntos conseguiram superar sua " + "<br/>morte, por\u00E9m nunca conseguiram "
				+ "<br/> prender os culpados. " + "<html>";
		linhas[3] = 4;

		tx[4] = "<html> Hoje voc\u00EA acorda com a chegada de " + "<br/> um mensageiro em seus aposentos, "
				+ "<br/> General Alexander pede seu " + "<br/>comparecimento imediato em seus " + "<br/>aposentos."
				+ "<html>";
		linhas[4] = 4;

		choice = "<html>Nos aposentos do general voc\u00EA tem "
				+ "<br/> algumas op\u00E7\u00F3es para comer, o que ser\u00E1?" + "<html>";

		op1 = "Caf\u00E9 com p\u00E3es e roscas ";

		op2 = "Leite com fatias de bolo ";

		op3 = "Vinho com frutas ";

	}

	public void grr_2() {

		tx = new String[11];
		linhas = new int[11];
		
		tx[0] = "<html>- Agora que terminamos de comer, por" + "<br/>que me chamou aqui t\u00E3o de repente?"
				+ "<html>";
		linhas[0] = 1;

		tx[1] = "<html>- Ontem de noite o Imp\u00E9rio de " + "<br/>Bethesda declarou guerra contra" + "<br/>Helaria. "
				+ "<html>";
		linhas[1] = 2;

		tx[2] = "<html>Voc\u00EA fica em choque com essa " + "<br/>informa\u00E7\u00E3o, uma guerra sendo "
				+ "<br/>iniciada sem nenhum precedente, de" + "<br/>forma t\u00E3o sÃºbita. " + "<html>";
		linhas[2] = 3;

		tx[3] = "<html>Desde que voc\u00EA entrou na Guarda " + "<br/>Real isso nunca tinha acontecido, "
				+ "<br/>ainda mais que o oponente em " + "<br/>quest\u00E3o \u00E9 o Imp\u00E9rio Bethesdaâ€¦ "
				+ "<html>";
		linhas[3] = 3;

		tx[4] = "<html>- O que voc\u00EA quer dizer com isso, " + "<br/>General? " + "<html>";
		linhas[4] = 1;

		tx[5] = "<html>- Aparentemente Bethesda tem " + "<br/>interesse nestas ricas terras de "
				+ "<br/>Helaria e, para eles conseguirem o " + "<br/>que querem, n\u00F3s precisamos sair. " + "<html>";
		linhas[5] = 3;

		tx[6] = "<html> - Mas, Bethesda? " + "<html>";
		linhas[6] = 0;

		tx[7] = "<html>- Foram eles que destru\u00EDram sua vila e " + "<br/>mataram sua fam\u00EDlia, n\u00E3o foi?"
				+ "<html>";
		linhas[7] = 1;

		tx[8] = "<html> - Sim... " + "<html>";
		linhas[8] = 0;

		tx[9] = "<html>" + player.getNome() + ", pe\u00E7o que mantenha sua "
				+ "<br/>cabe\u00E7a no lugar nesta guerra que se " + "<br/>aproxima. Sei o quanto deseja se "
				+ "<br/>vingar deles, mas est\u00E1 em jogo algo "
				+ "<br/>muito maior. N\u00E3o deixe que seu \u00F3dio e "
				+ "<br/>seu desejo de vingan\u00E7a tomem conta"
				+ "<br/>de suas a\u00E7\u00F3es. Ã€s vezes as atitudes  " + "<br/>de uma pessoa podem mudar o rumo  "
				+ "<br/>de uma guerra totalmente.  " + "<html>";
		linhas[9] = 8;

		tx[10] = "<html>- Sim, eu sei disso. Eu n\u00E3o deixarei " + "<br/>minhas emo\u00E7\u00F3es tomarem conta de"
				+ "<br/>mim e farei o que for preciso para" + "<br/>proteger Helaria e vencer a guerra." + "<html>";
		linhas[10] = 3;

	}
	
//	  tx[] = "<html>"
//		 + "<br/>"
//		 + "<br/>" 
//		 + "<br/>"
//		 +"<html>";
//linhas[] = ;
}
