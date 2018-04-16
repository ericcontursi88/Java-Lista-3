
public class Regular extends Usuario {
	
	public Regular (String login) {
		super(login);
	}
	
	public void permissoes() {
		System.out.println("Voce tem permissao de acessar os dados e fazer alterações");
	}
	
	public void despedidaRegular() {
		System.out.println("Fim da Sessao");
	}
	
	public void dashBoard() {
		System.out.println("Acessar sua conta / Upload/ Download/ Ferramentas / Sair");
		
	}

}
