package teste;

import controller.daoBanda;
import model.Banda;

public class Teste2 {
	public static void main(String[]args) throws Exception {
		Banda b = new Banda();
		b.setNome("Queem");
		b.setGenero("Rock");
		
		daoBanda cb = new daoBanda();
	     b = cb.salvar(b);
	     System.out.println("Banda"+b.getNome()+" salva");
	     Banda b2 = cb.pesquisarPorId(b.getIdbanda());
	     System.out.println("Consultado a banda"+b.getIdbanda()+" "+b.getNome());
	     b2.setNome("Rock");
	     b2 = cb.salvar(b2);
	     System.out.println("Consultado a banda"+b2.getIdbanda()+" "+b2.getNome());
	     cb.remove(b2.getIdbanda());
	}

}
