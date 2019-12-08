package personagens;

public class Jogador extends Character {

	private boolean[] enigma = new boolean[3], firstTry = new boolean[3];
	private boolean andarPelaTorreArcan, RecAriandra, bonus_inicio, sacrificio;
	private int clase, dias, horas, qtd;

//	private boolean[] firstTry = new boolean[3];

	public Jogador() {

		super("Pedro", 1);

		// Arcan
		andarPelaTorreArcan = false;
		sacrificio = false;

		// Assassin
		RecAriandra = false;

		bonus_inicio = false;

		enigma = new boolean[3];
		firstTry = new boolean[3];

		for (int i = 0; i < 3; i++) {
			this.enigma[i] = false;
			this.firstTry[i] = true;
		}
//		enigma[0] = true;
//		enigma[1] = true;
//		enigma[2] = true;

		clase = 0;
		dias = 3;
		horas = 3;
		qtd = 0;
	}

//	public void setDias(int dias) {
//		this.dias = dias;
//	}

//	public void setHoras(int horas) {
//		this.horas = horas;
//	}

	public void setRecAriandra(boolean recAriandra) {
		RecAriandra = recAriandra;
	}

	public int getClase() {
		return clase;
	}

	public void setClase(int clase) {
		this.clase = clase;
	}

	public boolean isAndarPelaTorreArcan() {
		return andarPelaTorreArcan;
	}

	public void setAndarPelaTorreArcan(boolean andarPelaTorreArcan) {
		this.andarPelaTorreArcan = andarPelaTorreArcan;
	}

	public boolean isBonus_inicio() {
		return bonus_inicio;
	}

	public void setBonus_inicio(boolean bonus_inicio) {
		this.bonus_inicio = bonus_inicio;
	}

	public int getDias() {
		return dias;
	}

	public int getHoras() {
		return horas;
	}

	public boolean getEnigma(int x) {
		return enigma[x];
	}

	public void setEnigma(int x, boolean enigma) {
		this.enigma[x] = enigma;
	}

	public boolean getFirstTry(int x) {
		return firstTry[x];
	}

	public void setFirstTry(int x, boolean firstTry) {
		this.firstTry[x] = firstTry;
	}

	public void passaHora() {
		this.horas--;
		if (this.horas == 0) {
			this.horas = 3;
			this.dias--;
		}
	}

	public void passaDia() {
		this.dias--;
		this.horas = 3;
	}

	public void setQtd() {
		qtd = 0;
		for (int i = 0; i < 3; i++) {
			if (enigma[i])
				qtd++;
		}
		if (RecAriandra)
			qtd--;
	}

	public int getQtd() {
		return qtd;
	}

	public boolean isSacrificio() {
		return sacrificio;
	}

	public void setSacrificio(boolean sacrificio) {
		this.sacrificio = sacrificio;
	}

}
