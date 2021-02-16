package aula09;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Anthony");
		p2.setNome("Mayara");
		p3.setNome("Johnatan");
		p4.setNome("Luiz");
		
		p1.setSexo("M");
		p4.setSexo("M");
		p2.setIdade(24);
		
		p2.setCurso("Contabeis");
		p3.setSalario(3600f);
		p4.setSetor("Vistoria");
		
		//System.out.println(p1.getNome() + "\n" + p2.getNome() + "\n" + p3.getNome() + "\n" + p4.getNome());
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
	}

}
