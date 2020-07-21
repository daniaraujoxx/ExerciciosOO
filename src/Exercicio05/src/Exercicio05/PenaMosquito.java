package Exercicio05;

public class PenaMosquito {
	private String ehFeitoDe;
	private String escreveCom;
	
	public PenaMosquito(String string, String string2) {
		this.ehFeitoDe = "Metal";
		this.escreveCom = "nanquim";
		escrever();
	}

	public void escrever() {
		System.out.println("Eh feito de: " + this.ehFeitoDe + "Escrevendo com: " + this.escreveCom);		
	}
}