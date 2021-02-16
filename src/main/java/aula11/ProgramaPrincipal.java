package aula11;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		//Animal animal = new Animal();
		Mamifero mamifero = new Mamifero();
		Peixe peixe = new Peixe();
		Ave ave = new Ave();
		
		System.out.println("Mamifero!!!");
		mamifero.setCorPelo("Marrom");
		System.out.println(mamifero.getCorPelo());
		mamifero.setPeso(85.3f);
		System.out.println(mamifero.getPeso());
		mamifero.setIdade(2);
		System.out.println(mamifero.getIdade());
		mamifero.setMembros(4);
		System.out.println(mamifero.getMembros());
		mamifero.locomover();
		mamifero.alimentar();
		mamifero.emitirSom();
		System.out.println("---------------------------------");
		
		peixe.setPeso(0.35f);
		System.out.println(peixe.getPeso());
		peixe.setIdade(1);
		System.out.println(peixe.getIdade());
		peixe.setMembros(0);
		System.out.println(peixe.getMembros());
		peixe.locomover();
		peixe.alimentar();
		peixe.emitirSom();
		peixe.soltarBolha();
		System.out.println("---------------------------------");
		
		ave.setPeso(0.89f);
		System.out.println(ave.getPeso());
		ave.setIdade(2);
		System.out.println(ave.getIdade());
		ave.setMembros(2);
		System.out.println(ave.getMembros());
		ave.locomover();
		ave.alimentar();
		ave.emitirSom();
		ave.fazerNinho();
		System.out.println("---------------------------------");
		
		Canguru canguru = new Canguru();
		Cachorro cachorro = new Cachorro();
		
		canguru.setPeso(55.30f);
		System.out.println(canguru.getPeso());
		canguru.setIdade(3);
		System.out.println(canguru.getIdade());
		canguru.setMembros(4);
		System.out.println(canguru.getMembros());
		canguru.locomover();
		canguru.alimentar();
		canguru.emitirSom();
		canguru.usarBolsa();
		System.out.println("---------------------------------");
		
		cachorro.setPeso(3.94f);
		System.out.println(cachorro.getPeso());
		cachorro.setIdade(5);
		System.out.println(cachorro.getIdade());
		cachorro.setMembros(4);
		System.out.println(cachorro.getMembros());
		cachorro.locomover();
		cachorro.alimentar();
		cachorro.emitirSom();
		cachorro.abanarRabo();
		

	}

}