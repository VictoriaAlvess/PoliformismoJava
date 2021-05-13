package exercicio.poliformismo;

public class Cachorro extends Animal {
	
	private String correr;

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	public void emitirSom() {
		System.out.println("AU AU");
	}
}
