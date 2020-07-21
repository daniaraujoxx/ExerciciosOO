package Exercicio05;

public class Lapis {
	private String ehFeitoDe;
	private String escreveCom;
	
	public Lapis(String string, String string2) {
		this.ehFeitoDe = "Madeira";
		this.escreveCom = "Grafite";
		escrever();
	}

	public void escrever() {
		System.out.println("Eh feito de: " + this.ehFeitoDe + "Escrevendo com: " + this.escreveCom);		
	}
}