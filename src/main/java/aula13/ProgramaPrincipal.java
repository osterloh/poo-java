package aula13;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Video v[] = new Video[3];
		v[0] = new Video("Aula POO");
		v[1] = new Video("Programacao");
		v[2] = new Video("Redes");
		
		Aluno a[] = new Aluno[2];
		a[0] = new Aluno("Johnatan", 28, "M", "jlo123");
		a[1] = new Aluno("Mayara", 24, "F", "may123");
		
		Visualizacao vis[] = new Visualizacao[5];
		vis[0] = new Visualizacao(a[0], v[1]);
		vis[0].avaliar();
		System.out.println(vis[0].toString());
		
		vis[1] = new Visualizacao(a[0], v[0]);
		vis[1].avaliar(87.0f);
		System.out.println(vis[1].toString());
		
//		System.out.println("--- VIDEOS ---");
//		System.out.println(v[0].toString());
//		System.out.println(v[1].toString());
//		System.out.println(v[2].toString());
//		
//		System.out.println("\n--- ALUNOS ---");
//		System.out.println(a[0].toString());
//		System.out.println(a[1].toString());

	}

}
