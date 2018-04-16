public class Vip extends Cliente {

	public Vip(String nome, double saldo) {
		super(nome, saldo);		
	}
		//tarifa 4%
	//public void calcTarifaVip() {
	//	double tarifa = saldo * 0004;
		
	//	System.out.println("Sua tarifa eh: " + tarifa);
	//}
	
	public void consultaTarifa() {
		System.out.println("A tarifa Vip eh 4% do Saldo");
	}
	
}
