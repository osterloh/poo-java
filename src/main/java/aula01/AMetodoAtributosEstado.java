package aula01;

public class AMetodoAtributosEstado {
	
	// atributos
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	// metodos
	void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Erro! Nao pode rabiscar.");
		} else {
			System.out.println("Rabiscando!!!");
		}
	}
	
	void tampar() {
		this.tampada = true;
	}
	
	void destampar() {
		this.tampada = false;
	}
	
	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Esta tampada? " + this.tampada);
	}

}
