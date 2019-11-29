package personagens;

public class Jogador extends Character {
	private boolean bonus_inicio = false;
	private boolean andarPelaTorreArcan = false;

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
	
	
}
