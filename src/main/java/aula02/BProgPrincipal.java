package aula02;

public class BProgPrincipal {

	public static void main(String[] args) {
		
		BMetodoAtributosVisibilidade c1 = new BMetodoAtributosVisibilidade();	// estanciada um novo objeto da classe
		
		c1.modelo = "Bic cristal";
		c1.cor = "Azul";
		//c1.ponta = 0.5f;
		c1.carga = 80;
		//c1.tampada = false;
		c1.destampar();
		c1.status();
		c1.rabiscar();

	}

}
