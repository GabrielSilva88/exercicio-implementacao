package model;

public class Contador {

	/*
	 * 8) Implemente na classe Contador um método estático contar() que receba três
	 * valores como parâmetros: o início, o fim e o incremento de uma contagem. O
	 * programa principal deve solicitar esses valores e passá-los ao método, que
	 * irá exibir a contagem na tela.
	 */
	
	public static void contar(int ini, int fim, int inc) {
		do {		
				System.out.println(ini);
				ini++;
		} while (fim > ini);
	}
}
