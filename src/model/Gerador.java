package model;

public class Gerador {
	/*
	 * 1) Crie um programa que tenha uma classe Gerador com um método estático
	 * gerador() que, quando chamado, exiba a mensagem "Olá, Mundo!" com algum
	 * componente visual, como uma linha decorativa.
	 * 
	 * public static String gerador() { return " Olá, Mundo! "; }
	 * 
	 * 
	 * 2) Melhore o método gerador() da classe Gerador para aceitar uma mensagem
	 * personalizada como parâmetro e exibi-la com a mesma estilização visual.
	 * 
	 * public static String geradorStatico(String gerador) { return gerador; }
	 * 
	 * // ||
	 * 
	 * public String gerador(String digitar) { return digitar; }
	 * 
	 * 
	 * 3) Adicione à classe Gerador um método sobrecarregado gerador() que aceite
	 * uma mensagem personalizada e um número inteiro como parâmetros, e exiba a
	 * mensagem repetidas vezes, conforme o número fornecido.
	 */

	public void geradorSobrecarredado(String digitando, int cont) {
		for (int i = 0; i < cont; i++) {
			System.out.println(digitando);
		}
	}

	/*
	 * 4) Ainda na classe Gerador, crie um método sobrecarregado gerador() que
	 * permita escolher entre três tipos de bordas diferentes para exibir a mensagem
	 * personalizada.
	 * 
	 */
	public void bordas(String mensagem, String tipoBorda) {
		String borda = "";
		
		switch (tipoBorda) {
		case "simples":
			borda = "********";
			break;
		case "dupla":
			borda = "=======";
		case "pontilhada":
			borda = "...........";
		default:
			System.out.println("Tipo de borda inválido!");
			break;
		}
	}
	
}
