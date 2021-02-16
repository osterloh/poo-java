package aula01;

public class AProgPrincipal {

	public static void main(String[] args) {
		
		AMetodoAtributosEstado c1 = new AMetodoAtributosEstado();	// estanciada um novo objeto da classe
		
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.tampar();
		//c1.destampar();
		c1.status();
		c1.rabiscar();
		
		System.out.println("--------------------------------");
		
		AMetodoAtributosEstado c2 = new AMetodoAtributosEstado();
		
		c2.modelo = "SENAI";
		c2.cor = "Preta";
		c2.destampar();
		c2.status();
		c2.rabiscar();

	}

}
