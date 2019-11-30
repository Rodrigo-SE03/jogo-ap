package personagens;

public class Jogador extends Character {
	
	private int clase=5;
	
	private boolean bonus_inicio = false;
	private boolean andarPelaTorreArcan = false;
	
	private boolean enigma1 = false;
	private boolean enigma2 = false;
	private boolean enigma3 = false;
	
	private boolean tst1 = true;
	private boolean tst2 = true;
	private boolean tst3 = true;
	
	private int dias = 3;
	private int horas = 3;
	
	public int getClase() {
		return clase;
	}

	public void setClase(int clase) {
		this.clase = clase;
	}

	public boolean isTst1() {
		return tst1;
	}

	public void setTst1(boolean tst1) {
		this.tst1 = tst1;
	}

	public boolean isTst2() {
		return tst2;
	}

	public void setTst2(boolean tst2) {
		this.tst2 = tst2;
	}

	public boolean isTst3() {
		return tst3;
	}

	public void setTst3(boolean tst3) {
		this.tst3 = tst3;
	}
	
	public boolean isEnigma1() {
		return enigma1;
	}

	public void setEnigma1(boolean enigma1) {
		this.enigma1 = enigma1;
	}

	public boolean isEnigma2() {
		return enigma2;
	}

	public void setEnigma2(boolean enigma2) {
		this.enigma2 = enigma2;
	}

	public boolean isEnigma3() {
		return enigma3;
	}

	public void setEnigma3(boolean enigma3) {
		this.enigma3 = enigma3;
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
	
	public void passaHora() {
		this.horas --;
		if(this.horas == 0) {
			this.horas = 3;
			this.dias --;
		}
	}
	
	public void passaDia() {
		this.dias--;
		this.horas = 3;
	}

	public int getDias() {
		return dias;
	}

	public int getHoras() {
		return horas;
	}
}
