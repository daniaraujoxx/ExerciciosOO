package Exercicio05;

public class Caneta {
	private String ehFeitoDe;
	private String escreveCom;
	
	public Caneta() {
		this.ehFeitoDe = "Plastico";
		this.escreveCom = "Tinta";
		escrever();
	}

	public Caneta(String string, String string2) {
	}

	public void escrever() {
		System.out.println("Eh feito de: " + this.ehFeitoDe + "Escrevendo com: "+ this.escreveCom);		
	}
}
	
	