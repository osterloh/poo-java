package aula10;

public class Bolsista extends Aluno {
	private float bolsa;
	
	public void renovaBolsa() {
		System.out.println("Renivando bolsa de " + this.getNome());
		
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println(this.getNome() + " eh bolsita! Pagamento facilitado");
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
	

}
