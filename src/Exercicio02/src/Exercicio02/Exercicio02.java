package Exercicio02;


public class Exercicio02 {
	@SuppressWarnings("unused")
	public static void main(String [] args) {
		Triangulo T = new Triangulo();

		
		double baseLado, altura, area;
		baseLado = 6.0;
		altura = 8.0;
		area = (baseLado * altura) / 2;
		
		double baseLado2, altura2, area2;
		baseLado2 = 10.0;
		altura2 = 5.0;
		
		area2 = (baseLado2 * altura2) / 2;
				
		double baseLado3, altura3, area3;
		baseLado3 = 25.0;
		altura3 = 20.0;
		
		area3 = (baseLado3 * altura3) / 2;
		
		System.out.printf("A area do triangulo 1 eh: %.1f%n", area);
		System.out.printf("A area do triangulo 2 eh: %.1f%n", area2);
		System.out.printf("A area do triangulo 3 eh: %.1f%n", area3);
	}

	
	}

	
		
	

