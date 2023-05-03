package criacional.factoryMethod;

public class Honda implements Fabrica {
	public Carro fabricarCarro() {
		return new Civic();
	}
}
