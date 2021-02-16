package aula10;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Visitante p1 = new Visitante();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		Bolsista b1 = new Bolsista();
		
		p1.setNome("Anthony");
		p1.setSexo("M");
		p1.setIdade(18);
		System.out.println(p1.toString());
		
		p2.setNome("Mayara");
		p2.setSexo("F");
		p2.setIdade(24);
		p2.setCurso("Contabeis");
		p2.setMatr(1234);
		p2.pagarMensalidade();
		System.out.println(p2.toString());
		
		b1.setMatr(4321);
		b1.setNome("Johnatan");
		b1.setBolsa(12.5f);
		b1.setSexo("M");
		b1.pagarMensalidade();
		
		p4.setNome("Luiz");
		
		p3.setSalario(3600f);
		p4.setSetor("Vistoria");
		
		//System.out.println(p1.getNome() + "\n" + p2.getNome() + "\n" + p3.getNome() + "\n" + p4.getNome());
		
		
		
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
	}

}
