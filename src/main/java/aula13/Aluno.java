package aula13;

public class Aluno extends Pessoa {

	// ATRIBUTOS
	private String login;
	private int totAssistido;

	// CONSTRUTOR
	public Aluno(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totAssistido = 0;
	}

	// METODOS
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}

	@Override
	public String toString() {
		return super.toString() + "\nAluno [login=" + login + ", totAssistido=" + totAssistido + "]";
	}
	
	
}
