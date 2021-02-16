package aula11;

public class Mamifero extends Animal {

	private String corPelo;

	@Override
	public void locomover() {
		System.out.println("Correndo!!!");

	}

	@Override
	public void alimentar() {
		System.out.println("Comendo!!!");

	}

	@Override
	public void emitirSom() {
		System.out.println("Som de mamifero");

	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

}
