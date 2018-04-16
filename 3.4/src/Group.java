
public class Group extends Usuario {
	
	public Group (String login) {
		super(login);
	}
	
	public void permissoes() {
		System.out.println("Seu grupo tem permissao de ler, acessar e alterar dados");
	}
	
	public void despedidaGroup() {
		System.out.println("Fim da Sessao");
	}
	
	public void groupBoard() {
		System.out.println("Você pode apagar usuários de seu grupo.");
	}

}
