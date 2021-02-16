package aula13;

public class Visualizacao {

	// ATRIBUTOS
	private Aluno espectador;
	private Video filme;

	// CONSTRUTOR
	public Visualizacao(Aluno espectador, Video filme) {
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1); // implemta + 1 na qtd totAssistidos
		this.filme.setViews(this.filme.getViews() + 1); // implementa + 1 na qtd de visualizacoes
	}

	// METODOS DE SOBRECARGA
	public void avaliar() {
		this.filme.setAvaliacao(5);
	}

	public void avaliar(int nota) {
		this.filme.setAvaliacao(nota);
	}

	public void avaliar(float porc) {
		int tot = 0;
		if (porc <= 20) {
			tot = 3;
		} else if (porc <= 50) {
			tot = 5;
		} else if (porc <= 90) {
			tot = 8;
		} else {
			tot = 10;
		}

		this.filme.setAvaliacao(tot);
	}

	// METODOS
	public Aluno getEspectador() {
		return espectador;
	}

	public void setEspectador(Aluno espectador) {
		this.espectador = espectador;
	}

	public Video getFilme() {
		return filme;
	}

	public void setFilme(Video filme) {
		this.filme = filme;
	}

	// to string
	@Override
	public String toString() {
		return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
	}

}
