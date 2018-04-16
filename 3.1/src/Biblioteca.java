import java.util.ArrayList;

public class Biblioteca {
	
	
		private String nome;
		private ArrayList <Estante> estantes;
		private int i;
		
		public Biblioteca(String nome) {
			this.nome = nome;
			this.estantes = new ArrayList<Estante>();
		}
		
		public String getNome() {
			return nome;
		}
		
		public void inserirEstante (Estante estante) {
			if (estante != null) {
				estantes.add(estante);
			}else {
				System.out.println("Erro...");
			}
		}
		
		public ArrayList<Estante> mostrarEstantes(){
			return estantes;
		}
		
		public void listarEstantes() {
			i =0;
			for (Estante estante : estantes) {
				System.out.println(++i +" "+ estante.getNome() + " de " + estante.getCatEstante());
			}
		}
		
		public int contarCiencia() {
			i = 0;
			for(Estante estante : estantes) {
				if(estante.getCatEstante()==(Categoria.Ciência)) {
					for (int aux=0;aux<estante.getCont();aux++) {
						i++;
					}
				}
			}
			return i;
		}
		
		public void listarTudo() {
			Livro[] l;
			i=0;
			
			for (Estante estante : estantes) {
				l = estante.mostrarLivros();
				for (int aux =0; aux< estante.getCont();aux++) {
					if(l[aux]!= null) {
						System.out.println(++i + " " + l[i].getNome() + " escrito por " + l[i].getAutor());
					}
				}
			}
		}
		
		public Livro[] listarFilosofia() {		
			Livro[] livrosFilo = new Livro[100];
			for (Estante estante : estantes) {
				if(estante.getCatEstante() == (Categoria.Filosofia)) {
					for(int aux=0; aux < estante.getCont(); aux++) {
						if(estante.mostrarLivros()[aux] != null)
							livrosFilo[aux] = estante.mostrarLivros()[aux];				
					}
				}
			}
			return livrosFilo;
		}
		
		public Livro[] listarCiencia() {		
			Livro[] lCiencia = new Livro[100];
			for (Estante estante : estantes) {
				if(estante.getCatEstante() == (Categoria.Ciência)) {
					for(int aux=0; aux < estante.getCont(); aux++) {
						if(estante.mostrarLivros()[aux] != null)
							lCiencia[aux] = estante.mostrarLivros()[aux];				
					}
				}
			}
			return lCiencia;
		} 
		
		public Livro[] listarLiteratura() {		
			Livro[] lLiteratura = new Livro[100];
			for (Estante estante : estantes) {
				if(estante.getCatEstante() == (Categoria.Literatura)) {
					for(int aux=0; aux < estante.getCont(); aux++) {
						if(estante.mostrarLivros()[aux] != null)
							lLiteratura[aux] = estante.mostrarLivros()[aux];				
					}
				}
			}
			return lLiteratura;
		} 
			
		public ArrayList<String> listarAutores(Categoria cat) {
			ArrayList<String> al = new ArrayList<String>();
			Livro[] l;
			for (Estante estante : estantes) {
				if(estante.getCatEstante() == cat) {
					l = estante.mostrarLivros();
					for(int aux=0; aux < estante.getCont(); aux++) {
						al.add((l[aux].getAutor()));					
					}
				}		
			}
			return al;
		}
}
