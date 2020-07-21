package Exercicio01;

public class Cachorro {
	
	private static String nome;
	private String patas;
	private String rabo;

	public String getNome() {
		System.out.println("Pitter" + nome);
		return nome;
		
	}
	public void setNome(String nome) {
		Cachorro.nome = nome;
	}

	public String getPatas() {
		return patas;
	}

	public void setPatas(String patas) {
		this.patas = patas;
	}

	public String getRabo() {
		return rabo;
	}

	public void setRabo(String rabo) {
		this.rabo = rabo;
	}
	
	public String getBalancarRabo() {
		return this.rabo;
	}


	
	}
	

