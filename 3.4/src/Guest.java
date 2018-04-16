
public class Guest extends Usuario {
	
	public Guest (String login) {
		super(login);
	}
	
	public void permissoes() {
		System.out.println("Voce tem permissao de ler os dados da pagina");
	}
	
	public void despedidaGuest() {
		System.out.println("Fim da Sessao");
	}

}
