
public class Root extends Usuario {
	
	public Root (String login) {
		super(login);
	}
	
	public void permissoes() {
		System.out.println("Voce pode criar novos usuarios, alterar permissoes de conta, "
				+ "modificar configura�oes de seguran�a" + 
				"como passwords, modificar logs do sistemas, alterar dados.");
	}
	
	public void despedidaRoot() {
		System.out.println("Fim da Sessao");
		
	}
	
	public void excluirTodos() {
		System.out.println("Voc� poder� excluir todos os usu�rios.");
	}

}
