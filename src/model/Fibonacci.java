package model;

public class Fibonacci {
	
	/*
	 * Desenvolva uma classe Fibonacci com um método estático gerarSequencia() que
	 * receba um único valor inteiro como parâmetro, indicando quantos termos da
	 * sequência serão mostrados na tela.
	 */

	public static void gerarSequencia(double termo) {
		if(termo == 0) {
			System.out.println("Número invalido.");
		}
		int Ptermo = 0;
		int Stermo = 1;

		System.out.println("Sequencia: ");
		
		for (int i = 1; i <= termo; i++) {
			// mostra o resutlado dos termos.
			System.out.println(Ptermo + " ");
			int prox = Ptermo + Stermo; // calcula o primero com o segundo termo. 
			Ptermo = Stermo; // primeiro vira o segundo termo.
			Stermo = prox; // segundo termo fira o proximo.
		}

		System.out.println();
	}

}
