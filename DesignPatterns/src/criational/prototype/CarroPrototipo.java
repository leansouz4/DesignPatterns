package criational.prototype;

public abstract class CarroPrototipo {
	// Propriedades da classe
	private double valorCompra = 0;

	//M�todos get/set da classe
	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	
		//M�todos abstratos da classe
	public abstract String exibirInfo();
	
	public abstract CarroPrototipo clonar ();
}
