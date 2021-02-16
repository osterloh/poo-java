package aula04;

public class EBancoMain {

	public static void main(String[] args) {
		
		EBancoClass p1 = new EBancoClass();
		p1.setNumConta(111);
		p1.setDono("Anthony");
		p1.abrirConta("cc");
		
		EBancoClass p2 = new EBancoClass();
		p2.setNumConta(222);
		p2.setDono("Mayara");
		p2.abrirConta("cp");
		
		p1.depositar(100);
		p2.depositar(500);
		
		p2.sacar(100);
		
		p1.estadoAtual();
		p2.estadoAtual();

	}

}
