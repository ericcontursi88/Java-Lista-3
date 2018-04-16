public class Estante {
		private String nome;
		private Categoria catEstante;
		private Livro[] livros;
		private int max;
		private int i;
		
		public Estante (String nome, Categoria catEstante, int max ) {
			this.nome = nome;
			this.i=0;
			this.max = max;
			this.catEstante= catEstante;
			this.livros = new Livro[max];
		}
		
		public String getNome() {
			return nome;
		}
		public Categoria getCatEstante() {
			return catEstante;
		}
		
		public int getMax() {
			return max;
		}
			
		public int getCont() {
			return i;
		}
		public void inserirLivro(Livro livro) {
			if (livro != null) {
			livros[i] = livro;
			i++;
			}
			else
				System.out.println("Err...");
		}
		
		public void removerLivro(Livro livro) {
			for(int aux=0; aux <= livros.length; aux++) {
				if(livros[aux] == livro) {
				livros[aux] = null;
				i--;
				break;
				}		
			}
		}
		
		public Livro[] mostrarLivros() {
			return livros ;
		}
}
