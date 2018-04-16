public class Premium extends Cliente {

	public Premium(String nome, double saldo) {
		super(nome, saldo);

	}
		//tarifa 2%
	//public void calcTarifaPremium() {
	//	double tarifa = saldo * 0002;
	//	System.out.println("Sua tarifa eh :" + tarifa);
	//}
	
	public void consultaTarifa() {
		System.out.println("A tarifa Premium eh 2% do saldo");
	}
}