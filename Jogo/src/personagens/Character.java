package personagens;

public abstract class Character { // NPCs têm os msm atributos 
	
	private String nome;
	private String profissão;
	private int sexo;
	private int raça;
	private int idade;

	public Character() {
	}

	public Character(String nome, int sexo, int raça) {
		this.nome = nome;
		this.sexo = sexo;
		this.raça = raça;
	}

	public Character(String nome, int sexo, int raça, int idade) {
		this.nome = nome;
		this.sexo = sexo;
		this.raça = raça;
		this.idade = idade;
	}

	public Character(String nome, int sexo, int raça, int idade, String profissão) {
		this.nome = nome;
		this.sexo = sexo;
		this.raça = raça;
		this.idade = idade;
		this.profissão = profissão;
	}

	public String getProfissão() {
		return profissão;
	}

	public void setProfissão(String profissão) {
		this.profissão = profissão;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public int getRaça() {
		return raça;
	}

	public void setRaça(int raça) {
		this.raça = raça;
	}
}
