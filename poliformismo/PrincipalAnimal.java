package exercicio.poliformismo;

public class PrincipalAnimal {
	public static void main(String[] args) {

		Animal ani = new Animal();
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica sloth = new Preguica();

		dog.setNome("Timbau");
		dog.setIdade(8);
		dog.setCorrer("Correr pelo parque");
		

		horse.setNome("Pirulito");
		horse.setIdade(15);
		horse.setCorrer("Correr na fazenda");
		

		sloth.setNome("Baby");
		sloth.setIdade(1);
		sloth.setSubirArvore("Dormir em cima das �rvores");
		

		System.out.println("\n== Dados Animais ==");
		dog.emitirSom();
		System.out.println("Ol�, meu nome �: " + dog.getNome());
		System.out.println("Tenho: " + dog.getIdade() + " aninhos");
		System.out.println("Minha brincadeira preferida �: " + dog.getCorrer());
		
		System.out.println("\n");
		horse.emitirSom();
		System.out.println("Ol�, meu nome �: " + horse.getNome());
		System.out.println("Tenho: " + horse.getIdade() + " aninhos");
		System.out.println("Minha brincadeira preferida �: " + horse.getCorrer());
		
		System.out.println("\n");
		sloth.emitirSom();
		System.out.println("Ol�, meu nome �: " + sloth.getNome());
		System.out.println("Tenho: " + sloth.getIdade() + " aninho");
		System.out.println("Minha brincadeira preferida �: " + sloth.getSubirArvore());
		

	}
}
