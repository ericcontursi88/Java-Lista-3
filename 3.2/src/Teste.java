
		import java.util.Scanner;
		import java.util.List;
		import java.util.ArrayList;
		public class Teste {
			/*public static void main(String[] args) {

			Vip v = new Vip("luigi", 20.000);
			Premium p = new Premium("Claudia", 10.000);
			Regular r = new Regular("Eric", 1.000);
			
			v.TarifaVip();
			p.TarifaPremium();
			r.TarifaRegular();
			
			//System.out.println("Tarifa eh " + v.TarifaVip();
			
			System.out.println("----------Menu-----------");
			System.out.println("--1.Cadastrar Clientes---");
			System.out.println("--2.Verificar Tarifas----");
			System.out.println("--0.Sair-----------------");
			}
		*/
			public static void main(String[] args) {
				Vip v = new Vip(null, 0);
				Premium p = new Premium(null, 0);
				Regular r = new Regular(null, 0);
				
				List<Cliente> clientes = new ArrayList<Cliente>();
				Scanner _user = new Scanner(System.in);
				int opcao = -1;
				double _saldo = 0;
				String _nome = "nulo";
				while (opcao != 0) {
					System.out.println("1.Cadastrar Clientes");
					System.out.println("2.Consultar tarifas");
					System.out.println("0.Sair");
					System.out.print("Digite uma opção:");
					opcao = Integer.valueOf(_user.next());
					if (opcao == 1) {
						System.out.println("Digite seu nome:");
						_nome = String.valueOf(_user.next());
						System.out.println("Digite o saldo:");
						_saldo = Double.valueOf(_user.next());
						Cliente c = new Cliente(_nome,_saldo);
						clientes.add(c);
						System.out.println("Cliente Cadastrado com sucesso");
						System.out.println("Nome: " + _nome + "\n Saldo: " + _saldo);
					}
					if (opcao == 2) {
						v.consultaTarifa();
						p.consultaTarifa();
						r.consultaTarifa();
					}
				}
				System.out.println("Sistema encerrado");
				_user.close();
			}
		}
