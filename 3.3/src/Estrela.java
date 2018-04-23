
public class Estrela {
	//atributo
	private String nome;
	private String cor;
	private double temperatura;
	
	
	//construtor
	public Estrela (String nome, String cor, double temperatura) {
		
		this.nome = nome;
		this.cor = cor;
		this.temperatura = temperatura;	
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCor() {
		return cor;
	}
	
	public double getTemperatura() {
		return temperatura;
	}
	
	//método mostrar
	public void mostrar() {
		System.out.println("Nome é :" + nome);
		System.out.println("A cor é :" + cor);
		System.out.println("A temperatura é :" + temperatura);
	}



	
		

	

}