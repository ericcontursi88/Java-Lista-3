
public class Cliente {
	//Cada cliente tem a necessidade de controle de conta corrente na conta possui nome, e saldo.
		public String nome;
		public double saldo;
		
		
		//Construtor
		public Cliente(String nome, double saldo) {
			this.nome = nome;
			this.saldo = saldo;
		}
		
		//public void ConsultaSaldo() {
		//	System.out.println("Saldo");
		//}
		
		
		public String getNome() {
			return nome;
		}
		
		public double getSaldo() {
			return saldo;
		}

}
