package aula06;

public class LutadorClass {
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitoria;
	private int derrota;
	private int empate;
	
	public LutadorClass(String nome, String nacionalidade, int idade, double altura, double peso, int vitoria, int derrota, int empate) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitoria = vitoria;
		this.derrota = derrota;
		this.empate = empate;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	private  void setCategoria() {
		if(this.peso < 52.2) {
			this.categoria = "Invalido";
			
		} else if(this.peso <= 70.3) {
			this.categoria = "Leve";
			
		} else if(this.peso <= 83.9) {
			this.categoria = "Medio";
			
		} else if(this.peso <= 120.2) {
			this.categoria = "Pesado";
			
		} else {
			this.categoria = "Invalido";
		}
	}
	public int getVitoria() {
		return vitoria;
	}
	public void setVitoria(int vitoria) {
		this.vitoria = vitoria;
	}
	public int getDerrota() {
		return derrota;
	}
	public void setDerrota(int derrota) {
		this.derrota = derrota;
	}
	public int getEmpate() {
		return empate;
	}
	public void setEmpate(int empate) {
		this.empate = empate;
	}
	
	public void apresentar() {
		System.out.println("---------------------------------------------------------");
		System.out.println("CHEGOU A HORA! \nApresentamos o lutador " + this.getNome());
		System.out.println("Diretamente de " + this.getNacionalidade());
		System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + "m de altura");
		System.out.println("Pesando: " + this.getPeso() + "Kg");
		System.out.println(this.getVitoria() + " vitorias");
		System.out.println(this.getDerrota() + " derrotas");
		System.out.println(this.getEmpate() + " empates");
	}
	
	public void status() {
		System.out.println(this.getNome() + "eh um peso " + this.getCategoria());
		System.out.println("Ganhou " + this.getVitoria() + " vezes");
		System.out.println("Perdeu " + this.getDerrota() + " vezes");
		System.out.println("Empatou " + this.getEmpate() + " vezes");
	}
	
	public void ganharLuta() {
		this.setVitoria(this.getVitoria() + 1);
	}
	
	public void perderLuta() {
		this.setDerrota(this.getDerrota() + 1);
	}
	
	public void empatarLuta() {
		this.setEmpate(this.getEmpate() + 1);
	}
	
}
