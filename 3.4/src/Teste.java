
public class Teste {

	public static void main(String[] args) {
		
		Usuario a = new Usuario("Eric");
		a.saudacao();
		
		Guest b = new Guest("Luigi");
		b.saudacao();
		b.permissoes();
		b.despedidaGuest();
		
		Root c = new Root("Wagner");
		c.saudacao();
		c.permissoes();
		c.excluirTodos();
		c.despedidaRoot();
		
		Regular d = new Regular("Maria");
		d.saudacao();
		d.permissoes();
		d.dashBoard();
		d.despedidaRegular();
		
		Group e = new Group("Grupo PHP");
		e.saudacao();
		e.permissoes();
		e.groupBoard();
		e.despedidaGroup();
		

	}

}
