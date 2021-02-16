package aula02;

public class BMetodoAtributosVisibilidade {
	
	// atributos
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	//protected boolean tampada;
	private boolean tampada;
	
	// metodos
	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Erro! Nao pode rabiscar.");
		} else {
			System.out.println("Rabiscando!!!");
		}
		
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Esta tampada? " + this.tampada);
	}

}
