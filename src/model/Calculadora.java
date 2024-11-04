package model;

public class Calculadora {
	/*
	 * 5) Crie uma classe Calculadora com um método somar() que receba dois números
	 * inteiros como parâmetros e realize a soma entre eles.
	 */

	public int soma(int n1, int n2) {
		return n1 + n2;
	}

	/*
	 * 6) Crie o método maior() da classe Calculadora que aceite três números como
	 * parâmetros e retorne o maior deles. Se os três números forem iguais, retorne
	 * uma mensagem informando isso.
	 */
	
	public void maior(double p, double s, double t) {
		if( p > s && p > t) {
			System.out.println("Número " + p +" e maior que " + s + " e " + t);
		}else if(s > t && s > p){
			System.out.println("Número " + s +" e maior que " + p + " e " + t);
		}else if(t > p && t > s){
			System.out.println("Número " + t +" e maior que " + p + " e " + s);
		}else {
			System.out.println("Números igual!");
		}
		
	}
}
