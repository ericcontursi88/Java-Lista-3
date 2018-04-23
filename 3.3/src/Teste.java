
public class Teste {
	
	public static void main(String[] args) {
		
		
		Estrela e1 = new Estrela ("Luigi","Amarela",565.9);
		Estrela e2 = new Estrela ("Eric","Branca",215.9);
		Estrela e3 = new Estrela ("Wagner","Vermelha",458.9);
		Estrela e4 = new Estrela ("Garcia","Azul",234.4);
		Constelacao c = new Constelacao("Claudia");
		
		c.adicionar(e1);
		c.adicionar(e2);
		c.adicionar(e3);
		c.adicionar(e4);
		c.infoEstrelas();
		
		System.out.println("A temperatura total é: " + c.tempConstelacao());
		
		
		
	}

}