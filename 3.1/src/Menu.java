import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	private int opc, opcL, ano, qt, contEst = 0, contLiv = 0, cont = 0, contF = 0, contL = 0, contC = 0, id = 0;
	private ArrayList<Estante> estantes = new ArrayList<Estante>();
	private ArrayList<Livro> livros = new ArrayList<Livro>();
	private String nome, autor;
	private Scanner s = new Scanner(System.in);
	private Biblioteca b = new Biblioteca("Fatec");
	 
	
	public void tela(){
		do {
		System.out.println("\n");
		System.out.println("1 - Inserir estante ");
		System.out.println("2 - Inserir livro ");
		System.out.println("3 - Remover livro ");
		System.out.println("4 - Listar Estantes ");
		System.out.println("5 - Listar livros ");
		System.out.println("6 - Listar livros de Filosofia  ");
		System.out.println("7 - Listar autores ");
		System.out.println("8 - Quantidade de livros de Ci�ncia ");
		System.out.println("9 - Encerrar Sistema ");
		System.out.print("\nDigite sua op��o: ");
		opc = Integer.parseInt(s.nextLine());		
		
		switch(opc) {
			case 1: do {
				System.out.println("\n");
				System.out.println("1 - Inserir Estante de Ci�ncia");
				System.out.println("2 - Inserir Estante de Literatura");
				System.out.println("3 - Inserir Estante de Filosofia");
				System.out.println("Digite sua op��o: ");
				opc = Integer.parseInt(s.nextLine());
				switch(opc){
					case 1:
						System.out.println("Digite o nome da estante: ");
						nome = s.nextLine();
						System.out.println("Digite a qt m�xima de livros: ");
						qt = Integer.parseInt(s.nextLine());
						estantes.add(new Estante(this.nome, Categoria.Ci�ncia, this.qt));
						b.inserirEstante(estantes.get(contEst++));
						System.out.println("Estante inserida com sucesso.");
						break;
					case 2:
						System.out.println("Digite o nome da estante: ");
						nome = s.nextLine();
						System.out.println("Digite a qt m�xima de livros: ");
						qt = Integer.parseInt(s.nextLine());
						estantes.add(new Estante(this.nome, Categoria.Literatura, this.qt));
						b.inserirEstante(estantes.get(contEst++));
						System.out.println("Estante inserida com sucesso.");
						break;
					case 3:
						System.out.print("\nDigite o nome da estante: ");
						nome = s.nextLine();
						System.out.print("\nDigite a qt m�xima de livros: ");
						qt = Integer.parseInt(s.nextLine());
						estantes.add(new Estante(this.nome, Categoria.Filosofia, this.qt));
						b.inserirEstante(estantes.get(contEst++));
						System.out.println("Estante inserida com sucesso.");
						break;
					default:
						System.out.println("Op��o Inv�lida\n\n");
						break;
				}
			} while(opc != 1 && opc != 2 && opc != 3);
			break;
			case 2:do {
				System.out.println("1 - Inserir livro de Ci�ncia");
				System.out.println("2 - Inserir livro de Literatura");
				System.out.println("3 - Inserir livro de Filosofia");
				System.out.print("\nDigite sua op��o: ");
				opc = Integer.parseInt(s.nextLine());
				switch(opc){
					case 1:
						System.out.print("\nDigite o nome do livro: ");
						nome = s.nextLine();
						System.out.print("Digite o nome do autor: ");
						autor = s.nextLine();
						System.out.print("Digite o ano de publica��o: ");
						ano = Integer.parseInt(s.nextLine());
						livros.add(new Livro(this.nome,this.autor,this.ano));
						cont = 0;
						for (Estante estante : estantes) {
							if(estante.getCatEstante() == (Categoria.Ci�ncia)) {
								b.mostrarEstantes().get(cont).inserirLivro(livros.get(contLiv++));
								System.out.println("Livro inserido com sucesso");
								contC++;
								break;
								}
							cont++;
						}
				
						break;
					case 2:
						System.out.print("\nDigite o nome do livro: ");
						nome = s.nextLine();
						System.out.print("Digite o nome do autor: ");
						autor = s.nextLine();
						System.out.print("Digite o ano de publica��o: ");
						ano = Integer.parseInt(s.nextLine());
						livros.add(new Livro(this.nome,this.autor,this.ano));
						cont = 0;
						for (Estante estante : estantes) {			
							if(estante.getCatEstante() == (Categoria.Literatura)) {
								b.mostrarEstantes().get(cont).inserirLivro(livros.get(contLiv++));
								System.out.println("Livro inserido com sucesso");
								contL++;
								break;					
								}
							cont++;
						}
					
						break;
					case 3:
						System.out.print("\nDigite o nome do livro: ");
						nome = s.nextLine();
						System.out.print("Digite o nome do autor: ");
						autor = s.nextLine();
						System.out.print("Digite o ano de publica��o: ");
						ano = Integer.parseInt(s.nextLine());
						livros.add(new Livro(this.nome,this.autor,this.ano));
						cont = 0;
						for (Estante estante : estantes) {			
							if(estante.getCatEstante() == (Categoria.Filosofia)) {
								b.mostrarEstantes().get(cont).inserirLivro(livros.get(contLiv++));
								System.out.println("Livro inserido com sucesso");
								contF++;
								break;					
								}
							cont++;
						}
				
						break;
					default:
						System.out.println("Op��o Inv�lida");
						break;
				}
			} while(opc != 1 && opc != 2 && opc != 3);
				break;
			case 3:do {
				System.out.println("\n1 - Remover livro da estante de Ci�ncia");
				System.out.println("2 - Remover livro da estante de Literatura");
				System.out.println("3 - Remover livro da estante de Filosofia");
				System.out.print("\nDigite sua op��o: ");
				opc = Integer.parseInt(s.nextLine());
				switch(opc){
					case 1:
						cont = 0;
						id = 0;
						for (Estante estante : estantes) {
							if(estante.getCatEstante() == (Categoria.Ci�ncia)) {
								System.out.println("\nOs livros de Ci�ncias s�o: ");
								for (int i = 0; i < contC; i++) {
									System.out.println(++id + " - " + b.listarCiencia()[i].getNome() + " de " + b.listarCiencia()[i].getAutor());
								}
								System.out.print("\nDigite o �ndice do livro que quer remover: ");
								opcL = Integer.parseInt(s.nextLine());
								--opcL;
								b.mostrarEstantes().get(cont).removerLivro(livros.get(opcL));
								System.out.println("\nLivro removido com sucesso.");
								contC--;
							}
							cont++;
							}
					
						break;
					case 2:
						cont = 0;
						id = 0;
						for (Estante estante : estantes) {
							if(estante.getCatEstante() == (Categoria.Literatura)) {
								System.out.println("\nOs livros de Literatura s�o: ");
								for (int i = 0; i < contL; i++) {
									System.out.println(++id + " - " + b.listarLiteratura()[i].getNome() + " de " + b.listarLiteratura()[i].getAutor());
								}
								System.out.print("\nDigite o �ndice do livro que quer remover: ");
								opcL = Integer.parseInt(s.nextLine());
								--opcL;
								b.mostrarEstantes().get(cont).removerLivro(livros.get(opcL));
								System.out.println("\nLivro removido com sucesso.");
								contL--;
							}
							cont++;
							}
			
						break;
					case 3:
						cont = 0;
						id = 0;
						for (Estante estante : estantes) {
							if(estante.getCatEstante() == (Categoria.Filosofia)) {
								System.out.println("\nOs livros de filosofia s�o: ");
								for (int i = 0; i < contF; i++) {
									System.out.println(++id + " - " + b.listarFilosofia()[i].getNome() + " de " + b.listarFilosofia()[i].getAutor());
								}
								System.out.print("\nDigite o �ndice do livro que quer remover: ");
								opcL = Integer.parseInt(s.nextLine());
								--opcL;
								b.mostrarEstantes().get(cont).removerLivro(livros.get(opcL));
								System.out.println("\nLivro removido com sucesso.");
								contF--;
							}
							cont++;
							}
				
						break;
					default:
							System.out.println("Op��o Inv�lida");
							break; }
				} while(opc != 1 && opc != 2 && opc != 3);
				break;
			case 4:
				if(estantes.isEmpty()) {
					System.out.println("\nAinda n�o existem estantes na biblioteca.\n");
				}else {
					System.out.println("\nAs estantes de nossa biblioteca s�o: \n");
					b.listarEstantes();
					}
				break;
			case 5:
				if(livros.isEmpty()) {
					System.out.println("\nAinda n�o existem livros na biblioteca.\n"); 
				}else {
					System.out.println("\nTodos os livros de nossa biblioteca:");
					b.listarTudo(); 
				}
				break;
			case 6:
				if(contF != 0) {
					System.out.println("\nOs livros de filosofia s�o: ");
					for (int i = 0; i < contF; i++) {
						System.out.println(b.listarFilosofia()[i].getNome());
					} 
				}else
					System.out.println("\nAinda n�o existem livros de Filosofia na biblioteca.");
				break;
			case 7:do {
				System.out.println("\n---Categoria dos Autores---");
				System.out.println("1 - Autores de Ci�ncia");
				System.out.println("2 - Autores de Literatura");
				System.out.println("3 - Autores de Filosofia");
				System.out.print("\nDigite sua op��o: ");
				opc = Integer.parseInt(s.nextLine());
				switch(opc){
					case 1:
						System.out.print("\nAutores de Ci�ncia: \n");
						if(b.listarAutores(Categoria.Ci�ncia).isEmpty())
							System.out.println("\nN�o existe nenhum autor nessa categoria\n");
						else {
						for (int i = 0; i < b.listarAutores(Categoria.Ci�ncia).size(); i++) {
							System.out.println(b.listarAutores(Categoria.Ci�ncia).get(i));
							} }
						break;
					case 2:
						System.out.print("\nAutores de Literatura: \n");
						if(b.listarAutores(Categoria.Literatura).isEmpty())
							System.out.println("\nN�o existe nenhum autor nessa categoria\n");
						else {
						for (int i = 0; i < b.listarAutores(Categoria.Literatura).size(); i++) {
							System.out.println(b.listarAutores(Categoria.Literatura).get(i));
							} }
						break;
					case 3:
						System.out.print("\nAutores de Filosofia: \n");
						if(b.listarAutores(Categoria.Filosofia).isEmpty())
							System.out.println("\nN�o existe nenhum autor nessa categoria\n");
						else {
						for (int i = 0; i < b.listarAutores(Categoria.Filosofia).size(); i++) {
							System.out.println(b.listarAutores(Categoria.Filosofia).get(i));
							} }
						break;
					default:
						System.out.println("\nOp��o Inv�lida");
						break;
				}
			} while(opc != 1 && opc != 2 && opc != 3);
				break;
			case 8:
				System.out.println("\nA Quantidade de Livros de Ci�ncia �: " + b.contarCiencia());
				break;
			case 9:
				System.out.println("\nSISTEMA ENCERRADO");
				break;
			default:
				System.out.println("\nOp��o Inv�lida\n\n");
				break;
			}
		} while(opc!=9);
	}
}