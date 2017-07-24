package com.coddeveloper.JogoForca;

public class RumInicio {

	public static void main(String[] args) {
		/*tela in = null;
		in.main(null);
	System.out.println("Voltou normal ");
		*/
		gameForca.setOver(false);
		gameForca.setVitoriA(false);
		TelaInicial inicio = new TelaInicial();
		inicio.main(null);
		 
	}
}