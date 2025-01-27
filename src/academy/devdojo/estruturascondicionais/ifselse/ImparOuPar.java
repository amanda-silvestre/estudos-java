/*
 * Dado um determinado numero inteiro
 * Imprima se ele é impar ou par
 * O resto da divisão por 2 se for par sempre vai ser 0
 * Senão vai ser impar
 */

package academy.devdojo.estruturascondicionais.ifselse;

public class ImparOuPar {

	public static void main(String[] args) {
		int numero = 5;
		// par = valor % 2 == 0
		if (numero % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}

	}

}
