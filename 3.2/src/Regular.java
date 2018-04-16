public class Regular extends Cliente {

	public Regular(String nome, double saldo) {
		super(nome, saldo);

	}
	//tarifa 1%
	//public void calcTarifaRegular() {
	//	double tarifa = saldo * 0001;
	//	System.out.println("A sua tarifa eh: " + tarifa);
	//}
	
	public void consultaTarifa() {
		System.out.println("A tarifa Regular é 1% do saldo");
	}
}
