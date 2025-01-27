/*
 * Receba um número do usuário e imprima o dia da semana correspondente.
 * Sendo 1 segunda-feira.
 */

package academy.devdojo.estruturascondicionais.ifselse;

public class DiasDaSemana {

	public static void main(String[] args) {
		int dia= 8;
		
		if (dia == 1) {
			System.out.println("segunda");
		} else if (dia == 2) {
			System.out.println("terça");
		} else if (dia == 3) {
			System.out.println("quarta");
		} else if (dia == 4) {
			System.out.println("quinta");
		} else if (dia == 5) {
			System.out.println("sexta");
		} else if (dia == 6) {
			System.out.println("sábado");
		} else if (dia == 7) {
			System.out.println("domingo");
		} else {
			System.out.println("dia inválido");
		}

	}

}
