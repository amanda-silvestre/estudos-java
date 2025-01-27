/*
 * Receba uma idade como entrada
 * Se a idade dor maior que 18, imprima "Adulto"
 * Senão, imprima "Ainda NÃO é Adulto"
 */

package academy.devdojo.estruturascondicionais.ifselse;

public class VerificaIdade {

	public static void main(String[] args) {
		int idade = 23;
		if (idade > 18) {
			System.out.println("Adulto");
		} else {
			System.out.println("Ainda NÃO é Adulto");
		}

	}

}
