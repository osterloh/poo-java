package aula03;

public class CEspecialMain {

	public static void main(String[] args) {
		
		CEspecialClass c1 = new CEspecialClass();
		
		c1.setModelo("BIC");
		//c1.modelo = "BIC2";
		
		c1.setPonta(0.5f);
		//c1.ponta=0.5f;
		c1.destampar();
		c1.status();
		
		System.out.println("Modelo da caneta: " + c1.getModelo() + ", de ponta: " + c1.getPonta());
		
		System.out.println("=======================================================================");
		
		CEspecialClass c2 = new CEspecialClass();
		c2.status();

	}

}
