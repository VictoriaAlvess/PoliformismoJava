package exercicio.poliformismo;

public class Preguica extends Animal{
	
	private String subirArvore;

	public String getSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(String subirArvore) {
		this.subirArvore = subirArvore;
	}
	
	public void emitirSom() {
		System.out.println("ZzzzzzZ");
	}
}
