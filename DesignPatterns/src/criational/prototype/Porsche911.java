package criational.prototype;

public class Porsche911 extends CarroPrototipo {
		//Métodos consultores da classe
	public Porsche911() {
		
	}
	public Porsche911(Porsche911 objPorsche911) {
		setValorCompra(objPorsche911.getValorCompra());
	}
	
	//Métodos sobrescritos da classe
	public String exibirInfo() {
		return "Fabricante: Porche\n" +
	"Modelo: 911\n" +
				"Valor: R$" + getValorCompra() + "\n";
	}
	
	public CarroPrototipo clonar() {
		return new Porsche911(this);
	}
}
