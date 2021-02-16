package aula08;

public class ProjetoPrincipal {

	public static void main(String[] args) {
		
		Pessoa[] pessoa = new Pessoa[2];
		Livro[] livro = new Livro[3];
		
		pessoa[0] = new Pessoa("Pedro", 22, "M");
		pessoa[1] = new Pessoa("Maria", 25, "F");
		
		livro[0] = new Livro("O dscipulo da madrugada", "Pe. Fabio de Melo", 300, pessoa[0]);
		livro[1] = new Livro("O Mestre dos Mestres", "Augusto Cury", 265, pessoa[1]);
		livro[2] = new Livro("Java para iniciantes", "Herbert Anry", 452, pessoa[0]);
		
		livro[0].abrir();
		livro[0].folhear(200);
		livro[0].avancarPag();
		
		System.out.println(livro[0].detalhes());

	}

}
