package aula03;

public class DConstrutorMain {

	public static void main(String[] args) {
		
		DConstrutorClass c1 = new DConstrutorClass("NIC", "Preta", 1.5f);
		c1.status();
		
		DConstrutorClass c2 = new DConstrutorClass("Pilot", "Vermelha", 0.5f);
		c2.destampar();
		c2.status();

	}

}
