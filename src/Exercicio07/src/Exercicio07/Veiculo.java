package Exercicio07;

public class Veiculo {
	private String nome;
	private int rodas;
	private double totalCombustivel;
	private double consumoKm;
	private double quilometragem; 
	
	private double total;

	
	public void abastecer(double litros) {	
		if (litros > totalCombustivel) {
			System.out.println("Excedeu capacidade do taque");
		} else {
			totalCombustivel += litros;	
		}
	}
	
	public void trafegar(double distancia, double litros) {
		quilometragem += distancia;
		setConsumoKm(quilometragem / totalCombustivel); 
	}
	
	public void autonomia(double consumoKm, double totalCombustivel) {
		total = consumoKm * totalCombustivel;
		System.out.println("Total autonomia:" + total);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRodas() {
		return rodas;
	}

	public void setRodas(int rodas) {
		this.rodas = rodas;
	}

	public double getConsumoKm() {
		return consumoKm;
	}

	public void setConsumoKm(double consumoKm) {
		this.consumoKm = consumoKm;
	}

	public void gettrafegar() {
		
	}
}