package aula10;

public class Aluno extends Pessoa {

	private int matr;
	private String curso;

	public void pagarMensalidade() {
		System.out.println("Pagando a mensalidade do aluno " + this.getNome());
	}

	public void cancelarMatr() {
		System.out.println("Matricula sera cancelada!!!");

	}

	public int getMatr() {
		return matr;
	}

	public void setMatr(int matr) {
		this.matr = matr;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
