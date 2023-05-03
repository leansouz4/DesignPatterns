package criacional.factoryMethod;

public class Principal {
	public static void main(String[] args) {
		//DECLARA��O DE VARI�VEIS
		Fabrica objFabrica = null;
		Carro objCarro = null;
		
		//Processamento
		objFabrica = new Honda();
		objCarro = objFabrica.fabricarCarro();
		objCarro.exibirInfo();
		
		objFabrica = new Audi();
		objCarro = objFabrica.fabricarCarro();
		objCarro.exibirInfo();
	}
}


//