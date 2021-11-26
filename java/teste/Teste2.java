package teste;

import controller.ControllerBanda;
import model.Banda;

public class Teste2 {
	public static void main(String[]args) {
		Banda teste = new Banda();
		teste.setNome("Queem");
		teste.setGenero("Rock");
		
		ControllerBanda cb = new ControllerBanda();
	     teste = cb.salvar(teste);
	}

}
