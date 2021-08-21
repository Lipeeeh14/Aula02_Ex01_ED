package controller;

public class SomatorioController {

	public SomatorioController() {}
	
	public int somatorioNumeros(int numero) {
		if (numero <= 0)
			return 0;
		else
			return numero + somatorioNumeros(numero - 1);
	}

}
