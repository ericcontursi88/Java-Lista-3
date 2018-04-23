import java.util.ArrayList;

public class Constelacao {
	//são atributos
	private String nome;
	private ArrayList<Estrela> estrelas;
	//-------
	
	public Constelacao(String nome) {
		this.nome = nome;
		this.estrelas= new ArrayList<Estrela>();	
	}
	
	public void adicionar(Estrela e) {	
			estrelas.add(e);	
	}
	//adicionando na lista
	public void infoEstrelas() {
		

		for (Estrela estrela : estrelas) {
			estrela.mostrar();
		}
	//mostrei valor	
	}
	//método
	public double tempConstelacao()
	{
		double auxTemperatura = 0.0;
		
		for (Estrela estrela : estrelas) {
						
			auxTemperatura = auxTemperatura + estrela.getTemperatura();
		}
		return auxTemperatura;
	}
	
	
	
}