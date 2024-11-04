package model;

public class Verificador {

	/*
	 * 7) Crie uma classe Verificador com um método estático verificarParOuImpar()
	 * que receba um número inteiro como parâmetro e retorne uma mensagem indicando
	 * se o valor é par ou ímpar.
	 */
	
	public static void verificarParOuImpar(int n) {
		if (n % 2 == 0) {
			System.out.println(n + ", é par");
		}else {
			System.out.println(n+", é impar");
		}
	}
}
