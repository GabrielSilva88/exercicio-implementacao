package view;

import java.util.Scanner;

import model.Calculadora;
import model.Contador;
import model.Fibonacci;
import model.Gerador;
import model.Verificador;


public class main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Calculadora c = new Calculadora();
		Gerador g = new Gerador();
		Verificador v = new Verificador();
		Contador ct = new Contador();
		
		/*
		 * 1 exrecicio
		
		
		 System.out.println(g.gerador()); 
		
		  * 2 exercicio
		System.out.println("Digite: ");
		System.out.println("Você Digite: " + g.geradorStatico(scan.nextLine()));
		
		
		* 3 exercicio 
		
		g.geradorSobrecarredado("Digitando", 3);
		
		// 4 exrcicio
		
		
		System.out.println(c.soma(scan.nextInt(),scan.nextInt()));
		 
		 // 5 exercicio
		 System.out.println(c.soma(8, 2));
		
		// 6 exercicio
		c.maior(3.45, 5,1.2);
	
		// 7 ercicios
		v.verificarParOuImpar(5);
		v.verificarParOuImpar(4);
		// 8 exercicio
		ct.contar(1, 10, 1);
		 */
		
		// DESAFIO
		
		Fibonacci f = new Fibonacci();
		
		f.gerarSequencia(20);
		
	}
}
